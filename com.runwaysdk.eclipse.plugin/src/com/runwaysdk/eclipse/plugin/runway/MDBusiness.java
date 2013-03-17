/**
 */
package com.runwaysdk.eclipse.plugin.runway;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Business</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getExtends <em>Extends</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getCacheAlgorithm <em>Cache Algorithm</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getCacheSize <em>Cache Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDBusiness()
 * @model
 * @generated
 */
public interface MDBusiness extends MDElement {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' attribute.
	 * @see #setExtends(String)
	 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDBusiness_Extends()
	 * @model
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getExtends <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' attribute.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(String value);

	/**
	 * Returns the value of the '<em><b>Cache Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Algorithm</em>' attribute.
	 * @see #setCacheAlgorithm(String)
	 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDBusiness_CacheAlgorithm()
	 * @model
	 * @generated
	 */
	String getCacheAlgorithm();

	/**
	 * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getCacheAlgorithm <em>Cache Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Algorithm</em>' attribute.
	 * @see #getCacheAlgorithm()
	 * @generated
	 */
	void setCacheAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Size</em>' attribute.
	 * @see #setCacheSize(String)
	 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDBusiness_CacheSize()
	 * @model
	 * @generated
	 */
	String getCacheSize();

	/**
	 * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getCacheSize <em>Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Size</em>' attribute.
	 * @see #getCacheSize()
	 * @generated
	 */
	void setCacheSize(String value);

} // MDBusiness
