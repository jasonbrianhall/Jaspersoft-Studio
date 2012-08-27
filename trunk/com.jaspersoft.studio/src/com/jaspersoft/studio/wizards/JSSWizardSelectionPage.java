/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer.
 * Copyright (C) 2005 - 2010 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of Jaspersoft Open Studio.
 *
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Jaspersoft Open Studio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Jaspersoft Open Studio. If not, see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardNode;
import org.eclipse.jface.wizard.IWizardPage;

import com.jaspersoft.studio.property.dataset.wizard.DatasetWizard;
import com.jaspersoft.studio.property.dataset.wizard.WizardDatasetPage;

public abstract class JSSWizardSelectionPage extends JSSWizardPage {

	/**
	 * The selected node; <code>null</code> if none.
	 */
	private IWizardNode selectedNode = null;

	/**
	 * List of wizard nodes that have cropped up in the past (element type: <code>IWizardNode</code>).
	 */
	private List<IWizardNode> selectedWizardNodes = new ArrayList<IWizardNode>();

	/**
	 * Creates a new wizard selection page with the given name, and with no title or image.
	 * 
	 * @param pageName
	 *          the name of the page
	 */
	protected JSSWizardSelectionPage(String pageName) {
		super(pageName);
	}

	/**
	 * Adds the given wizard node to the list of selected nodes if it is not already in the list.
	 * 
	 * @param node
	 *          the wizard node, or <code>null</code>
	 */
	private void addSelectedNode(IWizardNode node) {
		if (node == null) {
			return;
		}

		if (selectedWizardNodes.contains(node)) {
			return;
		}

		selectedWizardNodes.add(node);
	}

	/**
	 * The <code>WizardSelectionPage</code> implementation of this <code>IWizardPage</code> method returns
	 * <code>true</code> if there is a selected node.
	 */
	@Override
	public boolean canFlipToNextPage() {
		if (selectedNode != null)
			return true;
		return super.canFlipToNextPage();
	}

	/**
	 * The <code>WizardSelectionPage</code> implementation of an <code>IDialogPage</code> method disposes of all nested
	 * wizards. Subclasses may extend.
	 */
	@Override
	public void dispose() {
		super.dispose();
		// notify nested wizards
		for (int i = 0; i < selectedWizardNodes.size(); i++) {
			((IWizardNode) selectedWizardNodes.get(i)).dispose();
		}
	}

	/**
	 * The <code>WizardSelectionPage</code> implementation of this <code>IWizardPage</code> method returns the first page
	 * of the currently selected wizard if there is one.
	 */
	@Override
	public IWizardPage getNextPage() {
		if (selectedNode == null) {
			return super.getNextPage();
		}

		boolean isCreated = selectedNode.isContentCreated();

		IWizard wizard = selectedNode.getWizard();

		if (wizard == null) {
			setSelectedNode(null);
			return null;
		}

		if (!isCreated) {
			// Allow the wizard to create its pages
			wizard.addPages();
		}

		return wizard.getStartingPage();
	}

	/**
	 * Returns the currently selected wizard node within this page.
	 * 
	 * @return the wizard node, or <code>null</code> if no node is selected
	 */
	public IWizardNode getSelectedNode() {
		return selectedNode;
	}

	/**
	 * Sets or clears the currently selected wizard node within this page.
	 * 
	 * @param node
	 *          the wizard node, or <code>null</code> to clear
	 */
	protected void setSelectedNode(IWizardNode node) {
		addSelectedNode(node);
		selectedNode = node;
		if (isCurrentPage()) {
			getContainer().updateButtons();
		}
	}
	
	
}