/**
 */
package com.runwaysdk.eclipse.plugin.runway;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDClass#isPublish <em>Publish</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDClass#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDClass()
 * @model
 * @generated
 */
public interface MDClass extends MDType {
	/**
	 * Returns the value of the '<em><b>Publish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish</em>' attribute.
	 * @see #setPublish(boolean)
	 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDClass_Publish()
	 * @model
	 * @generated
	 */
	boolean isPublish();

	/**
	 * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDClass#isPublish <em>Publish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish</em>' attribute.
	 * @see #isPublish()
	 * @generated
	 */
	void setPublish(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(MDAttribute)
	 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	MDAttribute getAttributes();

	/**
	 * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDClass#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(MDAttribute value);

} // MDClass
