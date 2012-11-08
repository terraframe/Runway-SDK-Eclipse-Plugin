package com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry;

/**
 * @generated
 */
public class RunwayEditPartFactory implements EditPartFactory
{

  /**
   * @generated
   */
  public EditPart createEditPart(EditPart context, Object model)
  {
    if (model instanceof View)
    {
      View view = (View) model;
      switch (RunwayVisualIDRegistry.getVisualID(view))
      {

        case DocumentRootEditPart.VISUAL_ID:
          return new DocumentRootEditPart(view);

        case MDBusinessEditPart.VISUAL_ID:
          return new MDBusinessEditPart(view);

        case MDBusinessClassNameEditPart.VISUAL_ID:
          return new MDBusinessClassNameEditPart(view);

        case MdAttributeTextEditPart.VISUAL_ID:
          return new MdAttributeTextEditPart(view);

        case MdAttributeTextNameEditPart.VISUAL_ID:
          return new MdAttributeTextNameEditPart(view);

        case MdAttributeDateEditPart.VISUAL_ID:
          return new MdAttributeDateEditPart(view);

        case MdAttributeDateNameEditPart.VISUAL_ID:
          return new MdAttributeDateNameEditPart(view);

        case MdAttributeBlobEditPart.VISUAL_ID:
          return new MdAttributeBlobEditPart(view);

        case MdAttributeBlobNameEditPart.VISUAL_ID:
          return new MdAttributeBlobNameEditPart(view);

        case MdAttributeLocalCharacterEditPart.VISUAL_ID:
          return new MdAttributeLocalCharacterEditPart(view);

        case MdAttributeLocalCharacterNameEditPart.VISUAL_ID:
          return new MdAttributeLocalCharacterNameEditPart(view);

        case MdAttributeDoubleEditPart.VISUAL_ID:
          return new MdAttributeDoubleEditPart(view);

        case MdAttributeDoubleNameEditPart.VISUAL_ID:
          return new MdAttributeDoubleNameEditPart(view);

        case MdAttributeDecimalEditPart.VISUAL_ID:
          return new MdAttributeDecimalEditPart(view);

        case MdAttributeDecimalNameEditPart.VISUAL_ID:
          return new MdAttributeDecimalNameEditPart(view);

        case MdAttributeLongEditPart.VISUAL_ID:
          return new MdAttributeLongEditPart(view);

        case MdAttributeLongNameEditPart.VISUAL_ID:
          return new MdAttributeLongNameEditPart(view);

        case MdAttributeTimeEditPart.VISUAL_ID:
          return new MdAttributeTimeEditPart(view);

        case MdAttributeTimeNameEditPart.VISUAL_ID:
          return new MdAttributeTimeNameEditPart(view);

        case MdAttributeBooleanEditPart.VISUAL_ID:
          return new MdAttributeBooleanEditPart(view);

        case MdAttributeBooleanNameEditPart.VISUAL_ID:
          return new MdAttributeBooleanNameEditPart(view);

        case MdAttributeNumberEditPart.VISUAL_ID:
          return new MdAttributeNumberEditPart(view);

        case MdAttributeNumberNameEditPart.VISUAL_ID:
          return new MdAttributeNumberNameEditPart(view);

        case MdAttributeDateTimeEditPart.VISUAL_ID:
          return new MdAttributeDateTimeEditPart(view);

        case MdAttributeDateTimeNameEditPart.VISUAL_ID:
          return new MdAttributeDateTimeNameEditPart(view);

        case MdAttributeIntegerEditPart.VISUAL_ID:
          return new MdAttributeIntegerEditPart(view);

        case MdAttributeIntegerNameEditPart.VISUAL_ID:
          return new MdAttributeIntegerNameEditPart(view);

        case MdAttributeLocalTextEditPart.VISUAL_ID:
          return new MdAttributeLocalTextEditPart(view);

        case MdAttributeLocalTextNameEditPart.VISUAL_ID:
          return new MdAttributeLocalTextNameEditPart(view);

        case MdAttributeCharacterEditPart.VISUAL_ID:
          return new MdAttributeCharacterEditPart(view);

        case MdAttributeCharacterNameEditPart.VISUAL_ID:
          return new MdAttributeCharacterNameEditPart(view);

        case MdAttributeFloatEditPart.VISUAL_ID:
          return new MdAttributeFloatEditPart(view);

        case MdAttributeFloatNameEditPart.VISUAL_ID:
          return new MdAttributeFloatNameEditPart(view);

        case MdAttributeEnumerationEditPart.VISUAL_ID:
          return new MdAttributeEnumerationEditPart(view);

        case MdAttributeEnumerationNameEditPart.VISUAL_ID:
          return new MdAttributeEnumerationNameEditPart(view);

        case MdAttributeHashEditPart.VISUAL_ID:
          return new MdAttributeHashEditPart(view);

        case MdAttributeHashNameEditPart.VISUAL_ID:
          return new MdAttributeHashNameEditPart(view);

        case MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID:
          return new MDBusinessMdBusinessCompartmentEditPart(view);
      }
    }
    return createUnrecognizedEditPart(context, model);
  }

  /**
   * @generated
   */
  private EditPart createUnrecognizedEditPart(EditPart context, Object model)
  {
    // Handle creation of unrecognized child node EditParts here
    return null;
  }

  /**
   * @generated
   */
  public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source)
  {
    return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
  }

}
