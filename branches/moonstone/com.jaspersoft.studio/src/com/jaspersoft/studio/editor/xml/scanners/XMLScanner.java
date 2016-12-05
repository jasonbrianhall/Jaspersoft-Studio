/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.editor.xml.scanners;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.wb.swt.ColorManager;

import com.jaspersoft.studio.editor.xml.IXMLColorConstants;
import com.jaspersoft.studio.editor.xml.XMLWhitespaceDetector;



public class XMLScanner extends RuleBasedScanner {

	public XMLScanner(ColorManager manager) {
		IToken procInstr =
			new Token(
				new TextAttribute(
					manager.getColor(IXMLColorConstants.PROC_INSTR)));
		IToken docType =
			new Token(
				new TextAttribute(
					manager.getColor(IXMLColorConstants.DOCTYPE)));

		IRule[] rules = new IRule[3];
		//Add rule for processing instructions and doctype
		rules[0] = new MultiLineRule("<?", "?>", procInstr);
		rules[1] = new MultiLineRule("<!DOCTYPE", ">", docType);
		// Add generic whitespace rule.
		rules[2] = new WhitespaceRule(new XMLWhitespaceDetector());

		setRules(rules);
	}
}
