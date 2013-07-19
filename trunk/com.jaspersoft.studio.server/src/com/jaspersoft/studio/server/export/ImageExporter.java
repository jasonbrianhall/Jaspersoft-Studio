/*******************************************************************************
 * Copyright (C) 2010 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, 
 * the following license terms apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Jaspersoft Studio Team - initial API and implementation
 ******************************************************************************/
package com.jaspersoft.studio.server.export;

import net.sf.jasperreports.eclipse.util.FileUtils;
import net.sf.jasperreports.engine.type.ImageTypeEnum;
import net.sf.jasperreports.engine.util.JRTypeSniffer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;

import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.ResourceDescriptor;
import com.jaspersoft.studio.server.model.MResource;

public class ImageExporter extends AExporter {

	@Override
	public IFile exportToIFile(MResource res, ResourceDescriptor rd, String fkeyname, IProgressMonitor monitor) throws Exception {
		IFile f = super.exportToIFile(res, rd, fkeyname, monitor);
		if (f != null) {
			String filename = f.getFullPath().toPortableString();
			int dotPos = filename.lastIndexOf(".");
			String strFilename = filename.substring(0, dotPos);
			ImageTypeEnum itype = JRTypeSniffer.getImageTypeValue(FileUtils.getBytes(f));
			if (itype == ImageTypeEnum.GIF) {
				f = FileUtils.fileRenamed(f, strFilename, ".gif", false, monitor);
			} else if (itype == ImageTypeEnum.JPEG) {
				f = FileUtils.fileRenamed(f, strFilename, ".jpeg", false, monitor);
			} else if (itype == ImageTypeEnum.PNG) {
				f = FileUtils.fileRenamed(f, strFilename, ".png", false, monitor);
			} else if (itype == ImageTypeEnum.TIFF) {
				f = FileUtils.fileRenamed(f, strFilename, ".tiff", false, monitor);
			}
			fileurimap.put(fkeyname, f);
		}
		return f;
	}

	@Override
	public String getExtension() {
		return ".png";
	}

}
