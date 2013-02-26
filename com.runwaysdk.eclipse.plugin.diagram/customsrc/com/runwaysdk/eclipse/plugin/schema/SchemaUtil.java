package com.runwaysdk.eclipse.plugin.schema;

import java.io.File;
import java.net.URL;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.views.navigator.ResourceNavigator;

import com.runwaysdk.dataaccess.schemamanager.SchemaManager;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;

public class SchemaUtil
{
  // private static SchemaUtil INSTANCE;

  private String workspacePath;

  private String activeProjectName;

  private String defaultTempFileLoc;
  
  private String runwayResources;

  public SchemaUtil(String projectName, String workspacePath)
  {
    init(projectName, workspacePath);
  }

  public SchemaUtil(String projectName)
  {
    init(projectName, null);
  }

  private void init(String projectName, String workspacePath)
  {
    this.workspacePath = workspacePath;
    if (this.workspacePath == null)
    {
      // This code retrieves the workspace from Eclipse.
      URL url = Platform.getInstanceLocation().getURL();
      workspacePath = new File(url.getPath()).getAbsolutePath();
    }

    activeProjectName = projectName;

    defaultTempFileLoc = workspacePath + "/" + activeProjectName + "/src/main/domain/temp/";
    runwayResources = workspacePath + "/" + activeProjectName + "/target/classes/com/runwaysdk/resources/";
  }

  public static void main(String[] args) throws ProjectNotCompiledException
  {
    flattenSchemaDirToSingleTempFile("RunwayMavenTemplate",
        "/Users/terraframe/documents/workspace/Runway-SDK");
  }

  /**
   * This method will be called by the SchemaImportWizard (and eventually the
   * ExportWizard) to flatten (merge) a directory of schema files into a single
   * temporary schema file.
   * 
   * PreCondition: src/main/domain/application contains valid runway xml schema
   * files for the application. The project must have been compiled using Maven
   * with runwaysdk-common as a dependency.
   * 
   * PostCondition: A new, merged runway xml schema file now exists at
   * defaultTempFileLoc with the name "application.xml".
   * 
   * @throws ProjectNotCompiledException
   */
  public static void flattenSchemaDirToSingleTempFile(String projectName, String workspacePath)
      throws ProjectNotCompiledException
  {
    new SchemaUtil(projectName, workspacePath).flattenSchemaDirToSingleTempFile();
  }

  public void flattenSchemaDirToSingleTempFile() throws ProjectNotCompiledException
  {
    String projectPath = workspacePath + "/" + activeProjectName + "/";
    File versionXSD = new File(runwayResources + "version.xsd");
    if (!versionXSD.exists())
    {
      throw new ProjectNotCompiledException(
          "The project ["
              + activeProjectName
              + "] has not been compiled (using Maven) with a dependency on runwaysdk-common, unable to find required resources in the target directory ["
              + versionXSD.getAbsolutePath() + "].");
    }

    flattenSchemaDirToSingleTempFile(projectPath + "src/main/domain", "application",
        versionXSD.getAbsolutePath(), defaultTempFileLoc);
  }

  public void flattenSchemaDirToSingleTempFile(String pathToDir, String dirName, String xsdAbsPath,
      String tempFilePath)
  {
    String[] args = new String[] { "-dir", pathToDir + "/" + dirName, xsdAbsPath,
        tempFilePath + dirName + ".xml" };

    SchemaManager.main(args);
  }

  /**
   * TODO
   */
  public static String getActiveProjectNameFromSelection(IStructuredSelection selection)
  {
    return getActiveProjectNameFromWorkbench();
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
  private static String getActiveProjectNameFromWorkbench()
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
        IResource resource = (IResource) sel.getFirstElement();
        activeProject = resource.getProject();
        break;
      }
    }
    return activeProject.getName();
  }
}
