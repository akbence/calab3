/**
 */
package cps;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cps.Computer#getDefaultSlots <em>Default Slots</em>}</li>
 *   <li>{@link cps.Computer#getAvailableSlots <em>Available Slots</em>}</li>
 *   <li>{@link cps.Computer#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see cps.CpsPackage#getComputer()
 * @model abstract="true"
 * @generated
 */
public interface Computer extends EObject {

	/**
	 * Returns the value of the '<em><b>Default Slots</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Slots</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Slots</em>' attribute.
	 * @see #setDefaultSlots(int)
	 * @see cps.CpsPackage#getComputer_DefaultSlots()
	 * @model default="0"
	 * @generated
	 */
	int getDefaultSlots();

	/**
	 * Sets the value of the '{@link cps.Computer#getDefaultSlots <em>Default Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Slots</em>' attribute.
	 * @see #getDefaultSlots()
	 * @generated
	 */
	void setDefaultSlots(int value);

	/**
	 * Returns the value of the '<em><b>Available Slots</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Slots</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Slots</em>' attribute.
	 * @see #setAvailableSlots(int)
	 * @see cps.CpsPackage#getComputer_AvailableSlots()
	 * @model default="0"
	 * @generated
	 */
	int getAvailableSlots();

	/**
	 * Sets the value of the '{@link cps.Computer#getAvailableSlots <em>Available Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Slots</em>' attribute.
	 * @see #getAvailableSlots()
	 * @generated
	 */
	void setAvailableSlots(int value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link cps.Task}.
	 * It is bidirectional and its opposite is '{@link cps.Task#getAllocatedTo <em>Allocated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see cps.CpsPackage#getComputer_Tasks()
	 * @see cps.Task#getAllocatedTo
	 * @model opposite="allocatedTo"
	 * @generated
	 */
	EList<Task> getTasks();
} // Computer
