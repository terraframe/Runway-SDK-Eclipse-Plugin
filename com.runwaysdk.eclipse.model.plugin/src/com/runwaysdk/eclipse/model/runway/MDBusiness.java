/**
 */
package com.runwaysdk.eclipse.model.runway;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Business</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.model.runway.MDBusiness#getClassName <em>Class Name</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.model.runway.MDBusiness#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.model.runway.MDBusiness#getDisplayLabel <em>Display Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.runwaysdk.eclipse.model.runway.RunwayPackage#getMDBusiness()
 * @model
 * @generated
 */
public interface MDBusiness extends EObject
{
  /**
   * Returns the value of the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' attribute.
   * @see #setClassName(String)
   * @see com.runwaysdk.eclipse.model.runway.RunwayPackage#getMDBusiness_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.model.runway.MDBusiness#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link com.runwaysdk.eclipse.model.runway.MDAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see com.runwaysdk.eclipse.model.runway.RunwayPackage#getMDBusiness_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<MDAttribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Display Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Display Label</em>' attribute.
   * @see #setDisplayLabel(String)
   * @see com.runwaysdk.eclipse.model.runway.RunwayPackage#getMDBusiness_DisplayLabel()
   * @model
   * @generated
   */
  String getDisplayLabel();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.model.runway.MDBusiness#getDisplayLabel <em>Display Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display Label</em>' attribute.
   * @see #getDisplayLabel()
   * @generated
   */
  void setDisplayLabel(String value);

} // MDBusiness
