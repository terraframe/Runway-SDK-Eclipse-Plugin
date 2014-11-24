/**
 */
package com.runwaysdk.eclipse.plugin.runway;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Attribute Date Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDateTime#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDAttributeDateTime()
 * @model
 * @generated
 */
public interface MDAttributeDateTime extends MDAttribute
{
  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see #setDefaultValue(Date)
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDAttributeDateTime_DefaultValue()
   * @model
   * @generated
   */
  Date getDefaultValue();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDateTime#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(Date value);

} // MDAttributeDateTime
