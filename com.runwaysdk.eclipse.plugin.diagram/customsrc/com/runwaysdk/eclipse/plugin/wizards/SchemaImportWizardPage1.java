package com.runwaysdk.eclipse.plugin.wizards;

import java.io.File;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.StringButtonFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayCreationWizardPage;
import com.runwaysdk.eclipse.plugin.schema.SchemaUtil;
import com.runwaysdk.eclipse.plugin.wizards.RunwayCreationWizardWithFinishListeners.OnPerformFinishListenerIF;

public class SchemaImportWizardPage1 extends WizardPage
{
  private Composite                               container;

  private StringButtonFieldEditor                 modelFileFieldEditor;

  private boolean                                 wantsGMFFilesCreated = false;

  private StringButtonFieldEditor                 schemaFileFieldEditor;

  private Button                                  newDiagramButton;

  protected String                                modelPath            = "";

  protected String                                schemaPath;

  protected Button                                enableButton;

  Composite                                       modelFileFieldContainer;

  protected IStructuredSelection                  selection;

  private RunwayCreationWizardWithFinishListeners newDiagramWizard;

  public SchemaImportWizardPage1()
  {
    super("Runway Schema Import Wizard");
    setTitle("Runway Schema Import Wizard");
    setDescription("Imports a Runway XML Schema into a Runway Model/Diagram file.");
  }

  @Override
  public void createControl(Composite parent)
  {
    container = new Composite(parent, SWT.NULL);
    RowLayout rowLayout = new RowLayout();
    rowLayout.wrap = false;
    rowLayout.pack = false;
    rowLayout.justify = true;
    rowLayout.type = SWT.VERTICAL;
    rowLayout.marginLeft = 5;
    rowLayout.marginTop = 5;
    rowLayout.marginRight = 5;
    rowLayout.marginBottom = 5;
    rowLayout.spacing = 0;
    container.setLayout(rowLayout);

    Composite schemaContainer = new Composite(container, SWT.NULL);
    schemaFileFieldEditor = new FileFieldEditor("SchemaURI", "Runway XML Schema", schemaContainer);
    ( (FileFieldEditor) schemaFileFieldEditor ).setFileExtensions(new String[] { "xml" });
    schemaFileFieldEditor.setEmptyStringAllowed(false);

    // Auto-fill this value if they've right-clicked on a schema file and then
    // did import
    String schemaFileName = null;
    Object obj = selection.getFirstElement();
    if (obj != null && obj instanceof IFile)
    {
      IFile file = (IFile) obj;
      
      if (file.getFileExtension().equals("xml")) {
        schemaPath = file.getFullPath().toPortableString();
        
        String projAbsPath = file.getProject().getLocation().toOSString();
        projAbsPath = projAbsPath.replace(File.separator + file.getProject().getName(), "");
        schemaPath = new File(projAbsPath).getAbsolutePath() + schemaPath;
  
        schemaFileFieldEditor.setStringValue(schemaPath);
        
        schemaFileName = file.getName().replace(".xml", "");
      }
    }

    schemaFileFieldEditor.setPropertyChangeListener(new IPropertyChangeListener()
    {

      @Override
      public void propertyChange(PropertyChangeEvent arg0)
      {
        if (arg0.getNewValue() instanceof String)
        {
          File file;
          String schemaFileName;
          
          String unvalidatedSchemaPath = (String) arg0.getNewValue();
          
          file = new File(unvalidatedSchemaPath);
          if (!file.exists()) {
            return;
          }
          
          String extension = "";
          String fileName = file.getName();

          int i = fileName.lastIndexOf('.');

          if (i > 0) {
            extension = fileName.substring(i+1);
          }
          else {
            return;
          }
          
          if (!extension.equals("xml")) {
            return;
          }
          
          schemaPath = unvalidatedSchemaPath;
          schemaFileName = fileName.substring(0, i);
          
          clacModelPathFromSchema(schemaFileName);
          
          updateIsPageComplete();
        }
      }

    });

    enableButton = new Button(container, SWT.CHECK);
    enableButton
        .setText("Create new runway diagram files of the same name in the default path.");

    modelFileFieldContainer = new Composite(container, SWT.NONE);

    enableButton.addSelectionListener(new SelectionAdapter()
    {
      @Override
      public void widgetSelected(final SelectionEvent e)
      {
        modelFileFieldEditor.setEnabled(!enableButton.getSelection(), modelFileFieldContainer);
        newDiagramButton.setEnabled(!enableButton.getSelection());
        container.layout();

        wantsGMFFilesCreated = !enableButton.getSelection();
        
        updateIsPageComplete();
      }
    });

    modelFileFieldEditor = new FileFieldEditor("ModelURI", "Runway Model", modelFileFieldContainer);
    ( (FileFieldEditor) modelFileFieldEditor ).setFileExtensions(new String[] { "runway" });
    modelFileFieldEditor.setEmptyStringAllowed(false);

    modelFileFieldEditor.setPropertyChangeListener(new IPropertyChangeListener()
    {

      @Override
      public void propertyChange(PropertyChangeEvent arg0)
      {
        if (arg0.getNewValue() instanceof String)
        {
          modelPath = (String) arg0.getNewValue();
        }
        
        updateIsPageComplete();
      }

    });

    newDiagramButton = new Button(modelFileFieldContainer, SWT.PUSH);
    newDiagramButton.setText("Create New Diagram/Model");
    newDiagramButton.addSelectionListener(new SelectionListener()
    {
      @Override
      public void widgetDefaultSelected(SelectionEvent arg0)
      {
        launchNewWizardDialog();

        modelFileFieldEditor.setStringValue(modelPath);
        updateIsPageComplete();
      }

      @Override
      public void widgetSelected(SelectionEvent arg0)
      {
        launchNewWizardDialog();

        modelFileFieldEditor.setStringValue(modelPath);
        updateIsPageComplete();
      }
    });
    
    clacModelPathFromSchema(schemaFileName);

    setControl(container);

    updateIsPageComplete();
  }
  
