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

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.property.section.AbstractSection;

public class SPEdgeEnum {
	private ToolItem btnAlignLeft;
	private ToolItem btnAlignTop;
	private ToolItem btnAlignBottom;
	private ToolItem btnAlignRight;

	public SPEdgeEnum(Composite parent, AbstractSection section, String property) {
		createComponent(parent, section, property);
	}

	public void createComponent(Composite parent, final AbstractSection section, final String property) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setBackground(parent.getBackground());
		composite.setLayout(new RowLayout());

		CLabel lbl = section.getWidgetFactory().createCLabel(composite, Messages.LocationSection_position, SWT.RIGHT);
		RowData rd = new RowData();
		rd.width = 100;
		lbl.setLayoutData(rd);

		ToolBar toolBar = new ToolBar(composite, SWT.FLAT | SWT.WRAP | SWT.LEFT);
		toolBar.setBackground(composite.getBackground());

		btnAlignLeft = new ToolItem(toolBar, SWT.CHECK);
		btnAlignLeft.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				section.changeProperty(property, new Integer(btnAlignLeft.getSelection() ? 3 : 0));
			}
		});
		btnAlignLeft.setImage(JaspersoftStudioPlugin.getImage("icons/resources/eclipse/align-edge-left.gif"));//$NON-NLS-1$
		btnAlignLeft.setToolTipText(Messages.TextSection_align_left_tool_tip);

		btnAlignTop = new ToolItem(toolBar, SWT.CHECK);
		btnAlignTop.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				section.changeProperty(property, new Integer(btnAlignTop.getSelection() ? 1 : 0));
			}
		});
		btnAlignTop.setImage(JaspersoftStudioPlugin.getImage("icons/resources/eclipse/align-edge-top.gif")); //$NON-NLS-1$
		btnAlignTop.setToolTipText(Messages.TextSection_align_top_tool_tip);

		btnAlignBottom = new ToolItem(toolBar, SWT.CHECK);
		btnAlignBottom.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				section.changeProperty(property, new Integer(btnAlignBottom.getSelection() ? 2 : 0));
			}
		});
		btnAlignBottom.setImage(JaspersoftStudioPlugin.getImage("icons/resources/eclipse/align-edge-bottom.gif")); //$NON-NLS-1$
		btnAlignBottom.setToolTipText(Messages.TextSection_align_bottom_tool_tip);

		btnAlignRight = new ToolItem(toolBar, SWT.CHECK);
		btnAlignRight.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				section.changeProperty(property, new Integer(btnAlignRight.getSelection() ? 4 : 0));
			}
		});
		btnAlignRight.setImage(JaspersoftStudioPlugin.getImage("icons/resources/eclipse/align-edge-right.gif")); //$NON-NLS-1$
		btnAlignRight.setToolTipText(Messages.TextSection_align_right_tool_tip);
	}

	public void setData(Integer b) {
		btnAlignLeft.setSelection(b != null && b.intValue() == 3);
		btnAlignTop.setSelection(b != null && b.intValue() == 1);
		btnAlignBottom.setSelection(b != null && b.intValue() == 2);
		btnAlignRight.setSelection(b != null && b.intValue() == 4);
	}
}
