/**
 */
package com.runwaysdk.eclipse.plugin.runway;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage
 * @generated
 */
public interface RunwayFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RunwayFactory eINSTANCE = com.runwaysdk.eclipse.plugin.runway.impl.RunwayFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Data</em>'.
	 * @generated
	 */
	MetaData createMetaData();

	/**
	 * Returns a new object of class '<em>MD Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Type</em>'.
	 * @generated
	 */
	MDType createMDType();

	/**
	 * Returns a new object of class '<em>MD Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Class</em>'.
	 * @generated
	 */
	MDClass createMDClass();

	/**
	 * Returns a new object of class '<em>MD Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Entity</em>'.
	 * @generated
	 */
	MDEntity createMDEntity();

	/**
	 * Returns a new object of class '<em>MD Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Element</em>'.
	 * @generated
	 */
	MDElement createMDElement();

	/**
	 * Returns a new object of class '<em>MD Business</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Business</em>'.
	 * @generated
	 */
	MDBusiness createMDBusiness();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>MD Attribute Blob</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Blob</em>'.
	 * @generated
	 */
	MDAttributeBlob createMDAttributeBlob();

	/**
	 * Returns a new object of class '<em>MD Attribute Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Boolean</em>'.
	 * @generated
	 */
	MDAttributeBoolean createMDAttributeBoolean();

	/**
	 * Returns a new object of class '<em>MD Attribute Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Character</em>'.
	 * @generated
	 */
	MDAttributeCharacter createMDAttributeCharacter();

	/**
	 * Returns a new object of class '<em>MD Attribute Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Date</em>'.
	 * @generated
	 */
	MDAttributeDate createMDAttributeDate();

	/**
	 * Returns a new object of class '<em>MD Attribute Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Date Time</em>'.
	 * @generated
	 */
	MDAttributeDateTime createMDAttributeDateTime();

	/**
	 * Returns a new object of class '<em>MD Attribute Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Decimal</em>'.
	 * @generated
	 */
	MDAttributeDecimal createMDAttributeDecimal();

	/**
	 * Returns a new object of class '<em>MD Attribute Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Double</em>'.
	 * @generated
	 */
	MDAttributeDouble createMDAttributeDouble();

	/**
	 * Returns a new object of class '<em>MD Attribute Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Enumeration</em>'.
	 * @generated
	 */
	MDAttributeEnumeration createMDAttributeEnumeration();

	/**
	 * Returns a new object of class '<em>MD Attribute Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Float</em>'.
	 * @generated
	 */
	MDAttributeFloat createMDAttributeFloat();

	/**
	 * Returns a new object of class '<em>MD Attribute Hash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Hash</em>'.
	 * @generated
	 */
	MDAttributeHash createMDAttributeHash();

	/**
	 * Returns a new object of class '<em>MD Attribute Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Integer</em>'.
	 * @generated
	 */
	MDAttributeInteger createMDAttributeInteger();

	/**
	 * Returns a new object of class '<em>MD Attribute Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Number</em>'.
	 * @generated
	 */
	MDAttributeNumber createMDAttributeNumber();

	/**
	 * Returns a new object of class '<em>MD Attribute Struct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Struct</em>'.
	 * @generated
	 */
	MDAttributeStruct createMDAttributeStruct();

	/**
	 * Returns a new object of class '<em>MD Attribute Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Text</em>'.
	 * @generated
	 */
	MDAttributeText createMDAttributeText();

	/**
	 * Returns a new object of class '<em>MD Attribute Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Time</em>'.
	 * @generated
	 */
	MDAttributeTime createMDAttributeTime();

	/**
	 * Returns a new object of class '<em>MD Attribute Local Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Local Character</em>'.
	 * @generated
	 */
	MDAttributeLocalCharacter createMDAttributeLocalCharacter();

	/**
	 * Returns a new object of class '<em>MD Attribute Local Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Local Text</em>'.
	 * @generated
	 */
	MDAttributeLocalText createMDAttributeLocalText();

	/**
	 * Returns a new object of class '<em>MD Attribute Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Attribute Long</em>'.
	 * @generated
	 */
	MDAttributeLong createMDAttributeLong();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RunwayPackage getRunwayPackage();

} //RunwayFactory
