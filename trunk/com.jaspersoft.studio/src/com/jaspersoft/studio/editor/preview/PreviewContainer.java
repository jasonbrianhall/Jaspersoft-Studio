/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved. http://www.jaspersoft.com.
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.editor.preview;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.eclipse.util.FileUtils;
import net.sf.jasperreports.eclipse.viewer.action.AReportAction;
import net.sf.jasperreports.eclipse.viewer.action.ZoomActualSizeAction;
import net.sf.jasperreports.eclipse.viewer.action.ZoomInAction;
import net.sf.jasperreports.eclipse.viewer.action.ZoomOutAction;
import net.sf.jasperreports.engine.DefaultJasperReportsContext;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignParameter;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.design.events.CollectionElementAddedEvent;
import net.sf.jasperreports.engine.design.events.CollectionElementRemovedEvent;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.data.DataAdapterManager;
import com.jaspersoft.studio.data.storage.JRDefaultDataAdapterStorage;
import com.jaspersoft.studio.data.widget.DataAdapterAction;
import com.jaspersoft.studio.data.widget.IDataAdapterRunnable;
import com.jaspersoft.studio.editor.preview.actions.RunStopAction;
import com.jaspersoft.studio.editor.preview.actions.SwitchViewsAction;
import com.jaspersoft.studio.editor.preview.stats.Statistics;
import com.jaspersoft.studio.editor.preview.toolbar.LeftToolBarManager;
import com.jaspersoft.studio.editor.preview.toolbar.PreviewTopToolBarManager;
import com.jaspersoft.studio.editor.preview.toolbar.TopToolBarManagerJRPrint;
import com.jaspersoft.studio.editor.preview.view.APreview;
import com.jaspersoft.studio.editor.preview.view.control.ReportControler;
import com.jaspersoft.studio.editor.preview.view.report.html.ABrowserViewer;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.messages.MessagesByKeys;
import com.jaspersoft.studio.preferences.util.PreferencesUtils;
import com.jaspersoft.studio.property.dataset.dialog.DataQueryAdapters;
import com.jaspersoft.studio.statistics.UsageStatisticsIDs;
import com.jaspersoft.studio.swt.toolbar.ToolItemContribution;
import com.jaspersoft.studio.swt.widgets.CSashForm;
import com.jaspersoft.studio.utils.JRXMLUtils;
import com.jaspersoft.studio.utils.Misc;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class PreviewContainer extends PreviewJRPrint implements IDataAdapterRunnable, IParametrable, IRunReport {

	/**
	 * Zoom in action
	 */
	private AReportAction zoomInAction = null;

	/**
	 * Zoom out action
	 */
	private AReportAction zoomOutAction = null;

	/**
	 * the zoom to 100% action
	 */
	private AReportAction zoomActualAction = null;

	private DataAdapterDescriptor dataAdapterDesc;
	
	/**
	 * Flag used to enable or disable the run of the report when
	 * the JasperDesign is set
	 */
	private boolean runWhenInitilizing = true;
	
	public PreviewContainer() {
		super(true);
	}

	public PreviewContainer(boolean listenResource, JasperReportsConfiguration jrContext) {
		super(listenResource);
		this.jrContext = jrContext;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * Retrieve the action from the contribution items. If the action were already retrieved it dosen't do nothing
	 */
	private void setActions() {
		for (IContributionItem item : topToolBarManager.getContributions()) {
			if (zoomInAction != null && zoomOutAction != null && zoomActualAction != null)
				return;
			if (ZoomInAction.ID.equals(item.getId()) && item instanceof ActionContributionItem) {
				zoomInAction = (AReportAction) ((ActionContributionItem) item).getAction();
			} else if (ZoomOutAction.ID.equals(item.getId()) && item instanceof ActionContributionItem) {
				zoomOutAction = (AReportAction) ((ActionContributionItem) item).getAction();
			} else if (ZoomActualSizeAction.ID.equals(item.getId()) && item instanceof ActionContributionItem) {
				zoomActualAction = (AReportAction) ((ActionContributionItem) item).getAction();
			}
		}
	}

	public AReportAction getZoomInAction() {
		setActions();
		return zoomInAction;
	}

	public AReportAction getZoomOutAction() {
		setActions();
		return zoomOutAction;
	}

	public AReportAction getZoomActualAction() {
		setActions();
		return zoomActualAction;
	}

	@Override
	protected void loadJRPrint(IEditorInput input) throws PartInitException {
		setJasperPrint(null, null);
		if (listenResource) {
			InputStream in = null;
			IFile file = null;
			try {
				if (input instanceof IFileEditorInput) {
					file = ((IFileEditorInput) input).getFile();
					in = file.getContents();
				} else {
					throw new PartInitException("Invalid Input: Must be IFileEditorInput or FileStoreEditorInput"); //$NON-NLS-1$
				}
				in = JRXMLUtils.getXML(jrContext, input, file.getCharset(true), in, null);
				getJrContext(file);
				jrContext.setJasperDesign(JRXmlLoader.load(jrContext, in));
				setJasperDesign(jrContext);
			} catch (Exception e) {
				throw new PartInitException(e.getMessage(), e);
			} finally {
				if (in != null)
					try {
						in.close();
					} catch (IOException e) {
						throw new PartInitException("error closing input stream", e); //$NON-NLS-1$
					}
			}
		}
	}

	private MultiPageContainer leftContainer;

	public MultiPageContainer getLeftContainer() {
		if (leftContainer == null)
			leftContainer = new MultiPageContainer() {
				@Override
				public void switchView(Statistics stats, APreview view) {
					super.switchView(stats, view);
					for (String key : pmap.keySet()) {
						if (pmap.get(key) == view) {
							leftToolbar.setLabelText(MessagesByKeys.getString(key));
							break;
						}
					}
				}
			};
		return leftContainer;
	}

	private CSashForm sashform;

	private LeftToolBarManager leftToolbar;

	/**
	 * When disposed the mouse wheel filter is removed
	 */
	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);

		container.setLayout(new GridLayout(3, false));
		PlatformUI.getWorkbench().getHelpSystem().setHelp(container, "com.jaspersoft.studio.doc.editor_preview"); //$NON-NLS-1$

		getTopToolBarManager1(container);
		getTopToolBarManager(container);

		Button lbutton = new Button(container, SWT.PUSH);
		lbutton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		lbutton.setImage(JaspersoftStudioPlugin.getInstance().getImage("icons/application-sidebar-expand.png")); //$NON-NLS-1$
		lbutton.setToolTipText(Messages.PreviewContainer_buttonText);
		lbutton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sashform.upRestore();
			}
		});

		sashform = new CSashForm(container, SWT.HORIZONTAL);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 3;
		sashform.setLayoutData(gd);

		createLeft(parent, sashform);

		createRight(sashform);

		sashform.setWeights(new int[] { 40, 60 });
	}

	@Override
	protected PreviewTopToolBarManager getTopToolBarManager1(Composite container) {
		if (topToolBarManager1 == null) {
			IFile file = null;
			IProject project = null;
			IEditorInput editorInput = getEditorInput();
			if (editorInput instanceof IFileEditorInput) {
				file = ((IFileEditorInput) editorInput).getFile();
			}
			if (jrContext != null) {
				project = (IProject) jrContext.get(FileUtils.KEY_IPROJECT);
			}
			topToolBarManager1 = new PreviewTopToolBarManager(this, container, DataAdapterManager.getDataAdapter(file, project, jrContext));
		}
		return (PreviewTopToolBarManager) topToolBarManager1;
	}

	protected TopToolBarManagerJRPrint getTopToolBarManager(Composite container) {
		if (topToolBarManager == null)
			topToolBarManager = new TopToolBarManagerJRPrint(this, container) {
				protected void fillToolbar(IToolBarManager tbManager) {
					if (runMode.equals(RunStopAction.MODERUN_LOCAL)) {
						if (pvModeAction == null)
							pvModeAction = new SwitchViewsAction(container.getRightContainer(), Messages.PreviewContainer_javatitle,
									true, getViewFactory());
						tbManager.add(pvModeAction);
					}
					tbManager.add(new Separator());
				}
			};
		return topToolBarManager;
	}

	/**
	 * Set the current preview type
	 * 
	 * @param viewerKey
	 *          key of the type to show
	 * @param refresh
	 *          flag to set if the preview should also be refreshed
	 */
	@Override
	public void setCurrentViewer(String viewerKey, boolean refresh) {
		super.setCurrentViewer(viewerKey, refresh);
		// Set the name of the action to align the showed name with the actual type
		topToolBarManager.setActionText(viewerKey);
	}

	protected void createLeft(Composite parent, SashForm sf) {
		Composite leftComposite = new Composite(sf, SWT.BORDER);
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		leftComposite.setLayout(layout);

		leftToolbar = new LeftToolBarManager(this, leftComposite);
		setupDataAdapter();

		final Composite cleftcompo = new Composite(leftComposite, SWT.NONE);
		cleftcompo.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		cleftcompo.setLayoutData(new GridData(GridData.FILL_BOTH));
		cleftcompo.setLayout(new StackLayout());

		Composite bottom = new Composite(leftComposite, SWT.NONE);
		bottom.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));
		bottom.setLayout(new GridLayout(2, false));

		ToolBar tb = new ToolBar(bottom, SWT.FLAT | SWT.WRAP | SWT.RIGHT);
		ToolBarManager tbm = new ToolBarManager(tb);
		tbm.add(new RunStopAction(this));
		ToolItemContribution tireset = new ToolItemContribution("", SWT.PUSH); //$NON-NLS-1$
		tbm.add(tireset);
		tbm.update(true);
		ToolItem toolItem = tireset.getToolItem();
		toolItem.setText(Messages.PreviewContainer_resetactiontitle);
		toolItem.setToolTipText(Messages.PreviewContainer_resetactiontooltip);
		toolItem.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				reportControler.resetParametersToDefault();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		tbm.update(true);

		getLeftContainer().populate(cleftcompo, getReportControler().createControls(cleftcompo));
		getLeftContainer().switchView(null, ReportControler.FORM_PARAMETERS);
	}

	private ABrowserViewer jiveViewer;

	@Override
	protected Composite createRight(Composite parent) {
		super.createRight(parent);
		return rightComposite;
	}
	
	/**
	 * Log the report language and preview type (different from java) when the report is executed
	 */
	protected void auditPreview(){
		// Log the preview if not Java
		if (currentViewer != null && !currentViewer.equals("Java")) {
			JaspersoftStudioPlugin.getInstance().getUsageManager().audit(currentViewer, UsageStatisticsIDs.CATEGORY_PREVIEW_FORMAT);
			//Log the language used by the report
			if (jrContext != null && jrContext.getJasperDesign() != null){
				String reportLanguage = jrContext.getJasperDesign().getLanguage();
				if (reportLanguage != null){
					JaspersoftStudioPlugin.getInstance().getUsageManager().audit("ReportLanguage"+reportLanguage, UsageStatisticsIDs.CATEGORY_REPORT);
				}
			}
		}
	}

	@Override
	public boolean switchRightView(APreview view, Statistics stats, MultiPageContainer container) {
		reportControler.viewerChanged(view);
		return super.switchRightView(view, stats, container);
	}

	public void runReport(final DataAdapterDescriptor myDataAdapter) {
		if (isNotRunning()) {
			// check if we can run the report
			topToolBarManager.setEnabled(false);
			topToolBarManager1.setEnabled(false);
			leftToolbar.setEnabled(false);
			getLeftContainer().setEnabled(false);
			getLeftContainer().switchView(null, ReportControler.FORM_PARAMETERS);

			// Cache the DataAdapter used for this report only if it is not null.
			if (myDataAdapter != null) {
				// TODO should we save the reference in the JRXML ?
				dataAdapterDesc = myDataAdapter;
			} else {
				DataAdapterAction daWidget = ((PreviewTopToolBarManager) topToolBarManager1).getDataSourceWidget();
				dataAdapterDesc = daWidget.isDefaultDASelected() ? null :  daWidget.getSelected();
			}

			addPreviewModeContributeProperties();
			reportControler.runReport();
			auditPreview();
		}
	}

	private void addPreviewModeContributeProperties() {
		List<PreviewModeDetails> previewDetails = JaspersoftStudioPlugin.getExtensionManager().getAllPreviewModeDetails(
				Misc.nvl(this.runMode));
		for (PreviewModeDetails d : previewDetails) {
			Map<String, String> previewModeProperties = d.getPreviewModeProperties();
			for (String pKey : previewModeProperties.keySet()) {
				String pValue = previewModeProperties.get(pKey);
				PreferencesUtils.storeJasperReportsProperty(pKey, pValue);
				DefaultJasperReportsContext.getInstance().setProperty(pKey, pValue);
			}
		}
		APreview view = null;
		if (RunStopAction.MODERUN_JIVE.equals(this.runMode)) {
			view = getJiveViewer();
			getRightContainer().switchView(null, getJiveViewer());
		} else if (RunStopAction.MODERUN_LOCAL.equals(this.runMode)) {
			getRightContainer().switchView(null, getDefaultViewerKey());
			view = getDefaultViewer();
		}
		refreshToolbars(view);
	}

	protected void refreshToolbars(final APreview view) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				if (topToolBarManager != null)
					topToolBarManager.contributeItems(view);
			}
		});
	}

	@Override
	public void setNotRunning(boolean stoprun) {
		super.setNotRunning(stoprun);
		if (stoprun) {
			getLeftContainer().setEnabled(true);
			leftToolbar.setEnabled(true);
		}
	}

	public void showParameters(boolean showprm) {
		if (showprm)
			sashform.upRestore();
		else
			sashform.upHide();
	}

	private ReportControler reportControler;

	public ReportControler getReportControler() {
		if (reportControler == null)
			reportControler = new ReportControler(this, jrContext);
		return reportControler;
	}

	protected boolean isParameterDirty = true;
	protected boolean isRunDirty = true;

	public boolean isRunDirty() {
		return isParameterDirty;
	}

	public void setRunDirty(boolean isRunDirty) {
		this.isRunDirty = isRunDirty;
		isParameterDirty = isRunDirty;
	}

	private PropertyChangeListener propChangeListener;

	public void setJasperDesign(final JasperReportsConfiguration jConfig) {
		UIUtils.getDisplay().asyncExec(new Runnable() {

			@Override
			public void run() {
				ClassLoader oldCL = Thread.currentThread().getContextClassLoader();
				try {
					Thread.currentThread().setContextClassLoader(jrContext.getClassLoader());
					getReportControler().setJrContext(jConfig);
					setupDataAdapter();

					if ((isRunDirty || getJasperPrint() == null) && runWhenInitilizing){
						runReport(dataAdapterDesc);
					}
					propChangeListener = new PropertyChangeListener() {

						@Override
						public void propertyChange(PropertyChangeEvent evt) {
							String pname = evt.getPropertyName();
							if (pname.equals(JRDesignDataset.PROPERTY_PARAMETERS)) {
								if (evt instanceof CollectionElementAddedEvent)
									((JRDesignParameter) ((CollectionElementAddedEvent) evt).getAddedValue()).getEventSupport()
											.addPropertyChangeListener(propChangeListener);
								else if (evt instanceof CollectionElementRemovedEvent)
									((JRDesignParameter) ((CollectionElementRemovedEvent) evt).getRemovedValue()).getEventSupport()
											.removePropertyChangeListener(propChangeListener);
							}
							if (evt.getSource() instanceof JRParameter)
								isParameterDirty = true;
							else if (pname.equals(JRDesignDataset.PROPERTY_PARAMETERS)
									|| pname.equals(JRDesignDataset.PROPERTY_SCRIPTLETS))
								isParameterDirty = true;
						}
					};
					JRDesignDataset mds = jrContext.getJasperDesign().getMainDesignDataset();
					mds.getEventSupport().addPropertyChangeListener(propChangeListener);

					for (JRParameter p : mds.getParametersList())
						((JRDesignParameter) p).getEventSupport().addPropertyChangeListener(propChangeListener);
				} finally {
					Thread.currentThread().setContextClassLoader(oldCL);
				}
			}
		});
	}

	private void setupDataAdapter() {
		JasperDesign jd = getReportControler().getJrContext().getJasperDesign();
		PreviewTopToolBarManager pt = (PreviewTopToolBarManager) topToolBarManager1;
		if (pt != null && jd != null) {
			String strda = jd.getProperty(DataQueryAdapters.DEFAULT_DATAADAPTER);
			DataAdapterAction daWidget = ((PreviewTopToolBarManager) topToolBarManager1).getDataSourceWidget();
			if (strda != null) {
				pt.setDataAdapters(strda);
				dataAdapterDesc = daWidget.isDefaultDASelected() ? null :  daWidget.getSelected();
			} else {
				//If there is not a default JSS Da but it is defined a JR default da then select it on the preview
				JRDefaultDataAdapterStorage defaultStorage = DataAdapterManager.getJRDefaultStorage(getConfiguration());
				DataAdapterDescriptor defaultDA = defaultStorage.getDefaultJRDataAdapter(jd.getMainDesignDataset());
				if (defaultDA != null){
					pt.setDataAdapters(defaultDA.getName());
				}
			}
		}
	}

	public DataAdapterDescriptor getDataAdapterDesc() {
		return dataAdapterDesc;
	}

	private String runMode = RunStopAction.MODERUN_LOCAL;

	public void setMode(String mode) {
		this.runMode = mode;
		if (mode.equals(RunStopAction.MODERUN_JIVE)) {
			getRightContainer().switchView(null, getJiveViewer());
		} else if (mode.equals(RunStopAction.MODERUN_LOCAL)) {
			getRightContainer().switchView(null, getDefaultViewerKey());
		}
	}

	public String getMode() {
		return runMode;
	}

	public ABrowserViewer getJiveViewer() {
		if (jiveViewer == null) {
			jiveViewer = new ABrowserViewer(rightComposite, jrContext);
		}
		return jiveViewer;
	}

	@Override
	public void runReport() {
		runReport(null);
	}

	/**
	 * Set the dirty flag of the preview area
	 */
	public void setDirty(boolean dirty) {
		this.isDirty = dirty;
		if (dirty)
			setRunDirty(true);
	}

	/**
	 * Return the JasperReportsConfiguration of the loaded report
	 * 
	 * @return a JasperReportsConfiguration
	 */
	@Override
	public JasperReportsConfiguration getConfiguration() {
		return jrContext;
	}
	
	/**
	 * Flag used to enable or disable the run of the report when
	 * the JasperDesign is set trough setJasperDesign(final JasperReportsConfiguration jConfig)
	 * 
	 * @param value true if the report should be run when the JasperDesign is set, 
	 * false otherwise
	 */
	public void setRunWhenInitilizing(boolean value){
		runWhenInitilizing = value;
	}
}
