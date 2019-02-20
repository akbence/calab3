package cps.constraint;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

import cps.Alarm;
import cps.Controller;
import cps.MotionDetector;
import cps.Severity;
import cps.SmokeDetector;
import cps.Task;

public class CorrectSeverityLevelConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {
			if (eObj instanceof Task) {
				if (eObj instanceof MotionDetector) {
					if (((Task) eObj).getSeverity() != Severity.LOW) {
						return ctx.createFailureStatus(eObj.eClass().getName());
					} 
				} else if (eObj instanceof Alarm) {
					if (((Task) eObj).getSeverity() != Severity.MEDIUM) {
						return ctx.createFailureStatus(eObj.eClass().getName());
					} 
				} else if (eObj instanceof SmokeDetector) {
					if (((Task) eObj).getSeverity() != Severity.HIGH) {
						return ctx.createFailureStatus(eObj.eClass().getName());
					} 
				} else if (eObj instanceof Controller) {
					if (((Task) eObj).getSeverity() != Severity.CRITICAL) {
						return ctx.createFailureStatus(eObj.eClass().getName());
					} 
				}
			} 
		
		} 
		return ctx.createSuccessStatus();
	}

}
