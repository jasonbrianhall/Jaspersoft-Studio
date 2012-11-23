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
package com.jaspersoft.studio.property.section.widgets;

import org.eclipse.jface.fieldassist.AutoCompleteField;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.property.section.AbstractSection;
import com.jaspersoft.studio.utils.UIUtils;
import com.jaspersoft.studio.utils.inputhistory.InputHistoryCache;

public class SPText extends AHistorySPropertyWidget {
	protected Text ftext;

	public SPText(Composite parent, AbstractSection section, IPropertyDescriptor pDescriptor) {
		super(parent, section, pDescriptor);
	}

	@Override
	public Control getControl() {
		return ftext;
	}

	@Override
	protected Text getTextControl() {
		return ftext;
	}

	protected void createComponent(Composite parent) {
		ftext = section.getWidgetFactory().createText(parent, "", SWT.NONE);
		autocomplete = new AutoCompleteField(ftext, new TextContentAdapter(), InputHistoryCache.get(getHistoryKey()));
		ftext.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				handleTextChanged(section, pDescriptor.getId(), ftext.getText());
			}
		});
		ftext.setToolTipText(pDescriptor.getDescription());
		setWidth(parent, 15);
	}

	protected void setWidth(Composite parent, int chars) {
		int w = UIUtils.getCharWidth(ftext) * chars;
		if (parent.getLayout() instanceof RowLayout) {
			RowData rd = new RowData();
			rd.width = w;
			ftext.setLayoutData(rd);
		} else if (parent.getLayout() instanceof GridLayout) {
			GridData rd = new GridData(GridData.FILL_HORIZONTAL);
			rd.minimumWidth = w;
			rd.widthHint = w;
			ftext.setLayoutData(rd);
		}
	}

	protected void handleTextChanged(final AbstractSection section, final Object property, String text) {
		section.changeProperty(property, text);
	}

	public void setData(APropertyNode pnode, Object b) {
		if (b != null) {
			int oldpos = ftext.getCaretPosition();
			ftext.setText(b.toString());
			if (b.toString().length() >= oldpos)
				ftext.setSelection(oldpos, oldpos);
		} else
			ftext.setText("");
	}

}
