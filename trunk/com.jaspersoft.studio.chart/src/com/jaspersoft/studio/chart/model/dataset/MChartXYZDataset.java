package com.jaspersoft.studio.chart.model.dataset;

import java.beans.PropertyChangeEvent;

import net.sf.jasperreports.charts.design.JRDesignXyzDataset;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.design.events.CollectionElementAddedEvent;

import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.ReportFactory;

public class MChartXYZDataset extends MChartDataset {

	public MChartXYZDataset(ANode parent, JRDesignXyzDataset value, JasperDesign jasperDesign) {
		super(parent, value, jasperDesign);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals("xyzSeries")) { //$NON-NLS-1$
			if (evt.getSource() == getValue()) {
				if (evt.getOldValue() == null && evt.getNewValue() != null) {
					int newIndex = -1;
					if (evt instanceof CollectionElementAddedEvent) {
						newIndex = ((CollectionElementAddedEvent) evt).getAddedIndex();
					}
					ReportFactory.createNode(this, evt.getNewValue(), newIndex);
				} else if (evt.getOldValue() != null && evt.getNewValue() == null) {
					// delete
					for (INode n : getChildren()) {
						if (n.getValue() == evt.getOldValue()) {
							removeChild((ANode) n);
							break;
						}
					}
				} else {
					// changed
					for (INode n : getChildren()) {
						if (n.getValue() == evt.getOldValue())
							n.setValue(evt.getNewValue());
					}
				}
			}
		}
		super.propertyChange(evt);
	}
}
