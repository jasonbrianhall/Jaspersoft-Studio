/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved. http://www.jaspersoft.com.
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.eclipse.wizard.project.ProjectUtil;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gef.EditPart;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.utils.SelectionHelper;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;
import com.jaspersoft.studio.wizards.category.ReportTemplatesWizardPage;

/**
 * Wizard to create a new report. It has three static step. The 
 * first one allow to the user to choose a template for the report.
 * The second one allow to choose the destination of the report on
 * the hard disk. And the last one is simply a "congratulation" step.
 * 
 * All the steps between the second one and the last one are contributed
 * Dynamically by the template bundle selected inside the first step
 * 
 * 
 * @author Orlandin Marco
 * 
 */
public class ReportNewWizard extends JSSWizard implements INewWizard {

	/**
	 * Key to extract from the settings of the wizard the container name of the report. The container name
	 * is created when the finish button is pressed
	 */
	public static final String CONTAINER_NAME_KEY = "containerNameKey";
	
	/**
	 * Key to extract from the settings of the wizard the file name of the report. The file name
	 * is created when the finish button is pressed
	 */
	public static final String FILE_NAME_KEY = "fileNameKey";
	
	/**
	 * Unique id of the wizard
	 */
	public static final String WIZARD_ID = "com.jaspersoft.studio.wizards.ReportNewWizard";
	
	public static final String NEW_REPORT_JRXML = "report.jrxml";
	
	/**
	 * Page where the user can choose which template bundle will be used to generate the report
	 */
	private ReportTemplatesWizardPage templateChooserStep;

	/**
	 * Step where the user can choose the location on the workspace of the report file and its name
	 */
	private DynamicNewFileCreationWizard fileLocationStep;

	/**
	 * Congratulation page placed at the end of the wizard. This page is optional and the flag showCongratulationStep
	 * can be used to have or not it. If the flag is false the page is not created so this reference will be null
	 */
	private CongratulationsWizardPage congratulationsStep;
	
	/**
	 * Flag to enable or disable the final configuration page
	 */
	private boolean showCongratulationsStep = true;

	/**
	 * The current selection when the wizard is opened, used to get a destination folder is 
	 * is opened by a contextual menu
	 */
	private ISelection selection;

	/**
	 * Constructor for ReportNewWizard.
	 */
	public ReportNewWizard() {
		super();
		setWindowTitle(Messages.ReportNewWizard_title);
		setNeedsProgressMonitor(true);
		// Attention! This operation should always be performed by
		// the wizard caller, since we are forcing here a new config.
		JasperReportsConfiguration jrConfig = JasperReportsConfiguration.getDefaultJRConfig();
		jrConfig.setJasperDesign(new JasperDesign());
		setConfig(jrConfig);
	}

	public ReportNewWizard(IWizard parentWizard, IWizardPage fallbackPage) {
		super(parentWizard, fallbackPage);
		setWindowTitle(Messages.ReportNewWizard_title);
		setNeedsProgressMonitor(true);
		showCongratulationsStep = false;
	}

	/**
	 * Adding the static pages to the wizard.
	 */
	@Override
	public void addPages() {
		templateChooserStep = new ReportTemplatesWizardPage();
		addPage(templateChooserStep);

		fileLocationStep = new DynamicNewFileCreationWizard("newFilePage1", (IStructuredSelection) selection);//$NON-NLS-1$
		addPage(fileLocationStep);

		if (showCongratulationsStep) {
			congratulationsStep = new CongratulationsWizardPage(Messages.CongratulationsWizardPage_title,
					Messages.CongratulationsWizardPage_titleMessage, Messages.CongratulationsWizardPage_label1,
					Messages.CongratulationsWizardPage_label2, Messages.CongratulationsWizardPage_label3);
			addPage(congratulationsStep);
		}
	}
	
	/**
	 * This method is called when 'Cancel' button is pressed in the wizard. It notifiy 
	 * to the current template bundle that the wizard was aborted in case it need to
	 * unload some data
	 */
	@Override
	public boolean performCancel() {
		templateChooserStep.getTemplateBundle().doCancel();
		return super.performCancel();
	}
	
