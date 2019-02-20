/**
 */
package cps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cps.CpsPackage
 * @generated
 */
public interface CpsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CpsFactory eINSTANCE = cps.impl.CpsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cyber Physical System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cyber Physical System</em>'.
	 * @generated
	 */
	CyberPhysicalSystem createCyberPhysicalSystem();

	/**
	 * Returns a new object of class '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller</em>'.
	 * @generated
	 */
	Controller createController();

	/**
	 * Returns a new object of class '<em>Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alarm</em>'.
	 * @generated
	 */
	Alarm createAlarm();

	/**
	 * Returns a new object of class '<em>Motion Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motion Detector</em>'.
	 * @generated
	 */
	MotionDetector createMotionDetector();

	/**
	 * Returns a new object of class '<em>Smoke Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smoke Detector</em>'.
	 * @generated
	 */
	SmokeDetector createSmokeDetector();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>Mainframe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mainframe</em>'.
	 * @generated
	 */
	Mainframe createMainframe();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CpsPackage getCpsPackage();

} //CpsFactory
