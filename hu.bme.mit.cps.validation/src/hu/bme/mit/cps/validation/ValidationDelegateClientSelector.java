package hu.bme.mit.cps.validation;

import org.eclipse.emf.validation.model.IClientSelector;

public class ValidationDelegateClientSelector implements IClientSelector {

	private static boolean isRunning = false;
	
	//unprofessional as stated in the doc
	public boolean selects(Object object) {
		return isRunning;
	}
	
	/** Sets the isRunning boolean
	 * @param isR 
	 */
	public static void setisRunning(boolean isR){
		isRunning = isR;
	}

}
