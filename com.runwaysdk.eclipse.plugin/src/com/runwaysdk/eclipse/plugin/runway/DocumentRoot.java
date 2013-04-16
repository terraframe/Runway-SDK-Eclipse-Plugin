/**
 */
package com.runwaysdk.eclipse.plugin.runway;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.DocumentRoot#getMetaData <em>Meta Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getDocumentRoot()
 * @model
 * @generated
 */
public interface DocumentRoot extends EObject
{
  /**
   * Returns the value of the '<em><b>Meta Data</b></em>' containment reference list.
   * The list contents are of type {@link com.runwaysdk.eclipse.plugin.runway.MetaData}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Data</em>' containment reference list.
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getDocumentRoot_MetaData()
   * @model containment="true"
   * @generated
   */
  EList<MetaData> getMetaData();

} // DocumentRoot
