package com.runwaysdk.eclipse.plugin.wizards;

import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.StringButtonFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayCreationWizardPage;
import com.runwaysdk.eclipse.plugin.wizards.RunwayCreationWizardWithFinishListeners.OnPerformFinishListenerIF;

public class NewRunwayProjectWizardPage1 extends WizardPage
{
  private Composite container;
  private StringButtonFieldEditor modelFileFieldEditor;
  private StringButtonFieldEditor schemaFileFieldEditor;
  private Button newDiagramButton;
  protected String modelPath = "";
  protected String schemaPath = "";
  protected IStructuredSelection selection;
  private RunwayCreationWizardWithFinishListeners newDiagramWizard;
  
  public NewRunwayProjectWizardPage1() {
    super("Runway Schema New Wizard");
    setTitle("Runway Schema New Wizard");
    setDescription("Crates a Runway XML Schema into a Runway Model/Diagram file.");
  }
  
  @Override
  public void createControl(Composite parent) {
    container = new Composite(parent, SWT.NULL);
    
    schemaFileFieldEditor = new FileFieldEditor("SchemaURI", "Runway XML Schema", container); 
    ((FileFieldEditor)schemaFileFieldEditor).setFileExtensions(new String[]{"xml"}); 
    schemaFileFieldEditor.setEmptyStringAllowed(false);
    schemaFileFieldEditor.setPropertyChangeListener(new IPropertyChangeListener() {
      
      @Override
      public void propertyChange(PropertyChangeEvent arg0)
      {
        if (arg0.getNewValue() instanceof String) {
          schemaPath = (String) arg0.getNewValue();
          System.out.println("SchemaPath = '" + schemaPath + "'");
          
          if (modelPath.trim().length() != 0 && schemaPath.trim().length() != 0) {
            setPageComplete(true);
          }
          else {
            setPageComplete(false);
          }
        }
      }
      
    });
    
    modelFileFieldEditor = new FileFieldEditor("ModelURI", "Runway Model", container); 
    ((FileFieldEditor)modelFileFieldEditor).setFileExtensions(new String[]{"runway"}); 
    modelFileFieldEditor.setEmptyStringAllowed(false);
    modelFileFieldEditor.setPropertyChangeListener(new IPropertyChangeListener() {
      
      @Override
      public void propertyChange(PropertyChangeEvent arg0)
      {
        if (arg0.getNewValue() instanceof String) {
          modelPath = (String) arg0.getNewValue();
          System.out.println("ModelPath = '" + schemaPath + "'");
          
          if (modelPath.trim().length() != 0 && schemaPath.trim().length() != 0) {
            setPageComplete(true);
          }
          else {
            setPageComplete(false);
          }
        }
      }
      
    });
    
    newDiagramButton = new Button(container, SWT.PUSH);
    newDiagramButton.setText("Create New Diagram/Model");
    newDiagramButton.addSelectionListener(new SelectionListener(){
      @Override
      public void widgetDefaultSelected(SelectionEvent arg0)
      {
        launchNewWizardDialog();
        
        modelFileFieldEditor.setStringValue(modelPath);
      }
      @Override
      public void widgetSelected(SelectionEvent arg0)
      {
        launchNewWizardDialog();
        
        modelFileFieldEditor.setStringValue(modelPath);
      }
    });
    
    setControl(container);
    
    setPageComplete(false);
  }
  
  private OnPerformFinishListenerIF listener = new OnPerformFinishListenerIF(){
    @Override
    public void onPerformFinish()
    {
      RunwayCreationWizardPage page2 = (RunwayCreationWizardPage) newDiagramWizard.getPages()[1];
      modelPath = page2.getURI().toPlatformString(false);
    }
  };
  
  public void launchNewWizardDialog() {
    // Launch a RunwayCreationWizard
    newDiagramWizard = new RunwayCreationWizardWithFinishListeners();
    newDiagramWizard.init(PlatformUI.getWorkbench(), selection);
    WizardDialog dialog = new WizardDialog
       (PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),newDiagramWizard);
    newDiagramWizard.addFinishListener(listener);
    dialog.open();
  }

  public String getModelPath() {
    return modelPath;
  }
  
  public String getSchemaPath() {
    return schemaPath;
  }
  
  public IStructuredSelection getSelection()
  {
    return selection;
  }

  public void setSelection(IStructuredSelection selection)
  {
    this.selection = selection;
  }
}
