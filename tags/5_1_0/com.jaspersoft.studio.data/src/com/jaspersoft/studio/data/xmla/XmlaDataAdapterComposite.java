/*******************************************************************************
 * Copyright (C) 2010 - 2013 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.studio.data.xmla;

import net.sf.jasperreports.data.DataAdapter;
import net.sf.jasperreports.data.xmla.XmlaDataAdapter;

import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import rex.graphics.datasourcetree.elements.CatalogElement;
import rex.graphics.datasourcetree.elements.CubeElement;
import rex.graphics.datasourcetree.elements.DataSourceTreeElement;
import rex.metadata.ServerMetadata;

import com.jaspersoft.studio.data.ADataAdapterComposite;
import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.data.messages.Messages;

public class XmlaDataAdapterComposite extends ADataAdapterComposite {

	private Text xmlaUri;
	private Text textUsername;
	private Text textPassword;
	private Combo cube;
	private Combo catalog;
	private Combo datasource;
	private DataSourceTreeElement[] dstes;
	private DataSourceTreeElement[] catalogs;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public XmlaDataAdapterComposite(Composite parent, int style) {

		super(parent, style);
		setLayout(new GridLayout(3, false));

		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setText(Messages.XmlaDataAdapterComposite_0);

		xmlaUri = new Text(this, SWT.BORDER);
		xmlaUri.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Button bGetMetadata = new Button(this, SWT.PUSH);
		bGetMetadata.setText(Messages.XmlaDataAdapterComposite_1);

		new Label(this, SWT.NONE).setText(Messages.XmlaDataAdapterComposite_2);
		datasource = new Combo(this, SWT.READ_ONLY | SWT.BORDER);
		datasource.setItems(new String[] {});
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		datasource.setLayoutData(gd);

		new Label(this, SWT.NONE).setText(Messages.XmlaDataAdapterComposite_3);
		catalog = new Combo(this, SWT.READ_ONLY | SWT.BORDER);
		catalog.setItems(new String[] {});
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		catalog.setLayoutData(gd);

		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 3;
		new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL).setLayoutData(gd);

		new Label(this, SWT.NONE).setText(Messages.XmlaDataAdapterComposite_4);

		cube = new Combo(this, SWT.READ_ONLY | SWT.BORDER);
		cube.setItems(new String[] {});
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		cube.setLayoutData(gd);

		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 3;
		new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL).setLayoutData(gd);

		Label lblUsername = new Label(this, SWT.NONE);
		lblUsername.setText(Messages.JDBCDataAdapterComposite_username);

		textUsername = new Text(this, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		textUsername.setLayoutData(gd);

		Label lblPassword = new Label(this, SWT.NONE);
		lblPassword.setText(Messages.JDBCDataAdapterComposite_password);

		textPassword = new Text(this, SWT.BORDER | SWT.PASSWORD);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		textPassword.setLayoutData(gd);

		bGetMetadata.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				String url = xmlaUri.getText();
				ServerMetadata smd = new ServerMetadata(url);

				handleMetaDataChanged(smd);

			}
		});

		datasource.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				handleDatasourceChanged();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});

		catalog.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				handleCatalogChanged();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
	}

	@Override
	protected void bindWidgets(DataAdapter dataAdapter) {
		bindingContext.bindValue(
				SWTObservables.observeText(xmlaUri, SWT.Modify),
				PojoObservables.observeValue(dataAdapter, "xmlaUrl")); //$NON-NLS-1$
		bindingContext.bindValue(SWTObservables.observeSelection(datasource),
				PojoObservables.observeValue(dataAdapter, "datasource")); //$NON-NLS-1$
		bindingContext.bindValue(SWTObservables.observeSelection(catalog),
				PojoObservables.observeValue(dataAdapter, "catalog")); //$NON-NLS-1$
		bindingContext.bindValue(SWTObservables.observeSelection(cube),
				PojoObservables.observeValue(dataAdapter, "cube")); //$NON-NLS-1$
		bindingContext.bindValue(
				SWTObservables.observeText(textUsername, SWT.Modify),
				PojoObservables.observeValue(dataAdapter, "username")); //$NON-NLS-1$
		bindingContext.bindValue(
				SWTObservables.observeText(textPassword, SWT.Modify),
				PojoObservables.observeValue(dataAdapter, "password")); //$NON-NLS-1$
	}

	public DataAdapterDescriptor getDataAdapter() {
		if (dataAdapterDesc == null)
			dataAdapterDesc = new XmlaDataAdapterDescriptor();

		XmlaDataAdapter dataAdapter = (XmlaDataAdapter) dataAdapterDesc
				.getDataAdapter();

		dataAdapter.setXmlaUrl(xmlaUri.getText());
		dataAdapter.setDatasource(datasource.getText());
		dataAdapter.setCatalog(catalog.getText());
		dataAdapter.setCube(cube.getText());

		dataAdapter.setUsername(textUsername.getText());
		dataAdapter.setPassword(textPassword.getText());

		return dataAdapterDesc;
	}

	protected void handleDatasourceChanged() {
		catalog.removeAll();
		cube.removeAll();
		int ind = datasource.getSelectionIndex();
		catalogs = dstes[ind].getChildren();
		if (catalogs == null || catalogs.length == 0)
			return;

		String[] scat = new String[catalogs.length];
		for (int i = 0; i < catalogs.length; i++)
			scat[i] = ((CatalogElement) catalogs[i]).toString();
		catalog.setItems(scat);
		catalog.select(0);
		handleCatalogChanged();
	}

	protected void handleCatalogChanged() {
		cube.removeAll();
		int ind = catalog.getSelectionIndex();
		DataSourceTreeElement[] cubes = catalogs[ind].getChildren();
		if (cubes == null || cubes.length == 0)
			return;

		String[] scubes = new String[cubes.length];
		for (int i = 0; i < cubes.length; i++)
			scubes[i] = ((CubeElement) cubes[i]).toString();
		cube.setItems(scubes);
		cube.select(0);
	}

	protected void handleMetaDataChanged(ServerMetadata smd) {
		datasource.removeAll();
		catalog.removeAll();
		cube.removeAll();
		dstes = smd.discoverDataSources();
		if (dstes == null || dstes.length == 0)
			return;

		String[] dsources = new String[dstes.length];
		for (int i = 0; i < dstes.length; i++)
			dsources[i] = dstes[i].getDataSourceInfo();
		datasource.setItems(dsources);
		datasource.select(0);
	}
	
	@Override
	public String getHelpContextId() {
		return PREFIX.concat("adapter_xmla");
	}
}
