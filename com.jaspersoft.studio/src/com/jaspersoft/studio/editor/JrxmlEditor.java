/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved. http://www.jaspersoft.com.
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.editor;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;

import net.sf.jasperreports.eclipse.builder.JasperReportsBuilder;
import net.sf.jasperreports.eclipse.builder.Markers;
import net.sf.jasperreports.eclipse.builder.jdt.JRErrorHandler;
import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.engine.JRDataset;
import net.sf.jasperreports.engine.JRExpressionCollector;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.editors.text.IStorageDocumentProvider;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.texteditor.IDocumentProvider;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.compatibility.JRXmlWriterHelper;
import com.jaspersoft.studio.editor.defaults.DefaultManager;
import com.jaspersoft.studio.editor.expression.ExpressionEditorSupportUtil;
import com.jaspersoft.studio.editor.preview.view.control.VErrorPreview;
import com.jaspersoft.studio.editor.report.CachedSelectionProvider;
import com.jaspersoft.studio.editor.report.CommonSelectionCacheProvider;
import com.jaspersoft.studio.editor.report.ReportContainer;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.utils.JRXMLUtils;

/*
 * An example showing how to create a multi-page editor. This example has 3 pages: <ul> <li>page 0 contains a nested
 * text editor. <li>page 1 allows you to change the font used in page 2 <li>page 2 shows the words in page 0 in sorted
 * order </ul>
 */
