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
package com.jaspersoft.studio.data.hibernate;

import net.sf.jasperreports.data.hibernate.HibernateDataAdapter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.utils.Misc;

public class HibernateDataAdapterComposite extends Composite {

	private HibernateDataAdapterDescriptor hbmDataAdapterDesc = null;
	private Text xmlFileName;
	private Text propFileName;
	private Button btnUseAnnotation;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public HibernateDataAdapterComposite(Composite parent, int style) {

		super(parent, style);
		setLayout(new GridLayout(1, false));

		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		GridLayout gl_composite = new GridLayout(3, false);
		gl_composite.marginWidth = 0;
		gl_composite.marginHeight = 0;
		composite.setLayout(gl_composite);

		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setText("Hibernate (.cfg.xml) File:");

		xmlFileName = new Text(composite, SWT.BORDER);
		xmlFileName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Button btnBrowse = new Button(composite, SWT.NONE);
		btnBrowse.setText("...");

		btnBrowse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fd = new FileDialog(Display.getDefault()
						.getActiveShell());
				fd.setFileName(xmlFileName.getText());
				fd.setFilterExtensions(new String[] { "*.cfg.xml", "*.*" });
				String selection = fd.open();
				if (selection != null)
					xmlFileName.setText(selection);
			}
		});

		lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setText("hibernate.properties File:");

		propFileName = new Text(composite, SWT.BORDER);
		propFileName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		btnBrowse = new Button(composite, SWT.PUSH);
		btnBrowse.setText("...");

		btnBrowse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fd = new FileDialog(Display.getDefault()
						.getActiveShell());
				fd.setFileName(xmlFileName.getText());
				fd.setFilterExtensions(new String[] { "*.properties", "*.*" });
				String selection = fd.open();
				if (selection != null)
					propFileName.setText(selection);
			}
		});

		btnUseAnnotation = new Button(composite, SWT.CHECK);
		btnUseAnnotation.setText("Use Annotation");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public void setDataAdapter(HibernateDataAdapterDescriptor dataAdapter) {
		this.hbmDataAdapterDesc = dataAdapter;

		HibernateDataAdapter xmlDataAdapter = hbmDataAdapterDesc
				.getDataAdapter();

		xmlFileName.setText(Misc.nvl(xmlDataAdapter.getXMLFileName(), ""));
		propFileName.setText(Misc.nvl(xmlDataAdapter.getPropertiesFileName(),
				""));
		btnUseAnnotation.setSelection(xmlDataAdapter.isUseAnnotation());

	}

	public DataAdapterDescriptor getDataAdapter() {
		if (hbmDataAdapterDesc == null)
			hbmDataAdapterDesc = new HibernateDataAdapterDescriptor();

		HibernateDataAdapter dataAdapter = hbmDataAdapterDesc.getDataAdapter();

		dataAdapter.setXMLFileName(xmlFileName.getText());
		dataAdapter.setPropertiesFileName(propFileName.getText());
		dataAdapter.setUseAnnotation(btnUseAnnotation.getSelection());

		return hbmDataAdapterDesc;
	}

	public String getHelpContextId() {
		return "";
	}
}
