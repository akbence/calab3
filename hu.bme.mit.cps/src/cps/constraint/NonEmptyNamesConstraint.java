package cps.constraint;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

import cps.CyberPhysicalSystem;

public class NonEmptyNamesConstraint extends AbstractModelConstraint {

	/* Checks that the name of the ManagedElement is not null
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {
			String name = null;
			if (eObj instanceof CyberPhysicalSystem) {
				name = ((CyberPhysicalSystem)eObj).getName();
			} 
			
			if (name == null || name.length() == 0) {
				return ctx.createFailureStatus(eObj.eClass().getName());
			}
		} 
		return ctx.createSuccessStatus();
	}
}
