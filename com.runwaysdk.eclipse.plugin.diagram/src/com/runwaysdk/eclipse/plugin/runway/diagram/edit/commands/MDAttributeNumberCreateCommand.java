package com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeNumber;
import com.runwaysdk.eclipse.plugin.runway.MDClass;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

/**
 * @generated
 */
public class MDAttributeNumberCreateCommand extends EditElementCommand
{

  /**
   * @generated
   */
  public MDAttributeNumberCreateCommand(CreateElementRequest req)
  {
    super(req.getLabel(), null, req);
  }

  /**
   * FIXME: replace with setElementToEdit()
   * @generated
   */
  protected EObject getElementToEdit()
  {
    EObject container = ( (CreateElementRequest) getRequest() ).getContainer();
    if (container instanceof View)
    {
      container = ( (View) container ).getElement();
    }
    return container;
  }

  /**
   * @generated
   */
  public boolean canExecute()
  {
    return true;

  }

  /**
   * @generated
   */
  protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
      throws ExecutionException
  {
    MDAttributeNumber newElement = RunwayFactory.eINSTANCE.createMDAttributeNumber();

    MDClass owner = (MDClass) getElementToEdit();
    owner.getAttributes().add(newElement);

    doConfigure(newElement, monitor, info);

    ( (CreateElementRequest) getRequest() ).setNewElement(newElement);
    return CommandResult.newOKCommandResult(newElement);
  }

  /**
   * @generated
   */
  protected void doConfigure(MDAttributeNumber newElement, IProgressMonitor monitor, IAdaptable info)
      throws ExecutionException
  {
    IElementType elementType = ( (CreateElementRequest) getRequest() ).getElementType();
    ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
    configureRequest.setClientContext( ( (CreateElementRequest) getRequest() ).getClientContext());
    configureRequest.addParameters(getRequest().getParameters());
    ICommand configureCommand = elementType.getEditCommand(configureRequest);
    if (configureCommand != null && configureCommand.canExecute())
    {
      configureCommand.execute(monitor, info);
    }
  }

}
