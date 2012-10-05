/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.property.descriptor.genericElement.dialog;

import org.eclipse.jface.wizard.Wizard;

import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.editor.expression.IExpressionContextSetter;
import com.jaspersoft.studio.messages.Messages;

public class ParameterEditor extends Wizard implements IExpressionContextSetter{
	private ParameterDTO value;
	private ParameterPage page0;
	private ExpressionContext expContext;

	public ParameterDTO getValue() {
		if (page0 != null)
			return page0.getValue();
		return value;
	}

	public void setValue(ParameterDTO value) {
		if (page0 != null)
			page0.setValue(value);
		this.value = value;
	}

	public ParameterEditor() {
		super();
		setWindowTitle(Messages.common_properties);
		setNeedsProgressMonitor(false);
	}

	@Override
	public void addPages() {
		page0 = new ParameterPage("Datasetparameters"); //$NON-NLS-1$
		page0.setValue(value);
		if(expContext!=null){
			page0.setExpressionContext(expContext);
		}
		addPage(page0);
	}

	@Override
	public boolean performFinish() {
		return true;
	}

	public void setExpressionContext(ExpressionContext expContext) {
		this.expContext=expContext;
		if(page0!=null){
			page0.setExpressionContext(this.expContext);
		}
	}

}
