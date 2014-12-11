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
package com.jaspersoft.studio.components.customvisualization.creation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.jaspersoft.studio.ConfigurationManager;

/**
 * 
 * Manager for the Custom Visualization modules. Each module is a skeleton 
 * to build a custom visualization component. This class provide the methods
 * to download the modules and it license. It also can store the modules 
 * and licenses locally and provide them when they are needed.
 * It provide the list of the available modules
 * 
 * @author Orlandin Marco
 *
 */
public class ModuleManager {

	/**
	 * Key of the module storage
	 */
	private static final String PREF_KEYS_JS_MODULES = "jsModules";//$NON-NLS-1$
	
	/**
	 * The list of the embedded modules
	 */
	private static List<ModuleDefinition> embeddedModules;
	
	/**
	 * Initialize the list of the embedded modules
	 */
	static{
		
		embeddedModules = new ArrayList<ModuleDefinition>();
		
		ModuleDefinition d3Module = new ModuleDefinition();
		d3Module.setModuleName("D3");
		d3Module.setVariableName("d3");
		d3Module.setLibraryURL("https://raw.githubusercontent.com/mbostock/d3/v3.4.13/d3.min.js");
		d3Module.setLicenseURL("https://raw.githubusercontent.com/mbostock/d3/v3.4.13/LICENSE");
		d3Module.setCssResource("com/jaspersoft/studio/components/customvisualization/creation/resources/d3css.css");
		d3Module.setRenderResource("com/jaspersoft/studio/components/customvisualization/creation/resources/d3render.js");
		d3Module.setVersionNumber("3.4.13");
		
		
		ModuleDefinition d3Circle = new ModuleDefinition();
		d3Circle.setModuleName("D3 circle");
		d3Circle.setVariableName("d3");
		d3Circle.setLibraryURL("https://raw.githubusercontent.com/mbostock/d3/v3.4.13/d3.min.js");
		d3Circle.setLicenseURL("https://raw.githubusercontent.com/mbostock/d3/v3.4.13/LICENSE");
		d3Circle.setCssResource("com/jaspersoft/studio/components/customvisualization/creation/resources/D3_Circle_css.css");
		d3Circle.setRenderResource("com/jaspersoft/studio/components/customvisualization/creation/resources/D3_Circle_render.js");
		d3Circle.setVersionNumber("3.4.13");
		
		//SET THE DEPENDENCES
		ModuleDefinition require = new ModuleDefinition();
		require.setVariableName("requireLib");
		require.setModuleName("Require.js");
		require.setLibraryURL("https://raw.githubusercontent.com/jrburke/requirejs/2.1.15/require.js");
		require.setLicenseURL("https://raw.githubusercontent.com/jrburke/requirejs/2.1.15/LICENSE");
		require.setVersionNumber("2.1.15");
		d3Circle.addRequiredLibrary(require);;
		
		embeddedModules.add(d3Module);
		embeddedModules.add(d3Circle);

		//createRaphaelDots();
	}
	
	@SuppressWarnings("unused")
	private static void createRaphaelDots(){
		ModuleDefinition raphaelModule = new ModuleDefinition();
		raphaelModule.setModuleName("Raphael Dots");
		raphaelModule.setVariableName("raphael");
		raphaelModule.setLibraryURL("https://raw.githubusercontent.com/DmitryBaranovskiy/raphael/v2.1.2/raphael-min.js");
		raphaelModule.setLicenseURL("https://raw.githubusercontent.com/DmitryBaranovskiy/raphael/v2.1.2/license.txt");
		raphaelModule.setCssResource("com/jaspersoft/studio/components/customvisualization/creation/resources/raphaelDots_css.css");
		raphaelModule.setRenderResource("com/jaspersoft/studio/components/customvisualization/creation/resources/raphaeldots_render.js");
		raphaelModule.setVersionNumber("2.1.2");
		raphaelModule.setNeedShim(true);
		raphaelModule.setShimExportName("Raphael");
		
		//SET THE DEPENDENCES
		ModuleDefinition gRaphael = new ModuleDefinition();
		gRaphael.setVariableName("g.raphael");
		gRaphael.setModuleName("gRaphael");
		gRaphael.setLibraryURL("https://raw.githubusercontent.com/DmitryBaranovskiy/g.raphael/v0.5/g.raphael.js");
		gRaphael.setLicenseURL("https://raw.githubusercontent.com/DmitryBaranovskiy/raphael/v2.1.2/license.txt");
		gRaphael.setVersionNumber("0.5");
		gRaphael.setNeedShim(true);
		gRaphael.setShimExportName("Raphael");
		gRaphael.addShimDependency("raphael");
		raphaelModule.addRequiredLibrary(gRaphael);
		
		ModuleDefinition gDot = new ModuleDefinition();
		gDot.setVariableName("g.dot");
		gDot.setModuleName("gDot");
		gDot.setLibraryURL("https://raw.githubusercontent.com/DmitryBaranovskiy/g.raphael/v0.5/g.dot.js");
		gDot.setLicenseURL("https://raw.githubusercontent.com/DmitryBaranovskiy/raphael/v2.1.2/license.txt");
		gDot.setVersionNumber("0.5");
		gDot.setNeedShim(true);
		gDot.setShimExportName("Raphael");
		gDot.addShimDependency("g.raphael");
		raphaelModule.addRequiredLibrary(gDot);
		
		embeddedModules.add(raphaelModule);
	}
	
