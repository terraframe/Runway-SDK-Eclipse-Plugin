/**
 */
package com.runwaysdk.eclipse.plugin.runway.impl;

import com.runwaysdk.eclipse.plugin.runway.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RunwayFactoryImpl extends EFactoryImpl implements RunwayFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RunwayFactory init()
  {
    try
    {
      RunwayFactory theRunwayFactory = (RunwayFactory)EPackage.Registry.INSTANCE.getEFactory("runway"); 
      if (theRunwayFactory != null)
      {
        return theRunwayFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RunwayFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunwayFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RunwayPackage.MD_BUSINESS: return createMDBusiness();
      case RunwayPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case RunwayPackage.MD_ATTRIBUTE_BLOB: return createMDAttributeBlob();
      case RunwayPackage.MD_ATTRIBUTE_BOOLEAN: return createMDAttributeBoolean();
      case RunwayPackage.MD_ATTRIBUTE_CHARACTER: return createMDAttributeCharacter();
      case RunwayPackage.MD_ATTRIBUTE_DATE: return createMDAttributeDate();
      case RunwayPackage.MD_ATTRIBUTE_DATE_TIME: return createMDAttributeDateTime();
      case RunwayPackage.MD_ATTRIBUTE_DECIMAL: return createMDAttributeDecimal();
      case RunwayPackage.MD_ATTRIBUTE_DOUBLE: return createMDAttributeDouble();
      case RunwayPackage.MD_ATTRIBUTE_ENUMERATION: return createMDAttributeEnumeration();
      case RunwayPackage.MD_ATTRIBUTE_FLOAT: return createMDAttributeFloat();
      case RunwayPackage.MD_ATTRIBUTE_HASH: return createMDAttributeHash();
      case RunwayPackage.MD_ATTRIBUTE_INTEGER: return createMDAttributeInteger();
      case RunwayPackage.MD_ATTRIBUTE_NUMBER: return createMDAttributeNumber();
      case RunwayPackage.MD_ATTRIBUTE_STRUCT: return createMDAttributeStruct();
      case RunwayPackage.MD_ATTRIBUTE_TEXT: return createMDAttributeText();
      case RunwayPackage.MD_ATTRIBUTE_TIME: return createMDAttributeTime();
      case RunwayPackage.MD_ATTRIBUTE_LOCAL_CHARACTER: return createMDAttributeLocalCharacter();
      case RunwayPackage.MD_ATTRIBUTE_LOCAL_TEXT: return createMDAttributeLocalText();
      case RunwayPackage.MD_ATTRIBUTE_LONG: return createMDAttributeLong();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDBusiness createMDBusiness()
  {
    MDBusinessImpl mdBusiness = new MDBusinessImpl();
    return mdBusiness;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot()
  {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeBlob createMDAttributeBlob()
  {
    MDAttributeBlobImpl mdAttributeBlob = new MDAttributeBlobImpl();
    return mdAttributeBlob;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeBoolean createMDAttributeBoolean()
  {
    MDAttributeBooleanImpl mdAttributeBoolean = new MDAttributeBooleanImpl();
    return mdAttributeBoolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeCharacter createMDAttributeCharacter()
  {
    MDAttributeCharacterImpl mdAttributeCharacter = new MDAttributeCharacterImpl();
    return mdAttributeCharacter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeDate createMDAttributeDate()
  {
    MDAttributeDateImpl mdAttributeDate = new MDAttributeDateImpl();
    return mdAttributeDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeDateTime createMDAttributeDateTime()
  {
    MDAttributeDateTimeImpl mdAttributeDateTime = new MDAttributeDateTimeImpl();
    return mdAttributeDateTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeDecimal createMDAttributeDecimal()
  {
    MDAttributeDecimalImpl mdAttributeDecimal = new MDAttributeDecimalImpl();
    return mdAttributeDecimal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeDouble createMDAttributeDouble()
  {
    MDAttributeDoubleImpl mdAttributeDouble = new MDAttributeDoubleImpl();
    return mdAttributeDouble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeEnumeration createMDAttributeEnumeration()
  {
    MDAttributeEnumerationImpl mdAttributeEnumeration = new MDAttributeEnumerationImpl();
    return mdAttributeEnumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeFloat createMDAttributeFloat()
  {
    MDAttributeFloatImpl mdAttributeFloat = new MDAttributeFloatImpl();
    return mdAttributeFloat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeHash createMDAttributeHash()
  {
    MDAttributeHashImpl mdAttributeHash = new MDAttributeHashImpl();
    return mdAttributeHash;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeInteger createMDAttributeInteger()
  {
    MDAttributeIntegerImpl mdAttributeInteger = new MDAttributeIntegerImpl();
    return mdAttributeInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeNumber createMDAttributeNumber()
  {
    MDAttributeNumberImpl mdAttributeNumber = new MDAttributeNumberImpl();
    return mdAttributeNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeStruct createMDAttributeStruct()
  {
    MDAttributeStructImpl mdAttributeStruct = new MDAttributeStructImpl();
    return mdAttributeStruct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeText createMDAttributeText()
  {
    MDAttributeTextImpl mdAttributeText = new MDAttributeTextImpl();
    return mdAttributeText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeTime createMDAttributeTime()
  {
    MDAttributeTimeImpl mdAttributeTime = new MDAttributeTimeImpl();
    return mdAttributeTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeLocalCharacter createMDAttributeLocalCharacter()
  {
    MDAttributeLocalCharacterImpl mdAttributeLocalCharacter = new MDAttributeLocalCharacterImpl();
    return mdAttributeLocalCharacter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeLocalText createMDAttributeLocalText()
  {
    MDAttributeLocalTextImpl mdAttributeLocalText = new MDAttributeLocalTextImpl();
    return mdAttributeLocalText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDAttributeLong createMDAttributeLong()
  {
    MDAttributeLongImpl mdAttributeLong = new MDAttributeLongImpl();
    return mdAttributeLong;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunwayPackage getRunwayPackage()
  {
    return (RunwayPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RunwayPackage getPackage()
  {
    return RunwayPackage.eINSTANCE;
  }

} //RunwayFactoryImpl
