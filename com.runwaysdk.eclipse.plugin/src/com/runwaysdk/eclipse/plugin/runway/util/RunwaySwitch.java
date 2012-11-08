/**
 */
package com.runwaysdk.eclipse.plugin.runway.util;

import com.runwaysdk.eclipse.plugin.runway.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage
 * @generated
 */
public class RunwaySwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RunwayPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunwaySwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RunwayPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RunwayPackage.MD_BUSINESS:
      {
        MDBusiness mdBusiness = (MDBusiness)theEObject;
        T result = caseMDBusiness(mdBusiness);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE:
      {
        MDAttribute mdAttribute = (MDAttribute)theEObject;
        T result = caseMDAttribute(mdAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.DOCUMENT_ROOT:
      {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_BLOB:
      {
        MdAttributeBlob mdAttributeBlob = (MdAttributeBlob)theEObject;
        T result = caseMdAttributeBlob(mdAttributeBlob);
        if (result == null) result = caseMDAttribute(mdAttributeBlob);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_BOOLEAN:
      {
        MdAttributeBoolean mdAttributeBoolean = (MdAttributeBoolean)theEObject;
        T result = caseMdAttributeBoolean(mdAttributeBoolean);
        if (result == null) result = caseMDAttribute(mdAttributeBoolean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_CHARACTER:
      {
        MdAttributeCharacter mdAttributeCharacter = (MdAttributeCharacter)theEObject;
        T result = caseMdAttributeCharacter(mdAttributeCharacter);
        if (result == null) result = caseMDAttribute(mdAttributeCharacter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_DATE:
      {
        MdAttributeDate mdAttributeDate = (MdAttributeDate)theEObject;
        T result = caseMdAttributeDate(mdAttributeDate);
        if (result == null) result = caseMDAttribute(mdAttributeDate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_DATE_TIME:
      {
        MdAttributeDateTime mdAttributeDateTime = (MdAttributeDateTime)theEObject;
        T result = caseMdAttributeDateTime(mdAttributeDateTime);
        if (result == null) result = caseMDAttribute(mdAttributeDateTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_DECIMAL:
      {
        MdAttributeDecimal mdAttributeDecimal = (MdAttributeDecimal)theEObject;
        T result = caseMdAttributeDecimal(mdAttributeDecimal);
        if (result == null) result = caseMDAttribute(mdAttributeDecimal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_DOUBLE:
      {
        MdAttributeDouble mdAttributeDouble = (MdAttributeDouble)theEObject;
        T result = caseMdAttributeDouble(mdAttributeDouble);
        if (result == null) result = caseMDAttribute(mdAttributeDouble);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_ENUMERATION:
      {
        MdAttributeEnumeration mdAttributeEnumeration = (MdAttributeEnumeration)theEObject;
        T result = caseMdAttributeEnumeration(mdAttributeEnumeration);
        if (result == null) result = caseMDAttribute(mdAttributeEnumeration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_FLOAT:
      {
        MdAttributeFloat mdAttributeFloat = (MdAttributeFloat)theEObject;
        T result = caseMdAttributeFloat(mdAttributeFloat);
        if (result == null) result = caseMDAttribute(mdAttributeFloat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_HASH:
      {
        MdAttributeHash mdAttributeHash = (MdAttributeHash)theEObject;
        T result = caseMdAttributeHash(mdAttributeHash);
        if (result == null) result = caseMDAttribute(mdAttributeHash);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_INTEGER:
      {
        MdAttributeInteger mdAttributeInteger = (MdAttributeInteger)theEObject;
        T result = caseMdAttributeInteger(mdAttributeInteger);
        if (result == null) result = caseMDAttribute(mdAttributeInteger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_NUMBER:
      {
        MdAttributeNumber mdAttributeNumber = (MdAttributeNumber)theEObject;
        T result = caseMdAttributeNumber(mdAttributeNumber);
        if (result == null) result = caseMDAttribute(mdAttributeNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_STRUCT:
      {
        MdAttributeStruct mdAttributeStruct = (MdAttributeStruct)theEObject;
        T result = caseMdAttributeStruct(mdAttributeStruct);
        if (result == null) result = caseMDAttribute(mdAttributeStruct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_TEXT:
      {
        MdAttributeText mdAttributeText = (MdAttributeText)theEObject;
        T result = caseMdAttributeText(mdAttributeText);
        if (result == null) result = caseMDAttribute(mdAttributeText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_TIME:
      {
        MdAttributeTime mdAttributeTime = (MdAttributeTime)theEObject;
        T result = caseMdAttributeTime(mdAttributeTime);
        if (result == null) result = caseMDAttribute(mdAttributeTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_LOCAL:
      {
        MdAttributeLocal mdAttributeLocal = (MdAttributeLocal)theEObject;
        T result = caseMdAttributeLocal(mdAttributeLocal);
        if (result == null) result = caseMdAttributeStruct(mdAttributeLocal);
        if (result == null) result = caseMDAttribute(mdAttributeLocal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_LOCAL_CHARACTER:
      {
        MdAttributeLocalCharacter mdAttributeLocalCharacter = (MdAttributeLocalCharacter)theEObject;
        T result = caseMdAttributeLocalCharacter(mdAttributeLocalCharacter);
        if (result == null) result = caseMdAttributeLocal(mdAttributeLocalCharacter);
        if (result == null) result = caseMdAttributeStruct(mdAttributeLocalCharacter);
        if (result == null) result = caseMDAttribute(mdAttributeLocalCharacter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_LOCAL_TEXT:
      {
        MdAttributeLocalText mdAttributeLocalText = (MdAttributeLocalText)theEObject;
        T result = caseMdAttributeLocalText(mdAttributeLocalText);
        if (result == null) result = caseMdAttributeLocal(mdAttributeLocalText);
        if (result == null) result = caseMdAttributeStruct(mdAttributeLocalText);
        if (result == null) result = caseMDAttribute(mdAttributeLocalText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RunwayPackage.MD_ATTRIBUTE_LONG:
      {
        MdAttributeLong mdAttributeLong = (MdAttributeLong)theEObject;
        T result = caseMdAttributeLong(mdAttributeLong);
        if (result == null) result = caseMDAttribute(mdAttributeLong);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MD Business</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MD Business</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMDBusiness(MDBusiness object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MD Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MD Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMDAttribute(MDAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentRoot(DocumentRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Blob</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Blob</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeBlob(MdAttributeBlob object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeBoolean(MdAttributeBoolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Character</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Character</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeCharacter(MdAttributeCharacter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Date</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeDate(MdAttributeDate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Date Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Date Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeDateTime(MdAttributeDateTime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Decimal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Decimal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeDecimal(MdAttributeDecimal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Double</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Double</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeDouble(MdAttributeDouble object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Enumeration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Enumeration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeEnumeration(MdAttributeEnumeration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Float</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Float</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeFloat(MdAttributeFloat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Hash</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Hash</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeHash(MdAttributeHash object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeInteger(MdAttributeInteger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeNumber(MdAttributeNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Struct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Struct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeStruct(MdAttributeStruct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeText(MdAttributeText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeTime(MdAttributeTime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Local</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Local</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeLocal(MdAttributeLocal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Local Character</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Local Character</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeLocalCharacter(MdAttributeLocalCharacter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Local Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Local Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeLocalText(MdAttributeLocalText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Md Attribute Long</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Md Attribute Long</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdAttributeLong(MdAttributeLong object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RunwaySwitch
