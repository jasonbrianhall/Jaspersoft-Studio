package com.jaspersoft.studio.data.sql.dialogs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import com.jaspersoft.studio.data.sql.Util;
import com.jaspersoft.studio.data.sql.model.metadata.MColumn;
import com.jaspersoft.studio.data.sql.model.query.from.MFrom;
import com.jaspersoft.studio.data.sql.model.query.from.MFromTable;
import com.jaspersoft.studio.data.sql.model.query.from.MFromTableJoin;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.outline.ReportTreeContetProvider;
import com.jaspersoft.studio.outline.ReportTreeLabelProvider;

public class FromTableColumnsDialog extends ATitledDialog {
	private TreeViewer treeViewer;
	private Map<MColumn, MFromTable> cols = new HashMap<MColumn, MFromTable>();
	private MFrom root;
	private int style = SWT.MULTI;

	public FromTableColumnsDialog(Shell parentShell) {
		super(parentShell);
		setTitle("Columns Dialog");
	}

	public FromTableColumnsDialog(Shell parentShell, int style) {
		this(parentShell);
		this.style = style;
	}

	public void setSelection(ANode sel) {
		for (INode n : sel.getRoot().getChildren())
			if (n instanceof MFrom) {
				root = (MFrom) n;
				break;
			}
	}

	@Override
	public boolean close() {
		if (getReturnCode() == OK) {
			TreeSelection ts = (TreeSelection) treeViewer.getSelection();
			for (TreePath tp : ts.getPaths())
				if (tp.getSegmentCount() == 2)
					cols.put((MColumn) tp.getLastSegment(), (MFromTable) tp.getFirstSegment());
		}
		return super.close();
	}

	public Map<MColumn, MFromTable> getColumns() {
		return cols;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite cmp = (Composite) super.createDialogArea(parent);

		treeViewer = new TreeViewer(cmp, style | SWT.BORDER);
		treeViewer.setContentProvider(new ReportTreeContetProvider() {
			@Override
			public Object[] getChildren(Object parentElement) {
				if (parentElement instanceof MFrom) {
					List<MFromTable> tables = Util.getFromTables((MFrom) parentElement);
					return tables.toArray();
				} else if (parentElement instanceof MFromTable) {
					MFromTable mftable = (MFromTable) parentElement;
					return mftable.getValue().getChildren().toArray();
				}
				return super.getChildren(parentElement);
			}

		});
		treeViewer.setLabelProvider(new ReportTreeLabelProvider() {
			@Override
			public StyledString getStyledText(Object element) {
				if (element instanceof MFromTableJoin) {
					MFromTableJoin mft = (MFromTableJoin) element;
					StyledString ss = new StyledString(mft.getValue().toSQLString());
					mft.addAlias(ss);
					return ss;
				}
				return super.getStyledText(element);
			}
		});
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.minimumHeight = 400;
		gd.minimumWidth = 400;
		treeViewer.getControl().setLayoutData(gd);
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				TreeSelection ts = (TreeSelection) treeViewer.getSelection();
				Object el = ts.getFirstElement();
				if (el instanceof MColumn)
					okPressed();
				else {
					if (treeViewer.getExpandedState(el))
						treeViewer.collapseToLevel(el, 1);
					else
						treeViewer.expandToLevel(el, 1);
				}
			}
		});
		ColumnViewerToolTipSupport.enableFor(treeViewer);
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				TreeSelection ts = (TreeSelection) treeViewer.getSelection();
				Object el = ts.getFirstElement();
				getButton(IDialogConstants.OK_ID).setEnabled(el instanceof MColumn);
			}
		});
		treeViewer.setInput(root);

		treeViewer.expandAll();
		return cmp;
	}
}
