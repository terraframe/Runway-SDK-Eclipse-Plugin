package com.runwaysdk.eclipse.plugin.runway.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import com.runwaysdk.eclipse.plugin.runway.DocumentRoot;
import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.MetaData;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.DocumentRootEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeBlobEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeBooleanEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeCharacterEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDateEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDateTimeEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDecimalEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeDoubleEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeEnumerationEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeFloatEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeHashEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeIntegerEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLocalCharacterEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLocalTextEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeLongEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeNumberEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeTextEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDAttributeTimeEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessMdBusinessCompartmentEditPart;

/**
 * @generated
 */
public class RunwayDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<RunwayNodeDescriptor> getSemanticChildren(View view) {
		switch (RunwayVisualIDRegistry.getVisualID(view)) {
		case DocumentRootEditPart.VISUAL_ID:
			return getDocumentRoot_1000SemanticChildren(view);
		case MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID:
			return getMDBusinessMdBusinessCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayNodeDescriptor> getDocumentRoot_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DocumentRoot modelElement = (DocumentRoot) view.getElement();
		LinkedList<RunwayNodeDescriptor> result = new LinkedList<RunwayNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMetaData().iterator(); it
				.hasNext();) {
			MetaData childElement = (MetaData) it.next();
			int visualID = RunwayVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MDBusinessEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RunwayNodeDescriptor> getMDBusinessMdBusinessCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MDBusiness modelElement = (MDBusiness) containerView.getElement();
		LinkedList<RunwayNodeDescriptor> result = new LinkedList<RunwayNodeDescriptor>();
		{
			MDAttribute childElement = modelElement.getAttributes();
			int visualID = RunwayVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MDAttributeTextEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeDateEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeBlobEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeLocalCharacterEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeDoubleEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeDecimalEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeLongEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeTimeEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeBooleanEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeNumberEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeDateTimeEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeIntegerEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeLocalTextEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeCharacterEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeFloatEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeEnumerationEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
			if (visualID == MDAttributeHashEditPart.VISUAL_ID) {
				result.add(new RunwayNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getContainedLinks(View view) {
		switch (RunwayVisualIDRegistry.getVisualID(view)) {
		case DocumentRootEditPart.VISUAL_ID:
			return getDocumentRoot_1000ContainedLinks(view);
		case MDBusinessEditPart.VISUAL_ID:
			return getMDBusiness_2003ContainedLinks(view);
		case MDAttributeTextEditPart.VISUAL_ID:
			return getMDAttributeText_3036ContainedLinks(view);
		case MDAttributeDateEditPart.VISUAL_ID:
			return getMDAttributeDate_3037ContainedLinks(view);
		case MDAttributeBlobEditPart.VISUAL_ID:
			return getMDAttributeBlob_3038ContainedLinks(view);
		case MDAttributeLocalCharacterEditPart.VISUAL_ID:
			return getMDAttributeLocalCharacter_3039ContainedLinks(view);
		case MDAttributeDoubleEditPart.VISUAL_ID:
			return getMDAttributeDouble_3040ContainedLinks(view);
		case MDAttributeDecimalEditPart.VISUAL_ID:
			return getMDAttributeDecimal_3041ContainedLinks(view);
		case MDAttributeLongEditPart.VISUAL_ID:
			return getMDAttributeLong_3042ContainedLinks(view);
		case MDAttributeTimeEditPart.VISUAL_ID:
			return getMDAttributeTime_3043ContainedLinks(view);
		case MDAttributeBooleanEditPart.VISUAL_ID:
			return getMDAttributeBoolean_3044ContainedLinks(view);
		case MDAttributeNumberEditPart.VISUAL_ID:
			return getMDAttributeNumber_3045ContainedLinks(view);
		case MDAttributeDateTimeEditPart.VISUAL_ID:
			return getMDAttributeDateTime_3046ContainedLinks(view);
		case MDAttributeIntegerEditPart.VISUAL_ID:
			return getMDAttributeInteger_3047ContainedLinks(view);
		case MDAttributeLocalTextEditPart.VISUAL_ID:
			return getMDAttributeLocalText_3048ContainedLinks(view);
		case MDAttributeCharacterEditPart.VISUAL_ID:
			return getMDAttributeCharacter_3049ContainedLinks(view);
		case MDAttributeFloatEditPart.VISUAL_ID:
			return getMDAttributeFloat_3050ContainedLinks(view);
		case MDAttributeEnumerationEditPart.VISUAL_ID:
			return getMDAttributeEnumeration_3051ContainedLinks(view);
		case MDAttributeHashEditPart.VISUAL_ID:
			return getMDAttributeHash_3052ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getIncomingLinks(View view) {
		switch (RunwayVisualIDRegistry.getVisualID(view)) {
		case MDBusinessEditPart.VISUAL_ID:
			return getMDBusiness_2003IncomingLinks(view);
		case MDAttributeTextEditPart.VISUAL_ID:
			return getMDAttributeText_3036IncomingLinks(view);
		case MDAttributeDateEditPart.VISUAL_ID:
			return getMDAttributeDate_3037IncomingLinks(view);
		case MDAttributeBlobEditPart.VISUAL_ID:
			return getMDAttributeBlob_3038IncomingLinks(view);
		case MDAttributeLocalCharacterEditPart.VISUAL_ID:
			return getMDAttributeLocalCharacter_3039IncomingLinks(view);
		case MDAttributeDoubleEditPart.VISUAL_ID:
			return getMDAttributeDouble_3040IncomingLinks(view);
		case MDAttributeDecimalEditPart.VISUAL_ID:
			return getMDAttributeDecimal_3041IncomingLinks(view);
		case MDAttributeLongEditPart.VISUAL_ID:
			return getMDAttributeLong_3042IncomingLinks(view);
		case MDAttributeTimeEditPart.VISUAL_ID:
			return getMDAttributeTime_3043IncomingLinks(view);
		case MDAttributeBooleanEditPart.VISUAL_ID:
			return getMDAttributeBoolean_3044IncomingLinks(view);
		case MDAttributeNumberEditPart.VISUAL_ID:
			return getMDAttributeNumber_3045IncomingLinks(view);
		case MDAttributeDateTimeEditPart.VISUAL_ID:
			return getMDAttributeDateTime_3046IncomingLinks(view);
		case MDAttributeIntegerEditPart.VISUAL_ID:
			return getMDAttributeInteger_3047IncomingLinks(view);
		case MDAttributeLocalTextEditPart.VISUAL_ID:
			return getMDAttributeLocalText_3048IncomingLinks(view);
		case MDAttributeCharacterEditPart.VISUAL_ID:
			return getMDAttributeCharacter_3049IncomingLinks(view);
		case MDAttributeFloatEditPart.VISUAL_ID:
			return getMDAttributeFloat_3050IncomingLinks(view);
		case MDAttributeEnumerationEditPart.VISUAL_ID:
			return getMDAttributeEnumeration_3051IncomingLinks(view);
		case MDAttributeHashEditPart.VISUAL_ID:
			return getMDAttributeHash_3052IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getOutgoingLinks(View view) {
		switch (RunwayVisualIDRegistry.getVisualID(view)) {
		case MDBusinessEditPart.VISUAL_ID:
			return getMDBusiness_2003OutgoingLinks(view);
		case MDAttributeTextEditPart.VISUAL_ID:
			return getMDAttributeText_3036OutgoingLinks(view);
		case MDAttributeDateEditPart.VISUAL_ID:
			return getMDAttributeDate_3037OutgoingLinks(view);
		case MDAttributeBlobEditPart.VISUAL_ID:
			return getMDAttributeBlob_3038OutgoingLinks(view);
		case MDAttributeLocalCharacterEditPart.VISUAL_ID:
			return getMDAttributeLocalCharacter_3039OutgoingLinks(view);
		case MDAttributeDoubleEditPart.VISUAL_ID:
			return getMDAttributeDouble_3040OutgoingLinks(view);
		case MDAttributeDecimalEditPart.VISUAL_ID:
			return getMDAttributeDecimal_3041OutgoingLinks(view);
		case MDAttributeLongEditPart.VISUAL_ID:
			return getMDAttributeLong_3042OutgoingLinks(view);
		case MDAttributeTimeEditPart.VISUAL_ID:
			return getMDAttributeTime_3043OutgoingLinks(view);
		case MDAttributeBooleanEditPart.VISUAL_ID:
			return getMDAttributeBoolean_3044OutgoingLinks(view);
		case MDAttributeNumberEditPart.VISUAL_ID:
			return getMDAttributeNumber_3045OutgoingLinks(view);
		case MDAttributeDateTimeEditPart.VISUAL_ID:
			return getMDAttributeDateTime_3046OutgoingLinks(view);
		case MDAttributeIntegerEditPart.VISUAL_ID:
			return getMDAttributeInteger_3047OutgoingLinks(view);
		case MDAttributeLocalTextEditPart.VISUAL_ID:
			return getMDAttributeLocalText_3048OutgoingLinks(view);
		case MDAttributeCharacterEditPart.VISUAL_ID:
			return getMDAttributeCharacter_3049OutgoingLinks(view);
		case MDAttributeFloatEditPart.VISUAL_ID:
			return getMDAttributeFloat_3050OutgoingLinks(view);
		case MDAttributeEnumerationEditPart.VISUAL_ID:
			return getMDAttributeEnumeration_3051OutgoingLinks(view);
		case MDAttributeHashEditPart.VISUAL_ID:
			return getMDAttributeHash_3052OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getDocumentRoot_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDBusiness_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeText_3036ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeDate_3037ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeBlob_3038ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeLocalCharacter_3039ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeDouble_3040ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeDecimal_3041ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeLong_3042ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeTime_3043ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeBoolean_3044ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeNumber_3045ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeDateTime_3046ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeInteger_3047ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeLocalText_3048ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeCharacter_3049ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeFloat_3050ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeEnumeration_3051ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeHash_3052ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDBusiness_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeText_3036IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeDate_3037IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeBlob_3038IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeLocalCharacter_3039IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeDouble_3040IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeDecimal_3041IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeLong_3042IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeTime_3043IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeBoolean_3044IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeNumber_3045IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeDateTime_3046IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeInteger_3047IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeLocalText_3048IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeCharacter_3049IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeFloat_3050IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeEnumeration_3051IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeHash_3052IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDBusiness_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeText_3036OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeDate_3037OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeBlob_3038OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeLocalCharacter_3039OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeDouble_3040OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeDecimal_3041OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeLong_3042OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeTime_3043OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeBoolean_3044OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeNumber_3045OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeDateTime_3046OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeInteger_3047OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeLocalText_3048OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeCharacter_3049OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeFloat_3050OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeEnumeration_3051OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RunwayLinkDescriptor> getMDAttributeHash_3052OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<RunwayNodeDescriptor> getSemanticChildren(View view) {
			return RunwayDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RunwayLinkDescriptor> getContainedLinks(View view) {
			return RunwayDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RunwayLinkDescriptor> getIncomingLinks(View view) {
			return RunwayDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RunwayLinkDescriptor> getOutgoingLinks(View view) {
			return RunwayDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
