/**
 */
package com.runwaysdk.eclipse.plugin.runway;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Attribute Decimal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDAttributeDecimal()
 * @model
 * @generated
 */
public interface MDAttributeDecimal extends MDAttribute
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
   * @see #setDefaultValue(float)
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDAttributeDecimal_DefaultValue()
   * @model
   * @generated
   */
  float getDefaultValue();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(float value);

} // MDAttributeDecimal
