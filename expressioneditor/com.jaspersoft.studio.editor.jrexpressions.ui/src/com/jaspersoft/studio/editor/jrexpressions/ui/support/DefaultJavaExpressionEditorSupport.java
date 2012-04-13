package com.jaspersoft.studio.editor.jrexpressions.ui.support;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.editor.expression.ExpressionEditorComposite;
import com.jaspersoft.studio.editor.expression.ExpressionEditorSupport;

/**
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 *
 */
public class DefaultJavaExpressionEditorSupport extends ExpressionEditorSupport {
	
	@Override
	public void configureExpressionWidget(StyledText widget, ExpressionContext exprContext) {
		// TODO IMPLEMENT!
	}

	@Override
	public ExpressionEditorComposite createExpressionEditorComposite(
			Composite parent) {
		ExpressionEditorComposite content = new DefaultExpressionEditorComposite(parent,SWT.NONE);
		content.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
		return content;
	}

}
