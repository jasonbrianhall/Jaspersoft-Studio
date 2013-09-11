package com.jaspersoft.studio.data.sql.text2model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.jaspersoft.studio.data.sql.DbObjectName;
import com.jaspersoft.studio.data.sql.SQLQueryDesigner;
import com.jaspersoft.studio.data.sql.Util;
import com.jaspersoft.studio.data.sql.impl.ColImpl;
import com.jaspersoft.studio.data.sql.model.metadata.INotInMetadata;
import com.jaspersoft.studio.data.sql.model.metadata.MSQLColumn;
import com.jaspersoft.studio.data.sql.model.metadata.MSqlSchema;
import com.jaspersoft.studio.data.sql.model.metadata.MSqlTable;
import com.jaspersoft.studio.data.sql.model.metadata.MTables;
import com.jaspersoft.studio.data.sql.model.query.from.MFrom;
import com.jaspersoft.studio.data.sql.model.query.from.MFromTable;
import com.jaspersoft.studio.data.sql.model.query.select.MSelect;
import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MDummy;
import com.jaspersoft.studio.model.MRoot;
import com.jaspersoft.studio.model.util.KeyValue;
import com.jaspersoft.studio.model.util.ModelVisitor;
import com.jaspersoft.studio.utils.Misc;

public class ConvertUtil {

	public static String getDbObjectName(EList<EObject> eContents, int i) {
		int size = eContents.size();
		if (size >= i) {
			EObject eobj = eContents.get(size - i);
			if (eobj instanceof DbObjectName)
				return ((DbObjectName) eobj).getDbname();
		}
		if (!eContents.isEmpty() && eContents.get(0) instanceof ColImpl) {
			ColImpl c = (ColImpl) eContents.get(0);
			size = c.getEntries().size();
			if (size >= 3 - i)
				return c.getEntries().get(3 - i).getDbname();
		}
		return null;
	}

	public static void cleanDBMetadata(MRoot dbRoot) {
		new ModelVisitor<Object>(dbRoot) {

			@Override
			public boolean visit(INode n) {
				return true;
			}

			@Override
			public void iterate(INode node) {
				List<INode> toRemove = null;
				for (INode n : node.getChildren()) {
					if (n instanceof INotInMetadata && ((INotInMetadata) n).isNotInMetadata()) {
						if (toRemove == null)
							toRemove = new ArrayList<INode>();
						toRemove.add(n);
						continue;
					}
					if (visit(n))
						iterate(n);
				}
				if (toRemove != null)
					((ANode) node).removeChildren(toRemove);
			}
		};
	}

	public static boolean isInSchema(MSqlTable msqltable, String schema) {
		MSqlSchema mschema = null;
		if (schema != null) {
			ANode parent = msqltable.getParent();
			if (parent != null) {
				if (parent instanceof MSqlSchema)
					mschema = (MSqlSchema) parent;
				else {
					parent = parent.getParent();
					if (parent != null && parent instanceof MSqlSchema)
						mschema = (MSqlSchema) parent;
				}
			}
			if (mschema != null && !mschema.getValue().equalsIgnoreCase(schema))
				return false;
		}
		return true;
	}

	public static KeyValue<MSQLColumn, MFromTable> findColumn(final MSelect msel, final String schema, final String table, final String column) {
		return new ModelVisitor<KeyValue<MSQLColumn, MFromTable>>(Util.getKeyword(msel, MFrom.class)) {

			@Override
			public boolean visit(INode n) {
				if (n instanceof MFromTable) {
					MFromTable ft = (MFromTable) n;
					MSqlTable msqltable = ft.getValue();
					if (!isInSchema(msqltable, schema))
						return true;
					if (table != null && !msqltable.getValue().equalsIgnoreCase(table)) {
						if (ft.getAlias() == null || (ft.getAlias() != null && !ft.getAlias().equalsIgnoreCase(table)))
							return true;
					}
					for (INode c : msqltable.getChildren()) {
						if (c instanceof MSQLColumn) {
							MSQLColumn mcol = (MSQLColumn) c;
							if (mcol.getValue().equalsIgnoreCase(column)) {
								setObject(new KeyValue<MSQLColumn, MFromTable>(mcol, ft));
								stop();
							}
						}
					}
					return true;
				}
				return false;
			}
		}.getObject();
	}

	public static MSqlTable getTableUnknown(MRoot dbroot, String schema, String table, SQLQueryDesigner designer) {
		MSqlSchema msqlschem = ConvertUtil.findSchema(dbroot, Misc.nvl(schema), designer);
		return new MSqlTable(msqlschem, Misc.nvl(table), true);
	}

	public static MSqlSchema findSchema(MRoot dbroot, String schema, SQLQueryDesigner designer) {
		if (schema == null)
			schema = "";
		boolean isNull = schema.isEmpty();
		for (INode n : dbroot.getChildren()) {
			MSqlSchema ms = (MSqlSchema) n;
			if ((!isNull && ms.getValue().equalsIgnoreCase(schema)) || (isNull && ms.isCurrent())) {
				designer.getDbMetadata().loadSchema(ms);
				return ms;
			}
		}
		return new MSqlSchema(dbroot, schema, null, true);
	}

	public static MSqlTable findTable(MRoot dbroot, String schema, final String table, final SQLQueryDesigner designer) {
		MSqlSchema ms = findSchema(dbroot, schema, designer);
		return new ModelVisitor<MSqlTable>(ms) {
			@Override
			public boolean visit(INode n) {
				if (n instanceof MSqlTable) {
					MSqlTable mt = (MSqlTable) n;
					if (mt.getValue().equalsIgnoreCase(table)) {
						if (mt.getChildren().isEmpty() || mt.getChildren().get(0) instanceof MDummy)
							designer.getDbMetadata().loadTable(mt);
						setObject(mt);
						stop();
					}
				} else if (n instanceof MTables)
					return true;
				return false;
			}
		}.getObject();
	}

	public static String getParamValue(String prm) {
		return prm.replace("$P{", "").replace("}", "");
	}

	public static String getParamExclamationValue(String prm) {
		return prm.replace("$P!{", "").replace("}", "");
	}
}
