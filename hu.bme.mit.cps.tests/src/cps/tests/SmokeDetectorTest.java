/**
 */
package cps.tests;

import cps.CpsFactory;
import cps.SmokeDetector;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Smoke Detector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmokeDetectorTest extends SensorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SmokeDetectorTest.class);
	}

	/**
	 * Constructs a new Smoke Detector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmokeDetectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Smoke Detector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SmokeDetector getFixture() {
		return (SmokeDetector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CpsFactory.eINSTANCE.createSmokeDetector());
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

} //SmokeDetectorTest
