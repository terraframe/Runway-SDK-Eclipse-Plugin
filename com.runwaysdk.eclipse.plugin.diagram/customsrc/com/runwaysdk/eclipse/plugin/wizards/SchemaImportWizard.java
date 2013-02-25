package com.runwaysdk.eclipse.plugin.wizards;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import xmlParserTest.RunwayDOMParser;

import com.runwaysdk.eclipse.plugin.runway.diagram.part.Messages;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayCreationWizardPage;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorUtil;
import com.runwaysdk.eclipse.plugin.runway.impl.DocumentRootImpl;

public class SchemaImportWizard extends Wizard implements IImportWizard
{
  protected RunwayCreationWizardPage diagramModelFilePage;
  protected SchemaImportWizardPage1 page1;
  protected IStructuredSelection selection;
  protected Resource diagram;
  
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
    String modelPath = page1.getModelPath();
//    String schemaPath = "platform:/resource" + page1.getSchemaFile();
    String schemaPath = page1.getSchemaFile();

    /*
     *  Create the gmf model files (runway and runway_diagram)
     */
    if (modelPath.length() == 0 || page1.wantsGMFFilesCreated()) {
      final String gmfModelPath = "platform:/resource/" + modelPath;
      final URI domainModel = URI.createURI(gmfModelPath);
      final URI diagramModel = URI.createURI(gmfModelPath.replace(".runway", ".runway_diagram"));
      
      if (diagramModel == null) {
        throw new RuntimeException("URI creation failed.");
      }
      
      System.out.println("Attempting to create diagramModel at path [" + diagramModel + "].");
      
      IRunnableWithProgress op = new WorkspaceModifyOperation(null)
      {

        protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException
        {
          diagram = RunwayDiagramEditorUtil.createDiagram(diagramModel, domainModel, monitor);
          
          if (diagram != null) {
            try
            {
              RunwayDiagramEditorUtil.openDiagram(diagram);
            }
            catch (PartInitException e)
            {
              ErrorDialog.openError(getContainer().getShell(), Messages.RunwayCreationWizardOpenEditorError, null, e.getStatus());
            }
          }
          else {
            ErrorDialog.openError(getContainer().getShell(), "Error creating Runway Diagram.", null, null);
          }
        }
      };
      try
      {
        getContainer().run(false, true, op);
      }
      catch (InterruptedException e)
      {
        return false;
      }
      catch (InvocationTargetException e)
      {
        if (e.getTargetException() instanceof CoreException)
        {
          ErrorDialog.openError(getContainer().getShell(), Messages.RunwayCreationWizardCreationError, null,
              ( (CoreException) e.getTargetException() ).getStatus());
        }
        else
        {
          RunwayDiagramEditorPlugin.getInstance().logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
        }
        return false;
      }
      
      if (diagram == null) {
        return false;
      }
    }
    
    
    /**
     * Import the schema into the domain file.
     */
    AdapterFactory adapterFactory = RunwayDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory();
    AdapterFactoryEditingDomain editer = new AdapterFactoryEditingDomain(
        adapterFactory,
        new BasicCommandStack()
    );
    Resource resource = editer.createResource(modelPath);
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
      parser.parse(schemaPath);
      
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
