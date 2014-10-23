/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.book.bundle;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.eclipse.util.FileUtils;
import net.sf.jasperreports.engine.JRPart;
import net.sf.jasperreports.engine.JRPropertiesMap;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.part.PartComponent;
import net.sf.jasperreports.engine.util.JRExpressionUtil;
import net.sf.jasperreports.parts.subreport.SubreportPartComponent;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.wizard.WizardPage;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.templates.engine.DefaultTemplateEngine;
import com.jaspersoft.studio.utils.ModelUtils;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;
import com.jaspersoft.studio.wizards.ReportNewWizard;
import com.jaspersoft.studio.wizards.WizardUtils;
import com.jaspersoft.studio.wizards.datasource.ReportWizardDataSourceDynamicPage;
import com.jaspersoft.templates.ReportBundle;
import com.jaspersoft.templates.TemplateBundle;
import com.jaspersoft.templates.TemplateEngine;
import com.jaspersoft.templates.WizardTemplateBundle;

/**
 * Template bundle for the book template
 * 
 * @author Orlandin Marco
 *
 */
public class BookTemplateBundle extends WizardTemplateBundle {

	/**
	 * Key for the attribute to create or not a book cover
	 */
	public static final String COVER_SETTING = "book_cover";
	
	/**
	 * Key for the attribute to create or not the toc
	 */
	public static final String TOC_SETTING = "book_toc";
	
	/**
	 * Key for the attribute to create or not the book back cover
	 */
	public static final String BACK_COVER_SETTING = "book_backcover";
	
	/**
	 * First page of the wizard where the dataset can be chosen
	 */
	private BookWizardDataSourceDynamicPage step1 = null;
	
	/**
	 * Second page of the wizard where the fields can be chosen
	 */
	private BookWizardFieldsDynamicPage step2 = null;
	
	/**
	 * Thir page of the wizard where the section to create can be chosen
	 */
	private BookWizardSectionsDynamicPage step3 = null;
	
	
	public BookTemplateBundle(URL url, boolean isExternal, JasperReportsContext jrContext) throws Exception {
		super(url, isExternal, jrContext);
	}
	
	public BookTemplateBundle(URL url, JasperReportsContext jrContext) throws Exception {
		super(url, jrContext);
	}
	

	@Override
	public IFile doFinish(ReportNewWizard mainWizard, IProgressMonitor monitor) throws CoreException {
		IFile reportFile = null;
		Map<String, Object> settings = mainWizard.getSettings();
		
		String containerName = (String)settings.get(ReportNewWizard.CONTAINER_NAME_KEY);
		String fileName = (String)settings.get(ReportNewWizard.FILE_NAME_KEY);
		
		monitor.beginTask(Messages.ReportNewWizard_3 + fileName, 2);

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException(String.format(Messages.ReportNewWizard_4, containerName));
		}
		
		JasperReportsConfiguration jConfig = mainWizard.getConfig();
		Map<String, Object> templateSettings = new HashMap<String, Object>();
		TemplateBundle templateBundle = mainWizard.getTemplateChooserStep().getTemplateBundle();
		
		JRDesignDataset dataset = WizardUtils.createDataset(jConfig, true, settings);
		
		//Copy the informations from the wizard inside the map passed to the template engine
		
		templateSettings.put(DefaultTemplateEngine.DATASET, dataset);
		templateSettings.put(ReportNewWizard.CONTAINER_NAME_KEY, containerName);
		templateSettings.put(ReportNewWizard.FILE_NAME_KEY, fileName);

		if (settings.containsKey(BookWizardDataSourceDynamicPage.DATASET_FIELDS)) {
			templateSettings.put(DefaultTemplateEngine.FIELDS, settings.get(BookWizardDataSourceDynamicPage.DATASET_FIELDS));
		}

		if (settings.containsKey(BookWizardDataSourceDynamicPage.GROUP_FIELDS)) {
			templateSettings.put(DefaultTemplateEngine.GROUP_FIELDS, settings.get(BookWizardDataSourceDynamicPage.GROUP_FIELDS));
		}
		
		if (settings.containsKey(BookTemplateBundle.COVER_SETTING)){
			templateSettings.put(BookTemplateBundle.COVER_SETTING, settings.get(BookTemplateBundle.COVER_SETTING));
		} else {
			templateSettings.put(BookTemplateBundle.COVER_SETTING, true);
		}
		
