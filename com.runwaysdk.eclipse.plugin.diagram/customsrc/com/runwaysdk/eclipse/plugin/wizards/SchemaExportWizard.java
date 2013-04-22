package com.runwaysdk.eclipse.plugin.wizards;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.runwaysdk.dataaccess.schemamanager.SchemaManager;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayCreationWizardPage;
import com.runwaysdk.eclipse.plugin.schema.SchemaUtil;

public class SchemaExportWizard extends Wizard implements INewWizard
{
  protected RunwayCreationWizardPage diagramModelFilePage;
  protected SchemaExportWizardPage1 page1;
  protected IStructuredSelection     selection;
  
  public SchemaExportWizard() {
    super();
    //setNeedsProgressMonitor(true);
  }
  
  @Override
  public void init(IWorkbench arg0, IStructuredSelection arg1)
  {
    this.selection = arg1;
  }
  
  @Override
  public void addPages() {
    page1 = new SchemaExportWizardPage1();
    page1.setSelection(selection);
    addPage(page1);
  }
  
  @Override
  public boolean performFinish()
  {
    /*
     * Call Runway's merge tool
     */
    URL url = Platform.getInstanceLocation().getURL();
    String workspace = new File(url.getPath()).getAbsolutePath();
    
    IFile diagramFile = page1.getDiagramFile();
    String projectName = diagramFile.getProject().getName();
    String tempFolderStr = workspace + "/.metadata/.plugins/com.runwaysdk.eclipse.plugin/" + projectName + "/" + diagramFile.getName().replace(".runway_diagram", "");
    
    String[] args = new String[] { "-dir",
        tempFolderStr,
        SchemaUtil.class.getClassLoader().getResource("com/runwaysdk/resources/version.xsd").toExternalForm(),
        workspace + "/" + projectName + "/src/main/domain/application/" + page1.getSchemaName() };
    
    SchemaManager.main(args);
    
    /*
     * Refresh Eclipse to display the new file Runway's merger created
     */
    try
    {
      diagramFile.getProject().getFolder("src/main/domain").refreshLocal(IResource.DEPTH_INFINITE, null);
    }
    catch (CoreException e)
    {
      SchemaUtil.handleError(getShell(), e);
    }
    
    /*
     * Delete the temp schema files used in the merge process.
     */
    File tempFolder = new File(tempFolderStr);
    
    LinkedList<File> files = new LinkedList<File>(Arrays.asList(tempFolder.listFiles()));
    
    Iterator<File> it = files.iterator();
    while (it.hasNext()) {
      File file = (File) it.next();
      
      file.delete();
    }
    
    return true;
  }
  
}
