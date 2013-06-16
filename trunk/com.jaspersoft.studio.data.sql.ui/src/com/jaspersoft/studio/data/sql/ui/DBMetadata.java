package com.jaspersoft.studio.data.sql.ui;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.data.DataAdapterService;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.part.PluginTransfer;

import com.jaspersoft.studio.data.DataAdapterDescriptor;
import com.jaspersoft.studio.data.sql.SQLQueryDesigner;
import com.jaspersoft.studio.data.sql.model.MDBObjects;
import com.jaspersoft.studio.data.sql.model.metadata.MColumn;
import com.jaspersoft.studio.data.sql.model.metadata.MFunction;
import com.jaspersoft.studio.data.sql.model.metadata.MProcedure;
import com.jaspersoft.studio.data.sql.model.metadata.MSqlSchema;
import com.jaspersoft.studio.data.sql.model.metadata.MSqlTable;
import com.jaspersoft.studio.data.sql.model.metadata.MTables;
import com.jaspersoft.studio.dnd.NodeDragListener;
import com.jaspersoft.studio.dnd.NodeTransfer;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.IDragable;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MRoot;
import com.jaspersoft.studio.model.util.ModelVisitor;
import com.jaspersoft.studio.outline.ReportTreeContetProvider;
import com.jaspersoft.studio.outline.ReportTreeLabelProvider;

public class DBMetadata {
	private TreeViewer treeViewer;
	private MRoot root;
	private SQLQueryDesigner designer;

	public DBMetadata(SQLQueryDesigner designer) {
		this.designer = designer;
	}

