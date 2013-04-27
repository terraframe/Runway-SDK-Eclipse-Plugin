package com.runwaysdk.eclipse.plugin.schema.exporter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.maven.cli.MavenCli;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;
import com.runwaysdk.eclipse.plugin.schema.SchemaUtil;
import com.runwaysdk.eclipse.plugin.schema.runwayxml.XMLMdBusiness;
import com.runwaysdk.eclipse.plugin.schema.runwayxml.XMLMetadata;

public class DOMExporter
{
  private Document dom;

  private Element  version;

  private Element  doIt;

  private Element  doItCreate;

  
  private Element  doItUpdate;

  private Element  doItDelete;

  private Element  undoIt;

  private Element  undoItCreate;

  private Element  undoItUpdate;

  private Element  undoItDelete;
  
  // This method is called when the user saves the document.
  public static void doExport()
  {
    XMLRecordFactory.validateRecords();
    
    List<XMLMdBusiness> records = XMLRecordFactory.getRecords();
    if (records.size() <= 0) { return; }
    
    DOMExporter exporter = new DOMExporter();
    exporter.getExportPath();
  }
  
  private void exportToFile(String fileName) {
    List<XMLMdBusiness> records = XMLRecordFactory.getRecords();
    
    System.out.println("Writing file to '" + fileName + "'");
    
    // Generates an empty Runway XML file
    DOMExporter instance = new DOMExporter();
    instance.generateEmptySchema(fileName);

    for (int i = 0; i < records.size(); i++)
    {
      XMLMdBusiness record = records.get(i);
      
      Element el = record.writeDoItXML(instance.dom);
      Element ele = record.writeUndoItXML(instance.dom);
      
      if (record.getCrudFlag() == XMLMetadata.CREATE)
      {
        instance.doItCreate.appendChild(el);
        instance.undoItDelete.appendChild(ele);
      }
      else if (record.getCrudFlag() == XMLMetadata.UPDATE)
      {
        instance.doItUpdate.appendChild(el);
        instance.undoItDelete.appendChild(el);
      }
      else if (record.getCrudFlag() == XMLMetadata.DELETE)
      {
      }
      else {
        throw new RuntimeException("Unrecognized Crud Flag on XMLMdBusiness [" + record.getCrudFlag() + "]");
      }
    }
    
    XMLRecordFactory.clearRecordStore();
    
    try
    {
      Transformer tr = TransformerFactory.newInstance().newTransformer();
      tr.setOutputProperty(OutputKeys.INDENT, "yes");
      tr.setOutputProperty(OutputKeys.METHOD, "xml");
      tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
      tr.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
      tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

      // send DOM to file
      tr.transform(new DOMSource(instance.dom), new StreamResult(new FileOutputStream(fileName)));
    }
    catch (TransformerException te)
    {
      throw new RuntimeException(te);
    }
    catch (IOException ioe)
    {
      throw new RuntimeException(ioe);
    }
  }
  
