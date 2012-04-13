/*
 * generated by Xtext
 */
package com.jaspersoft.studio.editor.jrexpressions.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class JavaJRExpressionUiModule extends com.jaspersoft.studio.editor.jrexpressions.ui.AbstractJavaJRExpressionUiModule {
	public JavaJRExpressionUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration () {
	    return JavaJRExpressionHighlightingConfiguration.class;
	  }
	 public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator(){
		 return JavaJRExpressionHighlightingCalculator.class;
	 }
}
