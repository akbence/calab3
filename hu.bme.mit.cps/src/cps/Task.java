/**
 */
package cps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cps.Task#getSeverity <em>Severity</em>}</li>
 *   <li>{@link cps.Task#getReqSlot <em>Req Slot</em>}</li>
 *   <li>{@link cps.Task#getAllocatedTo <em>Allocated To</em>}</li>
 * </ul>
 *
 * @see cps.CpsPackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends EObject {

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The default value is <code>"low"</code>.
	 * The literals are from the enumeration {@link cps.Severity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see cps.Severity
	 * @see #setSeverity(Severity)
	 * @see cps.CpsPackage#getTask_Severity()
	 * @model default="low"
	 * @generated
	 */
	Severity getSeverity();

	/**
	 * Sets the value of the '{@link cps.Task#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see cps.Severity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Severity value);

	/**
	 * Returns the value of the '<em><b>Req Slot</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Slot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Slot</em>' attribute.
	 * @see #setReqSlot(int)
	 * @see cps.CpsPackage#getTask_ReqSlot()
	 * @model default="0"
	 * @generated
	 */
	int getReqSlot();

	/**
	 * Sets the value of the '{@link cps.Task#getReqSlot <em>Req Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Slot</em>' attribute.
	 * @see #getReqSlot()
	 * @generated
	 */
	void setReqSlot(int value);

	/**
	 * Returns the value of the '<em><b>Allocated To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cps.Computer#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated To</em>' reference.
	 * @see #setAllocatedTo(Computer)
	 * @see cps.CpsPackage#getTask_AllocatedTo()
	 * @see cps.Computer#getTasks
	 * @model opposite="tasks" required="true"
	 * @generated
	 */
	Computer getAllocatedTo();

	/**
	 * Sets the value of the '{@link cps.Task#getAllocatedTo <em>Allocated To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated To</em>' reference.
	 * @see #getAllocatedTo()
	 * @generated
	 */
	void setAllocatedTo(Computer value);
} // Task
