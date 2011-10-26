package com.jaspersoft.studio.server.wizard.validator;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class URLValidator extends EmptyStringValidator {
	@Override
	public IStatus validate(Object value) {
		IStatus st = super.validate(value);
		if (st.isOK()) {
			try {
				new URL((String) value);
			} catch (MalformedURLException e) {
				return ValidationStatus.error("URL is not good", e);
			}
			return Status.OK_STATUS;
		}
		return st;
	}
}
