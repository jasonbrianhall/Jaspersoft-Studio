package com.jaspersoft.studio.server.wizard.validator;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class EmptyStringValidator implements IValidator {

	public IStatus validate(Object value) {
		if (value == null || ((String) value).isEmpty())
			return ValidationStatus.error("Value should not be empty");
		return Status.OK_STATUS;
	}

}