  private void getExportPath() {
    final String activeProjectName;
    String activeDiagramFilename;
    IProject activeProject;
    IWorkbenchPage page = RunwayDiagramEditorPlugin.getInstance().getWorkbench().getActiveWorkbenchWindow().getActivePage();
    try {
      IEditorPart editorPart = page.getActiveEditor();
      IFileEditorInput input = (IFileEditorInput)editorPart.getEditorInput() ;
      IFile file = input.getFile();
      activeProject = file.getProject();
      
      activeProjectName = activeProject.getName();
      activeDiagramFilename = file.getName();
      activeDiagramFilename = activeDiagramFilename.substring(0, activeDiagramFilename.length() - file.getFileExtension().length() - 1);
    }
    catch (Exception e) {
      throw new RuntimeException("The file you wish to export must be open.", e);
    }
    
    URL platUrl = Platform.getInstanceLocation().getURL();
    final String workspace = new File(platUrl.getPath()).getAbsolutePath();
    
    final String saveDirectory = workspace + "/.metadata/.plugins/com.runwaysdk.eclipse.plugin/" + activeProjectName + "/" + activeDiagramFilename;
    
    // Use Runway to create a new schema file.
//    ProfileManager.setProfileHome(workspace + "/" + activeProjectName + "/src/main/resources");
//    String path;
//    try
//    {
//      path = new CreateDomainModel(saveDirectory).create();
//    }
//    finally
//    {
//      CacheShutdown.shutdown();
//    }
    
    /*
     * Call Runway's new schema tool using Maven.
     */
    File f = new File(saveDirectory);
    if (f.exists() == false) {
      f.mkdirs();
    }
    
    final List<File> beforeFiles = Arrays.asList(new File(saveDirectory).listFiles());
    
    final String[] mavenArgs = new String[] {
        "exec:java",
//        "-X",
        "-Dexec.mainClass=com.runwaysdk.dataaccess.io.CreateDomainModel",
        "-Dexec.arguments=" + saveDirectory };

    final PrintStream out = SchemaUtil.openRunwayConsole();
    int retVal = new MavenCli().doMain(mavenArgs, workspace + activeProject.getFullPath().toOSString(), out, out);

    if (retVal != 0) {
      throw new RuntimeException("An exception has occurred while creating a new runway schema. (Maven exited with status code " + retVal + ")");
    }
//    SchemaUtil.runMavenCmd(mavenArgs, workspace + activeProject.getFullPath().toOSString(), "creating a new runway schema.");
    
    /**
     * The operating system unfortunately doesn't report the new file yet. Spawn a thread to check every second.
     */
    final ScheduledExecutorService worker = Executors.newSingleThreadScheduledExecutor();
    worker.schedule(new SchemaDetectThread(saveDirectory, beforeFiles), 1, TimeUnit.SECONDS);
  }
  
  private class SchemaDetectThread implements Runnable {
    private int timeCounter = 0;
    private final String saveDirectory;
    private final List<File> beforeFiles;
    
    SchemaDetectThread(String saveDirectory, List<File> beforeFiles) {
      this.saveDirectory = saveDirectory;
      this.beforeFiles = beforeFiles;
    }
    
    public void run() {
      if (timeCounter > 15) {
        SchemaUtil.handleError(null, "Unable to find the new schema file (created by Runway). Attempting to save your schema file anyway.");
        
        Random rand = new Random();
        int n = rand.nextInt(500000) + 1;
        
        File file = new File(saveDirectory + "/schema" + Integer.toString(n) + ".xml");
        try
        {
          file.createNewFile();
        }
        catch (IOException e)
        {
          SchemaUtil.handleError(null, e);
          return;
        }
        
        System.out.println("Saving schema file as [" + file.getAbsolutePath() + "]");
        
        exportToFile(file.getAbsolutePath());
        
        return;
      }
      
      LinkedList<File> afterFiles = new LinkedList<File>(Arrays.asList(new File(saveDirectory).listFiles()));
      afterFiles.removeAll(beforeFiles);
      
      if (afterFiles.size() > 0) {
        System.out.println("Schema file created after " + (timeCounter + 1) + " seconds.");
        exportToFile(afterFiles.iterator().next().getAbsolutePath());
        return;
      }
      
      System.out.println("timeCounter = " + timeCounter);
      
      timeCounter++;
      
      final ScheduledExecutorService worker = Executors.newSingleThreadScheduledExecutor();
      worker.schedule(this, 1, TimeUnit.SECONDS);
    }
  }
  
