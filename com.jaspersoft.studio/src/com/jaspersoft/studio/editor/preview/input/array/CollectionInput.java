/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.editor.preview.input.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.jaspersoft.studio.editor.preview.input.ADataInput;
import com.jaspersoft.studio.editor.preview.input.IParameter;

public class CollectionInput extends ADataInput {
	private Button bbuton;
	private Label label;

	public boolean isForType(Class<?> valueClass) {
		return Collection.class.isAssignableFrom(valueClass) || valueClass.isArray();
	}

	@Override
	public void createInput(Composite parent, final IParameter param, Map<String, Object> params) {
		super.createInput(parent, param, params);
		if (isForType(param.getValueClass())) {
			Composite cmp = new Composite(parent, SWT.NONE);
			GridLayout layout = new GridLayout(2, false);
			layout.marginWidth = 0;
			layout.marginHeight = 0;
			cmp.setLayout(layout);
			cmp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			label = new Label(cmp, SWT.BORDER | SWT.CENTER | SWT.WRAP);
			label.setToolTipText(param.getDescription());
			label.setLayoutData(new GridData(GridData.FILL_BOTH));

			bbuton = new Button(cmp, SWT.PUSH);
			bbuton.setText("...");
			bbuton.setToolTipText(param.getDescription());
			bbuton.addFocusListener(focusListener);
			bbuton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					Map<String, Object> p = CollectionInput.this.params;
					Object value = p.get(param.getName());
					if (value == null) {
						try {
							value = param.getValueClass().newInstance();
						} catch (InstantiationException ex) {
							if (param.getValueClass().isArray() || param.getValueClass().isAssignableFrom(List.class))
								value = new ArrayList<Object>();
							else if (param.getValueClass().isAssignableFrom(Set.class))
								value = new HashSet<Object>();
						} catch (IllegalAccessException ex) {
						}
					} else if (value.getClass().isArray()) {
						value = Arrays.asList((Object[]) value);
					}
					TableDialog d = new TableDialog(bbuton.getShell(), value, param);
					if (d.open() == Dialog.OK) {
						Object val = d.getValue();
						if (param.getValueClass().isArray()) {
							List<?> list = (List<?>) val;
							val = list.toArray((Object[]) Array.newInstance(param.getValueClass().getComponentType(), list.size()));
						}
						updateModel(val);
						updateInput();
					}
				}
			});
			updateInput();
		}
	}

	public void updateInput() {
		Object value = params.get(param.getName());
		if (value != null && value instanceof Collection)
			label.setText(((Collection<?>) value).size() + " elements");
		else if (value != null && value.getClass().isArray())
			label.setText(((Object[]) value).length + " elements");
		else
			label.setText("No elements");
	}

}
