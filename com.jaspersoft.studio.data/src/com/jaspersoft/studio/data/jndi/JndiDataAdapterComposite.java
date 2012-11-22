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
package com.jaspersoft.studio.data.jndi;

import net.sf.jasperreports.data.DataAdapter;
import net.sf.jasperreports.data.jndi.JndiDataAdapter;

import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.jaspersoft.studio.data.ADataAdapterComposite;
import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.data.messages.Messages;

public class JndiDataAdapterComposite extends ADataAdapterComposite {

	private Text dataSourceName;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public JndiDataAdapterComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setText(Messages.JndiDataAdapterComposite_0);

		dataSourceName = new Text(this, SWT.BORDER);
		dataSourceName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}

	@Override
	protected void bindWidgets(DataAdapter dataAdapter) {
		bindingContext.bindValue(
				SWTObservables.observeText(dataSourceName, SWT.Modify),
				PojoObservables.observeValue(dataAdapter, "dataSourceName")); //$NON-NLS-1$
	}

	public DataAdapterDescriptor getDataAdapter() {
		if (dataAdapterDesc == null)
			dataAdapterDesc = new JndiDataAdapterDescriptor();

		JndiDataAdapter dataAdapter = (JndiDataAdapter) dataAdapterDesc
				.getDataAdapter();

		dataAdapter.setDataSourceName(dataSourceName.getText());

		return dataAdapterDesc;
	}

}
