/**
 */
package cps.tests;

import cps.CpsFactory;
import cps.Mainframe;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mainframe</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainframeTest extends ComputerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MainframeTest.class);
	}

	/**
	 * Constructs a new Mainframe test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainframeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mainframe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Mainframe getFixture() {
		return (Mainframe)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CpsFactory.eINSTANCE.createMainframe());
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

} //MainframeTest
