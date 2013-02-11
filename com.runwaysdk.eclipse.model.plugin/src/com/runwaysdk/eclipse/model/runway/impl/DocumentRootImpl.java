/**
 */
package com.runwaysdk.eclipse.model.runway.impl;

import com.runwaysdk.eclipse.model.runway.DocumentRoot;
import com.runwaysdk.eclipse.model.runway.MDBusiness;
import com.runwaysdk.eclipse.model.runway.RunwayPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.model.runway.impl.DocumentRootImpl#getMdBusinesses <em>Md Businesses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot
{
  /**
   * The cached value of the '{@link #getMdBusinesses() <em>Md Businesses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMdBusinesses()
   * @generated
   * @ordered
   */
  protected EList<MDBusiness> mdBusinesses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentRootImpl()
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
    return RunwayPackage.Literals.DOCUMENT_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MDBusiness> getMdBusinesses()
  {
    if (mdBusinesses == null)
    {
      mdBusinesses = new EObjectContainmentEList<MDBusiness>(MDBusiness.class, this, RunwayPackage.DOCUMENT_ROOT__MD_BUSINESSES);
    }
    return mdBusinesses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RunwayPackage.DOCUMENT_ROOT__MD_BUSINESSES:
        return ((InternalEList<?>)getMdBusinesses()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RunwayPackage.DOCUMENT_ROOT__MD_BUSINESSES:
        return getMdBusinesses();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RunwayPackage.DOCUMENT_ROOT__MD_BUSINESSES:
        getMdBusinesses().clear();
        getMdBusinesses().addAll((Collection<? extends MDBusiness>)newValue);
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
      case RunwayPackage.DOCUMENT_ROOT__MD_BUSINESSES:
        getMdBusinesses().clear();
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
      case RunwayPackage.DOCUMENT_ROOT__MD_BUSINESSES:
        return mdBusinesses != null && !mdBusinesses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DocumentRootImpl