public class JrxmlEditor extends AbstractJRXMLEditor implements IJROBjectEditor,
		 CachedSelectionProvider {
	
	/** The text editor used in page 0. */
	private ReportContainer reportContainer;

	/*
	 * (non-Javadoc)
	 * @see com.jaspersoft.studio.editor.AbstractJRXMLEditor#createDesignEditorPage()
	 */
	@Override
	protected void createDesignEditorPage() throws PartInitException {
		reportContainer = new ReportContainer(this, jrContext);
		reportContainer.addPageChangedListener(new IPageChangedListener() {

			public void pageChanged(PageChangedEvent event) {
				updateContentOutline(getActivePage());
			}
		});

		int index = addPage(reportContainer, getEditorInput());
		setPageText(index, Messages.JrxmlEditor_design);
	}

	/**
	 * @return the design editor
	 */
	public ReportContainer getReportContainer() {
		return reportContainer;
	}
	
	@Override
	protected String getEditorHelpID() {
		return "com.jaspersoft.studio.doc.editor_jrxml";
	}

	/**
	 * Gets the current active inner editor.
	 * The {@link ReportContainer} is itself a {@link MultiPageEditorPart}, so
	 * it can contains different opened editors (i.e. lists, tables, cross-tabs).
	 * 
	 * @return the second level active editor
	 */
	public IEditorPart getActiveEditor2() {
		IEditorPart iep = getActiveEditor();
		if (iep instanceof ReportContainer)
			return ((ReportContainer) iep).getActiveEditor();
		return iep;
	}

	/**
	 * Saves the multi-page editor's document.
	 * 
	 * @param monitor
	 *          the monitor
	 */
	@Override
	public void doSave(final IProgressMonitor monitor) {
		try {
			isRefresh = true;

			// Check for function library static imports (see issue #0005771)
			// It's better to put the check here instead on the JRExpressionEditor dialog close.
			// This allow for example to "fix" the report, depending on the preference setting,
			// also when simply saving the JRXML file without having edited an expression.
			JasperDesign jd = getJasperDesign();
			if (jd != null)
				ExpressionEditorSupportUtil.updateFunctionsLibraryImports(jd, jrContext);

			final IFile resource = getCurrentFile();
			if (resource == null)
				return;
			try {
				if (!resource.exists())
					resource.create(new ByteArrayInputStream("FILE".getBytes("UTF-8")), true, monitor);

				resource.setCharset("UTF-8", monitor);
				((IStorageDocumentProvider) xmlEditor.getDocumentProvider()).setEncoding(getEditorInput(), "UTF-8");
			} catch (CoreException e) {
				UIUtils.showError(e);
			} catch (UnsupportedEncodingException e) {
				UIUtils.showError(e);
			}
			if ((!xmlEditor.isDirty() && reportContainer.isDirty()) || getActiveEditor() != xmlEditor) {
				version = JRXmlWriterHelper.getVersion(resource, jrContext, true);
				model2xml(version);
			} else {
				IDocumentProvider dp = xmlEditor.getDocumentProvider();
				IDocument doc = dp.getDocument(xmlEditor.getEditorInput());
				try { // just go thru the model, to look what happend with our markers
					Markers.deleteMarkers(resource);

					xml2model();
				} catch (Throwable e) {
					Markers.addMarker(resource, e);
					doSaveEditors(monitor);// on eclipse 4.2.1 on first first save, for some reasons save is not working .., so
																	// we'll do it manually
					resource.setContents(new ByteArrayInputStream(doc.get().getBytes("UTF-8")), IFile.KEEP_HISTORY | IFile.FORCE,
							monitor);
					finishSave(resource);
					return;
				}
			}
			if (JRXMLUtils.getFileExtension(getEditorInput()).equals("")) { //$NON-NLS-1$
				// save binary
				try {
					new JasperReportsBuilder().compileJRXML(resource, monitor);
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
			UIUtils.getDisplay().syncExec(new Runnable() {

				@Override
				public void run() {
					if (isDirty())
						JaspersoftStudioPlugin.getExtensionManager().onSave(jrContext, monitor);
					try {
						String xml = model2xml(version);
						doSaveEditors(monitor);
						// on eclipse 4.2.1 on first first save, for some reasons save is not working .., so we'll do it manually
						resource.setContents(new ByteArrayInputStream(xml.getBytes("UTF-8")), IFile.KEEP_HISTORY | IFile.FORCE,
								monitor);
						finishSave(resource);
					} catch (Throwable e) {
						UIUtils.showError(e);
					}
				}
			});
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	private void doSaveEditors(final IProgressMonitor monitor) {
		xmlEditor.doSave(monitor);
		reportContainer.doSave(monitor);
		previewEditor.doSave(monitor);

		xmlEditor.isDirty();
		reportContainer.isDirty();
		previewEditor.isDirty();

		xmlFresh = true;
	}

	protected void finishSave(IFile resource) {
		String resourceAbsolutePath = resource.getRawLocation().toOSString();
		if (DefaultManager.INSTANCE.isCurrentDefault(resourceAbsolutePath)) {
			DefaultManager.INSTANCE.reloadCurrentDefault();
		}
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				isRefresh = false;
				firePropertyChange(ISaveablePart.PROP_DIRTY);
			}
		});
	}

	/**
	 * Saves the multi-page editor's document as another file. Also updates the text for page 0's tab, and updates this
	 * multi-page editor's input to correspond to the nested editor's.
	 */
	@Override
	public void doSaveAs() {
		SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());
		saveAsDialog.setOriginalFile(((FileEditorInput) getEditorInput()).getFile());
		if (saveAsDialog.open() == Dialog.OK) {
			IPath path = saveAsDialog.getResult();
			if (path != null) {
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
				if (file != null) {
					IProgressMonitor monitor = getActiveEditor().getEditorSite().getActionBars().getStatusLineManager()
							.getProgressMonitor();

					try {
						if (!file.exists())
							file.create(new ByteArrayInputStream("FILE".getBytes(JRXMLUtils.UTF8_ENCODING)), true, monitor);
						IFileEditorInput modelFile = new FileEditorInput(file);
						setInputWithNotify(modelFile);
						xmlEditor.setInput(modelFile);
						setPartName(file.getName());
						jrContext.init(file);

						doSave(monitor);
					} catch (CoreException e) {
						UIUtils.showError(e);
					} catch (UnsupportedEncodingException e) {
						UIUtils.showError(e);
					}
				}
			}
		}
	}


	@Override
	protected void handlePropertyChange(int propertyId) {
		if (!isRefresh) {
			if (propertyId == ISaveablePart.PROP_DIRTY && previewEditor != null)
				previewEditor.setDirty(true);
			super.handlePropertyChange(propertyId);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.jaspersoft.studio.editor.AbstractJRXMLEditor#updateVisualView()
	 */
	@Override
	public void updateVisualView() {
		if (reportContainer != null)
			reportContainer.setModel(getModel());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.ide.IGotoMarker
	 */
	public void gotoMarker(IMarker marker) {
		if (activePage == PAGE_DESIGNER) {
			try {
				Object expr = marker.getAttribute(JRErrorHandler.MARKER_ERROR_JREXPRESSION);
				if (expr != null && expr instanceof String) {
					JRDesignExpression expression = new JRDesignExpression();
					expression.setId(new Integer((String) expr));
					JasperDesign jd = getJasperDesign();
					JRExpressionCollector rc = JRExpressionCollector.collector(jrContext, jd);
					if (!VErrorPreview.openExpressionEditor(jrContext, rc, (JRDesignDataset) jd.getMainDataset(), expression))
						for (JRDataset d : jd.getDatasetsList())
							if (VErrorPreview.openExpressionEditor(jrContext, rc, (JRDesignDataset) d, expression))
								return;
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		setActivePage(PAGE_SOURCEEDITOR);
		IDE.gotoMarker(xmlEditor, marker);
	}

	/**
	 * Opens an editor (even an internal one), using the 
	 * specified object and Anode information.
	 */
	public void openEditor(Object obj, ANode node) {
		reportContainer.openEditor(obj, node);
	}

	/**
	 * FIXME: This method is currently commented because it's to heavy.
	 * Should implement a faster solution if possible.
	 */
	public void refreshExternalStyles(HashSet<String> removedStyles) {
		// Very very heavy method, leave commented for future improovments
		/*
		 * JasperDesign jrDesign = getMReport().getJasperDesign(); for(JRDesignElement element :
		 * ModelUtils.getAllElements(jrDesign)){ if (element.getStyleNameReference() != null &&
		 * removedStyles.contains(element.getStyleNameReference())){ String styleName = element.getStyleNameReference();
		 * element.setStyleNameReference(null); element.setStyleNameReference(styleName); } } StyleHandlingReportConverter
		 * reportConverter =
		 * ((AEditPartFactory)reportContainer.getMainEditor().getGraphicalViewer().getEditPartFactory()).getReportConverter
		 * (); if (reportConverter != null) reportConverter.resetStyles(jrDesign);
		 */
	}

	@Override
	public CommonSelectionCacheProvider getSelectionCache() {
		return reportContainer.getSelectionCache();
	}

	@Override
	protected boolean isDesignerDirty() {
		return reportContainer.isDirty();
	}

	@Override
	protected ISelection getDesignerPageSelection() {
		return reportContainer.getActiveEditor().getSite().getSelectionProvider().getSelection();
	}

	@Override
	protected void setDesignerPageSelection(ISelection newSelection) {
		reportContainer.getActiveEditor().getSite().getSelectionProvider().setSelection(newSelection);
	}

}
