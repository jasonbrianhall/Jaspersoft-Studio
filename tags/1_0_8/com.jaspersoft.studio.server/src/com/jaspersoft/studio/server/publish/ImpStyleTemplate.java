/*
 * JasperReports - Free Java Reporting Library. Copyright (C) 2001 - 2012 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of JasperReports.
 * 
 * JasperReports is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * JasperReports is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with JasperReports. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.server.publish;

import java.io.File;
import java.util.Set;

import net.sf.jasperreports.engine.JRReportTemplate;
import net.sf.jasperreports.engine.JRSimpleTemplate;
import net.sf.jasperreports.engine.JRTemplateReference;
import net.sf.jasperreports.engine.design.JRDesignElement;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlTemplateLoader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;

import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.ResourceDescriptor;
import com.jaspersoft.studio.server.model.AFileResource;
import com.jaspersoft.studio.server.model.MRStyleTemplate;
import com.jaspersoft.studio.server.model.MReportUnit;

public class ImpStyleTemplate extends AImpObject {
	private IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

	public File publish(JasperDesign jd, JRReportTemplate img,
			MReportUnit mrunit, IProgressMonitor monitor, Set<String> fileset,
			IFile file) throws Exception {
		File f = findFile(jd, fileset, getExpression(img), file);
		uploadFile(mrunit, monitor, f);

		JRSimpleTemplate jrt = (JRSimpleTemplate) JRXmlTemplateLoader.load(f);
		for (JRTemplateReference r : jrt.getIncludedTemplatesList()) {
			IFile[] fs = root.findFilesForLocationURI(f.toURI());
			if (fs != null && fs.length > 0) {
				File ftr = findFile(file, r.getLocation());
				if (ftr != null && ftr.exists()) {
					fileset.add(ftr.getAbsolutePath());
					uploadFile(mrunit, monitor, ftr);
				}
			}
		}
		return f;
	}

	@Override
	protected ResourceDescriptor createResource(MReportUnit mrunit) {
		return MRStyleTemplate.createDescriptor(mrunit);
	}

	protected JRDesignExpression getExpression(JRReportTemplate img) {
		return (JRDesignExpression) ((JRReportTemplate) img)
				.getSourceExpression();
	}

	@Override
	public AFileResource publish(JasperDesign jd, JRDesignElement img,
			MReportUnit mrunit, IProgressMonitor monitor, Set<String> fileset,
			IFile file) throws Exception {
		return null;
	}

	@Override
	protected JRDesignExpression getExpression(JRDesignElement img) {
		return null;
	}

}
