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
package com.jaspersoft.studio.editor.preview;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignParameter;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.fill.AsynchronousFillHandle;
import net.sf.jasperreports.engine.fill.AsynchronousFilllListener;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

import com.jasperassistant.designer.viewer.ReportViewer;
import com.jasperassistant.designer.viewer.actions.FirstPageAction;
import com.jasperassistant.designer.viewer.actions.LastPageAction;
import com.jasperassistant.designer.viewer.actions.NextPageAction;
import com.jasperassistant.designer.viewer.actions.PageNumberContributionItem;
import com.jasperassistant.designer.viewer.actions.PreviousPageAction;
import com.jasperassistant.designer.viewer.actions.PrintAction;
import com.jasperassistant.designer.viewer.actions.ZoomActualSizeAction;
import com.jasperassistant.designer.viewer.actions.ZoomComboContributionItem;
import com.jasperassistant.designer.viewer.actions.ZoomFitPageAction;
import com.jasperassistant.designer.viewer.actions.ZoomFitPageWidthAction;
import com.jasperassistant.designer.viewer.actions.ZoomInAction;
import com.jasperassistant.designer.viewer.actions.ZoomOutAction;
import com.jaspersoft.studio.editor.preview.actions.ReloadAction;
import com.jaspersoft.studio.model.datasource.AMDatasource;
import com.jaspersoft.studio.model.datasource.AMFileDataSource;
import com.jaspersoft.studio.model.datasource.empty.MEmptyDataSource;
import com.jaspersoft.studio.model.datasource.file.MFileDataSource;
import com.jaspersoft.studio.model.datasource.jdbc.MJDBCDataSource;
import com.jaspersoft.studio.model.datasource.xml.MXMLDataSource;
import com.jaspersoft.studio.repository.RepositoryManager;
import com.jaspersoft.studio.utils.ErrorUtil;

public class PreviewEditor extends EditorPart {

	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setInput(input);
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	private ReportViewer reportViewer = new ReportViewer(SWT.BORDER | SWT.NO_FOCUS);
	private JasperDesign jasperDesign;

	public ReportViewer getReportViewer() {
		return reportViewer;
	}

	private Control reportViewerControl;
	private IToolBarManager tbManager;

	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = layout.marginHeight = 0;
		container.setLayout(layout);

		initToolBar(container);

