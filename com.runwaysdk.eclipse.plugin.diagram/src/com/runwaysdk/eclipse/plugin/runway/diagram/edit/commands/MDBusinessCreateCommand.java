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

import com.runwaysdk.eclipse.plugin.runway.DocumentRoot;
import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

/**
 * @generated
 */
public class MDBusinessCreateCommand extends EditElementCommand
{

  /**
   * @generated
   */
  public MDBusinessCreateCommand(CreateElementRequest req)
  {
    super(req.getLabel(), null, req);
    System.out.println("Uno"); 
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
    System.out.println("Dos"); 
    return container;
  }

  /**
   * @generated
   */
  public boolean canExecute()
  {
	System.out.println("Tres"); 
    return true;

  }

  /**
   * @generated
   */
  protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
      throws ExecutionException
  {
    MDBusiness newElement = RunwayFactory.eINSTANCE.createMDBusiness();

    DocumentRoot owner = (DocumentRoot) getElementToEdit();
    owner.getMDBusinesses().add(newElement);

    doConfigure(newElement, monitor, info);

    ( (CreateElementRequest) getRequest() ).setNewElement(newElement);
	System.out.println("Quatro"); 
    return CommandResult.newOKCommandResult(newElement);
  }

  /**
   * @generated
   */
  protected void doConfigure(MDBusiness newElement, IProgressMonitor monitor, IAdaptable info)
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
    System.out.println("Cinco");
  }

}
