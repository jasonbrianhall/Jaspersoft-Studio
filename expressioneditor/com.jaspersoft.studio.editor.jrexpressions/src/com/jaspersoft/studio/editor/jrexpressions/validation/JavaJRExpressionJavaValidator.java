package com.jaspersoft.studio.editor.jrexpressions.validation;

import net.sf.jasperreports.expressions.functions.util.FunctionsLibraryUtil;

import org.eclipse.xtext.validation.Check;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodName;
 

public class JavaJRExpressionJavaValidator extends AbstractJavaJRExpressionJavaValidator {

	@Check
	public void checkLibraryFunctionName(MethodName name) {
		MethodInvocation method=(MethodInvocation)name.eContainer();
		Expression expression=(Expression) method.eContainer();
		if(expression.getMethods()==null || !expression.getMethods().contains(method)){
			// Function library
			if(!FunctionsLibraryUtil.existsFunction(name.getMethodName())){
				error("The specified function was not found in the contributed library", name, JavaJRExpressionPackage.Literals.METHOD_NAME__METHOD_NAME, 111);
			}
		}
	}

}
