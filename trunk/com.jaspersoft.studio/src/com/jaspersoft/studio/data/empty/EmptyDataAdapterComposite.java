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
package com.jaspersoft.studio.data.empty;

import net.sf.jasperreports.data.DataAdapter;

import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;

import com.jaspersoft.studio.data.ADataAdapterComposite;
import com.jaspersoft.studio.data.DataAdapterDescriptor;

public class EmptyDataAdapterComposite extends ADataAdapterComposite {

	private Spinner spinnerRecords;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public EmptyDataAdapterComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Number of empty records" + " :");

		spinnerRecords = new Spinner(this, SWT.BORDER);
		spinnerRecords.setValues(0, 0, Integer.MAX_VALUE, 0, 1, 10);
		spinnerRecords.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}

	@Override
	protected void bindWidgets(DataAdapter dataAdapter) {
		bindingContext.bindValue(SWTObservables.observeSelection(spinnerRecords),
				PojoObservables.observeValue(dataAdapter, "recordCount"));
	}

	public DataAdapterDescriptor getDataAdapter() {
		if (dataAdapterDesc == null)
			dataAdapterDesc = new EmptyDataAdapterDescriptor();

		((EmptyDataAdapterDescriptor) dataAdapterDesc).getDataAdapter().setRecordCount(spinnerRecords.getSelection());
		return dataAdapterDesc;
	}

}
