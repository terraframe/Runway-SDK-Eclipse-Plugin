package com.runwaysdk.eclipse.plugin.wizards;

import java.io.IOException;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeBoolean;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayCreationWizard;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayCreationWizardPage;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;
import com.runwaysdk.eclipse.plugin.runway.impl.DocumentRootImpl;

public class SchemaImportWizard extends Wizard implements IImportWizard
{
  protected RunwayCreationWizardPage diagramModelFilePage;
  protected SchemaImportWizardPage1 page1;
  protected IStructuredSelection     selection;
  RunwayCreationWizard wizard;
  protected String diagramFilename;
  
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
    
    launchNewWizardDialog();
    
//    diagramModelFilePage = new RunwayCreationWizardPage("DiagramModelFile", selection, "runway_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
//    diagramModelFilePage.setTitle(Messages.RunwayCreationWizard_DiagramModelFilePageTitle);
//    diagramModelFilePage.setDescription(Messages.RunwayCreationWizard_DiagramModelFilePageDescription);
//    addPage(diagramModelFilePage);
    
    page1 = new SchemaImportWizardPage1();
    addPage(page1);
  }
  
  private IPageChangedListener listener = new IPageChangedListener(){

    @Override
    public void pageChanged(PageChangedEvent event)
    {
//      System.out.println("Page = " + event.getSelectedPage().toString());
//      RunwayCreationWizardPage page1 = (RunwayCreationWizardPage) wizard.getPage("DiagramModelFile");
      
//      URI uri = page1.getURI();
//      diagramFilename = page1.getURI().toPlatformString(false);
//      System.out.println("filename = " + diagramFilename);
//      System.out.println("devicePath = " + uri.devicePath());
//      System.out.println("fileString = " + uri.toFileString());
//      System.out.println("platformString = " + uri.toPlatformString(true));
      
      RunwayCreationWizardPage page2 = (RunwayCreationWizardPage) wizard.getPages()[1];
      URI uri = page2.getURI();
      diagramFilename = page2.getURI().toPlatformString(false);
      System.out.println("filename2 = " + diagramFilename);
    }
    
  };
  
  public void launchNewWizardDialog() {
    // Launch a RunwayCreationWizard
    wizard = new RunwayCreationWizard();
    wizard.init(PlatformUI.getWorkbench(), selection);
    WizardDialog dialog = new WizardDialog
       (PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),wizard);
    dialog.addPageChangedListener(listener);
    dialog.open();
    
    
//    MessageDialog dialog = new MessageDialog(getShell(), "My Title", null,
//        "My message", MessageDialog.ERROR, new String[] { "First",
//      "Second", "Third" }, 0);
//    int result = dialog.open();
//    
//    
//    IWizardDescriptor descriptor = PlatformUI.getWorkbench()
//        .getNewWizardRegistry().findWizard("com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayCreationWizardID");
//    
//    try
//    {
//      IWizard wizard = descriptor.createWizard();
//      Shell shell = dialog.getShell();
//      WizardDialog wd = new  WizardDialog(shell, wizard);
//      wd.setTitle(wizard.getWindowTitle());
//      wd.open();
//    }
//    catch (CoreException e)
//    {
//      e.printStackTrace();
//    }
  }

  @Override
  public boolean performFinish()
  {
    AdapterFactory adapterFactory = RunwayDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory();
    AdapterFactoryEditingDomain editer = new AdapterFactoryEditingDomain(
        adapterFactory,
        new BasicCommandStack()
    );
    Resource resource = editer.createResource(diagramFilename);
    try
    {
      // Load the file
      resource.load(null);
      
      // Retrieve the editing domain on the DocumentRoot
      EList<EObject> contents = resource.getContents();
      DocumentRootImpl documentRoot = (DocumentRootImpl) contents.get(0); //(DocumentRootImpl) diagram.getElement();
      EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(documentRoot);
      
      // Create a new MdBusiness
      MDBusiness biz  = RunwayFactory.eINSTANCE.createMDBusiness();
      biz.setClassName("Book");
      biz.setDisplayLabel("This is a book.");
      Command command = AddCommand.create(editingDomain, documentRoot, RunwayPackage.eINSTANCE.getDocumentRoot_MdBusinesses(), biz);
      editingDomain.getCommandStack().execute(command);
      
      // Create a new MdAttribute and add it to the MdBusiness's container
      MdAttributeBoolean attr = RunwayFactory.eINSTANCE.createMdAttributeBoolean();
      attr.setName("isANovel");
      attr.setDefaultValue(false);
      command = AddCommand.create(editingDomain, biz, RunwayPackage.eINSTANCE.getMDBusiness_Attributes(), attr);
      editingDomain.getCommandStack().execute(command);
      
      resource.save(null);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    
    return true;
  }
  
}
