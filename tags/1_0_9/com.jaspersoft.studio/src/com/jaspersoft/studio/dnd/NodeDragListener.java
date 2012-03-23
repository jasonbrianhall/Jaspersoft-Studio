package com.jaspersoft.studio.dnd;

import java.util.Iterator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSourceAdapter;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.ui.part.PluginTransfer;
import org.eclipse.ui.part.PluginTransferData;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.model.ANode;

/**
 * Supports dragging gadgets from a structured viewer.
 */
public class NodeDragListener extends DragSourceAdapter {
	private StructuredViewer viewer;

	public NodeDragListener(StructuredViewer viewer) {
		this.viewer = viewer;
	}

	/**
	 * Method declared on DragSourceListener
	 */
	public void dragFinished(DragSourceEvent event) {
		if (!event.doit)
			return;
		// if the gadget was moved, remove it from the source viewer
		if (event.detail == DND.DROP_MOVE) {
			IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
			for (Iterator<?> it = selection.iterator(); it.hasNext();) {
				((ANode) it.next()).setParent(null, -1);
			}
			viewer.refresh();
		}
	}

	/**
	 * Method declared on DragSourceListener
	 */
	public void dragSetData(DragSourceEvent event) {
		IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		ANode[] gadgets = (ANode[]) selection.toList().toArray(new ANode[selection.size()]);
		if (NodeTransfer.getInstance().isSupportedType(event.dataType)) {
			event.data = gadgets;
		} else if (PluginTransfer.getInstance().isSupportedType(event.dataType)) {
			byte[] data = NodeTransfer.getInstance().toByteArray(gadgets);
			event.data = new PluginTransferData(JaspersoftStudioPlugin.getUniqueIdentifier(), data);
		}
	}

	/**
	 * Method declared on DragSourceListener
	 */
	public void dragStart(DragSourceEvent event) {
		event.doit = !viewer.getSelection().isEmpty();
	}
}