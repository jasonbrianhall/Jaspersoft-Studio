/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved. http://www.jaspersoft.com.
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.server.wizard.pages;

import java.security.cert.X509Certificate;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.PreferencesUtil;

import com.jaspersoft.studio.server.messages.Messages;
import com.jaspersoft.studio.server.preferences.TrustStorePreferencePage;
import com.jaspersoft.studio.server.protocol.restv2.CertificateDialog;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;

public class CertificatesDialog extends CertificateDialog {

	public CertificatesDialog(Shell parentShell, String message, X509Certificate client, X509Certificate[] chain) {
		super(parentShell, message, client, chain);
		setTitle(Messages.CertificatesDialog_0);
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, Messages.CertificatesDialog_1, true);
		createButton(parent, IDialogConstants.CANCEL_ID, Messages.CertificatesDialog_2, false);
	}

	@Override
	protected void okPressed() {
		PreferenceDialog pref = PreferencesUtil.createPreferenceDialogOn(UIUtils.getShell(),
				TrustStorePreferencePage.PAGE_ID, null, null);
		if (pref != null)
			pref.open();
	}

	@Override
	protected void createLabel1(Composite cmp) {
	}
}
