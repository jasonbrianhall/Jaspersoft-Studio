/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.components.chart.property.section.plot;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.components.chart.messages.Messages;
import com.jaspersoft.studio.properties.view.TabbedPropertySheetPage;
import com.jaspersoft.studio.property.section.AbstractRealValueSection;

import net.sf.jasperreports.charts.design.JRDesignBubblePlot;

public class BubblePlot extends AbstractRealValueSection {

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);
		createWidget4Property(parent,JRDesignBubblePlot.PROPERTY_SCALE_TYPE);
		createCategory(parent, tabbedPropertySheetPage);
		createValue(parent, tabbedPropertySheetPage);
	}

	private void createCategory(Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {
		parent = getWidgetFactory().createSectionTitle(parent,
				Messages.AreaPlot_categoryAxis, true, 2, 2);

		createWidget4Property(parent,
				JRDesignBubblePlot.PROPERTY_X_AXIS_LINE_COLOR);

		Composite group = getWidgetFactory().createSection(parent,
				Messages.common_label, false, 2, 2);

		createWidget4Property(group,
				JRDesignBubblePlot.PROPERTY_X_AXIS_LABEL_EXPRESSION);

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		createWidget4Property(group,
				JRDesignBubblePlot.PROPERTY_X_AXIS_LABEL_FONT, false)
				.getControl().setLayoutData(gd);

		createWidget4Property(group,
				JRDesignBubblePlot.PROPERTY_X_AXIS_LABEL_COLOR);

		group = getWidgetFactory().createSection(parent, Messages.common_tick, false,
				2, 2);

		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		createWidget4Property(group,
				JRDesignBubblePlot.PROPERTY_X_AXIS_TICK_LABEL_FONT, false)
				.getControl().setLayoutData(gd);

		createWidget4Property(group,
				JRDesignBubblePlot.PROPERTY_X_AXIS_TICK_LABEL_COLOR);

		createWidget4Property(group,
				JRDesignBubblePlot.PROPERTY_X_AXIS_TICK_LABEL_MASK);

		createWidget4Property(group,
				JRDesignBubblePlot.PROPERTY_X_AXIS_VERTICAL_TICK_LABELS);

		createWidget4Property(parent,
				JRDesignBubblePlot.PROPERTY_DOMAIN_AXIS_MINVALUE_EXPRESSION);

		createWidget4Property(parent,
				JRDesignBubblePlot.PROPERTY_DOMAIN_AXIS_MAXVALUE_EXPRESSION);
	}

	private void createValue(Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {
		parent = getWidgetFactory().createSectionTitle(parent,
				Messages.AreaPlot_valueAxis, true, 2, 2);

		createWidget4Property(parent,
				JRDesignBubblePlot.PROPERTY_Y_AXIS_LINE_COLOR);

		Composite group = getWidgetFactory().createSection(parent,
				Messages.common_label, false, 2, 2);

		createWidget4Property(group,
				JRDesignBubblePlot.PROPERTY_Y_AXIS_LABEL_EXPRESSION);

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		createWidget4Property(group,
				JRDesignBubblePlot.PROPERTY_Y_AXIS_LABEL_FONT, false)
				.getControl().setLayoutData(gd);

		createWidget4Property(group,
				JRDesignBubblePlot.PROPERTY_Y_AXIS_LABEL_COLOR);

		group = getWidgetFactory().createSection(parent, Messages.common_tick, false,
				2, 2);

		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		createWidget4Property(group,
				JRDesignBubblePlot.PROPERTY_Y_AXIS_TICK_LABEL_FONT, false)
				.getControl().setLayoutData(gd);

		createWidget4Property(group,
				JRDesignBubblePlot.PROPERTY_Y_AXIS_TICK_LABEL_COLOR);

		createWidget4Property(group,
				JRDesignBubblePlot.PROPERTY_Y_AXIS_TICK_LABEL_MASK);

		createWidget4Property(group,
				JRDesignBubblePlot.PROPERTY_Y_AXIS_VERTICAL_TICK_LABELS);

		createWidget4Property(parent,
				JRDesignBubblePlot.PROPERTY_RANGE_AXIS_MINVALUE_EXPRESSION);

		createWidget4Property(parent,
				JRDesignBubblePlot.PROPERTY_RANGE_AXIS_MAXVALUE_EXPRESSION);
	}

}
