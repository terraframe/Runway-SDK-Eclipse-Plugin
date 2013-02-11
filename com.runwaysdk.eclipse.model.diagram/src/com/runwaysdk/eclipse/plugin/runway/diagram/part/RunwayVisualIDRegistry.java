package com.runwaysdk.eclipse.plugin.runway.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import com.runwaysdk.eclipse.model.runway.DocumentRoot;
import com.runwaysdk.eclipse.model.runway.RunwayPackage;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.DocumentRootEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessClassNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessMdBusinessCompartmentEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeBlobEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeBlobNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeBooleanEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeBooleanNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeCharacterEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeCharacterNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDateEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDateNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDateTimeEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDateTimeNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDecimalEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDecimalNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDoubleEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeDoubleNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeEnumerationEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeEnumerationNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeFloatEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeFloatNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeHashEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeHashNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeIntegerEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeIntegerNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLocalCharacterEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLocalCharacterNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLocalTextEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLocalTextNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLongEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeLongNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeNumberEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeNumberNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeTextEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeTextNameEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeTimeEditPart;
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MdAttributeTimeNameEditPart;

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
    return com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry.getVisualID(view.getType());
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
        RunwayDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + type);
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
    if (RunwayPackage.eINSTANCE.getDocumentRoot().isSuperTypeOf(domainElement.eClass()) && isDiagram((DocumentRoot) domainElement))
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
    String containerModelID = com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry.getModelID(containerView);
    if (!DocumentRootEditPart.MODEL_ID.equals(containerModelID))
    {
      return -1;
    }
    int containerVisualID;
    if (DocumentRootEditPart.MODEL_ID.equals(containerModelID))
    {
      containerVisualID = com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry.getVisualID(containerView);
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
        if (RunwayPackage.eINSTANCE.getMdAttributeText().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeTextEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeDate().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeDateEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeBlob().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeBlobEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeLocalCharacter().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeLocalCharacterEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeDouble().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeDoubleEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeDecimal().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeDecimalEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeLong().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeLongEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeTime().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeTimeEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeBoolean().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeBooleanEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeNumber().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeNumberEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeDateTime().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeDateTimeEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeInteger().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeIntegerEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeLocalText().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeLocalTextEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeCharacter().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeCharacterEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeFloat().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeFloatEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeEnumeration().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeEnumerationEditPart.VISUAL_ID;
        }
        if (RunwayPackage.eINSTANCE.getMdAttributeHash().isSuperTypeOf(domainElement.eClass()))
        {
          return MdAttributeHashEditPart.VISUAL_ID;
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
    String containerModelID = com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry.getModelID(containerView);
    if (!DocumentRootEditPart.MODEL_ID.equals(containerModelID))
    {
      return false;
    }
    int containerVisualID;
    if (DocumentRootEditPart.MODEL_ID.equals(containerModelID))
    {
      containerVisualID = com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry.getVisualID(containerView);
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
      case MdAttributeTextEditPart.VISUAL_ID:
        if (MdAttributeTextNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeDateEditPart.VISUAL_ID:
        if (MdAttributeDateNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeBlobEditPart.VISUAL_ID:
        if (MdAttributeBlobNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeLocalCharacterEditPart.VISUAL_ID:
        if (MdAttributeLocalCharacterNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeDoubleEditPart.VISUAL_ID:
        if (MdAttributeDoubleNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeDecimalEditPart.VISUAL_ID:
        if (MdAttributeDecimalNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeLongEditPart.VISUAL_ID:
        if (MdAttributeLongNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeTimeEditPart.VISUAL_ID:
        if (MdAttributeTimeNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeBooleanEditPart.VISUAL_ID:
        if (MdAttributeBooleanNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeNumberEditPart.VISUAL_ID:
        if (MdAttributeNumberNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeDateTimeEditPart.VISUAL_ID:
        if (MdAttributeDateTimeNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeIntegerEditPart.VISUAL_ID:
        if (MdAttributeIntegerNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeLocalTextEditPart.VISUAL_ID:
        if (MdAttributeLocalTextNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeCharacterEditPart.VISUAL_ID:
        if (MdAttributeCharacterNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeFloatEditPart.VISUAL_ID:
        if (MdAttributeFloatNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeEnumerationEditPart.VISUAL_ID:
        if (MdAttributeEnumerationNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MdAttributeHashEditPart.VISUAL_ID:
        if (MdAttributeHashNameEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        break;
      case MDBusinessMdBusinessCompartmentEditPart.VISUAL_ID:
        if (MdAttributeTextEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeDateEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeBlobEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeLocalCharacterEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeDoubleEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeDecimalEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeLongEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeTimeEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeBooleanEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeNumberEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeDateTimeEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeIntegerEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeLocalTextEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeCharacterEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeFloatEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeEnumerationEditPart.VISUAL_ID == nodeVisualID)
        {
          return true;
        }
        if (MdAttributeHashEditPart.VISUAL_ID == nodeVisualID)
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
      case MdAttributeBlobEditPart.VISUAL_ID:
      case MdAttributeBooleanEditPart.VISUAL_ID:
      case MdAttributeTextEditPart.VISUAL_ID:
      case MdAttributeDateEditPart.VISUAL_ID:
      case MdAttributeLocalCharacterEditPart.VISUAL_ID:
      case MdAttributeDoubleEditPart.VISUAL_ID:
      case MdAttributeDecimalEditPart.VISUAL_ID:
      case MdAttributeLongEditPart.VISUAL_ID:
      case MdAttributeTimeEditPart.VISUAL_ID:
      case MdAttributeNumberEditPart.VISUAL_ID:
      case MdAttributeDateTimeEditPart.VISUAL_ID:
      case MdAttributeIntegerEditPart.VISUAL_ID:
      case MdAttributeLocalTextEditPart.VISUAL_ID:
      case MdAttributeCharacterEditPart.VISUAL_ID:
      case MdAttributeFloatEditPart.VISUAL_ID:
      case MdAttributeEnumerationEditPart.VISUAL_ID:
      case MdAttributeHashEditPart.VISUAL_ID:
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
                                                        public int getNodeVisualID(View containerView, EObject domainElement)
                                                        {
                                                          return com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry
                                                              .getNodeVisualID(containerView, domainElement);
                                                        }

                                                        /**
                                                         * @generated
                                                         */
                                                        @Override
                                                        public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate)
                                                        {
                                                          return com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry
                                                              .checkNodeVisualID(containerView, domainElement, candidate);
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
                                                        public boolean isSemanticLeafVisualID(int visualID)
                                                        {
                                                          return com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry
                                                              .isSemanticLeafVisualID(visualID);
                                                        }
                                                      };

}
