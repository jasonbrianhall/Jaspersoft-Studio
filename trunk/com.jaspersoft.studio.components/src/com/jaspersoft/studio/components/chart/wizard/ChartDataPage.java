/*******************************************************************************
 * Copyright (C) 2010 - 2013 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.studio.components.chart.wizard;

import net.sf.jasperreports.components.spiderchart.SpiderChartComponent;
import net.sf.jasperreports.components.spiderchart.StandardSpiderDataset;
import net.sf.jasperreports.engine.component.Component;
import net.sf.jasperreports.engine.design.JRDesignChart;
import net.sf.jasperreports.engine.design.JRDesignComponentElement;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignElement;
import net.sf.jasperreports.engine.design.JRDesignElementDataset;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.components.chart.wizard.fragments.data.widget.DatasetSeriesWidget;
import com.jaspersoft.studio.components.chart.wizard.fragments.data.widget.ElementDatasetWidget;
import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.editor.expression.IExpressionContextSetter;
import com.jaspersoft.studio.property.dataset.DatasetRunSelectionListener;
import com.jaspersoft.studio.utils.Misc;
import com.jaspersoft.studio.utils.ModelUtils;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;
import com.jaspersoft.studio.wizards.ContextHelpIDs;
import com.jaspersoft.studio.wizards.JSSWizardPage;

public class ChartDataPage extends JSSWizardPage implements IExpressionContextSetter{
	private JRDesignElement jrChart;
	private ElementDatasetWidget ewDataset;
	private JRDesignElementDataset edataset;
	private DatasetSeriesWidget eDatasetSeries;
	private JasperReportsConfiguration jrContext;
	private ExpressionContext expContext;

	protected ChartDataPage(JRDesignElement jrChart,
			JRDesignElementDataset edataset,
			JasperReportsConfiguration jrContext) {
		super("chartdataconfiguration");
		setTitle("Chart Data Configuration");
		setDescription("Configure how data are used by your chart");
		this.jrChart = jrChart;
		this.edataset = edataset;
		this.jrContext = jrContext;
		contextName = ContextHelpIDs.WIZARD_CHART_DATA;
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout());
		setControl(composite);

		eDatasetSeries = new DatasetSeriesWidget(composite, jrContext);
		eDatasetSeries.setExpressionContext(getExpressionContextFromDSRun());		
		ewDataset = new ElementDatasetWidget(composite);
		ewDataset.setExpressionContext(expContext);
		ewDataset.addDatasetRunSelectionListener(new DatasetRunSelectionListener() {
			public void selectionChanged() {
				eDatasetSeries.setExpressionContext(getExpressionContextFromDSRun());
			}
		});
	}

	public void updateData() {
		eDatasetSeries.setDataset(jrContext.getJasperDesign(), jrChart,
				edataset);
		ewDataset.setDataset(edataset, jrContext.getJasperDesign());
	}

	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			if(jrChart instanceof JRDesignChart){
				edataset = (JRDesignElementDataset) ((JRDesignChart) jrChart)
					.getDataset();
				updateData();
			}
			else if (jrChart instanceof JRDesignComponentElement){ 
				Component component = ((JRDesignComponentElement)jrChart).getComponent();
				if(component instanceof SpiderChartComponent){
					edataset=(StandardSpiderDataset) ((SpiderChartComponent)component).getDataset();
					updateData();
				}
			}
		}
		super.setVisible(visible);
	}

	public void setExpressionContext(ExpressionContext expContext) {
		this.expContext=expContext;
		if(ewDataset!=null){
			ewDataset.setExpressionContext(expContext);
		}
	}

	/*
	 * Gets the expression context from the current dataset run
	 * set for the design element dataset.
	 */
	private ExpressionContext getExpressionContextFromDSRun() {
		JRDesignDataset designDs=jrContext.getJasperDesign().getMainDesignDataset(); 
		if(edataset.getDatasetRun()!=null){
			designDs=ModelUtils.getDesignDatasetByName(jrContext.getJasperDesign(), Misc.nvl(edataset.getDatasetRun().getDatasetName()));
		}
		return new ExpressionContext(designDs,jrContext);
	}
}
