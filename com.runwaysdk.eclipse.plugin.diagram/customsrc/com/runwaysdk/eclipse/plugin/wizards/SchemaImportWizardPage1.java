package com.runwaysdk.eclipse.plugin.wizards;

import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
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

import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayCreationWizard;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayCreationWizardPage;

public class SchemaImportWizardPage1 extends WizardPage
{
  private Composite container;
  private StringButtonFieldEditor modelFileFieldEditor;
  private StringButtonFieldEditor schemaFileFieldEditor;
  private Button newDiagramButton;
  protected String modelPath;
  protected String schemaPath;
  protected IStructuredSelection selection;
  private RunwayCreationWizard newDiagramWizard;
  
  public SchemaImportWizardPage1() {
    super("Runway Schema Import Wizard");
    setTitle("Runway Schema Import Wizard");
    setDescription("Imports a Runway XML Schema into a Runway Model/Diagram file.");
  }
  
  @Override
  public void createControl(Composite parent) {
    container = new Composite(parent, SWT.NULL);
//    GridLayout layout = new GridLayout();
//    container.setLayout(layout);
//    layout.numColumns = 2;
//    Label label1 = new Label(container, SWT.NULL);
//    label1.setText("Import Destination");
//
//    text1 = new Text(container, SWT.BORDER | SWT.SINGLE);
//    text1.setText("");
//    text1.addKeyListener(new KeyListener() {
//
//      @Override
//      public void keyPressed(KeyEvent e) {
//      }
//
//      @Override
//      public void keyReleased(KeyEvent e) {
//        if (!text1.getText().isEmpty()) {
//          setPageComplete(true);
//
//        }
//      }
//
//    });
//    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    
    schemaFileFieldEditor = new FileFieldEditor("SchemaURI", "Runway XML Schema", container); 
    ((FileFieldEditor)schemaFileFieldEditor).setFileExtensions(new String[]{"xml"}); 
    schemaFileFieldEditor.setEmptyStringAllowed(false);
    schemaFileFieldEditor.setPropertyChangeListener(new IPropertyChangeListener() {
      
      @Override
      public void propertyChange(PropertyChangeEvent arg0)
      {
        if (arg0.getProperty() != "") {
          setPageComplete(true);
        }
        else {
          setPageComplete(false);
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
        if (arg0.getProperty() != "") {
          setPageComplete(true);
        }
        else {
          setPageComplete(false);
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
  
  private IPageChangedListener listener = new IPageChangedListener(){

    @Override
    public void pageChanged(PageChangedEvent event)
    {
      RunwayCreationWizardPage page2 = (RunwayCreationWizardPage) newDiagramWizard.getPages()[1];
      modelPath = page2.getURI().toPlatformString(false);
    }
    
  };
  
  public void launchNewWizardDialog() {
    // Launch a RunwayCreationWizard
    newDiagramWizard = new RunwayCreationWizard();
    newDiagramWizard.init(PlatformUI.getWorkbench(), selection);
    WizardDialog dialog = new WizardDialog
       (PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),newDiagramWizard);
    dialog.addPageChangedListener(listener);
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
