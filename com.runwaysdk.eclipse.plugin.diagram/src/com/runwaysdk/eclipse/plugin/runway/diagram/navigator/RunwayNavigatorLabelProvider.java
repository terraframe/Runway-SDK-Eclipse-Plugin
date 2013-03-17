package com.runwaysdk.eclipse.plugin.runway.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.DocumentRootEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeBlobEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeBlobNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeBooleanEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeBooleanNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeCharacterEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeCharacterNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDateEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDateNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDateTimeEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDateTimeNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDecimalEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDecimalNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDoubleEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDoubleNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeEnumerationEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeEnumerationNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeFloatEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeFloatNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeHashEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeHashNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeIntegerEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeIntegerNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLocalCharacterEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLocalCharacterNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLocalTextEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLocalTextNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLongEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLongNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeNumberEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeNumberNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeTextEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeTextNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeTimeEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeTimeNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry;
import com.runwaysdk.eclipse.plugin.runway.diagram.providers.RunwayElementTypes;
import com.runwaysdk.eclipse.plugin.runway.diagram.providers.RunwayParserProvider;

/**
 * @generated
 */
public class RunwayNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RunwayDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RunwayDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RunwayNavigatorItem
				&& !isOwnView(((RunwayNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof RunwayNavigatorGroup) {
			RunwayNavigatorGroup group = (RunwayNavigatorGroup) element;
			return RunwayDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof RunwayNavigatorItem) {
			RunwayNavigatorItem navigatorItem = (RunwayNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (RunwayVisualIDRegistry.getVisualID(view)) {
		case DocumentRootEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?runway?DocumentRoot", RunwayElementTypes.DocumentRoot_1000); //$NON-NLS-1$
		case MDBusinessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?runway?MDBusiness", RunwayElementTypes.MDBusiness_2003); //$NON-NLS-1$
		case MDAttributeTextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeText", RunwayElementTypes.MDAttributeText_3036); //$NON-NLS-1$
		case MDAttributeDateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeDate", RunwayElementTypes.MDAttributeDate_3037); //$NON-NLS-1$
		case MDAttributeBlobEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeBlob", RunwayElementTypes.MDAttributeBlob_3038); //$NON-NLS-1$
		case MDAttributeLocalCharacterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeLocalCharacter", RunwayElementTypes.MDAttributeLocalCharacter_3039); //$NON-NLS-1$
		case MDAttributeDoubleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeDouble", RunwayElementTypes.MDAttributeDouble_3040); //$NON-NLS-1$
		case MDAttributeDecimalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeDecimal", RunwayElementTypes.MDAttributeDecimal_3041); //$NON-NLS-1$
		case MDAttributeLongEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeLong", RunwayElementTypes.MDAttributeLong_3042); //$NON-NLS-1$
		case MDAttributeTimeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeTime", RunwayElementTypes.MDAttributeTime_3043); //$NON-NLS-1$
		case MDAttributeBooleanEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeBoolean", RunwayElementTypes.MDAttributeBoolean_3044); //$NON-NLS-1$
		case MDAttributeNumberEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeNumber", RunwayElementTypes.MDAttributeNumber_3045); //$NON-NLS-1$
		case MDAttributeDateTimeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeDateTime", RunwayElementTypes.MDAttributeDateTime_3046); //$NON-NLS-1$
		case MDAttributeIntegerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeInteger", RunwayElementTypes.MDAttributeInteger_3047); //$NON-NLS-1$
		case MDAttributeLocalTextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeLocalText", RunwayElementTypes.MDAttributeLocalText_3048); //$NON-NLS-1$
		case MDAttributeCharacterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeCharacter", RunwayElementTypes.MDAttributeCharacter_3049); //$NON-NLS-1$
		case MDAttributeFloatEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeFloat", RunwayElementTypes.MDAttributeFloat_3050); //$NON-NLS-1$
		case MDAttributeEnumerationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeEnumeration", RunwayElementTypes.MDAttributeEnumeration_3051); //$NON-NLS-1$
		case MDAttributeHashEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?runway?MDAttributeHash", RunwayElementTypes.MDAttributeHash_3052); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RunwayDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& RunwayElementTypes.isKnownElementType(elementType)) {
			image = RunwayElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof RunwayNavigatorGroup) {
			RunwayNavigatorGroup group = (RunwayNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RunwayNavigatorItem) {
			RunwayNavigatorItem navigatorItem = (RunwayNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (RunwayVisualIDRegistry.getVisualID(view)) {
		case DocumentRootEditPart.VISUAL_ID:
			return getDocumentRoot_1000Text(view);
		case MDBusinessEditPart.VISUAL_ID:
			return getMDBusiness_2003Text(view);
		case MDAttributeTextEditPart.VISUAL_ID:
			return getMDAttributeText_3036Text(view);
		case MDAttributeDateEditPart.VISUAL_ID:
			return getMDAttributeDate_3037Text(view);
		case MDAttributeBlobEditPart.VISUAL_ID:
			return getMDAttributeBlob_3038Text(view);
		case MDAttributeLocalCharacterEditPart.VISUAL_ID:
			return getMDAttributeLocalCharacter_3039Text(view);
		case MDAttributeDoubleEditPart.VISUAL_ID:
			return getMDAttributeDouble_3040Text(view);
		case MDAttributeDecimalEditPart.VISUAL_ID:
			return getMDAttributeDecimal_3041Text(view);
		case MDAttributeLongEditPart.VISUAL_ID:
			return getMDAttributeLong_3042Text(view);
		case MDAttributeTimeEditPart.VISUAL_ID:
			return getMDAttributeTime_3043Text(view);
		case MDAttributeBooleanEditPart.VISUAL_ID:
			return getMDAttributeBoolean_3044Text(view);
		case MDAttributeNumberEditPart.VISUAL_ID:
			return getMDAttributeNumber_3045Text(view);
		case MDAttributeDateTimeEditPart.VISUAL_ID:
			return getMDAttributeDateTime_3046Text(view);
		case MDAttributeIntegerEditPart.VISUAL_ID:
			return getMDAttributeInteger_3047Text(view);
		case MDAttributeLocalTextEditPart.VISUAL_ID:
			return getMDAttributeLocalText_3048Text(view);
		case MDAttributeCharacterEditPart.VISUAL_ID:
			return getMDAttributeCharacter_3049Text(view);
		case MDAttributeFloatEditPart.VISUAL_ID:
			return getMDAttributeFloat_3050Text(view);
		case MDAttributeEnumerationEditPart.VISUAL_ID:
			return getMDAttributeEnumeration_3051Text(view);
		case MDAttributeHashEditPart.VISUAL_ID:
			return getMDAttributeHash_3052Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDocumentRoot_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMDBusiness_2003Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDBusiness_2003,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDBusinessNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeText_3036Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeText_3036,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeTextNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeDate_3037Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeDate_3037,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeDateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeBlob_3038Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeBlob_3038,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeBlobNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeLocalCharacter_3039Text(View view) {
		IParser parser = RunwayParserProvider
				.getParser(
						RunwayElementTypes.MDAttributeLocalCharacter_3039,
						view.getElement() != null ? view.getElement() : view,
						RunwayVisualIDRegistry
								.getType(MDAttributeLocalCharacterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeDouble_3040Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeDouble_3040,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeDoubleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeDecimal_3041Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeDecimal_3041,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeDecimalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeLong_3042Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeLong_3042,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeLongNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeTime_3043Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeTime_3043,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeTimeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeBoolean_3044Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeBoolean_3044,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeBooleanNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeNumber_3045Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeNumber_3045,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeNumberNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeDateTime_3046Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeDateTime_3046,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeDateTimeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeInteger_3047Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeInteger_3047,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeIntegerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeLocalText_3048Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeLocalText_3048,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeLocalTextNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeCharacter_3049Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeCharacter_3049,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeCharacterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeFloat_3050Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeFloat_3050,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeFloatNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeEnumeration_3051Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeEnumeration_3051, view
						.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeEnumerationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMDAttributeHash_3052Text(View view) {
		IParser parser = RunwayParserProvider.getParser(
				RunwayElementTypes.MDAttributeHash_3052,
				view.getElement() != null ? view.getElement() : view,
				RunwayVisualIDRegistry
						.getType(MDAttributeHashNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RunwayDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DocumentRootEditPart.MODEL_ID.equals(RunwayVisualIDRegistry
				.getModelID(view));
	}

}
