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
package com.jaspersoft.studio.components.chart.wizard.fragments.data;

import net.sf.jasperreports.charts.design.JRDesignHighLowDataset;
import net.sf.jasperreports.engine.design.JRDesignElement;
import net.sf.jasperreports.engine.design.JRDesignElementDataset;
import net.sf.jasperreports.engine.export.draw.DrawVisitor;

import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.jaspersoft.studio.components.chart.wizard.fragments.data.widget.DatasetSeriesWidget;
import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.property.dataset.ExpressionWidget;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class DSHighLow extends ADSComponent {
	private JRDesignHighLowDataset dataset;
	private ExpressionWidget series;
	private ExpressionWidget volume;
	private ExpressionWidget date;
	private ExpressionWidget close;
	private ExpressionWidget open;
	private ExpressionWidget high;
	private ExpressionWidget low;

	public DSHighLow(Composite composite, DatasetSeriesWidget dsWidget) {
		super(composite, dsWidget);
	}

	@Override
	public String getName() {
		return "High Low Dataset";
	}

	@Override
	public void setData(DrawVisitor drawVisitor, JRDesignElement jrChart,
			JRDesignElementDataset eDataset,
			JasperReportsConfiguration jrContext) {
		Assert.isTrue(eDataset instanceof JRDesignHighLowDataset);
		super.setData(drawVisitor, jrChart, eDataset, jrContext);
		dataset = (JRDesignHighLowDataset) eDataset;

		series.bindObject(dataset, "SeriesExpression");
		volume.bindObject(dataset, "VolumeExpression");
		date.bindObject(dataset, "DateExpression");
		close.bindObject(dataset, "CloseExpression");
		open.bindObject(dataset, "OpenExpression");
		high.bindObject(dataset, "HighExpression");
		low.bindObject(dataset, "LowExpression");
	}

	protected Control createChartTop(Composite composite) {
		Composite yCompo = new Composite(composite, SWT.NONE);
		yCompo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));
		yCompo.setLayout(new GridLayout(10, false));

		return yCompo;
	}

	@Override
	protected Control createChartLeft(Composite parent) {
		Composite xCompo = new Composite(parent, SWT.NONE);
		xCompo.setLayout(new GridLayout(3, false));
		xCompo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));

		high = new ExpressionWidget(xCompo, "High");

		close = new ExpressionWidget(xCompo, "Close");

		open = new ExpressionWidget(xCompo, "Open");

		low = new ExpressionWidget(xCompo, "Low");

		return xCompo;
	}

	@Override
	protected Control createChartBottom(Composite parent) {
		Composite xCompo = new Composite(parent, SWT.NONE);
		xCompo.setLayout(new GridLayout(3, false));
		xCompo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));

		series = new ExpressionWidget(xCompo, "Series");

		return xCompo;
	}

	@Override
	protected Control createChartRight(Composite parent) {
		Composite xCompo = new Composite(parent, SWT.NONE);
		xCompo.setLayout(new GridLayout(3, false));
		xCompo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));

		volume = new ExpressionWidget(xCompo, "Volume");
		date = new ExpressionWidget(xCompo, "Date");

		return xCompo;
	}

	@Override
	public void setExpressionContext(ExpressionContext expContext) {
		super.setExpressionContext(expContext);
		this.date.setExpressionContext(expContext);
		this.high.setExpressionContext(expContext);
		this.low.setExpressionContext(expContext);
		this.open.setExpressionContext(expContext);
		this.series.setExpressionContext(expContext);
		this.volume.setExpressionContext(expContext);
	}
	
}
