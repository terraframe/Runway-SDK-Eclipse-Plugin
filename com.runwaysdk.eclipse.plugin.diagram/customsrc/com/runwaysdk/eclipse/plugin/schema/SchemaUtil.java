package com.runwaysdk.eclipse.plugin.schema;

import java.io.PrintStream;
import java.net.URISyntaxException;

import org.apache.maven.cli.MavenCli;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.views.navigator.ResourceNavigator;

import com.runwaysdk.dataaccess.schemamanager.SchemaManager;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;

public class SchemaUtil
{
  public static void main(String[] argz) throws URISyntaxException
  {
    String xsd = SchemaUtil.class.getClassLoader().getResource("com/runwaysdk/resources/version.xsd").toString();
    
    System.out.println("XSD = '" + xsd + "'");
    
    String[] args = new String[] { "-dir",
        "/Users/terraframe/Documents/workspace/Runway-SDK/RunwayMavenTemplate/src/main/domain/application",
        xsd,
        "/Users/terraframe/Documents/workspace/Runway-SDK/RunwayMavenTemplate/src/main/domain/temp/merged.xml" };

    System.out.println("args='" + args.toString() + "'");
    //ProfileManager.setProfileHome("somethingWrong");
    
    //SchemaManager.main(args);
  }
  
  public static MessageConsole findConsole(String name) {
    ConsolePlugin plugin = ConsolePlugin.getDefault();
    IConsoleManager conMan = plugin.getConsoleManager();
    IConsole[] existing = conMan.getConsoles();
    for (int i = 0; i < existing.length; i++)
       if (name.equals(existing[i].getName()))
          return (MessageConsole) existing[i];
    //no console found, so create a new one
    MessageConsole myConsole = new MessageConsole(name, null);
    conMan.addConsoles(new IConsole[]{myConsole});
    return myConsole;
 }
  
  public static PrintStream openRunwayConsole() {
    // Create new console
    MessageConsole myConsole = SchemaUtil.findConsole("Runway Console");
    IWorkbenchPage page = RunwayDiagramEditorPlugin.getInstance().getWorkbench().getActiveWorkbenchWindow().getActivePage();
    final PrintStream out = new PrintStream(myConsole.newMessageStream());
    
    // Open the console
    IConsoleView view;
    try
    {
      view = (IConsoleView) page.showView(IConsoleConstants.ID_CONSOLE_VIEW);
    }
    catch (PartInitException e)
    {
      e.printStackTrace(out);
      return out;
    }
    view.display(myConsole);
    
    return out;
  }
  
  public static void runMavenCmd(final String[] mavenArgs, final String projDir, final String errStr) {
    final PrintStream out = openRunwayConsole();
    
    // Run maven in new thread
    Runnable mavenExec = new Runnable() {
      public void run() {
        int retVal = new MavenCli().doMain(mavenArgs, projDir, out, out);

        if (retVal != 0) {
          MessageDialog dialog = new MessageDialog(null, "An error has occurred.", null,
              "An exception has occurred while " + errStr + ". (Maven exited with status code " + retVal + ")", MessageDialog.ERROR, new String[] { "Ok" }, 0);
          int result = dialog.open();
        }
      }
    };
    Thread myThread = new Thread(mavenExec);
    myThread.start();
  }
  
  public static void handleError(Shell shell, String msg) {
    handleError(shell, "An error has occurred.", msg);
  }
  
  public static void handleError(Shell shell, String title, String msg) {
    System.out.println("An error has occurred: " + msg);
    
    MessageDialog dialog = new MessageDialog(shell, title, null,
        msg, MessageDialog.ERROR, new String[] { "Ok" }, 0);
    int result = dialog.open();
  }
  
  public static boolean handleError(Shell shell, Exception e) {
    e.printStackTrace();
    
    MessageDialog dialog = new MessageDialog(shell, "An error has occurred.", null,
        e.getLocalizedMessage(), MessageDialog.ERROR, new String[] { "Ok" }, 0);
    int result = dialog.open();
    
//    IStatus status = new Status(IStatus.ERROR, "SCS Admin", Util.getStackTrace(e), e);
//    ErrorDialog.openError(shell, "An error has occurred", e.getLocalizedMessage(), null);
    
    return false;
  }

  public static void flattenSchemaDirToSingleTempFile(String pathToDir, String dirName, String xsdAbsPath,
      String tempFilePath)
  {
    String[] args = new String[] { "-dir", pathToDir + "/" + dirName, xsdAbsPath,
        tempFilePath + dirName + ".xml" };

    SchemaManager.main(args);
  }
  
  public static String getActiveProjectNameFromSelection(IStructuredSelection selection)
  {
//    return getActiveProjectNameFromWorkbench();
    
    Object el = selection.getFirstElement();
    
    if (el instanceof IResource) {
      IResource res = (IResource) el;
      IProject proj = res.getProject();
      
      if (proj != null) {
        return proj.getName();
      }
    }
    
    return null;
  }

  /**
   * This code reads the selection tree and figures out the active project name
   * and return it. Note that this code is legacy and needs to be rewritten in a
   * more efficient way that uses the selection object. (This code takes forever
   * to run)
   * 
   * http://stackoverflow.com/questions/1206095/how-to-get-the-project-name-in-
   * eclipse
   */
  public static String getActiveProjectNameFromWorkbench()
  {
    IViewPart[] parts = RunwayDiagramEditorPlugin.getInstance().getWorkbench()
        .getActiveWorkbenchWindow().getActivePage().getViews();
    IProject activeProject = null;

    for (int i = 0; i < parts.length; i++)
    {
      if (parts[i] instanceof ResourceNavigator)
      {
        ResourceNavigator navigator = (ResourceNavigator) parts[i];
        StructuredSelection sel = (StructuredSelection) navigator.getTreeViewer().getSelection();
        
        if (sel == null) { continue; }
        
        IResource resource = (IResource) sel.getFirstElement();
        
        if (resource == null) { continue; }
        
        activeProject = resource.getProject();
        
        if (activeProject == null) { continue; }
        
        break;
      }
    }
    
    if (activeProject == null) {
      return null;
    }
    
    return activeProject.getName();
  }
}
