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
package com.jaspersoft.studio.property.section.graphic;

import net.sf.jasperreports.engine.base.JRBasePen;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.model.MGraphicElementLinePen;
import com.jaspersoft.studio.model.style.MStyle;
import com.jaspersoft.studio.properties.view.TabbedPropertySheetPage;
import com.jaspersoft.studio.property.section.AbstractRealValueSection;

/*
 * The location section on the location tab.
 * 
 * @author Chicu Veaceslav
 */
public class LinePenSection extends AbstractRealValueSection {
	
	@Override
	protected APropertyNode getModelFromEditPart(Object item) {
		APropertyNode model = super.getModelFromEditPart(item);
		if (model != null && model instanceof MGraphicElementLinePen || model instanceof MStyle)
			model = (APropertyNode) model.getPropertyValue(MGraphicElementLinePen.LINE_PEN);
		return model;
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ITabbedPropertySection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		parent.setLayout(new GridLayout(2, false));

		Group panel = new Group(parent, SWT.NONE);
		panel.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		panel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		panel.setLayout(new GridLayout(2,false));
		panel.setText("Line");
		
		createWidget4Property(panel, JRBasePen.PROPERTY_LINE_COLOR);
		createWidget4Property(panel, JRBasePen.PROPERTY_LINE_STYLE);
		createWidget4Property(panel, JRBasePen.PROPERTY_LINE_WIDTH);
	}

}
