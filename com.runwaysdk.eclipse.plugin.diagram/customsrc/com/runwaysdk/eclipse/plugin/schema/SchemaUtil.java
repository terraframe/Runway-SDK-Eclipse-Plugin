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

import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;

public class SchemaUtil
{
  private static SchemaUtil INSTANCE;

  private static String     workspacePath;

  private static String     activeProjectName;

  private static String     defaultTempFileLoc;

  public static void initialize(IStructuredSelection selection)
  {
    // This code retrieves the workspace from Eclipse.
    URL url = Platform.getInstanceLocation().getURL();
    workspacePath = new File(url.getPath()).getAbsolutePath();

    activeProjectName = getActiveProjectNameFromSelection(selection);

    defaultTempFileLoc = workspacePath + File.pathSeparator + activeProjectName + "/src/main/domain/temp/";
  }

  public static SchemaUtil getInstance()
  {
    if (INSTANCE == null)
    {
      throw new RuntimeException("The SchemaUtil has not been initialized with a project state.");
    }

    return INSTANCE;
  }

  /**
   * This method will be called by the SchemaImportWizard (and eventually the
   * ExportWizard) to flatten (merge) a directory of schema files into a single
   * temporary schema file.
   */
  public String flattenSchemaDirToSingleTempFile(String pathToDir, String dirName)
  {
    return null;
  }

  public String flattenSchemaDirToSingleTempFile()
  {
    return flattenSchemaDirToSingleTempFile(
        workspacePath + "/" + activeProjectName + "/src/main/domain", "application");
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
  public static String getActiveProjectNameFromSelection(IStructuredSelection selection)
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
