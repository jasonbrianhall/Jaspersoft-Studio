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
package com.jaspersoft.studio.wizards.group;

import org.eclipse.jface.wizard.IWizardPage;

import com.jaspersoft.studio.templates.JrxmlTemplateBundle;
import com.jaspersoft.studio.wizards.CongratulationsWizardPage;
import com.jaspersoft.studio.wizards.ReportNewWizard;

/**
 * Page to choose the groups during the creation of a report template
 * 
 * @author Orlandin Marco
 *
 */
public class ReportWizardFieldsGroupByDynamicPage extends StaticWizardFieldsGroupByPage {
	
	/**
	 * The template bundle where this page is contained
	 */
	private JrxmlTemplateBundle containerBundle;

	/**
	 * Create the page
	 * 
	 * @param containerBundle The template bundle where this page is contained
	 */
	public ReportWizardFieldsGroupByDynamicPage(JrxmlTemplateBundle containerBundle) {
		super();
		this.containerBundle = containerBundle;
	}

	/**
	 * Return the congratulation page if it is available
	 * 
	 * @return the congratulation page or null if the congratulation page
	 * shouldn't be displayed
	 */
	@Override
	public IWizardPage getNextPage() {
		CongratulationsWizardPage congratPage = ((ReportNewWizard)getWizard()).getCongratulationsStep();
		congratPage.setWizard(getWizard());
		return (congratPage);
	}
	
	/**
	 * Return the second dynamic page
	 * 
	 * @return the page to configure the fields
	 */
	@Override
	public IWizardPage getPreviousPage() {
		containerBundle.getStep2().setWizard(getWizard());
		return containerBundle.getStep2();
	}
	
	/**
	 * To advance to the next page the page must have a status complete
	 * and there must be the congratulation page
	 */
	@Override
	public boolean canFlipToNextPage() {
		ReportNewWizard container = (ReportNewWizard)getWizard();
		return isPageComplete() && container.hasCongratulationStep();
	}
}
