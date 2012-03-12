package com.jaspersoft.studio.server.publish;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import net.sf.jasperreports.engine.JRReportTemplate;
import net.sf.jasperreports.engine.design.JRDesignElement;
import net.sf.jasperreports.engine.design.JRDesignImage;
import net.sf.jasperreports.engine.design.JRDesignSubreport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;

import com.jaspersoft.studio.compatibility.JRXmlWriterHelper;
import com.jaspersoft.studio.server.Activator;
import com.jaspersoft.studio.server.model.AFileResource;
import com.jaspersoft.studio.server.model.MReportUnit;
import com.jaspersoft.studio.server.plugin.IPublishContributor;
import com.jaspersoft.studio.utils.FileUtils;
import com.jaspersoft.studio.utils.ModelUtils;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class JrxmlPublishContributor implements IPublishContributor {
	private JasperReportsConfiguration jrConfig;

	public void publishJrxml(MReportUnit mrunit, IProgressMonitor monitor,
			JasperDesign jasper, Set<String> fileset, IFile file,
			String version, JasperReportsConfiguration jrConfig)
			throws Exception {
		init(jrConfig);
		List<JRDesignElement> elements = ModelUtils.getAllElements(jasper);
		for (JRDesignElement ele : elements) {
			if (ele instanceof JRDesignImage)
				publishImage(mrunit, monitor, jasper, fileset, file, ele,
						version);
			else if (ele instanceof JRDesignSubreport) {
				publishSubreport(mrunit, monitor, jasper, fileset, file, ele,
						version);
			} else {
				publishElement(mrunit, monitor, jasper, fileset, file, ele,
						version);
			}
		}
		publishTemplates(mrunit, monitor, jasper, fileset, file, version);
		// here extend and give possibility to contribute to plugins
		Activator.getExtManager().publishJrxml(mrunit, monitor, jasper,
				fileset, file, version, jrConfig);
		saveJRXML(monitor, mrunit, jasper, version);
	}

	protected void publishSubreport(MReportUnit mrunit,
			IProgressMonitor monitor, JasperDesign jasper, Set<String> fileset,
			IFile file, JRDesignElement ele, String version) throws Exception {
		AFileResource fres = srp.publish(jasper, ele, mrunit, monitor, fileset,
				file);
		if (fres == null)
			return;
		JasperDesign jrd = JRXmlLoader.load(fres.getFile());
		if (jrd != null) {
			IFile[] fs = root.findFilesForLocationURI(fres.getFile().toURI());
			if (fs != null && fs.length > 0) {
				publishJrxml(mrunit, monitor, jrd, fileset, fs[0], version,
						jrConfig);
				// saveJRXML(monitor, fres, jrd, version);
			}
		}
	}

	protected void publishElement(MReportUnit mrunit, IProgressMonitor monitor,
			JasperDesign jasper, Set<String> fileset, IFile file,
			JRDesignElement ele, String version) throws Exception {
	}

	protected void publishImage(MReportUnit mrunit, IProgressMonitor monitor,
			JasperDesign jasper, Set<String> fileset, IFile file,
			JRDesignElement ele, String version) throws Exception {
		img.publish(jasper, ele, mrunit, monitor, fileset, file);
	}

	protected void publishTemplates(MReportUnit mrunit,
			IProgressMonitor monitor, JasperDesign jasper, Set<String> fileset,
			IFile file, String version) throws Exception {
		for (JRReportTemplate rt : jasper.getTemplatesList()) {
			style.publish(jasper, rt, mrunit, monitor, fileset, file);
		}
	}

	protected void saveJRXML(IProgressMonitor monitor, AFileResource fres,
			JasperDesign jrd, String version) throws IOException, Exception {
		File f = FileUtils.createTempFile("jrsres", ".jrxml");
		FileUtils.writeFile(f, JRXmlWriterHelper.writeReport(jrd, version));
		fres.setFile(f);

		List<AFileResource> resources = (List<AFileResource>) jrConfig
				.get(JrxmlPublishAction.KEY_PUBLISH2JSS_DATA);
		resources.add(fres);
		// WSClientHelper.saveResource(fres, monitor, false);
	}

	private void init(JasperReportsConfiguration jrConfig) {
		if (style == null)
			style = new ImpStyleTemplate(jrConfig);
		if (img == null)
			img = new ImpImage(jrConfig);
		if (srp == null)
			srp = new ImpSubreport(jrConfig);
	}

	private IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
	private ImpStyleTemplate style;
	private ImpImage img;
	private ImpSubreport srp;
}