		reportViewerControl = reportViewer.createControl(container);
		reportViewerControl.setLayoutData(new GridData(GridData.FILL_BOTH));
	}

	public void setJasperDesign(JasperDesign jasperDesign) {
		this.jasperDesign = jasperDesign;
	}

	@Override
	public void setFocus() {
		if (reportViewerControl != null)
			reportViewerControl.setFocus();
	}

	public void initToolBar(Composite parent) {
		ToolBar toolBar = new ToolBar(parent, SWT.FLAT | SWT.WRAP | SWT.RIGHT);
		GridData gd = new GridData();
		toolBar.setLayoutData(gd);

		tbManager = new ToolBarManager(toolBar);

		refreshToolbar();

		toolBar.update();
	}

	public boolean isNorun() {
		return norun;
	}

	private AMDatasource datasource;
	private Map<String, Object> jasperParameter = new Hashtable<String, Object>();
	private JasperPrint jasperPrint;
	private boolean norun = true;
	private Throwable fillError = null;
	private DatasourceComboItem dataSourceWidget;
	private ReloadAction reloadAction;

	public void runReport(final AMDatasource d) {
		if (norun) {

			String dsName = "";
			if (d != null) {
				dsName = d.getDisplayText();
				datasource = d;
			} else {
				if (datasource != null)
					dsName = datasource.getDisplayText();
				else {
					unsetReportDocument("No datasource selected, please select a datasource to run report", true);
					// jasperPrint = new ReportConverter(jasperDesign, false, true).getJasperPrint();
					return;
				}
			}
			int pdresult = askParameters();
			if (pdresult != Window.OK)
				return;

			String jobName = "Preview: " + jasperDesign.getName() + " on [" + dsName + "]";
			Job job = new Job(jobName) {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					unsetReportDocument("Reloading ...", false);
					monitor.beginTask("Starting ...", IProgressMonitor.UNKNOWN);
					InputStream io = null;
					fillError = null;
					try {
						jasperPrint = null;
						AsynchronousFillHandle fh = null;
						JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
						if (datasource instanceof MJDBCDataSource) {
							Connection connection = RepositoryManager.establishConnection((MJDBCDataSource) datasource,
									PreviewEditor.this, monitor);
							if (connection != null)
								fh = AsynchronousFillHandle.createHandle(jasperReport, jasperParameter, connection);
							else
								unsetReportDocument("Connection could not be established", true);
						} else {
							JRDataSource jrds = null;
							if (datasource instanceof MEmptyDataSource) {
								jrds = new JREmptyDataSource((Integer) datasource.getPropertyValue(MEmptyDataSource.PROPERTY_SIZE));
							} else if (datasource instanceof AMFileDataSource) {
								io = new FileInputStream((String) datasource.getPropertyValue(MFileDataSource.PROPERTY_FILENAME));
								if (datasource instanceof MFileDataSource) {
									jrds = RepositoryManager.createFileDataSource(io, (MFileDataSource) datasource);
								} else if (datasource instanceof MXMLDataSource) {
									jrds = RepositoryManager.createXMLDataSource(io, (MXMLDataSource) datasource);
								}
							}
							if (jrds != null) {
								fh = AsynchronousFillHandle.createHandle(jasperReport, jasperParameter, jrds);
							}
						}
						if (fillReport(fh, monitor) == Status.CANCEL_STATUS)
							return Status.CANCEL_STATUS;

						setReportDocument(true);
					} catch (final Throwable e) {
						unsetReportDocument(ErrorUtil.getStackTrace(e), true);
					} finally {
						if (io != null)
							try {
								io.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
						Display.getDefault().syncExec(new Runnable() {
							public void run() {
								setNorun(true);
							}
						});
						monitor.done();
						if (datasource != null && datasource instanceof MJDBCDataSource) {
							RepositoryManager.closeConnection((MJDBCDataSource) datasource);
						}
					}
					return Status.OK_STATUS;

				}
			};
			job.setPriority(Job.LONG);
			job.schedule();
		}
	}

	private int askParameters() {
		List<JRDesignParameter> prompts = new ArrayList<JRDesignParameter>();
		List<JRDesignParameter> params = jasperDesign.getParametersList();
		for (JRDesignParameter jdp : params) {
			if (jdp.isForPrompting() && !jdp.isSystemDefined()) {
				prompts.add(jdp);
			}
		}
		if (prompts.isEmpty())
			return Window.OK;
		ParametersDialog pd = new ParametersDialog(getEditorSite().getShell(), prompts, jasperParameter);
		int pdresult = pd.open();
		return pdresult;
	}

	public void setNorun(boolean norun) {
		this.norun = norun;
		tbManager.update(true);
		dataSourceWidget.refresh(true);
		reloadAction.setEnabled(norun);
	}

	public JasperDesign getJasperDesign() {
		return jasperDesign;
	}

	private void refreshToolbar() {
		tbManager.removeAll();
		// ExportMenuAction exportMenu = new ExportMenuAction(reportViewer);
		// IAction pdfAction = null;
		// exportMenu.getMenuManager().add(
		// pdfAction = new ExportAsPdfAction(reportViewer));
		// exportMenu.getMenuManager().add(
		// new ExportAsRtfAction(reportViewer));
		// exportMenu.getMenuManager().add(
		// new ExportAsJasperReportsAction(reportViewer));
		// exportMenu.getMenuManager().add(new ExportAsHtmlAction(reportViewer));
		// exportMenu.getMenuManager().add(
		// new ExportAsSingleXlsAction(reportViewer));
		// exportMenu.getMenuManager().add(
		// new ExportAsMultiXlsAction(reportViewer));
		// exportMenu.getMenuManager().add(new ExportAsCsvAction(reportViewer));
		// exportMenu.getMenuManager().add(new ExportAsXmlAction(reportViewer));
		// exportMenu.getMenuManager().add(
		// new ExportAsXmlWithImagesAction(reportViewer));
		// exportMenu.setDefaultAction(pdfAction);
		//
		// tbManager.add(exportMenu);
		tbManager.add(new PrintAction(reportViewer));
		reloadAction = new ReloadAction(this);
		tbManager.add(reloadAction);
		tbManager.add(new Separator());
		tbManager.add(new FirstPageAction(reportViewer));
		tbManager.add(new PreviousPageAction(reportViewer));
		if (SWT.getPlatform().equals("win32")) //$NON-NLS-1$
			tbManager.add(new PageNumberContributionItem(reportViewer));
		tbManager.add(new NextPageAction(reportViewer));
		tbManager.add(new LastPageAction(reportViewer));
		tbManager.add(new Separator());
		dataSourceWidget = new DatasourceComboItem(this);
		tbManager.add(dataSourceWidget);
		tbManager.add(new Separator());
		tbManager.add(new ZoomActualSizeAction(reportViewer));
		tbManager.add(new ZoomFitPageAction(reportViewer));
		tbManager.add(new ZoomFitPageWidthAction(reportViewer));
		tbManager.add(new Separator());
		tbManager.add(new ZoomOutAction(reportViewer));
		tbManager.add(new ZoomComboContributionItem(reportViewer));
		tbManager.add(new ZoomInAction(reportViewer));

		tbManager.update(true);
	}

	void unsetReportDocument(final String msg, final boolean noRun) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				reportViewer.unsetDocument(msg);
				setNorun(noRun);
			}
		});
	}

	void setReportDocument(final boolean noRun) {
		if (jasperPrint != null) {
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					if (jasperPrint != null) {
						try {
							reportViewer.setDocument(jasperPrint);
						} catch (Exception e) {
							unsetReportDocument(e2string(e), true);
						}
					}
					setNorun(noRun);
				}

				private String e2string(Exception e) {
					Writer result = new StringWriter();
					PrintWriter printWriter = new PrintWriter(result);
					e.printStackTrace(printWriter);
					return result.toString();
				}
			});
		}
	}

	IStatus fillReport(AsynchronousFillHandle fh, IProgressMonitor monitor) throws JRException, InterruptedException {
		IProgressMonitor sm = new SubProgressMonitor(monitor, IProgressMonitor.UNKNOWN,
				SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		try {
			sm.beginTask("filling report", IProgressMonitor.UNKNOWN);
			if (fh != null) {
				sm.setTaskName("filling report");
				sm.worked(50);

				fh.addListener(new AsynchronousFilllListener() {

					@Override
					public void reportFinished(JasperPrint jPrint) {
						jasperPrint = jPrint;
					}

					@Override
					public void reportFillError(Throwable t) {
						fillError = t;
					}

					@Override
					public void reportCancelled() {
						unsetReportDocument("Report fill Canceled", true);
					}
				});
				fh.startFill();
				while (true && jasperPrint == null && fillError == null) {
					if (sm.isCanceled()) {
						fh.cancellFill();
						return Status.CANCEL_STATUS;
					}
					Thread.sleep(500);
					sm.worked(10);
				}
				if (fillError != null)
					throw new JRException(fillError);
			}
		} finally {
			sm.done();
		}
		return Status.OK_STATUS;
	}
}
