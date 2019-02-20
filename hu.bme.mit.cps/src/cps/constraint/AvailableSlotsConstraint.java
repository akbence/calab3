package cps.constraint;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

import cps.Computer;
import cps.Task;

public class AvailableSlotsConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {
			
			if (eObj instanceof Computer) {
				int calculatedAvailableSlots = ((Computer) eObj).getDefaultSlots();
				for (Task task : ((Computer) eObj).getTasks()) {
					calculatedAvailableSlots -= task.getReqSlot();
				}
				if (calculatedAvailableSlots != ((Computer) eObj).getAvailableSlots()) {
					return ctx.createFailureStatus(eObj.eClass().getName());
				}
			} 
			
		} 
		return ctx.createSuccessStatus();
	}

}
