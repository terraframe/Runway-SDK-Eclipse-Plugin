/**
 */
package com.runwaysdk.eclipse.plugin.runway;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDType#getName <em>Name</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDType#isExported <em>Exported</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDType()
 * @model
 * @generated
 */
public interface MDType extends MetaData {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported</em>' attribute.
	 * @see #setExported(boolean)
	 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDType_Exported()
	 * @model
	 * @generated
	 */
	boolean isExported();

	/**
	 * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDType#isExported <em>Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exported</em>' attribute.
	 * @see #isExported()
	 * @generated
	 */
	void setExported(boolean value);

} // MDType
