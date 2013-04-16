/**
 */
package com.runwaysdk.eclipse.plugin.runway.impl;

import com.runwaysdk.eclipse.plugin.runway.MDElement;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDElementImpl#isExtendable <em>Extendable</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDElementImpl#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDElementImpl extends MDEntityImpl implements MDElement
{
  /**
   * The default value of the '{@link #isExtendable() <em>Extendable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExtendable()
   * @generated
   * @ordered
   */
  protected static final boolean EXTENDABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExtendable() <em>Extendable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExtendable()
   * @generated
   * @ordered
   */
  protected boolean extendable = EXTENDABLE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAbstract()
   * @generated
   * @ordered
   */
  protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RunwayPackage.Literals.MD_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExtendable()
  {
    return extendable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtendable(boolean newExtendable)
  {
    boolean oldExtendable = extendable;
    extendable = newExtendable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_ELEMENT__EXTENDABLE, oldExtendable, extendable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAbstract()
  {
    return isAbstract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAbstract(boolean newIsAbstract)
  {
    boolean oldIsAbstract = isAbstract;
    isAbstract = newIsAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_ELEMENT__IS_ABSTRACT, oldIsAbstract, isAbstract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RunwayPackage.MD_ELEMENT__EXTENDABLE:
        return isExtendable();
      case RunwayPackage.MD_ELEMENT__IS_ABSTRACT:
        return isIsAbstract();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RunwayPackage.MD_ELEMENT__EXTENDABLE:
        setExtendable((Boolean)newValue);
        return;
      case RunwayPackage.MD_ELEMENT__IS_ABSTRACT:
        setIsAbstract((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RunwayPackage.MD_ELEMENT__EXTENDABLE:
        setExtendable(EXTENDABLE_EDEFAULT);
        return;
      case RunwayPackage.MD_ELEMENT__IS_ABSTRACT:
        setIsAbstract(IS_ABSTRACT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RunwayPackage.MD_ELEMENT__EXTENDABLE:
        return extendable != EXTENDABLE_EDEFAULT;
      case RunwayPackage.MD_ELEMENT__IS_ABSTRACT:
        return isAbstract != IS_ABSTRACT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (extendable: ");
    result.append(extendable);
    result.append(", isAbstract: ");
    result.append(isAbstract);
    result.append(')');
    return result.toString();
  }

} //MDElementImpl
