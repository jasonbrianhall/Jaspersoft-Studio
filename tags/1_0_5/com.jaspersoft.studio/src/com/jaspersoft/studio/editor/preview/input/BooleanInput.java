/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of Jaspersoft Open Studio.
 * 
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Jaspersoft Open Studio is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with Jaspersoft Open Studio. If not,
 * see <http://www.gnu.org/licenses/>.
 */
/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of Jaspersoft Open Studio.
 * 
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Jaspersoft Open Studio is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with Jaspersoft Open Studio. If not,
 * see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.editor.preview.input;

import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class BooleanInput extends ADataInput {
	private Button bbuton;

	public boolean isForType(Class<?> valueClass) {
		return Boolean.class.isAssignableFrom(valueClass);
	}

	@Override
	public void createInput(Composite parent, IParameter param, Map<String, Object> params) {
		super.createInput(parent, param, params);
		if (isForType(param.getValueClass())) {
			new Label(parent, SWT.NONE);

			bbuton = new Button(parent, SWT.CHECK);
			bbuton.setText(param.getLabel());
			bbuton.setToolTipText(param.getDescription());
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalIndent = 8;
			bbuton.setLayoutData(gd);
			bbuton.setBackground(parent.getBackground());
			SelectionAdapter listener = new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					updateModel(new Boolean(bbuton.getSelection()));
				}
			};
			bbuton.addSelectionListener(listener);
			updateInput();
			listener.widgetSelected(null);
		}
	}

	public void updateInput() {
		Object value = params.get(param.getName());
		if (value != null && value instanceof Boolean)
			bbuton.setSelection((Boolean) value);
	}

	@Override
	public boolean isLabeled() {
		return true;
	}
}
