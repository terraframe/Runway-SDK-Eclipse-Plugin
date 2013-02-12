package com.runwaysdk.eclipse.plugin.runway.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import com.runwaysdk.eclipse.plugin.runway.diagram.edit.commands.MDBusinessCreateCommand;
import com.runwaysdk.eclipse.plugin.runway.diagram.providers.RunwayElementTypes;

/**
 * @generated
 */
public class DocumentRootItemSemanticEditPolicy extends RunwayBaseItemSemanticEditPolicy
{

  /**
   * @generated
   */
  public DocumentRootItemSemanticEditPolicy()
  {
    super(RunwayElementTypes.DocumentRoot_1000);
  }

  /**
   * @generated
   */
  protected Command getCreateCommand(CreateElementRequest req)
  {
    if (RunwayElementTypes.MDBusiness_2002 == req.getElementType())
    {
      return getGEFWrapper(new MDBusinessCreateCommand(req));
    }
    return super.getCreateCommand(req);
  }

  /**
   * @generated
   */
  protected Command getDuplicateCommand(DuplicateElementsRequest req)
  {
    TransactionalEditingDomain editingDomain = ( (IGraphicalEditPart) getHost() ).getEditingDomain();
    return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
  }

  /**
   * @generated
   */
  private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand
  {

    /**
     * @generated
     */
    public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain,
        DuplicateElementsRequest req)
    {
      super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req
          .getAllDuplicatedElementsMap());
    }

  }

}
