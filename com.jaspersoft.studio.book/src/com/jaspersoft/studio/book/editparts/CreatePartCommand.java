package com.jaspersoft.studio.book.editparts;

import net.sf.jasperreports.engine.design.JRDesignPart;
import net.sf.jasperreports.engine.design.JRDesignSection;

import org.eclipse.gef.commands.Command;

import com.jaspersoft.studio.book.models.MReportPartContainer;

public class CreatePartCommand extends Command {
	
	private JRDesignPart partToCreate = null;
	
	private MReportPartContainer container = null;
	
	public CreatePartCommand(MReportPartContainer container, JRDesignPart partToCreate){
		this.container = container;
		this.partToCreate = partToCreate;
	}
	
	@Override
	public boolean canExecute() {
		return partToCreate != null && container != null;
	}
	
	@Override
	public void execute() {
		container.getValue().addPart(partToCreate);
	}
	
	@Override
	public boolean canUndo() {
		return partToCreate != null && container != null;
	}
	
	@Override
	public void undo() {
		JRDesignSection containerJr = container.getValue();
		containerJr.removePart(partToCreate);
	}
	
}
