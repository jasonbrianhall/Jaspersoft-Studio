package com.jaspersoft.studio.help;

import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.HelpEvent;
import org.eclipse.swt.events.HelpListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;

public class HelpSystem {
	private HelpSystem() {
	}

	private static HelpSystem instance;

	public static HelpSystem getInstance() {
		if (instance == null)
			instance = new HelpSystem();
		return instance;
	}

	private static HelpListener helpListener;

	private HelpListener getHelpListener() {
		if (helpListener == null)
			helpListener = new HelpListener() {

				@Override
				public void helpRequested(HelpEvent e) {
					Object object = e.widget.getData(HELP_KEY);
					if (object != null && object instanceof String) {
						URL url = PlatformUI.getWorkbench().getHelpSystem().resolve((String) object, false);
						try {
							PlatformUI.getWorkbench().getHelpSystem().displayHelpResource(url.toURI().toASCIIString());
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
					}
				}
			};
		return helpListener;
	}

	public static final String HELP_KEY = "org.eclipse.ui.help";//$NON-NLS-1$

	public static void setHelp(final Control control, String href) {
		if (href == null)
			return;
		control.setData(HELP_KEY, href);
		// ensure that the listener is only registered once
		final HelpListener listener = getInstance().getHelpListener();
		control.removeHelpListener(listener);
		control.addHelpListener(listener);
		control.addDisposeListener(new DisposeListener() {

			@Override
			public void widgetDisposed(DisposeEvent e) {
				control.removeHelpListener(listener);
			}
		});
	}
}
