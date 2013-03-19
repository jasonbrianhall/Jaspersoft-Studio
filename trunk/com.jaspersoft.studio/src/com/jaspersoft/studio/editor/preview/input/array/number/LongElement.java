package com.jaspersoft.studio.editor.preview.input.array.number;

public class LongElement extends ANumberElement {

	@Override
	public Class<?> getSupportedType() {
		return Long.class;
	}

	protected boolean isValid(String number) {
		Long.parseLong(number);
		return true;
	}

	@Override
	protected Object convertString(String str) {
		return new Long(str);
	}
}
