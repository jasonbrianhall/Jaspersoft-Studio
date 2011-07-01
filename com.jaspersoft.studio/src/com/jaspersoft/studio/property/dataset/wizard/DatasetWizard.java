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
package com.jaspersoft.studio.property.dataset.wizard;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.JRGroup;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignField;
import net.sf.jasperreports.engine.design.JRDesignGroup;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IFileEditorInput;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.dataset.MDataset;

public class DatasetWizard extends Wizard {
	private MDataset dataset;
	private WizardDatasetNewPage step1;
	private WizardDataSourcePage step2;
	private WizardFieldsPage step3;
	private WizardFieldsGroupByPage step4;

	public DatasetWizard() {
		super();
		setWindowTitle(Messages.common_dataset);
	}

	@Override
	public void addPages() {
		this.dataset = new MDataset();
		dataset.setValue(MDataset.createJRDataset(jasperDesign));

		step1 = new WizardDatasetNewPage(jasperDesign);
		addPage(step1);
		step1.setDataSet(dataset);

		IFile file = getCurrentFile();

		step2 = new WizardDataSourcePage(file);
		addPage(step2);

		step3 = new WizardFieldsPage();
		addPage(step3);

		step4 = new WizardFieldsGroupByPage();
		addPage(step4);
	}

	private IFile getCurrentFile() {
		IFile file = ((IFileEditorInput) JaspersoftStudioPlugin.getInstance().getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getActiveEditor().getEditorInput()).getFile();
		return file;
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page == step3) {
			try {
				JRDesignDataset dataset = step2.getDataset();
				if (dataset != null && dataset.getFieldsList() != null) {
					step3.setFields(new ArrayList<Object>(dataset.getFieldsList()));
				}
			} catch (UnsupportedOperationException e) {
				e.printStackTrace();
			}
		}
		if (page == step4 && step3.getFields() != null)
			step4.setFields(new ArrayList<Object>(step3.getFields()));
		return super.getNextPage(page);
	}

	public MDataset getDataset() {
		JRDesignDataset jdataset = (JRDesignDataset) dataset.getValue();
		setUpDataset(jdataset, step2, step3, step4);

		return dataset;
	}

	public static void setUpDataset(JRDesignDataset jdataset, WizardDataSourcePage step2, WizardFieldsPage step3,
			WizardFieldsGroupByPage step4) {
		JRDesignDataset dataset = step2.getDataset();
		if (dataset != null) {
			jdataset.setQuery((JRDesignQuery) dataset.getQuery());
		}
		if (step3.getFields() != null)
			for (Object f : step3.getFields())
				try {
					jdataset.addField((JRField) f);
				} catch (JRException e) {
					e.printStackTrace();
				}
		List<Object> groupFields = step4.getFields();
		if (groupFields != null) {
			for (int i = 0; i < groupFields.size(); i++) {
				try {
					JRDesignField f = (JRDesignField) groupFields.get(i);
					String name = ((JRField) f).getName();
					JRDesignGroup group = null;
					List<JRGroup> dsgroups = jdataset.getGroupsList();
					if (dsgroups.size() <= i) {
						group = new JRDesignGroup();
						group.setName(name);
						jdataset.addGroup(group);
					} else {
						group = (JRDesignGroup) dsgroups.get(i);
						group.setName(name);
					}
					JRDesignExpression jre = new JRDesignExpression();
					jre.setText("$F{" + name + "}"); //$NON-NLS-1$ //$NON-NLS-2$
					group.setExpression(jre);

				} catch (JRException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public boolean performFinish() {
		return true;
	}

	private JasperDesign jasperDesign;

	public void init(JasperDesign jd) {
		this.jasperDesign = jd;
	}
}
