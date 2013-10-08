package com.jaspersoft.studio.server.publish;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.data.DataAdapterParameterContributorFactory;
import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.eclipse.util.FileExtension;
import net.sf.jasperreports.eclipse.util.FileUtils;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.ResourceDescriptor;
import com.jaspersoft.studio.compatibility.JRXmlWriterHelper;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.server.ServerManager;
import com.jaspersoft.studio.server.WSClientHelper;
import com.jaspersoft.studio.server.export.AExporter;
import com.jaspersoft.studio.server.model.AMJrxmlContainer;
import com.jaspersoft.studio.server.model.MFolder;
import com.jaspersoft.studio.server.model.MJrxml;
import com.jaspersoft.studio.server.model.MReportUnit;
import com.jaspersoft.studio.server.model.MResource;
import com.jaspersoft.studio.server.model.server.MServerProfile;
import com.jaspersoft.studio.utils.Misc;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class Publish {
	private JasperReportsConfiguration jrConfig;
	private List<String> resources = new ArrayList<String>();

	public Publish(JasperReportsConfiguration jrConfig) {
		this.jrConfig = jrConfig;
	}

	public IStatus publish(AMJrxmlContainer node, JasperDesign jd, IProgressMonitor monitor) {
		try {
			publishResources(monitor, jd, node);
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;
			// UIUtils.showInformation(Messages.JrxmlPublishAction_successpublishing);

			String str = "Success!\nThe following resources where published on the JasperReports Server:\n";
			for (String mres : resources)
				str += mres + "\n";
			UIUtils.showInformation(str);

			// refresh
			jrConfig.get(PublishUtil.KEY_PUBLISH2JSS_DATA);
			// clean
			jrConfig.remove(PublishUtil.KEY_PUBLISH2JSS_DATA);
			if (node instanceof MJrxml)
				postProcessLocal((MJrxml) node);
			else if (node instanceof MReportUnit) {
				for (INode n : node.getChildren())
					if (n instanceof MJrxml) {
						postProcessLocal((MJrxml) n);
						break;
					}
			}
			ServerManager.selectIfExists(monitor, node);
		} catch (Exception e) {
			UIUtils.showError(e);
		}
		return Status.OK_STATUS;
	}

	private IStatus publishResources(IProgressMonitor monitor, JasperDesign jd, AMJrxmlContainer parent) throws Exception {
		MReportUnit mrunit = null;
		MJrxml jrxml = null;
		if (parent instanceof MReportUnit) {
			mrunit = (MReportUnit) parent;
			jrxml = new MJrxml(mrunit, PublishUtil.getMainReport(mrunit, jd), 0);
		} else if (parent.getParent() instanceof MReportUnit) {
			jrxml = (MJrxml) parent;
			mrunit = (MReportUnit) parent.getParent();
		} else if (parent.getParent() instanceof MFolder) {
			jrxml = (MJrxml) parent;
		} else
			return Status.CANCEL_STATUS;

		File file = FileUtils.createTempFile("jrsres", FileExtension.PointJRXML); //$NON-NLS-1$ 
		String version = ServerManager.getVersion(Misc.nvl(mrunit, jrxml));

		List<MResource> files = ((JasperReportsConfiguration) jrConfig).get(PublishUtil.KEY_PUBLISH2JSS_DATA, new ArrayList<MResource>());
		for (MResource f : files) {
			PublishOptions popt = f.getPublishOptions();
			if (popt.isOverwrite() && popt.getjExpression() != null) {
				if (popt.getPublishMethod() == ResourcePublishMethod.REWRITEEXPRESSION)
					popt.getjExpression().setText(popt.getRepoExpression());
				else if (popt.getPublishMethod() == ResourcePublishMethod.LOCAL)
					popt.getjExpression().setText(popt.getExpression());
			} else if (popt.isOverwrite() && popt.getDataset() != null) {
				String dauri = f.getValue().getUriString();
				if (popt.getPublishMethod() != null)
					if (popt.getPublishMethod() == ResourcePublishMethod.REFERENCE) {
						dauri = popt.getReferencedResource().getUriString();
					} else if (popt.getPublishMethod() == ResourcePublishMethod.RESOURCE) {
						if (popt.getReferencedResource() == null)
							continue;
						ResourceDescriptor rd = f.getValue();
						dauri = popt.getReferencedResource().getUriString() + rd.getName();
					}
				popt.getDataset().setProperty(DataAdapterParameterContributorFactory.PROPERTY_DATA_ADAPTER_LOCATION, "repo:" + dauri);
			}
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;
		}
		FileUtils.writeFile(file, JRXmlWriterHelper.writeReport(jrConfig, jd, version));
		jrxml.setFile(file);
		if (mrunit != null) {
			mrunit.setFile(file);
			mrunit.getValue().getChildren().add(jrxml.getValue());
			if (parent instanceof MReportUnit)
				mrunit.setValue(saveResource(monitor, mrunit));
		}
		jrxml.setValue(saveResource(monitor, jrxml));

		IFile ifile = (IFile) jrConfig.get(FileUtils.KEY_FILE);

		PublishUtil.savePreferences(ifile, files);
		for (MResource f : files) {
			PublishOptions popt = f.getPublishOptions();
			if (popt.isOverwrite()) {
				if (popt.getPublishMethod() != null)
					if (popt.getPublishMethod() == ResourcePublishMethod.REFERENCE) {
						ResourceDescriptor rd = f.getValue();
						ResourceDescriptor ref = new ResourceDescriptor();
						ref.setName(rd.getName());
						ref.setLabel(rd.getLabel());
						ref.setDescription(rd.getDescription());
						ref.setIsReference(false);
						ref.setReferenceUri(popt.getReferencedResource().getUriString());
						ref.setParentFolder(rd.getParentFolder());
						ref.setUriString(rd.getUriString());
						ref.setWsType(ResourceDescriptor.TYPE_REFERENCE);

						f.setValue(ref);
					} else if (popt.getPublishMethod() == ResourcePublishMethod.RESOURCE) {
						if (popt.getReferencedResource() == null)
							continue;
						ResourceDescriptor rd = f.getValue();
						rd.setParentFolder(popt.getReferencedResource().getUriString());
						rd.setUriString(rd.getParentFolder() + rd.getName());
					} else if (popt.getPublishMethod() == ResourcePublishMethod.REWRITEEXPRESSION) {
						;
					} else if (f instanceof MJrxml) {
						MJrxml mJrxml = (MJrxml) f;
						FileUtils.writeFile(mJrxml.getFile(), JRXmlWriterHelper.writeReport(jrConfig, mJrxml.getJd(), version));
					}
				saveResource(monitor, f);
				PublishUtil.savePreferencesNoOverwrite(ifile, f);
			}
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;
		}
		return Status.OK_STATUS;
	}

	private ResourceDescriptor saveResource(IProgressMonitor monitor, MResource mres) throws Exception {
		String uri = mres.getValue().getUriString();
		ResourceDescriptor rd = WSClientHelper.save(monitor, mres);
		if (rd != null)
			resources.add(Misc.nvl(uri, rd.getUriString()));
		return rd;
	}

	private void postProcessLocal(MJrxml node) {
		JasperDesign rpt = jrConfig.getJasperDesign();
		INode n = node.getRoot();
		if (n != null && n instanceof MServerProfile) {
			MServerProfile server = (MServerProfile) n;
			rpt.setProperty(AExporter.PROP_SERVERURL, server.getValue().getUrl());
		}
		ResourceDescriptor rd = node.getValue();
		if (rd.getWsType().equals(ResourceDescriptor.TYPE_REPORTUNIT))
			for (Object r : rd.getChildren())
				if (((ResourceDescriptor) r).getWsType().equals(ResourceDescriptor.TYPE_JRXML)) {
					rd = (ResourceDescriptor) r;
					break;
				}
		rpt.setProperty(AExporter.PROP_REPORTRESOURCE, rd.getUriString());
		if (node.getParent() instanceof MReportUnit) {
			MReportUnit mrunit = (MReportUnit) node.getParent();
			rpt.setProperty(AExporter.PROP_REPORTUNIT, mrunit.getValue().getUriString());
		}
		try {
			AExporter.setServerLocation(node, (IFile) jrConfig.get(FileUtils.KEY_FILE));
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
}
