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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;

import net.sf.jasperreports.data.DataAdapter;
import net.sf.jasperreports.data.DataAdapterService;
import net.sf.jasperreports.data.DataAdapterServiceUtil;
import net.sf.jasperreports.eclipse.util.ClassLoaderUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.fill.AsynchronousFillHandle;
import net.sf.jasperreports.engine.fill.AsynchronousFilllListener;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.util.SimpleFileResolver;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IFileEditorInput;

import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.data.DataAdapterManager;
import com.jaspersoft.studio.data.widget.DatasourceComboItem;
import com.jaspersoft.studio.data.widget.IDataAdapterRunnable;
import com.jaspersoft.studio.editor.JRPrintEditor;
import com.jaspersoft.studio.editor.preview.actions.ReloadAction;
import com.jaspersoft.studio.editor.preview.actions.ShowParametersAction;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.MReport;
import com.jaspersoft.studio.preferences.util.PropertiesHelper;
import com.jaspersoft.studio.preferences.virtualizer.VirtualizerHelper;
import com.jaspersoft.studio.utils.ErrorUtil;
import com.jaspersoft.studio.utils.SelectionHelper;

public class PreviewEditor extends JRPrintEditor implements IDataAdapterRunnable {

	protected JasperPrint loadJRObject(InputStream in) throws JRException {
		return getJasperPrint();
	}

	private JasperDesign jasperDesign;

	public void setJasperDesign(JasperDesign jasperDesign) {
		this.jasperDesign = jasperDesign;
		String strda = jasperDesign.getProperty(MReport.DEFAULT_DATAADAPTER);
		if (strda != null)
			dataSourceWidget.setSelected(DataAdapterManager.findDataAdapter(strda));
	}

	public JasperDesign getJasperDesign() {
		return jasperDesign;
	}

	protected boolean isDirty = false;

	@Override
	public boolean isDirty() {
		return isDirty;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	// $TODO complete this class to use DataAdapters and remove the AMDataSource.
	// private AMDatasource datasource;

	/**
	 * This is the cached DataAdapter used by this report.
	 */
	private DataAdapterDescriptor dataAdapterDesc;

	private Map<String, Object> jasperParameters = new Hashtable<String, Object>();

	private Throwable fillError = null;
	private DatasourceComboItem dataSourceWidget;

	public DataAdapterDescriptor getDataAdapterDesc() {
		return dataAdapterDesc;
	}

	private ReloadAction reloadAction;
	private ShowParametersAction showParametersAction;

	/**
	 * Run a report in a Job, asking for parameters. Parameters are cached. DataAdapter is cached.
	 * 
	 * @param myDataAdapter
	 *          the {@link com.jaspersoft.studio.data.DataAdapterDescriptor DataAdapter} to use in order to run the
	 *          report.
	 */
	public void runReport(DataAdapterDescriptor myDataAdapterDesc) {

		if (!isNotRunning())
			return; // Nothing to do, the report is already executing, we don't want to stop it.

		// Cache the DataAdapter used for this report only if it is not null.
		if (myDataAdapterDesc != null) {
			// $TODO should we save the reference in the JRXML ?
			dataAdapterDesc = myDataAdapterDesc;
		} else {
			dataAdapterDesc = dataSourceWidget.getSelected();
		}

		// If the DataAdapter of this preview editor is still null, abort the report execution
		if (dataAdapterDesc == null) {
			unsetReportDocument(Messages.PreviewEditor_no_datasource, true);
			return;
		}

		// At this point, dataAdapter is not null.

		// $TODO move askParameters inside the Job and check for classloading related problems
		// The idea is to allow a dataadapter to contribute the parameters before they are being asked to the user.
		int pdresult = askParameters();
		if (pdresult != Window.OK)
			return;

		Job job = new Job("") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				DataAdapterService dataAdapterService = null;
				try {
					IFile file = ((IFileEditorInput) getEditorInput()).getFile();

					Thread.currentThread().setContextClassLoader(
							ClassLoaderUtil.getClassLoader4Project(monitor, file.getProject()));
					SimpleFileResolver fileResolver = SelectionHelper.getFileResolver(file);

					DataAdapter dataAdapter = dataAdapterDesc.getDataAdapter();
					dataAdapterService = DataAdapterServiceUtil.getDataAdapterService(dataAdapterDesc.getDataAdapter());

					String dsName = dataAdapter.getName();
					String jobName = Messages.PreviewEditor_preview_a
							+ ": " + getJasperDesign().getName() + Messages.PreviewEditor_preview_b + "[" + dsName + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					setName(jobName);

					unsetReportDocument(Messages.PreviewEditor_reloading, false);
					monitor.beginTask(Messages.PreviewEditor_starting, IProgressMonitor.UNKNOWN);
					fillError = null;

					ByteArrayOutputStream out = new ByteArrayOutputStream();
					JRSaver.saveObject(getJasperDesign(), out);
					JasperDesign jd = (JasperDesign) JRLoader.loadObject(new ByteArrayInputStream(out.toByteArray()));

					PropertiesHelper ps = new PropertiesHelper(file.getProject());
					ps.setProperties(jd);

					setJasperPrint(null);
					AsynchronousFillHandle fh = null;

					JasperReport jasperReport = JasperCompileManager.compileReport(jd);
					if (jasperReport != null) {

						jasperParameters.put(JRParameter.REPORT_FILE_RESOLVER, fileResolver);

						VirtualizerHelper.setVirtualizer(jd, ps, jasperParameters);

						jasperParameters.remove(JRParameter.REPORT_CONNECTION);
						jasperParameters.remove(JRParameter.REPORT_DATA_SOURCE);
						// We let the data adapter to contribute its parameters.
						Map<String, Object> dataAdapterParams = dataAdapterService.getParameters();

						jasperParameters.putAll(dataAdapterParams);

						// We create the fillHandle to run the report based on the type of data adapter....
						fh = AsynchronousFillHandle.createHandle(jasperReport, jasperParameters);

						if (fillReport(fh, monitor) == Status.CANCEL_STATUS)
							return Status.CANCEL_STATUS;

						setReportDocument(true);
					}
				} catch (final Throwable e) {
					unsetReportDocument(ErrorUtil.getStackTrace(e), true);
				} finally {
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							setNotRunning(true);
						}
					});
					monitor.done();

