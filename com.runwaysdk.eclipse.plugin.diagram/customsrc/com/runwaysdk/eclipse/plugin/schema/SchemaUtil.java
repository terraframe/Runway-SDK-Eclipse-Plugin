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
  public static void main(String[] argz)
  {
    //System.out.println(SchemaUtil.class.getClassLoader().getResource("com/runwaysdk/resources/schema.xsd"));
    
    String[] args = new String[] { "-dir",
        "/Users/terraframe/Documents/runtime-Runway_runtime_configuration/.metadata/.plugins/com.runwaysdk.eclipse.plugin/my-runway-project/schema(0001352140861497)HelloWorld",
        "/Users/terraframe/Documents/workspace/Runway-SDK-Eclipse-Plugin/com.runwaysdk.eclipse.plugin.diagram/resources/version.xsd",
        "/Users/terraframe/Documents/runtime-Runway_runtime_configuration/my-runway-project/src/main/domain/application/testy.xml" };

    SchemaManager.main(args);
  }

  public static void flattenSchemaDirToSingleTempFile(String pathToDir, String dirName, String xsdAbsPath,
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
    
    if (activeProject == null) {
      return "";
    }
    
    return activeProject.getName();
  }
}
