package com.jaspersoft.studio.crosstab.model.cell.command;

import net.sf.jasperreports.crosstabs.design.JRDesignCellContents;
import net.sf.jasperreports.engine.design.JRDesignElement;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import com.jaspersoft.studio.crosstab.model.cell.MCell;
import com.jaspersoft.studio.model.MGraphicElement;
import com.jaspersoft.studio.utils.SelectionHelper;

public class CreateElementCommand extends Command {
	private MGraphicElement srcNode;
	private JRDesignElement jrElement;

	private JRDesignCellContents jrCell;

	private Point location;

	private int index = -1;

	/**
	 * Instantiates a new creates the element command.
	 * 
	 * @param destNode
	 *          the dest node
	 * @param srcNode
	 *          the src node
	 * @param index
	 *          the index
	 */
	public CreateElementCommand(MCell destNode, MGraphicElement srcNode, int index) {
		super();
		this.jrElement = (JRDesignElement) srcNode.getValue();
		this.jrCell = (JRDesignCellContents) destNode.getValue();
		this.index = index;
		this.srcNode = srcNode;
	}

	public CreateElementCommand(MCell destNode, MGraphicElement srcNode, Point location) {
		super();
		this.jrElement = (JRDesignElement) srcNode.getValue();
		this.jrCell = (JRDesignCellContents) destNode.getValue();
		this.location = location;
		this.srcNode = srcNode;
	}

	/**
	 * Creates the object.
	 */
	protected void createObject() {
		if (jrElement == null) {
			jrElement = srcNode.createJRElement(srcNode.getJasperDesign());

			if (jrElement != null) {
				if (location == null)
					location = new Point(0, 0);
				jrElement.setX(location.x);
				jrElement.setY(location.y);
				jrElement.setWidth(Math.min(srcNode.getDefaultWidth(), jrCell.getWidth() - location.x));
				jrElement.setHeight(Math.min(srcNode.getDefaultHeight(), jrCell.getHeight() - location.y));
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		createObject();
		if (jrElement != null) {
			if (index >= 0 && index <= jrCell.getChildren().size())
				jrCell.addElement(index, jrElement);
			else
				jrCell.addElement(jrElement);
		}
		if (firstTime) {
			SelectionHelper.setSelection(jrElement, false);
			firstTime = false;
		}
	}

	private boolean firstTime = true;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#canUndo()
	 */
	@Override
	public boolean canUndo() {
		if (jrCell == null || jrElement == null)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		jrCell.removeElement(jrElement);
	}

}