	/**
	 * This method is called when 'Finish' button is pressed in the wizard. It store data from the 
	 * static step inside the shared settings then it call the finish code from the current template
	 * bundle. If the code return an IFile it is also opened in the editor
	 */
	@Override
	public boolean performFinish() {
		try {
			Map<String, Object> settings = getSettings();
			//Store in the settings some information from the location step
			settings.put(CONTAINER_NAME_KEY, fileLocationStep.getContainerFullPath().toPortableString()); 
			settings.put(FILE_NAME_KEY, fileLocationStep.getFileName()); 
			//Create and open the report
			getContainer().run(true, true, new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					monitor.beginTask(Messages.ReportNewWizard_2, IProgressMonitor.UNKNOWN);
					try {
						//calls the finish method of the current template bundle
						final IFile	reportFile = templateChooserStep.getTemplateBundle().doFinish(ReportNewWizard.this, monitor);
						//If the report file is create correctly then open it
						if (reportFile != null){
							monitor.setTaskName(Messages.ReportNewWizard_5);
							UIUtils.getDisplay().asyncExec(new Runnable() {
								public void run() {
									IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
									try {
										IDE.openEditor(page, reportFile, true);
									} catch (PartInitException e) {
										e.printStackTrace();
									}
								}
							});
						}
					} catch (Exception e) {
						UIUtils.showError(e);
					} finally {
						monitor.done();
					}
				}
			});
		} catch (InvocationTargetException e) {
			UIUtils.showError(e.getCause());
		} catch (InterruptedException e) {
			UIUtils.showError(e.getCause());
		}
		return super.performFinish();
	}
	
	/**
	 * We will accept the selection in the workbench to see if we can initialize from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		if (selection instanceof StructuredSelection) {
			if (selection.getFirstElement() instanceof IProject || selection.getFirstElement() instanceof IFile
					|| selection.getFirstElement() instanceof IFolder || selection.getFirstElement() instanceof IPackageFragment) {
				this.selection = selection;
				return;
			}
			for (Object obj : selection.toList()) {
				if (obj instanceof EditPart) {
					IEditorInput ein = SelectionHelper.getActiveJRXMLEditor().getEditorInput();
					if (ein instanceof FileEditorInput) {
						this.selection = new TreeSelection(new TreePath(new Object[] { ((FileEditorInput) ein).getFile() }));
						return;
					}
				}
			}
			IProgressMonitor progressMonitor = new NullProgressMonitor();
			IProject[] prjs = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			for (IProject p : prjs) {
				try {
					if (ProjectUtil.isOpen(p) && p.getNature(JavaCore.NATURE_ID) != null) {
						p.open(progressMonitor);
						this.selection = new TreeSelection(new TreePath(new Object[] { p.getFile(NEW_REPORT_JRXML) }));
						return;
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
			for (IProject p : prjs) {
				try {
					if (ProjectUtil.isOpen(p)) {
						p.open(progressMonitor);
						this.selection = new TreeSelection(new TreePath(new Object[] { p.getFile(NEW_REPORT_JRXML) }));
						return;
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		this.selection = selection;
	}
	
	/**
	 * To check if the report can finish we check if both the static steps and
	 * the dynamic ones are completed
	 */
	public boolean canFinish() {
		//Check the static steps
		boolean result = templateChooserStep.isPageComplete() && fileLocationStep.isPageComplete() && (!hasCongratulationStep() || congratulationsStep.isPageComplete());
		if (!result) return result;
		//The static steps are completed, check the dynamic one
		for(WizardPage page : templateChooserStep.getTemplateBundle().getCustomWizardPages()){
			if (!page.isPageComplete()) return false;
		}
		return true;
	}

	/**
	 * Return the congratulation step
	 * 
	 * @return The congratulation step, can be null if hasCongratulationStep() is false 
	 */
	public CongratulationsWizardPage getCongratulationsStep() {
		return congratulationsStep;
	}
	
	/**
	 * Return the current report template wizard page
	 * 
	 * @return a not null wizard page where the user choose a report template
	 */
	public ReportTemplatesWizardPage getTemplateChooserStep() {
		return templateChooserStep;
	}

	/**
	 * Return the current report template wizard page
	 * 
	 * @return a not null wizard page where the user choose a report template
	 */
	public NewFileCreationWizard getFileLocationStep() {
		return fileLocationStep;
	}

	/**
	 * Check if the last congratulation page should be shown or not
	 * 
	 * @return true if the page should be shown, false otherwise
	 */
	public boolean hasCongratulationStep() {
		return showCongratulationsStep;
	}
	
	/**
	 * Utility class to create a file using the methods from 
	 * the File Location step. Since this methods relay to 
	 * the widgets in the dialog they must be executed inside
	 * a graphic thread.
	 * 
	 * @author Orlandin Marco
	 *
	 */
	private class FileCreator{
		
		/**
		 * The created file
		 */
		private IFile result;
		
		/**
		 * The File Location, that contains the information and the 
		 * methods to create the file
		 */
		private NewFileCreationWizard creationWizard;
		
		/**
		 * Create a FileCreator for a specific wizard
		 * 
		 * @param creationWizard wizard from where the File Location
		 * step is read
		 */
		public FileCreator(NewFileCreationWizard creationWizard){
			this.creationWizard = creationWizard;
		}
		
		/**
		 * Create the file defined in the File Loaction step and
		 * return it
		 * 
		 * @return an IFile
		 */
		public IFile createFile(){
			result = null;
			UIUtils.getDisplay().syncExec(new Runnable() {
				
				@Override
				public void run() {
					result = creationWizard.createNewFile();
				}
			});
			return result;
		}
		
	}
	
	/**
	 * Return a file using the information provided in the File Location
	 * step to know where it must be created and it's name
	 * 
	 * @return the file defined in the file location step
	 */
	public IFile createTargetFile(){
		return (new FileCreator(getFileLocationStep())).createFile();
	}
	
}