		if (settings.containsKey(BookTemplateBundle.TOC_SETTING)){
			templateSettings.put(BookTemplateBundle.TOC_SETTING, settings.get(BookTemplateBundle.TOC_SETTING));
		} else {
			templateSettings.put(BookTemplateBundle.TOC_SETTING, true);
		}
		
		if (settings.containsKey(BookTemplateBundle.BACK_COVER_SETTING)){
			templateSettings.put(BookTemplateBundle.BACK_COVER_SETTING, settings.get(BookTemplateBundle.BACK_COVER_SETTING));
		} else {
			templateSettings.put(BookTemplateBundle.BACK_COVER_SETTING, true);
		}

		//Produce the new bundle using the template engine
		
		TemplateEngine templateEngine = templateBundle.getTemplateEngine();
		ByteArrayInputStream stream = null;
		try {
			ReportBundle reportBundle = templateEngine.generateReportBundle(templateBundle, templateSettings, jConfig);

			// Save the data adapter used...
			if (step1.getDataAdapter() != null) {
				Object props = settings.get(ReportWizardDataSourceDynamicPage.DATASET_PROPERTIES);
				JRPropertiesMap pmap = new JRPropertiesMap();
				if (props != null && props instanceof JRPropertiesMap) {
					pmap = (JRPropertiesMap) props;
				}
				templateEngine.setReportDataAdapter(reportBundle, step1.getDataAdapter(), pmap);

			}
			reportFile = saveBundleIntoFile(reportBundle, mainWizard, jConfig, monitor);
		} catch (Exception e) {
			UIUtils.showError(e);
		} 
		FileUtils.closeStream(stream);
		step1 = null;
		step2 = null;
		step3 = null;
		return reportFile;
	}
	
	/**
	 * The search of the resources in case of a book template search for subreprot
	 * also inside the part.
	 * 
	 * @return a not null list of the resources used by the template
	 */
	@Override
	public List<String> getResourceNames() {
		List<String> standardResourceNames = super.getResourceNames();
		List<JRPart> list = ModelUtils.getAllPartElements(getJasperDesign());
		
		for (JRPart part : list) {
			PartComponent component = part.getComponent();
			if (component instanceof SubreportPartComponent){
				SubreportPartComponent subReportComponent = (SubreportPartComponent)component;
				String evaluatedExpression = JRExpressionUtil.getSimpleExpressionText(subReportComponent.getExpression());
				if (evaluatedExpression != null) standardResourceNames.add(evaluatedExpression);
			}
		}
		return standardResourceNames;
	}

	/**
	 * On the abort all the three steps are set to null to be rebuild on the next opening
	 */
	@Override
	public void doCancel() {
		step1 = null;
		step2 = null;
		step3 = null;
	}
	
	/**
	 * Create the dynamic wizard steps if necessary then return them
	 * 
	 * @return a not null array of steps
	 */
	@Override
	public WizardPage[] getCustomWizardPages() {
		if (step1 == null || step2 == null || step3 == null){
			step1 = new BookWizardDataSourceDynamicPage(this);
			step2 = new BookWizardFieldsDynamicPage(this);
			step3 = new BookWizardSectionsDynamicPage(this);
		}
		WizardPage[] result = new WizardPage[]{step1, step2, step3};
		return result;
	}
	
	/**
	 * Get the First dynamic page of the wizard where the dataset can be chosen
	 * 
	 * @return a not null BookWizardDataSourceDynamicPage
	 */
	public BookWizardDataSourceDynamicPage getStep1() {
		return step1;
	}

	/**
	 * Get the First dynamic page of the wizard where the fields can be chosen
	 * 
	 * @return a not null BookWizardFieldsDynamicPage
	 */
	public BookWizardFieldsDynamicPage getStep2() {
		return step2;
	}

	/**
	 * Get the First dynamic page of the wizard where the book sections can be chosen
	 * 
	 * @return a not null BookWizardSectionsDynamicPage
	 */
	public BookWizardSectionsDynamicPage getStep3() {
		return step3;
	}

	/**
	 * For the book based templates return a Book Template Engine
	 */
	protected void readProperties()
	{
		super.readProperties();
		templateEngine = new DefaultTemplateEngine(); //Place here the book template engine
	}
}
