/*******************************************************************************
 * Copyright (C) 2010 - 2013 Jaspersoft Corporation. All rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jaspersoft Studio Team - initial API and implementation
 ******************************************************************************/
package com.jaspersoft.studio.editor.preview;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.part.PageBookView;

import com.jaspersoft.studio.editor.JrxmlEditor;

public class ReportStateView extends PageBookView {
	public static final String ID = "com.jaspersoft.studio.editor.preview.reportstate";

	@Override
	protected IPage createDefaultPage(PageBook book) {
		ReportStatePage page = new ReportStatePage(null);
		initPage(page);
		page.createControl(book);
		return page;
	}

	@Override
	protected PageRec doCreatePage(IWorkbenchPart part) {
		PreviewJRPrint preview = null;
		if (part instanceof PreviewJRPrint) {
			preview = (PreviewJRPrint) part;
		} else if (part instanceof JrxmlEditor) {
			preview = (PreviewJRPrint) ((JrxmlEditor) part).getEditor(JrxmlEditor.PAGE_PREVIEW);
		} else {
			throw new RuntimeException("Unsupported WorkbenchPart: " + part.toString());
		}
		ReportStatePage page = new ReportStatePage(preview.getConsole());
		initPage(page);
		page.createControl(getPageBook());
		return new PageRec(part, page);
	}

	@Override
	protected void doDestroyPage(IWorkbenchPart part, PageRec pageRecord) {
		pageRecord.page.dispose();
	}

	@Override
	protected IWorkbenchPart getBootstrapPart() {
		IWorkbenchPage page = getSite().getPage();
		if (page != null) {
			// check whether the active part is important to us
			IWorkbenchPart activePart = page.getActivePart();
			return isImportant(activePart) ? activePart : null;
		}
		return null;
	}

	@Override
	protected boolean isImportant(IWorkbenchPart part) {
		if (part instanceof JrxmlEditor || part instanceof PreviewJRPrint)
			return true;
		return false;
	}

}
