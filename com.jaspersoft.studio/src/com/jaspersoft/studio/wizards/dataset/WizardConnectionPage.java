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
package com.jaspersoft.studio.wizards.dataset;

import net.sf.jasperreports.engine.design.JRDesignDatasetRun;
import net.sf.jasperreports.engine.design.JRDesignExpression;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.MExpression;
import com.jaspersoft.studio.model.dataset.MDatasetRun;
import com.jaspersoft.studio.property.descriptor.expression.dialog.JRExpressionEditor;

public class WizardConnectionPage extends WizardPage {
	private MDatasetRun datasetrun;

	public void setDataSetRun(MDatasetRun datasetrun) {
		this.datasetrun = datasetrun;
		JRDesignDatasetRun ct = (JRDesignDatasetRun) datasetrun.getValue();
		if (ct == null)
			datasetrun.setValue(new JRDesignDatasetRun());
	}

	public MDatasetRun getDataSetRun() {
		return datasetrun;
	}

	public WizardConnectionPage() {
		super("connectionpage"); //$NON-NLS-1$
		setTitle(Messages.WizardConnectionPage_0);
		setDescription(Messages.WizardConnectionPage_1);
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);
		setControl(composite);

		final Button mainReport = new Button(composite, SWT.RADIO);
		mainReport.setText(Messages.WizardConnectionPage_2);
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		mainReport.setLayoutData(gd);
		mainReport.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				if (mainReport.getSelection())
					mainReportConnection();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		mainReport.setSelection(true);
		mainReportConnection();

		// -----------------------------------------------------------------------

		final Button connection = new Button(composite, SWT.RADIO);
		connection.setText(Messages.WizardConnectionPage_3);
		gd = new GridData();
		gd.horizontalSpan = 2;
		connection.setLayoutData(gd);

		final Text connExpr = new Text(composite, SWT.BORDER);
		gd = new GridData();
		gd.widthHint = 500;
		connExpr.setLayoutData(gd);
		connExpr.setEnabled(false);

		final Button connExprDialog = new Button(composite, SWT.PUSH);
		connExprDialog.setText(Messages.WizardConnectionPage_4);
		connExprDialog.setEnabled(false);
		connExprDialog.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				JRExpressionEditor wizard = new JRExpressionEditor();

				MExpression mexp = (MExpression) datasetrun.getPropertyValue(JRDesignDatasetRun.PROPERTY_CONNECTION_EXPRESSION);
				if (mexp == null || mexp.getValue() == null) {
					JRDesignExpression jrExpression = new JRDesignExpression();
					jrExpression.setValueClassName(Messages.WizardConnectionPage_5);
					mexp = new MExpression(jrExpression);
				}

