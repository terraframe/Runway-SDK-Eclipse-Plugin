/**
 */
package com.runwaysdk.eclipse.plugin.runway.provider;


import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDBusiness} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MDBusinessItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDBusinessItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addClassNamePropertyDescriptor(object);
      addDisplayLabelPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Class Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addClassNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_MDBusiness_className_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_MDBusiness_className_feature", "_UI_MDBusiness_type"),
         RunwayPackage.Literals.MD_BUSINESS__CLASS_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Display Label feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDisplayLabelPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_MDBusiness_displayLabel_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_MDBusiness_displayLabel_feature", "_UI_MDBusiness_type"),
         RunwayPackage.Literals.MD_BUSINESS__DISPLAY_LABEL,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns MDBusiness.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/MDBusiness"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((MDBusiness)object).getClassName();
    return label == null || label.length() == 0 ?
      getString("_UI_MDBusiness_type") :
      getString("_UI_MDBusiness_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(MDBusiness.class))
    {
      case RunwayPackage.MD_BUSINESS__CLASS_NAME:
      case RunwayPackage.MD_BUSINESS__DISPLAY_LABEL:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case RunwayPackage.MD_BUSINESS__ATTRIBUTES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeBlob()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeBoolean()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeCharacter()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeDate()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeDateTime()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeDecimal()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeDouble()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeEnumeration()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeFloat()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeHash()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeInteger()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeNumber()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeStruct()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeText()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeTime()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeLocalCharacter()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeLocalText()));

    newChildDescriptors.add
      (createChildParameter
        (RunwayPackage.Literals.MD_BUSINESS__ATTRIBUTES,
         RunwayFactory.eINSTANCE.createMdAttributeLong()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return RunwayEditPlugin.INSTANCE;
  }

}
