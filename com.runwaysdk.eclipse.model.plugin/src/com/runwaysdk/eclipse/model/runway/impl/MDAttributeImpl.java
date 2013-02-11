/**
 */
package com.runwaysdk.eclipse.model.runway.impl;

import com.runwaysdk.eclipse.model.runway.MDAttribute;
import com.runwaysdk.eclipse.model.runway.RunwayPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.model.runway.impl.MDAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.model.runway.impl.MDAttributeImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.model.runway.impl.MDAttributeImpl#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.model.runway.impl.MDAttributeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.model.runway.impl.MDAttributeImpl#getDisplayLabel <em>Display Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MDAttributeImpl extends EObjectImpl implements MDAttribute
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected static final boolean REQUIRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected boolean required = REQUIRED_EDEFAULT;

  /**
   * The default value of the '{@link #isImmutable() <em>Immutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImmutable()
   * @generated
   * @ordered
   */
  protected static final boolean IMMUTABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isImmutable() <em>Immutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImmutable()
   * @generated
   * @ordered
   */
  protected boolean immutable = IMMUTABLE_EDEFAULT;

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
   * The default value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayLabel()
   * @generated
   * @ordered
   */
  protected static final String DISPLAY_LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayLabel()
   * @generated
   * @ordered
   */
  protected String displayLabel = DISPLAY_LABEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDAttributeImpl()
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
    return RunwayPackage.Literals.MD_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRequired()
  {
    return required;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequired(boolean newRequired)
  {
    boolean oldRequired = required;
    required = newRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_ATTRIBUTE__REQUIRED, oldRequired, required));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isImmutable()
  {
    return immutable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImmutable(boolean newImmutable)
  {
    boolean oldImmutable = immutable;
    immutable = newImmutable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_ATTRIBUTE__IMMUTABLE, oldImmutable, immutable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_ATTRIBUTE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDisplayLabel()
  {
    return displayLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplayLabel(String newDisplayLabel)
  {
    String oldDisplayLabel = displayLabel;
    displayLabel = newDisplayLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_ATTRIBUTE__DISPLAY_LABEL, oldDisplayLabel, displayLabel));
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
      case RunwayPackage.MD_ATTRIBUTE__NAME:
        return getName();
      case RunwayPackage.MD_ATTRIBUTE__REQUIRED:
        return isRequired();
      case RunwayPackage.MD_ATTRIBUTE__IMMUTABLE:
        return isImmutable();
      case RunwayPackage.MD_ATTRIBUTE__DESCRIPTION:
        return getDescription();
      case RunwayPackage.MD_ATTRIBUTE__DISPLAY_LABEL:
        return getDisplayLabel();
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
      case RunwayPackage.MD_ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case RunwayPackage.MD_ATTRIBUTE__REQUIRED:
        setRequired((Boolean)newValue);
        return;
      case RunwayPackage.MD_ATTRIBUTE__IMMUTABLE:
        setImmutable((Boolean)newValue);
        return;
      case RunwayPackage.MD_ATTRIBUTE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RunwayPackage.MD_ATTRIBUTE__DISPLAY_LABEL:
        setDisplayLabel((String)newValue);
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
      case RunwayPackage.MD_ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RunwayPackage.MD_ATTRIBUTE__REQUIRED:
        setRequired(REQUIRED_EDEFAULT);
        return;
      case RunwayPackage.MD_ATTRIBUTE__IMMUTABLE:
        setImmutable(IMMUTABLE_EDEFAULT);
        return;
      case RunwayPackage.MD_ATTRIBUTE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RunwayPackage.MD_ATTRIBUTE__DISPLAY_LABEL:
        setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
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
      case RunwayPackage.MD_ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RunwayPackage.MD_ATTRIBUTE__REQUIRED:
        return required != REQUIRED_EDEFAULT;
      case RunwayPackage.MD_ATTRIBUTE__IMMUTABLE:
        return immutable != IMMUTABLE_EDEFAULT;
      case RunwayPackage.MD_ATTRIBUTE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RunwayPackage.MD_ATTRIBUTE__DISPLAY_LABEL:
        return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", required: ");
    result.append(required);
    result.append(", immutable: ");
    result.append(immutable);
    result.append(", description: ");
    result.append(description);
    result.append(", displayLabel: ");
    result.append(displayLabel);
    result.append(')');
    return result.toString();
  }

} //MDAttributeImpl
