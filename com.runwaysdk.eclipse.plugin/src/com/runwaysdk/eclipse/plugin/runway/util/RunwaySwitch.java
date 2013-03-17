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
public class RunwaySwitch<T> extends Switch<T> {
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
	public RunwaySwitch() {
		if (modelPackage == null) {
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
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RunwayPackage.META_DATA: {
				MetaData metaData = (MetaData)theEObject;
				T result = caseMetaData(metaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_TYPE: {
				MDType mdType = (MDType)theEObject;
				T result = caseMDType(mdType);
				if (result == null) result = caseMetaData(mdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_CLASS: {
				MDClass mdClass = (MDClass)theEObject;
				T result = caseMDClass(mdClass);
				if (result == null) result = caseMDType(mdClass);
				if (result == null) result = caseMetaData(mdClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ENTITY: {
				MDEntity mdEntity = (MDEntity)theEObject;
				T result = caseMDEntity(mdEntity);
				if (result == null) result = caseMDClass(mdEntity);
				if (result == null) result = caseMDType(mdEntity);
				if (result == null) result = caseMetaData(mdEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ELEMENT: {
				MDElement mdElement = (MDElement)theEObject;
				T result = caseMDElement(mdElement);
				if (result == null) result = caseMDEntity(mdElement);
				if (result == null) result = caseMDClass(mdElement);
				if (result == null) result = caseMDType(mdElement);
				if (result == null) result = caseMetaData(mdElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_BUSINESS: {
				MDBusiness mdBusiness = (MDBusiness)theEObject;
				T result = caseMDBusiness(mdBusiness);
				if (result == null) result = caseMDElement(mdBusiness);
				if (result == null) result = caseMDEntity(mdBusiness);
				if (result == null) result = caseMDClass(mdBusiness);
				if (result == null) result = caseMDType(mdBusiness);
				if (result == null) result = caseMetaData(mdBusiness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE: {
				MDAttribute mdAttribute = (MDAttribute)theEObject;
				T result = caseMDAttribute(mdAttribute);
				if (result == null) result = caseMetaData(mdAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_BLOB: {
				MDAttributeBlob mdAttributeBlob = (MDAttributeBlob)theEObject;
				T result = caseMDAttributeBlob(mdAttributeBlob);
				if (result == null) result = caseMDAttribute(mdAttributeBlob);
				if (result == null) result = caseMetaData(mdAttributeBlob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_BOOLEAN: {
				MDAttributeBoolean mdAttributeBoolean = (MDAttributeBoolean)theEObject;
				T result = caseMDAttributeBoolean(mdAttributeBoolean);
				if (result == null) result = caseMDAttribute(mdAttributeBoolean);
				if (result == null) result = caseMetaData(mdAttributeBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_CHARACTER: {
				MDAttributeCharacter mdAttributeCharacter = (MDAttributeCharacter)theEObject;
				T result = caseMDAttributeCharacter(mdAttributeCharacter);
				if (result == null) result = caseMDAttribute(mdAttributeCharacter);
				if (result == null) result = caseMetaData(mdAttributeCharacter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_DATE: {
				MDAttributeDate mdAttributeDate = (MDAttributeDate)theEObject;
				T result = caseMDAttributeDate(mdAttributeDate);
				if (result == null) result = caseMDAttribute(mdAttributeDate);
				if (result == null) result = caseMetaData(mdAttributeDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_DATE_TIME: {
				MDAttributeDateTime mdAttributeDateTime = (MDAttributeDateTime)theEObject;
				T result = caseMDAttributeDateTime(mdAttributeDateTime);
				if (result == null) result = caseMDAttribute(mdAttributeDateTime);
				if (result == null) result = caseMetaData(mdAttributeDateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_DECIMAL: {
				MDAttributeDecimal mdAttributeDecimal = (MDAttributeDecimal)theEObject;
				T result = caseMDAttributeDecimal(mdAttributeDecimal);
				if (result == null) result = caseMDAttribute(mdAttributeDecimal);
				if (result == null) result = caseMetaData(mdAttributeDecimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_DOUBLE: {
				MDAttributeDouble mdAttributeDouble = (MDAttributeDouble)theEObject;
				T result = caseMDAttributeDouble(mdAttributeDouble);
				if (result == null) result = caseMDAttribute(mdAttributeDouble);
				if (result == null) result = caseMetaData(mdAttributeDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_ENUMERATION: {
				MDAttributeEnumeration mdAttributeEnumeration = (MDAttributeEnumeration)theEObject;
				T result = caseMDAttributeEnumeration(mdAttributeEnumeration);
				if (result == null) result = caseMDAttribute(mdAttributeEnumeration);
				if (result == null) result = caseMetaData(mdAttributeEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_FLOAT: {
				MDAttributeFloat mdAttributeFloat = (MDAttributeFloat)theEObject;
				T result = caseMDAttributeFloat(mdAttributeFloat);
				if (result == null) result = caseMDAttribute(mdAttributeFloat);
				if (result == null) result = caseMetaData(mdAttributeFloat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_HASH: {
				MDAttributeHash mdAttributeHash = (MDAttributeHash)theEObject;
				T result = caseMDAttributeHash(mdAttributeHash);
				if (result == null) result = caseMDAttribute(mdAttributeHash);
				if (result == null) result = caseMetaData(mdAttributeHash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_INTEGER: {
				MDAttributeInteger mdAttributeInteger = (MDAttributeInteger)theEObject;
				T result = caseMDAttributeInteger(mdAttributeInteger);
				if (result == null) result = caseMDAttribute(mdAttributeInteger);
				if (result == null) result = caseMetaData(mdAttributeInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_NUMBER: {
				MDAttributeNumber mdAttributeNumber = (MDAttributeNumber)theEObject;
				T result = caseMDAttributeNumber(mdAttributeNumber);
				if (result == null) result = caseMDAttribute(mdAttributeNumber);
				if (result == null) result = caseMetaData(mdAttributeNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_STRUCT: {
				MDAttributeStruct mdAttributeStruct = (MDAttributeStruct)theEObject;
				T result = caseMDAttributeStruct(mdAttributeStruct);
				if (result == null) result = caseMDAttribute(mdAttributeStruct);
				if (result == null) result = caseMetaData(mdAttributeStruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_TEXT: {
				MDAttributeText mdAttributeText = (MDAttributeText)theEObject;
				T result = caseMDAttributeText(mdAttributeText);
				if (result == null) result = caseMDAttribute(mdAttributeText);
				if (result == null) result = caseMetaData(mdAttributeText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_TIME: {
				MDAttributeTime mdAttributeTime = (MDAttributeTime)theEObject;
				T result = caseMDAttributeTime(mdAttributeTime);
				if (result == null) result = caseMDAttribute(mdAttributeTime);
				if (result == null) result = caseMetaData(mdAttributeTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_LOCAL: {
				MDAttributeLocal mdAttributeLocal = (MDAttributeLocal)theEObject;
				T result = caseMDAttributeLocal(mdAttributeLocal);
				if (result == null) result = caseMDAttributeStruct(mdAttributeLocal);
				if (result == null) result = caseMDAttribute(mdAttributeLocal);
				if (result == null) result = caseMetaData(mdAttributeLocal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_LOCAL_CHARACTER: {
				MDAttributeLocalCharacter mdAttributeLocalCharacter = (MDAttributeLocalCharacter)theEObject;
				T result = caseMDAttributeLocalCharacter(mdAttributeLocalCharacter);
				if (result == null) result = caseMDAttributeLocal(mdAttributeLocalCharacter);
				if (result == null) result = caseMDAttributeStruct(mdAttributeLocalCharacter);
				if (result == null) result = caseMDAttribute(mdAttributeLocalCharacter);
				if (result == null) result = caseMetaData(mdAttributeLocalCharacter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_LOCAL_TEXT: {
				MDAttributeLocalText mdAttributeLocalText = (MDAttributeLocalText)theEObject;
				T result = caseMDAttributeLocalText(mdAttributeLocalText);
				if (result == null) result = caseMDAttributeLocal(mdAttributeLocalText);
				if (result == null) result = caseMDAttributeStruct(mdAttributeLocalText);
				if (result == null) result = caseMDAttribute(mdAttributeLocalText);
				if (result == null) result = caseMetaData(mdAttributeLocalText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RunwayPackage.MD_ATTRIBUTE_LONG: {
				MDAttributeLong mdAttributeLong = (MDAttributeLong)theEObject;
				T result = caseMDAttributeLong(mdAttributeLong);
				if (result == null) result = caseMDAttribute(mdAttributeLong);
				if (result == null) result = caseMetaData(mdAttributeLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaData(MetaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDType(MDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDClass(MDClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDEntity(MDEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDElement(MDElement object) {
		return null;
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
	public T caseMDBusiness(MDBusiness object) {
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
	public T caseMDAttribute(MDAttribute object) {
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
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Blob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Blob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeBlob(MDAttributeBlob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeBoolean(MDAttributeBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeCharacter(MDAttributeCharacter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeDate(MDAttributeDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeDateTime(MDAttributeDateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Decimal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeDecimal(MDAttributeDecimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeDouble(MDAttributeDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeEnumeration(MDAttributeEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeFloat(MDAttributeFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Hash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Hash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeHash(MDAttributeHash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeInteger(MDAttributeInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeNumber(MDAttributeNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeStruct(MDAttributeStruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeText(MDAttributeText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeTime(MDAttributeTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Local</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Local</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeLocal(MDAttributeLocal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Local Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Local Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeLocalCharacter(MDAttributeLocalCharacter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Local Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Local Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeLocalText(MDAttributeLocalText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Attribute Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Attribute Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAttributeLong(MDAttributeLong object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //RunwaySwitch
