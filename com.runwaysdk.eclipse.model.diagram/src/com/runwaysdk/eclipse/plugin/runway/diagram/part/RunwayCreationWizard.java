package com.runwaysdk.eclipse.plugin.runway.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class RunwayCreationWizard extends Wizard implements INewWizard
{

  /**
   * @generated
   */
  private IWorkbench                 workbench;

  /**
   * @generated
   */
  protected IStructuredSelection     selection;

  /**
   * @generated
   */
  protected RunwayCreationWizardPage diagramModelFilePage;

  /**
   * @generated
   */
  protected RunwayCreationWizardPage domainModelFilePage;

  /**
   * @generated
   */
  protected Resource                 diagram;

  /**
   * @generated
   */
  private boolean                    openNewlyCreatedDiagramEditor = true;

  /**
   * @generated
   */
  public IWorkbench getWorkbench()
  {
    return workbench;
  }

  /**
   * @generated
   */
  public IStructuredSelection getSelection()
  {
    return selection;
  }

  /**
   * @generated
   */
  public final Resource getDiagram()
  {
    return diagram;
  }

  /**
   * @generated
   */
  public final boolean isOpenNewlyCreatedDiagramEditor()
  {
    return openNewlyCreatedDiagramEditor;
  }

  /**
   * @generated
   */
  public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor)
  {
    this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
  }

  /**
   * @generated
   */
  public void init(IWorkbench workbench, IStructuredSelection selection)
  {
    this.workbench = workbench;
    this.selection = selection;
    setWindowTitle(Messages.RunwayCreationWizardTitle);
    setDefaultPageImageDescriptor(RunwayDiagramEditorPlugin.getBundledImageDescriptor("icons/wizban/NewRunwayWizard.gif")); //$NON-NLS-1$
    setNeedsProgressMonitor(true);
  }

  /**
   * @generated
   */
  public void addPages()
  {
    diagramModelFilePage = new RunwayCreationWizardPage("DiagramModelFile", getSelection(), "runway_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
    diagramModelFilePage.setTitle(Messages.RunwayCreationWizard_DiagramModelFilePageTitle);
    diagramModelFilePage.setDescription(Messages.RunwayCreationWizard_DiagramModelFilePageDescription);
    addPage(diagramModelFilePage);

    domainModelFilePage = new RunwayCreationWizardPage("DomainModelFile", getSelection(), "runway") { //$NON-NLS-1$ //$NON-NLS-2$

      public void setVisible(boolean visible)
      {
        if (visible)
        {
          String fileName = diagramModelFilePage.getFileName();
          fileName = fileName.substring(0, fileName.length() - ".runway_diagram".length()); //$NON-NLS-1$
          setFileName(RunwayDiagramEditorUtil.getUniqueFileName(getContainerFullPath(), fileName, "runway")); //$NON-NLS-1$
        }
        super.setVisible(visible);
      }
    };
    domainModelFilePage.setTitle(Messages.RunwayCreationWizard_DomainModelFilePageTitle);
    domainModelFilePage.setDescription(Messages.RunwayCreationWizard_DomainModelFilePageDescription);
    addPage(domainModelFilePage);
  }

  /**
   * @generated
   */
  public boolean performFinish()
  {
    IRunnableWithProgress op = new WorkspaceModifyOperation(null)
    {

      protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException
      {
        diagram = RunwayDiagramEditorUtil.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
        if (isOpenNewlyCreatedDiagramEditor() && diagram != null)
        {
          try
          {
            RunwayDiagramEditorUtil.openDiagram(diagram);
          }
          catch (PartInitException e)
          {
            ErrorDialog.openError(getContainer().getShell(), Messages.RunwayCreationWizardOpenEditorError, null, e.getStatus());
          }
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
    return diagram != null;
  }
}
