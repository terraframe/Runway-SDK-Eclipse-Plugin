/**
 */
package com.runwaysdk.eclipse.plugin.runway.provider;


import com.runwaysdk.eclipse.plugin.runway.MDClass;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.runwaysdk.eclipse.plugin.runway.MDClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MDClassItemProvider
	extends MDTypeItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDClassItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPublishPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Publish feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublishPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDClass_publish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDClass_publish_feature", "_UI_MDClass_type"),
				 RunwayPackage.Literals.MD_CLASS__PUBLISH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MDClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MDClass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MDClass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MDClass_type") :
			getString("_UI_MDClass_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MDClass.class)) {
			case RunwayPackage.MD_CLASS__PUBLISH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RunwayPackage.MD_CLASS__ATTRIBUTES:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeBlob()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeDate()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeDateTime()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeDecimal()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeDouble()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeFloat()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeHash()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeInteger()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeNumber()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeStruct()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeText()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeTime()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeLocalCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeLocalText()));

		newChildDescriptors.add
			(createChildParameter
				(RunwayPackage.Literals.MD_CLASS__ATTRIBUTES,
				 RunwayFactory.eINSTANCE.createMDAttributeLong()));
	}

}
