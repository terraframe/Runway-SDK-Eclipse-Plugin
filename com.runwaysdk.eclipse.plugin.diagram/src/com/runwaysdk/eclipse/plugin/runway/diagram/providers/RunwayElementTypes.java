package com.runwaysdk.eclipse.plugin.runway.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;
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
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;

/**
 * @generated
 */
public class RunwayElementTypes
{

  /**
   * @generated
   */
  private RunwayElementTypes()
  {
  }

  /**
   * @generated
   */
  private static Map<IElementType, ENamedElement> elements;

  /**
   * @generated
   */
  private static ImageRegistry                    imageRegistry;

  /**
   * @generated
   */
  private static Set<IElementType>                KNOWN_ELEMENT_TYPES;

  /**
   * @generated
   */
  public static final IElementType                DocumentRoot_1000              = getElementType("com.runwaysdk.eclipse.plugin.diagram.DocumentRoot_1000");             //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDBusiness_2003                = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDBusiness_2003");               //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeText_3036           = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeText_3036");          //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeDate_3037           = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeDate_3037");          //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeBlob_3038           = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeBlob_3038");          //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeLocalCharacter_3039 = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeLocalCharacter_3039"); //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeDouble_3040         = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeDouble_3040");        //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeDecimal_3041        = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeDecimal_3041");       //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeLong_3042           = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeLong_3042");          //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeTime_3043           = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeTime_3043");          //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeBoolean_3044        = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeBoolean_3044");       //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeNumber_3045         = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeNumber_3045");        //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeDateTime_3046       = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeDateTime_3046");      //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeInteger_3047        = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeInteger_3047");       //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeLocalText_3048      = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeLocalText_3048");     //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeCharacter_3049      = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeCharacter_3049");     //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeFloat_3050          = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeFloat_3050");         //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeEnumeration_3051    = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeEnumeration_3051");   //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MDAttributeHash_3052           = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDAttributeHash_3052");          //$NON-NLS-1$

  /**
   * @generated
   */
  private static ImageRegistry getImageRegistry()
  {
    if (imageRegistry == null)
    {
      imageRegistry = new ImageRegistry();
    }
    return imageRegistry;
  }

  /**
   * @generated
   */
  private static String getImageRegistryKey(ENamedElement element)
  {
    return element.getName();
  }

  /**
   * @generated
   */
  private static ImageDescriptor getProvidedImageDescriptor(ENamedElement element)
  {
    if (element instanceof EStructuralFeature)
    {
      EStructuralFeature feature = ( (EStructuralFeature) element );
      EClass eContainingClass = feature.getEContainingClass();
      EClassifier eType = feature.getEType();
      if (eContainingClass != null && !eContainingClass.isAbstract())
      {
        element = eContainingClass;
      }
      else if (eType instanceof EClass && ! ( (EClass) eType ).isAbstract())
      {
        element = eType;
      }
    }
    if (element instanceof EClass)
    {
      EClass eClass = (EClass) element;
      if (!eClass.isAbstract())
      {
        return RunwayDiagramEditorPlugin.getInstance().getItemImageDescriptor(
            eClass.getEPackage().getEFactoryInstance().create(eClass));
      }
    }
    // TODO : support structural features
    return null;
  }

  /**
   * @generated
   */
  public static ImageDescriptor getImageDescriptor(ENamedElement element)
  {
    String key = getImageRegistryKey(element);
    ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
    if (imageDescriptor == null)
    {
      imageDescriptor = getProvidedImageDescriptor(element);
      if (imageDescriptor == null)
      {
        imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
      }
      getImageRegistry().put(key, imageDescriptor);
    }
    return imageDescriptor;
  }

  /**
   * @generated
   */
  public static Image getImage(ENamedElement element)
  {
    String key = getImageRegistryKey(element);
    Image image = getImageRegistry().get(key);
    if (image == null)
    {
      ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
      if (imageDescriptor == null)
      {
        imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
      }
      getImageRegistry().put(key, imageDescriptor);
      image = getImageRegistry().get(key);
    }
    return image;
  }

  /**
   * @generated
   */
  public static ImageDescriptor getImageDescriptor(IAdaptable hint)
  {
    ENamedElement element = getElement(hint);
    if (element == null)
    {
      return null;
    }
    return getImageDescriptor(element);
  }

  /**
   * @generated
   */
  public static Image getImage(IAdaptable hint)
  {
    ENamedElement element = getElement(hint);
    if (element == null)
    {
      return null;
    }
    return getImage(element);
  }

