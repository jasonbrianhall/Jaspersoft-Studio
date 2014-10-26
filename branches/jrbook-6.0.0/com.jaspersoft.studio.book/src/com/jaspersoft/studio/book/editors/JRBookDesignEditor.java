package com.jaspersoft.studio.book.editors;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;

import com.jaspersoft.studio.book.editors.actions.CreateNewBookPartAction;
import com.jaspersoft.studio.editor.AGraphicEditor;
import com.jaspersoft.studio.editor.gef.parts.JSSGraphicalViewerKeyHandler;
import com.jaspersoft.studio.editor.gef.parts.MainDesignerRootEditPart;
import com.jaspersoft.studio.editor.outline.JDReportOutlineView;
import com.jaspersoft.studio.editor.outline.actions.CreateGroupAction;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class JRBookDesignEditor extends AGraphicEditor {

	public JRBookDesignEditor(JasperReportsConfiguration jrContext) {
		super(jrContext);
	}

	@Override
	protected void createGraphicalViewer(Composite parent) {
		ScrollingGraphicalViewer viewer = new ScrollingGraphicalViewer();
		viewer.createControl(parent);
		setGraphicalViewer(viewer);
		configureGraphicalViewer();
		hookGraphicalViewer();
		initializeGraphicalViewer();
	}

	@Override
	protected ContextMenuProvider createContextMenuProvider(
			EditPartViewer graphicalViewer) {
		return new BookEditorContextMenuProvider(graphicalViewer, getActionRegistry());
	}

	@Override
	protected EditPartFactory createEditParFactory() {
		return new BookEditPartFactory();
	}

	@Override
	protected JDReportOutlineView createOutline(TreeViewer viewer) {
		outlinePage = new JDReportOutlineView(this, viewer) {
			protected void initActions(ActionRegistry registry, IActionBars bars) {
			}

			protected org.eclipse.gef.ContextMenuProvider getMenuContentProvider() {
				return createContextMenuProvider(getViewer());
			}
		};
		return outlinePage;
	}
	
	@Override
	protected void createActions() {
		super.createActions();
		
		IAction action = new CreateGroupAction(this);
		getActionRegistry().registerAction(action);
		getSelectionActions().add(action.getId());
		
		action = new CreateNewBookPartAction(this);
		getActionRegistry().registerAction(action);
		getSelectionActions().add(action.getId());
	}

	@Override
	protected void configureGraphicalViewer() {
		getGraphicalViewer().getControl().setBackground(ColorConstants.white);

		GraphicalViewer graphicalViewer = getGraphicalViewer();
		graphicalViewer.setEditPartFactory(createEditParFactory());
		MainDesignerRootEditPart rootEditPart = new MainDesignerRootEditPart();
		graphicalViewer.setRootEditPart(rootEditPart);

		// set rulers providers
		graphicalViewer.setKeyHandler(new JSSGraphicalViewerKeyHandler(graphicalViewer));
	}
}
