/*
 * Copyright (C) 2003, 2004  Pascal Essiembre, Essiembre Consultant Inc.
 * 
 * This file is part of Essiembre ResourceBundle Editor.
 * 
 * Essiembre ResourceBundle Editor is free software; you can redistribute it 
 * and/or modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * Essiembre ResourceBundle Editor is distributed in the hope that it will be 
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with Essiembre ResourceBundle Editor; if not, write to the 
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330, 
 * Boston, MA  02111-1307  USA
 */
package com.essiembre.eclipse.rbe.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import com.essiembre.eclipse.rbe.messages.Messages;
import com.essiembre.eclipse.rbe.model.bundle.PropertiesGenerator;
import com.essiembre.eclipse.rbe.model.workbench.RBEPreferences;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one or several files with the extension
 * "properties". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */
public class ResourceBundleWizard extends Wizard implements INewWizard {
    private ResourceBundleNewWizardPage page;
    private ISelection selection;

    /**
     * Constructor for ResourceBundleWizard.
     */
    public ResourceBundleWizard() {
        super();
        setNeedsProgressMonitor(true);
    }
    
    /**
     * Adding the page to the wizard.
     */

    public void addPages() {
        page = new ResourceBundleNewWizardPage(selection);
        addPage(page);
    }

    /**
     * This method is called when 'Finish' button is pressed in
     * the wizard. We will create an operation and run it
     * using wizard as execution context.
     */
    public boolean performFinish() {
        final String containerName = page.getContainerName();
        final String baseName = page.getFileName();
        final String[] locales = page.getLocaleStrings();
        IRunnableWithProgress op = new IRunnableWithProgress() {
            public void run(IProgressMonitor monitor) throws InvocationTargetException {
                try {
                    monitor.worked(1);
                    monitor.setTaskName(Messages.editor_wiz_creating);
                    IFile file = null;
                    for (int i = 0; i <  locales.length; i++) {
                        String fileName = baseName;
                        if (locales[i].equals(
                                ResourceBundleNewWizardPage.DEFAULT_LOCALE)) {
                            fileName += ".properties"; //$NON-NLS-1$
                        } else {
                            fileName += "_" + locales[i] //$NON-NLS-1$
                                     + ".properties"; //$NON-NLS-1$
                        }
                        file = createFile(containerName, fileName, monitor);
                    }
                    final IFile lastFile = file;
                    getShell().getDisplay().asyncExec(new Runnable() {
                        public void run() {
                            IWorkbenchPage wbPage = PlatformUI.getWorkbench()
                                    .getActiveWorkbenchWindow().getActivePage();
                            try {
                                IDE.openEditor(wbPage, lastFile, true);
                            } catch (PartInitException e) {
                            }
                        }
                    });
                    monitor.worked(1);
                } catch (CoreException e) {
                    throw new InvocationTargetException(e);
                } finally {
                    monitor.done();
                }
            }
        };
        try {
            getContainer().run(true, false, op);
        } catch (InterruptedException e) {
            return false;
        } catch (InvocationTargetException e) {
            Throwable realException = e.getTargetException();
            MessageDialog.openError(getShell(), 
                    "Error", realException.getMessage()); //$NON-NLS-1$
            return false;
        }
        return true;
    }
    
    /*
     * The worker method. It will find the container, create the
     * file if missing or just replace its contents, and open
     * the editor on the newly created file.
     */
    /*default*/ IFile createFile(
            String containerName,
            String fileName,
            IProgressMonitor monitor)
            throws CoreException {
        
        monitor.beginTask(Messages.editor_wiz_creating + fileName, 2); //$NON-NLS-1$
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IResource resource = root.findMember(new Path(containerName));
        if (!resource.exists() || !(resource instanceof IContainer)) {
            throwCoreException("Container \"" + containerName  //$NON-NLS-1$
                    + "\" does not exist."); //$NON-NLS-1$
        }
        IContainer container = (IContainer) resource;
        final IFile file = container.getFile(new Path(fileName));
        try {
            InputStream stream = openContentStream();
            if (file.exists()) {
                file.setContents(stream, true, true, monitor);
            } else {
                file.create(stream, true, monitor);
            }
            stream.close();
        } catch (IOException e) {
        }
        return file;
    }
    
    /*
     * We will initialize file contents with a sample text.
     */
    private InputStream openContentStream() {
        String contents = ""; //$NON-NLS-1$
        if (RBEPreferences.getShowGenerator()) {
            contents = PropertiesGenerator.GENERATED_BY;
        }
        return new ByteArrayInputStream(contents.getBytes());
    }

    private void throwCoreException(String message) throws CoreException {
        IStatus status = new Status(IStatus.ERROR, 
                "com.essiembre.eclipse.i18n.resourcebundle",  //$NON-NLS-1$
                IStatus.OK, message, null);
        throw new CoreException(status);
    }

    /**
     * We will accept the selection in the workbench to see if
     * we can initialize from it.
     * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
     */
    public void init(
            IWorkbench workbench, IStructuredSelection structSelection) {
        this.selection = structSelection;
    }
}