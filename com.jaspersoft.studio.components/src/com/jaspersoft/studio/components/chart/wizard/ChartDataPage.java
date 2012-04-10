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
package com.jaspersoft.studio.components.chart.wizard;

import net.sf.jasperreports.engine.design.JRDesignChart;
import net.sf.jasperreports.engine.design.JRDesignElement;
import net.sf.jasperreports.engine.design.JRDesignElementDataset;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.components.chart.wizard.fragments.data.widget.DatasetSeriesWidget;
import com.jaspersoft.studio.components.chart.wizard.fragments.data.widget.ElementDatasetWidget;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;
import com.jaspersoft.studio.wizards.JSSWizardPage;

public class ChartDataPage extends JSSWizardPage {
	private JRDesignElement jrChart;
	private ElementDatasetWidget ewDataset;
	private JRDesignElementDataset edataset;
	private DatasetSeriesWidget eDatasetSeries;
	private JasperReportsConfiguration jrContext;

	protected ChartDataPage(JRDesignElement jrChart,
			JRDesignElementDataset edataset,
			JasperReportsConfiguration jrContext) {
		super("chartdataconfiguration");
		setTitle("Chart Data Configuration");
		setDescription("Configure how data are used by your chart");
		this.jrChart = jrChart;
		this.edataset = edataset;
		this.jrContext = jrContext;
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout());
		setControl(composite);

		eDatasetSeries = new DatasetSeriesWidget(composite, jrContext);

		ewDataset = new ElementDatasetWidget(composite);
	}

	public void updateData() {
		eDatasetSeries.setDataset(jrContext.getJasperDesign(), jrChart,
				edataset);
		ewDataset.setDataset(edataset, jrContext.getJasperDesign());
	}

	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			edataset = (JRDesignElementDataset) ((JRDesignChart) jrChart)
					.getDataset();
			updateData();
		}
		super.setVisible(visible);
	}

}
