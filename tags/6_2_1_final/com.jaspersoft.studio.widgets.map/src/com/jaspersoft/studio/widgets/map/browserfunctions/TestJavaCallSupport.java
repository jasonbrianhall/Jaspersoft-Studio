/*******************************************************************************
 * Copyright (c) 2014 Massimo Rabbi.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Massimo Rabbi <mrabbi@users.sourceforge.net> - initial API and implementation
 ******************************************************************************/
package com.jaspersoft.studio.widgets.map.browserfunctions;

import org.eclipse.swt.browser.Browser;

import com.jaspersoft.studio.widgets.map.support.JavaMapSupport;

/**
 * A simple function to test the Java and Javascript bidirectional communication.
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 *
 */
public class TestJavaCallSupport extends GMapEnabledFunction {

	public TestJavaCallSupport(Browser browser, String name, JavaMapSupport mapSupport) {
		super(browser, name, mapSupport);
	}
	
	@Override
	public Object function(Object[] arguments) {
		getMapSupport().getBrowserControl().evaluate("alert('Test message: Java<->Javascript communitcation supported'");//$NON-NLS-1$
		return null;
	}

}
