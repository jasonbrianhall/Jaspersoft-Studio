/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.server.editor;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.apache.http.cookie.Cookie;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.ireport.jasperserver.ws.FileContent;
import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.Argument;
import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.ResourceDescriptor;
import com.jaspersoft.studio.editor.preview.stats.Statistics;
import com.jaspersoft.studio.editor.preview.view.APreview;
import com.jaspersoft.studio.editor.preview.view.control.ReportController;
import com.jaspersoft.studio.editor.preview.view.control.VBookmarks;
import com.jaspersoft.studio.editor.preview.view.control.VExporter;
import com.jaspersoft.studio.editor.preview.view.control.VSimpleErrorPreview;
import com.jaspersoft.studio.editor.preview.view.report.IJRPrintable;
import com.jaspersoft.studio.editor.preview.view.report.IURLViewable;
import com.jaspersoft.studio.editor.preview.view.report.html.ABrowserViewer;
import com.jaspersoft.studio.server.WSClientHelper;
import com.jaspersoft.studio.server.editor.input.InputControlsManager;
import com.jaspersoft.studio.server.editor.input.VInputControls;
import com.jaspersoft.studio.server.messages.Messages;
import com.jaspersoft.studio.server.protocol.IConnection;
import com.jaspersoft.studio.server.protocol.ReportExecution;
import com.jaspersoft.studio.server.protocol.restv2.ARestV2Connection;
import com.jaspersoft.studio.server.protocol.restv2.RESTv2ExceptionHandler;
import com.jaspersoft.studio.utils.Console;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.util.JRLoader;

public class ReportRunControler {
	public static final String FORM_PARAMETERS = "Input Controls"; //$NON-NLS-1$

	private LinkedHashMap<String, APreview> viewmap;
	private ReportUnitEditor pcontainer;
	private VInputControls prmInput;
	private InputControlsManager icm;
	private String reportUnit;

	public ReportRunControler(ReportUnitEditor pcontainer) {
		this.pcontainer = pcontainer;
	}

	public void setReportUnit(String key) {
		if (!key.equals(reportUnit)) {
			repExec = new ReportExecution();
			repExec.setStatus("queued"); //$NON-NLS-1$
			repExec.setReportURIFull(key);
			repExec.setReportURI(WSClientHelper.getReportUnitUri(key));
		}
		this.reportUnit = key;
		if (viewmap != null && prmInput == null) {
			try {
				icm = new InputControlsManager();
				ProgressMonitorDialog pm = new ProgressMonitorDialog(
						UIUtils.getShell());

				pm.run(true, true, new IRunnableWithProgress() {
					public void run(final IProgressMonitor monitor)
							throws InvocationTargetException,
							InterruptedException {
						monitor.beginTask(
								com.jaspersoft.studio.messages.Messages.ReportRunControler_1,
								IProgressMonitor.UNKNOWN);
						try {
							cli = WSClientHelper.getClient(monitor, reportUnit);
							icm.setWsclient(cli);
							icm.initInputControls(cli
									.initInputControls(reportUnit,
											ResourceDescriptor.TYPE_REPORTUNIT,
											monitor));

							// TODO search all the repository
							icm.getDefaults();
							UIUtils.getDisplay().syncExec(new Runnable() {
								public void run() {
									if (viewmap != null)
										fillForms(monitor);
									runReport();
								}
							});
						} catch (Throwable e) {
							throw new InvocationTargetException(e);
						} finally {
							monitor.done();
						}
					}

				});
			} catch (InvocationTargetException e) {
				UIUtils.showError(e.getCause());
			} catch (InterruptedException e) {
				UIUtils.showError(e);
			} catch (Exception e1) {
				UIUtils.showError(e1);
			}
		} else {
			runReport();
		}
	}

	public LinkedHashMap<String, APreview> createControls(Composite composite,
			JasperReportsConfiguration jContext) {
		viewmap = new LinkedHashMap<String, APreview>();
		viewmap.put(FORM_PARAMETERS, new VInputControls(composite, jContext));
		viewmap.put(ReportController.FORM_BOOKMARKS, new VBookmarks(composite,
				jContext, pcontainer));
		viewmap.put(ReportController.FORM_EXPORTER, new VExporter(composite,
				jContext));
		return viewmap;
	}

	public void viewerChanged(APreview view) {
		VExporter vs = (VExporter) viewmap.get(ReportController.FORM_EXPORTER);
		vs.setPreferencesPage(view);
	}

	private void fillForms(IProgressMonitor monitor) {
		prmInput = (VInputControls) viewmap.get(FORM_PARAMETERS);
		prmInput.createInputControls(icm, monitor);
		prmInput.setReportUnit(icm, icm.getReportUnit(), monitor, reportUnit);
	}

