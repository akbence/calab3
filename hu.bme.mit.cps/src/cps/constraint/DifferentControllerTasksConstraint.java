package cps.constraint;

import java.util.HashSet;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

import cps.Controller;
import cps.Task;

public class DifferentControllerTasksConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {
			HashSet<Task> reachedTasks = new HashSet<Task>();
			if (eObj instanceof Controller) {
				for (Task task : ((Controller) eObj).getTask()) {
					reachedTasks.add(task);
				}
				if (reachedTasks.size() != ((Controller) eObj).getTask().size()) {
					return ctx.createFailureStatus(eObj.eClass().getName());
				}
			} 
			
		} 
		return ctx.createSuccessStatus();
	}

}
