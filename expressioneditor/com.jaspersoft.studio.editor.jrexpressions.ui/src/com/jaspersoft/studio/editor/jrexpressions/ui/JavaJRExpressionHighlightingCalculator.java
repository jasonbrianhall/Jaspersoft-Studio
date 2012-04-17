package com.jaspersoft.studio.editor.jrexpressions.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodName;

public class JavaJRExpressionHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource == null)
			return;
		IParseResult parseResult = resource.getParseResult();
		if(parseResult==null)
			return;
		INode root = parseResult.getRootNode();
		BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
		
		while (it.hasNext()){
			INode currnode = it.next();
			EObject semanticElement = currnode.getSemanticElement();
			EObject grammarElement = currnode.getGrammarElement();
			if(semanticElement!=null){
				if (semanticElement instanceof MethodName) {
					MethodName name=(MethodName)semanticElement;
					MethodInvocation method=(MethodInvocation)name.eContainer();
					Expression expression=(Expression) method.eContainer();
					if(expression.getMethods()==null || !expression.getMethods().contains(method)){
						acceptor.addPosition(currnode.getOffset(), currnode.getLength(), JavaJRExpressionHighlightingConfiguration.FUNCTION_METHOD);
					}
				}
			}
			if (grammarElement instanceof RuleCall){
				final String name = ((RuleCall)grammarElement).getRule().getName();
				if(name.equals("STRINGLITERAL")){
					acceptor.addPosition(currnode.getOffset(), currnode.getLength(), JavaJRExpressionHighlightingConfiguration.STRING_ID);
				}
				else if(name.equals("ParameterToken")){
					acceptor.addPosition(currnode.getOffset(), currnode.getLength(), JavaJRExpressionHighlightingConfiguration.PARAM_TOKEN);
				}
				else if(name.equals("VariableToken")){
					acceptor.addPosition(currnode.getOffset(), currnode.getLength(), JavaJRExpressionHighlightingConfiguration.VARIABLE_TOKEN);
				}
				else if(name.equals("FieldToken")){
					acceptor.addPosition(currnode.getOffset(), currnode.getLength(), JavaJRExpressionHighlightingConfiguration.FIELD_TOKEN);
				}
			}
		}
	}

}
