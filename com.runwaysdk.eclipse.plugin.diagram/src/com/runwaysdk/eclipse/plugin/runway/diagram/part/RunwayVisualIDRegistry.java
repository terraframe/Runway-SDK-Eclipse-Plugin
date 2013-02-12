package com.runwaysdk.eclipse.plugin.runway.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import com.runwaysdk.eclipse.plugin.runway.DocumentRoot;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;
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
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessClassNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessMdBusinessCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RunwayVisualIDRegistry
{

  /**
   * @generated
   */
  private static final String DEBUG_KEY = "com.runwaysdk.eclipse.plugin.diagram/debug/visualID"; //$NON-NLS-1$

  /**
   * @generated
   */
  public static int getVisualID(View view)
  {
    if (view instanceof Diagram)
    {
      if (DocumentRootEditPart.MODEL_ID.equals(view.getType()))
      {
        return DocumentRootEditPart.VISUAL_ID;
      }
      else
      {
        return -1;
      }
    }
    return com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry.getVisualID(view
        .getType());
  }

  /**
   * @generated
   */
  public static String getModelID(View view)
  {
    View diagram = view.getDiagram();
    while (view != diagram)
    {
      EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
      if (annotation != null)
      {
        return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
      }
      view = (View) view.eContainer();
    }
    return diagram != null ? diagram.getType() : null;
  }

  /**
   * @generated
   */
  public static int getVisualID(String type)
  {
    try
    {
      return Integer.parseInt(type);
    }
    catch (NumberFormatException e)
    {
      if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY)))
      {
        RunwayDiagramEditorPlugin.getInstance().logError(
            "Unable to parse view type as a visualID number: " + type);
      }
    }
    return -1;
  }

  /**
   * @generated
   */
  public static String getType(int visualID)
  {
    return Integer.toString(visualID);
  }

  /**
   * @generated
   */
  public static int getDiagramVisualID(EObject domainElement)
  {
    if (domainElement == null)
    {
      return -1;
    }
    if (RunwayPackage.eINSTANCE.getDocumentRoot().isSuperTypeOf(domainElement.eClass())
        && isDiagram((DocumentRoot) domainElement))
    {
      return DocumentRootEditPart.VISUAL_ID;
    }
    return -1;
  }

  /**
   * @generated
   */
  public static int getNodeVisualID(View containerView, EObject domainElement)
  {
    if (domainElement == null)
    {
      return -1;
    }
    String containerModelID = com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry
        .getModelID(containerView);
    if (!DocumentRootEditPart.MODEL_ID.equals(containerModelID))
    {
      return -1;
    }
    int containerVisualID;
    if (DocumentRootEditPart.MODEL_ID.equals(containerModelID))
    {
      containerVisualID = com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry
          .getVisualID(containerView);
    }
    else
    {
      if (containerView instanceof Diagram)
      {
        containerVisualID = DocumentRootEditPart.VISUAL_ID;
      }
      else
      {
        return -1;
      }
    }
    switch (containerVisualID)
    {
      case DocumentRootEditPart.VISUAL_ID:
        if (RunwayPackage.eINSTANCE.getMDBusiness().isSuperTypeOf(domainElement.eClass()))
        {
          return MDBusinessEditPart.VISUAL_ID;
        }
        break;
      case MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID:
        if (RunwayPackage.eINSTANCE.getMDAttributeText().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeTextEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeDate().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeDateEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeBlob().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeBlobEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeLocalCharacter().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeLocalCharacterEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeDouble().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeDoubleEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeDecimal().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeDecimalEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeLong().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeLongEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeTime().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeTimeEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeBoolean().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeBooleanEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeNumber().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeNumberEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeDateTime().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeDateTimeEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeInteger().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeIntegerEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeLocalText().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeLocalTextEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeCharacter().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeCharacterEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeFloat().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeFloatEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeEnumeration().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeEnumerationEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMDAttributeHash().isSuperTypeOf(domainElement.eClass()))
        {
          return MDAttributeHashEditPart.VISUAL_ID;
        }
        break;
    }
    return -1;
  }

  /**
   * @generated
   */
  public static boolean canCreateNode(View containerView, int nodeVisualID)
  {
    String containerModelID = com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry
        .getModelID(containerView);
    if (!DocumentRootEditPart.MODEL_ID.equals(containerModelID))
    {
      return false;
    }
    int containerVisualID;
    if (DocumentRootEditPart.MODEL_ID.equals(containerModelID))
    {
      containerVisualID = com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry
          .getVisualID(containerView);
    }
    else
    {
      if (containerView instanceof Diagram)
      {
        containerVisualID = DocumentRootEditPart.VISUAL_ID;
      }
      else
      {
        return false;
      }
    }
    switch (containerVisualID)
    {
      case DocumentRootEditPart.VISUAL_ID:
        if (MDBusinessEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDBusinessEditPart.VISUAL_ID:
        if (MDBusinessClassNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeTextEditPart.VISUAL_ID:
        if (MDAttributeTextNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeDateEditPart.VISUAL_ID:
        if (MDAttributeDateNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeBlobEditPart.VISUAL_ID:
        if (MDAttributeBlobNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeLocalCharacterEditPart.VISUAL_ID:
        if (MDAttributeLocalCharacterNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeDoubleEditPart.VISUAL_ID:
        if (MDAttributeDoubleNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeDecimalEditPart.VISUAL_ID:
        if (MDAttributeDecimalNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeLongEditPart.VISUAL_ID:
        if (MDAttributeLongNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeTimeEditPart.VISUAL_ID:
        if (MDAttributeTimeNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeBooleanEditPart.VISUAL_ID:
        if (MDAttributeBooleanNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeNumberEditPart.VISUAL_ID:
        if (MDAttributeNumberNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeDateTimeEditPart.VISUAL_ID:
        if (MDAttributeDateTimeNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeIntegerEditPart.VISUAL_ID:
        if (MDAttributeIntegerNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeLocalTextEditPart.VISUAL_ID:
        if (MDAttributeLocalTextNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeCharacterEditPart.VISUAL_ID:
        if (MDAttributeCharacterNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeFloatEditPart.VISUAL_ID:
        if (MDAttributeFloatNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeEnumerationEditPart.VISUAL_ID:
        if (MDAttributeEnumerationNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDAttributeHashEditPart.VISUAL_ID:
        if (MDAttributeHashNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID:
        if (MDAttributeTextEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeDateEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeBlobEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeLocalCharacterEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeDoubleEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeDecimalEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeLongEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeTimeEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeBooleanEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeNumberEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeDateTimeEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeIntegerEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeLocalTextEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeCharacterEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeFloatEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeEnumerationEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MDAttributeHashEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
    }
    return false;
  }

  /**
   * @generated
   */
  public static int getLinkWithClassVisualID(EObject domainElement)
  {
    if (domainElement == null)
    {
      return -1;
    }
    return -1;
  }

  /**
   * User can change implementation of this method to handle some specific
   * situations not covered by default logic.
   * 
   * @generated
   */
  private static boolean isDiagram(DocumentRoot element)
  {
    return true;
  }

  /**
   * @generated
   */
  public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate)
  {
    if (candidate == -1)
    {
      //unrecognized id is always bad
      return false;
    }
    int basic = getNodeVisualID(containerView, domainElement);
    return basic == candidate;
  }

  /**
   * @generated
   */
  public static boolean isCompartmentVisualID(int visualID)
  {
    switch (visualID)
    {
      case MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID:
        return true;
      default:
        break;
    }
    return false;
  }

  /**
   * @generated
   */
  public static boolean isSemanticLeafVisualID(int visualID)
  {
    switch (visualID)
    {
      case DocumentRootEditPart.VISUAL_ID:
        return false;
      case MDAttributeTextEditPart.VISUAL_ID:
      case MDAttributeDateEditPart.VISUAL_ID:
      case MDAttributeBlobEditPart.VISUAL_ID:
      case MDAttributeLocalCharacterEditPart.VISUAL_ID:
      case MDAttributeDoubleEditPart.VISUAL_ID:
      case MDAttributeDecimalEditPart.VISUAL_ID:
      case MDAttributeLongEditPart.VISUAL_ID:
      case MDAttributeTimeEditPart.VISUAL_ID:
      case MDAttributeBooleanEditPart.VISUAL_ID:
      case MDAttributeNumberEditPart.VISUAL_ID:
      case MDAttributeDateTimeEditPart.VISUAL_ID:
      case MDAttributeIntegerEditPart.VISUAL_ID:
      case MDAttributeLocalTextEditPart.VISUAL_ID:
      case MDAttributeCharacterEditPart.VISUAL_ID:
      case MDAttributeFloatEditPart.VISUAL_ID:
      case MDAttributeEnumerationEditPart.VISUAL_ID:
      case MDAttributeHashEditPart.VISUAL_ID:
        return true;
      default:
        break;
    }
    return false;
  }

  /**
   * @generated
   */
  public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure()
                                                      {
                                                        /**
                                                         * @generated
                                                         */
                                                        @Override
                                                        public int getVisualID(View view)
                                                        {
                                                          return com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry
                                                              .getVisualID(view);
                                                        }

                                                        /**
                                                         * @generated
                                                         */
                                                        @Override
                                                        public String getModelID(View view)
                                                        {
                                                          return com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry
                                                              .getModelID(view);
                                                        }

                                                        /**
                                                         * @generated
                                                         */
                                                        @Override
                                                        public int getNodeVisualID(View containerView,
                                                            EObject domainElement)
                                                        {
                                                          return com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry
                                                              .getNodeVisualID(containerView,
                                                                  domainElement);
                                                        }

                                                        /**
                                                         * @generated
                                                         */
                                                        @Override
                                                        public boolean checkNodeVisualID(
                                                            View containerView, EObject domainElement,
                                                            int candidate)
                                                        {
                                                          return com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry
                                                              .checkNodeVisualID(containerView,
                                                                  domainElement, candidate);
                                                        }

                                                        /**
                                                         * @generated
                                                         */
                                                        @Override
                                                        public boolean isCompartmentVisualID(int visualID)
                                                        {
                                                          return com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry
                                                              .isCompartmentVisualID(visualID);
                                                        }

                                                        /**
                                                         * @generated
                                                         */
                                                        @Override
                                                        public boolean isSemanticLeafVisualID(
                                                            int visualID)
                                                        {
                                                          return com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry
                                                              .isSemanticLeafVisualID(visualID);
                                                        }
                                                      };

}
