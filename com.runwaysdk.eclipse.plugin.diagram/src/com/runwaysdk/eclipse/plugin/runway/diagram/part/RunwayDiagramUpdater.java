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
        return getMDBusinessMdBusinessCompartment_7002SemanticChildren(view);
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
    for (Iterator<?> it = modelElement.getMDBusinesses().iterator(); it.hasNext();)
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
  public static List<RunwayNodeDescriptor> getMDBusinessMdBusinessCompartment_7002SemanticChildren(
      View view)
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
      if (visualID == MDAttributeTextEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeDateEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeBlobEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeLocalCharacterEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeDoubleEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeDecimalEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeLongEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeTimeEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeBooleanEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeNumberEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeDateTimeEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeIntegerEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeLocalTextEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeCharacterEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeFloatEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeEnumerationEditPart.VISUAL_ID)
      {
        result.add(new RunwayNodeDescriptor(childElement, visualID));
        continue;
      }
      if (visualID == MDAttributeHashEditPart.VISUAL_ID)
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
        return getMDBusiness_2002ContainedLinks(view);
      case MDAttributeTextEditPart.VISUAL_ID:
        return getMDAttributeText_3019ContainedLinks(view);
      case MDAttributeDateEditPart.VISUAL_ID:
        return getMDAttributeDate_3020ContainedLinks(view);
      case MDAttributeBlobEditPart.VISUAL_ID:
        return getMDAttributeBlob_3021ContainedLinks(view);
      case MDAttributeLocalCharacterEditPart.VISUAL_ID:
        return getMDAttributeLocalCharacter_3022ContainedLinks(view);
      case MDAttributeDoubleEditPart.VISUAL_ID:
        return getMDAttributeDouble_3023ContainedLinks(view);
      case MDAttributeDecimalEditPart.VISUAL_ID:
        return getMDAttributeDecimal_3024ContainedLinks(view);
      case MDAttributeLongEditPart.VISUAL_ID:
        return getMDAttributeLong_3025ContainedLinks(view);
      case MDAttributeTimeEditPart.VISUAL_ID:
        return getMDAttributeTime_3026ContainedLinks(view);
      case MDAttributeBooleanEditPart.VISUAL_ID:
        return getMDAttributeBoolean_3027ContainedLinks(view);
      case MDAttributeNumberEditPart.VISUAL_ID:
        return getMDAttributeNumber_3028ContainedLinks(view);
      case MDAttributeDateTimeEditPart.VISUAL_ID:
        return getMDAttributeDateTime_3029ContainedLinks(view);
      case MDAttributeIntegerEditPart.VISUAL_ID:
        return getMDAttributeInteger_3030ContainedLinks(view);
      case MDAttributeLocalTextEditPart.VISUAL_ID:
        return getMDAttributeLocalText_3031ContainedLinks(view);
      case MDAttributeCharacterEditPart.VISUAL_ID:
        return getMDAttributeCharacter_3032ContainedLinks(view);
      case MDAttributeFloatEditPart.VISUAL_ID:
        return getMDAttributeFloat_3033ContainedLinks(view);
      case MDAttributeEnumerationEditPart.VISUAL_ID:
        return getMDAttributeEnumeration_3034ContainedLinks(view);
      case MDAttributeHashEditPart.VISUAL_ID:
        return getMDAttributeHash_3035ContainedLinks(view);
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
        return getMDBusiness_2002IncomingLinks(view);
      case MDAttributeTextEditPart.VISUAL_ID:
        return getMDAttributeText_3019IncomingLinks(view);
      case MDAttributeDateEditPart.VISUAL_ID:
        return getMDAttributeDate_3020IncomingLinks(view);
      case MDAttributeBlobEditPart.VISUAL_ID:
        return getMDAttributeBlob_3021IncomingLinks(view);
      case MDAttributeLocalCharacterEditPart.VISUAL_ID:
        return getMDAttributeLocalCharacter_3022IncomingLinks(view);
      case MDAttributeDoubleEditPart.VISUAL_ID:
        return getMDAttributeDouble_3023IncomingLinks(view);
      case MDAttributeDecimalEditPart.VISUAL_ID:
        return getMDAttributeDecimal_3024IncomingLinks(view);
      case MDAttributeLongEditPart.VISUAL_ID:
        return getMDAttributeLong_3025IncomingLinks(view);
      case MDAttributeTimeEditPart.VISUAL_ID:
        return getMDAttributeTime_3026IncomingLinks(view);
      case MDAttributeBooleanEditPart.VISUAL_ID:
        return getMDAttributeBoolean_3027IncomingLinks(view);
      case MDAttributeNumberEditPart.VISUAL_ID:
        return getMDAttributeNumber_3028IncomingLinks(view);
      case MDAttributeDateTimeEditPart.VISUAL_ID:
        return getMDAttributeDateTime_3029IncomingLinks(view);
      case MDAttributeIntegerEditPart.VISUAL_ID:
        return getMDAttributeInteger_3030IncomingLinks(view);
      case MDAttributeLocalTextEditPart.VISUAL_ID:
        return getMDAttributeLocalText_3031IncomingLinks(view);
      case MDAttributeCharacterEditPart.VISUAL_ID:
        return getMDAttributeCharacter_3032IncomingLinks(view);
      case MDAttributeFloatEditPart.VISUAL_ID:
        return getMDAttributeFloat_3033IncomingLinks(view);
      case MDAttributeEnumerationEditPart.VISUAL_ID:
        return getMDAttributeEnumeration_3034IncomingLinks(view);
      case MDAttributeHashEditPart.VISUAL_ID:
        return getMDAttributeHash_3035IncomingLinks(view);
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
        return getMDBusiness_2002OutgoingLinks(view);
      case MDAttributeTextEditPart.VISUAL_ID:
        return getMDAttributeText_3019OutgoingLinks(view);
      case MDAttributeDateEditPart.VISUAL_ID:
        return getMDAttributeDate_3020OutgoingLinks(view);
      case MDAttributeBlobEditPart.VISUAL_ID:
        return getMDAttributeBlob_3021OutgoingLinks(view);
      case MDAttributeLocalCharacterEditPart.VISUAL_ID:
        return getMDAttributeLocalCharacter_3022OutgoingLinks(view);
      case MDAttributeDoubleEditPart.VISUAL_ID:
        return getMDAttributeDouble_3023OutgoingLinks(view);
      case MDAttributeDecimalEditPart.VISUAL_ID:
        return getMDAttributeDecimal_3024OutgoingLinks(view);
      case MDAttributeLongEditPart.VISUAL_ID:
        return getMDAttributeLong_3025OutgoingLinks(view);
      case MDAttributeTimeEditPart.VISUAL_ID:
        return getMDAttributeTime_3026OutgoingLinks(view);
      case MDAttributeBooleanEditPart.VISUAL_ID:
        return getMDAttributeBoolean_3027OutgoingLinks(view);
      case MDAttributeNumberEditPart.VISUAL_ID:
        return getMDAttributeNumber_3028OutgoingLinks(view);
      case MDAttributeDateTimeEditPart.VISUAL_ID:
        return getMDAttributeDateTime_3029OutgoingLinks(view);
      case MDAttributeIntegerEditPart.VISUAL_ID:
        return getMDAttributeInteger_3030OutgoingLinks(view);
      case MDAttributeLocalTextEditPart.VISUAL_ID:
        return getMDAttributeLocalText_3031OutgoingLinks(view);
      case MDAttributeCharacterEditPart.VISUAL_ID:
        return getMDAttributeCharacter_3032OutgoingLinks(view);
      case MDAttributeFloatEditPart.VISUAL_ID:
        return getMDAttributeFloat_3033OutgoingLinks(view);
      case MDAttributeEnumerationEditPart.VISUAL_ID:
        return getMDAttributeEnumeration_3034OutgoingLinks(view);
      case MDAttributeHashEditPart.VISUAL_ID:
        return getMDAttributeHash_3035OutgoingLinks(view);
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
  public static List<RunwayLinkDescriptor> getMDBusiness_2002ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeText_3019ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeDate_3020ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeBlob_3021ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeLocalCharacter_3022ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeDouble_3023ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeDecimal_3024ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeLong_3025ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeTime_3026ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeBoolean_3027ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeNumber_3028ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeDateTime_3029ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeInteger_3030ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeLocalText_3031ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeCharacter_3032ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeFloat_3033ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeEnumeration_3034ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeHash_3035ContainedLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDBusiness_2002IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeText_3019IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeDate_3020IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeBlob_3021IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeLocalCharacter_3022IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeDouble_3023IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeDecimal_3024IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeLong_3025IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeTime_3026IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeBoolean_3027IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeNumber_3028IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeDateTime_3029IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeInteger_3030IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeLocalText_3031IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeCharacter_3032IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeFloat_3033IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeEnumeration_3034IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeHash_3035IncomingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDBusiness_2002OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeText_3019OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeDate_3020OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeBlob_3021OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeLocalCharacter_3022OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeDouble_3023OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeDecimal_3024OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeLong_3025OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeTime_3026OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeBoolean_3027OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeNumber_3028OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeDateTime_3029OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeInteger_3030OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeLocalText_3031OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeCharacter_3032OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeFloat_3033OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeEnumeration_3034OutgoingLinks(View view)
  {
    return Collections.emptyList();
  }

  /**
   * @generated
   */
  public static List<RunwayLinkDescriptor> getMDAttributeHash_3035OutgoingLinks(View view)
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
                                                      public List<RunwayNodeDescriptor> getSemanticChildren(
                                                          View view)
                                                      {
                                                        return RunwayDiagramUpdater
                                                            .getSemanticChildren(view);
                                                      }

                                                      /**
                                                       * @generated
                                                       */
                                                      @Override
                                                      public List<RunwayLinkDescriptor> getContainedLinks(
                                                          View view)
                                                      {
                                                        return RunwayDiagramUpdater
                                                            .getContainedLinks(view);
                                                      }

                                                      /**
                                                       * @generated
                                                       */
                                                      @Override
                                                      public List<RunwayLinkDescriptor> getIncomingLinks(
                                                          View view)
                                                      {
                                                        return RunwayDiagramUpdater
                                                            .getIncomingLinks(view);
                                                      }

                                                      /**
                                                       * @generated
                                                       */
                                                      @Override
                                                      public List<RunwayLinkDescriptor> getOutgoingLinks(
                                                          View view)
                                                      {
                                                        return RunwayDiagramUpdater
                                                            .getOutgoingLinks(view);
                                                      }
                                                    };

}
