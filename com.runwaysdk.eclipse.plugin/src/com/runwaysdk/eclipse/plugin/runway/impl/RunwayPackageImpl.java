/**
 */
package com.runwaysdk.eclipse.plugin.runway.impl;

import com.runwaysdk.eclipse.plugin.runway.DocumentRoot;
import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeBlob;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeBoolean;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeCharacter;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeDate;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeDateTime;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeDecimal;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeDouble;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeEnumeration;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeFloat;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeHash;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeInteger;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeLocal;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalCharacter;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeLocalText;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeLong;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeNumber;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeStruct;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeText;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeTime;
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
  public EClass getMDBusiness()
  {
    return mdBusinessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDBusiness_ClassName()
  {
    return (EAttribute)mdBusinessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMDBusiness_Attributes()
  {
    return (EReference)mdBusinessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDBusiness_DisplayLabel()
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
  public EAttribute getMDAttribute_Description()
  {
    return (EAttribute)mdAttributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDAttribute_DisplayLabel()
  {
    return (EAttribute)mdAttributeEClass.getEStructuralFeatures().get(4);
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
  public EReference getDocumentRoot_MdBusinesses()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeBlob()
  {
    return mdAttributeBlobEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeBlob_DefaultValue()
  {
    return (EAttribute)mdAttributeBlobEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeBoolean()
  {
    return mdAttributeBooleanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeBoolean_DefaultValue()
  {
    return (EAttribute)mdAttributeBooleanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeCharacter()
  {
    return mdAttributeCharacterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeCharacter_DefaultValue()
  {
    return (EAttribute)mdAttributeCharacterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeDate()
  {
    return mdAttributeDateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeDate_DefaultValue()
  {
    return (EAttribute)mdAttributeDateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeDateTime()
  {
    return mdAttributeDateTimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeDateTime_DefaultValue()
  {
    return (EAttribute)mdAttributeDateTimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeDecimal()
  {
    return mdAttributeDecimalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeDecimal_DefaultValue()
  {
    return (EAttribute)mdAttributeDecimalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeDouble()
  {
    return mdAttributeDoubleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeDouble_DefaultValue()
  {
    return (EAttribute)mdAttributeDoubleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeEnumeration()
  {
    return mdAttributeEnumerationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeEnumeration_DefaultValue()
  {
    return (EAttribute)mdAttributeEnumerationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeFloat()
  {
    return mdAttributeFloatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeFloat_DefaultValue()
  {
    return (EAttribute)mdAttributeFloatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeHash()
  {
    return mdAttributeHashEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeHash_DefaultValue()
  {
    return (EAttribute)mdAttributeHashEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeInteger()
  {
    return mdAttributeIntegerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeInteger_DefaultValue()
  {
    return (EAttribute)mdAttributeIntegerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeNumber()
  {
    return mdAttributeNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeNumber_DefaultValue()
  {
    return (EAttribute)mdAttributeNumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeStruct()
  {
    return mdAttributeStructEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeText()
  {
    return mdAttributeTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeText_DefaultValue()
  {
    return (EAttribute)mdAttributeTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeTime()
  {
    return mdAttributeTimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeTime_DefaultValue()
  {
    return (EAttribute)mdAttributeTimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeLocal()
  {
    return mdAttributeLocalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeLocalCharacter()
  {
    return mdAttributeLocalCharacterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeLocalCharacter_DefaultValue()
  {
    return (EAttribute)mdAttributeLocalCharacterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeLocalText()
  {
    return mdAttributeLocalTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeLocalText_DefaultValue()
  {
    return (EAttribute)mdAttributeLocalTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMdAttributeLong()
  {
    return mdAttributeLongEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMdAttributeLong_DefaultValue()
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
    mdBusinessEClass = createEClass(MD_BUSINESS);
    createEAttribute(mdBusinessEClass, MD_BUSINESS__CLASS_NAME);
    createEReference(mdBusinessEClass, MD_BUSINESS__ATTRIBUTES);
    createEAttribute(mdBusinessEClass, MD_BUSINESS__DISPLAY_LABEL);

    mdAttributeEClass = createEClass(MD_ATTRIBUTE);
    createEAttribute(mdAttributeEClass, MD_ATTRIBUTE__NAME);
    createEAttribute(mdAttributeEClass, MD_ATTRIBUTE__REQUIRED);
    createEAttribute(mdAttributeEClass, MD_ATTRIBUTE__IMMUTABLE);
    createEAttribute(mdAttributeEClass, MD_ATTRIBUTE__DESCRIPTION);
    createEAttribute(mdAttributeEClass, MD_ATTRIBUTE__DISPLAY_LABEL);

    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__MD_BUSINESSES);

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
    mdAttributeLocalEClass.getESuperTypes().add(this.getMdAttributeStruct());
    mdAttributeLocalCharacterEClass.getESuperTypes().add(this.getMdAttributeLocal());
    mdAttributeLocalTextEClass.getESuperTypes().add(this.getMdAttributeLocal());
    mdAttributeLongEClass.getESuperTypes().add(this.getMDAttribute());

    // Initialize classes and features; add operations and parameters
    initEClass(mdBusinessEClass, MDBusiness.class, "MDBusiness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDBusiness_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, MDBusiness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMDBusiness_Attributes(), this.getMDAttribute(), null, "attributes", null, 0, -1, MDBusiness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMDBusiness_DisplayLabel(), ecorePackage.getEString(), "displayLabel", null, 0, 1, MDBusiness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeEClass, MDAttribute.class, "MDAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMDAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, MDAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMDAttribute_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, MDAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMDAttribute_Immutable(), ecorePackage.getEBoolean(), "immutable", null, 0, 1, MDAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMDAttribute_Description(), ecorePackage.getEString(), "description", null, 0, 1, MDAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMDAttribute_DisplayLabel(), ecorePackage.getEString(), "displayLabel", null, 0, 1, MDAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDocumentRoot_MdBusinesses(), this.getMDBusiness(), null, "MdBusinesses", null, 0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeBlobEClass, MdAttributeBlob.class, "MdAttributeBlob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeBlob_DefaultValue(), ecorePackage.getEByteArray(), "defaultValue", null, 0, 1, MdAttributeBlob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeBooleanEClass, MdAttributeBoolean.class, "MdAttributeBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeBoolean_DefaultValue(), ecorePackage.getEBoolean(), "defaultValue", null, 0, 1, MdAttributeBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeCharacterEClass, MdAttributeCharacter.class, "MdAttributeCharacter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeCharacter_DefaultValue(), ecorePackage.getEChar(), "defaultValue", null, 0, 1, MdAttributeCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeDateEClass, MdAttributeDate.class, "MdAttributeDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeDate_DefaultValue(), ecorePackage.getEDate(), "defaultValue", null, 0, 1, MdAttributeDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeDateTimeEClass, MdAttributeDateTime.class, "MdAttributeDateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeDateTime_DefaultValue(), ecorePackage.getEDate(), "defaultValue", null, 0, 1, MdAttributeDateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeDecimalEClass, MdAttributeDecimal.class, "MdAttributeDecimal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeDecimal_DefaultValue(), ecorePackage.getEFloat(), "defaultValue", null, 0, 1, MdAttributeDecimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeDoubleEClass, MdAttributeDouble.class, "MdAttributeDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeDouble_DefaultValue(), ecorePackage.getEDouble(), "defaultValue", null, 0, 1, MdAttributeDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeEnumerationEClass, MdAttributeEnumeration.class, "MdAttributeEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeEnumeration_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, MdAttributeEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeFloatEClass, MdAttributeFloat.class, "MdAttributeFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeFloat_DefaultValue(), ecorePackage.getEFloat(), "defaultValue", null, 0, 1, MdAttributeFloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeHashEClass, MdAttributeHash.class, "MdAttributeHash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeHash_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, MdAttributeHash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeIntegerEClass, MdAttributeInteger.class, "MdAttributeInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeInteger_DefaultValue(), ecorePackage.getEInt(), "defaultValue", null, 0, 1, MdAttributeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeNumberEClass, MdAttributeNumber.class, "MdAttributeNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeNumber_DefaultValue(), ecorePackage.getEDouble(), "defaultValue", null, 0, 1, MdAttributeNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeStructEClass, MdAttributeStruct.class, "MdAttributeStruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mdAttributeTextEClass, MdAttributeText.class, "MdAttributeText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeText_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, MdAttributeText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeTimeEClass, MdAttributeTime.class, "MdAttributeTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeTime_DefaultValue(), ecorePackage.getEDate(), "defaultValue", null, 0, 1, MdAttributeTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeLocalEClass, MdAttributeLocal.class, "MdAttributeLocal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mdAttributeLocalCharacterEClass, MdAttributeLocalCharacter.class, "MdAttributeLocalCharacter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeLocalCharacter_DefaultValue(), ecorePackage.getEChar(), "defaultValue", null, 0, 1, MdAttributeLocalCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeLocalTextEClass, MdAttributeLocalText.class, "MdAttributeLocalText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeLocalText_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, MdAttributeLocalText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mdAttributeLongEClass, MdAttributeLong.class, "MdAttributeLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMdAttributeLong_DefaultValue(), ecorePackage.getELong(), "defaultValue", null, 0, 1, MdAttributeLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RunwayPackageImpl
