/**
 */
package com.runwaysdk.eclipse.plugin.runway.impl;

import com.runwaysdk.eclipse.plugin.runway.MetaData;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MetaDataImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MetaDataImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MetaDataImpl#getRemovable <em>Removable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaDataImpl extends EObjectImpl implements MetaData {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemovable() <em>Removable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovable()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOVABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemovable() <em>Removable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovable()
	 * @generated
	 * @ordered
	 */
	protected String removable = REMOVABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RunwayPackage.Literals.META_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.META_DATA__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.META_DATA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemovable() {
		return removable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovable(String newRemovable) {
		String oldRemovable = removable;
		removable = newRemovable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.META_DATA__REMOVABLE, oldRemovable, removable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RunwayPackage.META_DATA__LABEL:
				return getLabel();
			case RunwayPackage.META_DATA__DESCRIPTION:
				return getDescription();
			case RunwayPackage.META_DATA__REMOVABLE:
				return getRemovable();
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
			case RunwayPackage.META_DATA__LABEL:
				setLabel((String)newValue);
				return;
			case RunwayPackage.META_DATA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RunwayPackage.META_DATA__REMOVABLE:
				setRemovable((String)newValue);
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
			case RunwayPackage.META_DATA__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case RunwayPackage.META_DATA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RunwayPackage.META_DATA__REMOVABLE:
				setRemovable(REMOVABLE_EDEFAULT);
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
			case RunwayPackage.META_DATA__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case RunwayPackage.META_DATA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RunwayPackage.META_DATA__REMOVABLE:
				return REMOVABLE_EDEFAULT == null ? removable != null : !REMOVABLE_EDEFAULT.equals(removable);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", description: ");
		result.append(description);
		result.append(", removable: ");
		result.append(removable);
		result.append(')');
		return result.toString();
	}

} //MetaDataImpl
