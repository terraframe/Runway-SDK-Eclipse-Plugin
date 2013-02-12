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
   * The feature id for the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_BUSINESS__COLUMN = 3;

  /**
   * The feature id for the '<em><b>Is Removable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_BUSINESS__IS_REMOVABLE = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_BUSINESS__DESCRIPTION = 5;

  /**
   * The feature id for the '<em><b>Is Extendable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_BUSINESS__IS_EXTENDABLE = 6;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_BUSINESS__IS_ABSTRACT = 7;

  /**
   * The feature id for the '<em><b>Extends</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_BUSINESS__EXTENDS = 8;

  /**
   * The feature id for the '<em><b>Cache Algorithm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_BUSINESS__CACHE_ALGORITHM = 9;

  /**
   * The feature id for the '<em><b>Cache Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_BUSINESS__CACHE_SIZE = 10;

  /**
   * The feature id for the '<em><b>Publish</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_BUSINESS__PUBLISH = 11;

  /**
   * The number of structural features of the '<em>MD Business</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_BUSINESS_FEATURE_COUNT = 12;

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
   * The feature id for the '<em><b>MD Businesses</b></em>' containment reference list.
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
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeBlobImpl <em>MD Attribute Blob</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeBlobImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeBlob()
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
   * The number of structural features of the '<em>MD Attribute Blob</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BLOB_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeBooleanImpl <em>MD Attribute Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeBooleanImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeBoolean()
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
   * The number of structural features of the '<em>MD Attribute Boolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_BOOLEAN_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeCharacterImpl <em>MD Attribute Character</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeCharacterImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeCharacter()
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
   * The number of structural features of the '<em>MD Attribute Character</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_CHARACTER_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDateImpl <em>MD Attribute Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDateImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeDate()
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
   * The number of structural features of the '<em>MD Attribute Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDateTimeImpl <em>MD Attribute Date Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDateTimeImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeDateTime()
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
   * The number of structural features of the '<em>MD Attribute Date Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DATE_TIME_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDecimalImpl <em>MD Attribute Decimal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDecimalImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeDecimal()
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
   * The number of structural features of the '<em>MD Attribute Decimal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DECIMAL_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDoubleImpl <em>MD Attribute Double</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDoubleImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeDouble()
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
   * The number of structural features of the '<em>MD Attribute Double</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_DOUBLE_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeEnumerationImpl <em>MD Attribute Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeEnumerationImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeEnumeration()
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
   * The number of structural features of the '<em>MD Attribute Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_ENUMERATION_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeFloatImpl <em>MD Attribute Float</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeFloatImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeFloat()
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
   * The number of structural features of the '<em>MD Attribute Float</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_FLOAT_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeHashImpl <em>MD Attribute Hash</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeHashImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeHash()
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
   * The number of structural features of the '<em>MD Attribute Hash</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_HASH_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeIntegerImpl <em>MD Attribute Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeIntegerImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeInteger()
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
   * The number of structural features of the '<em>MD Attribute Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_INTEGER_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeNumberImpl <em>MD Attribute Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeNumberImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeNumber()
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
   * The number of structural features of the '<em>MD Attribute Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_NUMBER_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeStructImpl <em>MD Attribute Struct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeStructImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeStruct()
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
   * The number of structural features of the '<em>MD Attribute Struct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_STRUCT_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeTextImpl <em>MD Attribute Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeTextImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeText()
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
   * The number of structural features of the '<em>MD Attribute Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TEXT_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeTimeImpl <em>MD Attribute Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeTimeImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeTime()
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
   * The number of structural features of the '<em>MD Attribute Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_TIME_FEATURE_COUNT = MD_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLocalImpl <em>MD Attribute Local</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLocalImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeLocal()
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
   * The number of structural features of the '<em>MD Attribute Local</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_FEATURE_COUNT = MD_ATTRIBUTE_STRUCT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLocalCharacterImpl <em>MD Attribute Local Character</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLocalCharacterImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeLocalCharacter()
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
   * The number of structural features of the '<em>MD Attribute Local Character</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_CHARACTER_FEATURE_COUNT = MD_ATTRIBUTE_LOCAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLocalTextImpl <em>MD Attribute Local Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLocalTextImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeLocalText()
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
   * The number of structural features of the '<em>MD Attribute Local Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MD_ATTRIBUTE_LOCAL_TEXT_FEATURE_COUNT = MD_ATTRIBUTE_LOCAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLongImpl <em>MD Attribute Long</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLongImpl
   * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeLong()
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
   * The number of structural features of the '<em>MD Attribute Long</em>' class.
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
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDBusiness#getColumn()
   * @see #getMDBusiness()
   * @generated
   */
  EAttribute getMDBusiness_Column();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#isIsRemovable <em>Is Removable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Removable</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDBusiness#isIsRemovable()
   * @see #getMDBusiness()
   * @generated
   */
  EAttribute getMDBusiness_IsRemovable();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDBusiness#getDescription()
   * @see #getMDBusiness()
   * @generated
   */
  EAttribute getMDBusiness_Description();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#isIsExtendable <em>Is Extendable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Extendable</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDBusiness#isIsExtendable()
   * @see #getMDBusiness()
   * @generated
   */
  EAttribute getMDBusiness_IsExtendable();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDBusiness#isIsAbstract()
   * @see #getMDBusiness()
   * @generated
   */
  EAttribute getMDBusiness_IsAbstract();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extends</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDBusiness#getExtends()
   * @see #getMDBusiness()
   * @generated
   */
  EAttribute getMDBusiness_Extends();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getCacheAlgorithm <em>Cache Algorithm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cache Algorithm</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDBusiness#getCacheAlgorithm()
   * @see #getMDBusiness()
   * @generated
   */
  EAttribute getMDBusiness_CacheAlgorithm();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getCacheSize <em>Cache Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cache Size</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDBusiness#getCacheSize()
   * @see #getMDBusiness()
   * @generated
   */
  EAttribute getMDBusiness_CacheSize();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getPublish <em>Publish</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Publish</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDBusiness#getPublish()
   * @see #getMDBusiness()
   * @generated
   */
  EAttribute getMDBusiness_Publish();

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
   * Returns the meta object for the containment reference list '{@link com.runwaysdk.eclipse.plugin.runway.DocumentRoot#getMDBusinesses <em>MD Businesses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>MD Businesses</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.DocumentRoot#getMDBusinesses()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_MDBusinesses();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeBlob <em>MD Attribute Blob</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Blob</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeBlob
   * @generated
   */
  EClass getMDAttributeBlob();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeBlob#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeBlob#getDefaultValue()
   * @see #getMDAttributeBlob()
   * @generated
   */
  EAttribute getMDAttributeBlob_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeBoolean <em>MD Attribute Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Boolean</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeBoolean
   * @generated
   */
  EClass getMDAttributeBoolean();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeBoolean#isDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeBoolean#isDefaultValue()
   * @see #getMDAttributeBoolean()
   * @generated
   */
  EAttribute getMDAttributeBoolean_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeCharacter <em>MD Attribute Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Character</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeCharacter
   * @generated
   */
  EClass getMDAttributeCharacter();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeCharacter#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeCharacter#getDefaultValue()
   * @see #getMDAttributeCharacter()
   * @generated
   */
  EAttribute getMDAttributeCharacter_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDate <em>MD Attribute Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Date</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeDate
   * @generated
   */
  EClass getMDAttributeDate();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDate#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeDate#getDefaultValue()
   * @see #getMDAttributeDate()
   * @generated
   */
  EAttribute getMDAttributeDate_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDateTime <em>MD Attribute Date Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Date Time</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeDateTime
   * @generated
   */
  EClass getMDAttributeDateTime();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDateTime#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeDateTime#getDefaultValue()
   * @see #getMDAttributeDateTime()
   * @generated
   */
  EAttribute getMDAttributeDateTime_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal <em>MD Attribute Decimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Decimal</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal
   * @generated
   */
  EClass getMDAttributeDecimal();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal#getDefaultValue()
   * @see #getMDAttributeDecimal()
   * @generated
   */
  EAttribute getMDAttributeDecimal_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDouble <em>MD Attribute Double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Double</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeDouble
   * @generated
   */
  EClass getMDAttributeDouble();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDouble#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeDouble#getDefaultValue()
   * @see #getMDAttributeDouble()
   * @generated
   */
  EAttribute getMDAttributeDouble_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeEnumeration <em>MD Attribute Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Enumeration</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeEnumeration
   * @generated
   */
  EClass getMDAttributeEnumeration();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeEnumeration#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeEnumeration#getDefaultValue()
   * @see #getMDAttributeEnumeration()
   * @generated
   */
  EAttribute getMDAttributeEnumeration_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeFloat <em>MD Attribute Float</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Float</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeFloat
   * @generated
   */
  EClass getMDAttributeFloat();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeFloat#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeFloat#getDefaultValue()
   * @see #getMDAttributeFloat()
   * @generated
   */
  EAttribute getMDAttributeFloat_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeHash <em>MD Attribute Hash</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Hash</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeHash
   * @generated
   */
  EClass getMDAttributeHash();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeHash#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeHash#getDefaultValue()
   * @see #getMDAttributeHash()
   * @generated
   */
  EAttribute getMDAttributeHash_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeInteger <em>MD Attribute Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Integer</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeInteger
   * @generated
   */
  EClass getMDAttributeInteger();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeInteger#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeInteger#getDefaultValue()
   * @see #getMDAttributeInteger()
   * @generated
   */
  EAttribute getMDAttributeInteger_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeNumber <em>MD Attribute Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Number</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeNumber
   * @generated
   */
  EClass getMDAttributeNumber();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeNumber#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeNumber#getDefaultValue()
   * @see #getMDAttributeNumber()
   * @generated
   */
  EAttribute getMDAttributeNumber_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeStruct <em>MD Attribute Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Struct</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeStruct
   * @generated
   */
  EClass getMDAttributeStruct();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeText <em>MD Attribute Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Text</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeText
   * @generated
   */
  EClass getMDAttributeText();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeText#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeText#getDefaultValue()
   * @see #getMDAttributeText()
   * @generated
   */
  EAttribute getMDAttributeText_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeTime <em>MD Attribute Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Time</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeTime
   * @generated
   */
  EClass getMDAttributeTime();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeTime#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeTime#getDefaultValue()
   * @see #getMDAttributeTime()
   * @generated
   */
  EAttribute getMDAttributeTime_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLocal <em>MD Attribute Local</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Local</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeLocal
   * @generated
   */
  EClass getMDAttributeLocal();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalCharacter <em>MD Attribute Local Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Local Character</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalCharacter
   * @generated
   */
  EClass getMDAttributeLocalCharacter();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalCharacter#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalCharacter#getDefaultValue()
   * @see #getMDAttributeLocalCharacter()
   * @generated
   */
  EAttribute getMDAttributeLocalCharacter_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalText <em>MD Attribute Local Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Local Text</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalText
   * @generated
   */
  EClass getMDAttributeLocalText();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalText#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalText#getDefaultValue()
   * @see #getMDAttributeLocalText()
   * @generated
   */
  EAttribute getMDAttributeLocalText_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLong <em>MD Attribute Long</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MD Attribute Long</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeLong
   * @generated
   */
  EClass getMDAttributeLong();

  /**
   * Returns the meta object for the attribute '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeLong#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.runwaysdk.eclipse.plugin.runway.MDAttributeLong#getDefaultValue()
   * @see #getMDAttributeLong()
   * @generated
   */
  EAttribute getMDAttributeLong_DefaultValue();

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
     * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_BUSINESS__COLUMN = eINSTANCE.getMDBusiness_Column();

    /**
     * The meta object literal for the '<em><b>Is Removable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_BUSINESS__IS_REMOVABLE = eINSTANCE.getMDBusiness_IsRemovable();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_BUSINESS__DESCRIPTION = eINSTANCE.getMDBusiness_Description();

    /**
     * The meta object literal for the '<em><b>Is Extendable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_BUSINESS__IS_EXTENDABLE = eINSTANCE.getMDBusiness_IsExtendable();

    /**
     * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_BUSINESS__IS_ABSTRACT = eINSTANCE.getMDBusiness_IsAbstract();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_BUSINESS__EXTENDS = eINSTANCE.getMDBusiness_Extends();

    /**
     * The meta object literal for the '<em><b>Cache Algorithm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_BUSINESS__CACHE_ALGORITHM = eINSTANCE.getMDBusiness_CacheAlgorithm();

    /**
     * The meta object literal for the '<em><b>Cache Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_BUSINESS__CACHE_SIZE = eINSTANCE.getMDBusiness_CacheSize();

    /**
     * The meta object literal for the '<em><b>Publish</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_BUSINESS__PUBLISH = eINSTANCE.getMDBusiness_Publish();

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
     * The meta object literal for the '<em><b>MD Businesses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__MD_BUSINESSES = eINSTANCE.getDocumentRoot_MDBusinesses();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeBlobImpl <em>MD Attribute Blob</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeBlobImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeBlob()
     * @generated
     */
    EClass MD_ATTRIBUTE_BLOB = eINSTANCE.getMDAttributeBlob();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_BLOB__DEFAULT_VALUE = eINSTANCE.getMDAttributeBlob_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeBooleanImpl <em>MD Attribute Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeBooleanImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeBoolean()
     * @generated
     */
    EClass MD_ATTRIBUTE_BOOLEAN = eINSTANCE.getMDAttributeBoolean();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_BOOLEAN__DEFAULT_VALUE = eINSTANCE.getMDAttributeBoolean_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeCharacterImpl <em>MD Attribute Character</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeCharacterImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeCharacter()
     * @generated
     */
    EClass MD_ATTRIBUTE_CHARACTER = eINSTANCE.getMDAttributeCharacter();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_CHARACTER__DEFAULT_VALUE = eINSTANCE.getMDAttributeCharacter_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDateImpl <em>MD Attribute Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDateImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeDate()
     * @generated
     */
    EClass MD_ATTRIBUTE_DATE = eINSTANCE.getMDAttributeDate();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_DATE__DEFAULT_VALUE = eINSTANCE.getMDAttributeDate_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDateTimeImpl <em>MD Attribute Date Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDateTimeImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeDateTime()
     * @generated
     */
    EClass MD_ATTRIBUTE_DATE_TIME = eINSTANCE.getMDAttributeDateTime();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_DATE_TIME__DEFAULT_VALUE = eINSTANCE.getMDAttributeDateTime_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDecimalImpl <em>MD Attribute Decimal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDecimalImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeDecimal()
     * @generated
     */
    EClass MD_ATTRIBUTE_DECIMAL = eINSTANCE.getMDAttributeDecimal();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_DECIMAL__DEFAULT_VALUE = eINSTANCE.getMDAttributeDecimal_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDoubleImpl <em>MD Attribute Double</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeDoubleImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeDouble()
     * @generated
     */
    EClass MD_ATTRIBUTE_DOUBLE = eINSTANCE.getMDAttributeDouble();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_DOUBLE__DEFAULT_VALUE = eINSTANCE.getMDAttributeDouble_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeEnumerationImpl <em>MD Attribute Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeEnumerationImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeEnumeration()
     * @generated
     */
    EClass MD_ATTRIBUTE_ENUMERATION = eINSTANCE.getMDAttributeEnumeration();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_ENUMERATION__DEFAULT_VALUE = eINSTANCE.getMDAttributeEnumeration_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeFloatImpl <em>MD Attribute Float</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeFloatImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeFloat()
     * @generated
     */
    EClass MD_ATTRIBUTE_FLOAT = eINSTANCE.getMDAttributeFloat();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_FLOAT__DEFAULT_VALUE = eINSTANCE.getMDAttributeFloat_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeHashImpl <em>MD Attribute Hash</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeHashImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeHash()
     * @generated
     */
    EClass MD_ATTRIBUTE_HASH = eINSTANCE.getMDAttributeHash();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_HASH__DEFAULT_VALUE = eINSTANCE.getMDAttributeHash_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeIntegerImpl <em>MD Attribute Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeIntegerImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeInteger()
     * @generated
     */
    EClass MD_ATTRIBUTE_INTEGER = eINSTANCE.getMDAttributeInteger();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_INTEGER__DEFAULT_VALUE = eINSTANCE.getMDAttributeInteger_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeNumberImpl <em>MD Attribute Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeNumberImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeNumber()
     * @generated
     */
    EClass MD_ATTRIBUTE_NUMBER = eINSTANCE.getMDAttributeNumber();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_NUMBER__DEFAULT_VALUE = eINSTANCE.getMDAttributeNumber_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeStructImpl <em>MD Attribute Struct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeStructImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeStruct()
     * @generated
     */
    EClass MD_ATTRIBUTE_STRUCT = eINSTANCE.getMDAttributeStruct();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeTextImpl <em>MD Attribute Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeTextImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeText()
     * @generated
     */
    EClass MD_ATTRIBUTE_TEXT = eINSTANCE.getMDAttributeText();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_TEXT__DEFAULT_VALUE = eINSTANCE.getMDAttributeText_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeTimeImpl <em>MD Attribute Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeTimeImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeTime()
     * @generated
     */
    EClass MD_ATTRIBUTE_TIME = eINSTANCE.getMDAttributeTime();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_TIME__DEFAULT_VALUE = eINSTANCE.getMDAttributeTime_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLocalImpl <em>MD Attribute Local</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLocalImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeLocal()
     * @generated
     */
    EClass MD_ATTRIBUTE_LOCAL = eINSTANCE.getMDAttributeLocal();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLocalCharacterImpl <em>MD Attribute Local Character</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLocalCharacterImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeLocalCharacter()
     * @generated
     */
    EClass MD_ATTRIBUTE_LOCAL_CHARACTER = eINSTANCE.getMDAttributeLocalCharacter();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_LOCAL_CHARACTER__DEFAULT_VALUE = eINSTANCE.getMDAttributeLocalCharacter_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLocalTextImpl <em>MD Attribute Local Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLocalTextImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeLocalText()
     * @generated
     */
    EClass MD_ATTRIBUTE_LOCAL_TEXT = eINSTANCE.getMDAttributeLocalText();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_LOCAL_TEXT__DEFAULT_VALUE = eINSTANCE.getMDAttributeLocalText_DefaultValue();

    /**
     * The meta object literal for the '{@link com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLongImpl <em>MD Attribute Long</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.runwaysdk.eclipse.plugin.runway.impl.MDAttributeLongImpl
     * @see com.runwaysdk.eclipse.plugin.runway.impl.RunwayPackageImpl#getMDAttributeLong()
     * @generated
     */
    EClass MD_ATTRIBUTE_LONG = eINSTANCE.getMDAttributeLong();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MD_ATTRIBUTE_LONG__DEFAULT_VALUE = eINSTANCE.getMDAttributeLong_DefaultValue();

  }

} //RunwayPackage
