package com.jaspersoft.studio.book.models;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRDataset;
import net.sf.jasperreports.engine.JROrigin;
import net.sf.jasperreports.engine.design.JRDesignGroup;
import net.sf.jasperreports.engine.design.JRDesignSection;
import net.sf.jasperreports.engine.design.events.CollectionElementAddedEvent;
import net.sf.jasperreports.engine.type.BandTypeEnum;

import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MReport;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class MBookReport extends MReport {

	private static final long serialVersionUID = 5556681239142691942L;

	public MBookReport(ANode parent, JasperReportsConfiguration jConfig) {
		super(parent, jConfig);
	}

	/**
	 * Handle group changed.
	 * 
	 * @param evt
	 *          the evt
	 */
	@Override
	protected void handleGroupChanged(PropertyChangeEvent evt) {
		if (evt.getOldValue() != null && evt.getNewValue() == null) { // delete
			JRDesignGroup group = (JRDesignGroup) evt.getOldValue();
			removeGroupListener(group);
			List<ANode> dNodes = new ArrayList<ANode>();
			for (INode node : getChildren()) {
				if (node instanceof MReportPartContainer) {
					MReportPartContainer band = (MReportPartContainer) node;
					if (band.getJrgroup().equals(group))
						dNodes.add(band);
				}
			}
			for (ANode n : dNodes) {
				removeChild(n);
			}
		} else if (evt instanceof CollectionElementAddedEvent && evt.getNewValue() != null && evt.getOldValue() == null) {
			JRDesignGroup group = (JRDesignGroup) evt.getNewValue();
			for (INode n : getChildren()) {
				if (n instanceof MReportPartContainer && ((MReportPartContainer) n).getJrgroup() == group)
					return;
			}

			boolean mainDataset = !getJasperDesign().getDatasetMap().containsKey(((JRDataset) evt.getSource()).getName());
			if (mainDataset) {
				// find the right position to put the band
				addGroupListener(group);
				int headerPosition = -1;
				for(INode node : getChildren()){
					headerPosition++;
					if (node instanceof MReportPartContainer) {
						MReportPartContainer container = (MReportPartContainer)node;
						Object type = container.getPropertyValue(MReportPartContainer.PROPERTY_CONTAINER_TYPE);
						if (BandTypeEnum.DETAIL.equals(type)){
							break;
						}
					}
				}
				
				int footerPosition = getChildren().size();
				for(int i = getChildren().size()-1; i>=0; i--){
					INode node = getChildren().get(i);
					if (node instanceof MReportPartContainer) {
						MReportPartContainer container = (MReportPartContainer)node;
						Object type = container.getPropertyValue(MReportPartContainer.PROPERTY_CONTAINER_TYPE);
						if (BandTypeEnum.DETAIL.equals(type)){
							footerPosition++;
							break;
						}
					}
					footerPosition--;
				}
				
				//FIXME: Something wrong with the jr object, it's not converted correctly into jrxml
				JROrigin headerOrigin = new JROrigin(null, group.getName(), BandTypeEnum.GROUP_HEADER);
				JRDesignSection header = new JRDesignSection(headerOrigin);
				MReportPartContainer mHeader = new MReportPartContainer(this, header, headerPosition);
				mHeader.setJRGroup(group);
				
				JROrigin footerOrigin = new JROrigin(null, group.getName(), BandTypeEnum.GROUP_FOOTER);
				JRDesignSection footer = new JRDesignSection(footerOrigin);
				MReportPartContainer mFooter = new MReportPartContainer(this, footer, footerPosition);
				mFooter.setJRGroup(group);
			}
		}
	}

}
