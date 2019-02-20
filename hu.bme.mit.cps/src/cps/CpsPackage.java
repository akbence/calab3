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
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Computers</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Allocated To</b></em>' reference.
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
	 * The meta object id for the '{@link cps.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cps.impl.SensorImpl
	 * @see cps.impl.CpsPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SEVERITY = TASK__SEVERITY;

	/**
	 * The feature id for the '<em><b>Req Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__REQ_SLOT = TASK__REQ_SLOT;

	/**
	 * The feature id for the '<em><b>Allocated To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ALLOCATED_TO = TASK__ALLOCATED_TO;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cps.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cps.impl.ActuatorImpl
	 * @see cps.impl.CpsPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 4;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__SEVERITY = TASK__SEVERITY;

	/**
	 * The feature id for the '<em><b>Req Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__REQ_SLOT = TASK__REQ_SLOT;

	/**
	 * The feature id for the '<em><b>Allocated To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ALLOCATED_TO = TASK__ALLOCATED_TO;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cps.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cps.impl.ControllerImpl
	 * @see cps.impl.CpsPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 5;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__SEVERITY = TASK__SEVERITY;

	/**
	 * The feature id for the '<em><b>Req Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__REQ_SLOT = TASK__REQ_SLOT;

	/**
	 * The feature id for the '<em><b>Allocated To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ALLOCATED_TO = TASK__ALLOCATED_TO;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__TASK = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cps.impl.AlarmImpl <em>Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cps.impl.AlarmImpl
	 * @see cps.impl.CpsPackageImpl#getAlarm()
	 * @generated
	 */
	int ALARM = 6;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__SEVERITY = ACTUATOR__SEVERITY;

	/**
	 * The feature id for the '<em><b>Req Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__REQ_SLOT = ACTUATOR__REQ_SLOT;

	/**
	 * The feature id for the '<em><b>Allocated To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ALLOCATED_TO = ACTUATOR__ALLOCATED_TO;

	/**
	 * The number of structural features of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cps.impl.MotionDetectorImpl <em>Motion Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cps.impl.MotionDetectorImpl
	 * @see cps.impl.CpsPackageImpl#getMotionDetector()
	 * @generated
	 */
	int MOTION_DETECTOR = 7;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_DETECTOR__SEVERITY = SENSOR__SEVERITY;

	/**
	 * The feature id for the '<em><b>Req Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_DETECTOR__REQ_SLOT = SENSOR__REQ_SLOT;

	/**
	 * The feature id for the '<em><b>Allocated To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_DETECTOR__ALLOCATED_TO = SENSOR__ALLOCATED_TO;

	/**
	 * The number of structural features of the '<em>Motion Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_DETECTOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Motion Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_DETECTOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cps.impl.SmokeDetectorImpl <em>Smoke Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cps.impl.SmokeDetectorImpl
	 * @see cps.impl.CpsPackageImpl#getSmokeDetector()
	 * @generated
	 */
	int SMOKE_DETECTOR = 8;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOKE_DETECTOR__SEVERITY = SENSOR__SEVERITY;

	/**
	 * The feature id for the '<em><b>Req Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOKE_DETECTOR__REQ_SLOT = SENSOR__REQ_SLOT;

	/**
	 * The feature id for the '<em><b>Allocated To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOKE_DETECTOR__ALLOCATED_TO = SENSOR__ALLOCATED_TO;

	/**
	 * The number of structural features of the '<em>Smoke Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOKE_DETECTOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Smoke Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOKE_DETECTOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cps.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cps.impl.ServerImpl
	 * @see cps.impl.CpsPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 9;

	/**
	 * The feature id for the '<em><b>Default Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__DEFAULT_SLOTS = COMPUTER__DEFAULT_SLOTS;

	/**
	 * The feature id for the '<em><b>Available Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__AVAILABLE_SLOTS = COMPUTER__AVAILABLE_SLOTS;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__TASKS = COMPUTER__TASKS;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = COMPUTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = COMPUTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cps.impl.MainframeImpl <em>Mainframe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cps.impl.MainframeImpl
	 * @see cps.impl.CpsPackageImpl#getMainframe()
	 * @generated
	 */
	int MAINFRAME = 10;

	/**
	 * The feature id for the '<em><b>Default Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINFRAME__DEFAULT_SLOTS = COMPUTER__DEFAULT_SLOTS;

	/**
	 * The feature id for the '<em><b>Available Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINFRAME__AVAILABLE_SLOTS = COMPUTER__AVAILABLE_SLOTS;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINFRAME__TASKS = COMPUTER__TASKS;

	/**
	 * The number of structural features of the '<em>Mainframe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINFRAME_FEATURE_COUNT = COMPUTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mainframe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINFRAME_OPERATION_COUNT = COMPUTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cps.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cps.Severity
	 * @see cps.impl.CpsPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 11;


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
	 * Returns the meta object for the containment reference list '{@link cps.CyberPhysicalSystem#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see cps.CyberPhysicalSystem#getTasks()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	EReference getCyberPhysicalSystem_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link cps.CyberPhysicalSystem#getComputers <em>Computers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computers</em>'.
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
	 * Returns the meta object for the reference '{@link cps.Task#getAllocatedTo <em>Allocated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocated To</em>'.
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
	 * Returns the meta object for class '{@link cps.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see cps.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link cps.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see cps.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link cps.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see cps.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the reference list '{@link cps.Controller#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task</em>'.
	 * @see cps.Controller#getTask()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Task();

	/**
	 * Returns the meta object for class '{@link cps.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm</em>'.
	 * @see cps.Alarm
	 * @generated
	 */
	EClass getAlarm();

	/**
	 * Returns the meta object for class '{@link cps.MotionDetector <em>Motion Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motion Detector</em>'.
	 * @see cps.MotionDetector
	 * @generated
	 */
	EClass getMotionDetector();

	/**
	 * Returns the meta object for class '{@link cps.SmokeDetector <em>Smoke Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smoke Detector</em>'.
	 * @see cps.SmokeDetector
	 * @generated
	 */
	EClass getSmokeDetector();

	/**
	 * Returns the meta object for class '{@link cps.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see cps.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for class '{@link cps.Mainframe <em>Mainframe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mainframe</em>'.
	 * @see cps.Mainframe
	 * @generated
	 */
	EClass getMainframe();

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
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYBER_PHYSICAL_SYSTEM__TASKS = eINSTANCE.getCyberPhysicalSystem_Tasks();

		/**
		 * The meta object literal for the '<em><b>Computers</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Allocated To</b></em>' reference feature.
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
		 * The meta object literal for the '{@link cps.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cps.impl.SensorImpl
		 * @see cps.impl.CpsPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link cps.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cps.impl.ActuatorImpl
		 * @see cps.impl.CpsPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link cps.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cps.impl.ControllerImpl
		 * @see cps.impl.CpsPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__TASK = eINSTANCE.getController_Task();

		/**
		 * The meta object literal for the '{@link cps.impl.AlarmImpl <em>Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cps.impl.AlarmImpl
		 * @see cps.impl.CpsPackageImpl#getAlarm()
		 * @generated
		 */
		EClass ALARM = eINSTANCE.getAlarm();

		/**
		 * The meta object literal for the '{@link cps.impl.MotionDetectorImpl <em>Motion Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cps.impl.MotionDetectorImpl
		 * @see cps.impl.CpsPackageImpl#getMotionDetector()
		 * @generated
		 */
		EClass MOTION_DETECTOR = eINSTANCE.getMotionDetector();

		/**
		 * The meta object literal for the '{@link cps.impl.SmokeDetectorImpl <em>Smoke Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cps.impl.SmokeDetectorImpl
		 * @see cps.impl.CpsPackageImpl#getSmokeDetector()
		 * @generated
		 */
		EClass SMOKE_DETECTOR = eINSTANCE.getSmokeDetector();

		/**
		 * The meta object literal for the '{@link cps.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cps.impl.ServerImpl
		 * @see cps.impl.CpsPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '{@link cps.impl.MainframeImpl <em>Mainframe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cps.impl.MainframeImpl
		 * @see cps.impl.CpsPackageImpl#getMainframe()
		 * @generated
		 */
		EClass MAINFRAME = eINSTANCE.getMainframe();

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
