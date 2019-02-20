package cps.constraint;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

import cps.Computer;
import cps.Severity;
import cps.Task;

public class OnlyOneCriticalConstraint extends AbstractModelConstraint {

	/**
	 * Checks if a computer has more than one critical tasks
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {
			int count = 0;
			if (eObj instanceof Computer) {
				for (Task task : ((Computer) eObj).getTasks()) {
					if (task.getSeverity() == Severity.CRITICAL) {
						count++;
					}
				}
			} 
			
			if (count > 1) {
				return ctx.createFailureStatus(eObj.eClass().getName());
			}
		} 
		return ctx.createSuccessStatus();
	}

}
