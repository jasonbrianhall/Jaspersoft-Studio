package com.jaspersoft.studio.book.editparts;

import net.sf.jasperreports.engine.design.JRDesignSection;

import org.eclipse.gef.commands.Command;

import com.jaspersoft.studio.book.models.MReportPart;
import com.jaspersoft.studio.book.models.MReportPartContainer;

public class RemoveChildrenCommand extends Command {

	private MReportPart partToRemove = null;
	
	private MReportPartContainer container = null;
	
	private int oldIndex = -1;
	
	public RemoveChildrenCommand(MReportPartContainer container, MReportPart partToRemove){
		this.container = container;
		this.partToRemove = partToRemove;
	}
	
	@Override
	public boolean canExecute() {
		return partToRemove != null && container != null;
	}
	
	@Override
	public void execute() {
		oldIndex = container.getValue().getPartsList().indexOf(partToRemove.getValue());
		container.getValue().removePart(partToRemove.getValue());
	}
	
	@Override
	public boolean canUndo() {
		return oldIndex > -1;
	} 
	
	@Override
	public void undo() {
		JRDesignSection section = container.getValue();
		if (section.getPartsList().size()<=oldIndex){
			section.addPart(partToRemove.getValue());
		} else {
			section.addPart(oldIndex, partToRemove.getValue());
		}
	}
}
