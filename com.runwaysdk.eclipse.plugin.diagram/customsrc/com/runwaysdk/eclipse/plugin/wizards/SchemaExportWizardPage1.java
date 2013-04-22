package com.runwaysdk.eclipse.plugin.wizards;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import com.runwaysdk.eclipse.plugin.schema.SchemaUtil;

public class SchemaExportWizardPage1 extends WizardPage
{
  private Composite container;
  private StringFieldEditor schemaNameField;
  private StringFieldEditor projectNameField;
  protected IFile diagramFile = null;
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
    
    
    diagramFile = promptDiagramFile(null);

    
    schemaName = diagramFile.getName().replace(".runway_diagram", "") + "_changedSomething" + ".xml";
    
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
  
  /**
   * This complicated function opens a series of dialogs that eventually leads the user to select a runway_diagram file.
   */
  public IFile promptDiagramFile(IProject proj) {
    Object selecEl = selection.getFirstElement();
    if (selecEl != null && selecEl instanceof IFile)
    {
      IFile file = (IFile) selecEl;
      
      if (file.getFileExtension().equals("runway_diagram")) {
        return file;
      }
    }
    if (proj == null && selecEl != null && selecEl instanceof IResource) {
      proj = ((IResource) selecEl).getProject();
    }
    
    if (proj == null) {
      ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(), new LabelProvider());
      dialog.setTitle("Project Selection");
      dialog.setMessage("Select the project:");
      
      IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
      dialog.setElements(projects);
      
      dialog.open();
      
      Object result = dialog.getResult()[0];
      
      return promptDiagramFile((IProject) result);
    }
    else {
      IFolder folder = proj.getFolder("src/main/domain/display");
      
      if (folder == null || !folder.exists()) {
        SchemaUtil.handleError(getShell(), "Unable to find the folder 'src/main/domain/display' in the project that you selected. The project must be a Runway project.");
        return promptDiagramFile(null);
      }
      
      ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(), new LabelProvider());
      dialog.setTitle("Diagram File Selection");
      dialog.setMessage("Select the diagram file to export:");
      
      LinkedList<IResource> resources = null;
      try
      {
        resources = new LinkedList<IResource>(Arrays.asList(folder.members()));
      }
      catch (CoreException e)
      {
        SchemaUtil.handleError(getShell(), e);
      }
      Iterator<IResource> it = resources.iterator();
      while (it.hasNext()) {
        IResource res = (IResource) it.next();
        if (res instanceof IFile) {
          IFile file = (IFile) res;
          
          String extension = "";
          String fileName = file.getName();

          int i = fileName.lastIndexOf('.');

          if (i > 0) {
            extension = fileName.substring(i+1);
          }
          else {
            it.remove();
            continue;
          }
          
          if (!extension.equals("runway_diagram")) {
            it.remove();
          }
        }
        else {
          it.remove();
        }
      }
      dialog.setElements(resources.toArray());
      
      dialog.open();
      
      return (IFile) dialog.getResult()[0];
    }
  }

  public IFile getDiagramFile() {
    return diagramFile;
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
