package com.jaspersoft.studio.editor.jrexpressions.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class JavaJRExpressionHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String FIELD_TOKEN="Field";
	public static final String PARAM_TOKEN="Parameter";
	public static final String VARIABLE_TOKEN="Variable";
	 public static final String[] ALL_STRINGS =
		  { FIELD_TOKEN,PARAM_TOKEN,VARIABLE_TOKEN };
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		addType(acceptor, PARAM_TOKEN, 187, 29, 29, SWT.BOLD);
		addType(acceptor, VARIABLE_TOKEN, 0, 0, 255, SWT.BOLD);
		addType(acceptor, FIELD_TOKEN, 0, 178, 0, SWT.BOLD);
	}

	public void addType(IHighlightingConfigurationAcceptor acceptor, String s,
			int r, int g, int b, int style) {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(r, g, b));
		textStyle.setStyle(style);
		acceptor.acceptDefaultHighlighting(s, s, textStyle);
	}
}