	private Console c;

	private IConnection cli;
	private static File tempDir = new File(System.getProperty("java.io.tmpdir")); //$NON-NLS-1$
	private Statistics stats;

	private ReportExecution repExec;

	public void runReport() {
		final VSimpleErrorPreview errorView = pcontainer.getErrorView();
		pcontainer.getRightContainer().switchView(null, errorView);
		errorView
				.setMessage(com.jaspersoft.studio.messages.Messages.ReportControler_generating);

		c = pcontainer.getConsole();
		c.showConsole();
		c.clearConsole();
		pcontainer.setJasperPrint(null, null);

		stats = new Statistics();
		stats.startCount(ReportController.ST_REPORTEXECUTIONTIME);
		c.addMessage(Messages.ReportRunControler_statsstart);

		pcontainer.setNotRunning(false);

		Job job = new Job(
				com.jaspersoft.studio.messages.Messages.PreviewEditor_preview_a
						+ ": " + reportUnit + com.jaspersoft.studio.messages.Messages.PreviewEditor_preview_b) { //$NON-NLS-1$ 

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask(
						com.jaspersoft.studio.messages.Messages.ReportRunControler_3,
						IProgressMonitor.UNKNOWN);
				try {
					prmInput.setReportUnit(icm, icm.getReportUnit(), monitor,
							reportUnit);
					if (!prmInput.checkFieldsFilled())
						return Status.CANCEL_STATUS;
					Map<String, Object> prmcopy = new HashMap<String, Object>();
					for (ResourceDescriptor p : icm.getInputControls()) {
						if (p.isVisible() && !p.isReadOnly()) {
							if (p.isMandatory())
								prmcopy.put(p.getName(), icm.getParameters()
										.get(p.getName()));
							else if (icm.getParameters().get(p.getName()) != null)
								prmcopy.put(p.getName(), icm.getParameters()
										.get(p.getName()));
						}
					}

					List<Argument> args = new ArrayList<Argument>();
					String reptype = pcontainer.getCurrentViewer();
					args.add(new Argument(Argument.RUN_OUTPUT_FORMAT, reptype));
					args.add(new Argument(Argument.RUN_OUTPUT_IMAGES_URI, "")); //$NON-NLS-1$
					repExec.setArgs(args);
					repExec.setStatus("refresh"); //$NON-NLS-1$

					while (repExec.getStatus().equals("refresh") || repExec.getStatus().equals("queued") || repExec.getStatus().equals("execution")) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						monitor.setTaskName(repExec.getStatus());
						repExec = WSClientHelper.runReportUnit(monitor,
								repExec, prmcopy);
						if (repExec.getStatus().equals("ready")) { //$NON-NLS-1$
							stats.endCount(ReportController.ST_REPORTEXECUTIONTIME);
							if (repExec.getTotalPages() != null)
								stats.setValue(ReportController.ST_PAGECOUNT,
										repExec.getTotalPages());
							if (repExec.getReportOutputURL() != null) {
								showURL(repExec);
							} else {
								Map<String, FileContent> files = repExec
										.getFiles();
								if (files.isEmpty())
									showReport(null);
								for (String key : files.keySet()) {
									FileContent fc = (FileContent) files
											.get(key);
									stats.setValue(
											ReportController.ST_REPORTSIZE,
											fc.getData().length);
									if (reptype
											.equals(Argument.RUN_OUTPUT_FORMAT_JRPRINT)) { //$NON-NLS-1$
										Object obj = JRLoader
												.loadObject(new ByteArrayInputStream(
														fc.getData()));
										if (obj instanceof JasperPrint)
											showReport((JasperPrint) obj);
										break;
									} else {
										// System.out.println(new
										// String(fc.getMimeType()));
										File f = null;
										if (fc.getName().contains("/")) //$NON-NLS-1$
											f = new File(
													FilenameUtils.getFullPath(fc
															.getName()),
													FilenameUtils
															.getBaseName(fc
																	.getName()));
										else
											f = new File(tempDir, fc.getName());
										if (f == null || !f.exists()) {
											f.deleteOnExit();
											f.createNewFile();
										}
										if (!key.equals("report")) { //$NON-NLS-1$
											if (!f.getName().equals(key)) {
												File dest = new File(tempDir,
														key);
												f.renameTo(dest);
												f = dest;
											}
										} else if (f.getName().endsWith(".att")) { //$NON-NLS-1$
											int ind = fc.getMimeType().indexOf(
													"/"); //$NON-NLS-1$
											if (ind >= 0) {
												String str = fc.getMimeType()
														.substring(ind + 1);
												File dest = new File(
														f.getAbsolutePath()
																.replaceAll(
																		".att$", "." + str)); //$NON-NLS-1$ //$NON-NLS-2$
												f.renameTo(dest);
												f = dest;
											}
										}
										FileOutputStream htmlFile = new FileOutputStream(
												f);
										htmlFile.write(fc.getData());
										htmlFile.close();
										if (key.equals("report")) //$NON-NLS-1$
											showURL(f.toURI().toASCIIString());
										// UIUtils.getDisplay().asyncExec(new
										// Runnable() {
										//
										// @Override
										// public void run() {
										// errorView.setMessage("This file will be opened in an external editor");
										// SelectionHelper.openEditor(f);
										// }
										// });
									}
								}
							}
						} else if (repExec.getStatus().equals("queued") || repExec.getStatus().equals("execution")) { //$NON-NLS-1$ //$NON-NLS-2$
							showURL(repExec);
							Thread.sleep(100);
						} else if (repExec.getStatus().equals("failed") || repExec.getStatus().equals("cancelled")) { //$NON-NLS-1$ //$NON-NLS-2$
							RESTv2ExceptionHandler reh = new RESTv2ExceptionHandler(
									(ARestV2Connection) WSClientHelper
											.getClient(monitor,
													repExec.getReportURIFull()));
							throw new Exception(reh.buildMessage(monitor,
									"", repExec.getErrorDescriptor())); //$NON-NLS-1$
						}
						if (monitor.isCanceled()) {
							WSClientHelper.cancelReportUnit(monitor, repExec);
							break;
						}
					}
				} catch (Throwable e) {
					ReportController.showRunReport(c, pcontainer, e);
				} finally {
					monitor.done();
					finishReport();
				}
				return Status.OK_STATUS;
			}

