/**
 */
package com.jaspersoft.studio.data.sql;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.jaspersoft.studio.data.sql.SqlFactory
 * @model kind="package"
 * @generated
 */
public interface SqlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sql";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.com.jaspersoft.studio.data.Sql";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sql";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SqlPackage eINSTANCE = com.jaspersoft.studio.data.sql.impl.SqlPackageImpl.init();

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ModelImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__QUERY = 0;

  /**
   * The feature id for the '<em><b>Order By Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ORDER_BY_ENTRY = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.SelectQueryImpl <em>Select Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.SelectQueryImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSelectQuery()
   * @generated
   */
  int SELECT_QUERY = 1;

  /**
   * The number of structural features of the '<em>Select Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.SelectSubSetImpl <em>Select Sub Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.SelectSubSetImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSelectSubSet()
   * @generated
   */
  int SELECT_SUB_SET = 2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SUB_SET__OP = 0;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SUB_SET__ALL = 1;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SUB_SET__QUERY = 2;

  /**
   * The number of structural features of the '<em>Select Sub Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SUB_SET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.SelectImpl <em>Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.SelectImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSelect()
   * @generated
   */
  int SELECT = 3;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__OP = SELECT_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Select</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__SELECT = SELECT_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cols</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__COLS = SELECT_QUERY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tbl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__TBL = SELECT_QUERY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Where Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__WHERE_EXPRESSION = SELECT_QUERY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Group By Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__GROUP_BY_ENTRY = SELECT_QUERY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Having Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__HAVING_ENTRY = SELECT_QUERY_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FEATURE_COUNT = SELECT_QUERY_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OrColumnImpl <em>Or Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OrColumnImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrColumn()
   * @generated
   */
  int OR_COLUMN = 4;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_COLUMN__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Or Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_COLUMN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ColumnOrAliasImpl <em>Column Or Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ColumnOrAliasImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getColumnOrAlias()
   * @generated
   */
  int COLUMN_OR_ALIAS = 5;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OR_ALIAS__ENTRIES = OR_COLUMN__ENTRIES;

  /**
   * The feature id for the '<em><b>Ce</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OR_ALIAS__CE = OR_COLUMN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OR_ALIAS__ALIAS = OR_COLUMN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Col Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OR_ALIAS__COL_ALIAS = OR_COLUMN_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>All Cols</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OR_ALIAS__ALL_COLS = OR_COLUMN_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Column Or Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OR_ALIAS_FEATURE_COUNT = OR_COLUMN_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ColumnFullImpl <em>Column Full</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ColumnFullImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getColumnFull()
   * @generated
   */
  int COLUMN_FULL = 6;

  /**
   * The number of structural features of the '<em>Column Full</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FULL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OrTableImpl <em>Or Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OrTableImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrTable()
   * @generated
   */
  int OR_TABLE = 7;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_TABLE__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Or Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_TABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.FromTableImpl <em>From Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.FromTableImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFromTable()
   * @generated
   */
  int FROM_TABLE = 8;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_TABLE__ENTRIES = OR_TABLE__ENTRIES;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_TABLE__TABLE = OR_TABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fjoin</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_TABLE__FJOIN = OR_TABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>From Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_TABLE_FEATURE_COUNT = OR_TABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.FromTableJoinImpl <em>From Table Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.FromTableJoinImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFromTableJoin()
   * @generated
   */
  int FROM_TABLE_JOIN = 9;

  /**
   * The feature id for the '<em><b>Join</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_TABLE_JOIN__JOIN = 0;

  /**
   * The feature id for the '<em><b>On Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_TABLE_JOIN__ON_TABLE = 1;

  /**
   * The feature id for the '<em><b>Join Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_TABLE_JOIN__JOIN_EXPR = 2;

  /**
   * The number of structural features of the '<em>From Table Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_TABLE_JOIN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.TableOrAliasImpl <em>Table Or Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.TableOrAliasImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getTableOrAlias()
   * @generated
   */
  int TABLE_OR_ALIAS = 10;

  /**
   * The feature id for the '<em><b>Tfull</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_OR_ALIAS__TFULL = 0;

  /**
   * The feature id for the '<em><b>Sq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_OR_ALIAS__SQ = 1;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_OR_ALIAS__ALIAS = 2;

  /**
   * The feature id for the '<em><b>Tbl Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_OR_ALIAS__TBL_ALIAS = 3;

  /**
   * The number of structural features of the '<em>Table Or Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_OR_ALIAS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.TableFullImpl <em>Table Full</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.TableFullImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getTableFull()
   * @generated
   */
  int TABLE_FULL = 11;

  /**
   * The number of structural features of the '<em>Table Full</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FULL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.DbObjectNameImpl <em>Db Object Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.DbObjectNameImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getDbObjectName()
   * @generated
   */
  int DB_OBJECT_NAME = 12;

  /**
   * The feature id for the '<em><b>Dbname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_OBJECT_NAME__DBNAME = COLUMN_FULL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Db Object Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_OBJECT_NAME_FEATURE_COUNT = COLUMN_FULL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OrOrderByColumnImpl <em>Or Order By Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OrOrderByColumnImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrOrderByColumn()
   * @generated
   */
  int OR_ORDER_BY_COLUMN = 13;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_ORDER_BY_COLUMN__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Or Order By Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_ORDER_BY_COLUMN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OrderByColumnFullImpl <em>Order By Column Full</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OrderByColumnFullImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrderByColumnFull()
   * @generated
   */
  int ORDER_BY_COLUMN_FULL = 14;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_COLUMN_FULL__ENTRIES = OR_ORDER_BY_COLUMN__ENTRIES;

  /**
   * The feature id for the '<em><b>Col Order</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_COLUMN_FULL__COL_ORDER = OR_ORDER_BY_COLUMN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_COLUMN_FULL__DIRECTION = OR_ORDER_BY_COLUMN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Order By Column Full</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_COLUMN_FULL_FEATURE_COUNT = OR_ORDER_BY_COLUMN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OrGroupByColumnImpl <em>Or Group By Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OrGroupByColumnImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrGroupByColumn()
   * @generated
   */
  int OR_GROUP_BY_COLUMN = 15;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_GROUP_BY_COLUMN__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Or Group By Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_GROUP_BY_COLUMN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.GroupByColumnFullImpl <em>Group By Column Full</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.GroupByColumnFullImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getGroupByColumnFull()
   * @generated
   */
  int GROUP_BY_COLUMN_FULL = 16;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_COLUMN_FULL__ENTRIES = OR_GROUP_BY_COLUMN__ENTRIES;

  /**
   * The feature id for the '<em><b>Col Gr By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_COLUMN_FULL__COL_GR_BY = OR_GROUP_BY_COLUMN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Group By Column Full</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_COLUMN_FULL_FEATURE_COUNT = OR_GROUP_BY_COLUMN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OrExprImpl <em>Or Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OrExprImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrExpr()
   * @generated
   */
  int OR_EXPR = 17;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Or Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.FullExpressionImpl <em>Full Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.FullExpressionImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFullExpression()
   * @generated
   */
  int FULL_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__ENTRIES = OR_EXPR__ENTRIES;

  /**
   * The feature id for the '<em><b>C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__C = OR_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Efrag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__EFRAG = OR_EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expgroup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__EXPGROUP = OR_EXPR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__EXP = OR_EXPR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Xexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__XEXP = OR_EXPR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__OP1 = OR_EXPR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Isnull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__ISNULL = OR_EXPR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__IN = OR_EXPR_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Between</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__BETWEEN = OR_EXPR_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Like</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__LIKE = OR_EXPR_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Comp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__COMP = OR_EXPR_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Full Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION_FEATURE_COUNT = OR_EXPR_FEATURE_COUNT + 11;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ExprGroupImpl <em>Expr Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ExprGroupImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getExprGroup()
   * @generated
   */
  int EXPR_GROUP = 19;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_GROUP__EXPR = 0;

  /**
   * The number of structural features of the '<em>Expr Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_GROUP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.XExprImpl <em>XExpr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.XExprImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getXExpr()
   * @generated
   */
  int XEXPR = 20;

  /**
   * The feature id for the '<em><b>Xf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPR__XF = 0;

  /**
   * The feature id for the '<em><b>Col</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPR__COL = 1;

  /**
   * The feature id for the '<em><b>Prm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPR__PRM = 2;

  /**
   * The number of structural features of the '<em>XExpr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.PrmsImpl <em>Prms</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.PrmsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPrms()
   * @generated
   */
  int PRMS = 21;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRMS__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Prms</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRMS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.JRParameterImpl <em>JR Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.JRParameterImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getJRParameter()
   * @generated
   */
  int JR_PARAMETER = 22;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JR_PARAMETER__ENTRIES = PRMS__ENTRIES;

  /**
   * The feature id for the '<em><b>Jrprm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JR_PARAMETER__JRPRM = PRMS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>JR Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JR_PARAMETER_FEATURE_COUNT = PRMS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ComparisonImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 23;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Sub Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__SUB_OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__OP2 = 2;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.LikeImpl <em>Like</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.LikeImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getLike()
   * @generated
   */
  int LIKE = 24;

  /**
   * The feature id for the '<em><b>Op Like</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE__OP_LIKE = 0;

  /**
   * The feature id for the '<em><b>Op2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE__OP2 = 1;

  /**
   * The number of structural features of the '<em>Like</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.BetweenImpl <em>Between</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.BetweenImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getBetween()
   * @generated
   */
  int BETWEEN = 25;

  /**
   * The feature id for the '<em><b>Op Between</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BETWEEN__OP_BETWEEN = 0;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BETWEEN__OP2 = 1;

  /**
   * The feature id for the '<em><b>Op3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BETWEEN__OP3 = 2;

  /**
   * The number of structural features of the '<em>Between</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BETWEEN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.InOperImpl <em>In Oper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.InOperImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getInOper()
   * @generated
   */
  int IN_OPER = 26;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OPER__OP = 0;

  /**
   * The feature id for the '<em><b>Subquery</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OPER__SUBQUERY = 1;

  /**
   * The feature id for the '<em><b>Op List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OPER__OP_LIST = 2;

  /**
   * The number of structural features of the '<em>In Oper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OPER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OperandListImpl <em>Operand List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OperandListImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperandList()
   * @generated
   */
  int OPERAND_LIST = 27;

  /**
   * The number of structural features of the '<em>Operand List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OperandsImpl <em>Operands</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OperandsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperands()
   * @generated
   */
  int OPERANDS = 28;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERANDS__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Operands</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERANDS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OperandImpl <em>Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OperandImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperand()
   * @generated
   */
  int OPERAND = 29;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__ENTRIES = OPERAND_LIST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__COLUMN = OPERAND_LIST_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Xop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__XOP = OPERAND_LIST_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Subq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__SUBQ = OPERAND_LIST_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__FUNC = OPERAND_LIST_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__PARAM = OPERAND_LIST_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Eparam</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__EPARAM = OPERAND_LIST_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Scalar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__SCALAR = OPERAND_LIST_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_FEATURE_COUNT = OPERAND_LIST_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OpGroupImpl <em>Op Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OpGroupImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpGroup()
   * @generated
   */
  int OP_GROUP = 30;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_GROUP__OP = 0;

  /**
   * The number of structural features of the '<em>Op Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_GROUP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OperandFunctionImpl <em>Operand Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OperandFunctionImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperandFunction()
   * @generated
   */
  int OPERAND_FUNCTION = 31;

  /**
   * The number of structural features of the '<em>Operand Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_FUNCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OperandFunctionArgsImpl <em>Operand Function Args</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OperandFunctionArgsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperandFunctionArgs()
   * @generated
   */
  int OPERAND_FUNCTION_ARGS = 32;

  /**
   * The number of structural features of the '<em>Operand Function Args</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_FUNCTION_ARGS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.POperandImpl <em>POperand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.POperandImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPOperand()
   * @generated
   */
  int POPERAND = 33;

  /**
   * The feature id for the '<em><b>Prm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPERAND__PRM = 0;

  /**
   * The number of structural features of the '<em>POperand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPERAND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ExpOperandImpl <em>Exp Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ExpOperandImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getExpOperand()
   * @generated
   */
  int EXP_OPERAND = 34;

  /**
   * The feature id for the '<em><b>Prm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_OPERAND__PRM = 0;

  /**
   * The number of structural features of the '<em>Exp Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_OPERAND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ColumnOperandImpl <em>Column Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ColumnOperandImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getColumnOperand()
   * @generated
   */
  int COLUMN_OPERAND = 35;

  /**
   * The feature id for the '<em><b>Cfull</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OPERAND__CFULL = 0;

  /**
   * The number of structural features of the '<em>Column Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OPERAND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.SubQueryOperandImpl <em>Sub Query Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.SubQueryOperandImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSubQueryOperand()
   * @generated
   */
  int SUB_QUERY_OPERAND = 36;

  /**
   * The feature id for the '<em><b>Sel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUERY_OPERAND__SEL = 0;

  /**
   * The number of structural features of the '<em>Sub Query Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUERY_OPERAND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ScalarOperandImpl <em>Scalar Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ScalarOperandImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getScalarOperand()
   * @generated
   */
  int SCALAR_OPERAND = 37;

  /**
   * The feature id for the '<em><b>Soint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__SOINT = 0;

  /**
   * The feature id for the '<em><b>Sostr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__SOSTR = 1;

  /**
   * The feature id for the '<em><b>Sodbl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__SODBL = 2;

  /**
   * The feature id for the '<em><b>Sodate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__SODATE = 3;

  /**
   * The feature id for the '<em><b>Sotime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__SOTIME = 4;

  /**
   * The feature id for the '<em><b>Sodt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__SODT = 5;

  /**
   * The number of structural features of the '<em>Scalar Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ColImpl <em>Col</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ColImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getCol()
   * @generated
   */
  int COL = 38;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COL__ENTRIES = COLUMN_FULL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Col</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COL_FEATURE_COUNT = COLUMN_FULL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.tblsImpl <em>tbls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.tblsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#gettbls()
   * @generated
   */
  int TBLS = 39;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TBLS__ENTRIES = TABLE_FULL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>tbls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TBLS_FEATURE_COUNT = TABLE_FULL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OpListImpl <em>Op List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OpListImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpList()
   * @generated
   */
  int OP_LIST = 40;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_LIST__ENTRIES = OPERAND_LIST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Op List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_LIST_FEATURE_COUNT = OPERAND_LIST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OperandFunctionArgumentsImpl <em>Operand Function Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OperandFunctionArgumentsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperandFunctionArguments()
   * @generated
   */
  int OPERAND_FUNCTION_ARGUMENTS = 41;

  /**
   * The feature id for the '<em><b>Fname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_FUNCTION_ARGUMENTS__FNAME = OPERAND_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_FUNCTION_ARGUMENTS__ARG = OPERAND_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Operand Function Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_FUNCTION_ARGUMENTS_FEATURE_COUNT = OPERAND_FUNCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ArgListImpl <em>Arg List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ArgListImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getArgList()
   * @generated
   */
  int ARG_LIST = 42;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_LIST__ENTRIES = OPERAND_FUNCTION_ARGS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Arg List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_LIST_FEATURE_COUNT = OPERAND_FUNCTION_ARGS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.XFunction <em>XFunction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.XFunction
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getXFunction()
   * @generated
   */
  int XFUNCTION = 43;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.JoinType <em>Join Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.JoinType
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getJoinType()
   * @generated
   */
  int JOIN_TYPE = 44;


  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.jaspersoft.studio.data.sql.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Model#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.jaspersoft.studio.data.sql.Model#getQuery()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Query();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Model#getOrderByEntry <em>Order By Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Order By Entry</em>'.
   * @see com.jaspersoft.studio.data.sql.Model#getOrderByEntry()
   * @see #getModel()
   * @generated
   */
  EReference getModel_OrderByEntry();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.SelectQuery <em>Select Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Query</em>'.
   * @see com.jaspersoft.studio.data.sql.SelectQuery
   * @generated
   */
  EClass getSelectQuery();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.SelectSubSet <em>Select Sub Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Sub Set</em>'.
   * @see com.jaspersoft.studio.data.sql.SelectSubSet
   * @generated
   */
  EClass getSelectSubSet();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.SelectSubSet#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.jaspersoft.studio.data.sql.SelectSubSet#getOp()
   * @see #getSelectSubSet()
   * @generated
   */
  EAttribute getSelectSubSet_Op();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.SelectSubSet#getAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see com.jaspersoft.studio.data.sql.SelectSubSet#getAll()
   * @see #getSelectSubSet()
   * @generated
   */
  EAttribute getSelectSubSet_All();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.SelectSubSet#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.jaspersoft.studio.data.sql.SelectSubSet#getQuery()
   * @see #getSelectSubSet()
   * @generated
   */
  EReference getSelectSubSet_Query();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select</em>'.
   * @see com.jaspersoft.studio.data.sql.Select
   * @generated
   */
  EClass getSelect();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.Select#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op</em>'.
   * @see com.jaspersoft.studio.data.sql.Select#getOp()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Op();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.Select#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Select</em>'.
   * @see com.jaspersoft.studio.data.sql.Select#getSelect()
   * @see #getSelect()
   * @generated
   */
  EAttribute getSelect_Select();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Select#getCols <em>Cols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cols</em>'.
   * @see com.jaspersoft.studio.data.sql.Select#getCols()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Cols();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Select#getTbl <em>Tbl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tbl</em>'.
   * @see com.jaspersoft.studio.data.sql.Select#getTbl()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Tbl();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Select#getWhereExpression <em>Where Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where Expression</em>'.
   * @see com.jaspersoft.studio.data.sql.Select#getWhereExpression()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_WhereExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Select#getGroupByEntry <em>Group By Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Group By Entry</em>'.
   * @see com.jaspersoft.studio.data.sql.Select#getGroupByEntry()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_GroupByEntry();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Select#getHavingEntry <em>Having Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Having Entry</em>'.
   * @see com.jaspersoft.studio.data.sql.Select#getHavingEntry()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_HavingEntry();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OrColumn <em>Or Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Column</em>'.
   * @see com.jaspersoft.studio.data.sql.OrColumn
   * @generated
   */
  EClass getOrColumn();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.OrColumn#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.OrColumn#getEntries()
   * @see #getOrColumn()
   * @generated
   */
  EReference getOrColumn_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.ColumnOrAlias <em>Column Or Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Or Alias</em>'.
   * @see com.jaspersoft.studio.data.sql.ColumnOrAlias
   * @generated
   */
  EClass getColumnOrAlias();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.ColumnOrAlias#getCe <em>Ce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ce</em>'.
   * @see com.jaspersoft.studio.data.sql.ColumnOrAlias#getCe()
   * @see #getColumnOrAlias()
   * @generated
   */
  EReference getColumnOrAlias_Ce();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.ColumnOrAlias#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see com.jaspersoft.studio.data.sql.ColumnOrAlias#getAlias()
   * @see #getColumnOrAlias()
   * @generated
   */
  EAttribute getColumnOrAlias_Alias();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.ColumnOrAlias#getColAlias <em>Col Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Col Alias</em>'.
   * @see com.jaspersoft.studio.data.sql.ColumnOrAlias#getColAlias()
   * @see #getColumnOrAlias()
   * @generated
   */
  EReference getColumnOrAlias_ColAlias();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.ColumnOrAlias#getAllCols <em>All Cols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Cols</em>'.
   * @see com.jaspersoft.studio.data.sql.ColumnOrAlias#getAllCols()
   * @see #getColumnOrAlias()
   * @generated
   */
  EAttribute getColumnOrAlias_AllCols();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.ColumnFull <em>Column Full</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Full</em>'.
   * @see com.jaspersoft.studio.data.sql.ColumnFull
   * @generated
   */
  EClass getColumnFull();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OrTable <em>Or Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Table</em>'.
   * @see com.jaspersoft.studio.data.sql.OrTable
   * @generated
   */
  EClass getOrTable();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.OrTable#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.OrTable#getEntries()
   * @see #getOrTable()
   * @generated
   */
  EReference getOrTable_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.FromTable <em>From Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Table</em>'.
   * @see com.jaspersoft.studio.data.sql.FromTable
   * @generated
   */
  EClass getFromTable();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FromTable#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table</em>'.
   * @see com.jaspersoft.studio.data.sql.FromTable#getTable()
   * @see #getFromTable()
   * @generated
   */
  EReference getFromTable_Table();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.FromTable#getFjoin <em>Fjoin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fjoin</em>'.
   * @see com.jaspersoft.studio.data.sql.FromTable#getFjoin()
   * @see #getFromTable()
   * @generated
   */
  EReference getFromTable_Fjoin();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.FromTableJoin <em>From Table Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Table Join</em>'.
   * @see com.jaspersoft.studio.data.sql.FromTableJoin
   * @generated
   */
  EClass getFromTableJoin();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.FromTableJoin#getJoin <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Join</em>'.
   * @see com.jaspersoft.studio.data.sql.FromTableJoin#getJoin()
   * @see #getFromTableJoin()
   * @generated
   */
  EAttribute getFromTableJoin_Join();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FromTableJoin#getOnTable <em>On Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>On Table</em>'.
   * @see com.jaspersoft.studio.data.sql.FromTableJoin#getOnTable()
   * @see #getFromTableJoin()
   * @generated
   */
  EReference getFromTableJoin_OnTable();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FromTableJoin#getJoinExpr <em>Join Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Join Expr</em>'.
   * @see com.jaspersoft.studio.data.sql.FromTableJoin#getJoinExpr()
   * @see #getFromTableJoin()
   * @generated
   */
  EReference getFromTableJoin_JoinExpr();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.TableOrAlias <em>Table Or Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Or Alias</em>'.
   * @see com.jaspersoft.studio.data.sql.TableOrAlias
   * @generated
   */
  EClass getTableOrAlias();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.TableOrAlias#getTfull <em>Tfull</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tfull</em>'.
   * @see com.jaspersoft.studio.data.sql.TableOrAlias#getTfull()
   * @see #getTableOrAlias()
   * @generated
   */
  EReference getTableOrAlias_Tfull();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.TableOrAlias#getSq <em>Sq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sq</em>'.
   * @see com.jaspersoft.studio.data.sql.TableOrAlias#getSq()
   * @see #getTableOrAlias()
   * @generated
   */
  EReference getTableOrAlias_Sq();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.TableOrAlias#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see com.jaspersoft.studio.data.sql.TableOrAlias#getAlias()
   * @see #getTableOrAlias()
   * @generated
   */
  EAttribute getTableOrAlias_Alias();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.TableOrAlias#getTblAlias <em>Tbl Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tbl Alias</em>'.
   * @see com.jaspersoft.studio.data.sql.TableOrAlias#getTblAlias()
   * @see #getTableOrAlias()
   * @generated
   */
  EReference getTableOrAlias_TblAlias();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.TableFull <em>Table Full</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Full</em>'.
   * @see com.jaspersoft.studio.data.sql.TableFull
   * @generated
   */
  EClass getTableFull();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.DbObjectName <em>Db Object Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Db Object Name</em>'.
   * @see com.jaspersoft.studio.data.sql.DbObjectName
   * @generated
   */
  EClass getDbObjectName();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.DbObjectName#getDbname <em>Dbname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dbname</em>'.
   * @see com.jaspersoft.studio.data.sql.DbObjectName#getDbname()
   * @see #getDbObjectName()
   * @generated
   */
  EAttribute getDbObjectName_Dbname();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OrOrderByColumn <em>Or Order By Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Order By Column</em>'.
   * @see com.jaspersoft.studio.data.sql.OrOrderByColumn
   * @generated
   */
  EClass getOrOrderByColumn();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.OrOrderByColumn#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.OrOrderByColumn#getEntries()
   * @see #getOrOrderByColumn()
   * @generated
   */
  EReference getOrOrderByColumn_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OrderByColumnFull <em>Order By Column Full</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Order By Column Full</em>'.
   * @see com.jaspersoft.studio.data.sql.OrderByColumnFull
   * @generated
   */
  EClass getOrderByColumnFull();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.OrderByColumnFull#getColOrder <em>Col Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Col Order</em>'.
   * @see com.jaspersoft.studio.data.sql.OrderByColumnFull#getColOrder()
   * @see #getOrderByColumnFull()
   * @generated
   */
  EReference getOrderByColumnFull_ColOrder();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.OrderByColumnFull#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see com.jaspersoft.studio.data.sql.OrderByColumnFull#getDirection()
   * @see #getOrderByColumnFull()
   * @generated
   */
  EAttribute getOrderByColumnFull_Direction();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OrGroupByColumn <em>Or Group By Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Group By Column</em>'.
   * @see com.jaspersoft.studio.data.sql.OrGroupByColumn
   * @generated
   */
  EClass getOrGroupByColumn();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.OrGroupByColumn#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.OrGroupByColumn#getEntries()
   * @see #getOrGroupByColumn()
   * @generated
   */
  EReference getOrGroupByColumn_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.GroupByColumnFull <em>Group By Column Full</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group By Column Full</em>'.
   * @see com.jaspersoft.studio.data.sql.GroupByColumnFull
   * @generated
   */
  EClass getGroupByColumnFull();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.GroupByColumnFull#getColGrBy <em>Col Gr By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Col Gr By</em>'.
   * @see com.jaspersoft.studio.data.sql.GroupByColumnFull#getColGrBy()
   * @see #getGroupByColumnFull()
   * @generated
   */
  EReference getGroupByColumnFull_ColGrBy();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OrExpr <em>Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expr</em>'.
   * @see com.jaspersoft.studio.data.sql.OrExpr
   * @generated
   */
  EClass getOrExpr();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.OrExpr#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.OrExpr#getEntries()
   * @see #getOrExpr()
   * @generated
   */
  EReference getOrExpr_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.FullExpression <em>Full Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Full Expression</em>'.
   * @see com.jaspersoft.studio.data.sql.FullExpression
   * @generated
   */
  EClass getFullExpression();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.FullExpression#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>C</em>'.
   * @see com.jaspersoft.studio.data.sql.FullExpression#getC()
   * @see #getFullExpression()
   * @generated
   */
  EAttribute getFullExpression_C();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FullExpression#getEfrag <em>Efrag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Efrag</em>'.
   * @see com.jaspersoft.studio.data.sql.FullExpression#getEfrag()
   * @see #getFullExpression()
   * @generated
   */
  EReference getFullExpression_Efrag();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FullExpression#getExpgroup <em>Expgroup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expgroup</em>'.
   * @see com.jaspersoft.studio.data.sql.FullExpression#getExpgroup()
   * @see #getFullExpression()
   * @generated
   */
  EReference getFullExpression_Expgroup();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FullExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see com.jaspersoft.studio.data.sql.FullExpression#getExp()
   * @see #getFullExpression()
   * @generated
   */
  EReference getFullExpression_Exp();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FullExpression#getXexp <em>Xexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xexp</em>'.
   * @see com.jaspersoft.studio.data.sql.FullExpression#getXexp()
   * @see #getFullExpression()
   * @generated
   */
  EReference getFullExpression_Xexp();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FullExpression#getOp1 <em>Op1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op1</em>'.
   * @see com.jaspersoft.studio.data.sql.FullExpression#getOp1()
   * @see #getFullExpression()
   * @generated
   */
  EReference getFullExpression_Op1();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.FullExpression#getIsnull <em>Isnull</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isnull</em>'.
   * @see com.jaspersoft.studio.data.sql.FullExpression#getIsnull()
   * @see #getFullExpression()
   * @generated
   */
  EAttribute getFullExpression_Isnull();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FullExpression#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In</em>'.
   * @see com.jaspersoft.studio.data.sql.FullExpression#getIn()
   * @see #getFullExpression()
   * @generated
   */
  EReference getFullExpression_In();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FullExpression#getBetween <em>Between</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Between</em>'.
   * @see com.jaspersoft.studio.data.sql.FullExpression#getBetween()
   * @see #getFullExpression()
   * @generated
   */
  EReference getFullExpression_Between();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FullExpression#getLike <em>Like</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Like</em>'.
   * @see com.jaspersoft.studio.data.sql.FullExpression#getLike()
   * @see #getFullExpression()
   * @generated
   */
  EReference getFullExpression_Like();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FullExpression#getComp <em>Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comp</em>'.
   * @see com.jaspersoft.studio.data.sql.FullExpression#getComp()
   * @see #getFullExpression()
   * @generated
   */
  EReference getFullExpression_Comp();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.ExprGroup <em>Expr Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Group</em>'.
   * @see com.jaspersoft.studio.data.sql.ExprGroup
   * @generated
   */
  EClass getExprGroup();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.ExprGroup#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.jaspersoft.studio.data.sql.ExprGroup#getExpr()
   * @see #getExprGroup()
   * @generated
   */
  EReference getExprGroup_Expr();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.XExpr <em>XExpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpr</em>'.
   * @see com.jaspersoft.studio.data.sql.XExpr
   * @generated
   */
  EClass getXExpr();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.XExpr#getXf <em>Xf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Xf</em>'.
   * @see com.jaspersoft.studio.data.sql.XExpr#getXf()
   * @see #getXExpr()
   * @generated
   */
  EAttribute getXExpr_Xf();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.XExpr#getCol <em>Col</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Col</em>'.
   * @see com.jaspersoft.studio.data.sql.XExpr#getCol()
   * @see #getXExpr()
   * @generated
   */
  EReference getXExpr_Col();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.XExpr#getPrm <em>Prm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prm</em>'.
   * @see com.jaspersoft.studio.data.sql.XExpr#getPrm()
   * @see #getXExpr()
   * @generated
   */
  EReference getXExpr_Prm();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Prms <em>Prms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prms</em>'.
   * @see com.jaspersoft.studio.data.sql.Prms
   * @generated
   */
  EClass getPrms();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.Prms#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.Prms#getEntries()
   * @see #getPrms()
   * @generated
   */
  EReference getPrms_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.JRParameter <em>JR Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JR Parameter</em>'.
   * @see com.jaspersoft.studio.data.sql.JRParameter
   * @generated
   */
  EClass getJRParameter();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.JRParameter#getJrprm <em>Jrprm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Jrprm</em>'.
   * @see com.jaspersoft.studio.data.sql.JRParameter#getJrprm()
   * @see #getJRParameter()
   * @generated
   */
  EAttribute getJRParameter_Jrprm();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see com.jaspersoft.studio.data.sql.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.Comparison#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see com.jaspersoft.studio.data.sql.Comparison#getOperator()
   * @see #getComparison()
   * @generated
   */
  EAttribute getComparison_Operator();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.Comparison#getSubOperator <em>Sub Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sub Operator</em>'.
   * @see com.jaspersoft.studio.data.sql.Comparison#getSubOperator()
   * @see #getComparison()
   * @generated
   */
  EAttribute getComparison_SubOperator();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Comparison#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op2</em>'.
   * @see com.jaspersoft.studio.data.sql.Comparison#getOp2()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Op2();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Like <em>Like</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Like</em>'.
   * @see com.jaspersoft.studio.data.sql.Like
   * @generated
   */
  EClass getLike();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.Like#getOpLike <em>Op Like</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op Like</em>'.
   * @see com.jaspersoft.studio.data.sql.Like#getOpLike()
   * @see #getLike()
   * @generated
   */
  EAttribute getLike_OpLike();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.Like#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op2</em>'.
   * @see com.jaspersoft.studio.data.sql.Like#getOp2()
   * @see #getLike()
   * @generated
   */
  EAttribute getLike_Op2();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Between <em>Between</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Between</em>'.
   * @see com.jaspersoft.studio.data.sql.Between
   * @generated
   */
  EClass getBetween();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.Between#getOpBetween <em>Op Between</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op Between</em>'.
   * @see com.jaspersoft.studio.data.sql.Between#getOpBetween()
   * @see #getBetween()
   * @generated
   */
  EAttribute getBetween_OpBetween();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Between#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op2</em>'.
   * @see com.jaspersoft.studio.data.sql.Between#getOp2()
   * @see #getBetween()
   * @generated
   */
  EReference getBetween_Op2();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Between#getOp3 <em>Op3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op3</em>'.
   * @see com.jaspersoft.studio.data.sql.Between#getOp3()
   * @see #getBetween()
   * @generated
   */
  EReference getBetween_Op3();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.InOper <em>In Oper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Oper</em>'.
   * @see com.jaspersoft.studio.data.sql.InOper
   * @generated
   */
  EClass getInOper();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.InOper#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.jaspersoft.studio.data.sql.InOper#getOp()
   * @see #getInOper()
   * @generated
   */
  EAttribute getInOper_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.InOper#getSubquery <em>Subquery</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subquery</em>'.
   * @see com.jaspersoft.studio.data.sql.InOper#getSubquery()
   * @see #getInOper()
   * @generated
   */
  EReference getInOper_Subquery();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.InOper#getOpList <em>Op List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op List</em>'.
   * @see com.jaspersoft.studio.data.sql.InOper#getOpList()
   * @see #getInOper()
   * @generated
   */
  EReference getInOper_OpList();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OperandList <em>Operand List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operand List</em>'.
   * @see com.jaspersoft.studio.data.sql.OperandList
   * @generated
   */
  EClass getOperandList();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Operands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operands</em>'.
   * @see com.jaspersoft.studio.data.sql.Operands
   * @generated
   */
  EClass getOperands();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.Operands#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.Operands#getEntries()
   * @see #getOperands()
   * @generated
   */
  EReference getOperands_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Operand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operand</em>'.
   * @see com.jaspersoft.studio.data.sql.Operand
   * @generated
   */
  EClass getOperand();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Operand#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column</em>'.
   * @see com.jaspersoft.studio.data.sql.Operand#getColumn()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Column();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Operand#getXop <em>Xop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xop</em>'.
   * @see com.jaspersoft.studio.data.sql.Operand#getXop()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Xop();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Operand#getSubq <em>Subq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subq</em>'.
   * @see com.jaspersoft.studio.data.sql.Operand#getSubq()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Subq();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Operand#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Func</em>'.
   * @see com.jaspersoft.studio.data.sql.Operand#getFunc()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Func();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Operand#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param</em>'.
   * @see com.jaspersoft.studio.data.sql.Operand#getParam()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Param();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Operand#getEparam <em>Eparam</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Eparam</em>'.
   * @see com.jaspersoft.studio.data.sql.Operand#getEparam()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Eparam();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Operand#getScalar <em>Scalar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scalar</em>'.
   * @see com.jaspersoft.studio.data.sql.Operand#getScalar()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Scalar();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OpGroup <em>Op Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Group</em>'.
   * @see com.jaspersoft.studio.data.sql.OpGroup
   * @generated
   */
  EClass getOpGroup();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.OpGroup#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see com.jaspersoft.studio.data.sql.OpGroup#getOp()
   * @see #getOpGroup()
   * @generated
   */
  EReference getOpGroup_Op();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OperandFunction <em>Operand Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operand Function</em>'.
   * @see com.jaspersoft.studio.data.sql.OperandFunction
   * @generated
   */
  EClass getOperandFunction();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OperandFunctionArgs <em>Operand Function Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operand Function Args</em>'.
   * @see com.jaspersoft.studio.data.sql.OperandFunctionArgs
   * @generated
   */
  EClass getOperandFunctionArgs();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.POperand <em>POperand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>POperand</em>'.
   * @see com.jaspersoft.studio.data.sql.POperand
   * @generated
   */
  EClass getPOperand();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.POperand#getPrm <em>Prm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prm</em>'.
   * @see com.jaspersoft.studio.data.sql.POperand#getPrm()
   * @see #getPOperand()
   * @generated
   */
  EAttribute getPOperand_Prm();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.ExpOperand <em>Exp Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp Operand</em>'.
   * @see com.jaspersoft.studio.data.sql.ExpOperand
   * @generated
   */
  EClass getExpOperand();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.ExpOperand#getPrm <em>Prm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prm</em>'.
   * @see com.jaspersoft.studio.data.sql.ExpOperand#getPrm()
   * @see #getExpOperand()
   * @generated
   */
  EAttribute getExpOperand_Prm();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.ColumnOperand <em>Column Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Operand</em>'.
   * @see com.jaspersoft.studio.data.sql.ColumnOperand
   * @generated
   */
  EClass getColumnOperand();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.ColumnOperand#getCfull <em>Cfull</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cfull</em>'.
   * @see com.jaspersoft.studio.data.sql.ColumnOperand#getCfull()
   * @see #getColumnOperand()
   * @generated
   */
  EReference getColumnOperand_Cfull();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.SubQueryOperand <em>Sub Query Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Query Operand</em>'.
   * @see com.jaspersoft.studio.data.sql.SubQueryOperand
   * @generated
   */
  EClass getSubQueryOperand();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.SubQueryOperand#getSel <em>Sel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sel</em>'.
   * @see com.jaspersoft.studio.data.sql.SubQueryOperand#getSel()
   * @see #getSubQueryOperand()
   * @generated
   */
  EReference getSubQueryOperand_Sel();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.ScalarOperand <em>Scalar Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scalar Operand</em>'.
   * @see com.jaspersoft.studio.data.sql.ScalarOperand
   * @generated
   */
  EClass getScalarOperand();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.ScalarOperand#getSoint <em>Soint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Soint</em>'.
   * @see com.jaspersoft.studio.data.sql.ScalarOperand#getSoint()
   * @see #getScalarOperand()
   * @generated
   */
  EAttribute getScalarOperand_Soint();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.ScalarOperand#getSostr <em>Sostr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sostr</em>'.
   * @see com.jaspersoft.studio.data.sql.ScalarOperand#getSostr()
   * @see #getScalarOperand()
   * @generated
   */
  EAttribute getScalarOperand_Sostr();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.ScalarOperand#getSodbl <em>Sodbl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sodbl</em>'.
   * @see com.jaspersoft.studio.data.sql.ScalarOperand#getSodbl()
   * @see #getScalarOperand()
   * @generated
   */
  EAttribute getScalarOperand_Sodbl();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.ScalarOperand#getSodate <em>Sodate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sodate</em>'.
   * @see com.jaspersoft.studio.data.sql.ScalarOperand#getSodate()
   * @see #getScalarOperand()
   * @generated
   */
  EAttribute getScalarOperand_Sodate();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.ScalarOperand#getSotime <em>Sotime</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sotime</em>'.
   * @see com.jaspersoft.studio.data.sql.ScalarOperand#getSotime()
   * @see #getScalarOperand()
   * @generated
   */
  EAttribute getScalarOperand_Sotime();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.ScalarOperand#getSodt <em>Sodt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sodt</em>'.
   * @see com.jaspersoft.studio.data.sql.ScalarOperand#getSodt()
   * @see #getScalarOperand()
   * @generated
   */
  EAttribute getScalarOperand_Sodt();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Col <em>Col</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Col</em>'.
   * @see com.jaspersoft.studio.data.sql.Col
   * @generated
   */
  EClass getCol();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.Col#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.Col#getEntries()
   * @see #getCol()
   * @generated
   */
  EReference getCol_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.tbls <em>tbls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tbls</em>'.
   * @see com.jaspersoft.studio.data.sql.tbls
   * @generated
   */
  EClass gettbls();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.tbls#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.tbls#getEntries()
   * @see #gettbls()
   * @generated
   */
  EReference gettbls_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OpList <em>Op List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op List</em>'.
   * @see com.jaspersoft.studio.data.sql.OpList
   * @generated
   */
  EClass getOpList();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.OpList#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.OpList#getEntries()
   * @see #getOpList()
   * @generated
   */
  EReference getOpList_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OperandFunctionArguments <em>Operand Function Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operand Function Arguments</em>'.
   * @see com.jaspersoft.studio.data.sql.OperandFunctionArguments
   * @generated
   */
  EClass getOperandFunctionArguments();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.OperandFunctionArguments#getFname <em>Fname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fname</em>'.
   * @see com.jaspersoft.studio.data.sql.OperandFunctionArguments#getFname()
   * @see #getOperandFunctionArguments()
   * @generated
   */
  EAttribute getOperandFunctionArguments_Fname();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.OperandFunctionArguments#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see com.jaspersoft.studio.data.sql.OperandFunctionArguments#getArg()
   * @see #getOperandFunctionArguments()
   * @generated
   */
  EReference getOperandFunctionArguments_Arg();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.ArgList <em>Arg List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arg List</em>'.
   * @see com.jaspersoft.studio.data.sql.ArgList
   * @generated
   */
  EClass getArgList();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.ArgList#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.ArgList#getEntries()
   * @see #getArgList()
   * @generated
   */
  EReference getArgList_Entries();

  /**
   * Returns the meta object for enum '{@link com.jaspersoft.studio.data.sql.XFunction <em>XFunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>XFunction</em>'.
   * @see com.jaspersoft.studio.data.sql.XFunction
   * @generated
   */
  EEnum getXFunction();

  /**
   * Returns the meta object for enum '{@link com.jaspersoft.studio.data.sql.JoinType <em>Join Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Join Type</em>'.
   * @see com.jaspersoft.studio.data.sql.JoinType
   * @generated
   */
  EEnum getJoinType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SqlFactory getSqlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.ModelImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__QUERY = eINSTANCE.getModel_Query();

    /**
     * The meta object literal for the '<em><b>Order By Entry</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ORDER_BY_ENTRY = eINSTANCE.getModel_OrderByEntry();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.SelectQueryImpl <em>Select Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.SelectQueryImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSelectQuery()
     * @generated
     */
    EClass SELECT_QUERY = eINSTANCE.getSelectQuery();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.SelectSubSetImpl <em>Select Sub Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.SelectSubSetImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSelectSubSet()
     * @generated
     */
    EClass SELECT_SUB_SET = eINSTANCE.getSelectSubSet();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_SUB_SET__OP = eINSTANCE.getSelectSubSet_Op();

    /**
     * The meta object literal for the '<em><b>All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_SUB_SET__ALL = eINSTANCE.getSelectSubSet_All();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_SUB_SET__QUERY = eINSTANCE.getSelectSubSet_Query();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.SelectImpl <em>Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.SelectImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSelect()
     * @generated
     */
    EClass SELECT = eINSTANCE.getSelect();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__OP = eINSTANCE.getSelect_Op();

    /**
     * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT__SELECT = eINSTANCE.getSelect_Select();

    /**
     * The meta object literal for the '<em><b>Cols</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__COLS = eINSTANCE.getSelect_Cols();

    /**
     * The meta object literal for the '<em><b>Tbl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__TBL = eINSTANCE.getSelect_Tbl();

    /**
     * The meta object literal for the '<em><b>Where Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__WHERE_EXPRESSION = eINSTANCE.getSelect_WhereExpression();

    /**
     * The meta object literal for the '<em><b>Group By Entry</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__GROUP_BY_ENTRY = eINSTANCE.getSelect_GroupByEntry();

    /**
     * The meta object literal for the '<em><b>Having Entry</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__HAVING_ENTRY = eINSTANCE.getSelect_HavingEntry();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OrColumnImpl <em>Or Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OrColumnImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrColumn()
     * @generated
     */
    EClass OR_COLUMN = eINSTANCE.getOrColumn();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_COLUMN__ENTRIES = eINSTANCE.getOrColumn_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.ColumnOrAliasImpl <em>Column Or Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.ColumnOrAliasImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getColumnOrAlias()
     * @generated
     */
    EClass COLUMN_OR_ALIAS = eINSTANCE.getColumnOrAlias();

    /**
     * The meta object literal for the '<em><b>Ce</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_OR_ALIAS__CE = eINSTANCE.getColumnOrAlias_Ce();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_OR_ALIAS__ALIAS = eINSTANCE.getColumnOrAlias_Alias();

    /**
     * The meta object literal for the '<em><b>Col Alias</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_OR_ALIAS__COL_ALIAS = eINSTANCE.getColumnOrAlias_ColAlias();

    /**
     * The meta object literal for the '<em><b>All Cols</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_OR_ALIAS__ALL_COLS = eINSTANCE.getColumnOrAlias_AllCols();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.ColumnFullImpl <em>Column Full</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.ColumnFullImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getColumnFull()
     * @generated
     */
    EClass COLUMN_FULL = eINSTANCE.getColumnFull();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OrTableImpl <em>Or Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OrTableImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrTable()
     * @generated
     */
    EClass OR_TABLE = eINSTANCE.getOrTable();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_TABLE__ENTRIES = eINSTANCE.getOrTable_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.FromTableImpl <em>From Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.FromTableImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFromTable()
     * @generated
     */
    EClass FROM_TABLE = eINSTANCE.getFromTable();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_TABLE__TABLE = eINSTANCE.getFromTable_Table();

    /**
     * The meta object literal for the '<em><b>Fjoin</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_TABLE__FJOIN = eINSTANCE.getFromTable_Fjoin();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.FromTableJoinImpl <em>From Table Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.FromTableJoinImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFromTableJoin()
     * @generated
     */
    EClass FROM_TABLE_JOIN = eINSTANCE.getFromTableJoin();

    /**
     * The meta object literal for the '<em><b>Join</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FROM_TABLE_JOIN__JOIN = eINSTANCE.getFromTableJoin_Join();

    /**
     * The meta object literal for the '<em><b>On Table</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_TABLE_JOIN__ON_TABLE = eINSTANCE.getFromTableJoin_OnTable();

    /**
     * The meta object literal for the '<em><b>Join Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_TABLE_JOIN__JOIN_EXPR = eINSTANCE.getFromTableJoin_JoinExpr();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.TableOrAliasImpl <em>Table Or Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.TableOrAliasImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getTableOrAlias()
     * @generated
     */
    EClass TABLE_OR_ALIAS = eINSTANCE.getTableOrAlias();

    /**
     * The meta object literal for the '<em><b>Tfull</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_OR_ALIAS__TFULL = eINSTANCE.getTableOrAlias_Tfull();

    /**
     * The meta object literal for the '<em><b>Sq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_OR_ALIAS__SQ = eINSTANCE.getTableOrAlias_Sq();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_OR_ALIAS__ALIAS = eINSTANCE.getTableOrAlias_Alias();

    /**
     * The meta object literal for the '<em><b>Tbl Alias</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_OR_ALIAS__TBL_ALIAS = eINSTANCE.getTableOrAlias_TblAlias();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.TableFullImpl <em>Table Full</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.TableFullImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getTableFull()
     * @generated
     */
    EClass TABLE_FULL = eINSTANCE.getTableFull();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.DbObjectNameImpl <em>Db Object Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.DbObjectNameImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getDbObjectName()
     * @generated
     */
    EClass DB_OBJECT_NAME = eINSTANCE.getDbObjectName();

    /**
     * The meta object literal for the '<em><b>Dbname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DB_OBJECT_NAME__DBNAME = eINSTANCE.getDbObjectName_Dbname();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OrOrderByColumnImpl <em>Or Order By Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OrOrderByColumnImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrOrderByColumn()
     * @generated
     */
    EClass OR_ORDER_BY_COLUMN = eINSTANCE.getOrOrderByColumn();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_ORDER_BY_COLUMN__ENTRIES = eINSTANCE.getOrOrderByColumn_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OrderByColumnFullImpl <em>Order By Column Full</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OrderByColumnFullImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrderByColumnFull()
     * @generated
     */
    EClass ORDER_BY_COLUMN_FULL = eINSTANCE.getOrderByColumnFull();

    /**
     * The meta object literal for the '<em><b>Col Order</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDER_BY_COLUMN_FULL__COL_ORDER = eINSTANCE.getOrderByColumnFull_ColOrder();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORDER_BY_COLUMN_FULL__DIRECTION = eINSTANCE.getOrderByColumnFull_Direction();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OrGroupByColumnImpl <em>Or Group By Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OrGroupByColumnImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrGroupByColumn()
     * @generated
     */
    EClass OR_GROUP_BY_COLUMN = eINSTANCE.getOrGroupByColumn();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_GROUP_BY_COLUMN__ENTRIES = eINSTANCE.getOrGroupByColumn_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.GroupByColumnFullImpl <em>Group By Column Full</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.GroupByColumnFullImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getGroupByColumnFull()
     * @generated
     */
    EClass GROUP_BY_COLUMN_FULL = eINSTANCE.getGroupByColumnFull();

    /**
     * The meta object literal for the '<em><b>Col Gr By</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BY_COLUMN_FULL__COL_GR_BY = eINSTANCE.getGroupByColumnFull_ColGrBy();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OrExprImpl <em>Or Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OrExprImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrExpr()
     * @generated
     */
    EClass OR_EXPR = eINSTANCE.getOrExpr();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__ENTRIES = eINSTANCE.getOrExpr_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.FullExpressionImpl <em>Full Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.FullExpressionImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFullExpression()
     * @generated
     */
    EClass FULL_EXPRESSION = eINSTANCE.getFullExpression();

    /**
     * The meta object literal for the '<em><b>C</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FULL_EXPRESSION__C = eINSTANCE.getFullExpression_C();

    /**
     * The meta object literal for the '<em><b>Efrag</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_EXPRESSION__EFRAG = eINSTANCE.getFullExpression_Efrag();

    /**
     * The meta object literal for the '<em><b>Expgroup</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_EXPRESSION__EXPGROUP = eINSTANCE.getFullExpression_Expgroup();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_EXPRESSION__EXP = eINSTANCE.getFullExpression_Exp();

    /**
     * The meta object literal for the '<em><b>Xexp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_EXPRESSION__XEXP = eINSTANCE.getFullExpression_Xexp();

    /**
     * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_EXPRESSION__OP1 = eINSTANCE.getFullExpression_Op1();

    /**
     * The meta object literal for the '<em><b>Isnull</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FULL_EXPRESSION__ISNULL = eINSTANCE.getFullExpression_Isnull();

    /**
     * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_EXPRESSION__IN = eINSTANCE.getFullExpression_In();

    /**
     * The meta object literal for the '<em><b>Between</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_EXPRESSION__BETWEEN = eINSTANCE.getFullExpression_Between();

    /**
     * The meta object literal for the '<em><b>Like</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_EXPRESSION__LIKE = eINSTANCE.getFullExpression_Like();

    /**
     * The meta object literal for the '<em><b>Comp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_EXPRESSION__COMP = eINSTANCE.getFullExpression_Comp();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.ExprGroupImpl <em>Expr Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.ExprGroupImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getExprGroup()
     * @generated
     */
    EClass EXPR_GROUP = eINSTANCE.getExprGroup();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_GROUP__EXPR = eINSTANCE.getExprGroup_Expr();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.XExprImpl <em>XExpr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.XExprImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getXExpr()
     * @generated
     */
    EClass XEXPR = eINSTANCE.getXExpr();

    /**
     * The meta object literal for the '<em><b>Xf</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XEXPR__XF = eINSTANCE.getXExpr_Xf();

    /**
     * The meta object literal for the '<em><b>Col</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPR__COL = eINSTANCE.getXExpr_Col();

    /**
     * The meta object literal for the '<em><b>Prm</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPR__PRM = eINSTANCE.getXExpr_Prm();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.PrmsImpl <em>Prms</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.PrmsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPrms()
     * @generated
     */
    EClass PRMS = eINSTANCE.getPrms();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRMS__ENTRIES = eINSTANCE.getPrms_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.JRParameterImpl <em>JR Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.JRParameterImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getJRParameter()
     * @generated
     */
    EClass JR_PARAMETER = eINSTANCE.getJRParameter();

    /**
     * The meta object literal for the '<em><b>Jrprm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JR_PARAMETER__JRPRM = eINSTANCE.getJRParameter_Jrprm();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.ComparisonImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON__OPERATOR = eINSTANCE.getComparison_Operator();

    /**
     * The meta object literal for the '<em><b>Sub Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON__SUB_OPERATOR = eINSTANCE.getComparison_SubOperator();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__OP2 = eINSTANCE.getComparison_Op2();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.LikeImpl <em>Like</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.LikeImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getLike()
     * @generated
     */
    EClass LIKE = eINSTANCE.getLike();

    /**
     * The meta object literal for the '<em><b>Op Like</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIKE__OP_LIKE = eINSTANCE.getLike_OpLike();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIKE__OP2 = eINSTANCE.getLike_Op2();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.BetweenImpl <em>Between</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.BetweenImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getBetween()
     * @generated
     */
    EClass BETWEEN = eINSTANCE.getBetween();

    /**
     * The meta object literal for the '<em><b>Op Between</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BETWEEN__OP_BETWEEN = eINSTANCE.getBetween_OpBetween();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BETWEEN__OP2 = eINSTANCE.getBetween_Op2();

    /**
     * The meta object literal for the '<em><b>Op3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BETWEEN__OP3 = eINSTANCE.getBetween_Op3();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.InOperImpl <em>In Oper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.InOperImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getInOper()
     * @generated
     */
    EClass IN_OPER = eINSTANCE.getInOper();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_OPER__OP = eINSTANCE.getInOper_Op();

    /**
     * The meta object literal for the '<em><b>Subquery</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_OPER__SUBQUERY = eINSTANCE.getInOper_Subquery();

    /**
     * The meta object literal for the '<em><b>Op List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_OPER__OP_LIST = eINSTANCE.getInOper_OpList();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OperandListImpl <em>Operand List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OperandListImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperandList()
     * @generated
     */
    EClass OPERAND_LIST = eINSTANCE.getOperandList();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OperandsImpl <em>Operands</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OperandsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperands()
     * @generated
     */
    EClass OPERANDS = eINSTANCE.getOperands();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERANDS__ENTRIES = eINSTANCE.getOperands_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OperandImpl <em>Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OperandImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperand()
     * @generated
     */
    EClass OPERAND = eINSTANCE.getOperand();

    /**
     * The meta object literal for the '<em><b>Column</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__COLUMN = eINSTANCE.getOperand_Column();

    /**
     * The meta object literal for the '<em><b>Xop</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__XOP = eINSTANCE.getOperand_Xop();

    /**
     * The meta object literal for the '<em><b>Subq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__SUBQ = eINSTANCE.getOperand_Subq();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__FUNC = eINSTANCE.getOperand_Func();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__PARAM = eINSTANCE.getOperand_Param();

    /**
     * The meta object literal for the '<em><b>Eparam</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__EPARAM = eINSTANCE.getOperand_Eparam();

    /**
     * The meta object literal for the '<em><b>Scalar</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__SCALAR = eINSTANCE.getOperand_Scalar();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OpGroupImpl <em>Op Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OpGroupImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpGroup()
     * @generated
     */
    EClass OP_GROUP = eINSTANCE.getOpGroup();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_GROUP__OP = eINSTANCE.getOpGroup_Op();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OperandFunctionImpl <em>Operand Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OperandFunctionImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperandFunction()
     * @generated
     */
    EClass OPERAND_FUNCTION = eINSTANCE.getOperandFunction();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OperandFunctionArgsImpl <em>Operand Function Args</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OperandFunctionArgsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperandFunctionArgs()
     * @generated
     */
    EClass OPERAND_FUNCTION_ARGS = eINSTANCE.getOperandFunctionArgs();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.POperandImpl <em>POperand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.POperandImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPOperand()
     * @generated
     */
    EClass POPERAND = eINSTANCE.getPOperand();

    /**
     * The meta object literal for the '<em><b>Prm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POPERAND__PRM = eINSTANCE.getPOperand_Prm();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.ExpOperandImpl <em>Exp Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.ExpOperandImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getExpOperand()
     * @generated
     */
    EClass EXP_OPERAND = eINSTANCE.getExpOperand();

    /**
     * The meta object literal for the '<em><b>Prm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP_OPERAND__PRM = eINSTANCE.getExpOperand_Prm();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.ColumnOperandImpl <em>Column Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.ColumnOperandImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getColumnOperand()
     * @generated
     */
    EClass COLUMN_OPERAND = eINSTANCE.getColumnOperand();

    /**
     * The meta object literal for the '<em><b>Cfull</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_OPERAND__CFULL = eINSTANCE.getColumnOperand_Cfull();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.SubQueryOperandImpl <em>Sub Query Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.SubQueryOperandImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSubQueryOperand()
     * @generated
     */
    EClass SUB_QUERY_OPERAND = eINSTANCE.getSubQueryOperand();

    /**
     * The meta object literal for the '<em><b>Sel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_QUERY_OPERAND__SEL = eINSTANCE.getSubQueryOperand_Sel();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.ScalarOperandImpl <em>Scalar Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.ScalarOperandImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getScalarOperand()
     * @generated
     */
    EClass SCALAR_OPERAND = eINSTANCE.getScalarOperand();

    /**
     * The meta object literal for the '<em><b>Soint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCALAR_OPERAND__SOINT = eINSTANCE.getScalarOperand_Soint();

    /**
     * The meta object literal for the '<em><b>Sostr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCALAR_OPERAND__SOSTR = eINSTANCE.getScalarOperand_Sostr();

    /**
     * The meta object literal for the '<em><b>Sodbl</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCALAR_OPERAND__SODBL = eINSTANCE.getScalarOperand_Sodbl();

    /**
     * The meta object literal for the '<em><b>Sodate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCALAR_OPERAND__SODATE = eINSTANCE.getScalarOperand_Sodate();

    /**
     * The meta object literal for the '<em><b>Sotime</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCALAR_OPERAND__SOTIME = eINSTANCE.getScalarOperand_Sotime();

    /**
     * The meta object literal for the '<em><b>Sodt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCALAR_OPERAND__SODT = eINSTANCE.getScalarOperand_Sodt();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.ColImpl <em>Col</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.ColImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getCol()
     * @generated
     */
    EClass COL = eINSTANCE.getCol();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COL__ENTRIES = eINSTANCE.getCol_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.tblsImpl <em>tbls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.tblsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#gettbls()
     * @generated
     */
    EClass TBLS = eINSTANCE.gettbls();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TBLS__ENTRIES = eINSTANCE.gettbls_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OpListImpl <em>Op List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OpListImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpList()
     * @generated
     */
    EClass OP_LIST = eINSTANCE.getOpList();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_LIST__ENTRIES = eINSTANCE.getOpList_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OperandFunctionArgumentsImpl <em>Operand Function Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OperandFunctionArgumentsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperandFunctionArguments()
     * @generated
     */
    EClass OPERAND_FUNCTION_ARGUMENTS = eINSTANCE.getOperandFunctionArguments();

    /**
     * The meta object literal for the '<em><b>Fname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERAND_FUNCTION_ARGUMENTS__FNAME = eINSTANCE.getOperandFunctionArguments_Fname();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND_FUNCTION_ARGUMENTS__ARG = eINSTANCE.getOperandFunctionArguments_Arg();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.ArgListImpl <em>Arg List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.ArgListImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getArgList()
     * @generated
     */
    EClass ARG_LIST = eINSTANCE.getArgList();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG_LIST__ENTRIES = eINSTANCE.getArgList_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.XFunction <em>XFunction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.XFunction
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getXFunction()
     * @generated
     */
    EEnum XFUNCTION = eINSTANCE.getXFunction();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.JoinType <em>Join Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.JoinType
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getJoinType()
     * @generated
     */
    EEnum JOIN_TYPE = eINSTANCE.getJoinType();

  }

} //SqlPackage
