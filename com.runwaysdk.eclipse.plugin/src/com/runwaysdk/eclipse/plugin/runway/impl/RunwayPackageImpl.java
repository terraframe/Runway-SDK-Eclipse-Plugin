/**
 */
package com.runwaysdk.eclipse.plugin.runway.impl;

import com.runwaysdk.eclipse.plugin.runway.DocumentRoot;
import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeBlob;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeBoolean;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeCharacter;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeDate;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeDateTime;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeDouble;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeEnumeration;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeFloat;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeHash;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeInteger;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeLocal;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalCharacter;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalText;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeLong;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeNumber;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeStruct;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeText;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeTime;
import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.MDClass;
import com.runwaysdk.eclipse.plugin.runway.MDElement;
import com.runwaysdk.eclipse.plugin.runway.MDEntity;
import com.runwaysdk.eclipse.plugin.runway.MDType;
import com.runwaysdk.eclipse.plugin.runway.MetaData;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RunwayPackageImpl extends EPackageImpl implements RunwayPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdBusinessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeBlobEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeBooleanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeCharacterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeDateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeDateTimeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeDecimalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeDoubleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeEnumerationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeFloatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeHashEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeIntegerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeNumberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeStructEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeTimeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeLocalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeLocalCharacterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeLocalTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mdAttributeLongEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RunwayPackageImpl()
  {
    super(eNS_URI, RunwayFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RunwayPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RunwayPackage init()
  {
    if (isInited) return (RunwayPackage)EPackage.Registry.INSTANCE.getEPackage(RunwayPackage.eNS_URI);

    // Obtain or create and register package
    RunwayPackageImpl theRunwayPackage = (RunwayPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RunwayPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RunwayPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRunwayPackage.createPackageContents();

    // Initialize created meta-data
    theRunwayPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRunwayPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RunwayPackage.eNS_URI, theRunwayPackage);
    return theRunwayPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaData()
  {
    return metaDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaData_Label()
  {
    return (EAttribute)metaDataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaData_Description()
  {
    return (EAttribute)metaDataEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaData_Removable()
  {
    return (EAttribute)metaDataEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDType()
  {
    return mdTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDType_Name()
  {
    return (EAttribute)mdTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDType_Exported()
  {
    return (EAttribute)mdTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDClass()
  {
    return mdClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDClass_Publish()
  {
    return (EAttribute)mdClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMDClass_Attributes()
  {
    return (EReference)mdClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDEntity()
  {
    return mdEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDEntity_Table()
  {
    return (EAttribute)mdEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDEntity_GenerateController()
  {
    return (EAttribute)mdEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDEntity_EnforceSiteMaster()
  {
    return (EAttribute)mdEntityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDElement()
  {
    return mdElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDElement_Extendable()
  {
    return (EAttribute)mdElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDElement_IsAbstract()
  {
    return (EAttribute)mdElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDBusiness()
  {
    return mdBusinessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDBusiness_Extends()
  {
    return (EAttribute)mdBusinessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDBusiness_CacheAlgorithm()
  {
    return (EAttribute)mdBusinessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDBusiness_CacheSize()
  {
    return (EAttribute)mdBusinessEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttribute()
  {
    return mdAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttribute_Name()
  {
    return (EAttribute)mdAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttribute_Required()
  {
    return (EAttribute)mdAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttribute_Immutable()
  {
    return (EAttribute)mdAttributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttribute_DisplayLabel()
  {
    return (EAttribute)mdAttributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentRoot()
  {
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_MetaData()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeBlob()
  {
    return mdAttributeBlobEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeBlob_DefaultValue()
  {
    return (EAttribute)mdAttributeBlobEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeBoolean()
  {
    return mdAttributeBooleanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeBoolean_DefaultValue()
  {
    return (EAttribute)mdAttributeBooleanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeCharacter()
  {
    return mdAttributeCharacterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeCharacter_DefaultValue()
  {
    return (EAttribute)mdAttributeCharacterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeDate()
  {
    return mdAttributeDateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeDate_DefaultValue()
  {
    return (EAttribute)mdAttributeDateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeDateTime()
  {
    return mdAttributeDateTimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeDateTime_DefaultValue()
  {
    return (EAttribute)mdAttributeDateTimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeDecimal()
  {
    return mdAttributeDecimalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeDecimal_DefaultValue()
  {
    return (EAttribute)mdAttributeDecimalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeDouble()
  {
    return mdAttributeDoubleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeDouble_DefaultValue()
  {
    return (EAttribute)mdAttributeDoubleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeEnumeration()
  {
    return mdAttributeEnumerationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeEnumeration_DefaultValue()
  {
    return (EAttribute)mdAttributeEnumerationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeFloat()
  {
    return mdAttributeFloatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeFloat_DefaultValue()
  {
    return (EAttribute)mdAttributeFloatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeHash()
  {
    return mdAttributeHashEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeHash_DefaultValue()
  {
    return (EAttribute)mdAttributeHashEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeInteger()
  {
    return mdAttributeIntegerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeInteger_DefaultValue()
  {
    return (EAttribute)mdAttributeIntegerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeNumber()
  {
    return mdAttributeNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeNumber_DefaultValue()
  {
    return (EAttribute)mdAttributeNumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeStruct()
  {
    return mdAttributeStructEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeText()
  {
    return mdAttributeTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeText_DefaultValue()
  {
    return (EAttribute)mdAttributeTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeTime()
  {
    return mdAttributeTimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeTime_DefaultValue()
  {
    return (EAttribute)mdAttributeTimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeLocal()
  {
    return mdAttributeLocalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeLocalCharacter()
  {
    return mdAttributeLocalCharacterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeLocalCharacter_DefaultValue()
  {
    return (EAttribute)mdAttributeLocalCharacterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeLocalText()
  {
    return mdAttributeLocalTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeLocalText_DefaultValue()
  {
    return (EAttribute)mdAttributeLocalTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDAttributeLong()
  {
    return mdAttributeLongEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttributeLong_DefaultValue()
  {
    return (EAttribute)mdAttributeLongEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunwayFactory getRunwayFactory()
  {
    return (RunwayFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    metaDataEClass = createEClass(META_DATA);
    createEAttribute(metaDataEClass, META_DATA__LABEL);
    createEAttribute(metaDataEClass, META_DATA__DESCRIPTION);
    createEAttribute(metaDataEClass, META_DATA__REMOVABLE);

    mdTypeEClass = createEClass(MD_TYPE);
    createEAttribute(mdTypeEClass, MD_TYPE__NAME);
    createEAttribute(mdTypeEClass, MD_TYPE__EXPORTED);

    mdClassEClass = createEClass(MD_CLASS);
    createEAttribute(mdClassEClass, MD_CLASS__PUBLISH);
    createEReference(mdClassEClass, MD_CLASS__ATTRIBUTES);

    mdEntityEClass = createEClass(MD_ENTITY);
    createEAttribute(mdEntityEClass, MD_ENTITY__TABLE);
    createEAttribute(mdEntityEClass, MD_ENTITY__GENERATE_CONTROLLER);
    createEAttribute(mdEntityEClass, MD_ENTITY__ENFORCE_SITE_MASTER);

    mdElementEClass = createEClass(MD_ELEMENT);
    createEAttribute(mdElementEClass, MD_ELEMENT__EXTENDABLE);
    createEAttribute(mdElementEClass, MD_ELEMENT__IS_ABSTRACT);

    mdBusinessEClass = createEClass(MD_BUSINESS);
    createEAttribute(mdBusinessEClass, MD_BUSINESS__EXTENDS);
    createEAttribute(mdBusinessEClass, MD_BUSINESS__CACHE_ALGORITHM);
    createEAttribute(mdBusinessEClass, MD_BUSINESS__CACHE_SIZE);

    mdAttributeEClass = createEClass(MD_ATTRIBUTE);
    createEAttribute(mdAttributeEClass, MD_ATTRIBUTE__NAME);
    createEAttribute(mdAttributeEClass, MD_ATTRIBUTE__REQUIRED);
    createEAttribute(mdAttributeEClass, MD_ATTRIBUTE__IMMUTABLE);
    createEAttribute(mdAttributeEClass, MD_ATTRIBUTE__DISPLAY_LABEL);

    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__META_DATA);

    mdAttributeBlobEClass = createEClass(MD_ATTRIBUTE_BLOB);
    createEAttribute(mdAttributeBlobEClass, MD_ATTRIBUTE_BLOB__DEFAULT_VALUE);

    mdAttributeBooleanEClass = createEClass(MD_ATTRIBUTE_BOOLEAN);
    createEAttribute(mdAttributeBooleanEClass, MD_ATTRIBUTE_BOOLEAN__DEFAULT_VALUE);

    mdAttributeCharacterEClass = createEClass(MD_ATTRIBUTE_CHARACTER);
    createEAttribute(mdAttributeCharacterEClass, MD_ATTRIBUTE_CHARACTER__DEFAULT_VALUE);

    mdAttributeDateEClass = createEClass(MD_ATTRIBUTE_DATE);
    createEAttribute(mdAttributeDateEClass, MD_ATTRIBUTE_DATE__DEFAULT_VALUE);

    mdAttributeDateTimeEClass = createEClass(MD_ATTRIBUTE_DATE_TIME);
    createEAttribute(mdAttributeDateTimeEClass, MD_ATTRIBUTE_DATE_TIME__DEFAULT_VALUE);

    mdAttributeDecimalEClass = createEClass(MD_ATTRIBUTE_DECIMAL);
    createEAttribute(mdAttributeDecimalEClass, MD_ATTRIBUTE_DECIMAL__DEFAULT_VALUE);

    mdAttributeDoubleEClass = createEClass(MD_ATTRIBUTE_DOUBLE);
    createEAttribute(mdAttributeDoubleEClass, MD_ATTRIBUTE_DOUBLE__DEFAULT_VALUE);

    mdAttributeEnumerationEClass = createEClass(MD_ATTRIBUTE_ENUMERATION);
    createEAttribute(mdAttributeEnumerationEClass, MD_ATTRIBUTE_ENUMERATION__DEFAULT_VALUE);

    mdAttributeFloatEClass = createEClass(MD_ATTRIBUTE_FLOAT);
    createEAttribute(mdAttributeFloatEClass, MD_ATTRIBUTE_FLOAT__DEFAULT_VALUE);

    mdAttributeHashEClass = createEClass(MD_ATTRIBUTE_HASH);
    createEAttribute(mdAttributeHashEClass, MD_ATTRIBUTE_HASH__DEFAULT_VALUE);

    mdAttributeIntegerEClass = createEClass(MD_ATTRIBUTE_INTEGER);
    createEAttribute(mdAttributeIntegerEClass, MD_ATTRIBUTE_INTEGER__DEFAULT_VALUE);

    mdAttributeNumberEClass = createEClass(MD_ATTRIBUTE_NUMBER);
    createEAttribute(mdAttributeNumberEClass, MD_ATTRIBUTE_NUMBER__DEFAULT_VALUE);

    mdAttributeStructEClass = createEClass(MD_ATTRIBUTE_STRUCT);

    mdAttributeTextEClass = createEClass(MD_ATTRIBUTE_TEXT);
    createEAttribute(mdAttributeTextEClass, MD_ATTRIBUTE_TEXT__DEFAULT_VALUE);

    mdAttributeTimeEClass = createEClass(MD_ATTRIBUTE_TIME);
    createEAttribute(mdAttributeTimeEClass, MD_ATTRIBUTE_TIME__DEFAULT_VALUE);

    mdAttributeLocalEClass = createEClass(MD_ATTRIBUTE_LOCAL);

    mdAttributeLocalCharacterEClass = createEClass(MD_ATTRIBUTE_LOCAL_CHARACTER);
    createEAttribute(mdAttributeLocalCharacterEClass, MD_ATTRIBUTE_LOCAL_CHARACTER__DEFAULT_VALUE);

    mdAttributeLocalTextEClass = createEClass(MD_ATTRIBUTE_LOCAL_TEXT);
    createEAttribute(mdAttributeLocalTextEClass, MD_ATTRIBUTE_LOCAL_TEXT__DEFAULT_VALUE);

    mdAttributeLongEClass = createEClass(MD_ATTRIBUTE_LONG);
    createEAttribute(mdAttributeLongEClass, MD_ATTRIBUTE_LONG__DEFAULT_VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    mdTypeEClass.getESuperTypes().add(this.getMetaData());
    mdClassEClass.getESuperTypes().add(this.getMDType());
    mdEntityEClass.getESuperTypes().add(this.getMDClass());
    mdElementEClass.getESuperTypes().add(this.getMDEntity());
    mdBusinessEClass.getESuperTypes().add(this.getMDElement());
    mdAttributeEClass.getESuperTypes().add(this.getMetaData());
    mdAttributeBlobEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeBooleanEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeCharacterEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeDateEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeDateTimeEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeDecimalEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeDoubleEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeEnumerationEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeFloatEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeHashEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeIntegerEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeNumberEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeStructEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeTextEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeTimeEClass.getESuperTypes().add(this.getMDAttribute());
    mdAttributeLocalEClass.getESuperTypes().add(this.getMDAttributeStruct());
    mdAttributeLocalCharacterEClass.getESuperTypes().add(this.getMDAttributeLocal());
    mdAttributeLocalTextEClass.getESuperTypes().add(this.getMDAttributeLocal());
    mdAttributeLongEClass.getESuperTypes().add(this.getMDAttribute());

    // Initialize classes and features; add operations and parameters
    initEClass(metaDataEClass, MetaData.class, "MetaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetaData_Label(), ecorePackage.getEString(), "label", null, 0, 1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaData_Description(), ecorePackage.getEString(), "description", null, 0, 1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaData_Removable(), ecorePackage.getEString(), "removable", null, 0, 1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdTypeEClass, MDType.class, "MDType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDType_Name(), ecorePackage.getEString(), "name", null, 0, 1, MDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMDType_Exported(), ecorePackage.getEBoolean(), "exported", null, 0, 1, MDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdClassEClass, MDClass.class, "MDClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDClass_Publish(), ecorePackage.getEBoolean(), "publish", null, 0, 1, MDClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMDClass_Attributes(), this.getMDAttribute(), null, "attributes", null, 0, -1, MDClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdEntityEClass, MDEntity.class, "MDEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDEntity_Table(), ecorePackage.getEString(), "table", null, 0, 1, MDEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMDEntity_GenerateController(), ecorePackage.getEBoolean(), "generateController", null, 0, 1, MDEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMDEntity_EnforceSiteMaster(), ecorePackage.getEBoolean(), "enforceSiteMaster", null, 0, 1, MDEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdElementEClass, MDElement.class, "MDElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDElement_Extendable(), ecorePackage.getEBoolean(), "extendable", null, 0, 1, MDElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMDElement_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, MDElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdBusinessEClass, MDBusiness.class, "MDBusiness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDBusiness_Extends(), ecorePackage.getEString(), "extends", null, 0, 1, MDBusiness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMDBusiness_CacheAlgorithm(), ecorePackage.getEString(), "cacheAlgorithm", null, 0, 1, MDBusiness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMDBusiness_CacheSize(), ecorePackage.getEString(), "cacheSize", null, 0, 1, MDBusiness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeEClass, MDAttribute.class, "MDAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, MDAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMDAttribute_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, MDAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMDAttribute_Immutable(), ecorePackage.getEBoolean(), "immutable", null, 0, 1, MDAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMDAttribute_DisplayLabel(), ecorePackage.getEString(), "displayLabel", null, 0, 1, MDAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDocumentRoot_MetaData(), this.getMetaData(), null, "MetaData", null, 0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeBlobEClass, MDAttributeBlob.class, "MDAttributeBlob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeBlob_DefaultValue(), ecorePackage.getEByteArray(), "defaultValue", null, 0, 1, MDAttributeBlob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeBooleanEClass, MDAttributeBoolean.class, "MDAttributeBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeBoolean_DefaultValue(), ecorePackage.getEBoolean(), "defaultValue", null, 0, 1, MDAttributeBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeCharacterEClass, MDAttributeCharacter.class, "MDAttributeCharacter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeCharacter_DefaultValue(), ecorePackage.getEChar(), "defaultValue", null, 0, 1, MDAttributeCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeDateEClass, MDAttributeDate.class, "MDAttributeDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeDate_DefaultValue(), ecorePackage.getEDate(), "defaultValue", null, 0, 1, MDAttributeDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeDateTimeEClass, MDAttributeDateTime.class, "MDAttributeDateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeDateTime_DefaultValue(), ecorePackage.getEDate(), "defaultValue", null, 0, 1, MDAttributeDateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeDecimalEClass, MDAttributeDecimal.class, "MDAttributeDecimal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeDecimal_DefaultValue(), ecorePackage.getEFloat(), "defaultValue", null, 0, 1, MDAttributeDecimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeDoubleEClass, MDAttributeDouble.class, "MDAttributeDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeDouble_DefaultValue(), ecorePackage.getEDouble(), "defaultValue", null, 0, 1, MDAttributeDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeEnumerationEClass, MDAttributeEnumeration.class, "MDAttributeEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeEnumeration_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, MDAttributeEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeFloatEClass, MDAttributeFloat.class, "MDAttributeFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeFloat_DefaultValue(), ecorePackage.getEFloat(), "defaultValue", null, 0, 1, MDAttributeFloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeHashEClass, MDAttributeHash.class, "MDAttributeHash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeHash_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, MDAttributeHash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeIntegerEClass, MDAttributeInteger.class, "MDAttributeInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeInteger_DefaultValue(), ecorePackage.getEInt(), "defaultValue", null, 0, 1, MDAttributeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeNumberEClass, MDAttributeNumber.class, "MDAttributeNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeNumber_DefaultValue(), ecorePackage.getEDouble(), "defaultValue", null, 0, 1, MDAttributeNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeStructEClass, MDAttributeStruct.class, "MDAttributeStruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mdAttributeTextEClass, MDAttributeText.class, "MDAttributeText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeText_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, MDAttributeText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeTimeEClass, MDAttributeTime.class, "MDAttributeTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeTime_DefaultValue(), ecorePackage.getEDate(), "defaultValue", null, 0, 1, MDAttributeTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeLocalEClass, MDAttributeLocal.class, "MDAttributeLocal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mdAttributeLocalCharacterEClass, MDAttributeLocalCharacter.class, "MDAttributeLocalCharacter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeLocalCharacter_DefaultValue(), ecorePackage.getEChar(), "defaultValue", null, 0, 1, MDAttributeLocalCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeLocalTextEClass, MDAttributeLocalText.class, "MDAttributeLocalText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeLocalText_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, MDAttributeLocalText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeLongEClass, MDAttributeLong.class, "MDAttributeLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttributeLong_DefaultValue(), ecorePackage.getELong(), "defaultValue", null, 0, 1, MDAttributeLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RunwayPackageImpl
