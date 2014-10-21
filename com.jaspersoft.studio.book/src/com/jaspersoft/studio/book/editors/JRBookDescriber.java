package com.jaspersoft.studio.book.editors;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.XMLContentDescriber;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.jaspersoft.studio.utils.XMLUtils;

public class JRBookDescriber extends XMLContentDescriber {

	@Override
	public int describe(InputStream in, IContentDescription description) throws IOException {
		try {
			Document document = XMLUtils.parseNoValidation(in);
			document.getDocumentElement().normalize();
			NodeList bookParts = document.getElementsByTagName("part");
			if(bookParts!=null && bookParts.getLength()>0){
				return VALID;
			}
		} catch (ParserConfigurationException e) {
		} catch (SAXException e) {
		}
		return INVALID;
	}

}
