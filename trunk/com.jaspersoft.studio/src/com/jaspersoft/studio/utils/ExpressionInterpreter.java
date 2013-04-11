/*******************************************************************************
 * Copyright (C) 2010 - 2013 Jaspersoft Corporation. All rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jaspersoft Studio Team - initial API and implementation
 ******************************************************************************/
package com.jaspersoft.studio.utils;

import net.sf.jasperreports.engine.JRReport;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JasperDesign;

import com.jaspersoft.studio.utils.expr.GroovyInterpretter;
import com.jaspersoft.studio.utils.expr.AInterpreter;
import com.jaspersoft.studio.utils.expr.JavaInterpreter;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

/*
 * 
 * @author gtoffoli
 */
public class ExpressionInterpreter {
	private AInterpreter interpreter;

	public ExpressionInterpreter(JRDesignDataset dataset, JasperReportsConfiguration jConfig) {
		this(dataset, null, jConfig);
	}

	public ExpressionInterpreter(JRDesignDataset dataset, JasperDesign jasperDesign, JasperReportsConfiguration jConfig) {
		try {

			if (jasperDesign.getLanguage().equalsIgnoreCase(JRReport.LANGUAGE_JAVA))
				interpreter = new JavaInterpreter();
			else if (jasperDesign.getLanguage().equalsIgnoreCase(JRReport.LANGUAGE_GROOVY))
				interpreter = new GroovyInterpretter();
			else if (jasperDesign.getLanguage().equalsIgnoreCase("bsh"))
				interpreter = new JavaInterpreter();
			interpreter.prepareExpressionEvaluator(dataset, jasperDesign, jConfig);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Try to interpret the java expression passed as argument. If dataset is provided, the parameters are recursively
	 * interpreted. If a classloader is specified, it is used to load classes referred in the expression.
	 */
	public Object interpretExpression(String expression) {
		if (interpreter == null)
			return null;
		return interpreter.interpretExpression(expression);
	}

}
