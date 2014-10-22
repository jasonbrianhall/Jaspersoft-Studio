package com.jaspersoft.studio.book;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.wb.swt.ResourceManager;

import com.jaspersoft.studio.book.controls.GalleryComposite;
import com.jaspersoft.studio.book.controls.IGalleryElement;
import com.jaspersoft.studio.editor.outline.JDReportOutlineView;
import com.jaspersoft.studio.editor.preview.ABasicEditor;
import com.jaspersoft.studio.model.MReport;

public class JRBookDesignEditor extends ABasicEditor {

	private static final ImageDescriptor standardReportImgDesc;
	private JDReportOutlineView outlinePage;
	private MReport mReport;
	
	static {
		standardReportImgDesc = JRBookActivator.getDefault().getImageDescriptor("/icons/blankreport.png");
	}
	
	public JRBookDesignEditor(boolean listenResource) {
		super(listenResource);
	}

	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent,SWT.NONE);
		container.setLayout(new GridLayout(1,false));

		createGallery(container);
		
		//new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL).setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,false));
		
		createGallery(container);
		
		//new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL).setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,false));
		
		createGallery(container);
	}
	
	private void createGallery(Composite container) {
		GalleryComposite bookPartsGallery = new GalleryComposite(container, SWT.NONE);
		bookPartsGallery.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
		PageElement p1 = new PageElement(standardReportImgDesc, "/Users/mrabbi/Development/JaspersoftStudio/dev441/runtime-JSSBook-CE/MyReports/test/part1.jrxml");
		PageElement p2 = new PageElement(standardReportImgDesc, "/Users/mrabbi/Development/JaspersoftStudio/dev441/runtime-JSSBook-CE/MyReports/test/part2.jrxml");
		PageElement p3 = new PageElement(standardReportImgDesc, "/Users/mrabbi/Development/JaspersoftStudio/dev441/runtime-JSSBook-CE/MyReports/test/part3.jrxml");
		PageElement p4 = new PageElement(standardReportImgDesc, "/Users/mrabbi/Development/JaspersoftStudio/dev441/runtime-JSSBook-CE/MyReports/test/part4.jrxml");
		
		List<IGalleryElement> parts = new ArrayList<IGalleryElement>();
		parts.add(p1);
		parts.add(p2);
		parts.add(p3);
		parts.add(p4);
		
		bookPartsGallery.addElements(parts);
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

}