				wizard.setValue(mexp);
				WizardDialog dialog = new WizardDialog(connExprDialog.getShell(), wizard);
				dialog.create();
				if (dialog.open() == Dialog.OK) {
					mexp = wizard.getValue();
					datasetrun.setPropertyValue(JRDesignDatasetRun.PROPERTY_CONNECTION_EXPRESSION, mexp);
					datasetrun.setPropertyValue(JRDesignDatasetRun.PROPERTY_DATA_SOURCE_EXPRESSION, null);

					connExpr.setText((String) mexp.getPropertyValue(JRDesignExpression.PROPERTY_TEXT));
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		connExpr.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				MExpression mexp = (MExpression) datasetrun.getPropertyValue(JRDesignDatasetRun.PROPERTY_CONNECTION_EXPRESSION);
				if (mexp == null || mexp.getValue() == null) {
					JRDesignExpression jrExpression = new JRDesignExpression();
					jrExpression.setValueClassName(Messages.WizardConnectionPage_6);
					mexp = new MExpression(jrExpression);
				}
				mexp.setPropertyValue(JRDesignExpression.PROPERTY_TEXT, connExpr.getText());
				datasetrun.setPropertyValue(JRDesignDatasetRun.PROPERTY_CONNECTION_EXPRESSION, mexp);
				datasetrun.setPropertyValue(JRDesignDatasetRun.PROPERTY_DATA_SOURCE_EXPRESSION, null);
			}
		});

		connection.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				boolean selection = connection.getSelection();
				connExpr.setEnabled(selection);
				connExprDialog.setEnabled(selection);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		// ---------------------------------------------------------------------------

		final Button dataSource = new Button(composite, SWT.RADIO);
		dataSource.setText(Messages.WizardConnectionPage_7);
		gd = new GridData();
		gd.horizontalSpan = 2;
		dataSource.setLayoutData(gd);

		final Text dsExpr = new Text(composite, SWT.BORDER);
		gd = new GridData();
		gd.widthHint = 500;
		dsExpr.setLayoutData(gd);
		dsExpr.setEnabled(false);

		final Button dsExprDialog = new Button(composite, SWT.PUSH);
		dsExprDialog.setText(Messages.WizardConnectionPage_8);
		dsExprDialog.setEnabled(false);

		dataSource.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {

				boolean selection = dataSource.getSelection();
				dsExpr.setEnabled(selection);
				dsExprDialog.setEnabled(selection);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		dsExprDialog.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				JRExpressionEditor wizard = new JRExpressionEditor();

				MExpression mexp = (MExpression) datasetrun
						.getPropertyValue(JRDesignDatasetRun.PROPERTY_DATA_SOURCE_EXPRESSION);
				if (mexp == null || mexp.getValue() == null) {
					JRDesignExpression jrExpression = new JRDesignExpression();
					jrExpression.setValueClassName(Messages.WizardConnectionPage_9);
					mexp = new MExpression(jrExpression);
				}

				wizard.setValue(mexp);
				WizardDialog dialog = new WizardDialog(dsExprDialog.getShell(), wizard);
				dialog.create();
				if (dialog.open() == Dialog.OK) {
					mexp = wizard.getValue();
					datasetrun.setPropertyValue(JRDesignDatasetRun.PROPERTY_CONNECTION_EXPRESSION, null);
					datasetrun.setPropertyValue(JRDesignDatasetRun.PROPERTY_DATA_SOURCE_EXPRESSION, mexp);

					dsExpr.setText((String) mexp.getPropertyValue(JRDesignExpression.PROPERTY_TEXT));
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		dsExpr.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				MExpression mexp = (MExpression) datasetrun
						.getPropertyValue(JRDesignDatasetRun.PROPERTY_DATA_SOURCE_EXPRESSION);
				if (mexp == null || mexp.getValue() == null) {
					JRDesignExpression jrExpression = new JRDesignExpression();
					jrExpression.setValueClassName(Messages.WizardConnectionPage_10);
					mexp = new MExpression(jrExpression);
				}
				mexp.setPropertyValue(JRDesignExpression.PROPERTY_TEXT, connExpr.getText());
				datasetrun.setPropertyValue(JRDesignDatasetRun.PROPERTY_CONNECTION_EXPRESSION, null);
				datasetrun.setPropertyValue(JRDesignDatasetRun.PROPERTY_DATA_SOURCE_EXPRESSION, mexp);
			}
		});

		// ------------------------------------------------------------------------------

		final Button emptyConnection = new Button(composite, SWT.RADIO);
		emptyConnection.setText(Messages.WizardConnectionPage_11);
		gd = new GridData();
		gd.horizontalSpan = 2;
		emptyConnection.setLayoutData(gd);
		emptyConnection.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				if (emptyConnection.getSelection()) {
					JRDesignExpression jde = new JRDesignExpression();
					jde.setValueClassName(Messages.WizardConnectionPage_12);
					jde.setText(Messages.WizardConnectionPage_13);

					datasetrun.setPropertyValue(JRDesignDatasetRun.PROPERTY_CONNECTION_EXPRESSION, null);
					datasetrun.setPropertyValue(JRDesignDatasetRun.PROPERTY_DATA_SOURCE_EXPRESSION, jde);
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		final Button noConnection = new Button(composite, SWT.RADIO);
		noConnection.setText(Messages.WizardConnectionPage_14);
		gd = new GridData();
		gd.horizontalSpan = 2;
		noConnection.setLayoutData(gd);
		noConnection.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				if (noConnection.getSelection()) {
					datasetrun.setPropertyValue(JRDesignDatasetRun.PROPERTY_CONNECTION_EXPRESSION, null);
					datasetrun.setPropertyValue(JRDesignDatasetRun.PROPERTY_DATA_SOURCE_EXPRESSION, null);
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		PlatformUI.getWorkbench().getHelpSystem()
				.setHelp(getControl(), "Jaspersoft.wizard");
	}

	private void mainReportConnection() {
		JRDesignExpression jde = new JRDesignExpression();
		jde.setValueClassName(Messages.WizardConnectionPage_15);
		jde.setText(Messages.WizardConnectionPage_16);

		datasetrun.setPropertyValue(JRDesignDatasetRun.PROPERTY_CONNECTION_EXPRESSION, jde);
		datasetrun.setPropertyValue(JRDesignDatasetRun.PROPERTY_DATA_SOURCE_EXPRESSION, null);
	}

}
