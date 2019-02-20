/**
 */
package cps.tests;

import cps.CpsFactory;
import cps.CyberPhysicalSystem;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cyber Physical System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CyberPhysicalSystemTest extends TestCase {

	/**
	 * The fixture for this Cyber Physical System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CyberPhysicalSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CyberPhysicalSystemTest.class);
	}

	/**
	 * Constructs a new Cyber Physical System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cyber Physical System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CyberPhysicalSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cyber Physical System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CyberPhysicalSystem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CpsFactory.eINSTANCE.createCyberPhysicalSystem());
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

} //CyberPhysicalSystemTest
