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
package com.jaspersoft.studio.server.publish;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import net.sf.jasperreports.eclipse.util.FileUtils;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;

import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.server.ServerManager;
import com.jaspersoft.studio.server.WSClientHelper;
import com.jaspersoft.studio.server.export.AExporter;
import com.jaspersoft.studio.server.model.AFileResource;
import com.jaspersoft.studio.server.model.AMJrxmlContainer;
import com.jaspersoft.studio.server.model.MResource;
import com.jaspersoft.studio.server.model.server.MServerProfile;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class FindResources {

	public static boolean find(IProgressMonitor monitor, AMJrxmlContainer mres, JasperDesign jd) throws Exception {
		JasperReportsConfiguration jrConfig = mres.getJasperConfiguration();
		jrConfig.put(PublishUtil.KEY_PUBLISH2JSS_DATA, new ArrayList<AFileResource>());

		String version = ServerManager.getVersion(mres);
		HashSet<String> fileset = new HashSet<String>();
		IFile file = (IFile) jrConfig.get(FileUtils.KEY_FILE);

		mres.removeChildren();

		new JrxmlPublishContributor().publishJrxml(mres, monitor, jd, fileset, file, version);

		Object r = jrConfig.get(PublishUtil.KEY_PUBLISH2JSS_DATA);
		return r != null && r instanceof List && ((List<?>) r).size() > 0;
	}

	public static ANode findReportUnit(MServerProfile mserv, IProgressMonitor monitor, JasperDesign jd) {
		try {
			WSClientHelper.connect(mserv, monitor);
			if (mserv != null) {
				String prunit = jd.getProperty(AExporter.PROP_REPORTUNIT);
				if (prunit != null) {
					WSClientHelper.connectGetData(mserv, monitor);
					// We can try to locate a previous existing Report Unit.
					// If not possible we will popup the selection tree as
					// usual.
					MResource selectedRepoUnit = WSClientHelper.findSelected(mserv.getChildren(), monitor, prunit, mserv.getWsClient());
					if (selectedRepoUnit != null)
						return selectedRepoUnit;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mserv;
	}

}
