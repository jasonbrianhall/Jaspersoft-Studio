package com.jaspersoft.studio.data.querydesigner.xpath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.DefaultJasperReportsContext;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.util.xml.JRXPathExecuter;
import net.sf.jasperreports.engine.util.xml.JRXPathExecuterUtils;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.jaspersoft.studio.data.designer.tree.ISelectableNodes;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.MRoot;
import com.jaspersoft.studio.model.datasource.xml.XMLAttributeNode;
import com.jaspersoft.studio.model.datasource.xml.XMLNode;
import com.jaspersoft.studio.utils.UIUtils;

/**
 * This class works on the specified xml document or its nodes.
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 *
 */
public class XMLDocumentManager implements ISelectableNodes<XMLNode>{

	private Document xmlDocument;
	private JRXPathExecuter xPathExecuter;
	private Map<XMLNode,Node> documentNodesMap;
	
	/**
	 * Sets the {@link Document} object that will 
	 * be handled by the manager.
	 * 
	 * @param doc the xml document
	 */
	public void setDocument(Document doc){
		this.xmlDocument=doc;
		getDocumentNodesMap().clear();
	}
	
	/**
	 * @return <code>true</code> if an xml document is set,
	 * 			<code>false</code> otherwise
	 */
	public boolean isDocumentSet(){
		return this.xmlDocument!=null;
	}
	
	/**
	 * Creates a tree of {@link ANode} elements representing
	 * the input document.
	 * 
	 * @param docNode root node
	 * @return the model representing the XML document
	 */
	public MRoot getXMLDocumentModel(){
		if(xmlDocument!=null){
			MRoot docRoot=new MRoot(null, null);
			List<XMLNode> childrenXMLNodes = getChildrenXMLNodes(xmlDocument);
			for(XMLNode childNode : childrenXMLNodes){
				childNode.setParent(docRoot, -1);
			}
			return docRoot;
		}
		else {
			return null;
		}
	}
	
	/*
	 * Get the list of XMLNodes for the specified document node.
	 */
	private List<XMLNode> getChildrenXMLNodes(Node node){
		List<XMLNode> children=new ArrayList<XMLNode>();
		
		// Attributes 
		NamedNodeMap attrs = node.getAttributes();
		if (attrs != null) {
			for (int i = 0; i < attrs.getLength(); i++){
				XMLAttributeNode attrNode=new XMLAttributeNode();
				getDocumentNodesMap().put(attrNode,attrs.item(i));
				attrNode.setName(attrs.item(i).getNodeName());
				children.add(attrNode);
			}
		}
		// Standard nodes
		NodeList nl=node.getChildNodes();
		for (int i = 0; i < nl.getLength(); i++){
			if (nl.item(i).getNodeType() == Node.ELEMENT_NODE){
				XMLNode n=new XMLNode();
				getDocumentNodesMap().put(n,nl.item(i));
				n.setName(nl.item(i).getNodeName());
				List<XMLNode> childrenXMLNodes = getChildrenXMLNodes(nl.item(i));
				for(XMLNode childNode : childrenXMLNodes){
					childNode.setParent(n, -1);
				}
				children.add(n);
			}
		}
		return children;
	}

	/**
	 * Returns the XPath expression (absolute or relative) that locates the
	 * node in XML document.
	 * 
	 * @param query	an existing XPath expression that can be used in order to
	 * 				return a relative expression. It can be <code>null</code>.
	 * @param xmlNode	the node for which to extract the XPath expression
	 * @return
	 */
	public String getXPathExpression(String query, XMLNode xmlNode){
		Node selectedNode=getDocumentNodesMap().get(xmlNode);
		boolean isAttribute=(selectedNode instanceof Attr);
		String attributePostfix="";
		if(isAttribute){
			attributePostfix="/@"+selectedNode.getNodeName();
		}
		String selectedPath = getAbsoluteXPathExpression(selectedNode);
		if(query==null || query.equals("")){
			// Absolute expression
			return getAbsoluteXPathExpression(selectedNode);
		}
		else {
			List<Node> selectedNodeList = selectNodeList(query);
			for(Node currnode : selectedNodeList){
				String currentPath = getAbsoluteXPathExpression(currnode);
				if(selectedPath.equals(currentPath)){
					return "child::text()";
				}
				else if(selectedPath.startsWith(currentPath)){
					// selected node is child of the current one
					return selectedPath.replace(currentPath+"/", "");
				}
				else if(currentPath.startsWith(selectedPath)){
					// selected node is parent of the current one
					return "anchestor::"+selectedNode.getNodeName();
				}
				else if(isAttribute && 
						currentPath.startsWith(selectedPath.replace(attributePostfix, ""))){
					// special case of the selected attribute and located on anchestor node
					return "anchestor::"+((Attr)selectedNode).getOwnerElement().getNodeName()+attributePostfix;
				}
			}
		}
		return selectedPath;
	}
	
	/*
	 * Simple way to retrieve the absolute XPath expression that would
	 * permit to locate the node similar to the node specified.
	 */
	private String getAbsoluteXPathExpression(Node node){
		StringBuffer sb=new StringBuffer();
		while(!(node instanceof Document)){
			if(node instanceof Attr){
				sb.insert(0,"/@"+node.getNodeName());
				node=((Attr)node).getOwnerElement();
			}
			else{
				sb.insert(0,"/"+node.getNodeName());
				node=node.getParentNode();					
			}
		}
		return sb.toString();
	}
	
	private JRXPathExecuter getXPathQueryExecuter(){
		if(xPathExecuter==null){
			try {
				xPathExecuter = JRXPathExecuterUtils.getXPathExecuter(DefaultJasperReportsContext.getInstance());
			} catch (JRException e) {
				UIUtils.showError(e);
			}
		}
		return xPathExecuter;
	}
	
	public Map<XMLNode, Node> getDocumentNodesMap(){
		if(this.documentNodesMap==null){
			this.documentNodesMap=new HashMap<XMLNode, Node>();
		}
		return this.documentNodesMap;
	}

	/**
	 * Selects the {@link Node} elements found by executing
	 * the input XPath query. 
	 *  
	 * @param query the query to execute
	 * @return list of selected nodes
	 */
	public List<Node> selectNodeList(String query) {
		List<Node> nodes=new ArrayList<Node>();
		try {
			NodeList selectNodeList = getXPathQueryExecuter().selectNodeList(this.xmlDocument, query);
			for(int i=0;i<selectNodeList.getLength();i++){
				nodes.add(selectNodeList.item(i));
			}
		} catch (JRException e) {
			// Do not care about error in node selection
		}
		return nodes;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.jaspersoft.studio.data.querydesigner.ISelectableNodes#getSelectableNodes(java.lang.String)
	 */
	public List<XMLNode> getSelectableNodes(String query){
		List<Node> nodes = selectNodeList(query);
		List<XMLNode> selected=new ArrayList<XMLNode>();
		for(XMLNode n : getDocumentNodesMap().keySet()){
			if(nodes.contains(getDocumentNodesMap().get(n))){
				selected.add(n);
			}
		}
		return selected;
	}
	
}
