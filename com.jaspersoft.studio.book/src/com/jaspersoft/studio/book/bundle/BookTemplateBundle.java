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
import java.io.File;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.eclipse.util.FileUtils;
import net.sf.jasperreports.engine.JRPropertiesMap;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.wizard.WizardPage;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.compatibility.JRXmlWriterHelper;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.templates.engine.DefaultTemplateEngine;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;
import com.jaspersoft.studio.wizards.ReportNewWizard;
import com.jaspersoft.studio.wizards.WizardUtils;
import com.jaspersoft.studio.wizards.datasource.ReportWizardDataSourceDynamicPage;
import com.jaspersoft.templates.ReportBundle;
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
	 * Their page of the wizard where the section to create can be chosen
	 */
	private BookWizardSectionsDynamicPage step3 = null;
	
	/**
	 * Part definition for the cover
	 */
	private PartContainer coverPart = null;
	
	/**
	 * Part definition for the back cover
	 */
	private PartContainer backcoverPart = null;
	
	/**
	 * Part definition for the toc
	 */
	private PartContainer tocPart = null;
	
	/**
	 * Part definition for the main
	 */
	private PartContainer mainPart = null;
	
	/**
	 * Constructor for the template 
	 * 
	 * @param url the url of the template resource
	 * @param isExternal true if the resource is an external template, false if it is a JSS insternal one
	 * @param jrContext the current context
	 */
	public BookTemplateBundle(URL url, boolean isExternal, JasperReportsContext jrContext) throws Exception {
		super(url, isExternal, jrContext);
		if (isExternal){
			loadExternalResources(url);
		} else {
			loadInternalResources(url);
		}
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
		
		TemplateEngine templateEngine = getTemplateEngine();
		ByteArrayInputStream stream = null;
		try {
			ReportBundle reportBundle = templateEngine.generateReportBundle(this, templateSettings, jConfig);

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
			saveSections(containerName, fileName, templateSettings, monitor);
			//Since the template engine could have changed the design of the part i discard them and they  
			//will be reloaded if the template is used to create another report
			clearLoadedParts();
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
	 * Clear the cached jasper design inside the defined parts
	 */
	private void clearLoadedParts(){
		if (coverPart != null) coverPart.clearDesign();
		if (backcoverPart != null) backcoverPart.clearDesign();
		if (tocPart != null) tocPart.clearDesign();
		if (mainPart != null) mainPart.clearDesign();
	}
	
	/**
	 * Save the sections if the user has requested it and if a template for them was found
	 * 
	 * @param containerName the name of the container where the resources will be saved
	 * @param fileName the name of the file to save the resource
	 * @param templateSettings the template settings provided by the user during the wizard
	 * @param monitor the monitor to execute the operation
	 */
	protected void saveSections(String containerName, String fileName, Map<String, Object> templateSettings, IProgressMonitor monitor) {
		//The following code store the bundle inside a jrxmlfile
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		// Store the report bundle on file system
		IFolder container = (IFolder) resource;
		String prefix = fileName.replace(".jrxml", "");
		
		boolean createCover = (Boolean)templateSettings.get(COVER_SETTING) && coverPart != null;
		if (createCover){
			saveDesignResource(coverPart.getJasperDesign(), container, prefix + "_cover.jrxml", monitor);
		}
		
		boolean createBackcover = (Boolean)templateSettings.get(BACK_COVER_SETTING) && backcoverPart != null;
		if (createBackcover){
			saveDesignResource(backcoverPart.getJasperDesign(), container, prefix + "_backcover.jrxml", monitor);
		}
		
		boolean createToc = (Boolean)templateSettings.get(TOC_SETTING) && tocPart != null;
		if (createToc){
			saveDesignResource(tocPart.getJasperDesign(), container, prefix + "_toc.jrxml", monitor);
		}
		
		boolean crateMain = mainPart != null;
		if (crateMain){
			saveDesignResource(mainPart.getJasperDesign(), container, prefix + "_main.jrxml", monitor);
		}
	}
	
	/**
	 * Save the design of a jrxml file into the specified container with the specified resource name
	 * 
	 * @param design the design to save
	 * @param container the container where to save the design
	 * @param resourceName the name of the created file
	 * @param monitor the monitor to execute the operation
	 */
	protected void saveDesignResource(JasperDesign design, IFolder container, String resourceName, IProgressMonitor monitor){
		if (design != null){
			IFile resourceFile = container.getFile(resourceName);
			ByteArrayInputStream stream = null;
			// Save the all the files...
			try {
				String contents = JRXmlWriterHelper.writeReport(JasperReportsConfiguration.getDefaultJRConfig(), design, resourceFile, false);
				stream = new ByteArrayInputStream(contents.getBytes());
				if (resourceFile.exists()) {
					resourceFile.setContents(stream, true, true, monitor);
				} else {
					resourceFile.create(stream, true, monitor);
				}
			} catch(Exception ex){
			} finally {
				FileUtils.closeStream(stream);
			}
		}
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
	 * Return the jasperdesign for the cover of the current template
	 * 
	 * @return a jasperdesign or null if no cover is found for this template
	 */
	public JasperDesign getCover(){
		if (coverPart != null) return coverPart.getJasperDesign();
		else return null;
	}
	
	/**
	 * Return the jasperdesign for the back cover of the current template
	 * 
	 * @return a jasperdesign or null if no back cover is found for this template
	 */
	public JasperDesign getBackCover(){
		if (backcoverPart != null) return backcoverPart.getJasperDesign();
		else return null;
	}
	
	/**
	 * Return the jasperdesign for the toc of the current template
	 * 
	 * @return a jasperdesign or null if no toc is found for this template
	 */
	public JasperDesign getTOC(){
		if (tocPart != null) return tocPart.getJasperDesign();
		else return null;
	}
	
	/**
	 * Return the jasperdesign for the main section of the current template
	 * 
	 * @return a jasperdesign or null if no main section is found for this template
	 */
	public JasperDesign getMain(){
		if (mainPart != null) return mainPart.getJasperDesign();
		else return null;
	}

	/**
	 * For the book based templates return a Book Template Engine
	 */
	protected void readProperties()
	{
		super.readProperties();
		templateEngine = new DefaultTemplateEngine(); //Place here the book template engine
	}

	/**
	 * Try to load the cover, back cover, toc and main resources
	 * from an external folder, at the same level of the current template
	 * 
	 * @param templateDocument the loaded template
	 */
	private void loadExternalResources(URL templateDocument){
		File reportFile = new File(templateDocument.getFile());
		if (reportFile.exists()){
			String prefix = reportFile.getName().replace(".jrxml", "");
			String coverName = prefix + "_cover.jrxml.part";
			String backCoverName = prefix + "_backcover.jrxml.part";
			String tocName = prefix + "_toc.jrxml.part";
			String mainName = prefix + "_main.jrxml.part";
			for(File brother : reportFile.getParentFile().listFiles()){
				String brotherName = brother.getName();
				if (brotherName.equals(coverName)){
					coverPart = new PartContainer(brother.getAbsolutePath());
				} else if (brotherName.equals(backCoverName)){
					backcoverPart = new PartContainer(brother.getAbsolutePath());
				} else if (brotherName.equals(tocName)){
					tocPart = new PartContainer(brother.getAbsolutePath());
				} else if (brother.equals(mainName)){
					mainPart = new PartContainer(brother.getAbsolutePath());
				}
			}
		}
	}
	
	/**
	 * Try to load the cover, back cover, toc and main resources
	 * from the JSS jar, at the same level of the current template
	 * 
	 * @param templateDocument the loaded template
	 */
	private void loadInternalResources(URL templateDocument){
		File reportFile = new File(templateDocument.getFile());
		String prefix = reportFile.getName().replace(".jrxml", "");
		String coverName = prefix + "_cover.jrxml.part";
		String backCoverName = prefix + "_backcover.jrxml.part";
		String tocName = prefix + "_toc.jrxml.part";
		String mainName = prefix + "_main.jrxml.part";
		Enumeration<URL> en = JaspersoftStudioPlugin.getInstance().getBundle().findEntries("templates/book", coverName, false);
		if (en != null && en.hasMoreElements()){
			URL url = en.nextElement();
			coverPart = new PartContainer(url);
		}
		
		en = JaspersoftStudioPlugin.getInstance().getBundle().findEntries("templates/book", backCoverName, false);
		if (en != null && en.hasMoreElements()){
			URL url = en.nextElement();
			backcoverPart = new PartContainer(url);
		}
		
		en = JaspersoftStudioPlugin.getInstance().getBundle().findEntries("templates/book", tocName, false);
		if (en != null && en.hasMoreElements()){
			URL url = en.nextElement();
			tocPart = new PartContainer(url);
		}
		
		en = JaspersoftStudioPlugin.getInstance().getBundle().findEntries("templates/book", mainName, false);
		if (en != null && en.hasMoreElements()){
			URL url = en.nextElement();
			mainPart = new PartContainer(url);
		}
	}
}
