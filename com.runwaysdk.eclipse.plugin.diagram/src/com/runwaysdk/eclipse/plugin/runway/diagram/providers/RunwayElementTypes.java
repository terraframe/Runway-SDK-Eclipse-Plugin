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
import com.runwaysdk.eclipse.plugin.runway.diagram.edit.parts.MDBusinessEditPart;
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
  public static final IElementType                MDBusiness_2001                = getElementType("com.runwaysdk.eclipse.plugin.diagram.MDBusiness_2001");               //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeText_3004           = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeText_3004");          //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeDate_3005           = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeDate_3005");          //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeBlob_3002           = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeBlob_3002");          //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeLocalCharacter_3006 = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeLocalCharacter_3006"); //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeDouble_3007         = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeDouble_3007");        //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeDecimal_3008        = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeDecimal_3008");       //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeLong_3009           = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeLong_3009");          //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeTime_3010           = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeTime_3010");          //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeBoolean_3003        = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeBoolean_3003");       //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeNumber_3011         = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeNumber_3011");        //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeDateTime_3012       = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeDateTime_3012");      //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeInteger_3013        = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeInteger_3013");       //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeLocalText_3014      = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeLocalText_3014");     //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeCharacter_3015      = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeCharacter_3015");     //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeFloat_3016          = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeFloat_3016");         //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeEnumeration_3017    = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeEnumeration_3017");   //$NON-NLS-1$

  /**
   * @generated
   */
  public static final IElementType                MdAttributeHash_3018           = getElementType("com.runwaysdk.eclipse.plugin.diagram.MdAttributeHash_3018");          //$NON-NLS-1$

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
        return RunwayDiagramEditorPlugin.getInstance().getItemImageDescriptor(eClass.getEPackage().getEFactoryInstance().create(eClass));
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

      elements.put(MDBusiness_2001, RunwayPackage.eINSTANCE.getMDBusiness());

      elements.put(MdAttributeText_3004, RunwayPackage.eINSTANCE.getMdAttributeText());

      elements.put(MdAttributeDate_3005, RunwayPackage.eINSTANCE.getMdAttributeDate());

      elements.put(MdAttributeBlob_3002, RunwayPackage.eINSTANCE.getMdAttributeBlob());

      elements.put(MdAttributeLocalCharacter_3006, RunwayPackage.eINSTANCE.getMdAttributeLocalCharacter());

      elements.put(MdAttributeDouble_3007, RunwayPackage.eINSTANCE.getMdAttributeDouble());

      elements.put(MdAttributeDecimal_3008, RunwayPackage.eINSTANCE.getMdAttributeDecimal());

      elements.put(MdAttributeLong_3009, RunwayPackage.eINSTANCE.getMdAttributeLong());

      elements.put(MdAttributeTime_3010, RunwayPackage.eINSTANCE.getMdAttributeTime());

      elements.put(MdAttributeBoolean_3003, RunwayPackage.eINSTANCE.getMdAttributeBoolean());

      elements.put(MdAttributeNumber_3011, RunwayPackage.eINSTANCE.getMdAttributeNumber());

      elements.put(MdAttributeDateTime_3012, RunwayPackage.eINSTANCE.getMdAttributeDateTime());

      elements.put(MdAttributeInteger_3013, RunwayPackage.eINSTANCE.getMdAttributeInteger());

      elements.put(MdAttributeLocalText_3014, RunwayPackage.eINSTANCE.getMdAttributeLocalText());

      elements.put(MdAttributeCharacter_3015, RunwayPackage.eINSTANCE.getMdAttributeCharacter());

      elements.put(MdAttributeFloat_3016, RunwayPackage.eINSTANCE.getMdAttributeFloat());

      elements.put(MdAttributeEnumeration_3017, RunwayPackage.eINSTANCE.getMdAttributeEnumeration());

      elements.put(MdAttributeHash_3018, RunwayPackage.eINSTANCE.getMdAttributeHash());
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
      KNOWN_ELEMENT_TYPES.add(MDBusiness_2001);
      KNOWN_ELEMENT_TYPES.add(MdAttributeText_3004);
      KNOWN_ELEMENT_TYPES.add(MdAttributeDate_3005);
      KNOWN_ELEMENT_TYPES.add(MdAttributeBlob_3002);
      KNOWN_ELEMENT_TYPES.add(MdAttributeLocalCharacter_3006);
      KNOWN_ELEMENT_TYPES.add(MdAttributeDouble_3007);
      KNOWN_ELEMENT_TYPES.add(MdAttributeDecimal_3008);
      KNOWN_ELEMENT_TYPES.add(MdAttributeLong_3009);
      KNOWN_ELEMENT_TYPES.add(MdAttributeTime_3010);
      KNOWN_ELEMENT_TYPES.add(MdAttributeBoolean_3003);
      KNOWN_ELEMENT_TYPES.add(MdAttributeNumber_3011);
      KNOWN_ELEMENT_TYPES.add(MdAttributeDateTime_3012);
      KNOWN_ELEMENT_TYPES.add(MdAttributeInteger_3013);
      KNOWN_ELEMENT_TYPES.add(MdAttributeLocalText_3014);
      KNOWN_ELEMENT_TYPES.add(MdAttributeCharacter_3015);
      KNOWN_ELEMENT_TYPES.add(MdAttributeFloat_3016);
      KNOWN_ELEMENT_TYPES.add(MdAttributeEnumeration_3017);
      KNOWN_ELEMENT_TYPES.add(MdAttributeHash_3018);
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
        return MDBusiness_2001;
      case MdAttributeTextEditPart.VISUAL_ID:
        return MdAttributeText_3004;
      case MdAttributeDateEditPart.VISUAL_ID:
        return MdAttributeDate_3005;
      case MdAttributeBlobEditPart.VISUAL_ID:
        return MdAttributeBlob_3002;
      case MdAttributeLocalCharacterEditPart.VISUAL_ID:
        return MdAttributeLocalCharacter_3006;
      case MdAttributeDoubleEditPart.VISUAL_ID:
        return MdAttributeDouble_3007;
      case MdAttributeDecimalEditPart.VISUAL_ID:
        return MdAttributeDecimal_3008;
      case MdAttributeLongEditPart.VISUAL_ID:
        return MdAttributeLong_3009;
      case MdAttributeTimeEditPart.VISUAL_ID:
        return MdAttributeTime_3010;
      case MdAttributeBooleanEditPart.VISUAL_ID:
        return MdAttributeBoolean_3003;
      case MdAttributeNumberEditPart.VISUAL_ID:
        return MdAttributeNumber_3011;
      case MdAttributeDateTimeEditPart.VISUAL_ID:
        return MdAttributeDateTime_3012;
      case MdAttributeIntegerEditPart.VISUAL_ID:
        return MdAttributeInteger_3013;
      case MdAttributeLocalTextEditPart.VISUAL_ID:
        return MdAttributeLocalText_3014;
      case MdAttributeCharacterEditPart.VISUAL_ID:
        return MdAttributeCharacter_3015;
      case MdAttributeFloatEditPart.VISUAL_ID:
        return MdAttributeFloat_3016;
      case MdAttributeEnumerationEditPart.VISUAL_ID:
        return MdAttributeEnumeration_3017;
      case MdAttributeHashEditPart.VISUAL_ID:
        return MdAttributeHash_3018;
    }
    return null;
  }

}