  private void clacModelPathFromSchema(String schemaFileName) {
    modelPath = "";
    
    String activeProjectName = SchemaUtil.getActiveProjectNameFromSelection(selection);
    if (activeProjectName != null && activeProjectName != "" && schemaFileName != null)
    {
      modelPath = "/" + activeProjectName + "/src/main/domain/display/" + schemaFileName + ".runway";
      
      setEnableButtonSelection(true);
    }
    else
    {
      setEnableButtonSelection(false);
    }
    
    modelFileFieldEditor.setStringValue(modelPath);
  }

  private OnPerformFinishListenerIF listener = new OnPerformFinishListenerIF()
   {
     @Override
     public void onPerformFinish()
     {
       RunwayCreationWizardPage page2 = (RunwayCreationWizardPage) newDiagramWizard
           .getPages()[1];
       modelPath = page2.getURI().toPlatformString(false);
     }
   };

  public void launchNewWizardDialog()
  {
    // Launch a RunwayCreationWizard
    newDiagramWizard = new RunwayCreationWizardWithFinishListeners();
    newDiagramWizard.init(PlatformUI.getWorkbench(), selection);
    WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
        .getShell(), newDiagramWizard);
    newDiagramWizard.addFinishListener(listener);
    dialog.open();
  }

  private void setEnableButtonSelection(boolean selec)
  {
    enableButton.setSelection(selec);
    modelFileFieldEditor.setEnabled(!selec, modelFileFieldContainer);
    newDiagramButton.setEnabled(!selec);
    container.layout();

    wantsGMFFilesCreated = selec;
  }

  public String getModelPath()
  {
    return modelPath;
  }

  public String getSchemaFile()
  {
    return schemaPath;
  }

  public boolean wantsGMFFilesCreated()
  {
    return wantsGMFFilesCreated;
  }

  public IStructuredSelection getSelection()
  {
    return selection;
  }

  public void setSelection(IStructuredSelection selection)
  {
    this.selection = selection;
  }
  
  public void updateIsPageComplete() {
    boolean isComplete = true;
    
    if (modelPath == null || modelPath == "") {
      isComplete = false;
    }
    
    if (schemaPath == null || schemaPath == "") {
      isComplete = false;
    }
    
    setPageComplete(isComplete);
  }
}
