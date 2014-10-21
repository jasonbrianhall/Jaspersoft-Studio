package com.jaspersoft.studio.book;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.jaspersoft.studio.editor.preview.ABasicEditor;

public class JRBookDesignEditor extends ABasicEditor {

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


}
