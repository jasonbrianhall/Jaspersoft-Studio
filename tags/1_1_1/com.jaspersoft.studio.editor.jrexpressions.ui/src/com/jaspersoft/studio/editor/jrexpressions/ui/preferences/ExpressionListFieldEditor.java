package com.jaspersoft.studio.editor.jrexpressions.ui.preferences;

import java.util.ArrayList;
import java.util.StringTokenizer;

import net.sf.jasperreports.engine.design.JRDesignExpression;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.preference.ListEditor;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.property.descriptor.expression.dialog.JRExpressionEditor;
import com.jaspersoft.studio.utils.Misc;

/**
 * Field editor for a list of user defined expressions.
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 *
 */
public class ExpressionListFieldEditor extends ListEditor{
	
	public static final String EXPRESSION_SEP="\n";

	public ExpressionListFieldEditor(String name, String labelText,
			Composite parent) {
		super(name, labelText, parent);
	}

	@Override
	protected String createList(String[] items) {
        StringBuffer expressionsBuff = new StringBuffer("");//$NON-NLS-1$

        for (int i = 0; i < items.length; i++) {
        	expressionsBuff.append(items[i]);
        	expressionsBuff.append(EXPRESSION_SEP);
        }
        return expressionsBuff.toString();
	}

	@Override
	protected String getNewInputObject() {
		JRExpressionEditor wizard = new JRExpressionEditor();
		WizardDialog dialog = new WizardDialog(getShell(),wizard);
		dialog.create();
		if (dialog.open() == Dialog.OK) {
			JRDesignExpression newExp = wizard.getValue();
			if(newExp!=null &&
					!Misc.nvl(newExp.getText()).equals("")){
				return newExp.getText();
			}
		}
		return null;
	}

	@Override
	protected String[] parseString(String stringList) {
        StringTokenizer st = new StringTokenizer(stringList, EXPRESSION_SEP);//$NON-NLS-1$
        ArrayList<String> v = new ArrayList<String>();
        while (st.hasMoreElements()) {
            v.add((String)st.nextElement());
        }
        return v.toArray(new String[v.size()]);
	}
	
}