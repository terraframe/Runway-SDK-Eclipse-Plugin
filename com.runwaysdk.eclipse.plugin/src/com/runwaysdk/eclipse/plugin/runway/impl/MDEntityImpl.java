/**
 */
package com.runwaysdk.eclipse.plugin.runway.impl;

import com.runwaysdk.eclipse.plugin.runway.MDEntity;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDEntityImpl#getTable <em>Table</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDEntityImpl#isGenerateController <em>Generate Controller</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDEntityImpl#isEnforceSiteMaster <em>Enforce Site Master</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDEntityImpl extends MDClassImpl implements MDEntity {
	/**
	 * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected String table = TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateController() <em>Generate Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateController()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_CONTROLLER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateController() <em>Generate Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateController()
	 * @generated
	 * @ordered
	 */
	protected boolean generateController = GENERATE_CONTROLLER_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnforceSiteMaster() <em>Enforce Site Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnforceSiteMaster()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENFORCE_SITE_MASTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnforceSiteMaster() <em>Enforce Site Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnforceSiteMaster()
	 * @generated
	 * @ordered
	 */
	protected boolean enforceSiteMaster = ENFORCE_SITE_MASTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RunwayPackage.Literals.MD_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(String newTable) {
		String oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_ENTITY__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateController() {
		return generateController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateController(boolean newGenerateController) {
		boolean oldGenerateController = generateController;
		generateController = newGenerateController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_ENTITY__GENERATE_CONTROLLER, oldGenerateController, generateController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnforceSiteMaster() {
		return enforceSiteMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnforceSiteMaster(boolean newEnforceSiteMaster) {
		boolean oldEnforceSiteMaster = enforceSiteMaster;
		enforceSiteMaster = newEnforceSiteMaster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_ENTITY__ENFORCE_SITE_MASTER, oldEnforceSiteMaster, enforceSiteMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RunwayPackage.MD_ENTITY__TABLE:
				return getTable();
			case RunwayPackage.MD_ENTITY__GENERATE_CONTROLLER:
				return isGenerateController();
			case RunwayPackage.MD_ENTITY__ENFORCE_SITE_MASTER:
				return isEnforceSiteMaster();
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
			case RunwayPackage.MD_ENTITY__TABLE:
				setTable((String)newValue);
				return;
			case RunwayPackage.MD_ENTITY__GENERATE_CONTROLLER:
				setGenerateController((Boolean)newValue);
				return;
			case RunwayPackage.MD_ENTITY__ENFORCE_SITE_MASTER:
				setEnforceSiteMaster((Boolean)newValue);
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
			case RunwayPackage.MD_ENTITY__TABLE:
				setTable(TABLE_EDEFAULT);
				return;
			case RunwayPackage.MD_ENTITY__GENERATE_CONTROLLER:
				setGenerateController(GENERATE_CONTROLLER_EDEFAULT);
				return;
			case RunwayPackage.MD_ENTITY__ENFORCE_SITE_MASTER:
				setEnforceSiteMaster(ENFORCE_SITE_MASTER_EDEFAULT);
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
			case RunwayPackage.MD_ENTITY__TABLE:
				return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
			case RunwayPackage.MD_ENTITY__GENERATE_CONTROLLER:
				return generateController != GENERATE_CONTROLLER_EDEFAULT;
			case RunwayPackage.MD_ENTITY__ENFORCE_SITE_MASTER:
				return enforceSiteMaster != ENFORCE_SITE_MASTER_EDEFAULT;
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
		result.append(" (table: ");
		result.append(table);
		result.append(", generateController: ");
		result.append(generateController);
		result.append(", enforceSiteMaster: ");
		result.append(enforceSiteMaster);
		result.append(')');
		return result.toString();
	}

} //MDEntityImpl
