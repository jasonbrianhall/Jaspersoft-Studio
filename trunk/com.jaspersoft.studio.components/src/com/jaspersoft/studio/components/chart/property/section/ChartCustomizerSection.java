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
package com.jaspersoft.studio.components.chart.property.section;

import java.beans.PropertyChangeEvent;

import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.components.chart.messages.Messages;
import com.jaspersoft.studio.components.chart.model.MChart;
import com.jaspersoft.studio.components.chart.model.chartAxis.MChartAxes;
import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.properties.view.TabbedPropertySheetPage;
import com.jaspersoft.studio.property.section.AbstractSection;

import net.sf.jasperreports.charts.design.JRDesignChartAxis;

/*
 * The location section on the location tab.
 * 
 * @author Chicu Veaceslav
 */
public class ChartCustomizerSection extends AbstractSection {

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ITabbedPropertySection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);
		createWidget4Property(parent, MChart.CHART_PROPERTY_CUSTOMIZER, false);
	}

	@Override
	protected void initializeProvidedProperties() {
		super.initializeProvidedProperties();
		addProvidedProperties(MChart.CHART_PROPERTY_CUSTOMIZER, Messages.MChart_customizer_class);

	}

	@Override
	protected APropertyNode getModelFromEditPart(Object item) {
		APropertyNode md = super.getModelFromEditPart(item);
		if (md instanceof MChartAxes)
			return (APropertyNode) md.getPropertyValue(JRDesignChartAxis.PROPERTY_CHART);
		return md;
	}
	
	/**
	 * Since this section does't handle a real property this will refresh the section
	 * when something in the property map changes, because the properties affected by
	 * this section are stored in the properties map
	 */
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (!isDisposed()) {
			String n = evt.getPropertyName();
			setRefreshing(true);
			APropertyNode element = getElement();
			if (element != null) {
				element.getPropertyDescriptors();
				for (Object key : widgets.keySet()) {
					if (n.equals(APropertyNode.PROPERTY_MAP))
						widgets.get(key).setData(element, element.getPropertyValue(key));
				}
			}
			getTabbedPropertySheetPage().showErrors();
			setRefreshing(false);
		}
	}
}
