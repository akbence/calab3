/**
 */
package cps.impl;

import cps.Computer;
import cps.CpsPackage;

import cps.Task;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cps.impl.ComputerImpl#getDefaultSlots <em>Default Slots</em>}</li>
 *   <li>{@link cps.impl.ComputerImpl#getAvailableSlots <em>Available Slots</em>}</li>
 *   <li>{@link cps.impl.ComputerImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComputerImpl extends MinimalEObjectImpl.Container implements Computer {
	/**
	 * The default value of the '{@link #getDefaultSlots() <em>Default Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSlots()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_SLOTS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getDefaultSlots() <em>Default Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSlots()
	 * @generated
	 * @ordered
	 */
	protected int defaultSlots = DEFAULT_SLOTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getAvailableSlots() <em>Available Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSlots()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_SLOTS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getAvailableSlots() <em>Available Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSlots()
	 * @generated
	 * @ordered
	 */
	protected int availableSlots = AVAILABLE_SLOTS_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsPackage.Literals.COMPUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDefaultSlots() {
		return defaultSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSlots(int newDefaultSlots) {
		int oldDefaultSlots = defaultSlots;
		defaultSlots = newDefaultSlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.COMPUTER__DEFAULT_SLOTS, oldDefaultSlots, defaultSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAvailableSlots() {
		return availableSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableSlots(int newAvailableSlots) {
		int oldAvailableSlots = availableSlots;
		availableSlots = newAvailableSlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.COMPUTER__AVAILABLE_SLOTS, oldAvailableSlots, availableSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectWithInverseResolvingEList<Task>(Task.class, this, CpsPackage.COMPUTER__TASKS, CpsPackage.TASK__ALLOCATED_TO);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpsPackage.COMPUTER__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpsPackage.COMPUTER__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
			case CpsPackage.COMPUTER__DEFAULT_SLOTS:
				return getDefaultSlots();
			case CpsPackage.COMPUTER__AVAILABLE_SLOTS:
				return getAvailableSlots();
			case CpsPackage.COMPUTER__TASKS:
				return getTasks();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CpsPackage.COMPUTER__DEFAULT_SLOTS:
				setDefaultSlots((Integer)newValue);
				return;
			case CpsPackage.COMPUTER__AVAILABLE_SLOTS:
				setAvailableSlots((Integer)newValue);
				return;
			case CpsPackage.COMPUTER__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
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
			case CpsPackage.COMPUTER__DEFAULT_SLOTS:
				setDefaultSlots(DEFAULT_SLOTS_EDEFAULT);
				return;
			case CpsPackage.COMPUTER__AVAILABLE_SLOTS:
				setAvailableSlots(AVAILABLE_SLOTS_EDEFAULT);
				return;
			case CpsPackage.COMPUTER__TASKS:
				getTasks().clear();
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
			case CpsPackage.COMPUTER__DEFAULT_SLOTS:
				return defaultSlots != DEFAULT_SLOTS_EDEFAULT;
			case CpsPackage.COMPUTER__AVAILABLE_SLOTS:
				return availableSlots != AVAILABLE_SLOTS_EDEFAULT;
			case CpsPackage.COMPUTER__TASKS:
				return tasks != null && !tasks.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (defaultSlots: ");
		result.append(defaultSlots);
		result.append(", availableSlots: ");
		result.append(availableSlots);
		result.append(')');
		return result.toString();
	}

} //ComputerImpl
