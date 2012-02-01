/*
 * JasperReports - Free Java Reporting Library. Copyright (C) 2001 - 2011 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.studio.property.section.widgets;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRDataset;
import net.sf.jasperreports.engine.JRGroup;
import net.sf.jasperreports.engine.type.IncrementTypeEnum;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.property.section.AbstractSection;
import com.jaspersoft.studio.utils.EnumHelper;

public class SPIncrementType {
	private CCombo evalTime;

	public SPIncrementType(Composite parent, AbstractSection section, String propEvalTime, String propEvalGroup,
			String tooltip) {
		createComponent(parent, section, propEvalTime, propEvalGroup, tooltip);
	}

	public void createComponent(Composite parent, final AbstractSection section, final String propEvalTime,
			final String propEvalGroup, String tooltip) {
		evalTime = new CCombo(parent, SWT.BORDER | SWT.FLAT | SWT.READ_ONLY);
		evalTime.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				String group = null;
				Integer et = new Integer(1);

				String str = evalTime.getItem(evalTime.getSelectionIndex());
				if (str.startsWith(GROUPPREFIX)) {
					group = str.substring(GROUPPREFIX.length());
					et = EnumHelper.getValue(IncrementTypeEnum.GROUP, 1, false);
				} else {
					et = EnumHelper.getValue(IncrementTypeEnum.getByName(str), 1, false);
				}

				section.changeProperty(propEvalTime, et);
				section.changeProperty(propEvalGroup, group);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		evalTime.setToolTipText(tooltip);
	}

	public void setData(Integer et, String group, String[] items) {
		evalTime.setItems(items);
		int selection = 0;
		IncrementTypeEnum sel = (IncrementTypeEnum) EnumHelper.getSetValue(IncrementTypeEnum.values(), et, 1, false);

		for (int i = 0; i < items.length; i++) {
			if (items[i].equals(sel.getName())) {
				selection = i;
				break;
			}
			if (items[i].startsWith(GROUPPREFIX) && sel.equals(IncrementTypeEnum.GROUP)) {
				if (items[i].substring(GROUPPREFIX.length()).equals(group)) {
					selection = i;
					break;
				}
			}
		}
		evalTime.select(selection);
	}

	public static String[] getItems(JRDataset dataset) {
		List<String> lsIncs = new ArrayList<String>();
		for (IncrementTypeEnum en : IncrementTypeEnum.values()) {
			if (en.equals(IncrementTypeEnum.GROUP)) {
				for (JRGroup gr : dataset.getGroups())
					lsIncs.add(GROUPPREFIX + gr.getName());
			} else {
				lsIncs.add(en.getName());
			}
		}
		return lsIncs.toArray(new String[lsIncs.size()]);
	}

	private static final String GROUPPREFIX = "[Group] ";
}
