/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved. http://www.jaspersoft.com.
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.preferences.fonts;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.jaspersoft.studio.messages.Messages;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;

public class FontURLPage extends WizardPage {
	private String value;

	protected FontURLPage() {
		super("fontURLPage"); //$NON-NLS-1$
		setTitle(Messages.FontURLPage_0);
		setDescription(Messages.FontURLPage_1);
	}

	public String getValue() {
		return value;
	}

	@Override
	public void createControl(Composite parent) {
		Composite cmp = new Composite(parent, SWT.NONE);
		cmp.setLayout(new GridLayout());
		setControl(cmp);

		new Label(cmp, SWT.NONE).setText(Messages.FontURLPage_2);

		final Combo curl = new Combo(cmp, SWT.NONE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.widthHint = 800;
		curl.setLayoutData(gd);
		curl.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				try {
					if (!curl.getText().isEmpty()) {
						new URL(curl.getText());
						setErrorMessage(null);
						setPageComplete(true);
						value = curl.getText();
						return;
					}
				} catch (MalformedURLException e1) {
					e1.printStackTrace();
				}
				setPageComplete(false);
				setErrorMessage(Messages.JRRuntimeURLPage_4);
			}
		});
		UIUtils.getDisplay().asyncExec(new Runnable() {
			public void run() {
				curl.setItems(new String[] { "https://noto-website-2.storage.googleapis.com/pkgs/Noto-unhinted.zip", //$NON-NLS-1$
				});
			}

		});
	}

}
