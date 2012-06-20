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
package com.jaspersoft.studio.data.jrdsprovider;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.data.DataAdapterService;
import net.sf.jasperreports.data.provider.DataSourceProviderDataAdapterService;
import net.sf.jasperreports.engine.JRDataSourceProvider;
import net.sf.jasperreports.engine.JRDataset;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.design.JRDesignField;

import com.jaspersoft.studio.data.fields.IFieldsProvider;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class JRDSProviderFieldsProvider implements IFieldsProvider {

	private JRDataSourceProvider jrdsp;

	public void setProvider(JRDataSourceProvider jrdsp) {
		this.jrdsp = jrdsp;
	}

	public boolean supportsGetFieldsOperation() {
		if (jrdsp != null)
			return jrdsp.supportsGetFieldsOperation();
		return false;
	}

	public List<JRDesignField> getFields(DataAdapterService con,
			JasperReportsConfiguration jConfig, JRDataset reportDataset)
			throws JRException, UnsupportedOperationException {
		jrdsp = ((DataSourceProviderDataAdapterService) con).getProvider();
		if (jrdsp != null) {
			JRField[] aray = jrdsp.getFields(null);
			if (aray != null) {
				List<JRDesignField> fields = new ArrayList<JRDesignField>();
				for (JRField f : aray)
					fields.add((JRDesignField) f);
				return fields;
			}
		}
		return new ArrayList<JRDesignField>();
	}

}
