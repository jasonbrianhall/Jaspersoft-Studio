/**
 *	Jaspersoft Open Studio - Visual Designer for JasperReports.
 * Copyright (C) 2005 - 2010 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of iReport.
 *
 * iReport is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * iReport is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with iReport. If not, see <http://www.gnu.org/licenses/>.
**/
package com.jaspersoft.studio.editor;

import java.util.Arrays;

import net.sf.jasperreports.eclipse.JasperReportsPlugin;
import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.IElementStateListener;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.compatibility.JRXmlWriterHelper;
import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.editor.defaults.DefaultManager;
import com.jaspersoft.studio.editor.outline.page.EmptyOutlinePage;
import com.jaspersoft.studio.editor.outline.page.MultiOutlineView;
import com.jaspersoft.studio.editor.preview.PreviewContainer;
import com.jaspersoft.studio.editor.report.ReportContainer;
import com.jaspersoft.studio.editor.xml.XMLEditor;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MReport;
import com.jaspersoft.studio.property.dataset.dialog.DataQueryAdapters;
import com.jaspersoft.studio.utils.Console;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

/**
 * @author mrabbi
 *
 */
public abstract class AbstractJRXMLEditor extends MultiPageEditorPart implements IResourceChangeListener, IMultiEditor {
	
	/** The constant for the page index of Design Editor  */
	public static final int PAGE_DESIGNER = 0;

	/** The constant for the page index of Source Editor */
	public static final int PAGE_SOURCEEDITOR = 1;

	/** The constant for the page index of Preview Editor */
	public static final int PAGE_PREVIEW = 2;
	
	/**
	 * Listener to execute the zoom-in or zoom-out operation when requested. It is static becuase it is placed on the
	 * display, so one get all the events
	 */
	private static Listener mouseWheelListener = new JRXMLEditorZoomListener();
	
	/** Model associated to the JRXML file */
	protected INode model = null;
	
	/** The configuration for the JRXML file */
	protected JasperReportsConfiguration jrContext;
	
	/** The outline associated to the editor */
	protected MultiOutlineView outlinePage;
	
	/** Flag for the XML status */
	protected boolean xmlFresh = true;

	protected boolean toXML = false;

	protected boolean isRefresh = false;
	
	protected boolean closing = false;
	
	/** The text editor used in page 0. */
	protected ReportContainer reportContainer;
	
	/** Xml editor used in page 1. */
	protected XMLEditor xmlEditor;
	
