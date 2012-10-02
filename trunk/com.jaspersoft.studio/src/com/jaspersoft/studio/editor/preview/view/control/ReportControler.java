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
package com.jaspersoft.studio.editor.preview.view.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import net.sf.jasperreports.eclipse.builder.JasperReportCompiler;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.fill.AsynchronousFillHandle;
import net.sf.jasperreports.engine.fill.AsynchronousFilllListener;
import net.sf.jasperreports.engine.fill.FillListener;
import net.sf.jasperreports.engine.scriptlets.ScriptletFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IFileEditorInput;

import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.data.adapter.DataAdapterParameterContributorFactory;
import com.jaspersoft.studio.editor.preview.PreviewContainer;
import com.jaspersoft.studio.editor.preview.actions.RunStopAction;
import com.jaspersoft.studio.editor.preview.input.BigNumericInput;
import com.jaspersoft.studio.editor.preview.input.BooleanInput;
import com.jaspersoft.studio.editor.preview.input.DateInput;
import com.jaspersoft.studio.editor.preview.input.IDataInput;
import com.jaspersoft.studio.editor.preview.input.ImageInput;
import com.jaspersoft.studio.editor.preview.input.LocaleInput;
import com.jaspersoft.studio.editor.preview.input.TextInput;
import com.jaspersoft.studio.editor.preview.input.TimeZoneInput;
import com.jaspersoft.studio.editor.preview.jive.Context;
import com.jaspersoft.studio.editor.preview.jive.JettyUtil;
import com.jaspersoft.studio.editor.preview.jive.servlet.SReportServlet;
import com.jaspersoft.studio.editor.preview.stats.RecordCountScriptletFactory;
import com.jaspersoft.studio.editor.preview.stats.Statistics;
import com.jaspersoft.studio.editor.preview.view.APreview;
import com.jaspersoft.studio.editor.preview.view.report.IJRPrintable;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.preferences.virtualizer.VirtualizerHelper;
import com.jaspersoft.studio.utils.Console;
import com.jaspersoft.studio.utils.ModelUtils;
import com.jaspersoft.studio.utils.UIUtils;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class ReportControler {

	public static final String ST_RECORDCOUNTER = "RECORDCOUNTER"; //$NON-NLS-1$

	public static final String ST_PAGECOUNT = "PAGECOUNT"; //$NON-NLS-1$

	public static final String ST_FILLINGTIME = "FILLINGTIME"; //$NON-NLS-1$

	public static final String ST_COMPILATIONTIME = "COMPILATIONTIME"; //$NON-NLS-1$

	public static final String ST_REPORTEXECUTIONTIME = "REPORTEXECUTIONTIME"; //$NON-NLS-1$

	public static final String FORM_SORTING = Messages.ReportControler_sortoptiontitle;
	public static final String FORM_EXPORTER = Messages.ReportControler_exportertitle;

	public static final String FORM_REPORT_PARAMETERS = Messages.ReportControler_reportparameterstitle;
	public static final String FORM_PARAMETERS = Messages.ReportControler_inputparameterstitle;

	public static List<IDataInput> inputs = new ArrayList<IDataInput>();
	static {
		inputs.add(new BooleanInput());
		inputs.add(new TextInput());
		inputs.add(new LocaleInput());
		inputs.add(new TimeZoneInput());
		inputs.add(new BigNumericInput());
		inputs.add(new DateInput());
		inputs.add(new ImageInput());
	}

	private List<JRParameter> prompts;
	private Map<String, Object> jasperParameters;
	private LinkedHashMap<String, APreview> viewmap;
	private PreviewContainer pcontainer;
	private JasperReportsConfiguration jrContext;

	public ReportControler(PreviewContainer pcontainer, JasperReportsConfiguration jrContext) {
		this.pcontainer = pcontainer;
		setJrContext(jrContext);
	}

	public JasperReportsConfiguration getJrContext() {
		return jrContext;
	}

	public void setJrContext(JasperReportsConfiguration jrContext) {
		this.jrContext = jrContext;
		if (jrContext.getJasperDesign() != null)
			prompts = jrContext.getJasperDesign().getParametersList();
		setParameters();
		if (viewmap != null)
			fillForms();
	}

	public void resetParametersToDefault() {
		prmInput.setupDefaultValues();
	}

	private void setParameters() {
		if (jasperParameters == null)
			jasperParameters = new HashMap<String, Object>();
		else {
			Map<String, Object> map = new HashMap<String, Object>();
			List<JRParameter> prm = jrContext.getJasperDesign().getParametersList();
			for (JRParameter p : prm) {
				Object obj = jasperParameters.get(p.getName());
				if (obj != null && obj.getClass().equals(p.getValueClass()))
					map.put(p.getName(), obj);
			}
			jasperParameters.clear();
			jasperParameters.putAll(map);
		}
		jrContext.setJRParameters(jasperParameters);
	}

	public LinkedHashMap<String, APreview> createControls(Composite composite) {
		viewmap = new LinkedHashMap<String, APreview>();
		viewmap.put(FORM_PARAMETERS, new VParameters(composite, jrContext));
		viewmap.put(FORM_REPORT_PARAMETERS, new VReportParameters(composite, jrContext));
		viewmap.put(FORM_SORTING, new VSorting(composite, jrContext));
		viewmap.put(FORM_EXPORTER, new VExporter(composite, jrContext));
		return viewmap;
	}

	private void fillForms() {
		prmInput = (VParameters) viewmap.get(FORM_PARAMETERS);
		prmInput.createInputControls(prompts, jasperParameters);

		VReportParameters prmRepInput = (VReportParameters) viewmap.get(FORM_REPORT_PARAMETERS);
		prmRepInput.createInputControls(prompts, jasperParameters);

		VSorting vs = (VSorting) viewmap.get(FORM_SORTING);
		vs.setJasperReports(jrContext.getJasperDesign(), prompts, jasperParameters);
	}

	public void viewerChanged(APreview view) {
		VExporter vs = (VExporter) viewmap.get(FORM_EXPORTER);
		vs.setPreferencesPage(view);
	}

	private Console c;

	public void runReport() {
		VSimpleErrorPreview errorView = pcontainer.getErrorView();
		pcontainer.getRightContainer().switchView(null, errorView);
		errorView.setMessage("Starting new report, please wait ...");

		c = pcontainer.getConsole();
		c.showConsole();
		c.clearConsole();
		if (pcontainer.getMode().equals(RunStopAction.MODERUN_LOCAL))
			pcontainer.setJasperPrint(null, null);
		// jasperParameters.clear();
		fillError = null;
		stats = new Statistics();
		stats.startCount(ST_REPORTEXECUTIONTIME);
		c.addMessage(Messages.ReportControler_stats_start);

		pcontainer.setNotRunning(false);
		runJob(pcontainer);
	}

	public void finishReport(final PreviewContainer pcontainer) {
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				c.addMessage(Messages.ReportControler_msg_reportfinished);
				pcontainer.setNotRunning(true);
				boolean notprmfiled = !prmInput.checkFieldsFilled();
				if (notprmfiled) {
					c.addMessage(Messages.ReportControler_msg_fillparameters);
					VSimpleErrorPreview errorView = pcontainer.getErrorView();
					pcontainer.getRightContainer().switchView(null, errorView);
					errorView.setMessage(Messages.ReportControler_msg_fillparameters);
					// UIUtils.showWarning(Messages.ReportControler_msg_fillparameters);
					prmInput.setFocus();
					prmInput.setDirty(true);
				}
				if (pcontainer.isHideParameters())
					pcontainer.showParameters(notprmfiled);
			}
		});
	}

	private RecordCountScriptletFactory scfactory;

	private void runJob(final PreviewContainer pcontainer) {
		fillError = null;
		Job job = new Job(Messages.PreviewEditor_preview_a
				+ ": " + jrContext.getJasperDesign().getName() + Messages.PreviewEditor_preview_b) { //$NON-NLS-1$ 

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				ClassLoader oldLoader = Thread.currentThread().getContextClassLoader();
				try {
					Thread.currentThread().setContextClassLoader(jrContext.getClassLoader());
					setParameters();

					final IFile file = ((IFileEditorInput) pcontainer.getEditorInput()).getFile();

					monitor.beginTask(Messages.PreviewEditor_starting, IProgressMonitor.UNKNOWN);

					setupFileRezolver(monitor, file);

					JasperDesign jd = ModelUtils.copyJasperDesign(jrContext.getJasperDesign());

					JasperReport jasperReport = compileJasperDesign(file, jd);

					if (jasperReport != null) {
						if (!prmInput.checkFieldsFilled()) {
							return Status.CANCEL_STATUS;
						}

						setupDataAdapter(pcontainer);
						if (pcontainer.getMode().equals(RunStopAction.MODERUN_JIVE)) {
							runJive(pcontainer, file, jasperReport);
						} else {
							setupVirtualizer(jd);
							c.addMessage(Messages.ReportControler_msg_fillreports);

							setupRecordCounters();
							// We create the fillHandle to run the report based on the type of data adapter....
							AsynchronousFillHandle fh = AsynchronousFillHandle
									.createHandle(jrContext, jasperReport, jasperParameters);

							if (fillReport(fh, monitor, pcontainer) == Status.CANCEL_STATUS)
								return Status.CANCEL_STATUS;
						}
					}
				} catch (final Throwable e) {
					c.addError(e);
					Display.getDefault().syncExec(new Runnable() {

						public void run() {
							VSimpleErrorPreview errorView = pcontainer.getErrorView();
							pcontainer.getRightContainer().switchView(null, errorView);
							errorView.setMessage(e.getMessage());
						}
					});
				} finally {
					Thread.currentThread().setContextClassLoader(oldLoader);
					monitor.done();
					finishReport(pcontainer);
				}
				return Status.OK_STATUS;
			}

		};
		job.setPriority(Job.LONG);
		job.schedule();
	}

	protected void runJive(final PreviewContainer pcontainer, final IFile file, final JasperReport jasperReport) {
		JettyUtil.startJetty(file.getProject(), jrContext);
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				try {
					Map<String, Object> prm = new HashMap<String, Object>();

					prm.put(SReportServlet.PRM_JRPARAMETERS, jasperParameters);
					prm.put(SReportServlet.PRM_JASPERREPORT, jasperReport);

					UUID randomUUID = UUID.randomUUID();
					Context.putContext(randomUUID.toString(), prm);

					String url = JettyUtil.getURL(file, randomUUID.toString(), jrContext);
					pcontainer.getJiveViewer().setURL(url);
				} catch (Exception e) {
					UIUtils.showError(e);
				}
			}
		});
	}

	private JasperReport compileJasperDesign(IFile file, JasperDesign jd) throws CoreException {
		stats.startCount(ST_COMPILATIONTIME);
		c.addMessage(Messages.ReportControler_msg_compiling);
		if (compiler == null) {
			compiler = new JasperReportCompiler();
			compiler.setErrorHandler(new JRErrorHandler(c));
			compiler.setProject(file.getProject());
		}
		JasperReport jasperReport = compiler.compileReport(jrContext, jd);// JasperCompileManager.getInstance(jrContext).compile(jd);
		stats.endCount(ST_COMPILATIONTIME);
		return jasperReport;
	}

	private void setupFileRezolver(IProgressMonitor monitor, IFile file) {
		jasperParameters.put(JRParameter.REPORT_FILE_RESOLVER, jrContext.getFileResolver());
	}

	private void setupVirtualizer(JasperDesign jd) {
		c.addMessage(Messages.ReportControler_msg_setvirtualizer);
		VirtualizerHelper.setVirtualizer(jd, jrContext, jasperParameters);
	}

	private void setupDataAdapter(final PreviewContainer pcontainer) throws JRException {
		c.addMessage(Messages.ReportControler_msg_setdataadapter);
		DataAdapterDescriptor daDesc = pcontainer.getDataAdapterDesc();
		if (daDesc != null)
			jasperParameters.put(DataAdapterParameterContributorFactory.PARAMETER_DATA_ADAPTER, daDesc.getDataAdapter());
	}

	public void stop() {
		if (pmonitor != null)
			pmonitor.setCanceled(true);
	}

	private IStatus fillReport(final AsynchronousFillHandle fh, IProgressMonitor monitor,
			final PreviewContainer pcontainer) throws JRException, InterruptedException {
		Assert.isTrue(fh != null);
		pmonitor = new SubProgressMonitor(monitor, IProgressMonitor.UNKNOWN,
				SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		IStatus retstatus = Status.OK_STATUS;
		try {
			pmonitor.beginTask(Messages.PreviewEditor_fill_report, IProgressMonitor.UNKNOWN);
			fh.addFillListener((IJRPrintable) pcontainer.getDefaultViewer());
			PageGenerationListener pgListener = new PageGenerationListener();
			fh.addFillListener(pgListener);
			fh.addListener(pgListener);
			stats.startCount(ST_FILLINGTIME);
			fh.startFill();
			finished = true;
			while (finished && fillError == null) {
				if (pmonitor.isCanceled()) {
					fh.cancellFill();
					retstatus = Status.CANCEL_STATUS;
					break;
				}
				Thread.sleep(500);
				pmonitor.worked(10);
			}
			if (fillError != null)
				throw new JRException(fillError);
		} catch (OutOfMemoryError e) {
			pcontainer.setJasperPrint(stats, null);
		} finally {
			pmonitor.done();
		}

		return retstatus;
	}

	class PageGenerationListener implements AsynchronousFilllListener, FillListener {
		JasperPrint jrPrint;
		private boolean refresh = false;

		@Override
		public void pageUpdated(JasperPrint arg0, int page) {
		}

		@Override
		public void pageGenerated(JasperPrint arg0, final int page) {
			this.jrPrint = arg0;
			if (page == 0) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						pcontainer.getRightContainer().switchView(stats, pcontainer.getDefaultViewerKey());
					}
				});
			}
			// pcontainer.setJasperPrint(stats, arg0);
			if (refresh)
				return;
			refresh = true;
			Display.getDefault().asyncExec(new Runnable() {

				@Override
				public void run() {
					stats.endCount(ST_FILLINGTIME);
					stats.setValue(ST_PAGECOUNT, page);
					if (scfactory != null)
						stats.setValue(ST_RECORDCOUNTER, scfactory.getRecordCount());
					stats.endCount(ST_REPORTEXECUTIONTIME);
					c.setStatistics(stats);
					refresh = false;
				}
			});
		}

		public void reportFinished(final JasperPrint jPrint) {
			this.jrPrint = jPrint;
			finishUpdateViewer(pcontainer, jPrint);
		}

		public void reportFillError(Throwable t) {
			handleFillException(t);
		}

		public void reportCancelled() {
			if (jrPrint != null)
				finishUpdateViewer(pcontainer, jrPrint);
			c.addMessage(Messages.PreviewEditor_report_fill_canceled);
		}
	}

	private boolean finished = true;
	private Throwable fillError = null;

	private VParameters prmInput;

	private Statistics stats;

	public static final String ST_REPORTSIZE = "REPORTSIZE"; //$NON-NLS-1$

	public static final String ST_EXPORTTIME = "ST_EXPORTTIME"; //$NON-NLS-1$

	private JasperReportCompiler compiler;

	private IProgressMonitor pmonitor;

	private void handleFillException(Throwable t) {
		fillError = t;
	}

	protected void setupRecordCounters() {
		List<ScriptletFactory> extensions = new ArrayList<ScriptletFactory>();
		scfactory = new RecordCountScriptletFactory();
		extensions.add(scfactory);
		jrContext.setExtensions(ScriptletFactory.class, extensions);
	}

	private void finishUpdateViewer(final PreviewContainer pcontainer, final JasperPrint jPrint) {
		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				stats.endCount(ST_FILLINGTIME);
				if (jPrint != null)
					stats.setValue(ST_PAGECOUNT, jPrint.getPages().size());
				if (scfactory != null)
					stats.setValue(ST_RECORDCOUNTER, scfactory.getRecordCount());
				stats.endCount(ST_REPORTEXECUTIONTIME);
				APreview pv = pcontainer.getDefaultViewer();
				if (pv instanceof IJRPrintable)
					try {
						((IJRPrintable) pv).setJRPRint(stats, null);
					} catch (Exception e) {
						e.printStackTrace();
					}

				pcontainer.setJasperPrint(stats, jPrint);
				finished = false;
			}
		});
	}
}
