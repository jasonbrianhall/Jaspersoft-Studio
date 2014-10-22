package com.jaspersoft.studio.book.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.jaspersoft.studio.book.messages.messages"; //$NON-NLS-1$
	public static String PageOpener_actionName;
	public static String PageOpener_dialogTitle;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
