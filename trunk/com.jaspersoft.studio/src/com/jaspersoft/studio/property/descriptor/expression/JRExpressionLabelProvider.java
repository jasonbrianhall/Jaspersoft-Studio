/*
 * JasperReports - Free Java Reporting Library. Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of JasperReports.
 * 
 * JasperReports is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * JasperReports is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with JasperReports. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.property.descriptor.expression;

import net.sf.jasperreports.engine.JRExpression;

import org.eclipse.jface.viewers.LabelProvider;

/*
 * @author Chicu Veaceslav
 */
public class JRExpressionLabelProvider extends LabelProvider {

	public JRExpressionLabelProvider() {
		super();
	}

	@Override
	public String getText(Object element) {
		if (element != null && element instanceof String)
			return (String) element;
		if (element != null && element instanceof JRExpression)
			return ((JRExpression) element).getText();
		return ""; //$NON-NLS-1$
	}

}
