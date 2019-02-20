/**
 */
package cps.impl;

import cps.Actuator;
import cps.Alarm;
import cps.Computer;
import cps.Controller;
import cps.CpsFactory;
import cps.CpsPackage;
import cps.CyberPhysicalSystem;
import cps.Mainframe;
import cps.MotionDetector;
import cps.Sensor;
import cps.Server;
import cps.Severity;
import cps.SmokeDetector;
import cps.Task;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CpsPackageImpl extends EPackageImpl implements CpsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cyberPhysicalSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motionDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smokeDetectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainframeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cps.CpsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CpsPackageImpl() {
		super(eNS_URI, CpsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CpsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CpsPackage init() {
		if (isInited) return (CpsPackage)EPackage.Registry.INSTANCE.getEPackage(CpsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCpsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CpsPackageImpl theCpsPackage = registeredCpsPackage instanceof CpsPackageImpl ? (CpsPackageImpl)registeredCpsPackage : new CpsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCpsPackage.createPackageContents();

		// Initialize created meta-data
		theCpsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCpsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CpsPackage.eNS_URI, theCpsPackage);
		return theCpsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCyberPhysicalSystem() {
		return cyberPhysicalSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCyberPhysicalSystem_Tasks() {
		return (EReference)cyberPhysicalSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCyberPhysicalSystem_Computers() {
		return (EReference)cyberPhysicalSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCyberPhysicalSystem_Name() {
		return (EAttribute)cyberPhysicalSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Severity() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_ReqSlot() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_AllocatedTo() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputer() {
		return computerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputer_DefaultSlots() {
		return (EAttribute)computerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputer_AvailableSlots() {
		return (EAttribute)computerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComputer_Tasks() {
		return (EReference)computerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getController_Task() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlarm() {
		return alarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMotionDetector() {
		return motionDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSmokeDetector() {
		return smokeDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMainframe() {
		return mainframeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSeverity() {
		return severityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CpsFactory getCpsFactory() {
		return (CpsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cyberPhysicalSystemEClass = createEClass(CYBER_PHYSICAL_SYSTEM);
		createEReference(cyberPhysicalSystemEClass, CYBER_PHYSICAL_SYSTEM__TASKS);
		createEReference(cyberPhysicalSystemEClass, CYBER_PHYSICAL_SYSTEM__COMPUTERS);
		createEAttribute(cyberPhysicalSystemEClass, CYBER_PHYSICAL_SYSTEM__NAME);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__SEVERITY);
		createEAttribute(taskEClass, TASK__REQ_SLOT);
		createEReference(taskEClass, TASK__ALLOCATED_TO);

		computerEClass = createEClass(COMPUTER);
		createEAttribute(computerEClass, COMPUTER__DEFAULT_SLOTS);
		createEAttribute(computerEClass, COMPUTER__AVAILABLE_SLOTS);
		createEReference(computerEClass, COMPUTER__TASKS);

		sensorEClass = createEClass(SENSOR);

		actuatorEClass = createEClass(ACTUATOR);

		controllerEClass = createEClass(CONTROLLER);
		createEReference(controllerEClass, CONTROLLER__TASK);

		alarmEClass = createEClass(ALARM);

		motionDetectorEClass = createEClass(MOTION_DETECTOR);

		smokeDetectorEClass = createEClass(SMOKE_DETECTOR);

		serverEClass = createEClass(SERVER);

		mainframeEClass = createEClass(MAINFRAME);

		// Create enums
		severityEEnum = createEEnum(SEVERITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sensorEClass.getESuperTypes().add(this.getTask());
		actuatorEClass.getESuperTypes().add(this.getTask());
		controllerEClass.getESuperTypes().add(this.getTask());
		alarmEClass.getESuperTypes().add(this.getActuator());
		motionDetectorEClass.getESuperTypes().add(this.getSensor());
		smokeDetectorEClass.getESuperTypes().add(this.getSensor());
		serverEClass.getESuperTypes().add(this.getComputer());
		mainframeEClass.getESuperTypes().add(this.getComputer());

		// Initialize classes, features, and operations; add parameters
		initEClass(cyberPhysicalSystemEClass, CyberPhysicalSystem.class, "CyberPhysicalSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCyberPhysicalSystem_Tasks(), this.getTask(), null, "tasks", null, 0, -1, CyberPhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCyberPhysicalSystem_Computers(), this.getComputer(), null, "computers", null, 0, -1, CyberPhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCyberPhysicalSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, CyberPhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Severity(), this.getSeverity(), "severity", "low", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_ReqSlot(), ecorePackage.getEInt(), "reqSlot", "0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_AllocatedTo(), this.getComputer(), this.getComputer_Tasks(), "allocatedTo", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computerEClass, Computer.class, "Computer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputer_DefaultSlots(), ecorePackage.getEInt(), "defaultSlots", "0", 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_AvailableSlots(), ecorePackage.getEInt(), "availableSlots", "0", 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputer_Tasks(), this.getTask(), this.getTask_AllocatedTo(), "tasks", null, 0, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorEClass, Actuator.class, "Actuator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getController_Task(), this.getTask(), null, "task", null, 2, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alarmEClass, Alarm.class, "Alarm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(motionDetectorEClass, MotionDetector.class, "MotionDetector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smokeDetectorEClass, SmokeDetector.class, "SmokeDetector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mainframeEClass, Mainframe.class, "Mainframe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(severityEEnum, Severity.class, "Severity");
		addEEnumLiteral(severityEEnum, Severity.LOW);
		addEEnumLiteral(severityEEnum, Severity.MEDIUM);
		addEEnumLiteral(severityEEnum, Severity.HIGH);
		addEEnumLiteral(severityEEnum, Severity.CRITICAL);

		// Create resource
		createResource(eNS_URI);
	}

} //CpsPackageImpl
