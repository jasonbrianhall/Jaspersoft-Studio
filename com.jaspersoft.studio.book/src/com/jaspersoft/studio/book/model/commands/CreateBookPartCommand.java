package com.jaspersoft.studio.book.models.command;

import net.sf.jasperreports.engine.design.JRDesignPart;
import net.sf.jasperreports.engine.design.JRDesignSection;
import net.sf.jasperreports.engine.design.JasperDesign;

import org.eclipse.gef.commands.Command;

import com.jaspersoft.studio.book.models.MReportPart;
import com.jaspersoft.studio.book.models.MReportPartContainer;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class CreateBookPartCommand extends Command {

	private JasperReportsConfiguration jconfig;
	private MReportPartContainer destNode;
	private MReportPart newNode;
	private JasperDesign jd;
	private JRDesignPart jrpart;
	private int index;

	public CreateBookPartCommand(MReportPartContainer destNode, MReportPart newNode, int index) {
		super();
		setContext(destNode,newNode,index);
	}
	
	private void setContext(MReportPartContainer destNode, MReportPart newNode,
			int index) {
		if (destNode != null) {
			this.jconfig = destNode.getJasperConfiguration();
			this.destNode = destNode;
			this.newNode = newNode;
			this.jd = destNode.getJasperDesign();
			this.jrpart = (JRDesignPart) newNode.getValue();
			this.index = index;
		}		
	}

	@Override
	public void execute() {
		JRDesignSection section = destNode.getValue();
		if(index==-1){
			section.addPart(jrpart);
		}
		else {
			section.addPart(index,jrpart);
		}
	}
	
	@Override
	public boolean canExecute() {
		return destNode!=null && jrpart!=null;
	}
	
	@Override
	public void undo() {
		super.undo();
	}
	
	@Override
	public void redo() {
		super.redo();
	}
}
