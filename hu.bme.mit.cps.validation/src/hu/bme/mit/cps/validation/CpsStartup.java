package hu.bme.mit.cps.validation;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;

import cps.CpsPackage;

public class CpsStartup implements IStartup {

	@Override
	public void earlyStartup() {
		EValidator.Registry.INSTANCE.put(
				CpsPackage.eINSTANCE,
				new ECpsValidator());
	}

}
