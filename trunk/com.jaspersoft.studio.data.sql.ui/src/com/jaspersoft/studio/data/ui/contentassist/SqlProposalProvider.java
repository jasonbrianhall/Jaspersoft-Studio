/*
 * generated by Xtext
 */
package com.jaspersoft.studio.data.ui.contentassist;

import java.util.LinkedHashMap;
import java.util.List;

import net.sf.jasperreports.eclipse.JasperReportsPlugin;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.design.JRDesignDataset;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.jaspersoft.studio.data.sql.SQLQueryDesigner;
import com.jaspersoft.studio.data.sql.Util;
import com.jaspersoft.studio.data.sql.impl.SelectImpl;
import com.jaspersoft.studio.data.sql.model.metadata.MSQLColumn;
import com.jaspersoft.studio.data.sql.model.metadata.MSqlTable;
import com.jaspersoft.studio.data.sql.model.query.AMQueryAliased;
import com.jaspersoft.studio.data.sql.model.query.expression.MExpressionX;
import com.jaspersoft.studio.data.sql.model.query.from.MFromTable;
import com.jaspersoft.studio.data.sql.model.query.select.MSelect;
import com.jaspersoft.studio.data.sql.text2model.Text2Model;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MRoot;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant
 */
public class SqlProposalProvider extends AbstractSqlProposalProvider {
	protected Object getDesigner(ContentAssistContext context) {
		return context.getViewer().getTextWidget().getData(SQLQueryDesigner.SQLQUERYDESIGNER);
	}

	@Override
	public void complete_FromTableJoin(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		proposeTables(context, acceptor);
	}

	@Override
	public void completeFromTable_Table(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		proposeTables(context, acceptor);
	}

	protected void proposeTables(ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		Object obj = getDesigner(context);
		if (obj instanceof SQLQueryDesigner) {
			SQLQueryDesigner d = (SQLQueryDesigner) obj;
			d.refreshQueryModel();
			Image img = JasperReportsPlugin.getDefault().getImage("icons/table.png");
			LinkedHashMap<String, MSqlTable> tables = d.getDbMetadata().getTables();
			for (String s : tables.keySet()) {
				String sp = tables.get(s).getDisplayText();
				ConfigurableCompletionProposal proposal = (ConfigurableCompletionProposal) createCompletionProposal(sp, s, img, context);
				if (proposal != null) {
					if (tables.get(s).isCurrentSchema())
						proposal.setReplacementString(s);
					acceptor.accept(proposal);
				}
			}
		}
	}

	@Override
	public void completeOrderByColumnFull_ColOrder(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		proposeColumnOrAlias(context, acceptor);
	}

	@Override
	public void completeGroupByColumnFull_ColGrBy(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		proposeColumnOrAlias(context, acceptor);
	}

	@Override
	public void completeColumnOperand_Cfull(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		proposeColumn(context, acceptor);
	}

	@Override
	public void completeXExpression_Col(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		proposeColumnOrAlias(context, acceptor);
	}

	protected ANode proposeColumn(ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		MRoot qroot = null;
		Object obj = getDesigner(context);
		if (obj instanceof SQLQueryDesigner) {
			SQLQueryDesigner d = (SQLQueryDesigner) obj;
			qroot = new MRoot(null, null);
			Util.createSelect(qroot);
			if (context.getCurrentModel() instanceof SelectImpl) {
				Text2Model.convertSelect(d, qroot, (SelectImpl) context.getCurrentModel());
				List<MFromTable> tbls = Util.getFromTables(qroot);
				for (MFromTable mft : tbls) {
					for (INode n : mft.getValue().getChildren()) {
						MSQLColumn mc = (MSQLColumn) n;
						String s = mc.getValue();
						if (mft.getAlias() != null)
							s = mft.getAlias() + "." + s;
						else
							s = mft.getValue().toSQLString() + "." + s;
						ConfigurableCompletionProposal proposal = (ConfigurableCompletionProposal) createCompletionProposal(mc.getDisplayText(), s, null, context);
						if (proposal != null) {
							if (mft.getValue().isCurrentSchema())
								proposal.setReplacementString(mc.getDisplayText());
							acceptor.accept(proposal);
						}
					}
				}
			}
		}
		return qroot;
	}

	protected void proposeColumnOrAlias(ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		ANode qroot = proposeColumn(context, acceptor);
		if (qroot != null) {
			MSelect msel = Util.getKeyword(qroot, MSelect.class);
			for (INode n : msel.getChildren()) {
				if (n instanceof AMQueryAliased && ((AMQueryAliased<?>) n).getAlias() != null) {
					ConfigurableCompletionProposal proposal = (ConfigurableCompletionProposal) createCompletionProposal(((AMQueryAliased<?>) n).getAlias(), n.getStyledDisplayText(), null, context);
					if (proposal != null) {
						acceptor.accept(proposal);
					}
				}
			}
		}
	}

	@Override
	public void completeXExpression_Xf(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		for (String s : MExpressionX.FUNCTIONS) {
			ICompletionProposal proposal = createCompletionProposal(s, context);
			if (proposal != null)
				acceptor.accept(proposal);
		}
	}

	@Override
	public void completeParameterOperand_Prm(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		proposeJRParameter(context, acceptor);
	}

	@Override
	public void completeExclamationParameterOperand_Prm(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		proposeJRParameter(context, acceptor);
	}

	protected void proposeJRParameter(ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		Object obj = getDesigner(context);
		if (obj instanceof SQLQueryDesigner) {
			SQLQueryDesigner d = (SQLQueryDesigner) obj;
			JRDesignDataset ds = d.getjDataset();
			if (ds != null) {
				for (JRParameter p : ds.getParametersList()) {
					if (Number.class.isAssignableFrom(p.getValueClass()) || String.class.isAssignableFrom(p.getValueClass())) {
						ICompletionProposal proposal = createCompletionProposal(p.getName(), context);
						if (proposal != null)
							acceptor.accept(proposal);
					}
				}
			}
		}
	}
}