	/**
	 * Return the list of all the embedded modules to generate a Custom visualization
	 * Component skeleton
	 * 
	 * @return a not null list of ModuleDefinition
	 */
	public static List<ModuleDefinition> getModules(){
		return embeddedModules;
	}
	
	/**
	 * Check if the library of the passed module is saved locally
	 * 
	 * @param module module to check
	 * @return true if the library is available locally, false if it need
	 * to be downloaded
	 */
	public static boolean isLocal(ModuleDefinition module){
		String fileName = getModuleFileName(module);
		return ConfigurationManager.getStorageResource(PREF_KEYS_JS_MODULES, fileName) != null;
	}
	
	/**
	 * Download the library of the module
	 * 
	 * @param module the module
	 * @param fileName name used to stored the library file inside the storage
	 * @return the reference to the just downloaded file
	 */
	private static File downloadLibrary(ModuleDefinition module, String fileName){
		File moduleFile = module.fetchLibrary();
		File storage = ConfigurationManager.getStorage(PREF_KEYS_JS_MODULES);
		File destinationFile = new File(storage, fileName);
		try{
			FileUtils.copyFile(moduleFile, destinationFile);
			return destinationFile;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Read the content of a license text file and return it as string 
	 * 
	 * @param file the file of the license
	 * @return the content of the file or a fixed string if the file is not valid
	 */
	private static String readTextfile(File file){
		try{
			String result = "";
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String line;
			while ((line = in.readLine()) != null) {
				result += line + "\n";
		 	}
		 	in.close();

      return result;
		} catch(Exception ex){
			ex.printStackTrace();
			return "License Not Found";
		}
	}
	
	/**
	 * Download the license of the module
	 * 
	 * @param module the module
	 * @param fileName name used to stored the license file inside the storage
	 * @return the reference to the just downloaded file
	 */
	private static File downloadLicense(ModuleDefinition module, String fileName){
		File moduleFile = module.fetchLicense();
		File storage = ConfigurationManager.getStorage(PREF_KEYS_JS_MODULES);
		File destinationFile = new File(storage, fileName);
		try{
			FileUtils.copyFile(moduleFile, destinationFile);
			return destinationFile;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Create a file name for the module library using the name of 
	 * the library concatenated to its version
	 * 
	 * @param module the module
	 * @return a name to save into the filesystem the library of the module
	 */
	private static String getModuleFileName(ModuleDefinition module){
		String fileName = module.getFilename();
		fileName = fileName.substring(0, fileName.length()-3)+module.getVersionNumber()+".js";
		return fileName;
	}
	
	/**
	 * Create a file name for the module license using the name of 
	 * the library concatenated to its version
	 * 
	 * @param module the module
	 * @return a name to save into the filesystem the license of the module
	 */
	private static String getLicenseFileName(ModuleDefinition module){
		String fileName = module.getFilename();
		fileName = fileName.substring(0, fileName.length()-3)+module.getVersionNumber()+"License.txt";
		return fileName;
	}
	
	/**
	 * Return the library file of the module. The file is download from internet if it 
	 * is not available locally, otherwise it uses the local copy
	 * 
	 * @param module the module
	 * @return a reference to the file or null if it can't be found
	 */
	public static File getLibraryFile(ModuleDefinition module){
		File storage = ConfigurationManager.getStorage(PREF_KEYS_JS_MODULES);
		String fileName = getModuleFileName(module);
		File resource = ConfigurationManager.getStorageResource(storage, fileName);
		if (resource == null){
			resource = downloadLibrary(module, fileName);
		}
		return resource;
	}
	
	/**
	 * Return the license content of the module. The file is download from Internet if it 
	 * is not available locally, otherwise it uses the local copy
	 * 
	 * @param module the module
	 * @return the content of the license if it can be found, otherwise an error string
	 */
	public static String getLicenseFile(ModuleDefinition module){
		File storage = ConfigurationManager.getStorage(PREF_KEYS_JS_MODULES);
		String fileName = getLicenseFileName(module);
		File license = ConfigurationManager.getStorageResource(storage, fileName);
		if (license == null){
			license = downloadLicense(module, fileName);
		}
		String result = readTextfile(license);
		/*String newLine = System.getProperty("line.separator"); //$NON-NLS-1$
		if (!module.getRequiredLibraries().isEmpty()){
			for(ModuleDefinition required : module.getRequiredLibraries()){
				String newLicenseHeder = newLine + "License for dependency {0}: " + newLine + newLine;
				result+= MessageFormat.format(newLicenseHeder, new Object[]{required.getModuleName()}) + getLicenseFile(required);
			}
		}*/
		return result;
	}
	
	/**
	 * Check if the license of the library of the passed module is saved locally
	 * 
	 * @param module module to check
	 * @return true if the license is available locally, false if it need
	 * to be downloaded
	 */
	public static boolean isLicenseLocal(ModuleDefinition module){
		String fileName = getLicenseFileName(module);
		return ConfigurationManager.getStorageResource(PREF_KEYS_JS_MODULES, fileName) != null;
	}
}