					// Allow the data adapter to cleanup its state
					dataAdapterService.dispose();

				}
				return Status.OK_STATUS;
			}
		};

		// Ready to run our Job!
		job.setPriority(Job.LONG);
		job.schedule();
	}

	private boolean showParameters = false;

	private int askParameters() {
		ParametersDialog pd = new ParametersDialog(Display.getCurrent().getActiveShell(), jasperDesign, jasperParameters);
		if (showParameters || pd.canShowParameters()) {
			return pd.open();
		}
		return Window.OK;
	}

	public boolean isShowParameters() {
		return showParameters;
	}

	public void setShowParameters(boolean showParameters) {
		this.showParameters = showParameters;
	}

	public void setNotRunning(boolean norun) {
		super.setNotRunning(norun);
		dataSourceWidget.refresh(true);
		reloadAction.setEnabled(norun);
		showParametersAction.setEnabled(norun);
	}

	protected void refreshToolbar() {
		super.refreshToolbar();
		IToolBarManager tbManager = getTbManager();

		tbManager.add(new Separator());
		reloadAction = new ReloadAction(this);
		tbManager.appendToGroup("DATASOURCEGROUP", reloadAction); //$NON-NLS-1$

		dataSourceWidget = new DatasourceComboItem(this);
		tbManager.appendToGroup("DATASOURCEGROUP", dataSourceWidget); //$NON-NLS-1$

		// ToolBarContributionItem2 i = new ToolBarContributionItem2();
		// i.

		showParametersAction = new ShowParametersAction(this);
		// ToolItem item = new ToolItem(((ToolBarManager) tbManager).getControl(), SWT.CHECK);
		// item.setText(showParametersAction.getText());
		// item.setImage(JaspersoftStudioPlugin.getImage(showParametersAction.getImageDescriptor()));
		// item.setHotImage(JaspersoftStudioPlugin.getImage(showParametersAction.getHoverImageDescriptor()));
		// item.setToolTipText(showParametersAction.getToolTipText());
		// item.addSelectionListener(new SelectionListener() {
		//
		// public void widgetSelected(SelectionEvent e) {
		// showParametersAction.run();
		// }
		//
		// public void widgetDefaultSelected(SelectionEvent e) {
		//
		// }
		// });

		tbManager.appendToGroup("DATASOURCEGROUP", showParametersAction); //$NON-NLS-1$

		tbManager.update(true);
	}

	private IStatus fillReport(AsynchronousFillHandle fh, IProgressMonitor monitor) throws JRException,
			InterruptedException {
		Assert.isTrue(fh != null);
		IProgressMonitor sm = new SubProgressMonitor(monitor, IProgressMonitor.UNKNOWN,
				SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		try {
			sm.beginTask(Messages.PreviewEditor_fill_report, IProgressMonitor.UNKNOWN);

			fh.addListener(new AsynchronousFilllListener() {

				public void reportFinished(JasperPrint jPrint) {
					setJasperPrint(jPrint);
				}

				public void reportFillError(Throwable t) {
					handleFillException(t);
				}

				public void reportCancelled() {
					unsetReportDocument(Messages.PreviewEditor_report_fill_canceled, true);
				}
			});
			fh.startFill();
			while (true && getJasperPrint() == null && fillError == null) {
				if (sm.isCanceled()) {
					fh.cancellFill();
					return Status.CANCEL_STATUS;
				}
				Thread.sleep(500);
				sm.worked(10);
			}
			if (fillError != null)
				throw new JRException(fillError);

		} finally {
			sm.done();
		}
		return Status.OK_STATUS;
	}

	private void handleFillException(Throwable t) {
		fillError = t;
	}

}
