/**
 */
package com.runwaysdk.eclipse.plugin.runway;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.runwaysdk.eclipse.plugin.runway.RunwayFactory
 * @model kind="package"
 * @generated
 */
public interface RunwayPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "runway";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "runway";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "runway";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RunwayPackage eINSTANCE = com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl.init();

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl <em>MD Business</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDBusiness()
   * @generated
   */
  int MD_BUSINESS = 0;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_BUSINESS__CLASS_NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_BUSINESS__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_BUSINESS__DISPLAY_LABEL = 2;

  /**
   * The number of structural features of the '<em>MD Business</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_BUSINESS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeImpl <em>MD Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttribute()
   * @generated
   */
  int MD_ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE__REQUIRED = 1;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE__IMMUTABLE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE__DISPLAY_LABEL = 4;

  /**
   * The number of structural features of the '<em>MD Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.DocumentRootImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 2;

  /**
   * The feature id for the '<em><b>Md Businesses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MD_BUSINESSES = 0;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeBlobImpl <em>Md Attribute Blob</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeBlobImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeBlob()
   * @generated
   */
  int MD_ATTRIBUTE_BLOB = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BLOB__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BLOB__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BLOB__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BLOB__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BLOB__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BLOB__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Blob</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BLOB_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeBooleanImpl <em>Md Attribute Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeBooleanImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeBoolean()
   * @generated
   */
  int MD_ATTRIBUTE_BOOLEAN = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BOOLEAN__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BOOLEAN__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BOOLEAN__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BOOLEAN__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BOOLEAN__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BOOLEAN__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Boolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BOOLEAN_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeCharacterImpl <em>Md Attribute Character</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeCharacterImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeCharacter()
   * @generated
   */
  int MD_ATTRIBUTE_CHARACTER = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_CHARACTER__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_CHARACTER__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_CHARACTER__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_CHARACTER__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_CHARACTER__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_CHARACTER__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Character</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_CHARACTER_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDateImpl <em>Md Attribute Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDateImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeDate()
   * @generated
   */
  int MD_ATTRIBUTE_DATE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDateTimeImpl <em>Md Attribute Date Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDateTimeImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeDateTime()
   * @generated
   */
  int MD_ATTRIBUTE_DATE_TIME = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE_TIME__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE_TIME__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE_TIME__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE_TIME__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE_TIME__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE_TIME__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Date Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE_TIME_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDecimalImpl <em>Md Attribute Decimal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDecimalImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeDecimal()
   * @generated
   */
  int MD_ATTRIBUTE_DECIMAL = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DECIMAL__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DECIMAL__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DECIMAL__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DECIMAL__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DECIMAL__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DECIMAL__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Decimal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DECIMAL_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDoubleImpl <em>Md Attribute Double</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDoubleImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeDouble()
   * @generated
   */
  int MD_ATTRIBUTE_DOUBLE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DOUBLE__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DOUBLE__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DOUBLE__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DOUBLE__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DOUBLE__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DOUBLE__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Double</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DOUBLE_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeEnumerationImpl <em>Md Attribute Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeEnumerationImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeEnumeration()
   * @generated
   */
  int MD_ATTRIBUTE_ENUMERATION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_ENUMERATION__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_ENUMERATION__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_ENUMERATION__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_ENUMERATION__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_ENUMERATION__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_ENUMERATION__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_ENUMERATION_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeFloatImpl <em>Md Attribute Float</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeFloatImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeFloat()
   * @generated
   */
  int MD_ATTRIBUTE_FLOAT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_FLOAT__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_FLOAT__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_FLOAT__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_FLOAT__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_FLOAT__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_FLOAT__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Float</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_FLOAT_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeHashImpl <em>Md Attribute Hash</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeHashImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeHash()
   * @generated
   */
  int MD_ATTRIBUTE_HASH = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_HASH__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_HASH__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_HASH__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_HASH__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_HASH__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_HASH__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Hash</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_HASH_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeIntegerImpl <em>Md Attribute Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeIntegerImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeInteger()
   * @generated
   */
  int MD_ATTRIBUTE_INTEGER = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_INTEGER__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_INTEGER__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_INTEGER__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_INTEGER__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_INTEGER__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_INTEGER__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_INTEGER_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeNumberImpl <em>Md Attribute Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeNumberImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeNumber()
   * @generated
   */
  int MD_ATTRIBUTE_NUMBER = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_NUMBER__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_NUMBER__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_NUMBER__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_NUMBER__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_NUMBER__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_NUMBER__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_NUMBER_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeStructImpl <em>Md Attribute Struct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeStructImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeStruct()
   * @generated
   */
  int MD_ATTRIBUTE_STRUCT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_STRUCT__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_STRUCT__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_STRUCT__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_STRUCT__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_STRUCT__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The number of structural features of the '<em>Md Attribute Struct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_STRUCT_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeTextImpl <em>Md Attribute Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeTextImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeText()
   * @generated
   */
  int MD_ATTRIBUTE_TEXT = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TEXT__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TEXT__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TEXT__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TEXT__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TEXT__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TEXT__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TEXT_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeTimeImpl <em>Md Attribute Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeTimeImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeTime()
   * @generated
   */
  int MD_ATTRIBUTE_TIME = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TIME__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TIME__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TIME__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TIME__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TIME__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TIME__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TIME_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLocalImpl <em>Md Attribute Local</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLocalImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeLocal()
   * @generated
   */
  int MD_ATTRIBUTE_LOCAL = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL__NAME = MD_ATTRIBUTE_STRUCT__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL__REQUIRED = MD_ATTRIBUTE_STRUCT__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL__IMMUTABLE = MD_ATTRIBUTE_STRUCT__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL__DESCRIPTION = MD_ATTRIBUTE_STRUCT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL__DISPLAY_LABEL = MD_ATTRIBUTE_STRUCT__DISPLAY_LABEL;

  /**
   * The number of structural features of the '<em>Md Attribute Local</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_FEATURE_COUNT = MD_ATTRIBUTE_STRUCT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLocalCharacterImpl <em>Md Attribute Local Character</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLocalCharacterImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeLocalCharacter()
   * @generated
   */
  int MD_ATTRIBUTE_LOCAL_CHARACTER = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_CHARACTER__NAME = MD_ATTRIBUTE_LOCAL__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_CHARACTER__REQUIRED = MD_ATTRIBUTE_LOCAL__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_CHARACTER__IMMUTABLE = MD_ATTRIBUTE_LOCAL__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_CHARACTER__DESCRIPTION = MD_ATTRIBUTE_LOCAL__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_CHARACTER__DISPLAY_LABEL = MD_ATTRIBUTE_LOCAL__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_CHARACTER__DEFAULT_VALUE = MD_ATTRIBUTE_LOCAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Local Character</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_CHARACTER_FEATURE_COUNT = MD_ATTRIBUTE_LOCAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLocalTextImpl <em>Md Attribute Local Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLocalTextImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeLocalText()
   * @generated
   */
  int MD_ATTRIBUTE_LOCAL_TEXT = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_TEXT__NAME = MD_ATTRIBUTE_LOCAL__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_TEXT__REQUIRED = MD_ATTRIBUTE_LOCAL__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_TEXT__IMMUTABLE = MD_ATTRIBUTE_LOCAL__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_TEXT__DESCRIPTION = MD_ATTRIBUTE_LOCAL__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_TEXT__DISPLAY_LABEL = MD_ATTRIBUTE_LOCAL__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_TEXT__DEFAULT_VALUE = MD_ATTRIBUTE_LOCAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Local Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_TEXT_FEATURE_COUNT = MD_ATTRIBUTE_LOCAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLongImpl <em>Md Attribute Long</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLongImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeLong()
   * @generated
   */
  int MD_ATTRIBUTE_LONG = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LONG__NAME = MD_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LONG__REQUIRED = MD_ATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LONG__IMMUTABLE = MD_ATTRIBUTE__IMMUTABLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LONG__DESCRIPTION = MD_ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LONG__DISPLAY_LABEL = MD_ATTRIBUTE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LONG__DEFAULT_VALUE = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Md Attribute Long</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LONG_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness <em>MD Business</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Business</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDBusiness
   * @generated
   */
  EClass getMDBusiness();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDBusiness#getClassName()
   * @see #getMDBusiness()
   * @generated
   */
  EAttribute getMDBusiness_ClassName();

  /**
   * Returns the meta object for the containment reference list '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDBusiness#getAttributes()
   * @see #getMDBusiness()
   * @generated
   */
  EReference getMDBusiness_Attributes();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getDisplayLabel <em>Display Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Label</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDBusiness#getDisplayLabel()
   * @see #getMDBusiness()
   * @generated
   */
  EAttribute getMDBusiness_DisplayLabel();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttribute <em>MD Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttribute
   * @generated
   */
  EClass getMDAttribute();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttribute#getName()
   * @see #getMDAttribute()
   * @generated
   */
  EAttribute getMDAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttribute#isRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttribute#isRequired()
   * @see #getMDAttribute()
   * @generated
   */
  EAttribute getMDAttribute_Required();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttribute#isImmutable <em>Immutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Immutable</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttribute#isImmutable()
   * @see #getMDAttribute()
   * @generated
   */
  EAttribute getMDAttribute_Immutable();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttribute#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttribute#getDescription()
   * @see #getMDAttribute()
   * @generated
   */
  EAttribute getMDAttribute_Description();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttribute#getDisplayLabel <em>Display Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Label</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttribute#getDisplayLabel()
   * @see #getMDAttribute()
   * @generated
   */
  EAttribute getMDAttribute_DisplayLabel();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the containment reference list '{@link com.runwaysdk.eclipse.plugin.runway.DocumentRoot#getMdBusinesses <em>Md Businesses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Md Businesses</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.DocumentRoot#getMdBusinesses()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_MdBusinesses();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeBlob <em>Md Attribute Blob</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Blob</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeBlob
   * @generated
   */
  EClass getMdAttributeBlob();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeBlob#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeBlob#getDefaultValue()
   * @see #getMdAttributeBlob()
   * @generated
   */
  EAttribute getMdAttributeBlob_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeBoolean <em>Md Attribute Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Boolean</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeBoolean
   * @generated
   */
  EClass getMdAttributeBoolean();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeBoolean#isDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeBoolean#isDefaultValue()
   * @see #getMdAttributeBoolean()
   * @generated
   */
  EAttribute getMdAttributeBoolean_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeCharacter <em>Md Attribute Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Character</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeCharacter
   * @generated
   */
  EClass getMdAttributeCharacter();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeCharacter#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeCharacter#getDefaultValue()
   * @see #getMdAttributeCharacter()
   * @generated
   */
  EAttribute getMdAttributeCharacter_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDate <em>Md Attribute Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Date</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeDate
   * @generated
   */
  EClass getMdAttributeDate();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDate#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeDate#getDefaultValue()
   * @see #getMdAttributeDate()
   * @generated
   */
  EAttribute getMdAttributeDate_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDateTime <em>Md Attribute Date Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Date Time</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeDateTime
   * @generated
   */
  EClass getMdAttributeDateTime();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDateTime#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeDateTime#getDefaultValue()
   * @see #getMdAttributeDateTime()
   * @generated
   */
  EAttribute getMdAttributeDateTime_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDecimal <em>Md Attribute Decimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Decimal</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeDecimal
   * @generated
   */
  EClass getMdAttributeDecimal();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDecimal#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeDecimal#getDefaultValue()
   * @see #getMdAttributeDecimal()
   * @generated
   */
  EAttribute getMdAttributeDecimal_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDouble <em>Md Attribute Double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Double</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeDouble
   * @generated
   */
  EClass getMdAttributeDouble();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeDouble#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeDouble#getDefaultValue()
   * @see #getMdAttributeDouble()
   * @generated
   */
  EAttribute getMdAttributeDouble_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeEnumeration <em>Md Attribute Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Enumeration</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeEnumeration
   * @generated
   */
  EClass getMdAttributeEnumeration();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeEnumeration#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeEnumeration#getDefaultValue()
   * @see #getMdAttributeEnumeration()
   * @generated
   */
  EAttribute getMdAttributeEnumeration_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeFloat <em>Md Attribute Float</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Float</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeFloat
   * @generated
   */
  EClass getMdAttributeFloat();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeFloat#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeFloat#getDefaultValue()
   * @see #getMdAttributeFloat()
   * @generated
   */
  EAttribute getMdAttributeFloat_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeHash <em>Md Attribute Hash</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Hash</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeHash
   * @generated
   */
  EClass getMdAttributeHash();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeHash#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeHash#getDefaultValue()
   * @see #getMdAttributeHash()
   * @generated
   */
  EAttribute getMdAttributeHash_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeInteger <em>Md Attribute Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Integer</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeInteger
   * @generated
   */
  EClass getMdAttributeInteger();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeInteger#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeInteger#getDefaultValue()
   * @see #getMdAttributeInteger()
   * @generated
   */
  EAttribute getMdAttributeInteger_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeNumber <em>Md Attribute Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Number</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeNumber
   * @generated
   */
  EClass getMdAttributeNumber();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeNumber#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeNumber#getDefaultValue()
   * @see #getMdAttributeNumber()
   * @generated
   */
  EAttribute getMdAttributeNumber_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeStruct <em>Md Attribute Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Struct</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeStruct
   * @generated
   */
  EClass getMdAttributeStruct();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeText <em>Md Attribute Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Text</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeText
   * @generated
   */
  EClass getMdAttributeText();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeText#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeText#getDefaultValue()
   * @see #getMdAttributeText()
   * @generated
   */
  EAttribute getMdAttributeText_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeTime <em>Md Attribute Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Time</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeTime
   * @generated
   */
  EClass getMdAttributeTime();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeTime#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeTime#getDefaultValue()
   * @see #getMdAttributeTime()
   * @generated
   */
  EAttribute getMdAttributeTime_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLocal <em>Md Attribute Local</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Local</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeLocal
   * @generated
   */
  EClass getMdAttributeLocal();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalCharacter <em>Md Attribute Local Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Local Character</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalCharacter
   * @generated
   */
  EClass getMdAttributeLocalCharacter();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalCharacter#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalCharacter#getDefaultValue()
   * @see #getMdAttributeLocalCharacter()
   * @generated
   */
  EAttribute getMdAttributeLocalCharacter_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalText <em>Md Attribute Local Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Local Text</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalText
   * @generated
   */
  EClass getMdAttributeLocalText();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalText#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalText#getDefaultValue()
   * @see #getMdAttributeLocalText()
   * @generated
   */
  EAttribute getMdAttributeLocalText_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLong <em>Md Attribute Long</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Md Attribute Long</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeLong
   * @generated
   */
  EClass getMdAttributeLong();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MdAttributeLong#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MdAttributeLong#getDefaultValue()
   * @see #getMdAttributeLong()
   * @generated
   */
  EAttribute getMdAttributeLong_DefaultValue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RunwayFactory getRunwayFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl <em>MD Business</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDBusiness()
     * @generated
     */
    EClass MD_BUSINESS = eINSTANCE.getMDBusiness();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_BUSINESS__CLASS_NAME = eINSTANCE.getMDBusiness_ClassName();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MD_BUSINESS__ATTRIBUTES = eINSTANCE.getMDBusiness_Attributes();

    /**
     * The meta object literal for the '<em><b>Display Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_BUSINESS__DISPLAY_LABEL = eINSTANCE.getMDBusiness_DisplayLabel();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeImpl <em>MD Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttribute()
     * @generated
     */
    EClass MD_ATTRIBUTE = eINSTANCE.getMDAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE__NAME = eINSTANCE.getMDAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE__REQUIRED = eINSTANCE.getMDAttribute_Required();

    /**
     * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE__IMMUTABLE = eINSTANCE.getMDAttribute_Immutable();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE__DESCRIPTION = eINSTANCE.getMDAttribute_Description();

    /**
     * The meta object literal for the '<em><b>Display Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE__DISPLAY_LABEL = eINSTANCE.getMDAttribute_DisplayLabel();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.DocumentRootImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getDocumentRoot()
     * @generated
     */
    EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Md Businesses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__MD_BUSINESSES = eINSTANCE.getDocumentRoot_MdBusinesses();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeBlobImpl <em>Md Attribute Blob</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeBlobImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeBlob()
     * @generated
     */
    EClass MD_ATTRIBUTE_BLOB = eINSTANCE.getMdAttributeBlob();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_BLOB__DEFAULT_VALUE = eINSTANCE.getMdAttributeBlob_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeBooleanImpl <em>Md Attribute Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeBooleanImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeBoolean()
     * @generated
     */
    EClass MD_ATTRIBUTE_BOOLEAN = eINSTANCE.getMdAttributeBoolean();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_BOOLEAN__DEFAULT_VALUE = eINSTANCE.getMdAttributeBoolean_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeCharacterImpl <em>Md Attribute Character</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeCharacterImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeCharacter()
     * @generated
     */
    EClass MD_ATTRIBUTE_CHARACTER = eINSTANCE.getMdAttributeCharacter();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_CHARACTER__DEFAULT_VALUE = eINSTANCE.getMdAttributeCharacter_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDateImpl <em>Md Attribute Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDateImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeDate()
     * @generated
     */
    EClass MD_ATTRIBUTE_DATE = eINSTANCE.getMdAttributeDate();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_DATE__DEFAULT_VALUE = eINSTANCE.getMdAttributeDate_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDateTimeImpl <em>Md Attribute Date Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDateTimeImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeDateTime()
     * @generated
     */
    EClass MD_ATTRIBUTE_DATE_TIME = eINSTANCE.getMdAttributeDateTime();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_DATE_TIME__DEFAULT_VALUE = eINSTANCE.getMdAttributeDateTime_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDecimalImpl <em>Md Attribute Decimal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDecimalImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeDecimal()
     * @generated
     */
    EClass MD_ATTRIBUTE_DECIMAL = eINSTANCE.getMdAttributeDecimal();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_DECIMAL__DEFAULT_VALUE = eINSTANCE.getMdAttributeDecimal_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDoubleImpl <em>Md Attribute Double</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeDoubleImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeDouble()
     * @generated
     */
    EClass MD_ATTRIBUTE_DOUBLE = eINSTANCE.getMdAttributeDouble();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_DOUBLE__DEFAULT_VALUE = eINSTANCE.getMdAttributeDouble_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeEnumerationImpl <em>Md Attribute Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeEnumerationImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeEnumeration()
     * @generated
     */
    EClass MD_ATTRIBUTE_ENUMERATION = eINSTANCE.getMdAttributeEnumeration();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_ENUMERATION__DEFAULT_VALUE = eINSTANCE.getMdAttributeEnumeration_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeFloatImpl <em>Md Attribute Float</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeFloatImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeFloat()
     * @generated
     */
    EClass MD_ATTRIBUTE_FLOAT = eINSTANCE.getMdAttributeFloat();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_FLOAT__DEFAULT_VALUE = eINSTANCE.getMdAttributeFloat_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeHashImpl <em>Md Attribute Hash</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeHashImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeHash()
     * @generated
     */
    EClass MD_ATTRIBUTE_HASH = eINSTANCE.getMdAttributeHash();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_HASH__DEFAULT_VALUE = eINSTANCE.getMdAttributeHash_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeIntegerImpl <em>Md Attribute Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeIntegerImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeInteger()
     * @generated
     */
    EClass MD_ATTRIBUTE_INTEGER = eINSTANCE.getMdAttributeInteger();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_INTEGER__DEFAULT_VALUE = eINSTANCE.getMdAttributeInteger_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeNumberImpl <em>Md Attribute Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeNumberImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeNumber()
     * @generated
     */
    EClass MD_ATTRIBUTE_NUMBER = eINSTANCE.getMdAttributeNumber();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_NUMBER__DEFAULT_VALUE = eINSTANCE.getMdAttributeNumber_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeStructImpl <em>Md Attribute Struct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeStructImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeStruct()
     * @generated
     */
    EClass MD_ATTRIBUTE_STRUCT = eINSTANCE.getMdAttributeStruct();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeTextImpl <em>Md Attribute Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeTextImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeText()
     * @generated
     */
    EClass MD_ATTRIBUTE_TEXT = eINSTANCE.getMdAttributeText();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_TEXT__DEFAULT_VALUE = eINSTANCE.getMdAttributeText_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeTimeImpl <em>Md Attribute Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeTimeImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeTime()
     * @generated
     */
    EClass MD_ATTRIBUTE_TIME = eINSTANCE.getMdAttributeTime();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_TIME__DEFAULT_VALUE = eINSTANCE.getMdAttributeTime_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLocalImpl <em>Md Attribute Local</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLocalImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeLocal()
     * @generated
     */
    EClass MD_ATTRIBUTE_LOCAL = eINSTANCE.getMdAttributeLocal();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLocalCharacterImpl <em>Md Attribute Local Character</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLocalCharacterImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeLocalCharacter()
     * @generated
     */
    EClass MD_ATTRIBUTE_LOCAL_CHARACTER = eINSTANCE.getMdAttributeLocalCharacter();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_LOCAL_CHARACTER__DEFAULT_VALUE = eINSTANCE.getMdAttributeLocalCharacter_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLocalTextImpl <em>Md Attribute Local Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLocalTextImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeLocalText()
     * @generated
     */
    EClass MD_ATTRIBUTE_LOCAL_TEXT = eINSTANCE.getMdAttributeLocalText();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_LOCAL_TEXT__DEFAULT_VALUE = eINSTANCE.getMdAttributeLocalText_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLongImpl <em>Md Attribute Long</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MdAttributeLongImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMdAttributeLong()
     * @generated
     */
    EClass MD_ATTRIBUTE_LONG = eINSTANCE.getMdAttributeLong();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_LONG__DEFAULT_VALUE = eINSTANCE.getMdAttributeLong_DefaultValue();

  }

} //RunwayPackage
