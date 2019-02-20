/**
 */
package cps.tests;

import cps.CpsFactory;
import cps.MotionDetector;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Motion Detector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MotionDetectorTest extends SensorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MotionDetectorTest.class);
	}

	/**
	 * Constructs a new Motion Detector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionDetectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Motion Detector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MotionDetector getFixture() {
		return (MotionDetector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CpsFactory.eINSTANCE.createMotionDetector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MotionDetectorTest
