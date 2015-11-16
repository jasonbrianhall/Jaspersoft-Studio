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
package com.jaspersoft.studio.editor.tools.wizards;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.jface.wizard.Wizard;

import com.jaspersoft.studio.editor.tools.MCompositeElement;

/**
 * Wizard used to export one or more composite elements into a folder
 * 
 * @author Orlandin Marco
 *
 */
public class CompositeElementsExportWizard extends Wizard {
	
	/**
	 * The page where the informations will be provided
	 */
	private CompositeElementsExportWizardPage page0;
	
	/**
	 * Create the wizard
	 * 
	 * @param the composite element to export, other element can be selected from this wizard
	 * this is only used to already check to export an element, if it is null no element will be
	 * cheched by default
	 */
	public CompositeElementsExportWizard(MCompositeElement elementToExport) {
		page0 = new CompositeElementsExportWizardPage(elementToExport);
	}
	
	@Override
	public void addPages() {
		addPage(page0);
	}
	
	/**
	 * Doesn't do nothing, all the rest is done by the action
	 */
	@Override
	public boolean performFinish() {
		return true;
	}
	
	/**
	 * Return the list of the elmenets marked for the export at the end of the wizard
	 * 
	 * @return a not null list of composite elements
	 */
	public List<MCompositeElement> getSelectedElements(){
		List<MCompositeElement> result = new ArrayList<MCompositeElement>();
		for(Entry<MCompositeElement, Boolean> selection : page0.getSelection().entrySet()){
			if (selection.getValue()){
				result.add(selection.getKey());
			}
		}
		return result;
	}
}
