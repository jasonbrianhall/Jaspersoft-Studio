/*******************************************************************************
 * Copyright (C) 2010 - 2012 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.studio.data.hibernate.spring;

import net.sf.jasperreports.data.DataAdapter;
import net.sf.jasperreports.data.hibernate.spring.SpringHibernateDataAdapter;

import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.jface.databinding.swt.SWTObservables;
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

import com.jaspersoft.studio.data.ADataAdapterComposite;
import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.data.messages.Messages;

public class SpringHibernateDataAdapterComposite extends ADataAdapterComposite {

	private Text springConfig;
	private Text beanIDtxt;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public SpringHibernateDataAdapterComposite(Composite parent, int style) {

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
		lblNewLabel.setText(Messages.SpringHibernateDataAdapterComposite_0);

		springConfig = new Text(composite, SWT.BORDER);
		springConfig.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Button btnBrowse = new Button(composite, SWT.NONE);
		btnBrowse.setText(Messages.SpringHibernateDataAdapterComposite_1);

		btnBrowse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fd = new FileDialog(Display.getDefault()
						.getActiveShell());
				fd.setFileName(springConfig.getText());
				fd.setFilterExtensions(new String[] { "*.cfg.xml", "*.*" }); //$NON-NLS-1$ //$NON-NLS-2$
				String selection = fd.open();
				if (selection != null)
					springConfig.setText(selection);
			}
		});

		lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setText(Messages.SpringHibernateDataAdapterComposite_4);

		beanIDtxt = new Text(composite, SWT.BORDER);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		beanIDtxt.setLayoutData(gd);

	}

	@Override
	protected void bindWidgets(DataAdapter dataAdapter) {
		bindingContext.bindValue(
				SWTObservables.observeText(springConfig, SWT.Modify),
				PojoObservables.observeValue(dataAdapter, "springConfig")); //$NON-NLS-1$
		bindingContext.bindValue(
				SWTObservables.observeText(beanIDtxt, SWT.Modify),
				PojoObservables.observeValue(dataAdapter, "beanId")); //$NON-NLS-1$
	}

	public DataAdapterDescriptor getDataAdapter() {
		if (dataAdapterDesc == null)
			dataAdapterDesc = new SpringHibernateDataAdapterDescriptor();

		SpringHibernateDataAdapter dataAdapter = (SpringHibernateDataAdapter) dataAdapterDesc
				.getDataAdapter();

		dataAdapter.setSpringConfig(springConfig.getText());
		dataAdapter.setBeanId(beanIDtxt.getText());

		return dataAdapterDesc;
	}

}
