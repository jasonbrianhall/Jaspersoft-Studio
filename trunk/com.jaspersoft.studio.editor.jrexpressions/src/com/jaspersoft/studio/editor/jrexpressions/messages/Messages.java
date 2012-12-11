/*******************************************************************************
 * Copyright (C) 2010 - 2012 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, 
 * the following license terms apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Jaspersoft Studio Team - initial API and implementation
 ******************************************************************************/
package com.jaspersoft.studio.editor.jrexpressions.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.jaspersoft.studio.editor.jrexpressions.messages"; //$NON-NLS-1$
	public static String JavaJRExpressionJavaValidator_FieldNotFoundInContextError;
	public static String JavaJRExpressionJavaValidator_FunctionLibraryAsConstructorError;
	public static String JavaJRExpressionJavaValidator_FunctionNotFoundError;
	public static String JavaJRExpressionJavaValidator_ParameterNotFoundInContextError;
	public static String JavaJRExpressionJavaValidator_VariableNotFoundInContextError;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
