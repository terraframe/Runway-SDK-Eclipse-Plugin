package com.runwaysdk.eclipse.plugin.wizards;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;


import com.runwaysdk.dataaccess.schemamanager.SchemaManager;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayCreationWizardPage;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;
import com.runwaysdk.eclipse.plugin.runway.impl.DocumentRootImpl;
import com.runwaysdk.eclipse.plugin.schema.importer.RunwayDOMParser;

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
    URL url = Platform.getInstanceLocation().getURL();
    String workspace = new File(url.getPath()).getAbsolutePath();
    
    String[] args = new String[] { "-dir",
        workspace + "/.metadata/.plugins/com.runwaysdk.eclipse.plugin/" + page1.getProjectName() + "/schema(0001352140861497)HelloWorld",
        "/Users/terraframe/Documents/workspace/Runway-SDK-Eclipse-Plugin/com.runwaysdk.eclipse.plugin.diagram/resources/version.xsd",
        workspace + "/" + page1.getProjectName() + "/src/main/domain/application/" + page1.getSchemaName() };

    SchemaManager.main(args);
    
    return true;
  }
  
}
