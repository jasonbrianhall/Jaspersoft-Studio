package com.jaspersoft.studio.book.editors.actions;

import net.sf.jasperreports.engine.design.JRDesignExpression;

import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import com.jaspersoft.studio.book.models.MReportPart;
import com.jaspersoft.studio.book.models.MReportPartContainer;
import com.jaspersoft.studio.book.models.command.CreateBookPartCommand;
import com.jaspersoft.studio.editor.outline.actions.ACreateAndSelectAction;
import com.jaspersoft.studio.editor.outline.part.NotDragableTreeEditPart;

public class AddDummyPage extends ACreateAndSelectAction {

	public static final String ID = "add_dummy_page";
	
	public AddDummyPage(IWorkbenchPart part) {
		super(part);
	}

	@Override
	protected void init() {
		super.init();
		setText("Add a dummy page");
		setToolTipText("Simple test");
		setId(ID);
		setEnabled(false);
	}
	
	@Override
	protected boolean calculateEnabled() {
		return true;
	}
	
	@Override
	public void run() {
		ISelection s = getSelection();
		if (s instanceof StructuredSelection) {
			Object obj = ((StructuredSelection) s).getFirstElement();
			if(obj instanceof NotDragableTreeEditPart) {
				if (((NotDragableTreeEditPart) obj).getModel() instanceof MReportPartContainer) {
					MReportPartContainer container = (MReportPartContainer) ((NotDragableTreeEditPart) obj).getModel();
					MReportPart newReportPart = new MReportPart(container, MReportPart.createJRElement(new JRDesignExpression("TEST THIS")), -1);
					getCommandStack().execute(new CreateBookPartCommand(container, newReportPart, -1));
				}
			}
		}

	}

}
