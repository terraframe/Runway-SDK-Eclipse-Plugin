/**
 */
package com.runwaysdk.eclipse.plugin.runway.impl;

import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDClass;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDClassImpl#isPublish <em>Publish</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDClassImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDClassImpl extends MDTypeImpl implements MDClass {
	/**
	 * The default value of the '{@link #isPublish() <em>Publish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublish()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLISH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublish() <em>Publish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublish()
	 * @generated
	 * @ordered
	 */
	protected boolean publish = PUBLISH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected MDAttribute attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RunwayPackage.Literals.MD_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublish() {
		return publish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublish(boolean newPublish) {
		boolean oldPublish = publish;
		publish = newPublish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_CLASS__PUBLISH, oldPublish, publish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDAttribute getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(MDAttribute newAttributes, NotificationChain msgs) {
		MDAttribute oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_CLASS__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(MDAttribute newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RunwayPackage.MD_CLASS__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RunwayPackage.MD_CLASS__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_CLASS__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RunwayPackage.MD_CLASS__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RunwayPackage.MD_CLASS__PUBLISH:
				return isPublish();
			case RunwayPackage.MD_CLASS__ATTRIBUTES:
				return getAttributes();
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
			case RunwayPackage.MD_CLASS__PUBLISH:
				setPublish((Boolean)newValue);
				return;
			case RunwayPackage.MD_CLASS__ATTRIBUTES:
				setAttributes((MDAttribute)newValue);
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
			case RunwayPackage.MD_CLASS__PUBLISH:
				setPublish(PUBLISH_EDEFAULT);
				return;
			case RunwayPackage.MD_CLASS__ATTRIBUTES:
				setAttributes((MDAttribute)null);
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
			case RunwayPackage.MD_CLASS__PUBLISH:
				return publish != PUBLISH_EDEFAULT;
			case RunwayPackage.MD_CLASS__ATTRIBUTES:
				return attributes != null;
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
		result.append(" (publish: ");
		result.append(publish);
		result.append(')');
		return result.toString();
	}

} //MDClassImpl
