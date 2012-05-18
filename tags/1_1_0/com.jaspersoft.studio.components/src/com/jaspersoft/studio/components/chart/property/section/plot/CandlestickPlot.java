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
package com.jaspersoft.studio.components.chart.property.section.plot;

import net.sf.jasperreports.charts.design.JRDesignCandlestickPlot;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.properties.view.TabbedPropertySheetPage;
import com.jaspersoft.studio.property.section.AbstractSection;

public class CandlestickPlot extends APlot {

	@Override
	public void createControls(AbstractSection section, Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {
		section.createWidget4Property(parent,
				JRDesignCandlestickPlot.PROPERTY_SHOW_VOLUME);

		createCategory(section, parent, tabbedPropertySheetPage);

		createValue(section, parent, tabbedPropertySheetPage);
	}

	private void createCategory(AbstractSection section, Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {
		parent = section.getWidgetFactory().createSectionTitle(parent,
				"Category Axis", true, 2, 2);

		section.createWidget4Property(parent,
				JRDesignCandlestickPlot.PROPERTY_TIME_AXIS_LINE_COLOR);

		Composite group = section.getWidgetFactory().createSection(parent,
				"Label", false, 2, 2);

		section.createWidget4Property(group,
				JRDesignCandlestickPlot.PROPERTY_TIME_AXIS_LABEL_EXPRESSION);

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		section.createWidget4Property(group,
				JRDesignCandlestickPlot.PROPERTY_TIME_AXIS_LABEL_FONT, false)
				.getControl().setLayoutData(gd);

		section.createWidget4Property(group,
				JRDesignCandlestickPlot.PROPERTY_TIME_AXIS_LABEL_COLOR);

		group = section.getWidgetFactory().createSection(parent, "Tick", false,
				2, 2);

		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		section.createWidget4Property(group,
				JRDesignCandlestickPlot.PROPERTY_TIME_AXIS_TICK_LABEL_FONT,
				false).getControl().setLayoutData(gd);

		section.createWidget4Property(group,
				JRDesignCandlestickPlot.PROPERTY_TIME_AXIS_TICK_LABEL_COLOR);

		section.createWidget4Property(group,
				JRDesignCandlestickPlot.PROPERTY_TIME_AXIS_TICK_LABEL_MASK);

		section.createWidget4Property(group,
				JRDesignCandlestickPlot.PROPERTY_TIME_AXIS_VERTICAL_TICK_LABELS);

		section.createWidget4Property(
				parent,
				JRDesignCandlestickPlot.PROPERTY_DOMAIN_AXIS_MINVALUE_EXPRESSION);

		section.createWidget4Property(
				parent,
				JRDesignCandlestickPlot.PROPERTY_DOMAIN_AXIS_MAXVALUE_EXPRESSION);
	}

	private void createValue(AbstractSection section, Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {
		parent = section.getWidgetFactory().createSectionTitle(parent,
				"Value Axis", true, 2, 2);

		section.createWidget4Property(parent,
				JRDesignCandlestickPlot.PROPERTY_VALUE_AXIS_LINE_COLOR);

		Composite group = section.getWidgetFactory().createSection(parent,
				"Label", false, 2, 2);

		section.createWidget4Property(group,
				JRDesignCandlestickPlot.PROPERTY_VALUE_AXIS_LABEL_EXPRESSION);

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		section.createWidget4Property(group,
				JRDesignCandlestickPlot.PROPERTY_VALUE_AXIS_LABEL_FONT, false)
				.getControl().setLayoutData(gd);

		section.createWidget4Property(group,
				JRDesignCandlestickPlot.PROPERTY_VALUE_AXIS_LABEL_COLOR);

		group = section.getWidgetFactory().createSection(parent, "Tick", false,
				2, 2);

		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		section.createWidget4Property(group,
				JRDesignCandlestickPlot.PROPERTY_VALUE_AXIS_TICK_LABEL_FONT,
				false).getControl().setLayoutData(gd);

		section.createWidget4Property(group,
				JRDesignCandlestickPlot.PROPERTY_VALUE_AXIS_TICK_LABEL_COLOR);

		section.createWidget4Property(group,
				JRDesignCandlestickPlot.PROPERTY_VALUE_AXIS_TICK_LABEL_MASK);

		section.createWidget4Property(
				group,
				JRDesignCandlestickPlot.PROPERTY_VALUE_AXIS_VERTICAL_TICK_LABELS);

		section.createWidget4Property(parent,
				JRDesignCandlestickPlot.PROPERTY_RANGE_AXIS_MINVALUE_EXPRESSION);

		section.createWidget4Property(parent,
				JRDesignCandlestickPlot.PROPERTY_RANGE_AXIS_MAXVALUE_EXPRESSION);
	}

}