  public void generateEmptySchema(String filename)
  {
    // instance of a DocumentBuilderFactory
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    try
    {
      // use factory to get an instance of document builder
      DocumentBuilder db = dbf.newDocumentBuilder();
      // create instance of DOM
      dom = db.newDocument();

      // create data elements and place them in the structure
      version = dom.createElement("version");
      version.setAttribute("xsi:noNamespaceSchemaLocation", "../../profiles/version_gis.xsd");
      version.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");

      doIt = dom.createElement("doIt");
      version.appendChild(doIt);

      doItCreate = dom.createElement("create");
      doIt.appendChild(doItCreate);

      doItUpdate = dom.createElement("update");
      doIt.appendChild(doItUpdate);

      doItDelete = dom.createElement("delete");
      doIt.appendChild(doItDelete);

      undoIt = dom.createElement("undoIt");
      version.appendChild(undoIt);

      undoItCreate = dom.createElement("create");
      undoIt.appendChild(undoItCreate);

      undoItUpdate = dom.createElement("update");
      undoIt.appendChild(undoItUpdate);

      undoItDelete = dom.createElement("delete");
      undoIt.appendChild(undoItDelete);

      dom.appendChild(version);
    }
    catch (ParserConfigurationException pce)
    {
      System.out.println("UsersXML: Error trying to instantiate DocumentBuilder " + pce);
    }
  }

  /*
   * public static void writeMdBusiness(String filename, String name, String
   * display) { Document dom;
   * 
   * // instance of a DocumentBuilderFactory DocumentBuilderFactory dbf =
   * DocumentBuilderFactory.newInstance(); try { // use factory to get an
   * instance of document builder DocumentBuilder db = dbf.newDocumentBuilder();
   * // create instance of DOM dom = db.newDocument();
   * 
   * // create data elements and place them in the structure Element version =
   * dom.createElement("version");
   * version.setAttribute("xsi:noNamespaceSchemaLocation",
   * "../../profiles/version_gis.xsd"); version.setAttribute("xmlns:xsi",
   * "http://www.w3.org/2001/XMLSchema-instance");
   * 
   * Element doIt = dom.createElement("doIt"); version.appendChild(doIt);
   * 
   * Element create = dom.createElement("create"); doIt.appendChild(create);
   * 
   * Element mdBusiness = dom.createElement("mdBusiness");
   * mdBusiness.setAttribute("name",
   * "com.terraframe.runwaytemplate.HelloWorld");
   * mdBusiness.setAttribute("label", "HelloWorld");
   * create.appendChild(mdBusiness);
   * 
   * Element attributes = dom.createElement("attributes");
   * mdBusiness.appendChild(attributes);
   * 
   * Element character = dom.createElement("char");
   * character.setAttribute("name", "greeting");
   * character.setAttribute("required", "true"); character.setAttribute("label",
   * "Greeting"); character.setAttribute("size", "50");
   * attributes.appendChild(character);
   * 
   * Element mdMethod = dom.createElement("mdMethod");
   * mdBusiness.appendChild(mdMethod);
   * 
   * Element update = dom.createElement("update"); doIt.appendChild(update);
   * 
   * Element undoIt = dom.createElement("undoIt"); version.appendChild(undoIt);
   * 
   * Element delete = dom.createElement("delete"); undoIt.appendChild(delete);
   * 
   * Element object = dom.createElement("object"); object.setAttribute("key",
   * "com.terraframe.runwaytemplate.HelloWorld"); object.setAttribute("type",
   * "com.runwaysdk.system.metadata.MdBusiness"); delete.appendChild(object);
   * 
   * dom.appendChild(version);
   * 
   * try { Transformer tr = TransformerFactory.newInstance().newTransformer();
   * tr.setOutputProperty(OutputKeys.INDENT, "yes");
   * tr.setOutputProperty(OutputKeys.METHOD, "xml");
   * tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
   * tr.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
   * tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
   * 
   * // send DOM to file tr.transform(new DOMSource(dom), new StreamResult(new
   * FileOutputStream(filename)));
   * 
   * } catch (TransformerException te) { System.out.println(te.getMessage()); }
   * catch (IOException ioe) { System.out.println(ioe.getMessage()); } } catch
   * (ParserConfigurationException pce) {
   * System.out.println("UsersXML: Error trying to instantiate DocumentBuilder "
   * + pce); } }
   */

}
