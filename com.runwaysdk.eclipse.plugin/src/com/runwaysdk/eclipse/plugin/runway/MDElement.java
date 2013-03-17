/**
 */
package com.runwaysdk.eclipse.plugin.runway;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDElement#isExtendable <em>Extendable</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDElement#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDElement()
 * @model
 * @generated
 */
public interface MDElement extends MDEntity {
	/**
	 * Returns the value of the '<em><b>Extendable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extendable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extendable</em>' attribute.
	 * @see #setExtendable(boolean)
	 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDElement_Extendable()
	 * @model
	 * @generated
	 */
	boolean isExtendable();

	/**
	 * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDElement#isExtendable <em>Extendable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extendable</em>' attribute.
	 * @see #isExtendable()
	 * @generated
	 */
	void setExtendable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDElement_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDElement#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

} // MDElement
