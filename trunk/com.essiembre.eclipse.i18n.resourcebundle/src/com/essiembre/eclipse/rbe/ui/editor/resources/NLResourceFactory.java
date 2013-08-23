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
package com.essiembre.eclipse.rbe.ui.editor.resources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IEditorSite;

import com.essiembre.eclipse.rbe.RBEPlugin;
import com.essiembre.eclipse.rbe.model.workbench.RBEPreferences;
import com.essiembre.eclipse.rbe.model.workbench.files.NLPropertiesFileCreator;

/**
 * Responsible for creating resources related to an Eclipse "NL"
 * directory structure.
 * @author Pascal Essiembre (essiembre@users.sourceforge.net)
 * @version $Author: fleque $ $Revision: 1.9 $ $Date: 2007/09/30 14:22:04 $
 */
@SuppressWarnings("unchecked")
public class NLResourceFactory extends ResourceFactory {

//    /**
//     * Constructor.
//     * @param site editor site
//     * @param file file used to open all related files
//     * @throws CoreException problem creating factory
//     */
//    protected NLResourceFactory(IEditorSite site, IFile file) 
//            throws CoreException {
//        super();
////        
////        // Locate "nl" directory (if any)
////        IContainer container = file.getParent();
////        IResource nlDir = null;
////        while (container != null 
////                && (nlDir == null || !(nlDir instanceof Folder))) {
////            nlDir = container.findMember("nl"); //$NON-NLS-1$
////            container = container.getParent();
////        }
////        
////        // Load properties files in "nl" structure.
////        if (nlDir != null && nlDir instanceof Folder) {
////            
////            // Load root file, if exists.
////            IResource resource = nlDir.getParent().findMember(filename);
////            SourceEditor sourceEditor = createEditor(site, resource, null);
////            if (sourceEditor != null) {
////                sourceEditors.put(sourceEditor.getLocale(), sourceEditor);
////            }
////            
////            // Load "language" matching files in "nl" tree.
////            IResource[] langResources = ((Folder) nlDir).members();
////            for (int i = 0; i < langResources.length; i++) {
////                String language = null;
////                IResource langResource = langResources[i];
////                if (langResource instanceof IFolder) {
////                    IFolder langFolder = (IFolder) langResource;
////                    language = langFolder.getName();
////                    sourceEditor = createEditor(
////                            site, 
////                            langFolder.findMember(filename),
////                            new Locale(language));
////                    if (sourceEditor != null) {
////                        sourceEditors.put(sourceEditor.getLocale(), sourceEditor);
////                    }
////
////                    // Load "country" matching files in "nl" tree.
////                    String country = null;
////                    IResource[] cntryResources = langFolder.members();
////                    for (int j = 0; j < cntryResources.length; j++) {
////                        IResource cntryResource = cntryResources[j];
////                        if (cntryResource instanceof IFolder) {
////                            IFolder cntryFolder = (IFolder) cntryResource;
////                            country = cntryFolder.getName();
////                            sourceEditor = createEditor(
////                                    site, 
////                                    cntryFolder.findMember(filename),
////                                    new Locale(language, country));
////                            if (sourceEditor != null) {
////                                sourceEditors.put(sourceEditor.getLocale(), sourceEditor);
////                            }
////                            
////                            // Load "variant" matching files in "nl" tree.
////                            IResource[] vrntResources = cntryFolder.members();
////                            for (int k = 0; k < vrntResources.length; k++) {
////                                IResource vrntResource = vrntResources[k];
////                                if (vrntResource instanceof IFolder) {
////                                    IFolder vrntFolder = (IFolder) vrntResource;
////                                    sourceEditor = createEditor(
////                                            site, 
////                                            vrntFolder.findMember(filename),
////                                            new Locale(language, country,
////                                                    vrntFolder.getName()));
////                                    if (sourceEditor != null) {
////                                        sourceEditors.put(sourceEditor.getLocale(), sourceEditor);
////                                    }
////                                }
////                            }
////                        }
////                    }                        
////                }
////            }
////            fileCreator = 
////                new NLPropertiesFileCreator(nlDir.toString(), filename);
////            displayName = filename;
////        } else {
////            fileCreator = null;
////            displayName = null;
////        }
//        init(site, file);
//    }
    
