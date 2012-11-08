package com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import com.runwaysdk.eclipse.plugin.runway.diagram.edit.policies.MDBusinessItemSemanticEditPolicy;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry;
import com.runwaysdk.eclipse.plugin.runway.diagram.providers.RunwayElementTypes;

/**
 * @generated
 */
public class MDBusinessEditPart extends ShapeNodeEditPart
{

  /**
   * @generated
   */
  public static final int VISUAL_ID = 2001;

  /**
   * @generated
   */
  protected IFigure       contentPane;

  /**
   * @generated
   */
  protected IFigure       primaryShape;

  /**
   * @generated
   */
  public MDBusinessEditPart(View view)
  {
    super(view);
  }

  /**
   * @generated
   */
  protected void createDefaultEditPolicies()
  {
    installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(RunwayVisualIDRegistry.TYPED_INSTANCE));
    super.createDefaultEditPolicies();
    installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new MDBusinessItemSemanticEditPolicy());
    installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
    // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
    // removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
  }

  /**
   * @generated
   */
  protected LayoutEditPolicy createLayoutEditPolicy()
  {

    FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy()
    {

      protected Command createAddCommand(EditPart child, EditPart after)
      {
        return null;
      }

      protected Command createMoveChildCommand(EditPart child, EditPart after)
      {
        return null;
      }

      protected Command getCreateCommand(CreateRequest request)
      {
        return null;
      }
    };
    return lep;
  }

  /**
   * @generated
   */
  protected IFigure createNodeShape()
  {
    return primaryShape = new MDBusinessFigure();
  }

  /**
   * @generated
   */
  public MDBusinessFigure getPrimaryShape()
  {
    return (MDBusinessFigure) primaryShape;
  }

  /**
   * @generated
   */
  protected boolean addFixedChild(EditPart childEditPart)
  {
    if (childEditPart instanceof MDBusinessClassNameEditPart)
    {
      ( (MDBusinessClassNameEditPart) childEditPart ).setLabel(getPrimaryShape().getFigureMDBusinessClassNameFigure());
      return true;
    }
    return false;
  }

  /**
   * @generated
   */
  protected boolean removeFixedChild(EditPart childEditPart)
  {
    if (childEditPart instanceof MDBusinessClassNameEditPart)
    {
      return true;
    }
    return false;
  }

  /**
   * @generated
   */
  protected void addChildVisual(EditPart childEditPart, int index)
  {
    if (addFixedChild(childEditPart))
    {
      return;
    }
    super.addChildVisual(childEditPart, -1);
  }

  /**
   * @generated
   */
  protected void removeChildVisual(EditPart childEditPart)
  {
    if (removeFixedChild(childEditPart))
    {
      return;
    }
    super.removeChildVisual(childEditPart);
  }

  /**
   * @generated
   */
  protected IFigure getContentPaneFor(IGraphicalEditPart editPart)
  {
    return getContentPane();
  }

  /**
   * @generated
   */
  protected NodeFigure createNodePlate()
  {
    DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
    return result;
  }

  /**
   * Creates figure for this edit part.
   * 
   * Body of this method does not depend on settings in generation model
   * so you may safely remove <i>generated</i> tag and modify it.
   * 
   * @generated
   */
  protected NodeFigure createNodeFigure()
  {
    NodeFigure figure = createNodePlate();
    figure.setLayoutManager(new StackLayout());
    IFigure shape = createNodeShape();
    figure.add(shape);
    contentPane = setupContentPane(shape);
    return figure;
  }

  /**
   * Default implementation treats passed figure as content pane.
   * Respects layout one may have set for generated figure.
   * @param nodeShape instance of generated figure class
   * @generated
   */
  protected IFigure setupContentPane(IFigure nodeShape)
  {
    if (nodeShape.getLayoutManager() == null)
    {
      ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
      layout.setSpacing(5);
      nodeShape.setLayoutManager(layout);
    }
    return nodeShape; // use nodeShape itself as contentPane
  }

  /**
   * @generated
   */
  public IFigure getContentPane()
  {
    if (contentPane != null)
    {
      return contentPane;
    }
    return super.getContentPane();
  }

  /**
   * @generated
   */
  protected void setForegroundColor(Color color)
  {
    if (primaryShape != null)
    {
      primaryShape.setForegroundColor(color);
    }
  }

  /**
   * @generated
   */
  protected void setBackgroundColor(Color color)
  {
    if (primaryShape != null)
    {
      primaryShape.setBackgroundColor(color);
    }
  }

  /**
   * @generated
   */
  protected void setLineWidth(int width)
  {
    if (primaryShape instanceof Shape)
    {
      ( (Shape) primaryShape ).setLineWidth(width);
    }
  }

  /**
   * @generated
   */
  protected void setLineType(int style)
  {
    if (primaryShape instanceof Shape)
    {
      ( (Shape) primaryShape ).setLineStyle(style);
    }
  }

  /**
   * @generated
   */
  public EditPart getPrimaryChildEditPart()
  {
    return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessClassNameEditPart.VISUAL_ID));
  }

  /**
   * @generated
   */
  public EditPart getTargetEditPart(Request request)
  {
    if (request instanceof CreateViewAndElementRequest)
    {
      CreateElementRequestAdapter adapter = ( (CreateViewAndElementRequest) request ).getViewAndElementDescriptor().getCreateElementRequestAdapter();
      IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
      if (type == RunwayElementTypes.MdAttributeText_3004)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeDate_3005)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeBlob_3002)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeLocalCharacter_3006)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeDouble_3007)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeDecimal_3008)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeLong_3009)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeTime_3010)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeBoolean_3003)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeNumber_3011)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeDateTime_3012)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeInteger_3013)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeLocalText_3014)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeCharacter_3015)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeFloat_3016)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeEnumeration_3017)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
      if (type == RunwayElementTypes.MdAttributeHash_3018)
      {
        return getChildBySemanticHint(RunwayVisualIDRegistry.getType(MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID));
      }
    }
    return super.getTargetEditPart(request);
  }

  /**
   * @generated
   */
  public class MDBusinessFigure extends RectangleFigure
  {

    /**
     * @generated
     */
    private WrappingLabel fFigureMDBusinessClassNameFigure;

    /**
     * @generated
     */
    public MDBusinessFigure()
    {

      FlowLayout layoutThis = new FlowLayout();
      layoutThis.setStretchMinorAxis(false);
      layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

      layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
      layoutThis.setMajorSpacing(5);
      layoutThis.setMinorSpacing(5);
      layoutThis.setHorizontal(true);

      this.setLayoutManager(layoutThis);

      createContents();
    }

    /**
     * @generated
     */
    private void createContents()
    {

      fFigureMDBusinessClassNameFigure = new WrappingLabel();

      fFigureMDBusinessClassNameFigure.setText("<...>");

      this.add(fFigureMDBusinessClassNameFigure);

    }

    /**
     * @generated
     */
    public WrappingLabel getFigureMDBusinessClassNameFigure()
    {
      return fFigureMDBusinessClassNameFigure;
    }

  }

}
