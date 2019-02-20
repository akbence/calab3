/**
 */
package cps;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cps.CpsFactory
 * @model kind="package"
 * @generated
 */
public interface CpsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CpsPackage eINSTANCE = cps.impl.CpsPackageImpl.init();

	/**
	 * The meta object id for the '{@link cps.impl.CyberPhysicalSystemImpl <em>Cyber Physical System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cps.impl.CyberPhysicalSystemImpl
	 * @see cps.impl.CpsPackageImpl#getCyberPhysicalSystem()
	 * @generated
	 */
	int CYBER_PHYSICAL_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Computers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM__COMPUTERS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM__NAME = 2;

	/**
	 * The number of structural features of the '<em>Cyber Physical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cyber Physical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cps.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cps.impl.TaskImpl
	 * @see cps.impl.CpsPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SEVERITY = 0;

	/**
	 * The feature id for the '<em><b>Req Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REQ_SLOT = 1;

	/**
	 * The feature id for the '<em><b>Allocated To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ALLOCATED_TO = 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cps.impl.ComputerImpl <em>Computer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cps.impl.ComputerImpl
	 * @see cps.impl.CpsPackageImpl#getComputer()
	 * @generated
	 */
	int COMPUTER = 2;

	/**
	 * The feature id for the '<em><b>Default Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__DEFAULT_SLOTS = 0;

	/**
	 * The feature id for the '<em><b>Available Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__AVAILABLE_SLOTS = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__TASKS = 2;

	/**
	 * The number of structural features of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cps.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cps.Severity
	 * @see cps.impl.CpsPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 3;


	/**
	 * Returns the meta object for class '{@link cps.CyberPhysicalSystem <em>Cyber Physical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cyber Physical System</em>'.
	 * @see cps.CyberPhysicalSystem
	 * @generated
	 */
	EClass getCyberPhysicalSystem();

	/**
	 * Returns the meta object for the reference list '{@link cps.CyberPhysicalSystem#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see cps.CyberPhysicalSystem#getTasks()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	EReference getCyberPhysicalSystem_Tasks();

	/**
	 * Returns the meta object for the reference list '{@link cps.CyberPhysicalSystem#getComputers <em>Computers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Computers</em>'.
	 * @see cps.CyberPhysicalSystem#getComputers()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	EReference getCyberPhysicalSystem_Computers();

	/**
	 * Returns the meta object for the attribute '{@link cps.CyberPhysicalSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cps.CyberPhysicalSystem#getName()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	EAttribute getCyberPhysicalSystem_Name();

	/**
	 * Returns the meta object for class '{@link cps.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see cps.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link cps.Task#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see cps.Task#getSeverity()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Severity();

	/**
	 * Returns the meta object for the attribute '{@link cps.Task#getReqSlot <em>Req Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req Slot</em>'.
	 * @see cps.Task#getReqSlot()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ReqSlot();

	/**
	 * Returns the meta object for the reference list '{@link cps.Task#getAllocatedTo <em>Allocated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated To</em>'.
	 * @see cps.Task#getAllocatedTo()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_AllocatedTo();

	/**
	 * Returns the meta object for class '{@link cps.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computer</em>'.
	 * @see cps.Computer
	 * @generated
	 */
	EClass getComputer();

	/**
	 * Returns the meta object for the attribute '{@link cps.Computer#getDefaultSlots <em>Default Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Slots</em>'.
	 * @see cps.Computer#getDefaultSlots()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_DefaultSlots();

	/**
	 * Returns the meta object for the attribute '{@link cps.Computer#getAvailableSlots <em>Available Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Slots</em>'.
	 * @see cps.Computer#getAvailableSlots()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_AvailableSlots();

	/**
	 * Returns the meta object for the reference list '{@link cps.Computer#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see cps.Computer#getTasks()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Tasks();

	/**
	 * Returns the meta object for enum '{@link cps.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see cps.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CpsFactory getCpsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cps.impl.CyberPhysicalSystemImpl <em>Cyber Physical System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cps.impl.CyberPhysicalSystemImpl
		 * @see cps.impl.CpsPackageImpl#getCyberPhysicalSystem()
		 * @generated
		 */
		EClass CYBER_PHYSICAL_SYSTEM = eINSTANCE.getCyberPhysicalSystem();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYBER_PHYSICAL_SYSTEM__TASKS = eINSTANCE.getCyberPhysicalSystem_Tasks();

		/**
		 * The meta object literal for the '<em><b>Computers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYBER_PHYSICAL_SYSTEM__COMPUTERS = eINSTANCE.getCyberPhysicalSystem_Computers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYBER_PHYSICAL_SYSTEM__NAME = eINSTANCE.getCyberPhysicalSystem_Name();

		/**
		 * The meta object literal for the '{@link cps.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cps.impl.TaskImpl
		 * @see cps.impl.CpsPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__SEVERITY = eINSTANCE.getTask_Severity();

		/**
		 * The meta object literal for the '<em><b>Req Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__REQ_SLOT = eINSTANCE.getTask_ReqSlot();

		/**
		 * The meta object literal for the '<em><b>Allocated To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ALLOCATED_TO = eINSTANCE.getTask_AllocatedTo();

		/**
		 * The meta object literal for the '{@link cps.impl.ComputerImpl <em>Computer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cps.impl.ComputerImpl
		 * @see cps.impl.CpsPackageImpl#getComputer()
		 * @generated
		 */
		EClass COMPUTER = eINSTANCE.getComputer();

		/**
		 * The meta object literal for the '<em><b>Default Slots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__DEFAULT_SLOTS = eINSTANCE.getComputer_DefaultSlots();

		/**
		 * The meta object literal for the '<em><b>Available Slots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__AVAILABLE_SLOTS = eINSTANCE.getComputer_AvailableSlots();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__TASKS = eINSTANCE.getComputer_Tasks();

		/**
		 * The meta object literal for the '{@link cps.Severity <em>Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cps.Severity
		 * @see cps.impl.CpsPackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

	}

} //CpsPackage
