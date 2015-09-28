/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.property.descriptor.resource;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.help.HelpSystem;
import com.jaspersoft.studio.model.MReport;
import com.jaspersoft.studio.model.dataset.MDataset;
import com.jaspersoft.studio.model.dataset.SelectDefaultDatasetWizard;
import com.jaspersoft.studio.property.descriptor.text.NTextPropertyDescriptor;
import com.jaspersoft.studio.property.section.AbstractSection;
import com.jaspersoft.studio.property.section.widgets.ASPropertyWidget;
import com.jaspersoft.studio.property.section.widgets.SPResourceType;

/**
 * 
 * Widget descriptor with a button to select to provide the path of a Default Data adapter for 
 * JasperReports. It is possible to provide the path by typing it directly or using an advanced select
 * dialog
 * 
 * @author Orlandin Marco
 * 
 */
public class DefaultDatasetPropertyDescriptor extends NTextPropertyDescriptor {

	/**
	 * This class extends the original widget to select a Data Adapter file, when the button is pressed
	 * the dialgo is opened
	 * 
	 * @author Orlandin Marco
	 * 
	 */
	private class SPDatasetWidget extends SPResourceType {

		public SPDatasetWidget(Composite parent, AbstractSection section, IPropertyDescriptor pDescriptor) {
			super(parent, section, pDescriptor);
		}

		@Override
		protected SelectionAdapter buttonPressed() {
			return new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					//the open of the dialog doesn't trigger immediately the lost focus event, so
					//force before to store the current value
					handleTextChanged(section,pDescriptor.getId(), ftext.getText().trim());
					if (section.getElement() instanceof MReport){
						MReport report = (MReport)section.getElement();
						SelectDefaultDatasetWizard defaultDAwizard = new SelectDefaultDatasetWizard(report);
						WizardDialog defaultDAdialog = new WizardDialog(UIUtils.getShell(), defaultDAwizard);
						defaultDAdialog.open();
						ftext.setText(defaultDAwizard.getValue() != null ? defaultDAwizard.getValue() : ""); //$NON-NLS-1$
						handleTextChanged(section,pDescriptor.getId(), defaultDAwizard.getValue());	
					} else if (section.getElement() instanceof MDataset){
						MDataset dataset = (MDataset)section.getElement();
						SelectDefaultDatasetWizard defaultDAwizard = new SelectDefaultDatasetWizard(dataset);
						WizardDialog defaultDAdialog = new WizardDialog(UIUtils.getShell(), defaultDAwizard);
						defaultDAdialog.open();
						ftext.setText(defaultDAwizard.getValue() != null ? defaultDAwizard.getValue() : ""); //$NON-NLS-1$
						handleTextChanged(section,pDescriptor.getId(), defaultDAwizard.getValue());
					}
				}
			};
		}
	};

	public DefaultDatasetPropertyDescriptor(Object id, String displayName) {
		super(id, displayName);
	}

	public CellEditor createPropertyEditor(Composite parent) {
		CellEditor editor =  new TextCellEditor(parent);
		HelpSystem.bindToHelp(this, editor.getControl());
		return editor;
	}

	public ASPropertyWidget createWidget(Composite parent, AbstractSection section) {
		ASPropertyWidget textWidget = new SPDatasetWidget(parent, section, this);
		return textWidget;
	}
	
}
