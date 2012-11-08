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
package com.jaspersoft.studio.editor.preview.view.report.swt.action;

import java.text.MessageFormat;
import java.util.EventObject;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

import com.jaspersoft.studio.editor.preview.view.report.swt.IReportViewer;
import com.jaspersoft.studio.editor.preview.view.report.swt.IReportViewerListener;

public class PageNumberContributionItem extends ContributionItem implements IReportViewerListener, Listener {

	private IReportViewer viewer;

	private Text text;

	private ToolItem toolitem;

	/**
	 * Constructs the action by specifying the report viewer to associate with the item.
	 * 
	 * @param viewer
	 *          the report viewer
	 */
	public PageNumberContributionItem(IReportViewer viewer) {
		Assert.isNotNull(viewer);
		this.viewer = viewer;
		this.viewer.addReportViewerListener(this);
		refresh();
	}

	void refresh() {
		if (text == null || text.isDisposed())
			return;
		try {
			if (!viewer.hasDocument()) {
				text.setEnabled(false);
				text.setText(""); //$NON-NLS-1$
			} else {
				text.removeListener(SWT.DefaultSelection, this);
				text.setText(getPageMofNText());
				text.setEnabled(true);
				text.addListener(SWT.DefaultSelection, this);
			}
		} catch (SWTException exception) {
			if (!SWT.getPlatform().equals("gtk")) //$NON-NLS-1$
				throw exception;
		}
	}

	private Control createControl(Composite parent) {
		text = new Text(parent, SWT.BORDER | SWT.CENTER);
		text.setText(formatPageMofN(888, 888));
		text.addListener(SWT.DefaultSelection, this);

		refresh();
		text.pack();
		return text;
	}

	private static String formatPageMofN(int m, int n) {
		return MessageFormat.format("Page {0} of {1}", new Object[] { //$NON-NLS-1$
				new Integer(m), new Integer(n) });
	}

	public void dispose() {
		viewer.removeReportViewerListener(this);
		text = null;
		viewer = null;
	}

	public final void fill(Composite parent) {
		createControl(parent);
	}

	public final void fill(Menu parent, int index) {
		Assert.isTrue(false, "Can't add page number to a menu");//$NON-NLS-1$
	}

	public void fill(ToolBar parent, int index) {
		toolitem = new ToolItem(parent, SWT.SEPARATOR, index);
		Control control = createControl(parent);
		toolitem.setWidth(control.getSize().x);
		toolitem.setControl(control);
	}

	private void onSelection() {
		if (viewer.hasDocument()) {
			setPageAsText(text.getText());
		}
	}

	private void setPageAsText(String pageText) {
		try {
			final int pageIndex = Integer.parseInt(pageText) - 1;
			BusyIndicator.showWhile(null, new Runnable() {
				public void run() {
					viewer.setPageIndex(pageIndex);
				}
			});
		} catch (NumberFormatException e) {
			Display.getCurrent().beep();
		}

		text.removeListener(SWT.DefaultSelection, this);
		text.setText(getPageMofNText());
		text.addListener(SWT.DefaultSelection, this);

	}

	private String getPageMofNText() {
		return formatPageMofN(viewer.getPageIndex() + 1, viewer.getDocument().getPages().size());
	}

	public void viewerStateChanged(EventObject evt) {
		refresh();
	}

	public void handleEvent(Event event) {
		switch (event.type) {
		case SWT.Selection:
		case SWT.DefaultSelection:
			onSelection();
			break;
		}
	}
}
