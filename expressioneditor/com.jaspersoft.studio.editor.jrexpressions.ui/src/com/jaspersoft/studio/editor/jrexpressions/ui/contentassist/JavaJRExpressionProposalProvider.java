/*
* generated by Xtext
*/
package com.jaspersoft.studio.editor.jrexpressions.ui.contentassist;

import java.util.List;

import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JRVariable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.editor.expression.ExpressionContextUtils;
import com.jaspersoft.studio.editor.jrexpressions.ui.internal.JavaJRExpressionActivator;
import com.jaspersoft.studio.utils.ResourceManager;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class JavaJRExpressionProposalProvider extends AbstractJavaJRExpressionProposalProvider {
	
	@Override
	public void complete_FieldToken(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		ExpressionContext exprContext=(ExpressionContext) ((XtextSourceViewer) context.getViewer()).getData(ExpressionContext.ATTRIBUTE_EXPRESSION_CONTEXT);
		if(exprContext!=null){
			List<JRField> allFields = ExpressionContextUtils.getAllFields(exprContext);
			for(JRField field : allFields){
				acceptor.accept(createCompletionProposal(
						"$F{" + field.getName() + "}", "$F{" + field.getName() + "}", getFieldIconImg(), context));  
			}
		}
	}
	
	@Override
	public void complete_VariableToken(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		ExpressionContext exprContext=(ExpressionContext) ((XtextSourceViewer) context.getViewer()).getData(ExpressionContext.ATTRIBUTE_EXPRESSION_CONTEXT);
		if(exprContext!=null){
			List<JRVariable> allVariables = ExpressionContextUtils.getAllVariables(exprContext);
			for(JRVariable var : allVariables){
				acceptor.accept(createCompletionProposal(
						"$V{" + var.getName() + "}", "$V{" + var.getName() + "}", getVariableIconImg(), context));  
			}
		}
	}
	
	@Override
	public void complete_ParameterToken(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		ExpressionContext exprContext=(ExpressionContext) ((XtextSourceViewer) context.getViewer()).getData(ExpressionContext.ATTRIBUTE_EXPRESSION_CONTEXT);
		if(exprContext!=null){
			List<JRParameter> allParameters = ExpressionContextUtils.getAllParameters(exprContext);
			for(JRParameter param : allParameters){
				acceptor.accept(createCompletionProposal(
						"$P{" + param.getName() + "}", "$P{" + param.getName() + "}", getParameterIconImg(), context));  
			}
		}
	}
	
	/*
	 * Get JRParameter icon image.
	 */
	private Image getParameterIconImg(){
		return ResourceManager.getPluginImage(JavaJRExpressionActivator.PLUGIN_ID, "/resources/icons/parameters-16.png");
	}
	
	/*
	 * Get JRVariable icon image.
	 */
	private Image getVariableIconImg(){
		return ResourceManager.getPluginImage(JavaJRExpressionActivator.PLUGIN_ID, "/resources/icons/variables-16.png");
	}

	/*
	 * Get JRField icon image.
	 */
	private Image getFieldIconImg(){
		return ResourceManager.getPluginImage(JavaJRExpressionActivator.PLUGIN_ID, "/resources/icons/fields-16.png");
	}
}
