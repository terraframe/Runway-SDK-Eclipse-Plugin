/**
 */
package com.runwaysdk.eclipse.plugin.runway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MetaData#getLabel <em>Label</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MetaData#getDescription <em>Description</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MetaData#getRemovable <em>Removable</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMetaData()
 * @model
 * @generated
 */
public interface MetaData extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMetaData_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MetaData#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMetaData_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MetaData#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Removable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removable</em>' attribute.
	 * @see #setRemovable(String)
	 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMetaData_Removable()
	 * @model
	 * @generated
	 */
	String getRemovable();

	/**
	 * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MetaData#getRemovable <em>Removable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removable</em>' attribute.
	 * @see #getRemovable()
	 * @generated
	 */
	void setRemovable(String value);

} // MetaData
