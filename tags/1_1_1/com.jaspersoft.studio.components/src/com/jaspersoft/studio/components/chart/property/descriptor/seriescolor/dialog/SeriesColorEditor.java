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
package com.jaspersoft.studio.components.chart.property.descriptor.seriescolor.dialog;

import java.util.Collection;
import java.util.SortedSet;

import net.sf.jasperreports.engine.base.JRBaseChartPlot.JRBaseSeriesColor;

import org.eclipse.jface.wizard.Wizard;

import com.jaspersoft.studio.components.chart.messages.Messages;

public class SeriesColorEditor extends Wizard {
	private Collection<JRBaseSeriesColor> value;
	private SeriesColorPage page0;

	public Collection<?> getValue() {
		if (page0 != null)
			return page0.getValue();
		return value;
	}

	public void setValue(SortedSet<JRBaseSeriesColor> value) {
		if (page0 != null)
			page0.setValue(value);
		this.value = value;
	}

	public SeriesColorEditor() {
		super();
		setWindowTitle(Messages.common_series_colors);
		setNeedsProgressMonitor(false);
	}

	@Override
	public void addPages() {
		page0 = new SeriesColorPage("SeriesColor"); //$NON-NLS-1$
		page0.setValue((SortedSet<JRBaseSeriesColor>) value);
		addPage(page0);
	}

	@Override
	public boolean performFinish() {
		return true;
	}

}