  /**
   * Returns 'type' of the ecore object associated with the hint.
   * 
   * @generated
   */
  public static ENamedElement getElement(IAdaptable hint)
  {
    Object type = hint.getAdapter(IElementType.class);
    if (elements == null)
    {
      elements = new IdentityHashMap<IElementType, ENamedElement>();

      elements.put(DocumentRoot_1000, RunwayPackage.eINSTANCE.getDocumentRoot());

      elements.put(MDBusiness_2003, RunwayPackage.eINSTANCE.getMDBusiness());

      elements.put(MDAttributeText_3036, RunwayPackage.eINSTANCE.getMDAttributeText());

      elements.put(MDAttributeDate_3037, RunwayPackage.eINSTANCE.getMDAttributeDate());

      elements.put(MDAttributeBlob_3038, RunwayPackage.eINSTANCE.getMDAttributeBlob());

      elements.put(MDAttributeLocalCharacter_3039,
          RunwayPackage.eINSTANCE.getMDAttributeLocalCharacter());

      elements.put(MDAttributeDouble_3040, RunwayPackage.eINSTANCE.getMDAttributeDouble());

      elements.put(MDAttributeDecimal_3041, RunwayPackage.eINSTANCE.getMDAttributeDecimal());

      elements.put(MDAttributeLong_3042, RunwayPackage.eINSTANCE.getMDAttributeLong());

      elements.put(MDAttributeTime_3043, RunwayPackage.eINSTANCE.getMDAttributeTime());

      elements.put(MDAttributeBoolean_3044, RunwayPackage.eINSTANCE.getMDAttributeBoolean());

      elements.put(MDAttributeNumber_3045, RunwayPackage.eINSTANCE.getMDAttributeNumber());

      elements.put(MDAttributeDateTime_3046, RunwayPackage.eINSTANCE.getMDAttributeDateTime());

      elements.put(MDAttributeInteger_3047, RunwayPackage.eINSTANCE.getMDAttributeInteger());

      elements.put(MDAttributeLocalText_3048, RunwayPackage.eINSTANCE.getMDAttributeLocalText());

      elements.put(MDAttributeCharacter_3049, RunwayPackage.eINSTANCE.getMDAttributeCharacter());

      elements.put(MDAttributeFloat_3050, RunwayPackage.eINSTANCE.getMDAttributeFloat());

      elements.put(MDAttributeEnumeration_3051, RunwayPackage.eINSTANCE.getMDAttributeEnumeration());

      elements.put(MDAttributeHash_3052, RunwayPackage.eINSTANCE.getMDAttributeHash());
    }
    return (ENamedElement) elements.get(type);
  }

  /**
   * @generated
   */
  private static IElementType getElementType(String id)
  {
    return ElementTypeRegistry.getInstance().getType(id);
  }

  /**
   * @generated
   */
  public static boolean isKnownElementType(IElementType elementType)
  {
    if (KNOWN_ELEMENT_TYPES == null)
    {
      KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
      KNOWN_ELEMENT_TYPES.add(DocumentRoot_1000);
      KNOWN_ELEMENT_TYPES.add(MDBusiness_2003);
      KNOWN_ELEMENT_TYPES.add(MDAttributeText_3036);
      KNOWN_ELEMENT_TYPES.add(MDAttributeDate_3037);
      KNOWN_ELEMENT_TYPES.add(MDAttributeBlob_3038);
      KNOWN_ELEMENT_TYPES.add(MDAttributeLocalCharacter_3039);
      KNOWN_ELEMENT_TYPES.add(MDAttributeDouble_3040);
      KNOWN_ELEMENT_TYPES.add(MDAttributeDecimal_3041);
      KNOWN_ELEMENT_TYPES.add(MDAttributeLong_3042);
      KNOWN_ELEMENT_TYPES.add(MDAttributeTime_3043);
      KNOWN_ELEMENT_TYPES.add(MDAttributeBoolean_3044);
      KNOWN_ELEMENT_TYPES.add(MDAttributeNumber_3045);
      KNOWN_ELEMENT_TYPES.add(MDAttributeDateTime_3046);
      KNOWN_ELEMENT_TYPES.add(MDAttributeInteger_3047);
      KNOWN_ELEMENT_TYPES.add(MDAttributeLocalText_3048);
      KNOWN_ELEMENT_TYPES.add(MDAttributeCharacter_3049);
      KNOWN_ELEMENT_TYPES.add(MDAttributeFloat_3050);
      KNOWN_ELEMENT_TYPES.add(MDAttributeEnumeration_3051);
      KNOWN_ELEMENT_TYPES.add(MDAttributeHash_3052);
    }
    return KNOWN_ELEMENT_TYPES.contains(elementType);
  }

  /**
   * @generated
   */
  public static IElementType getElementType(int visualID)
  {
    switch (visualID)
    {
      case DocumentRootEditPart.VISUAL_ID:
        return DocumentRoot_1000;
      case MDBusinessEditPart.VISUAL_ID:
        return MDBusiness_2003;
      case MDAttributeTextEditPart.VISUAL_ID:
        return MDAttributeText_3036;
      case MDAttributeDateEditPart.VISUAL_ID:
        return MDAttributeDate_3037;
      case MDAttributeBlobEditPart.VISUAL_ID:
        return MDAttributeBlob_3038;
      case MDAttributeLocalCharacterEditPart.VISUAL_ID:
        return MDAttributeLocalCharacter_3039;
      case MDAttributeDoubleEditPart.VISUAL_ID:
        return MDAttributeDouble_3040;
      case MDAttributeDecimalEditPart.VISUAL_ID:
        return MDAttributeDecimal_3041;
      case MDAttributeLongEditPart.VISUAL_ID:
        return MDAttributeLong_3042;
      case MDAttributeTimeEditPart.VISUAL_ID:
        return MDAttributeTime_3043;
      case MDAttributeBooleanEditPart.VISUAL_ID:
        return MDAttributeBoolean_3044;
      case MDAttributeNumberEditPart.VISUAL_ID:
        return MDAttributeNumber_3045;
      case MDAttributeDateTimeEditPart.VISUAL_ID:
        return MDAttributeDateTime_3046;
      case MDAttributeIntegerEditPart.VISUAL_ID:
        return MDAttributeInteger_3047;
      case MDAttributeLocalTextEditPart.VISUAL_ID:
        return MDAttributeLocalText_3048;
      case MDAttributeCharacterEditPart.VISUAL_ID:
        return MDAttributeCharacter_3049;
      case MDAttributeFloatEditPart.VISUAL_ID:
        return MDAttributeFloat_3050;
      case MDAttributeEnumerationEditPart.VISUAL_ID:
        return MDAttributeEnumeration_3051;
      case MDAttributeHashEditPart.VISUAL_ID:
        return MDAttributeHash_3052;
    }
    return null;
  }

}
