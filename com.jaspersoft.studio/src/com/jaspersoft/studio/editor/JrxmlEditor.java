/*******************************************************************************
 * Copyright (C) 2010 - 2012 Jaspersoft Corporation. All rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jaspersoft Studio Team - initial API and implementation
 ******************************************************************************/
package com.jaspersoft.studio.editor;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import net.sf.jasperreports.eclipse.builder.JasperReportsBuilder;
import net.sf.jasperreports.eclipse.builder.JasperReportsNature;
import net.sf.jasperreports.eclipse.wizard.project.JRProjectWizard;
import net.sf.jasperreports.engine.DefaultJasperReportsContext;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.FileResolver;
import net.sf.jasperreports.engine.xml.JRXmlDigesterFactory;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import org.eclipse.core.internal.resources.ResourceException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.IElementStateListener;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.compatibility.JRXmlWriterHelper;
import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.editor.expression.ExpressionEditorSupportUtil;
import com.jaspersoft.studio.editor.outline.page.EmptyOutlinePage;
import com.jaspersoft.studio.editor.outline.page.MultiOutlineView;
import com.jaspersoft.studio.editor.preview.PreviewContainer;
import com.jaspersoft.studio.editor.report.ReportContainer;
import com.jaspersoft.studio.editor.xml.XMLEditor;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MReport;
import com.jaspersoft.studio.model.util.ReportFactory;
import com.jaspersoft.studio.plugin.AContributorAction;
import com.jaspersoft.studio.property.dataset.dialog.DataQueryAdapters;
import com.jaspersoft.studio.utils.JRXMLUtils;
import com.jaspersoft.studio.utils.UIUtils;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;
import com.jaspersoft.studio.utils.jasper.ProxyFileResolver;

/*
 * An example showing how to create a multi-page editor. This example has 3 pages: <ul> <li>page 0 contains a nested
 * text editor. <li>page 1 allows you to change the font used in page 2 <li>page 2 shows the words in page 0 in sorted
 * order </ul>
 */
public class JrxmlEditor extends MultiPageEditorPart implements IResourceChangeListener, IGotoMarker, IJROBjectEditor {

	public static final String DEFAULT_PROJECT = "MyReports";

	private class StateListener implements IElementStateListener {

		public void elementDirtyStateChanged(Object element, boolean isDirty) {

		}

		public void elementContentAboutToBeReplaced(Object element) {

		}

		public void elementContentReplaced(Object element) {

		}

