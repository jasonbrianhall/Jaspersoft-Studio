package com.jaspersoft.studio.model.group.command;

import net.sf.jasperreports.engine.design.JRDesignGroup;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;

import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MReport;
import com.jaspersoft.studio.model.band.MBandGroupFooter;
import com.jaspersoft.studio.model.band.MBandGroupHeader;
import com.jaspersoft.studio.model.band.command.CreateBandGroupFooterCommand;
import com.jaspersoft.studio.model.band.command.CreateBandGroupHeaderCommand;
import com.jaspersoft.studio.model.group.MGroup;
import com.jaspersoft.studio.wizards.group.BandGroupWizard;

public class CreateMainGroupCommand extends CompoundCommand {

	private boolean addHeader = false;
	private boolean addFooter = false;
	private JRDesignGroup jrdGroup;
	private CreateBandGroupHeaderCommand createBandHeader;
	private CreateBandGroupFooterCommand createBandFooter;
	private MReport destNode;

	public CreateMainGroupCommand(MReport destNode, MGroup srcNode, int index) {
		super("Create main Group");
		add(new CreateGroupCommand(destNode, srcNode, index) {
			@Override
			protected void createObject() {
				if (jrGroup == null) {
					BandGroupWizard wizard = new BandGroupWizard();
					wizard.init(jrDesign);
					WizardDialog dialog = new WizardDialog(Display.getCurrent().getActiveShell(), wizard);
					dialog.create();
					if (dialog.open() == Dialog.OK) {
						MGroup srcNode = wizard.getGroup();
						addHeader = wizard.isAddHeader();
						addFooter = wizard.isAddFooter();
						if (srcNode.getValue() == null)
							jrGroup = MGroup.createJRGroup(jrDataSet);
						else
							jrGroup = (JRDesignGroup) srcNode.getValue();
					}
				}
				setGroup(jrGroup);
			}
		});
		this.destNode = destNode;
	}

	private void setGroup(JRDesignGroup jrGroup) {
		this.jrdGroup = jrGroup;
	}

	@Override
	public void execute() {
		Command cmd = (Command) getCommands().get(0);
		cmd.execute();

		if (addHeader) {
			if (createBandHeader == null)
				for (INode n : destNode.getChildren()) {
					if (n instanceof MBandGroupHeader && ((MBandGroupHeader) n).getJrGroup() == jrdGroup) {
						createBandHeader = new CreateBandGroupHeaderCommand((MBandGroupHeader) n);
						break;
					}
				}
			if (createBandHeader != null)
				createBandHeader.execute();
		}
		if (addFooter) {
			if (createBandFooter == null)
				for (INode n : destNode.getChildren()) {
					if (n instanceof MBandGroupFooter && ((MBandGroupFooter) n).getJrGroup() == jrdGroup) {
						createBandFooter = new CreateBandGroupFooterCommand((MBandGroupFooter) n);
						break;
					}
				}
			if (createBandFooter != null)
				createBandFooter.execute();
		}

	}

	@Override
	public void undo() {
		((Command) getCommands().get(0)).undo();
		if (addHeader && createBandHeader != null)
			createBandHeader.undo();
		if (addFooter && createBandFooter != null)
			createBandFooter.undo();
	}

}
