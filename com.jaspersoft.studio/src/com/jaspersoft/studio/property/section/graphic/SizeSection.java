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

import net.sf.jasperreports.engine.design.JRDesignElement;

import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.properties.view.TabbedPropertySheetPage;
import com.jaspersoft.studio.property.section.AbstractRealValueSection;
import com.jaspersoft.studio.property.section.widgets.ASPropertyWidget;

/*
 * The location section on the location tab.
 * 
 * @author Chicu Veaceslav
 */
public class SizeSection extends AbstractRealValueSection {

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ITabbedPropertySection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		parent = getWidgetFactory().createSection(parent, "Size", true, 4);

		ASPropertyWidget hw = createWidget4Property(parent, JRDesignElement.PROPERTY_WIDTH);
		CLabel lbl = hw.getLabel();
		lbl.setText("w");
		lbl.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

		hw = createWidget4Property(parent, JRDesignElement.PROPERTY_HEIGHT);
		lbl = hw.getLabel();
		lbl.setText("h");
		lbl.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

		ASPropertyWidget w = createWidget4Property(parent, JRDesignElement.PROPERTY_STRETCH_TYPE);
		GridData gd = new GridData();
		gd.horizontalSpan = 3;
		w.getControl().setLayoutData(gd);
	}

}
