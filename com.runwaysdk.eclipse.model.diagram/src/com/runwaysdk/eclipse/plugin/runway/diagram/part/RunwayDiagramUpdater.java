package com.runwaysdk.eclipse.plugin.runway.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import com.runwaysdk.eclipse.model.runway.DocumentRoot;
import com.runwaysdk.eclipse.model.runway.MDAttribute;
import com.runwaysdk.eclipse.model.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.DocumentRootEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessMdBusinessCompartmentEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeBlobEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeBooleanEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeCharacterEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDateEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDateTimeEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDecimalEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDoubleEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeEnumerationEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeFloatEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeHashEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeIntegerEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLocalCharacterEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLocalTextEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLongEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeNumberEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeTextEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeTimeEditPart;

/**
 * @generated
 */
public class RunwayDiagramUpdater
{

  /**
   * @generated
   */
  public static List<RunwayNodeDescriptor> getSemanticChildren(View view)
  {
    switch (RunwayVisualIDRegistry.getVisualID(view))
    {
      case DocumentRootEditPart.VISUAL_ID:
        return getDocumentRoot_1000SemanticChildren(view);
      case MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID:
        return getMDBusinessMdBusinessCompartment_7001SemanticChildren(view);
    }
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayNodeDescriptor> getDocumentRoot_1000SemanticChildren(View view)
  {
    if (!view.isSetElement())
    {
      return Collections.emptyList();
    }
    DocumentRoot modelElement = (DocumentRoot) view.getElement();
    LinkedList<RunwayNodeDescriptor> result = new LinkedList<RunwayNodeDescriptor>();
    for (Iterator<?> it = modelElement.getMdBusinesses().iterator(); it.hasNext();)
    {
      MDBusiness childElement = (MDBusiness) it.next();
      int visualID = RunwayVisualIDRegistry.getNodeVisualID(view, childElement);
      if (visualID == MDBusinessEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
    }
    return result;
  }

  /**
   * @generated
   */
  public static List<RunwayNodeDescriptor> getMDBusinessMdBusinessCompartment_7001SemanticChildren(View view)
  {
    if (false == view.eContainer() instanceof View)
    {
      return Collections.emptyList();
    }
    View containerView = (View) view.eContainer();
    if (!containerView.isSetElement())
    {
      return Collections.emptyList();
    }
    MDBusiness modelElement = (MDBusiness) containerView.getElement();
    LinkedList<RunwayNodeDescriptor> result = new LinkedList<RunwayNodeDescriptor>();
    for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();)
    {
      MDAttribute childElement = (MDAttribute) it.next();
      int visualID = RunwayVisualIDRegistry.getNodeVisualID(view, childElement);
      if (visualID == MdAttributeTextEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeDateEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeBlobEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeLocalCharacterEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeDoubleEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeDecimalEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeLongEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeTimeEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeBooleanEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeNumberEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeDateTimeEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeIntegerEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeLocalTextEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeCharacterEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeFloatEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeEnumerationEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MdAttributeHashEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
    }
    return result;
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getContainedLinks(View view)
  {
    switch (RunwayVisualIDRegistry.getVisualID(view))
    {
      case DocumentRootEditPart.VISUAL_ID:
        return getDocumentRoot_1000ContainedLinks(view);
      case MDBusinessEditPart.VISUAL_ID:
        return getMDBusiness_2001ContainedLinks(view);
      case MdAttributeTextEditPart.VISUAL_ID:
        return getMdAttributeText_3004ContainedLinks(view);
      case MdAttributeDateEditPart.VISUAL_ID:
        return getMdAttributeDate_3005ContainedLinks(view);
      case MdAttributeBlobEditPart.VISUAL_ID:
        return getMdAttributeBlob_3002ContainedLinks(view);
      case MdAttributeLocalCharacterEditPart.VISUAL_ID:
        return getMdAttributeLocalCharacter_3006ContainedLinks(view);
      case MdAttributeDoubleEditPart.VISUAL_ID:
        return getMdAttributeDouble_3007ContainedLinks(view);
      case MdAttributeDecimalEditPart.VISUAL_ID:
        return getMdAttributeDecimal_3008ContainedLinks(view);
      case MdAttributeLongEditPart.VISUAL_ID:
        return getMdAttributeLong_3009ContainedLinks(view);
      case MdAttributeTimeEditPart.VISUAL_ID:
        return getMdAttributeTime_3010ContainedLinks(view);
      case MdAttributeBooleanEditPart.VISUAL_ID:
        return getMdAttributeBoolean_3003ContainedLinks(view);
      case MdAttributeNumberEditPart.VISUAL_ID:
        return getMdAttributeNumber_3011ContainedLinks(view);
      case MdAttributeDateTimeEditPart.VISUAL_ID:
        return getMdAttributeDateTime_3012ContainedLinks(view);
      case MdAttributeIntegerEditPart.VISUAL_ID:
        return getMdAttributeInteger_3013ContainedLinks(view);
      case MdAttributeLocalTextEditPart.VISUAL_ID:
        return getMdAttributeLocalText_3014ContainedLinks(view);
      case MdAttributeCharacterEditPart.VISUAL_ID:
        return getMdAttributeCharacter_3015ContainedLinks(view);
      case MdAttributeFloatEditPart.VISUAL_ID:
        return getMdAttributeFloat_3016ContainedLinks(view);
      case MdAttributeEnumerationEditPart.VISUAL_ID:
        return getMdAttributeEnumeration_3017ContainedLinks(view);
      case MdAttributeHashEditPart.VISUAL_ID:
        return getMdAttributeHash_3018ContainedLinks(view);
    }
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getIncomingLinks(View view)
  {
    switch (RunwayVisualIDRegistry.getVisualID(view))
    {
      case MDBusinessEditPart.VISUAL_ID:
        return getMDBusiness_2001IncomingLinks(view);
      case MdAttributeTextEditPart.VISUAL_ID:
        return getMdAttributeText_3004IncomingLinks(view);
      case MdAttributeDateEditPart.VISUAL_ID:
        return getMdAttributeDate_3005IncomingLinks(view);
      case MdAttributeBlobEditPart.VISUAL_ID:
        return getMdAttributeBlob_3002IncomingLinks(view);
      case MdAttributeLocalCharacterEditPart.VISUAL_ID:
        return getMdAttributeLocalCharacter_3006IncomingLinks(view);
      case MdAttributeDoubleEditPart.VISUAL_ID:
        return getMdAttributeDouble_3007IncomingLinks(view);
      case MdAttributeDecimalEditPart.VISUAL_ID:
        return getMdAttributeDecimal_3008IncomingLinks(view);
      case MdAttributeLongEditPart.VISUAL_ID:
        return getMdAttributeLong_3009IncomingLinks(view);
      case MdAttributeTimeEditPart.VISUAL_ID:
        return getMdAttributeTime_3010IncomingLinks(view);
      case MdAttributeBooleanEditPart.VISUAL_ID:
        return getMdAttributeBoolean_3003IncomingLinks(view);
      case MdAttributeNumberEditPart.VISUAL_ID:
        return getMdAttributeNumber_3011IncomingLinks(view);
      case MdAttributeDateTimeEditPart.VISUAL_ID:
        return getMdAttributeDateTime_3012IncomingLinks(view);
      case MdAttributeIntegerEditPart.VISUAL_ID:
        return getMdAttributeInteger_3013IncomingLinks(view);
      case MdAttributeLocalTextEditPart.VISUAL_ID:
        return getMdAttributeLocalText_3014IncomingLinks(view);
      case MdAttributeCharacterEditPart.VISUAL_ID:
        return getMdAttributeCharacter_3015IncomingLinks(view);
      case MdAttributeFloatEditPart.VISUAL_ID:
        return getMdAttributeFloat_3016IncomingLinks(view);
      case MdAttributeEnumerationEditPart.VISUAL_ID:
        return getMdAttributeEnumeration_3017IncomingLinks(view);
      case MdAttributeHashEditPart.VISUAL_ID:
        return getMdAttributeHash_3018IncomingLinks(view);
    }
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getOutgoingLinks(View view)
  {
    switch (RunwayVisualIDRegistry.getVisualID(view))
    {
      case MDBusinessEditPart.VISUAL_ID:
        return getMDBusiness_2001OutgoingLinks(view);
      case MdAttributeTextEditPart.VISUAL_ID:
        return getMdAttributeText_3004OutgoingLinks(view);
      case MdAttributeDateEditPart.VISUAL_ID:
        return getMdAttributeDate_3005OutgoingLinks(view);
      case MdAttributeBlobEditPart.VISUAL_ID:
        return getMdAttributeBlob_3002OutgoingLinks(view);
      case MdAttributeLocalCharacterEditPart.VISUAL_ID:
        return getMdAttributeLocalCharacter_3006OutgoingLinks(view);
      case MdAttributeDoubleEditPart.VISUAL_ID:
        return getMdAttributeDouble_3007OutgoingLinks(view);
      case MdAttributeDecimalEditPart.VISUAL_ID:
        return getMdAttributeDecimal_3008OutgoingLinks(view);
      case MdAttributeLongEditPart.VISUAL_ID:
        return getMdAttributeLong_3009OutgoingLinks(view);
      case MdAttributeTimeEditPart.VISUAL_ID:
        return getMdAttributeTime_3010OutgoingLinks(view);
      case MdAttributeBooleanEditPart.VISUAL_ID:
        return getMdAttributeBoolean_3003OutgoingLinks(view);
      case MdAttributeNumberEditPart.VISUAL_ID:
        return getMdAttributeNumber_3011OutgoingLinks(view);
      case MdAttributeDateTimeEditPart.VISUAL_ID:
        return getMdAttributeDateTime_3012OutgoingLinks(view);
      case MdAttributeIntegerEditPart.VISUAL_ID:
        return getMdAttributeInteger_3013OutgoingLinks(view);
      case MdAttributeLocalTextEditPart.VISUAL_ID:
        return getMdAttributeLocalText_3014OutgoingLinks(view);
      case MdAttributeCharacterEditPart.VISUAL_ID:
        return getMdAttributeCharacter_3015OutgoingLinks(view);
      case MdAttributeFloatEditPart.VISUAL_ID:
        return getMdAttributeFloat_3016OutgoingLinks(view);
      case MdAttributeEnumerationEditPart.VISUAL_ID:
        return getMdAttributeEnumeration_3017OutgoingLinks(view);
      case MdAttributeHashEditPart.VISUAL_ID:
        return getMdAttributeHash_3018OutgoingLinks(view);
    }
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getDocumentRoot_1000ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDBusiness_2001ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeText_3004ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeDate_3005ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeBlob_3002ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeLocalCharacter_3006ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeDouble_3007ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeDecimal_3008ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeLong_3009ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeTime_3010ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeBoolean_3003ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeNumber_3011ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeDateTime_3012ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeInteger_3013ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeLocalText_3014ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeCharacter_3015ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeFloat_3016ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeEnumeration_3017ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeHash_3018ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDBusiness_2001IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeText_3004IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeDate_3005IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeBlob_3002IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeLocalCharacter_3006IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeDouble_3007IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeDecimal_3008IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeLong_3009IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeTime_3010IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeBoolean_3003IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeNumber_3011IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeDateTime_3012IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeInteger_3013IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeLocalText_3014IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeCharacter_3015IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeFloat_3016IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeEnumeration_3017IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeHash_3018IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDBusiness_2001OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeText_3004OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeDate_3005OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeBlob_3002OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeLocalCharacter_3006OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeDouble_3007OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeDecimal_3008OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeLong_3009OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeTime_3010OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeBoolean_3003OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeNumber_3011OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeDateTime_3012OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeInteger_3013OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeLocalText_3014OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeCharacter_3015OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeFloat_3016OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeEnumeration_3017OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMdAttributeHash_3018OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater()
                                                    {
                                                      /**
                                                       * @generated
                                                       */
                                                      @Override
                                                      public List<RunwayNodeDescriptor> getSemanticChildren(View view)
                                                      {
                                                        return RunwayDiagramUpdater.getSemanticChildren(view);
                                                      }

                                                      /**
                                                       * @generated
                                                       */
                                                      @Override
                                                      public List<RunwayLinkDescriptor> getContainedLinks(View view)
                                                      {
                                                        return RunwayDiagramUpdater.getContainedLinks(view);
                                                      }

                                                      /**
                                                       * @generated
                                                       */
                                                      @Override
                                                      public List<RunwayLinkDescriptor> getIncomingLinks(View view)
                                                      {
                                                        return RunwayDiagramUpdater.getIncomingLinks(view);
                                                      }

                                                      /**
                                                       * @generated
                                                       */
                                                      @Override
                                                      public List<RunwayLinkDescriptor> getOutgoingLinks(View view)
                                                      {
                                                        return RunwayDiagramUpdater.getOutgoingLinks(view);
                                                      }
                                                    };

}
