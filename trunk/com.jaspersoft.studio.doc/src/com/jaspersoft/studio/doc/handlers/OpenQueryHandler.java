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
package com.jaspersoft.studio.doc.handlers;

import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;

import com.jaspersoft.studio.doc.messages.Messages;
import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.model.MQuery;
import com.jaspersoft.studio.model.dataset.MDataset;
import com.jaspersoft.studio.property.dataset.dialog.DatasetDialog;
import com.jaspersoft.studio.property.descriptor.pattern.dialog.PatternEditor;

/**
 * Open the edit query dialog of a report or a message dialog if the query dialog isn't available for the 
 * opened element (for example a style reference file).
 * 
 * @author Orlandin Marco
 *
 */
public class OpenQueryHandler extends Action{

	@Override
	public void run() {
		APropertyNode reportRoot = HandlersUtil.getRootElement();
		if (reportRoot != null){
			MDataset mdataset = (MDataset)reportRoot.getPropertyValue(JasperDesign.PROPERTY_MAIN_DATASET);
			MQuery mquery = (MQuery)mdataset.getPropertyValue(JRDesignDataset.PROPERTY_QUERY);
			PatternEditor wizard = new PatternEditor();
			wizard.setValue(mquery.getPropertyValue(JRDesignQuery.PROPERTY_TEXT).toString());
			DatasetDialog dlg = new DatasetDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), mdataset, mquery.getJasperConfiguration());
			dlg.open();
		} else 
			MessageDialog.openWarning(PlatformUI.getWorkbench().getDisplay().getActiveShell(), Messages.OpenQueryHandler_message_title, Messages.OpenQueryHandler_message_text);
	}
}
