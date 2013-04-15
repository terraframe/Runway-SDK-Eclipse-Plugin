package com.runwaysdk.eclipse.plugin.wizards;

import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import com.runwaysdk.eclipse.plugin.schema.SchemaUtil;

public class SchemaExportWizardPage1 extends WizardPage
{
  private Composite container;
  private StringFieldEditor schemaNameField;
  private StringFieldEditor projectNameField;
  protected String projectName = "";
  protected String schemaName = "";
  protected IStructuredSelection selection;
  
  public SchemaExportWizardPage1() {
    super("Runway Schema Export Wizard");
    setTitle("Runway Schema Export Wizard");
    setDescription("Exports a Runway schema from the UML diagram into Runway XML.");
  }
  
  @Override
  public void createControl(Composite parent) {
    container = new Composite(parent, SWT.NULL);
    
    projectName = SchemaUtil.getActiveProjectNameFromSelection(selection);
    
    projectNameField = new StringFieldEditor("ProjectName", "Project Name", container); 
    projectNameField.setEmptyStringAllowed(false);
    projectNameField.setStringValue(projectName);
    projectNameField.setPropertyChangeListener(new IPropertyChangeListener() {
      
      @Override
      public void propertyChange(PropertyChangeEvent arg0)
      {
        if (arg0.getNewValue() instanceof String) {
          projectName = (String) arg0.getNewValue();
          System.out.println("ProjectName = '" + projectName + "'");
        }
      }
      
    });

    schemaName = "merged.xml";
    
    schemaNameField = new StringFieldEditor("SchemaName", "Export Schema File Name", container); 
    schemaNameField.setEmptyStringAllowed(false);
    schemaNameField.setStringValue(schemaName);
    schemaNameField.setPropertyChangeListener(new IPropertyChangeListener() {
      
      @Override
      public void propertyChange(PropertyChangeEvent arg0)
      {
        if (arg0.getNewValue() instanceof String) {
          schemaName = (String) arg0.getNewValue();
          System.out.println("SchemaName = '" + schemaName + "'");
        }
      }
      
    });
    
    setControl(container);
    
    setPageComplete(true);
  }

  public String getProjectName() {
    return projectName;
  }
  
  public String getSchemaName() {
    return schemaName;
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
