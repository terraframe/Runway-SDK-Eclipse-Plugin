/**
 */
package com.runwaysdk.eclipse.model.runway;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Md Attribute Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.model.runway.MdAttributeText#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.runwaysdk.eclipse.model.runway.RunwayPackage#getMdAttributeText()
 * @model
 * @generated
 */
public interface MdAttributeText extends MDAttribute
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
   * @see #setDefaultValue(String)
   * @see com.runwaysdk.eclipse.model.runway.RunwayPackage#getMdAttributeText_DefaultValue()
   * @model
   * @generated
   */
  String getDefaultValue();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.model.runway.MdAttributeText#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(String value);

} // MdAttributeText