    public boolean isResponsible(IFile file) throws CoreException {
        /*
         * Check if NL is supported.
         */
        if (!RBEPreferences.getSupportNL()) {
            return false;
        }

        /*
         * Check if there is an NL directory
         */
        IResource nlDir = lookupNLDir(file);
        
        if (!(nlDir instanceof IFolder))
        	return false;
        
        /*
         * Ensures NL directory is part of file path, or that file dir
         * is parent of NL directory.
         */
        IPath filePath = file.getFullPath();
        IPath nlDirPath = nlDir.getFullPath();
        if (!nlDirPath.isPrefixOf(filePath)
                && !filePath.removeLastSegments(1).isPrefixOf(nlDirPath)) {
            return false;
        }
        
        /*
         * Ensure that there are no other files which could make a standard
         * resource bundle.
         */
        if (file.exists() && ResourceFactory.getResources(file).length > 1) {
             return false;
        }
        /*
         * Ensure file is wihtin nl-structure
         */
        if (
        		file.getFullPath().toString().startsWith(
        				file.getProject().findMember("nl").getFullPath().toString()
        		)
        	)
        	return true;
        else
        	return false;
    }
    
    
    /**
     * Constructor.
     * @param site The editor site
     * @param file The file used to open all related files
     * @throws CoreException problem creating factory
     */
    public void init(IEditorSite site, IFile file) throws CoreException {
        setSite(site);
        String filename = file.getName();        
        	
        IResource nlDir = lookupNLDir(file);

        // Load properties files in "nl" structure.
        if (!(nlDir instanceof IFolder))
        	throw new CoreException(new Status(IStatus.ERROR, RBEPlugin.ID, 0, "no 'nl'-folder found", null)); //$NON-NLS-1$
        
        List editors = new ArrayList();
        loadEditors(site, editors, file, nlDir);
        for (Iterator it = editors.iterator(); it.hasNext();) {
			SourceEditor editor = (SourceEditor) it.next();
			addSourceEditor(editor.getLocale(), editor);
		}
        IResource resource = nlDir.getParent().findMember(filename);
        addResource(resource, null);
        
		setPropertiesFileCreator(new NLPropertiesFileCreator(nlDir.getFullPath().toString(), filename));
		setDisplayName(getDisplayName(file));
    }
    
    
	protected void loadEditors(IEditorSite site, List editors, IFile file, IResource nlDir)
	throws CoreException {
//		Load "language" matching files in "nl" tree.
		SourceEditor sourceEditor = null;
		IResource[] langResources = nlDir != null ? ((IFolder) nlDir).members() : file.getParent().members();
		for (int i = 0; i < langResources.length; i++) {
			String language = null;
			IResource langResource = langResources[i];
			if (langResource instanceof IFolder) {
				IFolder langFolder = (IFolder) langResource;
				language = langFolder.getName();
				sourceEditor = createEditor(
						site, 
						langFolder.findMember(file.getName()),
						new Locale(language));
				if (sourceEditor != null) {
					editors.add(sourceEditor);
				}

				// Load "country" matching files in "nl" tree.
				String country = null;
				IResource[] cntryResources = langFolder.members();
				for (int j = 0; j < cntryResources.length; j++) {
					IResource cntryResource = cntryResources[j];
					if (cntryResource instanceof IFolder) {
						IFolder cntryFolder = (IFolder) cntryResource;
						country = cntryFolder.getName();
						sourceEditor = createEditor(
								site, 
								cntryFolder.findMember(file.getName()),
								new Locale(language, country));
						if (sourceEditor != null) {
							editors.add(sourceEditor);
						}

						// Load "variant" matching files in "nl" tree.
						IResource[] vrntResources = cntryFolder.members();
						for (int k = 0; k < vrntResources.length; k++) {
							IResource vrntResource = vrntResources[k];
							if (vrntResource instanceof IFolder) {
								IFolder vrntFolder = (IFolder) vrntResource;
								sourceEditor = createEditor(
										site, 
										vrntFolder.findMember(file.getName()),
										new Locale(language, country,
												vrntFolder.getName()));
								if (sourceEditor != null) {
									editors.add(sourceEditor);
								}
							}
						}
					}
				}                        
			}
		}
	}
    
	public static IResource lookupNLDir(IResource resource) {
		// Locate "nl" directory (if any)
        IContainer container = resource instanceof IContainer ?
        		(IContainer) resource : resource.getParent();
        IResource nlDir = null;
        while (container != null 
                && (nlDir == null || !(nlDir instanceof IFolder))) {
            nlDir = container.findMember("nl"); //$NON-NLS-1$
            container = container.getParent();
        }
		return nlDir;
	}
}