/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved. http://www.jaspersoft.com.
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.properties.view.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.graphics.Color;
import org.eclipse.wb.swt.SWTResourceManager;

public class ValidationError extends Exception {
	public static Color ERROR = SWTResourceManager.getColor(255, 228, 225);
	public static Color WARN = SWTResourceManager.getColor(255, 228, 181);

	private static final long serialVersionUID = 1L;
	private List<String> props;
	private boolean warning = true;

	public ValidationError(String msg) {
		super(msg);
	}

	public ValidationError(String prop, String msg) {
		super(msg);
		this.props = new ArrayList<String>();
		props.add(prop);
	}

	public ValidationError(List<String> props, String msg) {
		super(msg);
		this.props = props;
	}

	public ValidationError(String prop, String msg, boolean warning) {
		super(msg);
		this.props = new ArrayList<String>();
		props.add(prop);
		this.warning = warning;
	}

	public ValidationError(List<String> props, String msg, boolean warning) {
		super(msg);
		this.props = props;
		this.warning = warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}

	public boolean isWarning() {
		return warning;
	}

	public List<String> getProps() {
		return props;
	}

}
