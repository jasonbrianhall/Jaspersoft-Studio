/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.server;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import net.sf.jasperreports.eclipse.ui.util.UIUtils;
import net.sf.jasperreports.eclipse.util.FileUtils;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRXmlUtils;
import net.sf.jasperreports.util.CastorUtil;

import org.apache.commons.codec.binary.Base64;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import com.jaspersoft.studio.ConfigurationManager;
import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.compatibility.JRXmlWriterHelper;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MDummy;
import com.jaspersoft.studio.model.MRoot;
import com.jaspersoft.studio.model.util.ModelUtil;
import com.jaspersoft.studio.model.util.ModelVisitor;
import com.jaspersoft.studio.server.editor.JRSEditorContributor;
import com.jaspersoft.studio.server.model.MResource;
import com.jaspersoft.studio.server.model.server.MServerProfile;
import com.jaspersoft.studio.server.model.server.MServers;
import com.jaspersoft.studio.server.model.server.ServerProfile;
import com.jaspersoft.studio.server.protocol.IConnection;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class ServerManager {
	
	public static final String PREF_TAG = "serverprofiles"; //$NON-NLS-1$
	
	private static final String SERVERPROFILE = "SERVERPROFILE"; //$NON-NLS-1$
	
	private static List<MServerProfile> serverProfiles = new ArrayList<MServerProfile>();
	
	private static PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(JaspersoftStudioPlugin.getInstance());

	/**
	 * Save an element on the server file storage. 
	 * 
	 * @param serverProfile the element to save
	 */
	private static void saveIntoStrage(MServerProfile serverProfile) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new InputSource(new StringReader(serverProfile.toXML())));
			// Write the parsed document to an xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			File storage = ConfigurationManager.getStorage(PREF_TAG);
			String url = serverProfile.getConfigurationResourceURL();
			File destination = new File(storage, url);
			StreamResult result = new StreamResult(destination);
			transformer.transform(source, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<ServerProfile> getServerList() {
		if (serverProfiles.isEmpty())
			loadServerProfiles(new MServers(null));
		List<ServerProfile> servers = new ArrayList<ServerProfile>();
		for (MServerProfile ms : serverProfiles)
			servers.add(ms.getValue());
		return servers;
	}

	public static String[] getServers() {
		List<ServerProfile> serverList = getServerList();
		String[] res = new String[serverList.size()];
		for (int i = 0; i < res.length; i++)
			res[i] = serverList.get(i).getName();

		return res;
	}

	public static PropertyChangeSupport getPropertyChangeSupport() {
		return propertyChangeSupport;
	}

	public static boolean isUniqueName(MServerProfile sprofile, String name) {
		if (sprofile.getParent() != null && sprofile.getValue().getName().equals(name))
			return true;
		for (MServerProfile sp : serverProfiles) {
			if (sp.getValue().getName().equals(name))
				return false;
		}
		return true;
	}

	public static void addServerProfile(MServerProfile adapter) {
		if (!serverProfiles.contains(adapter)) {
			serverProfiles.add(adapter);
			propertyChangeSupport.firePropertyChange(new PropertyChangeEvent(adapter, SERVERPROFILE, null, adapter));
			ServerNameProvider nameProvider = new ServerNameProvider();
			ServerProfile v = adapter.getValue();
			String serverName = nameProvider.iterateForUniqueName(v.getName());
			adapter.setConfigurationResourceURL(serverName);
			saveIntoStrage(adapter);
		}
	}

	public static void removeServerProfile(MServerProfile adapter) {
		if (serverProfiles.contains(adapter)) {
			serverProfiles.remove(adapter);
			ConfigurationManager.removeStoregeResource(PREF_TAG, adapter.getConfigurationResourceURL());
			((ANode) adapter.getParent()).removeChild(adapter);
			propertyChangeSupport.firePropertyChange(new PropertyChangeEvent(adapter, SERVERPROFILE, null, adapter));
		}
	}

	public static void saveServerProfile(MServerProfile adapter) {
		if (serverProfiles.contains(adapter)) {
			propertyChangeSupport.firePropertyChange(new PropertyChangeEvent(adapter, SERVERPROFILE, null, adapter));
			//It's an edit, remove the old configuration file and save the new one
			ConfigurationManager.removeStoregeResource(PREF_TAG, adapter.getConfigurationResourceURL());
			saveIntoStrage(adapter);
		}
	}

	public static void loadServerProfilesCopy(MServers root) {
		if (serverProfiles.isEmpty())
			loadServerProfiles(root);
		for (MServerProfile msp : serverProfiles) {
			MServerProfile newServerProfile = new MServerProfile(root, msp.getValue());
			newServerProfile.setWsClient(msp.getWsClient());
			new MDummy(newServerProfile);
		}
	}

	public static void loadServerProfiles(MServers root) {
		root.removeChildren();
		serverProfiles.clear();
	
		//Convert the old configuration
		ConfigurationManager.convertPropertyToStorage(PREF_TAG, PREF_TAG, new ServerNameProvider());
		
		//Read the configuration from the file storage
		File[] storageContent = ConfigurationManager.getStorageContent(PREF_TAG);
		for (File storageElement : storageContent) {
			try {
				InputStream inputStream = new FileInputStream(storageElement);
				Reader reader = new InputStreamReader(inputStream, "UTF-8");
				InputSource is = new InputSource(reader);
				is.setEncoding("UTF-8");
				Document document = JRXmlUtils.parse(is);
				Node serverNode = document.getDocumentElement();
				if (serverNode.getNodeType() == Node.ELEMENT_NODE) {
					try {
						ServerProfile sprof = (ServerProfile) CastorUtil.read(serverNode, MServerProfile.MAPPINGFILE);
						MServerProfile sp = new MServerProfile(root, sprof);
						sp.setConfigurationResourceURL(storageElement.getName());
						new MDummy(sp);
						serverProfiles.add(sp);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			} catch (Exception e) {
				UIUtils.showError(e);
			}
		}
	}

	public static MServerProfile getServerProfile(String key) {
		int ind = key.indexOf(":"); //$NON-NLS-1$
		if (ind > 0) {
			StringTokenizer st = new StringTokenizer(key, ":");
			String name = st.nextToken();
			String path = st.nextToken();
			String url = new String(Base64.decodeBase64(st.nextToken()));
			for (MServerProfile sp : serverProfiles) {
				ServerProfile serv = sp.getValue();
				if (serv.getName().equals(name) && url != null && serv.getUrl().equals(url))
					return sp;
			}
		}
		return null;
	}

	public static IConnection getServer(String url, IProgressMonitor monitor) throws Exception {
		for (MServerProfile sp : serverProfiles) {
			if (sp.getValue().getUrl().equals(url))
				return sp.getWsClient(monitor);
		}
		return null;
	}

	public static IConnection getServer(String url, String user, IProgressMonitor monitor) throws Exception {
		MServerProfile msp = getServerByUrl(url, user);
		if (msp != null)
			return msp.getWsClient(monitor);
		return null;
	}

	public static MServerProfile getServerByUrl(String url) {
		for (MServerProfile sp : serverProfiles) {
			if (sp.getValue().getUrl().equals(url))
				return sp;
		}
		return null;
	}

	public static MServerProfile getServerByUrl(String url, String user) {
		MServerProfile res = null;
		for (MServerProfile sp : serverProfiles) {
			ServerProfile v = sp.getValue();
			if (v.getUrl().equals(url)) {
				res = sp;
				if (user != null) {
					String u = v.getUser() + (v.getOrganisation() != null ? "|" + v.getOrganisation() : "");
					if (u.equals(user))
						return sp;
				} else
					return sp;
			}
		}
		return res;
	}

	public static int getServerIndexByUrl(String url) {
		int i = 0;
		for (MServerProfile sp : serverProfiles) {
			if (sp.getValue().getUrl().equals(url))
				return i;
			i++;
		}
		return -1;
	}

	public static int getServerIndexByUrl(String url, String user) {
		int i = 0;
		int j = -1;
		for (MServerProfile sp : serverProfiles) {
			ServerProfile v = sp.getValue();
			if (v.getUrl().equals(url)) {
				j = i;
				if (user != null) {
					String u = v.getUser() + (v.getOrganisation() != null ? "|" + v.getOrganisation() : "");
					if (u.equals(user))
						return j;
				} else
					return j;
			}
			i++;
		}
		return j;
	}

	public static String getKey(MResource res) {
		INode n = res.getRoot();
		if (n != null && n instanceof MServerProfile) {
			MServerProfile sp = (MServerProfile) n;
			ServerProfile serv = sp.getValue();
			return serv.getName() + ":" + res.getValue().getUriString() + ":" + Base64.encodeBase64String(serv.getUrl().getBytes());//$NON-NLS-1$ //$NON-NLS-2$  
		}
		return null;
	}

	public static String getVersion(ANode node) {
		INode n = node.getRoot();
		if (n != null && n instanceof MServerProfile) {
			MServerProfile server = (MServerProfile) n;
			ServerProfile srvrd = server.getValue();
			return srvrd.getJrVersion();
		}
		return JRXmlWriterHelper.LAST_VERSION;
	}

	/**
	 * Tries to create a copy of the specified {@link MServerProfile} instance.
	 * <p>
	 * Re-use the {@link ServerProfile} information of the original node. Can be
	 * used for example as input when creating a new treeviewer for repository
	 * exploring.
	 * 
	 * @param original
	 *          the {@link MServerProfile} instance to copy
	 * @return a copy of the original {@link MServerProfile} instance
	 */
	public static MServerProfile getMServerProfileCopy(MServerProfile original) {
		ServerProfile spFound = null;
		for (ServerProfile sp : getServerList()) {
			if (sp.equals(original.getValue())) {
				spFound = sp;
				break;
			}
		}
		if (spFound == null)
			return null;
		MServerProfile newServerProfile = new MServerProfile(new MRoot(null, null), spFound);
		newServerProfile.setWsClient(original.getWsClient());
		return newServerProfile;
	}

	public static MServerProfile getServerProfile(JasperDesign jd, JasperReportsConfiguration jConfig) {
		final MRoot root = new MRoot(null, null);
		root.setJasperConfiguration(jConfig);
		MServerProfile sp = null;
		List<ServerProfile> servers = getServerList();
		for (ServerProfile s : servers) {
			sp = new MServerProfile(root, s);
			sp.setJasperConfiguration(jConfig);
			new MDummy(sp);
		}

		String prop = JRSEditorContributor.getServerURL(jd, (IFile) jConfig.get(FileUtils.KEY_FILE));
		if (prop != null && !prop.isEmpty()) {
			for (INode n : root.getChildren()) {
				if (n instanceof MServerProfile && ((MServerProfile) n).getValue().getUrl().equals(prop)) {
					return (MServerProfile) n;
				}
			}
		}
		return sp;
	}

	public static void selectIfExists(final IProgressMonitor monitor, MResource mres) {
		MServerProfile sp = (MServerProfile) mres.getRoot();
		sp = getServerByUrl(sp.getValue().getUrl());
		selectIfExists(monitor, sp, mres);
	}

	public static void selectIfExists(final IProgressMonitor monitor, MServerProfile sp, MResource mres) {
		if (mres.getParent() instanceof MServerProfile) {
			try {
				WSClientHelper.connectGetData(sp, monitor);
				propertyChangeSupport.firePropertyChange(new PropertyChangeEvent(sp, SERVERPROFILE, null, sp));
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			final String puri = ((MResource) mres.getParent()).getValue().getUriString();
			final String uri = mres.getValue().getUriString();
			if (ModelUtil.isEmpty(sp))
				try {
					WSClientHelper.connectGetData(sp, monitor);
				} catch (Exception e) {
					e.printStackTrace();
					return;
				}
			new ModelVisitor<MResource>(sp) {

				@Override
				public boolean visit(INode n) {
					if (n instanceof MResource) {
						MResource r = (MResource) n;
						if (r.getValue().getUriString().equals(puri)) {
							for (INode cn : r.getChildren())
								if (cn instanceof MResource && ((MResource) cn).getValue().getUriString().equals(uri))
									doRefresh((MResource) cn, monitor);
							doRefresh(r, monitor);
						}
					}
					if (monitor.isCanceled())
						stop();
					return true;
				}

				private void doRefresh(MResource r, IProgressMonitor monitor) {
					try {
						WSClientHelper.refreshResource(r, monitor);
					} catch (Exception e) {
						e.printStackTrace();
					}
					stop();
				}

			};
		}
	}
}
