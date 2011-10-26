package com.jaspersoft.studio.server;

import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.TreeExpansionEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;

import com.jaspersoft.ireport.jasperserver.ws.JServer;
import com.jaspersoft.ireport.jasperserver.ws.WSClient;
import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.ResourceDescriptor;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.repository.IRepositoryViewProvider;
import com.jaspersoft.studio.server.action.CreateServerAction;
import com.jaspersoft.studio.server.action.DeleteServerAction;
import com.jaspersoft.studio.server.action.DuplicateServerAction;
import com.jaspersoft.studio.server.action.EditServerAction;
import com.jaspersoft.studio.server.model.server.MServerProfile;
import com.jaspersoft.studio.server.model.server.MServers;
import com.jaspersoft.studio.server.model.server.ServerProfile;

public class ServerProvider implements IRepositoryViewProvider {
	private CreateServerAction createServerAction;
	private EditServerAction editServerAction;
	private DeleteServerAction deleteServerAction;
	private DuplicateServerAction duplicateServerAction;

	public Action[] getActions(TreeViewer treeViewer) {
		createActions(treeViewer);
		return new Action[] { createServerAction };
	}

	private void createActions(TreeViewer treeViewer) {
		if (createServerAction == null)
			createServerAction = new CreateServerAction(treeViewer);
		if (editServerAction == null)
			editServerAction = new EditServerAction(treeViewer);
		if (deleteServerAction == null)
			deleteServerAction = new DeleteServerAction(treeViewer);
		if (duplicateServerAction == null)
			duplicateServerAction = new DuplicateServerAction(treeViewer);
	}

	public List<IAction> fillContextMenu(TreeViewer treeViewer, ANode node) {
		createActions(treeViewer);
		List<IAction> lst = new ArrayList<IAction>();
		if (node instanceof MServers) {
			if (createServerAction.isEnabled())
				lst.add(createServerAction);
		} else if (node instanceof MServerProfile) {
			if (editServerAction.isEnabled())
				lst.add(editServerAction);
			if (duplicateServerAction.isEnabled())
				lst.add(duplicateServerAction);

			if (deleteServerAction.isEnabled())
				lst.add(deleteServerAction);
		}
		return lst;
	}

	public void hookKeyEvent(KeyEvent event) {
		if (event.character == SWT.DEL && event.stateMask == 0
				&& deleteServerAction.isEnabled()) {
			deleteServerAction.run();
		}
	}

	public void doubleClick(TreeViewer treeViewer) {
		editServerAction.run();
	}

	public ANode getNode(ANode root) {
		MServers servers = new MServers(root);

		ServerManager.loadServerProfiles(servers);

		// get from somewere the nodes
		// ServerProfile sp = new ServerProfile();
		// sp.setName("Server 1");
		// sp.setUrl("http://localhost:9090/jasperserver-pro/services/repository");
		// sp.setUser("jasperadmin|organization_1");
		// sp.setPass("jasperadmin");
		// MServerProfile srv = new MServerProfile(servers, sp);
		//
		// try {
		// listFolder(srv, connect(sp), "/");
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// ServerProfile sp1 = new ServerProfile();
		// sp1.setName("Server2");
		// new MServerProfile(servers, sp1);
		// ServerProfile sp2 = new ServerProfile();
		// sp2.setName("Server3");
		// new MServerProfile(servers, sp2);

		return servers;
	}

	public static WSClient connect(MServerProfile msp, IProgressMonitor monitor)
			throws Exception {
		monitor.subTask("Connecting");
		JServer server = msp.getWsClient() == null ? new JServer() : msp
				.getWsClient().getServer();
		ServerProfile sp = msp.getValue();
		server.setName(sp.getName());
		server.setUrl(sp.getUrl());
		server.setUsername(sp.getUser());
		server.setPassword(sp.getPass());
		if (msp.getWsClient() == null)
			msp.setWsClient(new WSClient(server));
		return msp.getWsClient();
	}

	public static boolean checkConnection(MServerProfile msp,
			IProgressMonitor monitor) throws Exception {
		ResourceDescriptor rd = new ResourceDescriptor();
		rd.setWsType(ResourceDescriptor.TYPE_FOLDER);
		rd.setUriString("/");
		connect(msp, monitor).list(rd);
		monitor.subTask("Connected");
		return true;
	}

	public static void connectGetData(MServerProfile msp,
			IProgressMonitor monitor) throws Exception {
		listFolder(msp, connect(msp, monitor), "/", monitor);
	}

	static int depth = 0; // This variable is used to print tabs...

	/**
	 * This function shows how to create a folder in the root directory.
	 * Subfolders can be created just specifying a proper Uri string i.e.
	 * rd.setUriString("/this/is/my/new/folder");
	 * 
	 * @param client
	 * @param folderLabel
	 * @param folderName
	 * @throws IOException
	 */
	public static List<ResourceDescriptor> listFolder(ANode parent,
			WSClient client, String folderUri, IProgressMonitor monitor)
			throws Exception {
		ResourceDescriptor rd = new ResourceDescriptor();
		rd.setWsType(ResourceDescriptor.TYPE_FOLDER);
		rd.setUriString(folderUri);
		monitor.subTask("Listing " + rd.getUriString());

		List<ResourceDescriptor> children = client.list(rd);

		for (ResourceDescriptor r : children) {
			ANode node = ResourceFactory.getResource(parent, r);

			for (int i = 0; i < depth; ++i)
				System.out.print("  ");
			if (r.getWsType().equals(ResourceDescriptor.TYPE_FOLDER)) {
				System.out.println("[" + r.getLabel() + "]");
				depth++;
				listFolder(node, client, r.getUriString(), monitor);
				depth--;
			} else if (r.getWsType().equals(ResourceDescriptor.TYPE_REPORTUNIT)) {
				r = client.get(r, null);
				List<ResourceDescriptor> children2 = r.getChildren();
				for (ResourceDescriptor res : children2) {
					if (res.getWsType().equals(ResourceDescriptor.TYPE_FOLDER))
						listFolder(node, client, res.getUriString(), monitor);
					else
						ResourceFactory.getResource(node, res);
				}
			} else {
				System.out.println("" + r.getLabel() + "");
			}
		}
		return children;
	}

	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		ServerManager.getPropertyChangeSupport().addPropertyChangeListener(pcl);
	}

	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		ServerManager.getPropertyChangeSupport().removePropertyChangeListener(
				pcl);
	}

	public void handleTreeEvent(TreeExpansionEvent event) {
		if (event.getElement() instanceof MServerProfile) {

		}
	}

}
