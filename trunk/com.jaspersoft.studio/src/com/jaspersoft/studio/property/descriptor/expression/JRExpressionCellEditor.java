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

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.jaspersoft.studio.property.descriptor.ATextDialogRWCellEditor;
import com.jaspersoft.studio.property.descriptor.expression.dialog.JRExpressionEditor;

public class JRExpressionCellEditor extends ATextDialogRWCellEditor {

	public JRExpressionCellEditor(Composite parent) {
		super(parent);
	}

	public JRExpressionCellEditor(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		JRExpressionEditor wizard = new JRExpressionEditor();
		wizard.setValue((String) getValue());
		WizardDialog dialog = new WizardDialog(cellEditorWindow.getShell(), wizard);
		dialog.create();
		if (dialog.open() == Dialog.OK) {
			return wizard.getValue();
		}
		return null;
	}

	@Override
	protected Object doGetValue() {
		Object val = super.doGetValue();
		if (isDirty()) {
			return text.getText();
		}
		return val;
	}

	@Override
	protected void doSetValue(Object value) {
		super.doSetValue(value);
		if (value instanceof String) {
			text.setText(value == null ? "" : (String) value);
			text.addModifyListener(getModifyListener());
		}
	}

}