	public Control createControl(Composite parent) {
		composite = new Composite(parent, SWT.NONE);
		stackLayout = new StackLayout();
		composite.setLayout(stackLayout);

		mcmp = new Composite(composite, SWT.BORDER);
		mcmp.setLayout(new GridLayout());

		msg = new Label(mcmp, SWT.WRAP | SWT.CENTER);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.verticalAlignment = SWT.CENTER;
		gd.grabExcessVerticalSpace = true;
		gd.horizontalAlignment = SWT.CENTER;
		gd.horizontalIndent = 20;
		msg.setLayoutData(gd);
		msg.setText("No Metadata.\nSelect a JDBC DataAdapter.");
		msg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				if (!running)
					designer.updateMetadata();
			}
		});

		treeViewer = new TreeViewer(composite, SWT.MULTI | SWT.BORDER);
		treeViewer.setContentProvider(new ReportTreeContetProvider());
		treeViewer.setLabelProvider(new ReportTreeLabelProvider());

		ColumnViewerToolTipSupport.enableFor(treeViewer);

		treeViewer.addDragSupport(DND.DROP_COPY | DND.DROP_MOVE, new Transfer[] { NodeTransfer.getInstance(), PluginTransfer.getInstance() }, new NodeDragListener(treeViewer) {
			@Override
			public void dragStart(DragSourceEvent event) {
				TreeSelection s = (TreeSelection) treeViewer.getSelection();
				for (TreePath tp : s.getPaths()) {
					if (!(tp.getLastSegment() instanceof IDragable)) {
						event.doit = false;
						return;
					}
				}
			}

			@Override
			public void dragFinished(DragSourceEvent event) {
				treeViewer.refresh(true);
				if (!event.doit)
					return;
			}
		});
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				TreeSelection ts = (TreeSelection) treeViewer.getSelection();
				Object el = ts.getFirstElement();
				if (treeViewer.getExpandedState(el))
					treeViewer.collapseToLevel(el, 1);
				else
					treeViewer.expandToLevel(el, 1);
			}
		});
		MenuManager menuMgr = new MenuManager();
		Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
		menuMgr.add(new Action("&Refresh") {
			@Override
			public void run() {
				if (!running)
					designer.updateMetadata();
			}
		});
		treeViewer.getControl().setMenu(menu);

		stackLayout.topControl = mcmp;

		root = new MRoot(null, null);
		updateUI(root);

		return composite;
	}

	private boolean running = false;
	private Label msg;
	private StackLayout stackLayout;
	private Composite mcmp;
	private Composite composite;

	public void updateUI(final DataAdapterDescriptor da, final DataAdapterService das, IProgressMonitor monitor) {
		if (running)
			return;
		running = true;
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				msg.setText("Getting metadata for\n" + da.getName() + "\nPlease wait ...");
				stackLayout.topControl = mcmp;
				mcmp.layout(true);
				composite.layout(true);
			}
		});
		root.removeChildren();
		final Connection c = getConnection(das);
		if (c != null)
			try {
				final DatabaseMetaData meta = c.getMetaData();
				ResultSet schemas = meta.getSchemas();
				while (schemas.next()) {
					String tableSchema = schemas.getString("TABLE_SCHEM");
					String tableCatalog = null;
					if (meta.supportsCatalogsInTableDefinitions())
						tableCatalog = schemas.getString("TABLE_CATALOG");
					new MSqlSchema(root, tableSchema, tableCatalog);
					if (monitor.isCanceled())
						break;
				}
				updateUI(root);
				for (INode n : root.getChildren()) {
					MSqlSchema schema = (MSqlSchema) n;
					readTables(meta, schema.getValue(), schema.getTableCatalog(), schema, "System Tables", new String[] { "SYSTEM TABLE" });
					readTables(meta, schema.getValue(), schema.getTableCatalog(), schema, "Tables", new String[] { "TABLE" });
					readTables(meta, schema.getValue(), schema.getTableCatalog(), schema, "Views", new String[] { "VIEW" });
					readTables(meta, schema.getValue(), schema.getTableCatalog(), schema, "Temporary Tables", new String[] { "GLOBAL TEMPORARY", "LOCAL TEMPORARY" });
					readTables(meta, schema.getValue(), schema.getTableCatalog(), schema, "Aliases, Synonims", new String[] { "ALIAS", "SYNONYM" });
					updateItermediateUI();
					setFirstSelection();
					try {
						ResultSet rs = meta.getProcedures(schema.getTableCatalog(), schema.getValue(), "%");
						MDBObjects mprocs = new MDBObjects(schema, "Procedures", "icons/function.png");
						while (rs.next())
							new MProcedure(mprocs, rs.getString("PROCEDURE_NAME"), rs);
					} catch (Throwable e) {
					}
					try {
						ResultSet rs = meta.getFunctions(schema.getTableCatalog(), schema.getValue(), "%");
						MDBObjects mfunct = new MDBObjects(schema, "Functions", "icons/function.png");
						while (rs.next())
							new MFunction(mfunct, rs.getString("FUNCTION_NAME"), rs);
					} catch (Throwable e) {
					}
					updateItermediateUI();
					if (monitor.isCanceled())
						break;
				}
				new ModelVisitor<Object>(root) {

					@Override
					public boolean visit(INode n) {
						// if (n instanceof MSqlSchema || n instanceof MTables)
						// return true;
						if (n instanceof MSqlTable) {
							try {
								MSqlTable mt = (MSqlTable) n;
								MTables tables = (MTables) mt.getParent();
								ResultSet rs = meta.getColumns(tables.getTableCatalog(), tables.getTableSchema(), mt.getValue(), "%");
								while (rs.next())
									new MColumn((ANode) n, rs.getString("COLUMN_NAME"), rs);
								return false;
							} catch (Throwable e) {
							}
						}
						return true;
					}
				};
			} catch (Throwable e) {
				designer.showError(e);
			}

		updateItermediateUI();
		running = false;
	}

	protected void readTables(DatabaseMetaData meta, String tableSchema, String tableCatalog, MDBObjects msch, String title, String[] types) {
		try {
			MDBObjects mview = new MTables(msch, title);
			ResultSet rs = meta.getTables(tableCatalog, tableSchema, "%", types);
			while (rs.next())
				new MSqlTable(mview, rs.getString("TABLE_NAME"), rs);
			// for (INode n : mview.getChildren()) {
			// rs = meta.getColumns(tableCatalog, tableSchema, (String) n.getValue(),
			// "%");
			// while (rs.next())
			// new MColumn((ANode) n, rs.getString("COLUMN_NAME"), rs);
			// }
		} catch (Throwable e) {
		}
	}

	public MRoot getRoot() {
		return root;
	}

	public Connection getConnection(final DataAdapterService das) {
		schema = null;
		Map<String, Object> parameters = new HashMap<String, Object>();
		try {
			if (das != null)
				das.contributeParameters(parameters);
		} catch (JRException e1) {
			designer.showError(e1);
		}

		Connection c = (Connection) parameters.get(JRParameter.REPORT_CONNECTION);
		// TODO implement some compatibility, getSchema() available since 1.7
		if (c != null) {
			try {
				Method m = c.getClass().getMethod("getSchema", new Class<?>[0]);
				if (m != null)
					schema = (String) m.invoke(c, new Object[0]);
				// schema = c.getSchema();
			} catch (Throwable e) {
			}
		}
		return c;
	}

	private String schema;

	public String getCurrentSchema() {
		return schema;
	}

	protected void updateUI(final MRoot root) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				DBMetadata.this.root = root;
				if (DBMetadata.this.root == null)
					DBMetadata.this.root = new MRoot(null, null);
				treeViewer.setInput(DBMetadata.this.root);
				setFirstSelection();
				if (root.getChildren().isEmpty())
					msg.setText("No Metadata.\nDouble click to refresh.");
				else
					stackLayout.topControl = treeViewer.getControl();
				composite.layout(true);
			}
		});
	}

	protected void updateItermediateUI() {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				if (!treeViewer.getControl().isDisposed())
					treeViewer.refresh(true);
			}
		});
	}

	protected void setFirstSelection() {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				MSqlSchema selection = null;
				if (schema != null) {
					for (INode n : DBMetadata.this.root.getChildren()) {
						if (n instanceof MSqlSchema) {
							if (n.getValue().equals(schema)) {
								((MSqlSchema) n).setCurrent(true);
								selection = (MSqlSchema) n;
								break;
							}
						}
					}
				}
				if (selection != null)
					treeViewer.expandToLevel(selection, 1);
			}
		});
	}
}
