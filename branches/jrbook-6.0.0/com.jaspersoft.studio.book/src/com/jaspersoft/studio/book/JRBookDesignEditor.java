package com.jaspersoft.studio.book;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import com.jaspersoft.studio.editor.outline.JDReportOutlineView;
import com.jaspersoft.studio.editor.preview.ABasicEditor;

public class JRBookDesignEditor extends ABasicEditor {

	private JDReportOutlineView outlinePage;
	
	public JRBookDesignEditor(boolean listenResource) {
		super(listenResource);
	}

	@Override
	public void createPartControl(Composite parent) {
		Composite cmp = new Composite(parent,SWT.NONE);
		cmp.setLayout(new GridLayout(1,false));
		
		Label lbl = new Label(cmp,SWT.NONE);
		lbl.setText("MAIN DESIGNER FOR JASPERREPORTS BOOK -- TO BE DONE!");
		lbl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
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

}
