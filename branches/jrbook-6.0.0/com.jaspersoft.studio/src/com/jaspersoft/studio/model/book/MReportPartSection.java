package com.jaspersoft.studio.model.book;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRConstants;

import org.eclipse.jface.resource.ImageDescriptor;

import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;

public class MReportPartSection extends ANode implements IReportPartContainer{

	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;
	private PartSectionTypeEnum partSectionType;
	
	public MReportPartSection(ANode parent, PartSectionTypeEnum partSectionType, int index) {
		super(parent,index);
		this.partSectionType = partSectionType;
	}

	@Override
	public ImageDescriptor getImagePath() {
		return null;
	}

	@Override
	public String getDisplayText() {
		// TODO Auto-generated method stub
		return null;
	}

	public PartSectionTypeEnum getPartSectionType() {
		return partSectionType;
	}

	@Override
	public List<MReportPart> getReportParts() {
		List<INode> children = getChildren();
		List<MReportPart> reportParts = new ArrayList<MReportPart>(children.size());
		for(INode n : children){
			if(n instanceof MReportPart) {
				reportParts.add((MReportPart) n);
			}
		}
		return reportParts;
	}

}
