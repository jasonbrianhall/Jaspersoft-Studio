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
package com.jaspersoft.studio.data.jrdsprovider;

import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.data.DataAdapter;
import com.jaspersoft.studio.utils.Misc;

import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;

public class JrdsProviderDataAdapterComposite extends Composite {
	
	private JrdsProviderDataAdapter jrdsProviderDataAdapter = null;
	private Text textJRDSProviderClassName;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public JrdsProviderDataAdapterComposite(Composite parent, int style) {
		
		/*
		 * UI ELEMENTS
		 */
		super(parent, style);
		setLayout(new GridLayout(1, false));
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("JasperReports DataSource Provider Class Name:");
		
		textJRDSProviderClassName = new Text(this, SWT.BORDER);
		textJRDSProviderClassName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		textJRDSProviderClassName.setText("com.jaspersoft.studio.data.jrdsprovider.sample.PersonBeansDataSource");
		
		/*
		 * UI ELEMENTS LISTENERS
		 */
		textJRDSProviderClassName.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				jrdsProviderDataAdapter.setJRDSProviderClassName(textJRDSProviderClassName.getText().trim());
			}
		});
	}

	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public void setDataAdapter(JrdsProviderDataAdapter dataAdapter) {
		
		jrdsProviderDataAdapter = dataAdapter;
		textJRDSProviderClassName.setText( Misc.nvl(jrdsProviderDataAdapter.getJRDSProviderClassName(), "") );
	}

	public DataAdapter getDataAdapter() {
		
		if (jrdsProviderDataAdapter == null) jrdsProviderDataAdapter = new JrdsProviderDataAdapter();
		
		jrdsProviderDataAdapter.setJRDSProviderClassName(textJRDSProviderClassName.getText().trim());
		
		return jrdsProviderDataAdapter;
	}

	public String getHelpContextId() {
		// TODO Auto-generated method stub
		return null;
	}
}
