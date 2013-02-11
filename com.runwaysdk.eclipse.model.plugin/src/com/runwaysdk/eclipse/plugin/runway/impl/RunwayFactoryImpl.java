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
      case RunwayPackage.MD_ATTRIBUTE_BLOB: return createMdAttributeBlob();
      case RunwayPackage.MD_ATTRIBUTE_BOOLEAN: return createMdAttributeBoolean();
      case RunwayPackage.MD_ATTRIBUTE_CHARACTER: return createMdAttributeCharacter();
      case RunwayPackage.MD_ATTRIBUTE_DATE: return createMdAttributeDate();
      case RunwayPackage.MD_ATTRIBUTE_DATE_TIME: return createMdAttributeDateTime();
      case RunwayPackage.MD_ATTRIBUTE_DECIMAL: return createMdAttributeDecimal();
      case RunwayPackage.MD_ATTRIBUTE_DOUBLE: return createMdAttributeDouble();
      case RunwayPackage.MD_ATTRIBUTE_ENUMERATION: return createMdAttributeEnumeration();
      case RunwayPackage.MD_ATTRIBUTE_FLOAT: return createMdAttributeFloat();
      case RunwayPackage.MD_ATTRIBUTE_HASH: return createMdAttributeHash();
      case RunwayPackage.MD_ATTRIBUTE_INTEGER: return createMdAttributeInteger();
      case RunwayPackage.MD_ATTRIBUTE_NUMBER: return createMdAttributeNumber();
      case RunwayPackage.MD_ATTRIBUTE_STRUCT: return createMdAttributeStruct();
      case RunwayPackage.MD_ATTRIBUTE_TEXT: return createMdAttributeText();
      case RunwayPackage.MD_ATTRIBUTE_TIME: return createMdAttributeTime();
      case RunwayPackage.MD_ATTRIBUTE_LOCAL_CHARACTER: return createMdAttributeLocalCharacter();
      case RunwayPackage.MD_ATTRIBUTE_LOCAL_TEXT: return createMdAttributeLocalText();
      case RunwayPackage.MD_ATTRIBUTE_LONG: return createMdAttributeLong();
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
  public MdAttributeBlob createMdAttributeBlob()
  {
    MdAttributeBlobImpl mdAttributeBlob = new MdAttributeBlobImpl();
    return mdAttributeBlob;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeBoolean createMdAttributeBoolean()
  {
    MdAttributeBooleanImpl mdAttributeBoolean = new MdAttributeBooleanImpl();
    return mdAttributeBoolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeCharacter createMdAttributeCharacter()
  {
    MdAttributeCharacterImpl mdAttributeCharacter = new MdAttributeCharacterImpl();
    return mdAttributeCharacter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeDate createMdAttributeDate()
  {
    MdAttributeDateImpl mdAttributeDate = new MdAttributeDateImpl();
    return mdAttributeDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeDateTime createMdAttributeDateTime()
  {
    MdAttributeDateTimeImpl mdAttributeDateTime = new MdAttributeDateTimeImpl();
    return mdAttributeDateTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeDecimal createMdAttributeDecimal()
  {
    MdAttributeDecimalImpl mdAttributeDecimal = new MdAttributeDecimalImpl();
    return mdAttributeDecimal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeDouble createMdAttributeDouble()
  {
    MdAttributeDoubleImpl mdAttributeDouble = new MdAttributeDoubleImpl();
    return mdAttributeDouble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeEnumeration createMdAttributeEnumeration()
  {
    MdAttributeEnumerationImpl mdAttributeEnumeration = new MdAttributeEnumerationImpl();
    return mdAttributeEnumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeFloat createMdAttributeFloat()
  {
    MdAttributeFloatImpl mdAttributeFloat = new MdAttributeFloatImpl();
    return mdAttributeFloat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeHash createMdAttributeHash()
  {
    MdAttributeHashImpl mdAttributeHash = new MdAttributeHashImpl();
    return mdAttributeHash;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeInteger createMdAttributeInteger()
  {
    MdAttributeIntegerImpl mdAttributeInteger = new MdAttributeIntegerImpl();
    return mdAttributeInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeNumber createMdAttributeNumber()
  {
    MdAttributeNumberImpl mdAttributeNumber = new MdAttributeNumberImpl();
    return mdAttributeNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeStruct createMdAttributeStruct()
  {
    MdAttributeStructImpl mdAttributeStruct = new MdAttributeStructImpl();
    return mdAttributeStruct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeText createMdAttributeText()
  {
    MdAttributeTextImpl mdAttributeText = new MdAttributeTextImpl();
    return mdAttributeText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeTime createMdAttributeTime()
  {
    MdAttributeTimeImpl mdAttributeTime = new MdAttributeTimeImpl();
    return mdAttributeTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeLocalCharacter createMdAttributeLocalCharacter()
  {
    MdAttributeLocalCharacterImpl mdAttributeLocalCharacter = new MdAttributeLocalCharacterImpl();
    return mdAttributeLocalCharacter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeLocalText createMdAttributeLocalText()
  {
    MdAttributeLocalTextImpl mdAttributeLocalText = new MdAttributeLocalTextImpl();
    return mdAttributeLocalText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdAttributeLong createMdAttributeLong()
  {
    MdAttributeLongImpl mdAttributeLong = new MdAttributeLongImpl();
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
