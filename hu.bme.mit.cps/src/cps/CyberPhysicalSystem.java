/**
 */
package cps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cyber Physical System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cps.CyberPhysicalSystem#getTasks <em>Tasks</em>}</li>
 *   <li>{@link cps.CyberPhysicalSystem#getComputers <em>Computers</em>}</li>
 *   <li>{@link cps.CyberPhysicalSystem#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see cps.CpsPackage#getCyberPhysicalSystem()
 * @model
 * @generated
 */
public interface CyberPhysicalSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link cps.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see cps.CpsPackage#getCyberPhysicalSystem_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Computers</b></em>' containment reference list.
	 * The list contents are of type {@link cps.Computer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computers</em>' containment reference list.
	 * @see cps.CpsPackage#getCyberPhysicalSystem_Computers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Computer> getComputers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cps.CpsPackage#getCyberPhysicalSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cps.CyberPhysicalSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CyberPhysicalSystem
