/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of Jaspersoft Open Studio.
 * 
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Jaspersoft Open Studio is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with Jaspersoft Open Studio. If not,
 * see <http://www.gnu.org/licenses/>.
 */
/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of iReport.
 * 
 * iReport is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public
 * License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * iReport is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with iReport. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.property.dataset.wizard;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignField;
import net.sf.jasperreports.engine.design.JRDesignParameter;
import net.sf.jasperreports.engine.design.JRDesignQuery;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.data.IFieldSetter;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.datasource.MDatasources;
import com.jaspersoft.studio.property.dataset.dialog.DataQueryAdapters;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;
import com.jaspersoft.studio.wizards.JSSWizardPage;

public class WizardDataSourcePage extends JSSWizardPage implements IFieldSetter {
	private JRDesignDataset dataset;
	private JasperReportsConfiguration jConfig;

	public JRDesignDataset getDataset() {
		if (dataset == null) {
			dataset = new JRDesignDataset(true);
			JRDesignQuery query = new JRDesignQuery();
			query.setLanguage("SQL");
			dataset.setQuery(query);
		}
		return dataset;
	}

	private DataQueryAdapters dataquery;

	public WizardDataSourcePage(JasperReportsConfiguration jConfig) {
		super("datasourcepage"); //$NON-NLS-1$
		setTitle(Messages.WizardDataSourcePage_datasource);
		setImageDescriptor(MDatasources.getIconDescriptor().getIcon32());
		setDescription(Messages.WizardDataSourcePage_description);
		this.jConfig = jConfig;
	}

	@Override
	public void dispose() {
		dataquery.dispose();
		super.dispose();
	}

	public void getFields(IProgressMonitor monitor) {
		if (dataquery != null)
			dataquery.getFields(monitor);
	}

	public DataAdapterDescriptor getDataAdapter() {
		if (dataquery != null)
			return dataquery.getDataAdapter();
		return null;
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, true));
		setControl(composite);

		JRDesignDataset ds = getDataset();
		dataquery = new DataQueryAdapters(composite, jConfig, ds, composite.getBackground(), getWizard().getContainer()) {

			@Override
			public void setFields(List<JRDesignField> fields) {
				WizardDataSourcePage.this.setFields(fields);
			}

			@Override
			public List<JRDesignField> getCurrentFields() {
				List<JRDesignField> fields=new ArrayList<JRDesignField>();
				for(JRField f : dataset.getFieldsList()){
					fields.add((JRDesignField)f);
				}
				return fields;
			}

			@Override
			public void setParameters(List<JRDesignParameter> params) {
			}

			@Override
			public int getContainerType() {
				return CONTAINER_WITH_NO_TABLES;
			}
		};

		CTabFolder ctf = dataquery.createTop(composite, this);

		Composite c = dataquery.createToolbar(ctf);

		int tabHeight = c.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
		tabHeight = Math.max(tabHeight, ctf.getTabHeight());
		ctf.setTabHeight(tabHeight);

		ctf.setTopRight(c);
		if (jConfig != null)
			dataquery.setDataset(jConfig.getJasperDesign(), ds);

		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), "Jaspersoft.wizard");
	}

	public void setFile(JasperReportsConfiguration jConfig) {
		this.jConfig = jConfig;
		dataquery.setFile(jConfig);

	}

	public void setFields(List<JRDesignField> fields) {
		// DatasetDialog.this.setFields(fields);
		dataset.getFieldsList().clear();
		dataset.getFieldsMap().clear();
		for (JRDesignField field : fields)
			try {
				dataset.addField(field);
			} catch (JRException e) {
				e.printStackTrace();
			}
	}

}