	/** Preview editor used in page 2. */
	protected PreviewEditor previewEditor;
	

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IResourceChangeListener#resourceChanged(org.eclipse.core.resources.IResourceChangeEvent)
	 */
	@Override
	public void resourceChanged(IResourceChangeEvent event) {

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.MultiPageEditorPart#createPages()
	 */
	@Override
	protected void createPages() {
		PlatformUI.getWorkbench().getHelpSystem().setHelp(getContainer(), getEditorHelpID());
		if (jrContext != null)
			try {
				createDesignEditorPage();
				createSourceEditorPage();				
				Display.getDefault().asyncExec(new Runnable() {

					@Override
					public void run() {
						try {
							createPreviewEditorPage();
							bindActionToKeys();
						} catch (PartInitException e) {
							UIUtils.showError(new Exception(Messages.common_error_creating_nested_visual_editor));
						}
					}
				});
			} catch (PartInitException e) {
				UIUtils.showError(new Exception(Messages.common_error_creating_nested_visual_editor));
			} catch (Throwable e) {
				closeEditorOnErrors();
				JaspersoftStudioPlugin.getInstance().logError(e);
			}
	}
	
	/**
	 * Closes the editor if there are some errors.
	 */
	protected void closeEditorOnErrors() {
		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (activeWorkbenchWindow != null) {
			final IWorkbenchPage apage = activeWorkbenchWindow.getActivePage();
			if (apage != null)
				Display.getDefault().asyncExec(new Runnable() {

					@Override
					public void run() {
						closing = true;
						apage.closeEditor(AbstractJRXMLEditor.this, false);
					}
				});
		}
	}

	/**
	 * Creates the Design Editor page.
	 * 
	 * @see #PAGE_DESIGNER
	 */
	protected abstract void createDesignEditorPage() throws PartInitException;
	
	/**
	 * Creates the Source Editor page.
	 * @throws PartInitException 
	 * 
	 * @see #PAGE_SOURCEEDITOR
	 */
	private void createSourceEditorPage() throws PartInitException {
		xmlEditor = new XMLEditor(jrContext);

		int index = addPage(xmlEditor, getEditorInput());
		setPageText(index, Messages.common_source);
		IDocument doc = xmlEditor.getDocumentProvider().getDocument(xmlEditor.getEditorInput());
		doc.addDocumentListener(new IDocumentListener() {

			public void documentChanged(DocumentEvent event) {
				xmlFresh = false;
				previewEditor.setDirty(true);
			}

			public void documentAboutToBeChanged(DocumentEvent event) {

			}
		});		
	}
	
	/**
	 * Creates the Preview Editor page.
	 * @throws PartInitException 
	 * 
	 * @see #PAGE_PREVIEW
	 */
	protected void createPreviewEditorPage() throws PartInitException {
		previewEditor = new PreviewEditor(false, jrContext);

		int index = addPage(previewEditor, getEditorInput());
		setPageText(index, Messages.JrxmlEditor_preview);

		xmlEditor.getDocumentProvider().addElementStateListener(new StateListener());
	}
	
	/**
	 * Bind some key combination to specific, it remove eventually the old ones to assure to have only on filter
	 * 
	 * FIXME: Verify the usage of the removeFilter and addFilter! 
	 */
	private void bindActionToKeys() {
		getContainer().getDisplay().removeFilter(org.eclipse.swt.SWT.MouseWheel, mouseWheelListener);
		getContainer().getDisplay().removeFilter(org.eclipse.swt.SWT.KeyDown, mouseWheelListener);
		getContainer().getDisplay().addFilter(org.eclipse.swt.SWT.MouseWheel, mouseWheelListener);
		getContainer().getDisplay().addFilter(org.eclipse.swt.SWT.KeyDown, mouseWheelListener);
	}
	
	/**
	 * @return the ID for the editor contextual help
	 */
	protected abstract String getEditorHelpID();

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#getAdapter(java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class type) {
		if (type == JasperReportsContext.class)
			return jrContext;
		if (type == IContentOutlinePage.class) {
			if (outlinePage == null)
				outlinePage = new MultiOutlineView(this);
			Display.getDefault().syncExec(new Runnable() {
				private boolean isUpdateOutline = false;

				public void run() {
					if (isUpdateOutline) {
						isUpdateOutline = true;
						updateContentOutline(getActivePage());
						isUpdateOutline = false;
					}
				}
			});
			return outlinePage;
		}
		return super.getAdapter(type);
	}
	
	/**
	 * Updates the Outline view content depending on the
	 * editor page currently opened.
	 * 
	 * @param page the page index
	 */
	protected void updateContentOutline(int page) {
		if (outlinePage == null)
			return;
		IContentOutlinePage outline = (IContentOutlinePage) getEditor(page).getAdapter(IContentOutlinePage.class);
		if (outline == null)
			outline = new EmptyOutlinePage();
		outlinePage.setPageActive(outline);
	}
	
	/**
	 * Converts the current model to XML, specifying a version 
	 * it should be compliant with.
	 * 
	 * @param the
	 *          JasperReports version that should be used for compliance.
	 */
	protected String model2xml(String version) {
		String xml = null;
		try {
			JasperDesign report = null;
			MReport mReport = getMReport();
			if (mReport != null) {
				report = mReport.getJasperDesign();
				Object obj = mReport.getParameter(DataQueryAdapters.DEFAULT_DATAADAPTER);
				if (obj != null && obj instanceof DataAdapterDescriptor) {
					String dataAdapterDesc = previewEditor.getDataAdapterDesc().getName();
					report.removeProperty(DataQueryAdapters.DEFAULT_DATAADAPTER);
					report.setProperty(DataQueryAdapters.DEFAULT_DATAADAPTER, dataAdapterDesc);
				}
			}

			xml = JRXmlWriterHelper.writeReport(jrContext, report, "UTF-8", version);
			IDocumentProvider dp = xmlEditor.getDocumentProvider();
			IDocument doc = dp.getDocument(xmlEditor.getEditorInput());
			if (xml != null && !Arrays.equals(doc.get().getBytes(), xml.getBytes())) {
				doc.set(xml);
			}
			xmlFresh = true;
		} catch (Throwable e) {
			UIUtils.showError(e);
		}
		return xml;
	}
	
