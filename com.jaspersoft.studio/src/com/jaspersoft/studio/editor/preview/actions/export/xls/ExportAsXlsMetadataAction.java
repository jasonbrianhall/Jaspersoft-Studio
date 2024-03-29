/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.editor.preview.actions.export.xls;

import net.sf.jasperreports.eclipse.viewer.IReportViewer;
import net.sf.jasperreports.engine.export.JExcelApiMetadataExporter;
import net.sf.jasperreports.engine.export.JRExportProgressMonitor;
import net.sf.jasperreports.export.SimpleJxlMetadataReportConfiguration;

import com.jaspersoft.studio.editor.preview.actions.export.ExportMenuAction;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class ExportAsXlsMetadataAction extends AExportXlsAction {

	public ExportAsXlsMetadataAction(IReportViewer viewer, JasperReportsConfiguration jContext,
			ExportMenuAction parentMenu) {
		super(viewer, jContext, parentMenu);

		setText("Export As XLS With Metadata");
		setToolTipText("Export As XLS With Metadata");

		setFileExtensions(new String[] { "*.xls" }); //$NON-NLS-1$
		setFilterNames(new String[] { Messages.ExportAsExcelAPIAction_filternames });
		setDefaultFileExtension("xls"); //$NON-NLS-1$
	}

	@Override
	protected JExcelApiMetadataExporter createExporter(JasperReportsConfiguration jContext,
			JRExportProgressMonitor monitor) {
		JExcelApiMetadataExporter exp = new JExcelApiMetadataExporter(jContext);

		SimpleJxlMetadataReportConfiguration rconf = new SimpleJxlMetadataReportConfiguration();
		setupReportConfiguration(rconf, monitor);
		exp.setConfiguration(rconf);
		return exp;
	}
}
