package com.runwaysdk.eclipse.plugin.wizards;

import java.io.IOException;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import xmlParserTest.RunwayDOMParser;

import com.runwaysdk.eclipse.plugin.runway.MdAttributeCharacter;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayCreationWizardPage;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;
import com.runwaysdk.eclipse.plugin.runway.impl.DocumentRootImpl;

public class SchemaImportWizard extends Wizard implements IImportWizard
{
  protected RunwayCreationWizardPage diagramModelFilePage;
  protected SchemaImportWizardPage1 page1;
  protected IStructuredSelection     selection;
  
  public SchemaImportWizard() {
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
    page1 = new SchemaImportWizardPage1();
    page1.setSelection(selection);
    addPage(page1);
  }
  
  @Override
  public boolean performFinish()
  {
    AdapterFactory adapterFactory = RunwayDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory();
    AdapterFactoryEditingDomain editer = new AdapterFactoryEditingDomain(
        adapterFactory,
        new BasicCommandStack()
    );
    Resource resource = editer.createResource(page1.getModelPath());
    try
    {
      // Load the file
      resource.load(null);
      
      // Retrieve the editing domain on the DocumentRoot
      EList<EObject> contents = resource.getContents();
      DocumentRootImpl documentRoot = (DocumentRootImpl) contents.get(0); //(DocumentRootImpl) diagram.getElement();
      EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(documentRoot);
      
      // Parse the schema and add it to GMF
      RunwayDOMParser parser = new RunwayDOMParser(editingDomain, documentRoot);
      parser.parse(page1.getSchemaPath());
      
      resource.save(null);
      
      resource.unload();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    
    return true;
  }
  
}
