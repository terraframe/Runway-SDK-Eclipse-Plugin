/**
 */
package com.runwaysdk.eclipse.plugin.runway;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDEntity#getTable <em>Table</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDEntity#isGenerateController <em>Generate Controller</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDEntity#isEnforceSiteMaster <em>Enforce Site Master</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDEntity()
 * @model
 * @generated
 */
public interface MDEntity extends MDClass
{
  /**
   * Returns the value of the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' attribute.
   * @see #setTable(String)
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDEntity_Table()
   * @model
   * @generated
   */
  String getTable();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDEntity#getTable <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' attribute.
   * @see #getTable()
   * @generated
   */
  void setTable(String value);

  /**
   * Returns the value of the '<em><b>Generate Controller</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generate Controller</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generate Controller</em>' attribute.
   * @see #setGenerateController(boolean)
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDEntity_GenerateController()
   * @model
   * @generated
   */
  boolean isGenerateController();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDEntity#isGenerateController <em>Generate Controller</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generate Controller</em>' attribute.
   * @see #isGenerateController()
   * @generated
   */
  void setGenerateController(boolean value);

  /**
   * Returns the value of the '<em><b>Enforce Site Master</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enforce Site Master</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enforce Site Master</em>' attribute.
   * @see #setEnforceSiteMaster(boolean)
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDEntity_EnforceSiteMaster()
   * @model
   * @generated
   */
  boolean isEnforceSiteMaster();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDEntity#isEnforceSiteMaster <em>Enforce Site Master</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enforce Site Master</em>' attribute.
   * @see #isEnforceSiteMaster()
   * @generated
   */
  void setEnforceSiteMaster(boolean value);

} // MDEntity
