/**
 */
package com.runwaysdk.eclipse.plugin.runway.impl;

import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Business</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#isIsRemovable <em>Is Removable</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#isIsExtendable <em>Is Extendable</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#getCacheAlgorithm <em>Cache Algorithm</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#getCacheSize <em>Cache Size</em>}</li>
 *   <li>{@link com.runwaysdk.eclipse.plugin.runway.impl.MDBusinessImpl#getPublish <em>Publish</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDBusinessImpl extends EObjectImpl implements MDBusiness
{
  /**
   * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected static final String CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected String className = CLASS_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<MDAttribute> attributes;

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
   * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected static final String COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected String column = COLUMN_EDEFAULT;

  /**
   * The default value of the '{@link #isIsRemovable() <em>Is Removable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsRemovable()
   * @generated
   * @ordered
   */
  protected static final boolean IS_REMOVABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsRemovable() <em>Is Removable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsRemovable()
   * @generated
   * @ordered
   */
  protected boolean isRemovable = IS_REMOVABLE_EDEFAULT;

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
   * The default value of the '{@link #isIsExtendable() <em>Is Extendable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsExtendable()
   * @generated
   * @ordered
   */
  protected static final boolean IS_EXTENDABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsExtendable() <em>Is Extendable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsExtendable()
   * @generated
   * @ordered
   */
  protected boolean isExtendable = IS_EXTENDABLE_EDEFAULT;

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
   * The default value of the '{@link #getPublish() <em>Publish</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublish()
   * @generated
   * @ordered
   */
  protected static final String PUBLISH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPublish() <em>Publish</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublish()
   * @generated
   * @ordered
   */
  protected String publish = PUBLISH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MDBusinessImpl()
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
    return RunwayPackage.Literals.MD_BUSINESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassName()
  {
    return className;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassName(String newClassName)
  {
    String oldClassName = className;
    className = newClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_BUSINESS__CLASS_NAME, oldClassName, className));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MDAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<MDAttribute>(MDAttribute.class, this, RunwayPackage.MD_BUSINESS__ATTRIBUTES);
    }
    return attributes;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_BUSINESS__DISPLAY_LABEL, oldDisplayLabel, displayLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColumn()
  {
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumn(String newColumn)
  {
    String oldColumn = column;
    column = newColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_BUSINESS__COLUMN, oldColumn, column));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsRemovable()
  {
    return isRemovable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsRemovable(boolean newIsRemovable)
  {
    boolean oldIsRemovable = isRemovable;
    isRemovable = newIsRemovable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_BUSINESS__IS_REMOVABLE, oldIsRemovable, isRemovable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_BUSINESS__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsExtendable()
  {
    return isExtendable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsExtendable(boolean newIsExtendable)
  {
    boolean oldIsExtendable = isExtendable;
    isExtendable = newIsExtendable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_BUSINESS__IS_EXTENDABLE, oldIsExtendable, isExtendable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_BUSINESS__IS_ABSTRACT, oldIsAbstract, isAbstract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(String newExtends)
  {
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
  public String getCacheAlgorithm()
  {
    return cacheAlgorithm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCacheAlgorithm(String newCacheAlgorithm)
  {
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
  public String getCacheSize()
  {
    return cacheSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCacheSize(String newCacheSize)
  {
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
  public String getPublish()
  {
    return publish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPublish(String newPublish)
  {
    String oldPublish = publish;
    publish = newPublish;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RunwayPackage.MD_BUSINESS__PUBLISH, oldPublish, publish));
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
      case RunwayPackage.MD_BUSINESS__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
      case RunwayPackage.MD_BUSINESS__CLASS_NAME:
        return getClassName();
      case RunwayPackage.MD_BUSINESS__ATTRIBUTES:
        return getAttributes();
      case RunwayPackage.MD_BUSINESS__DISPLAY_LABEL:
        return getDisplayLabel();
      case RunwayPackage.MD_BUSINESS__COLUMN:
        return getColumn();
      case RunwayPackage.MD_BUSINESS__IS_REMOVABLE:
        return isIsRemovable();
      case RunwayPackage.MD_BUSINESS__DESCRIPTION:
        return getDescription();
      case RunwayPackage.MD_BUSINESS__IS_EXTENDABLE:
        return isIsExtendable();
      case RunwayPackage.MD_BUSINESS__IS_ABSTRACT:
        return isIsAbstract();
      case RunwayPackage.MD_BUSINESS__EXTENDS:
        return getExtends();
      case RunwayPackage.MD_BUSINESS__CACHE_ALGORITHM:
        return getCacheAlgorithm();
      case RunwayPackage.MD_BUSINESS__CACHE_SIZE:
        return getCacheSize();
      case RunwayPackage.MD_BUSINESS__PUBLISH:
        return getPublish();
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
      case RunwayPackage.MD_BUSINESS__CLASS_NAME:
        setClassName((String)newValue);
        return;
      case RunwayPackage.MD_BUSINESS__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends MDAttribute>)newValue);
        return;
      case RunwayPackage.MD_BUSINESS__DISPLAY_LABEL:
        setDisplayLabel((String)newValue);
        return;
      case RunwayPackage.MD_BUSINESS__COLUMN:
        setColumn((String)newValue);
        return;
      case RunwayPackage.MD_BUSINESS__IS_REMOVABLE:
        setIsRemovable((Boolean)newValue);
        return;
      case RunwayPackage.MD_BUSINESS__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RunwayPackage.MD_BUSINESS__IS_EXTENDABLE:
        setIsExtendable((Boolean)newValue);
        return;
      case RunwayPackage.MD_BUSINESS__IS_ABSTRACT:
        setIsAbstract((Boolean)newValue);
        return;
      case RunwayPackage.MD_BUSINESS__EXTENDS:
        setExtends((String)newValue);
        return;
      case RunwayPackage.MD_BUSINESS__CACHE_ALGORITHM:
        setCacheAlgorithm((String)newValue);
        return;
      case RunwayPackage.MD_BUSINESS__CACHE_SIZE:
        setCacheSize((String)newValue);
        return;
      case RunwayPackage.MD_BUSINESS__PUBLISH:
        setPublish((String)newValue);
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
      case RunwayPackage.MD_BUSINESS__CLASS_NAME:
        setClassName(CLASS_NAME_EDEFAULT);
        return;
      case RunwayPackage.MD_BUSINESS__ATTRIBUTES:
        getAttributes().clear();
        return;
      case RunwayPackage.MD_BUSINESS__DISPLAY_LABEL:
        setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
        return;
      case RunwayPackage.MD_BUSINESS__COLUMN:
        setColumn(COLUMN_EDEFAULT);
        return;
      case RunwayPackage.MD_BUSINESS__IS_REMOVABLE:
        setIsRemovable(IS_REMOVABLE_EDEFAULT);
        return;
      case RunwayPackage.MD_BUSINESS__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RunwayPackage.MD_BUSINESS__IS_EXTENDABLE:
        setIsExtendable(IS_EXTENDABLE_EDEFAULT);
        return;
      case RunwayPackage.MD_BUSINESS__IS_ABSTRACT:
        setIsAbstract(IS_ABSTRACT_EDEFAULT);
        return;
      case RunwayPackage.MD_BUSINESS__EXTENDS:
        setExtends(EXTENDS_EDEFAULT);
        return;
      case RunwayPackage.MD_BUSINESS__CACHE_ALGORITHM:
        setCacheAlgorithm(CACHE_ALGORITHM_EDEFAULT);
        return;
      case RunwayPackage.MD_BUSINESS__CACHE_SIZE:
        setCacheSize(CACHE_SIZE_EDEFAULT);
        return;
      case RunwayPackage.MD_BUSINESS__PUBLISH:
        setPublish(PUBLISH_EDEFAULT);
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
      case RunwayPackage.MD_BUSINESS__CLASS_NAME:
        return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
      case RunwayPackage.MD_BUSINESS__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case RunwayPackage.MD_BUSINESS__DISPLAY_LABEL:
        return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
      case RunwayPackage.MD_BUSINESS__COLUMN:
        return COLUMN_EDEFAULT == null ? column != null : !COLUMN_EDEFAULT.equals(column);
      case RunwayPackage.MD_BUSINESS__IS_REMOVABLE:
        return isRemovable != IS_REMOVABLE_EDEFAULT;
      case RunwayPackage.MD_BUSINESS__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RunwayPackage.MD_BUSINESS__IS_EXTENDABLE:
        return isExtendable != IS_EXTENDABLE_EDEFAULT;
      case RunwayPackage.MD_BUSINESS__IS_ABSTRACT:
        return isAbstract != IS_ABSTRACT_EDEFAULT;
      case RunwayPackage.MD_BUSINESS__EXTENDS:
        return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
      case RunwayPackage.MD_BUSINESS__CACHE_ALGORITHM:
        return CACHE_ALGORITHM_EDEFAULT == null ? cacheAlgorithm != null : !CACHE_ALGORITHM_EDEFAULT.equals(cacheAlgorithm);
      case RunwayPackage.MD_BUSINESS__CACHE_SIZE:
        return CACHE_SIZE_EDEFAULT == null ? cacheSize != null : !CACHE_SIZE_EDEFAULT.equals(cacheSize);
      case RunwayPackage.MD_BUSINESS__PUBLISH:
        return PUBLISH_EDEFAULT == null ? publish != null : !PUBLISH_EDEFAULT.equals(publish);
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
    result.append(" (className: ");
    result.append(className);
    result.append(", displayLabel: ");
    result.append(displayLabel);
    result.append(", column: ");
    result.append(column);
    result.append(", isRemovable: ");
    result.append(isRemovable);
    result.append(", description: ");
    result.append(description);
    result.append(", isExtendable: ");
    result.append(isExtendable);
    result.append(", isAbstract: ");
    result.append(isAbstract);
    result.append(", extends: ");
    result.append(extends_);
    result.append(", cacheAlgorithm: ");
    result.append(cacheAlgorithm);
    result.append(", cacheSize: ");
    result.append(cacheSize);
    result.append(", publish: ");
    result.append(publish);
    result.append(')');
    return result.toString();
  }

} //MDBusinessImpl