		public void elementDeleted(Object element) {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					getSite().getPage().closeEditor(JrxmlEditor.this, false);
				}
			});
		}

		public void elementMoved(Object originalElement, Object movedElement) {

		}

	}

	private final class PreviewEditor extends PreviewContainer {
		public PreviewEditor(boolean listenResource, JasperReportsConfiguration jrContext) {
			super(listenResource, jrContext);
		}

		@Override
		public void runReport(com.jaspersoft.studio.data.DataAdapterDescriptor myDataAdapterDesc) {
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

		public void setDirty(boolean dirty) {
			if (!isRefresh) {
				this.isDirty = dirty;
				if (dirty)
					isRunDirty = true;
			}
		}

	}

	/** The Constant PAGE_DESIGNER. */
	public static final int PAGE_DESIGNER = 0;

	/** The Constant PAGE_XMLEDITOR. */
	public static final int PAGE_XMLEDITOR = 1;

	/** The Constant PAGE_PREVIEW. */
	public static final int PAGE_PREVIEW = 2;

	/** The model. */
	private INode model = null;

	/** The text editor used in page 0. */
	private ReportContainer reportContainer;
	/** Xml editor used in page 1. */
	private XMLEditor xmlEditor;

	private JasperReportsConfiguration jrContext;

	/**
	 * Creates a multi-page editor example.
	 */
	public JrxmlEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this,
				IResourceChangeEvent.PRE_CLOSE | IResourceChangeEvent.PRE_DELETE | IResourceChangeEvent.POST_CHANGE);
	}

	/**
	 * Creates page 1 of the multi-page editor, which allows you to change the font used in page 2.
	 */
	void createPage0() throws PartInitException {
		reportContainer = new ReportContainer(this, jrContext);
		reportContainer.addPageChangedListener(new IPageChangedListener() {

			public void pageChanged(PageChangedEvent event) {
				updateContentOutline(PAGE_DESIGNER);
			}
		});

		int index = addPage(reportContainer, getEditorInput());
		setPageText(index, Messages.JrxmlEditor_design);
	}

	/**
	 * Creates page 0 of the multi-page editor, which contains a text editor.
	 */
	void createPage1() throws PartInitException {
		xmlEditor = new XMLEditor(jrContext);
		int index = addPage(xmlEditor, getEditorInput());
		setPageText(index, Messages.common_source);
		xmlEditor.getDocumentProvider().getDocument(xmlEditor.getEditorInput())
				.addDocumentListener(new IDocumentListener() {

					public void documentChanged(DocumentEvent event) {
						xmlFresh = false;
						previewEditor.setDirty(true);
					}

					public void documentAboutToBeChanged(DocumentEvent event) {

					}
				});
	}

	/**
	 * Creates page 2 of the multi-page editor, which shows the sorted text.
	 */
	void createPage2() throws PartInitException {
		previewEditor = new PreviewEditor(false, jrContext);

		int index = addPage(previewEditor, getEditorInput());
		setPageText(index, Messages.JrxmlEditor_preview);

		xmlEditor.getDocumentProvider().addElementStateListener(new StateListener());

		// IPropertyListener l = new IPropertyListener() {
		//
		// @Override
		// public void propertyChanged(Object source, int propId) {
		// if(p)
		// previewEditor.setDirty(true);
		// }
		// };
		// reportContainer.addPropertyListener(l);
		// xmlEditor.addPropertyListener(l);
	}

	/**
	 * Creates the pages of the multi-page editor.
	 */
	@Override
	protected void createPages() {
		// CTabFolder ctfolder = (CTabFolder) getContainer();
		// ctfolder.setUnselectedCloseVisible(true);
		//
		// ToolBar toolBar = new ToolBar(ctfolder, SWT.FLAT | SWT.HORIZONTAL | SWT.WRAP | SWT.RIGHT);
		// ToolItem item = new ToolItem(toolBar, SWT.PUSH);
		// item.setText("+ ");
		// item = new ToolItem(toolBar, SWT.PUSH);
		// item.setText("- ");
		// item = new ToolItem(toolBar, SWT.PUSH);
		// item.setText(">> ");
		//
		// int tabHeight = toolBar.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
		// tabHeight = Math.max(tabHeight, ctfolder.getTabHeight());
		// ctfolder.setTabHeight(tabHeight);
		//
		// ctfolder.setTopRight(toolBar);
		try {
			createPage0();
			createPage1();
			createPage2();
		} catch (PartInitException e) {
			UIUtils.showError(new Exception(Messages.common_error_creating_nested_visual_editor));
		} catch (Throwable e) {
			closeEditor();
		}
	}

	@Override
	public IEditorPart getActiveEditor() {
		return super.getActiveEditor();
	}

	public IEditorPart getActiveEditor2() {
		IEditorPart iep = getActiveEditor();
		if (iep instanceof ReportContainer)
			return ((ReportContainer) iep).getActiveEditor();
		return iep;
	}

	@Override
	public IEditorPart getEditor(int pageIndex) {
		return super.getEditor(pageIndex);
	}

	private MultiOutlineView outlinePage;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#getAdapter(java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class type) {
		if (type == IContentOutlinePage.class) {
			outlinePage = new MultiOutlineView(this);
			Display.getDefault().asyncExec(new Runnable() {

				public void run() {
					updateContentOutline(getActivePage());
				}
			});
			return outlinePage;
		}
		return super.getAdapter(type);
	}

	private void updateContentOutline(int page) {
		if (outlinePage == null)
			return;
		IContentOutlinePage outline = null;

		outline = (IContentOutlinePage) getEditor(page).getAdapter(IContentOutlinePage.class);
		if (outline == null)
			outline = new EmptyOutlinePage();

		outlinePage.setPageActive(outline);

	}

	/**
	 * The <code>MultiPageEditorPart</code> implementation of this <code>IWorkbenchPart</code> method disposes all nested
	 * editors. Subclasses may extend.
	 */
	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		setModel(null);
		if (jrContext != null)
			jrContext.dispose();
		super.dispose();
	}

	boolean isRefresh = false;

	/**
	 * Saves the multi-page editor's document.
	 * 
	 * @param monitor
	 *          the monitor
	 */
	@Override
	public void doSave(final IProgressMonitor monitor) {
		isRefresh = true;

		// Check for function library static imports (see issue #0005771)
		// It's better to put the check here instead on the JRExpressionEditor dialog close.
		// This allow for example to "fix" the report, depending on the preference setting,
		// also when simply saving the JRXML file without having edited an expression.
		JasperDesign jd = getJasperDesign();
		if (jd != null)
			ExpressionEditorSupportUtil.updateFunctionsLibraryImports(jd, jrContext);

		IFile resource = getCurrentFile();
		try {
			if (!resource.exists())
				resource.create(new ByteArrayInputStream("FILE".getBytes("UTF-8")), true, monitor);

			resource.setCharset("UTF-8", monitor);
		} catch (CoreException e) {
			UIUtils.showError(e);
		} catch (UnsupportedEncodingException e) {
			UIUtils.showError(e);
		}
		if ((!xmlEditor.isDirty() && reportContainer.isDirty()) || getActiveEditor() != xmlEditor) {
			version = JRXmlWriterHelper.getVersion(resource, jrContext, true);
			model2xml(version);
		} else {
			try { // just go thru the model, to look what happend with our markers
				resource.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
				xml2model();
			} catch (Exception e) {
				if (e instanceof JRException && e.getCause() instanceof SAXParseException) {
					SAXParseException se = (SAXParseException) e.getCause();
					try {
						// resource.deleteMarkers(JasperReportsBuilder.MARKER_TYPE, includeSubtypes, depth)
						IMarker marker = resource.createMarker(JasperReportsBuilder.MARKER_TYPE);
						marker.setAttribute(IMarker.MESSAGE, se.getMessage());
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
						marker.setAttribute(IMarker.USER_EDITABLE, false);
						marker.setAttribute(IMarker.LINE_NUMBER, se.getLineNumber());
						marker.setAttribute(IMarker.CHAR_END, se.getColumnNumber());
					} catch (CoreException ce) {
					}
				}
				xmlEditor.doSave(monitor);
				return;
			}
		}
		if (getFileExtension(getEditorInput()).equals("")) { //$NON-NLS-1$
			// save binary
			try {
				new JasperReportsBuilder().compileJRXML(resource, monitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				JaspersoftStudioPlugin.getExtensionManager().onSave(jrContext, monitor);
				try {
					model2xml(version);
					doSaveEditors(monitor);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		// doSaveEditors(monitor);
	}

	private IFile getCurrentFile() {
		return ((IFileEditorInput) getEditorInput()).getFile();
	}

	private void doSaveEditors(final IProgressMonitor monitor) {
		xmlEditor.doSave(monitor);
		reportContainer.doSave(monitor);
		previewEditor.doSave(monitor);

		xmlEditor.isDirty();
		reportContainer.isDirty();
		previewEditor.isDirty();

		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				isRefresh = false;
				firePropertyChange(ISaveablePart.PROP_DIRTY);
			}
		});

		xmlFresh = true;
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
							file.create(new ByteArrayInputStream("FILE".getBytes("UTF-8")), true, monitor);
						IFileEditorInput modelFile = new FileEditorInput(file);
						setInputWithNotify(modelFile);
						xmlEditor.setInput(modelFile);
						setPartName(file.getName());

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

	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method checks that the input is an instance of
	 * <code>IFileEditorInput</code>.
	 * 
	 * @param site
	 *          the site
	 * @param editorInput
	 *          the editor input
	 * @throws PartInitException
	 *           the part init exception
	 */
	@Override
	public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {
		// FIXME: THIS IS NOT THE RIGHT PLACE TO LOAD MODEL, WE SHOULD LOAD FROM
		// TEXT EDITOR TO AVOID 2 TIME READING THE FILE
		editorInput = checkAndConvertEditorInput(editorInput);
		super.init(site, editorInput);
		setPartName(editorInput.getName());
		InputStream in = null;
		IFile file = null;
		try {
			if (editorInput instanceof IFileEditorInput) {
				file = ((IFileEditorInput) editorInput).getFile();
				file.refreshLocal(0, new NullProgressMonitor());

				in = file.getContents();
			} else
				throw new PartInitException("Invalid Input: Must be IFileEditorInput or FileStoreEditorInput"); //$NON-NLS-1$

			getJrContext(file);

			in = getXML(jrContext, editorInput, file.getCharset(true), in, version);

			InputSource is = new InputSource(new InputStreamReader(in, "UTF-8"));

			JasperDesign jd = new JRXmlLoader(JRXmlDigesterFactory.createDigester()).loadXML(is);
			JaspersoftStudioPlugin.getExtensionManager().onLoad(jd, this);
			// NO LONGER AVAILABLE IN GLOBAL TOOLBAR SINCE
			// THEY WILL BE VISIBLE IN THE ReportContainer toolbar.
			// editorActions = JaspersoftStudioPlugin.getExtensionManager().getActions();
			// for (AContributorAction a : editorActions) {
			// a.setJrConfig(jrContext);
			// ((JrxmlEditorContributor) getEditorSite().getActionBarContributor()).addGlobaRetargetAction(a);
			// }
			if (!isRefresh) {
				jrContext.setJasperDesign(jd);
				setModel(ReportFactory.createReport(jrContext));
			}
		} catch (JRException e) {
			setModel(null);
			handleJRException(editorInput, e, false);
		} catch (ResourceException e) {
			if (e.getMessage().startsWith("File not found")) {
				closeEditor();
			} else {
				setModel(null);
				handleJRException(editorInput, e, false);
			}
		} catch (Exception e) {
			setModel(null);
			throw new PartInitException(e.getMessage(), e);
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
					setModel(null);
					throw new PartInitException("error closing input stream", e); //$NON-NLS-1$
				}
		}
	}

	private void closeEditor() {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().closeEditor(JrxmlEditor.this, false);
	}

	public static IEditorInput checkAndConvertEditorInput(IEditorInput editorInput) throws PartInitException {
		if (editorInput instanceof FileStoreEditorInput) {
			try {
				FileStoreEditorInput fsei = (FileStoreEditorInput) editorInput;
				IPath location = new Path(fsei.getURI().getPath());
				// Create a new temporary project object and open it.
				IProject project = null;
				for (IProject prj : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
					if (prj.isOpen()) {
						if (project == null)
							project = prj;
						else if (prj.getNature(JasperReportsNature.NATURE_ID) != null)
							project = prj;
						if (project != null && project.getName().equals(DEFAULT_PROJECT))
							break;
					}
				}
				if (project == null)
					project = ResourcesPlugin.getWorkspace().getRoot().getProject(DEFAULT_PROJECT);
				// Create a project if one doesn't exist and open it.
				if (!project.exists()) {
					project.create(null);
					JRProjectWizard.createJRProject(null, project);
				}
				if (!project.isOpen())
					project.open(null);

				IFile file = project.getFile(location.lastSegment());
				file.createLink(location, IResource.REPLACE, null);

				editorInput = new FileEditorInput(file);
			} catch (CoreException e) {
				throw new PartInitException(e.getMessage(), e);
			}
		}
		return editorInput;
	}

	public void addFileResolver(FileResolver resolver) {
		((ProxyFileResolver) jrContext.getFileResolver()).addResolver(resolver);
	}

	protected void getJrContext(IFile file) throws CoreException, JavaModelException {
		if (jrContext == null) {
			jrContext = new JasperReportsConfiguration(DefaultJasperReportsContext.getInstance(), file);

		}
	}

	public static String getFileExtension(IEditorInput editorInput) {
		String fileExtention = ""; //$NON-NLS-1$
		if (editorInput instanceof FileStoreEditorInput) {
			String path = ((FileStoreEditorInput) editorInput).getURI().getPath();
			fileExtention = path.substring(path.lastIndexOf(".") + 1, path.length()); //$NON-NLS-1$
		} else if (editorInput instanceof IFileEditorInput) {
			fileExtention = ((IFileEditorInput) editorInput).getFile().getFileExtension();
		}
		return fileExtention;
	}

	public static InputStream getXML(JasperReportsConfiguration jrContext, IEditorInput editorInput, String encoding,
			InputStream in, String version) throws JRException {
		String fileExtension = getFileExtension(editorInput);
		InputStream jrxmlInputStream = JRXMLUtils.getJRXMLInputStream(jrContext, in, fileExtension, encoding, version);
		return jrxmlInputStream != null ? jrxmlInputStream : in;
	}

	/**
	 * Handle jr exception.
	 * 
	 * @param editorInput
	 *          the editor input
	 * @param e
	 *          the e
	 * @param mute
	 *          the mute
	 */
	public void handleJRException(IEditorInput editorInput, final Exception e, boolean mute) {
		if (!mute)
			UIUtils.showError(e);
		try {
			int lineNumber = 0;
			if (e.getCause() instanceof SAXParseException) {
				SAXParseException saxe = (SAXParseException) e.getCause();
				lineNumber = saxe.getLineNumber();
			}
			IResource resource = ((IFileEditorInput) editorInput).getFile();
			resource.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);

			final IMarker marker = resource.createMarker(IMarker.PROBLEM);
			marker.setAttribute(IMarker.MESSAGE, e.getMessage());
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
			marker.setAttribute(IMarker.TRANSIENT, true);
			marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			marker.setAttribute(IMarker.USER_EDITABLE, false);

			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					gotoMarker(marker);
					setActivePage(PAGE_XMLEDITOR);
				}
			});
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	protected void handlePropertyChange(int propertyId) {
		if (!isRefresh) {
			if (propertyId == ISaveablePart.PROP_DIRTY)
				previewEditor.setDirty(true);
			super.handlePropertyChange(propertyId);
		}
	}

	/*
	 * (non-Javadoc) Method declared on IEditorPart.
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/** The xml fresh. */
	private boolean xmlFresh = true;

	private PreviewEditor previewEditor;

	/**
	 * Calculates the contents of page 2 when the it is activated.
	 * 
	 * @param newPageIndex
	 *          the new page index
	 */
	@Override
	protected void pageChange(int newPageIndex) {
		if (newPageIndex == PAGE_DESIGNER || newPageIndex == PAGE_XMLEDITOR || newPageIndex == PAGE_PREVIEW) {
			if (activePage == PAGE_DESIGNER)
				tmpselection = reportContainer.getActiveEditor().getSite().getSelectionProvider().getSelection();
			switch (newPageIndex) {
			case PAGE_DESIGNER:
				if (activePage == PAGE_XMLEDITOR && !xmlFresh) {
					try {
						xml2model();
					} catch (Exception e) {
						handleJRException(getEditorInput(), e, false);
					}
					updateVisualView();
				} else if (activePage == PAGE_DESIGNER) {
					updateVisualView();
				} else {
					// stop running reports
					previewEditor.getReportControler().stop();
				}
				Display.getDefault().syncExec(new Runnable() {

					@Override
					public void run() {
						reportContainer.getActiveEditor().getSite().getSelectionProvider().setSelection(tmpselection);
					}
				});
				break;
			case PAGE_XMLEDITOR:
				if (reportContainer.isDirty())
					model2xml();
				break;
			case PAGE_PREVIEW:
				if (activePage == PAGE_XMLEDITOR)
					try {
						xml2model();
					} catch (Exception e) {
						handleJRException(getEditorInput(), e, false);
					}
				else if (reportContainer.isDirty()) {
					isRefresh = true;
					model2xml();
					isRefresh = false;
				}
				model2preview();
				break;
			}
		}
		super.pageChange(newPageIndex);
		updateContentOutline(getActivePage());
		activePage = newPageIndex;
	}

	private ISelection tmpselection;
	private int activePage = 0;

	private String version = "last";

	private List<AContributorAction> editorActions;

	/**
	 * Xml2model.
	 * 
	 * @throws JRException
	 *           the jR exception
	 */
	private void xml2model() throws Exception {
		InputStream in = null;
		try {
			IDocumentProvider dp = xmlEditor.getDocumentProvider();
			IDocument doc = dp.getDocument(xmlEditor.getEditorInput());

			in = new ByteArrayInputStream(doc.get().getBytes());
			InputSource is = new InputSource(new InputStreamReader(in, "UTF-8"));

			JasperDesign jd = new JRXmlLoader(JRXmlDigesterFactory.createDigester()).loadXML(is);
			jrContext.setJasperDesign(jd);
			setModel(ReportFactory.createReport(jrContext));
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void model2xml() {
		model2xml("last");
	}

	/**
	 * Model2xml.
	 */
	private void model2xml(String version) {
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

			String xml = JRXmlWriterHelper.writeReport(jrContext, report, "UTF-8", version);
			IDocumentProvider dp = xmlEditor.getDocumentProvider();
			IDocument doc = dp.getDocument(xmlEditor.getEditorInput());

			doc.set(xml);
			xmlFresh = true;
		} catch (final Exception e) {
			UIUtils.showError(e);
		}
	}

	protected JasperDesign getJasperDesign() {
		MReport mreport = getMReport();
		if (mreport != null)
			return mreport.getValue();
		return null;
	}

	/**
	 * Model2xml.
	 */
	private void model2preview() {
		previewEditor.setJasperDesign(jrContext);
	}

	/**
	 * Closes all project files on project close.
	 * 
	 * @param event
	 *          the event
	 */
	public void resourceChanged(final IResourceChangeEvent event) {
		switch (event.getType()) {
		case IResourceChangeEvent.PRE_CLOSE:
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for (int i = 0; i < pages.length; i++) {
						if (((FileEditorInput) xmlEditor.getEditorInput()).getFile().getProject().equals(event.getResource())) {
							IEditorPart editorPart = pages[i].findEditor(xmlEditor.getEditorInput());
							pages[i].closeEditor(editorPart, true);
						}
					}
				}
			});
			break;
		case IResourceChangeEvent.PRE_DELETE:
			break;
		case IResourceChangeEvent.POST_CHANGE:
			try {
				DeltaVisitor visitor = new DeltaVisitor(this);
				event.getDelta().accept(visitor);
			} catch (CoreException e) {
				UIUtils.showError(e);
			}
			break;
		case IResourceChangeEvent.PRE_BUILD:
		case IResourceChangeEvent.POST_BUILD:
			break;
		}
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
		if (jrContext != null)
			jrContext.setJasperDesign(getJasperDesign());
	}

	private MReport getMReport() {
		if (model != null)
			return (MReport) model.getChildren().get(0);
		return null;
	}

	/**
	 * Gets the model.
	 * 
	 * @return the model
	 */
	public INode getModel() {
		return model;
	}

	/**
	 * Update visual view.
	 */
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
		setActivePage(PAGE_XMLEDITOR);
		IDE.gotoMarker(xmlEditor, marker);
	}

	public void openEditor(Object obj, ANode node) {
		reportContainer.openEditor(obj, node);
	}

}
