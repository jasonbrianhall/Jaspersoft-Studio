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
package com.jaspersoft.studio.data.sql;

import java.lang.reflect.InvocationTargetException;

import net.sf.jasperreports.data.DataAdapterServiceUtil;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.xtext.ui.editor.model.XtextDocument;

import com.google.inject.Injector;
import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.data.designer.UndoRedoImpl;
import com.jaspersoft.studio.data.jdbc.JDBCDataAdapterDescriptor;
import com.jaspersoft.studio.data.querydesigner.sql.SimpleSQLQueryDesigner;
import com.jaspersoft.studio.data.sql.ui.DBMetadata;
import com.jaspersoft.studio.data.sql.ui.SQLQueryOutline;
import com.jaspersoft.studio.data.ui.internal.SqlActivator;
import com.jaspersoft.studio.preferences.fonts.utils.FontUtils;
import com.jaspersoft.studio.swt.widgets.CSashForm;

import de.itemis.xtext.utils.jface.viewers.StyledTextXtextAdapter;
import de.itemis.xtext.utils.jface.viewers.context.IXtextFakeContextResourcesProvider;

public class SQLQueryDesigner extends SimpleSQLQueryDesigner {
	private SashForm sf;
	private DBMetadata dbMetadata;
	private JSSStyledTextXtextAdapter xtextAdapter;
	private Injector injector;
	private TextViewer tv;
	private IDocument document;
	private SQLQueryOutline outline;

	public SQLQueryDesigner() {
		super();
	}

	@Override
	public Control getControl() {
		return sf;
	}

	@Override
	public Control createControl(Composite parent) {
		injector = SqlActivator.getInstance().getInjector(SqlActivator.COM_JASPERSOFT_STUDIO_DATA_SQL);
		sf = new CSashForm(parent, SWT.HORIZONTAL);
		sf.setLayoutData(new GridData(GridData.FILL_BOTH));
		sf.setLayout(new GridLayout());

		dbMetadata = new DBMetadata();
		Control c = dbMetadata.createControl(sf);
		c.setLayoutData(new GridData(GridData.FILL_VERTICAL));

		CTabFolder tabFolder = new CTabFolder(sf, SWT.FLAT | SWT.BOTTOM);
		tabFolder.setLayoutData(new GridData(GridData.FILL_VERTICAL));

		createSource(tabFolder);
		createOutline(tabFolder);

		tabFolder.setSelection(0);

		sf.setWeights(new int[] { 250, 750 });
		return sf;
	}

	protected void createOutline(CTabFolder tabFolder) {
		CTabItem bptab = new CTabItem(tabFolder, SWT.NONE);
		bptab.setText("Outline");

		outline = new SQLQueryOutline(injector);
		injector.injectMembers(outline);
		outline.setSourceViewer(tv);
		bptab.setControl(outline.createOutline(tabFolder));

	}

	private void createSource(CTabFolder tabFolder) {
		CTabItem bptab = new CTabItem(tabFolder, SWT.NONE);
		bptab.setText("Text");
		tv = new TextViewer(tabFolder, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);

		control = tv.getTextWidget();
		control.addModifyListener(new QueryListener());
		control.setFont(FontUtils.getEditorsFont(jConfig));
		undoHandlrer = new UndoRedoImpl(control);

		xtextAdapter = new JSSStyledTextXtextAdapter(injector);
		xtextAdapter.adapt(control);
		control.setLayoutData(new GridData(GridData.FILL_VERTICAL));

		document = xtextAdapter.getXtextDocument();
		tv.setDocument(document);

		bptab.setControl(control);
	}

	@Override
	protected void updateQueryText(String txt) {
		document.set(txt);
	}

	@Override
	public void setDataAdapter(final DataAdapterDescriptor da) {
		super.setDataAdapter(da);
		if (da instanceof JDBCDataAdapterDescriptor) {
			try {
				container.run(true, true, new IRunnableWithProgress() {

					public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						dbMetadata.updateUI(DataAdapterServiceUtil.getInstance(jConfig).getService(da.getDataAdapter()));
					}
				});
			} catch (InvocationTargetException ex) {
				container.getQueryStatus().showError(ex.getTargetException());
			} catch (InterruptedException ex) {
				container.getQueryStatus().showError(ex);
			}
		}
	}

	public class JSSStyledTextXtextAdapter extends StyledTextXtextAdapter {

		public JSSStyledTextXtextAdapter(Injector injector, IXtextFakeContextResourcesProvider contextFakeResourceProvider) {
			super(injector, contextFakeResourceProvider);
		}

		public JSSStyledTextXtextAdapter(Injector injector) {
			super(injector);
		}

		@Override
		public XtextDocument getXtextDocument() {
			return super.getXtextDocument();
		}
	};

	@Override
	public void dispose() {
		outline.dispose();
		super.dispose();
	}
}
