/**
 */
package cps.impl;

import cps.Computer;
import cps.CpsPackage;
import cps.Severity;
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
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cps.impl.TaskImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link cps.impl.TaskImpl#getReqSlot <em>Req Slot</em>}</li>
 *   <li>{@link cps.impl.TaskImpl#getAllocatedTo <em>Allocated To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Severity SEVERITY_EDEFAULT = Severity.LOW;
	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Severity severity = SEVERITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getReqSlot() <em>Req Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqSlot()
	 * @generated
	 * @ordered
	 */
	protected static final int REQ_SLOT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getReqSlot() <em>Req Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqSlot()
	 * @generated
	 * @ordered
	 */
	protected int reqSlot = REQ_SLOT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAllocatedTo() <em>Allocated To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Computer> allocatedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(Severity newSeverity) {
		Severity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.TASK__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReqSlot() {
		return reqSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqSlot(int newReqSlot) {
		int oldReqSlot = reqSlot;
		reqSlot = newReqSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.TASK__REQ_SLOT, oldReqSlot, reqSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Computer> getAllocatedTo() {
		if (allocatedTo == null) {
			allocatedTo = new EObjectWithInverseResolvingEList.ManyInverse<Computer>(Computer.class, this, CpsPackage.TASK__ALLOCATED_TO, CpsPackage.COMPUTER__TASKS);
		}
		return allocatedTo;
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
			case CpsPackage.TASK__ALLOCATED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatedTo()).basicAdd(otherEnd, msgs);
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
			case CpsPackage.TASK__ALLOCATED_TO:
				return ((InternalEList<?>)getAllocatedTo()).basicRemove(otherEnd, msgs);
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
			case CpsPackage.TASK__SEVERITY:
				return getSeverity();
			case CpsPackage.TASK__REQ_SLOT:
				return getReqSlot();
			case CpsPackage.TASK__ALLOCATED_TO:
				return getAllocatedTo();
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
			case CpsPackage.TASK__SEVERITY:
				setSeverity((Severity)newValue);
				return;
			case CpsPackage.TASK__REQ_SLOT:
				setReqSlot((Integer)newValue);
				return;
			case CpsPackage.TASK__ALLOCATED_TO:
				getAllocatedTo().clear();
				getAllocatedTo().addAll((Collection<? extends Computer>)newValue);
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
			case CpsPackage.TASK__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case CpsPackage.TASK__REQ_SLOT:
				setReqSlot(REQ_SLOT_EDEFAULT);
				return;
			case CpsPackage.TASK__ALLOCATED_TO:
				getAllocatedTo().clear();
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
			case CpsPackage.TASK__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case CpsPackage.TASK__REQ_SLOT:
				return reqSlot != REQ_SLOT_EDEFAULT;
			case CpsPackage.TASK__ALLOCATED_TO:
				return allocatedTo != null && !allocatedTo.isEmpty();
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
		result.append(" (severity: ");
		result.append(severity);
		result.append(", reqSlot: ");
		result.append(reqSlot);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