			private void showReport(final JasperPrint obj) {
				UIUtils.getDisplay().asyncExec(new Runnable() {

					@Override
					public void run() {
						stats.setValue(ReportController.ST_PAGECOUNT,
								obj == null ? 0 : obj.getPages().size());
						APreview pv = pcontainer.getDefaultViewer();
						if (pv instanceof IJRPrintable)
							try {
								((IJRPrintable) pv)
										.setJRPRint(stats, obj, true);
								VBookmarks vs = (VBookmarks) viewmap
										.get(ReportController.FORM_BOOKMARKS);
								vs.setJasperPrint(obj);
							} catch (Exception e) {
								e.printStackTrace();
							}
						pcontainer.setJasperPrint(stats, obj);
						pcontainer.setCurrentViewer(
								pcontainer.getDefaultViewerKey(), true);
						if (obj == null)
							errorView
									.setMessage(com.jaspersoft.studio.messages.Messages.ReportRunControler_22);
					}
				});
			}

			private void showURL(final String url) {
				UIUtils.getDisplay().asyncExec(new Runnable() {

					@Override
					public void run() {
						APreview pv = pcontainer.getDefaultViewer();
						if (pv instanceof IURLViewable)
							try {
								((IURLViewable) pv).setURL(url);
								pcontainer.setCurrentViewer(
										pcontainer.getDefaultViewerKey(), true);
							} catch (Exception e) {
								e.printStackTrace();
							}
					}
				});
			}

			private void showURL(final ReportExecution re) {
				if (re.getReportOutputURL() != null) {
					UIUtils.getDisplay().asyncExec(new Runnable() {

						@Override
						public void run() {
							APreview pv = pcontainer.getDefaultViewer();
							if (pv instanceof ABrowserViewer)
								try {
									String urlcookie = re.getBaseUrl();
									String scookie = null;
									for (Cookie c : re.getReportOutputCookie()) {
										if (c.getName().equals("JSESSIONID")) { //$NON-NLS-1$
											scookie = c.getName()
													+ "=" + c.getValue(); //$NON-NLS-1$
											break;
										}
									}
									((ABrowserViewer) pv).setURL(
											re.getReportOutputURL(), urlcookie,
											scookie);
									pcontainer.setCurrentViewer(
											pcontainer.getDefaultViewerKey(),
											true);
								} catch (Exception e) {
									e.printStackTrace();
								}
						}
					});
				}
			}
		};
		job.setPriority(Job.LONG);
		job.schedule();
	}

	public void finishReport() {
		ReportController.finishCompiledReport(c, prmInput, pcontainer);
	}

	public void resetParametersToDefault(IProgressMonitor monitor)
			throws Exception {
		prmInput.setupDefaultValues(monitor);
	}
}
