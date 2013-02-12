/**
 */
package com.runwaysdk.eclipse.plugin.runway;

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
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getClassName <em>Class Name</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getColumn <em>Column</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#isIsRemovable <em>Is Removable</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getDescription <em>Description</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#isIsExtendable <em>Is Extendable</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getExtends <em>Extends</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getCacheAlgorithm <em>Cache Algorithm</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getCacheSize <em>Cache Size</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getPublish <em>Publish</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDBusiness()
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
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDBusiness_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link com.runwaysdk.eclipse.plugin.runway.MDAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDBusiness_Attributes()
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
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDBusiness_DisplayLabel()
   * @model
   * @generated
   */
  String getDisplayLabel();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getDisplayLabel <em>Display Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display Label</em>' attribute.
   * @see #getDisplayLabel()
   * @generated
   */
  void setDisplayLabel(String value);

  /**
   * Returns the value of the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' attribute.
   * @see #setColumn(String)
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDBusiness_Column()
   * @model
   * @generated
   */
  String getColumn();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getColumn <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' attribute.
   * @see #getColumn()
   * @generated
   */
  void setColumn(String value);

  /**
   * Returns the value of the '<em><b>Is Removable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Removable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Removable</em>' attribute.
   * @see #setIsRemovable(boolean)
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDBusiness_IsRemovable()
   * @model
   * @generated
   */
  boolean isIsRemovable();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#isIsRemovable <em>Is Removable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Removable</em>' attribute.
   * @see #isIsRemovable()
   * @generated
   */
  void setIsRemovable(boolean value);

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
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDBusiness_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Is Extendable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Extendable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Extendable</em>' attribute.
   * @see #setIsExtendable(boolean)
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDBusiness_IsExtendable()
   * @model
   * @generated
   */
  boolean isIsExtendable();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#isIsExtendable <em>Is Extendable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Extendable</em>' attribute.
   * @see #isIsExtendable()
   * @generated
   */
  void setIsExtendable(boolean value);

  /**
   * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Abstract</em>' attribute.
   * @see #setIsAbstract(boolean)
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDBusiness_IsAbstract()
   * @model
   * @generated
   */
  boolean isIsAbstract();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#isIsAbstract <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Abstract</em>' attribute.
   * @see #isIsAbstract()
   * @generated
   */
  void setIsAbstract(boolean value);

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

  /**
   * Returns the value of the '<em><b>Publish</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Publish</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Publish</em>' attribute.
   * @see #setPublish(String)
   * @see com.runwaysdk.eclipse.plugin.runway.RunwayPackage#getMDBusiness_Publish()
   * @model
   * @generated
   */
  String getPublish();

  /**
   * Sets the value of the '{@link com.runwaysdk.eclipse.plugin.runway.MDBusiness#getPublish <em>Publish</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Publish</em>' attribute.
   * @see #getPublish()
   * @generated
   */
  void setPublish(String value);

} // MDBusiness
