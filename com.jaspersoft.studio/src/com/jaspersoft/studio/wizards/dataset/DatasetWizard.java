/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer.
 * Copyright (C) 2005 - 2010 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of Jaspersoft Open Studio.
 *
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Jaspersoft Open Studio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Jaspersoft Open Studio. If not, see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.wizards.dataset;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSourceProvider;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignField;
import net.sf.jasperreports.engine.design.JRDesignGroup;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

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

		step2 = new WizardDataSourcePage();
		addPage(step2);

		step3 = new WizardFieldsPage();
		addPage(step3);

		step4 = new WizardFieldsGroupByPage();
		addPage(step4);
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page == step3) {
			JRField[] fields;
			try {
				JRDataSourceProvider dataSource = step2.getDataSource();
				if (dataSource != null) {
					fields = dataSource.getFields(null);
					List<JRDesignField> flist = new ArrayList<JRDesignField>();
					for (JRField f : fields)
						flist.add((JRDesignField) f);

					step3.setFields(flist);
				}
			} catch (UnsupportedOperationException e) {
				e.printStackTrace();
			} catch (JRException e) {
				e.printStackTrace();
			}
		}
		if (page == step4 && step3.getFields() != null)
			step4.setFields(new ArrayList<JRDesignField>(step3.getFields()));
		return super.getNextPage(page);
	}

	public MDataset getDataset() {
		JRDesignDataset jdataset = (JRDesignDataset) dataset.getValue();
		setUpDataset(jdataset, step3, step4);
		return dataset;
	}

	public static void setUpDataset(JRDesignDataset jdataset, WizardFieldsPage step3, WizardFieldsGroupByPage step4) {
		if (step3.getFields() != null)
			for (JRDesignField f : step3.getFields())
				try {
					jdataset.addField(f);
				} catch (JRException e) {
					e.printStackTrace();
				}
		if (step4.getFields() != null) {
			for (JRDesignField f : step4.getFields()) {
				try {
					JRDesignGroup group = new JRDesignGroup();
					group.setName(f.getName());
					JRDesignExpression jre = new JRDesignExpression();
					jre.setText("$F{" + f.getName() + "}"); //$NON-NLS-1$ //$NON-NLS-2$
					group.setExpression(jre);

					jdataset.addGroup(group);
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
