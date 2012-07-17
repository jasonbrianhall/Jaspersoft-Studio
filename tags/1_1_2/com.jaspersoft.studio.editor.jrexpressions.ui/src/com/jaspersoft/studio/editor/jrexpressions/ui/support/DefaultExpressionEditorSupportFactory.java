package com.jaspersoft.studio.editor.jrexpressions.ui.support;

import net.sf.jasperreports.engine.JRExpression;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

import com.jaspersoft.studio.editor.expression.ExpressionEditorSupport;
import com.jaspersoft.studio.editor.expression.IExpressionEditorSupportFactory;
import com.jaspersoft.studio.editor.jrexpressions.ui.JRExpressionsActivator;
import com.jaspersoft.studio.editor.jrexpressions.ui.JRExpressionsUIPlugin;

/**
 * This is the default support factory for the {@link JRExpression} editor,
 * provided by Jaspersoft Studio.
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 * 
 */
public class DefaultExpressionEditorSupportFactory implements IExpressionEditorSupportFactory {
	
	public DefaultExpressionEditorSupportFactory() {
	}

	/*
	 * (non-Javadoc)
	 * @see com.jaspersoft.studio.editor.expression.IExpressionEditorSupportFactory#getExpressionEditorSupport(java.lang.String)
	 */
	public ExpressionEditorSupport getExpressionEditorSupport(String language) {
		Assert.isNotNull(language);
		// Let's look for contributed editor support
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(
				JRExpressionsUIPlugin.PLUGIN_ID, "jrexpressionLanguage"); //$NON-NLS-1$
		for(IConfigurationElement el : config){
			if(language.equals(el.getAttribute("languageName"))){
				Object supportClazz=null;
				try{
					supportClazz=el.createExecutableExtension("class");
					if(supportClazz instanceof ExpressionEditorSupport){
						return (ExpressionEditorSupport) supportClazz;
					}
				}
				catch(CoreException ex){
					JRExpressionsActivator.getInstance().getLog().log(
							new Status(IStatus.ERROR, JRExpressionsUIPlugin.PLUGIN_ID, "An error occurred while trying to create the new class.", ex));
				}
			}
		}
		
		// TODO - Fallback solution, propose the default one.
		// For now, null will show the old text editor.
		return null;
	}

}
