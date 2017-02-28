/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.server;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.osgi.framework.BundleContext;

import com.jaspersoft.studio.server.ic.ICParameterContributor;
import com.jaspersoft.studio.server.plugin.ExtensionManager;

import net.sf.jasperreports.eclipse.AbstractJRUIPlugin;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractJRUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.jaspersoft.studio.server"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
	 * BundleContext )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	@Override
	protected void postStartOperations() {
		super.postStartOperations();

		ICParameterContributor.initMetadata();

		Job initParametersJob = new Job("Init JRS built-in parameters") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					JRSBuiltInParameterProvider.init();
				} catch (Exception ex) {
					logError(ex);
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		initParametersJob.setPriority(Job.LONG);
		initParametersJob.schedule(5000);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	private static ExtensionManager extensionManager;

	public static ExtensionManager getExtManager() {
		if (extensionManager == null) {
			extensionManager = new ExtensionManager();
			extensionManager.init();
		}
		return extensionManager;
	}

	@Override
	public String getPluginID() {
		return PLUGIN_ID;
	}

}
