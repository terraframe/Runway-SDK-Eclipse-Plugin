/**
 */
package com.runwaysdk.eclipse.plugin.runway.impl;

import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Business</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#getCacheAlgorithm <em>Cache Algorithm</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#getCacheSize <em>Cache Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDBusinessImpl extends MDElementImpl implements MDBusiness {
	/**
	 * The default value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected String extends_ = EXTENDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheAlgorithm() <em>Cache Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHE_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheAlgorithm() <em>Cache Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String cacheAlgorithm = CACHE_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheSize() <em>Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheSize()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheSize() <em>Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheSize()
	 * @generated
	 * @ordered
	 */
	protected String cacheSize = CACHE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDBusinessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RunwayPackage.Literals.MD_BUSINESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(String newExtends) {
		String oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_BUSINESS__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCacheAlgorithm() {
		return cacheAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheAlgorithm(String newCacheAlgorithm) {
		String oldCacheAlgorithm = cacheAlgorithm;
		cacheAlgorithm = newCacheAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_BUSINESS__CACHE_ALGORITHM, oldCacheAlgorithm, cacheAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCacheSize() {
		return cacheSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheSize(String newCacheSize) {
		String oldCacheSize = cacheSize;
		cacheSize = newCacheSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_BUSINESS__CACHE_SIZE, oldCacheSize, cacheSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RunwayPackage.MD_BUSINESS__EXTENDS:
				return getExtends();
			case RunwayPackage.MD_BUSINESS__CACHE_ALGORITHM:
				return getCacheAlgorithm();
			case RunwayPackage.MD_BUSINESS__CACHE_SIZE:
				return getCacheSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RunwayPackage.MD_BUSINESS__EXTENDS:
				setExtends((String)newValue);
				return;
			case RunwayPackage.MD_BUSINESS__CACHE_ALGORITHM:
				setCacheAlgorithm((String)newValue);
				return;
			case RunwayPackage.MD_BUSINESS__CACHE_SIZE:
				setCacheSize((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case RunwayPackage.MD_BUSINESS__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case RunwayPackage.MD_BUSINESS__CACHE_ALGORITHM:
				setCacheAlgorithm(CACHE_ALGORITHM_EDEFAULT);
				return;
			case RunwayPackage.MD_BUSINESS__CACHE_SIZE:
				setCacheSize(CACHE_SIZE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RunwayPackage.MD_BUSINESS__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case RunwayPackage.MD_BUSINESS__CACHE_ALGORITHM:
				return CACHE_ALGORITHM_EDEFAULT == null ? cacheAlgorithm != null : !CACHE_ALGORITHM_EDEFAULT.equals(cacheAlgorithm);
			case RunwayPackage.MD_BUSINESS__CACHE_SIZE:
				return CACHE_SIZE_EDEFAULT == null ? cacheSize != null : !CACHE_SIZE_EDEFAULT.equals(cacheSize);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extends: ");
		result.append(extends_);
		result.append(", cacheAlgorithm: ");
		result.append(cacheAlgorithm);
		result.append(", cacheSize: ");
		result.append(cacheSize);
		result.append(')');
		return result.toString();
	}

} //MDBusinessImpl
