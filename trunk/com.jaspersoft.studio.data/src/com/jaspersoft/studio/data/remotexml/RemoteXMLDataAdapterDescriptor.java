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
package com.jaspersoft.studio.data.remotexml;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.data.DataAdapter;
import net.sf.jasperreports.data.DataAdapterService;
import net.sf.jasperreports.data.xml.RemoteXmlDataAdapter;
import net.sf.jasperreports.data.xml.RemoteXmlDataAdapterImpl;
import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.engine.JRDataset;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JRDesignField;
import net.sf.jasperreports.engine.util.JRXmlUtils;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.w3c.dom.Document;

import com.jaspersoft.studio.data.AWizardDataEditorComposite;
import com.jaspersoft.studio.data.Activator;
import com.jaspersoft.studio.data.DataAdapterEditor;
import com.jaspersoft.studio.data.IWizardDataEditorProvider;
import com.jaspersoft.studio.data.fields.IFieldsProvider;
import com.jaspersoft.studio.data.xml.XMLDataAdapterDescriptor;
import com.jaspersoft.studio.utils.XMLUtils;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class RemoteXMLDataAdapterDescriptor extends XMLDataAdapterDescriptor implements IFieldsProvider,IWizardDataEditorProvider
{
	private RemoteXmlDataAdapter remoteXmlDataAdapter = new RemoteXmlDataAdapterImpl();
	
	@Override
	public DataAdapter getDataAdapter() {
		return remoteXmlDataAdapter;
	}

	@Override
	public void setDataAdapter(DataAdapter dataAdapter) {
		this.remoteXmlDataAdapter = (RemoteXmlDataAdapter)dataAdapter;
	}

	@Override
	public DataAdapterEditor getEditor() {
		return new RemoteXMLDataAdapterEditor();
	}
	
	/* (non-Javadoc)
	 * @see com.jaspersoft.studio.data.DataAdapterFactory#getIcon(int)
	 */
	@Override
	public Image getIcon(int size) {
		// TODO Auto-generated method stub
		if (size == 16)
		{
			return  Activator.getDefault().getImage("icons/blue-document-code.png"); //$NON-NLS-1$
		}
		return null;
	}

	@Override
	public List<JRDesignField> getFields(DataAdapterService con,
			JasperReportsConfiguration jConfig, JRDataset jDataset)
			throws JRException, UnsupportedOperationException {
		Throwable t=null;
		ArrayList<JRDesignField> fields = new ArrayList<JRDesignField>();
		try {
			String fileName = remoteXmlDataAdapter.getFileName();
			Document doc=JRXmlUtils.parse(new URL(fileName),XMLUtils.isNamespaceAware(remoteXmlDataAdapter, jConfig.getJasperDesign()));	
			fields.addAll(getFieldsFromDocument(doc, jConfig, jDataset));
		} catch (IOException e) {
			t=e;
		} 

		if(t!=null){
			UIUtils.showError(t);
		}
		return fields;
	}

	@Override
	public AWizardDataEditorComposite createDataEditorComposite(
			Composite parent, WizardPage page) {
		return new RemoteXMLWizardDataEditorComposite(parent, page, this);
	}
	
}