	protected void model2xml() {
		model2xml("last");
	}
	
	/**
	 * Tells the preview editor that the model
	 * should be updated.
	 */
	protected void model2preview() {
		previewEditor.setJasperDesign(jrContext);
	}
	
	/**
	 * Update the visual designer.
	 */
	public abstract void updateVisualView();
	
	/**
	 * @return the model instance
	 */
	public INode getModel() {
		return model;
	}
	
	/**
	 * Sets the model.
	 * 
	 * @param model
	 *          the new model
	 */
	public void setModel(INode model) {
		this.model = model;
		updateVisualView();
		if (jrContext != null) {
			jrContext.setJasperDesign(getJasperDesign());
		}
	}
	
	/**
	 * @return the current report instance
	 */
	protected MReport getMReport() {
		if (model != null)
			return (MReport) model.getChildren().get(0);
		return null;
	}
	
	/**
	 * @return the jasper design of the current report
	 */
	protected JasperDesign getJasperDesign() {
		MReport mreport = getMReport();
		if (mreport != null)
			return mreport.getValue();
		return null;
	}
	
	/**
	 * Return the console area if available, null otherwise
	 */
	public Console getConsole() {
		if (previewEditor != null) {
			return previewEditor.getConsole();
		}
		return null;
	}
	
	@Override
	public IEditorPart getActiveEditor() {
		return super.getActiveEditor();
	}
	
	@Override
	public IEditorPart getEditor(int pageIndex) {
		// FIXME: Is it really necessary?????
		// Maybe we are doing something wrong before if we are forced
		// to verify that the container is disposed
		if (getContainer().isDisposed() || getPageCount() <= pageIndex)
			return null;
		return super.getEditor(pageIndex);
	}
	
	/**
	 * @return 
	 * 				the current {@link IFile} associated to the editor if possible, 
	 * 				<code>null</code> otherwise
	 */
	protected IFile getCurrentFile() {
		if (getEditorInput() instanceof IFileEditorInput)
			return ((IFileEditorInput) getEditorInput()).getFile();
		return null;
	}
	
	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		setModel(null);
		if (jrContext != null)
			jrContext.dispose();
		super.dispose();
	}

	
	// Accessory classes
	
	protected final class PreviewEditor extends PreviewContainer {
		public PreviewEditor(boolean listenResource, JasperReportsConfiguration jrContext) {
			super(listenResource, jrContext);
		}

		@Override
		public void runReport(com.jaspersoft.studio.data.DataAdapterDescriptor myDataAdapterDesc) {
			boolean shiftPressed = JasperReportsPlugin.isPressed(SWT.SHIFT);
			if (!shiftPressed) {
				if (myDataAdapterDesc != null) {
					JasperDesign jasperDesign = getJasperDesign();
					String oldp = jasperDesign.getProperty(DataQueryAdapters.DEFAULT_DATAADAPTER);
					if (oldp == null || (oldp != null && !oldp.equals(myDataAdapterDesc.getName()))) {
						getMReport().putParameter(DataQueryAdapters.DEFAULT_DATAADAPTER, myDataAdapterDesc);
						jasperDesign.setProperty(DataQueryAdapters.DEFAULT_DATAADAPTER, myDataAdapterDesc.getName());
						setDirty(true);
					}
				}
				super.runReport(myDataAdapterDesc);
			}
		}

		/**
		 * Set the dirty flag of the preview area, but only if it isn't refreshing
		 */
		public void setDirty(boolean dirty) {
			if (!isRefresh) {
				super.setDirty(dirty);
			}
		}
	}
	
	protected class StateListener implements IElementStateListener {

		@Override
		public void elementDirtyStateChanged(Object element, boolean isDirty) {
		}

		@Override
		public void elementContentAboutToBeReplaced(Object element) {
		}

		@Override
		public void elementContentReplaced(Object element) {
		}
		
		@Override
		public void elementDeleted(Object element) {
			IFile resource = getCurrentFile();
			String path = resource.getRawLocation().toOSString();
			DefaultManager.INSTANCE.removeDefaultFile(path);

			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					getSite().getPage().closeEditor(AbstractJRXMLEditor.this, false);
				}
			});
		}

		@Override
		public void elementMoved(Object originalElement, Object movedElement) {

		}
	}
	
}
