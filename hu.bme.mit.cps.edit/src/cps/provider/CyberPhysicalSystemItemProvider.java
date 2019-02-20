/**
 */
package cps.provider;


import cps.CpsFactory;
import cps.CpsPackage;
import cps.CyberPhysicalSystem;

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
 * This is the item provider adapter for a {@link cps.CyberPhysicalSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CyberPhysicalSystemItemProvider 
	extends ItemProviderAdapter
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
	public CyberPhysicalSystemItemProvider(AdapterFactory adapterFactory) {
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

			addTasksPropertyDescriptor(object);
			addComputersPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tasks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTasksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CyberPhysicalSystem_tasks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CyberPhysicalSystem_tasks_feature", "_UI_CyberPhysicalSystem_type"),
				 CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM__TASKS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Computers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComputersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CyberPhysicalSystem_computers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CyberPhysicalSystem_computers_feature", "_UI_CyberPhysicalSystem_type"),
				 CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM__COMPUTERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CyberPhysicalSystem_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CyberPhysicalSystem_name_feature", "_UI_CyberPhysicalSystem_type"),
				 CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM__NAME,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM__TASKS);
			childrenFeatures.add(CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM__COMPUTERS);
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
	 * This returns CyberPhysicalSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CyberPhysicalSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CyberPhysicalSystem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CyberPhysicalSystem_type") :
			getString("_UI_CyberPhysicalSystem_type") + " " + label;
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

		switch (notification.getFeatureID(CyberPhysicalSystem.class)) {
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__TASKS:
			case CpsPackage.CYBER_PHYSICAL_SYSTEM__COMPUTERS:
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
				(CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM__TASKS,
				 CpsFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM__TASKS,
				 CpsFactory.eINSTANCE.createAlarm()));

		newChildDescriptors.add
			(createChildParameter
				(CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM__TASKS,
				 CpsFactory.eINSTANCE.createMotionDetector()));

		newChildDescriptors.add
			(createChildParameter
				(CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM__TASKS,
				 CpsFactory.eINSTANCE.createSmokeDetector()));

		newChildDescriptors.add
			(createChildParameter
				(CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM__COMPUTERS,
				 CpsFactory.eINSTANCE.createServer()));

		newChildDescriptors.add
			(createChildParameter
				(CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM__COMPUTERS,
				 CpsFactory.eINSTANCE.createMainframe()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CpsEditPlugin.INSTANCE;
	}

}
