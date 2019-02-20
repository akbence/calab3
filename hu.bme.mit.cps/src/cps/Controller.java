/**
 */
package cps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cps.Controller#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see cps.CpsPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends Task {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference list.
	 * The list contents are of type {@link cps.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference list.
	 * @see cps.CpsPackage#getController_Task()
	 * @model lower="2"
	 * @generated
	 */
	EList<Task> getTask();

} // Controller
