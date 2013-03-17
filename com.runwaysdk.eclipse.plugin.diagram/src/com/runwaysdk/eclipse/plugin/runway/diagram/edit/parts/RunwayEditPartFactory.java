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
public class RunwayEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (RunwayVisualIDRegistry.getVisualID(view)) {

			case DocumentRootEditPart.VISUAL_ID:
				return new DocumentRootEditPart(view);

			case MDBusinessEditPart.VISUAL_ID:
				return new MDBusinessEditPart(view);

			case MDBusinessNameEditPart.VISUAL_ID:
				return new MDBusinessNameEditPart(view);

			case MDAttributeTextEditPart.VISUAL_ID:
				return new MDAttributeTextEditPart(view);

			case MDAttributeTextNameEditPart.VISUAL_ID:
				return new MDAttributeTextNameEditPart(view);

			case MDAttributeDateEditPart.VISUAL_ID:
				return new MDAttributeDateEditPart(view);

			case MDAttributeDateNameEditPart.VISUAL_ID:
				return new MDAttributeDateNameEditPart(view);

			case MDAttributeBlobEditPart.VISUAL_ID:
				return new MDAttributeBlobEditPart(view);

			case MDAttributeBlobNameEditPart.VISUAL_ID:
				return new MDAttributeBlobNameEditPart(view);

			case MDAttributeLocalCharacterEditPart.VISUAL_ID:
				return new MDAttributeLocalCharacterEditPart(view);

			case MDAttributeLocalCharacterNameEditPart.VISUAL_ID:
				return new MDAttributeLocalCharacterNameEditPart(view);

			case MDAttributeDoubleEditPart.VISUAL_ID:
				return new MDAttributeDoubleEditPart(view);

			case MDAttributeDoubleNameEditPart.VISUAL_ID:
				return new MDAttributeDoubleNameEditPart(view);

			case MDAttributeDecimalEditPart.VISUAL_ID:
				return new MDAttributeDecimalEditPart(view);

			case MDAttributeDecimalNameEditPart.VISUAL_ID:
				return new MDAttributeDecimalNameEditPart(view);

			case MDAttributeLongEditPart.VISUAL_ID:
				return new MDAttributeLongEditPart(view);

			case MDAttributeLongNameEditPart.VISUAL_ID:
				return new MDAttributeLongNameEditPart(view);

			case MDAttributeTimeEditPart.VISUAL_ID:
				return new MDAttributeTimeEditPart(view);

			case MDAttributeTimeNameEditPart.VISUAL_ID:
				return new MDAttributeTimeNameEditPart(view);

			case MDAttributeBooleanEditPart.VISUAL_ID:
				return new MDAttributeBooleanEditPart(view);

			case MDAttributeBooleanNameEditPart.VISUAL_ID:
				return new MDAttributeBooleanNameEditPart(view);

			case MDAttributeNumberEditPart.VISUAL_ID:
				return new MDAttributeNumberEditPart(view);

			case MDAttributeNumberNameEditPart.VISUAL_ID:
				return new MDAttributeNumberNameEditPart(view);

			case MDAttributeDateTimeEditPart.VISUAL_ID:
				return new MDAttributeDateTimeEditPart(view);

			case MDAttributeDateTimeNameEditPart.VISUAL_ID:
				return new MDAttributeDateTimeNameEditPart(view);

			case MDAttributeIntegerEditPart.VISUAL_ID:
				return new MDAttributeIntegerEditPart(view);

			case MDAttributeIntegerNameEditPart.VISUAL_ID:
				return new MDAttributeIntegerNameEditPart(view);

			case MDAttributeLocalTextEditPart.VISUAL_ID:
				return new MDAttributeLocalTextEditPart(view);

			case MDAttributeLocalTextNameEditPart.VISUAL_ID:
				return new MDAttributeLocalTextNameEditPart(view);

			case MDAttributeCharacterEditPart.VISUAL_ID:
				return new MDAttributeCharacterEditPart(view);

			case MDAttributeCharacterNameEditPart.VISUAL_ID:
				return new MDAttributeCharacterNameEditPart(view);

			case MDAttributeFloatEditPart.VISUAL_ID:
				return new MDAttributeFloatEditPart(view);

			case MDAttributeFloatNameEditPart.VISUAL_ID:
				return new MDAttributeFloatNameEditPart(view);

			case MDAttributeEnumerationEditPart.VISUAL_ID:
				return new MDAttributeEnumerationEditPart(view);

			case MDAttributeEnumerationNameEditPart.VISUAL_ID:
				return new MDAttributeEnumerationNameEditPart(view);

			case MDAttributeHashEditPart.VISUAL_ID:
				return new MDAttributeHashEditPart(view);

			case MDAttributeHashNameEditPart.VISUAL_ID:
				return new MDAttributeHashNameEditPart(view);

			case MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID:
				return new MDBusinessMdBusinessCompartmentEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
