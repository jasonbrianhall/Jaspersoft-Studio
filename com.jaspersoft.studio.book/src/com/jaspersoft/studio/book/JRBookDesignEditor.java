package com.jaspersoft.studio.book;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import com.jaspersoft.studio.book.editors.ReportPartGalleryElement;
import com.jaspersoft.studio.book.gallery.controls.GalleryComposite;
import com.jaspersoft.studio.book.gallery.implementations.PageOpener;
import com.jaspersoft.studio.book.gallery.interfaces.IGalleryElement;
import com.jaspersoft.studio.editor.outline.JDReportOutlineView;
import com.jaspersoft.studio.editor.preview.ABasicEditor;
import com.jaspersoft.studio.model.MReport;
import com.jaspersoft.studio.model.book.IReportPartContainer;
import com.jaspersoft.studio.model.book.MReportPart;
import com.jaspersoft.studio.model.book.MReportPartGroupFooter;
import com.jaspersoft.studio.model.book.MReportPartGroupHeader;
import com.jaspersoft.studio.model.book.MReportPartSection;
import com.jaspersoft.studio.utils.ModelUtils;

public class JRBookDesignEditor extends ABasicEditor {

	private JDReportOutlineView outlinePage;
	private MReport mReport;
	private Composite mainContainer;
	private Composite parent;
	private ModifyListener galleryChangeListener;
	
	public JRBookDesignEditor(boolean listenResource) {
		super(listenResource);
	}

	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		refreshEditor();
	}

	private void createGroupHeaderGalleries() {
		List<MReportPartGroupHeader> headers = ModelUtils.getPartGroupHeaders(mReport);
		for(MReportPartGroupHeader h : headers){
			createGallery(mainContainer, h);
		}
	}
	
	private void createDetailGallery() {
		MReportPartSection detail = ModelUtils.getPartDetailSection(mReport);
		if(detail!=null){
			createGallery(mainContainer, detail);
		}
	}

	private void createGroupFooterGalleries() {
		List<MReportPartGroupFooter> footers = ModelUtils.getPartGroupFooters(mReport);
		for(MReportPartGroupFooter f : footers){
			createGallery(mainContainer, f);
		}
	}

	private GalleryComposite createGallery(Composite container, IReportPartContainer partsContainer) {
		IWorkbench currentWorkbench = getSite().getWorkbenchWindow().getWorkbench();
		GalleryComposite bookPartsGallery = new GalleryComposite(currentWorkbench, container, SWT.NONE);
		bookPartsGallery.addElementOpener(new PageOpener());
		bookPartsGallery.setPartsContainer(partsContainer);
		bookPartsGallery.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));

		List<IGalleryElement> galleryElements = new ArrayList<IGalleryElement>();		
		for(MReportPart part : partsContainer.getReportParts()) {
			galleryElements.add(new ReportPartGalleryElement(part));
		}
		
		bookPartsGallery.addElements(galleryElements);
		bookPartsGallery.addModifyListener(getGalleryChangeListener());
		return bookPartsGallery;
	}

	@Override
	public void setFocus() {
		
	}
	
	@Override
	public Object getAdapter(Class adapter) {
		if(adapter==IContentOutlinePage.class){
			return getOutlineView();
		}
		return super.getAdapter(adapter);
	}

	private JDReportOutlineView getOutlineView() {
		// TODO Implement Outline
		// See if something can be re-used by the JDReportOutlineView class
		return null;
	}

	public void setReportDetails(MReport mReport) {
		this.mReport = mReport;
	}

	public void refreshEditor() {
		if(mainContainer!=null) {
			mainContainer.dispose();
		}
		if(parent!=null && !parent.isDisposed()){
			mainContainer = new Composite(parent,SWT.NONE);
			mainContainer.setLayout(new GridLayout(1,false));
			createGroupHeaderGalleries();
			createDetailGallery();
			createGroupFooterGalleries();
			parent.layout();
		}
	}

	private ModifyListener getGalleryChangeListener() {
		if(galleryChangeListener==null){
			galleryChangeListener = new ModifyListener() {
				@Override
				public void modifyText(ModifyEvent e) {
					isDirty = true;
					JRBookDesignEditor.this.firePropertyChange(PROP_DIRTY);
				}
			};
		}
		return galleryChangeListener;
	}
}
