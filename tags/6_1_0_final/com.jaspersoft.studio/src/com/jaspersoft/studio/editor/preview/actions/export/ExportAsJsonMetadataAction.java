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
package com.jaspersoft.studio.editor.preview.actions.export;

import java.io.File;

import net.sf.jasperreports.eclipse.viewer.IReportViewer;
import net.sf.jasperreports.engine.export.JRExportProgressMonitor;
import net.sf.jasperreports.engine.export.JsonMetadataExporter;
import net.sf.jasperreports.export.SimpleJsonMetadataReportConfiguration;
import net.sf.jasperreports.export.SimpleWriterExporterOutput;

import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class ExportAsJsonMetadataAction extends AExportAction {

	public ExportAsJsonMetadataAction(IReportViewer viewer, JasperReportsConfiguration jContext,
			ExportMenuAction parentMenu) {
		super(viewer, jContext, parentMenu);

		setText("Export As JSON Metadata");
		setToolTipText("Export as JSON metadata");

		setFileExtensions(new String[] { "*.json" }); //$NON-NLS-1$
		setFilterNames(new String[] { "JSON (*.json)" });
		setDefaultFileExtension("json"); //$NON-NLS-1$
	}

	@Override
	protected JsonMetadataExporter getExporter(JasperReportsConfiguration jContext, JRExportProgressMonitor monitor,
			File file) {
		JsonMetadataExporter exp = new JsonMetadataExporter(jContext);
		exp.setExporterOutput(new SimpleWriterExporterOutput(file));

		SimpleJsonMetadataReportConfiguration rconf = new SimpleJsonMetadataReportConfiguration();
		setupReportConfiguration(rconf, monitor);
		exp.setConfiguration(rconf);

		return exp;
	}
}
