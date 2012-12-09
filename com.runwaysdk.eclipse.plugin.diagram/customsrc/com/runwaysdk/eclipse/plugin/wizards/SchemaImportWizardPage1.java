package com.runwaysdk.eclipse.plugin.wizards;

import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.StringButtonFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class SchemaImportWizardPage1 extends WizardPage
{
  private Text text1;
  private Composite container;
  
  public SchemaImportWizardPage1() {
    super("Page1");
    setTitle("Page1");
    setDescription("Page Description");
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
//    text1.setLayoutData(gd);
//    // Required to avoid an error in the system
    
    
    StringButtonFieldEditor fileFieldEditor;
//    if (file) { 
    fileFieldEditor = new FileFieldEditor("SchemaURI", "Runway XML Schema URI", container); 
    ((FileFieldEditor)fileFieldEditor).setFileExtensions(new String[]{"xml"}); 
//    } 
//    else { 
//    fileFieldEditor = new DirectoryFieldEditor(storageKey, title, 
//    composite); 
//    }
    
    fileFieldEditor.setEmptyStringAllowed(false);
    fileFieldEditor.setPropertyChangeListener(new IPropertyChangeListener() {
      
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
    
    setControl(container);
    
    setPageComplete(false);
  }

  public String getText1() {
    return text1.getText();
  }
}
