package com.jaspersoft.studio.book.models;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRConstants;
import net.sf.jasperreports.engine.design.JRDesignGroup;
import net.sf.jasperreports.engine.design.JRDesignSection;

import org.eclipse.jface.resource.ImageDescriptor;

import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;

@Deprecated
public abstract class MReportPartGroup extends ANode implements IReportPartContainer{
	
	public static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;
	private JRDesignGroup jrgroup;
	private PartSectionTypeEnum partSectionType;

	public MReportPartGroup(ANode parent, JRDesignGroup jrgroup, int index, PartSectionTypeEnum partSectionType) {
		super(parent,index);
		this.jrgroup = jrgroup;
		this.partSectionType = partSectionType;
	}

	@Override
	public ImageDescriptor getImagePath() {
		// TODO Auto-generated method stub
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
	
	public JRDesignGroup getJRDesignGroup() {
		return jrgroup;
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

	public JRDesignSection getSection() {
		if(jrgroup!=null){
			switch (partSectionType) {
			case GROUP_HEADER:
				return (JRDesignSection) jrgroup.getGroupHeaderSection();
			case GROUP_FOOTER:
				return (JRDesignSection) jrgroup.getGroupFooterSection();
			default:
				return null;
			}
		}
		return null;
	}
}
