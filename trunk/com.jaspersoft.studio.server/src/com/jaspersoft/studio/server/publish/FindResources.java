/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.server.publish;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;

import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.ResourceDescriptor;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.server.Activator;
import com.jaspersoft.studio.server.ResourceFactory;
import com.jaspersoft.studio.server.ServerManager;
import com.jaspersoft.studio.server.WSClientHelper;
import com.jaspersoft.studio.server.export.AExporter;
import com.jaspersoft.studio.server.model.AFileResource;
import com.jaspersoft.studio.server.model.AMJrxmlContainer;
import com.jaspersoft.studio.server.model.AMResource;
import com.jaspersoft.studio.server.model.MReportUnit;
import com.jaspersoft.studio.server.model.server.MServerProfile;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

import net.sf.jasperreports.eclipse.util.FileUtils;
import net.sf.jasperreports.eclipse.util.Misc;
import net.sf.jasperreports.engine.design.JasperDesign;

public class FindResources {

	public static boolean find(IProgressMonitor monitor, AMJrxmlContainer mres, JasperDesign jd) throws Exception {
		List<?> r = findResources(monitor, mres, jd);
		return !Misc.isNullOrEmpty(r);
	}

	public static List<?> findResources(IProgressMonitor monitor, AMJrxmlContainer mres, JasperDesign jd)
			throws Exception {
		JasperReportsConfiguration jrConfig = mres.getJasperConfiguration();
		jrConfig.put(PublishUtil.KEY_PUBLISH2JSS_DATA, new ArrayList<AFileResource>());

		String version = ServerManager.getVersion(mres);
		HashSet<String> fileset = new HashSet<String>();
		IFile file = (IFile) jrConfig.get(FileUtils.KEY_FILE);

		mres.removeChildren();

		new JrxmlPublishContributor().publishJrxml(mres, monitor, jd, fileset, file, version);

		Object r = jrConfig.get(PublishUtil.KEY_PUBLISH2JSS_DATA);
		if (r != null && r instanceof List) {
			List<?> resources = (List<?>) r;
			List<AMResource> rs = new ArrayList<AMResource>();
			Map<String, ResourceDescriptor> names = new HashMap<String, ResourceDescriptor>();
			for (Object obj : resources) {
				if (obj instanceof AMResource) {
					AMResource m = (AMResource) obj;
					ResourceDescriptor rd = m.getValue();
					if (names.containsKey(rd.getName())) {
						if (names.get(rd.getName()) == rd) {
							continue;
						} else {
							// renaming
							int i = 0;
							do {
								i++;
								rd.setName(rd.getName() + "_" + i);
								rd.setLabel(rd.getLabel() + "_" + i);
								rd.setUriString(rd.getUriString() + "_" + i);
							} while (names.containsKey(rd.getName()) && i < 10000);
						}
					}
					names.put(rd.getName(), rd);
					rs.add(m);
				}
			}
			jrConfig.put(PublishUtil.KEY_PUBLISH2JSS_DATA, rs);

			return rs;
		}
		return null;
	}

	private static String getReportUnit(String pres) {
		if (Misc.isNullOrEmpty(pres))
			return null;
		String path = FilenameUtils.getFullPath(pres);
		path = path.replaceAll("_files/$", "");
		return path;
	}

	public static ANode findReportUnit(MServerProfile mserv, IProgressMonitor monitor, JasperDesign jd, IFile file) {
		try {
			if (mserv != null) {
				String prunit = jd.getProperty(AExporter.PROP_REPORTUNIT);
				String pres = jd.getProperty(AExporter.PROP_REPORTRESOURCE);
				if (prunit == null && pres != null)
					prunit = getReportUnit(pres);
				if (prunit == null) {
					pres = file.getPersistentProperty(
							new QualifiedName(Activator.PLUGIN_ID, AExporter.PROP_REPORTRESOURCE));
					prunit = getReportUnit(pres);
				}

				String srvURL = jd.getProperty(AExporter.PROP_SERVERURL);
				if (srvURL == null)
					srvURL = file
							.getPersistentProperty(new QualifiedName(Activator.PLUGIN_ID, AExporter.PROP_SERVERURL));
				// String srvUSER = jd.getProperty(AExporter.PROP_USER);
				// if (srvUSER == null)
				// srvUSER = file.getPersistentProperty(new
				// QualifiedName(Activator.PLUGIN_ID, AExporter.PROP_USER));

				if (prunit != null && srvURL != null && mserv.getValue().getUrl().equals(srvURL)) {
					try {
						WSClientHelper.connect(mserv, monitor);
						WSClientHelper.connectGetData(mserv, monitor);
					} catch (Exception e) {
						List<MServerProfile> m = ServerManager.getServerProfiles(jd, mserv.getJasperConfiguration(),
								monitor);
						boolean first = true;
						for (MServerProfile sp : m) {
							if (first) {
								first = false;
								continue;
							}
							try {
								WSClientHelper.connect(sp, monitor);
								WSClientHelper.connectGetData(sp, monitor);
								mserv = sp;
								break;
							} catch (Exception e1) {

							}
						}
					}
					// We can try to locate a previous existing Report Unit.
					// If not possible we will popup the selection tree as
					// usual.
					AMResource selectedRepoUnit = WSClientHelper.findSelected(mserv.getChildren(), monitor, prunit,
							mserv.getWsClient(monitor));
					if (selectedRepoUnit != null) {
						if (pres != null && !pres.equals(prunit) && selectedRepoUnit instanceof MReportUnit) {
							selectedRepoUnit.removeChildren();
							ANode parent = selectedRepoUnit;
							for (ResourceDescriptor r : selectedRepoUnit.getValue().getChildren()) {
								AMResource mr = ResourceFactory.getResource(parent, r, -1);
								if (r.getUriString() != null && r.getUriString().equals(pres) && !r.isMainReport())
									selectedRepoUnit = mr;
							}
						}
						return selectedRepoUnit;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mserv;
	}

}
