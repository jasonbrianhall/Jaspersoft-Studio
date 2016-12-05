/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
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
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.FetchFirstImpl <em>Fetch First</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.FetchFirstImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFetchFirst()
   * @generated
   */
  int FETCH_FIRST = 1;

  /**
   * The feature id for the '<em><b>Fetch First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCH_FIRST__FETCH_FIRST = 0;

  /**
   * The feature id for the '<em><b>Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCH_FIRST__ROW = 1;

  /**
   * The number of structural features of the '<em>Fetch First</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCH_FIRST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OffsetImpl <em>Offset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OffsetImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOffset()
   * @generated
   */
  int OFFSET = 2;

  /**
   * The feature id for the '<em><b>Offset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFSET__OFFSET = 0;

  /**
   * The number of structural features of the '<em>Offset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFSET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.LimitImpl <em>Limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.LimitImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getLimit()
   * @generated
   */
  int LIMIT = 3;

  /**
   * The feature id for the '<em><b>L1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT__L1 = 0;

  /**
   * The feature id for the '<em><b>L2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT__L2 = 1;

  /**
   * The number of structural features of the '<em>Limit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.SelectQueryImpl <em>Select Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.SelectQueryImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSelectQuery()
   * @generated
   */
  int SELECT_QUERY = 4;

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
  int SELECT_SUB_SET = 5;

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
  int SELECT = 6;

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
   * The feature id for the '<em><b>Order By Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__ORDER_BY_ENTRY = SELECT_QUERY_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Lim</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__LIM = SELECT_QUERY_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Offset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__OFFSET = SELECT_QUERY_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Fetch First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__FETCH_FIRST = SELECT_QUERY_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FEATURE_COUNT = SELECT_QUERY_FEATURE_COUNT + 11;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.PivotForClauseImpl <em>Pivot For Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.PivotForClauseImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivotForClause()
   * @generated
   */
  int PIVOT_FOR_CLAUSE = 33;

  /**
   * The number of structural features of the '<em>Pivot For Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOT_FOR_CLAUSE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OrColumnImpl <em>Or Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OrColumnImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrColumn()
   * @generated
   */
  int OR_COLUMN = 7;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_COLUMN__ENTRIES = PIVOT_FOR_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Or Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_COLUMN_FEATURE_COUNT = PIVOT_FOR_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ColumnOrAliasImpl <em>Column Or Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ColumnOrAliasImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getColumnOrAlias()
   * @generated
   */
  int COLUMN_OR_ALIAS = 8;

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
   * The feature id for the '<em><b>Db All Cols</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OR_ALIAS__DB_ALL_COLS = OR_COLUMN_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Column Or Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OR_ALIAS_FEATURE_COUNT = OR_COLUMN_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ColumnFullImpl <em>Column Full</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ColumnFullImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getColumnFull()
   * @generated
   */
  int COLUMN_FULL = 9;

  /**
   * The number of structural features of the '<em>Column Full</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FULL_FEATURE_COUNT = PIVOT_FOR_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OrTableImpl <em>Or Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OrTableImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrTable()
   * @generated
   */
  int OR_TABLE = 10;

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
  int FROM_TABLE = 11;

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
  int FROM_TABLE_JOIN = 12;

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
   * The feature id for the '<em><b>Join Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_TABLE_JOIN__JOIN_COND = 3;

  /**
   * The number of structural features of the '<em>From Table Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_TABLE_JOIN_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.JoinConditionImpl <em>Join Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.JoinConditionImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getJoinCondition()
   * @generated
   */
  int JOIN_CONDITION = 13;

  /**
   * The feature id for the '<em><b>Use Cols</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_CONDITION__USE_COLS = 0;

  /**
   * The number of structural features of the '<em>Join Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.UsingColsImpl <em>Using Cols</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.UsingColsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getUsingCols()
   * @generated
   */
  int USING_COLS = 14;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_COLS__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Using Cols</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_COLS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.TableOrAliasImpl <em>Table Or Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.TableOrAliasImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getTableOrAlias()
   * @generated
   */
  int TABLE_OR_ALIAS = 15;

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
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_OR_ALIAS__VALUES = 2;

  /**
   * The feature id for the '<em><b>Pivot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_OR_ALIAS__PIVOT = 3;

  /**
   * The feature id for the '<em><b>Unpivot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_OR_ALIAS__UNPIVOT = 4;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_OR_ALIAS__ALIAS = 5;

  /**
   * The feature id for the '<em><b>Tbl Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_OR_ALIAS__TBL_ALIAS = 6;

  /**
   * The number of structural features of the '<em>Table Or Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_OR_ALIAS_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.FromValuesImpl <em>From Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.FromValuesImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFromValues()
   * @generated
   */
  int FROM_VALUES = 16;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_VALUES__VALUES = 0;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_VALUES__C = 1;

  /**
   * The number of structural features of the '<em>From Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_VALUES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.FromValuesColumnsImpl <em>From Values Columns</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.FromValuesColumnsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFromValuesColumns()
   * @generated
   */
  int FROM_VALUES_COLUMNS = 17;

  /**
   * The feature id for the '<em><b>Fv Cols</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_VALUES_COLUMNS__FV_COLS = 0;

  /**
   * The number of structural features of the '<em>From Values Columns</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_VALUES_COLUMNS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.FromValuesColumnNamesImpl <em>From Values Column Names</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.FromValuesColumnNamesImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFromValuesColumnNames()
   * @generated
   */
  int FROM_VALUES_COLUMN_NAMES = 18;

  /**
   * The number of structural features of the '<em>From Values Column Names</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_VALUES_COLUMN_NAMES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ColumnNamesImpl <em>Column Names</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ColumnNamesImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getColumnNames()
   * @generated
   */
  int COLUMN_NAMES = 19;

  /**
   * The feature id for the '<em><b>Col Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_NAMES__COL_NAME = FROM_VALUES_COLUMN_NAMES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Column Names</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_NAMES_FEATURE_COUNT = FROM_VALUES_COLUMN_NAMES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ValuesImpl <em>Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ValuesImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getValues()
   * @generated
   */
  int VALUES = 20;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES__ROWS = 0;

  /**
   * The number of structural features of the '<em>Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.RowsImpl <em>Rows</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.RowsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getRows()
   * @generated
   */
  int ROWS = 21;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROWS__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Rows</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROWS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.RowImpl <em>Row</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.RowImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getRow()
   * @generated
   */
  int ROW = 22;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__ENTRIES = ROWS__ENTRIES;

  /**
   * The feature id for the '<em><b>Row Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__ROW_VALUES = ROWS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Row</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_FEATURE_COUNT = ROWS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.RowValuesImpl <em>Row Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.RowValuesImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getRowValues()
   * @generated
   */
  int ROW_VALUES = 23;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_VALUES__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Row Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_VALUES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.RowValueImpl <em>Row Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.RowValueImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getRowValue()
   * @generated
   */
  int ROW_VALUE = 24;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_VALUE__ENTRIES = ROW_VALUES__ENTRIES;

  /**
   * The feature id for the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_VALUE__NULL = ROW_VALUES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Row Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_VALUE_FEATURE_COUNT = ROW_VALUES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.PivotTableImpl <em>Pivot Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.PivotTableImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivotTable()
   * @generated
   */
  int PIVOT_TABLE = 25;

  /**
   * The feature id for the '<em><b>Pfun</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOT_TABLE__PFUN = 0;

  /**
   * The feature id for the '<em><b>Pfor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOT_TABLE__PFOR = 1;

  /**
   * The feature id for the '<em><b>Pin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOT_TABLE__PIN = 2;

  /**
   * The number of structural features of the '<em>Pivot Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOT_TABLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.PivotFunctionsImpl <em>Pivot Functions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.PivotFunctionsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivotFunctions()
   * @generated
   */
  int PIVOT_FUNCTIONS = 26;

  /**
   * The feature id for the '<em><b>Abc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOT_FUNCTIONS__ABC = 0;

  /**
   * The number of structural features of the '<em>Pivot Functions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOT_FUNCTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.PivotFunctionImpl <em>Pivot Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.PivotFunctionImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivotFunction()
   * @generated
   */
  int PIVOT_FUNCTION = 27;

  /**
   * The number of structural features of the '<em>Pivot Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOT_FUNCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.PivotInClauseImpl <em>Pivot In Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.PivotInClauseImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivotInClause()
   * @generated
   */
  int PIVOT_IN_CLAUSE = 28;

  /**
   * The feature id for the '<em><b>Sq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOT_IN_CLAUSE__SQ = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOT_IN_CLAUSE__ARGS = 1;

  /**
   * The feature id for the '<em><b>Pinany</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOT_IN_CLAUSE__PINANY = 2;

  /**
   * The number of structural features of the '<em>Pivot In Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOT_IN_CLAUSE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.UnpivotTableImpl <em>Unpivot Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.UnpivotTableImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getUnpivotTable()
   * @generated
   */
  int UNPIVOT_TABLE = 29;

  /**
   * The feature id for the '<em><b>Pcols</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPIVOT_TABLE__PCOLS = 0;

  /**
   * The feature id for the '<em><b>Pfor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPIVOT_TABLE__PFOR = 1;

  /**
   * The feature id for the '<em><b>Inop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPIVOT_TABLE__INOP = 2;

  /**
   * The number of structural features of the '<em>Unpivot Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPIVOT_TABLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.UnpivotInClauseImpl <em>Unpivot In Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.UnpivotInClauseImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getUnpivotInClause()
   * @generated
   */
  int UNPIVOT_IN_CLAUSE = 30;

  /**
   * The number of structural features of the '<em>Unpivot In Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPIVOT_IN_CLAUSE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.UnpivotInClauseArgsImpl <em>Unpivot In Clause Args</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.UnpivotInClauseArgsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getUnpivotInClauseArgs()
   * @generated
   */
  int UNPIVOT_IN_CLAUSE_ARGS = 31;

  /**
   * The number of structural features of the '<em>Unpivot In Clause Args</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPIVOT_IN_CLAUSE_ARGS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.UnpivotInClauseArgImpl <em>Unpivot In Clause Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.UnpivotInClauseArgImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getUnpivotInClauseArg()
   * @generated
   */
  int UNPIVOT_IN_CLAUSE_ARG = 32;

  /**
   * The feature id for the '<em><b>Pcols</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPIVOT_IN_CLAUSE_ARG__PCOLS = UNPIVOT_IN_CLAUSE_ARGS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cfuls</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPIVOT_IN_CLAUSE_ARG__CFULS = UNPIVOT_IN_CLAUSE_ARGS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unpivot In Clause Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPIVOT_IN_CLAUSE_ARG_FEATURE_COUNT = UNPIVOT_IN_CLAUSE_ARGS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.PivotColumnsImpl <em>Pivot Columns</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.PivotColumnsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivotColumns()
   * @generated
   */
  int PIVOT_COLUMNS = 34;

  /**
   * The number of structural features of the '<em>Pivot Columns</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOT_COLUMNS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.PivotsImpl <em>Pivots</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.PivotsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivots()
   * @generated
   */
  int PIVOTS = 35;

  /**
   * The number of structural features of the '<em>Pivots</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOTS_FEATURE_COUNT = PIVOT_COLUMNS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.PivotColImpl <em>Pivot Col</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.PivotColImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivotCol()
   * @generated
   */
  int PIVOT_COL = 36;

  /**
   * The number of structural features of the '<em>Pivot Col</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIVOT_COL_FEATURE_COUNT = PIVOT_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.TableFullImpl <em>Table Full</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.TableFullImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getTableFull()
   * @generated
   */
  int TABLE_FULL = 37;

  /**
   * The number of structural features of the '<em>Table Full</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FULL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.DbObjectNameAllImpl <em>Db Object Name All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.DbObjectNameAllImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getDbObjectNameAll()
   * @generated
   */
  int DB_OBJECT_NAME_ALL = 38;

  /**
   * The feature id for the '<em><b>Dbname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_OBJECT_NAME_ALL__DBNAME = 0;

  /**
   * The number of structural features of the '<em>Db Object Name All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_OBJECT_NAME_ALL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.DbObjectNameImpl <em>Db Object Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.DbObjectNameImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getDbObjectName()
   * @generated
   */
  int DB_OBJECT_NAME = 39;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_OBJECT_NAME__ENTRIES = COLUMN_FULL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dbname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_OBJECT_NAME__DBNAME = COLUMN_FULL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Db Object Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_OBJECT_NAME_FEATURE_COUNT = COLUMN_FULL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OrOrderByColumnImpl <em>Or Order By Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OrOrderByColumnImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrOrderByColumn()
   * @generated
   */
  int OR_ORDER_BY_COLUMN = 40;

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
  int ORDER_BY_COLUMN_FULL = 41;

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
   * The feature id for the '<em><b>Col Order Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_COLUMN_FULL__COL_ORDER_INT = OR_ORDER_BY_COLUMN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_COLUMN_FULL__DIRECTION = OR_ORDER_BY_COLUMN_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Order By Column Full</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_COLUMN_FULL_FEATURE_COUNT = OR_ORDER_BY_COLUMN_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OrGroupByColumnImpl <em>Or Group By Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OrGroupByColumnImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrGroupByColumn()
   * @generated
   */
  int OR_GROUP_BY_COLUMN = 42;

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
  int GROUP_BY_COLUMN_FULL = 43;

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
   * The feature id for the '<em><b>Gb Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_COLUMN_FULL__GB_FUNCTION = OR_GROUP_BY_COLUMN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Gr By Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_COLUMN_FULL__GR_BY_INT = OR_GROUP_BY_COLUMN_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Group By Column Full</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_COLUMN_FULL_FEATURE_COUNT = OR_GROUP_BY_COLUMN_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OrExprImpl <em>Or Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OrExprImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrExpr()
   * @generated
   */
  int OR_EXPR = 44;

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
  int FULL_EXPRESSION = 45;

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
   * The feature id for the '<em><b>Not Prm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__NOT_PRM = OR_EXPR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expgroup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__EXPGROUP = OR_EXPR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__EXP = OR_EXPR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Xexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__XEXP = OR_EXPR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__IN = OR_EXPR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Exists</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__EXISTS = OR_EXPR_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__OP1 = OR_EXPR_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Isnull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__ISNULL = OR_EXPR_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Between</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__BETWEEN = OR_EXPR_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Like</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__LIKE = OR_EXPR_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Comp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION__COMP = OR_EXPR_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Full Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_EXPRESSION_FEATURE_COUNT = OR_EXPR_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ExprGroupImpl <em>Expr Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ExprGroupImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getExprGroup()
   * @generated
   */
  int EXPR_GROUP = 46;

  /**
   * The feature id for the '<em><b>Isnot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_GROUP__ISNOT = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_GROUP__EXPR = 1;

  /**
   * The number of structural features of the '<em>Expr Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_GROUP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.XExprImpl <em>XExpr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.XExprImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getXExpr()
   * @generated
   */
  int XEXPR = 47;

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
  int PRMS = 48;

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
  int JR_PARAMETER = 49;

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
  int COMPARISON = 50;

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
  int LIKE = 51;

  /**
   * The feature id for the '<em><b>Op Like</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE__OP_LIKE = 0;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
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
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.LikeOperandImpl <em>Like Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.LikeOperandImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getLikeOperand()
   * @generated
   */
  int LIKE_OPERAND = 52;

  /**
   * The feature id for the '<em><b>Op2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_OPERAND__OP2 = 0;

  /**
   * The feature id for the '<em><b>Fop2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_OPERAND__FOP2 = 1;

  /**
   * The feature id for the '<em><b>Fcast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_OPERAND__FCAST = 2;

  /**
   * The feature id for the '<em><b>Fparam</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_OPERAND__FPARAM = 3;

  /**
   * The number of structural features of the '<em>Like Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_OPERAND_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.BetweenImpl <em>Between</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.BetweenImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getBetween()
   * @generated
   */
  int BETWEEN = 53;

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
  int IN_OPER = 54;

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
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ExistsOperImpl <em>Exists Oper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ExistsOperImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getExistsOper()
   * @generated
   */
  int EXISTS_OPER = 55;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_OPER__OP = 0;

  /**
   * The feature id for the '<em><b>Subquery</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_OPER__SUBQUERY = 1;

  /**
   * The feature id for the '<em><b>Op List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_OPER__OP_LIST = 2;

  /**
   * The number of structural features of the '<em>Exists Oper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_OPER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OperandListGroupImpl <em>Operand List Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OperandListGroupImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperandListGroup()
   * @generated
   */
  int OPERAND_LIST_GROUP = 56;

  /**
   * The feature id for the '<em><b>Op Group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_LIST_GROUP__OP_GROUP = 0;

  /**
   * The number of structural features of the '<em>Operand List Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_LIST_GROUP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OperandListImpl <em>Operand List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OperandListImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperandList()
   * @generated
   */
  int OPERAND_LIST = 57;

  /**
   * The number of structural features of the '<em>Operand List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OpFunctionArgAgregateImpl <em>Op Function Arg Agregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OpFunctionArgAgregateImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpFunctionArgAgregate()
   * @generated
   */
  int OP_FUNCTION_ARG_AGREGATE = 77;

  /**
   * The number of structural features of the '<em>Op Function Arg Agregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FUNCTION_ARG_AGREGATE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OperandsImpl <em>Operands</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OperandsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperands()
   * @generated
   */
  int OPERANDS = 58;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERANDS__OP1 = OP_FUNCTION_ARG_AGREGATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERANDS__LEFT = OP_FUNCTION_ARG_AGREGATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERANDS__RIGHT = OP_FUNCTION_ARG_AGREGATE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operands</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERANDS_FEATURE_COUNT = OP_FUNCTION_ARG_AGREGATE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OperandImpl <em>Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OperandImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperand()
   * @generated
   */
  int OPERAND = 59;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__COLUMN = 0;

  /**
   * The feature id for the '<em><b>Xop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__XOP = 1;

  /**
   * The feature id for the '<em><b>Subq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__SUBQ = 2;

  /**
   * The feature id for the '<em><b>Fcast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__FCAST = 3;

  /**
   * The feature id for the '<em><b>Fext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__FEXT = 4;

  /**
   * The feature id for the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__FUNC = 5;

  /**
   * The feature id for the '<em><b>Sqlcase</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__SQLCASE = 6;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__PARAM = 7;

  /**
   * The feature id for the '<em><b>Eparam</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__EPARAM = 8;

  /**
   * The feature id for the '<em><b>Scalar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__SCALAR = 9;

  /**
   * The number of structural features of the '<em>Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OpFunctionImpl <em>Op Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OpFunctionImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpFunction()
   * @generated
   */
  int OP_FUNCTION = 60;

  /**
   * The feature id for the '<em><b>Fname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FUNCTION__FNAME = 0;

  /**
   * The feature id for the '<em><b>Star</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FUNCTION__STAR = 1;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FUNCTION__ARGS = 2;

  /**
   * The feature id for the '<em><b>Fan</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FUNCTION__FAN = 3;

  /**
   * The number of structural features of the '<em>Op Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FUNCTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.FunctionExtractImpl <em>Function Extract</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.FunctionExtractImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFunctionExtract()
   * @generated
   */
  int FUNCTION_EXTRACT = 61;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXTRACT__V = 0;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXTRACT__OPERAND = 1;

  /**
   * The number of structural features of the '<em>Function Extract</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXTRACT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.FunctionAnalyticalImpl <em>Function Analytical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.FunctionAnalyticalImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFunctionAnalytical()
   * @generated
   */
  int FUNCTION_ANALYTICAL = 62;

  /**
   * The feature id for the '<em><b>An Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ANALYTICAL__AN_CLAUSE = 0;

  /**
   * The number of structural features of the '<em>Function Analytical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ANALYTICAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.AnalyticClauseImpl <em>Analytic Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.AnalyticClauseImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getAnalyticClause()
   * @generated
   */
  int ANALYTIC_CLAUSE = 63;

  /**
   * The feature id for the '<em><b>Abc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYTIC_CLAUSE__ABC = 0;

  /**
   * The feature id for the '<em><b>Obc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYTIC_CLAUSE__OBC = 1;

  /**
   * The feature id for the '<em><b>Winc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYTIC_CLAUSE__WINC = 2;

  /**
   * The number of structural features of the '<em>Analytic Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYTIC_CLAUSE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.WindowingClauseImpl <em>Windowing Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.WindowingClauseImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getWindowingClause()
   * @generated
   */
  int WINDOWING_CLAUSE = 64;

  /**
   * The number of structural features of the '<em>Windowing Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOWING_CLAUSE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.WindowingClauseBetweenImpl <em>Windowing Clause Between</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.WindowingClauseBetweenImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getWindowingClauseBetween()
   * @generated
   */
  int WINDOWING_CLAUSE_BETWEEN = 65;

  /**
   * The feature id for the '<em><b>Wco P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOWING_CLAUSE_BETWEEN__WCO_P = WINDOWING_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Wco F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOWING_CLAUSE_BETWEEN__WCO_F = WINDOWING_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Windowing Clause Between</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOWING_CLAUSE_BETWEEN_FEATURE_COUNT = WINDOWING_CLAUSE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.WindowingClauseOperandFollowingImpl <em>Windowing Clause Operand Following</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.WindowingClauseOperandFollowingImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getWindowingClauseOperandFollowing()
   * @generated
   */
  int WINDOWING_CLAUSE_OPERAND_FOLLOWING = 66;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOWING_CLAUSE_OPERAND_FOLLOWING__EXP = 0;

  /**
   * The number of structural features of the '<em>Windowing Clause Operand Following</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOWING_CLAUSE_OPERAND_FOLLOWING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.WindowingClauseOperandPrecedingImpl <em>Windowing Clause Operand Preceding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.WindowingClauseOperandPrecedingImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getWindowingClauseOperandPreceding()
   * @generated
   */
  int WINDOWING_CLAUSE_OPERAND_PRECEDING = 67;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOWING_CLAUSE_OPERAND_PRECEDING__EXPR = WINDOWING_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Windowing Clause Operand Preceding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOWING_CLAUSE_OPERAND_PRECEDING_FEATURE_COUNT = WINDOWING_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OrderByClauseImpl <em>Order By Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OrderByClauseImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrderByClause()
   * @generated
   */
  int ORDER_BY_CLAUSE = 68;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_CLAUSE__ARGS = 0;

  /**
   * The number of structural features of the '<em>Order By Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OrderByClauseArgsImpl <em>Order By Clause Args</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OrderByClauseArgsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrderByClauseArgs()
   * @generated
   */
  int ORDER_BY_CLAUSE_ARGS = 69;

  /**
   * The number of structural features of the '<em>Order By Clause Args</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_CLAUSE_ARGS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OrderByClauseArgImpl <em>Order By Clause Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OrderByClauseArgImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrderByClauseArg()
   * @generated
   */
  int ORDER_BY_CLAUSE_ARG = 70;

  /**
   * The feature id for the '<em><b>Col</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_CLAUSE_ARG__COL = ORDER_BY_CLAUSE_ARGS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Order By Clause Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_CLAUSE_ARG_FEATURE_COUNT = ORDER_BY_CLAUSE_ARGS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.QueryPartitionClauseImpl <em>Query Partition Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.QueryPartitionClauseImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getQueryPartitionClause()
   * @generated
   */
  int QUERY_PARTITION_CLAUSE = 71;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_PARTITION_CLAUSE__ARGS = 0;

  /**
   * The number of structural features of the '<em>Query Partition Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_PARTITION_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.AnalyticExprArgsImpl <em>Analytic Expr Args</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.AnalyticExprArgsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getAnalyticExprArgs()
   * @generated
   */
  int ANALYTIC_EXPR_ARGS = 72;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYTIC_EXPR_ARGS__ARGS = QUERY_PARTITION_CLAUSE__ARGS;

  /**
   * The number of structural features of the '<em>Analytic Expr Args</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYTIC_EXPR_ARGS_FEATURE_COUNT = QUERY_PARTITION_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.AnalyticExprArgImpl <em>Analytic Expr Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.AnalyticExprArgImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getAnalyticExprArg()
   * @generated
   */
  int ANALYTIC_EXPR_ARG = 73;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYTIC_EXPR_ARG__ARGS = ANALYTIC_EXPR_ARGS__ARGS;

  /**
   * The feature id for the '<em><b>Ce</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYTIC_EXPR_ARG__CE = ANALYTIC_EXPR_ARGS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Col Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYTIC_EXPR_ARG__COL_ALIAS = ANALYTIC_EXPR_ARGS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Analytic Expr Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYTIC_EXPR_ARG_FEATURE_COUNT = ANALYTIC_EXPR_ARGS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OpFunctionArgImpl <em>Op Function Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OpFunctionArgImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpFunctionArg()
   * @generated
   */
  int OP_FUNCTION_ARG = 74;

  /**
   * The number of structural features of the '<em>Op Function Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FUNCTION_ARG_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OpFunctionArgOperandImpl <em>Op Function Arg Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OpFunctionArgOperandImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpFunctionArgOperand()
   * @generated
   */
  int OP_FUNCTION_ARG_OPERAND = 75;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FUNCTION_ARG_OPERAND__OP = OP_FUNCTION_ARG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Op Function Arg Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FUNCTION_ARG_OPERAND_FEATURE_COUNT = OP_FUNCTION_ARG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OpFunctionCastImpl <em>Op Function Cast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OpFunctionCastImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpFunctionCast()
   * @generated
   */
  int OP_FUNCTION_CAST = 76;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FUNCTION_CAST__OP = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FUNCTION_CAST__TYPE = 1;

  /**
   * The feature id for the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FUNCTION_CAST__P = 2;

  /**
   * The feature id for the '<em><b>P2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FUNCTION_CAST__P2 = 3;

  /**
   * The number of structural features of the '<em>Op Function Cast</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FUNCTION_CAST_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.POperandImpl <em>POperand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.POperandImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPOperand()
   * @generated
   */
  int POPERAND = 78;

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
  int EXP_OPERAND = 79;

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
  int COLUMN_OPERAND = 80;

  /**
   * The feature id for the '<em><b>Cfull</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OPERAND__CFULL = 0;

  /**
   * The feature id for the '<em><b>Ora</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OPERAND__ORA = 1;

  /**
   * The number of structural features of the '<em>Column Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OPERAND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.SubQueryOperandImpl <em>Sub Query Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.SubQueryOperandImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSubQueryOperand()
   * @generated
   */
  int SUB_QUERY_OPERAND = 81;

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
  int SCALAR_OPERAND = 82;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__ENTRIES = ROW_VALUE__ENTRIES;

  /**
   * The feature id for the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__NULL = ROW_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Sostr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__SOSTR = ROW_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sodbl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__SODBL = ROW_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sodate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__SODATE = ROW_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Sotime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__SOTIME = ROW_VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sodt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__SODT = ROW_VALUE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>So UInt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__SO_UINT = ROW_VALUE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Soint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND__SOINT = ROW_VALUE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Scalar Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_OPERAND_FEATURE_COUNT = ROW_VALUE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.SQLCaseOperandImpl <em>SQL Case Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.SQLCaseOperandImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSQLCaseOperand()
   * @generated
   */
  int SQL_CASE_OPERAND = 83;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_CASE_OPERAND__EXPR = 0;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_CASE_OPERAND__WHEN = 1;

  /**
   * The number of structural features of the '<em>SQL Case Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_CASE_OPERAND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.SQLCaseWhensImpl <em>SQL Case Whens</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.SQLCaseWhensImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSQLCaseWhens()
   * @generated
   */
  int SQL_CASE_WHENS = 84;

  /**
   * The number of structural features of the '<em>SQL Case Whens</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_CASE_WHENS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.SqlCaseWhenImpl <em>Case When</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.SqlCaseWhenImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSqlCaseWhen()
   * @generated
   */
  int SQL_CASE_WHEN = 85;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_CASE_WHEN__EXPR = SQL_CASE_WHENS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Texp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_CASE_WHEN__TEXP = SQL_CASE_WHENS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Eexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_CASE_WHEN__EEXP = SQL_CASE_WHENS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Case When</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_CASE_WHEN_FEATURE_COUNT = SQL_CASE_WHENS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.IntegerValueImpl <em>Integer Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.IntegerValueImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getIntegerValue()
   * @generated
   */
  int INTEGER_VALUE = 86;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE__INTEGER = 0;

  /**
   * The number of structural features of the '<em>Integer Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.UnsignedValueImpl <em>Unsigned Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.UnsignedValueImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getUnsignedValue()
   * @generated
   */
  int UNSIGNED_VALUE = 87;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_VALUE__INTEGER = 0;

  /**
   * The number of structural features of the '<em>Unsigned Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ColImpl <em>Col</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ColImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getCol()
   * @generated
   */
  int COL = 88;

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
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.abcImpl <em>abc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.abcImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getabc()
   * @generated
   */
  int ABC = 89;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABC__ENTRIES = FROM_VALUES_COLUMN_NAMES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>abc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABC_FEATURE_COUNT = FROM_VALUES_COLUMN_NAMES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.UnipivotInClauseImpl <em>Unipivot In Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.UnipivotInClauseImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getUnipivotInClause()
   * @generated
   */
  int UNIPIVOT_IN_CLAUSE = 90;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIPIVOT_IN_CLAUSE__OP = UNPIVOT_IN_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIPIVOT_IN_CLAUSE__ARGS = UNPIVOT_IN_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unipivot In Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIPIVOT_IN_CLAUSE_FEATURE_COUNT = UNPIVOT_IN_CLAUSE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.uicargsImpl <em>uicargs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.uicargsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getuicargs()
   * @generated
   */
  int UICARGS = 91;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UICARGS__ENTRIES = UNPIVOT_IN_CLAUSE_ARGS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>uicargs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UICARGS_FEATURE_COUNT = UNPIVOT_IN_CLAUSE_ARGS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.pvcsImpl <em>pvcs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.pvcsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getpvcs()
   * @generated
   */
  int PVCS = 92;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PVCS__ENTRIES = PIVOTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>pvcs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PVCS_FEATURE_COUNT = PIVOTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.pcolsImpl <em>pcols</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.pcolsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getpcols()
   * @generated
   */
  int PCOLS = 93;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PCOLS__ENTRIES = PIVOT_COL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>pcols</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PCOLS_FEATURE_COUNT = PIVOT_COL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.tblsImpl <em>tbls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.tblsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#gettbls()
   * @generated
   */
  int TBLS = 94;

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
  int OP_LIST = 95;

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
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.PlusImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 96;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__OP1 = OPERANDS__OP1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = OPERANDS__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = OPERANDS__RIGHT;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = OPERANDS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.MinusImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 97;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__OP1 = OPERANDS__OP1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = OPERANDS__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = OPERANDS__RIGHT;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = OPERANDS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.ConcatImpl <em>Concat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.ConcatImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getConcat()
   * @generated
   */
  int CONCAT = 98;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT__OP1 = OPERANDS__OP1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT__LEFT = OPERANDS__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT__RIGHT = OPERANDS__RIGHT;

  /**
   * The number of structural features of the '<em>Concat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT_FEATURE_COUNT = OPERANDS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.MultiplyImpl <em>Multiply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.MultiplyImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getMultiply()
   * @generated
   */
  int MULTIPLY = 99;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__OP1 = OPERANDS__OP1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__LEFT = OPERANDS__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__RIGHT = OPERANDS__RIGHT;

  /**
   * The number of structural features of the '<em>Multiply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_FEATURE_COUNT = OPERANDS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.DivisionImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 100;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__OP1 = OPERANDS__OP1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LEFT = OPERANDS__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__RIGHT = OPERANDS__RIGHT;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = OPERANDS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OBCArgsImpl <em>OBC Args</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OBCArgsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOBCArgs()
   * @generated
   */
  int OBC_ARGS = 101;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBC_ARGS__ENTRIES = ORDER_BY_CLAUSE_ARGS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>OBC Args</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBC_ARGS_FEATURE_COUNT = ORDER_BY_CLAUSE_ARGS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.AExpArgsImpl <em>AExp Args</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.AExpArgsImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getAExpArgs()
   * @generated
   */
  int AEXP_ARGS = 102;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AEXP_ARGS__ARGS = ANALYTIC_EXPR_ARGS__ARGS;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AEXP_ARGS__ENTRIES = ANALYTIC_EXPR_ARGS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>AExp Args</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AEXP_ARGS_FEATURE_COUNT = ANALYTIC_EXPR_ARGS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.OpFListImpl <em>Op FList</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.OpFListImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpFList()
   * @generated
   */
  int OP_FLIST = 103;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FLIST__ENTRIES = OP_FUNCTION_ARG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Op FList</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FLIST_FEATURE_COUNT = OP_FUNCTION_ARG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.impl.WhenListImpl <em>When List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.impl.WhenListImpl
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getWhenList()
   * @generated
   */
  int WHEN_LIST = 104;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_LIST__ENTRIES = SQL_CASE_WHENS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>When List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_LIST_FEATURE_COUNT = SQL_CASE_WHENS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.EXTRACT_VALUES <em>EXTRACT VALUES</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.EXTRACT_VALUES
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getEXTRACT_VALUES()
   * @generated
   */
  int EXTRACT_VALUES = 105;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.data.sql.XFunction <em>XFunction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.data.sql.XFunction
   * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getXFunction()
   * @generated
   */
  int XFUNCTION = 106;


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
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.FetchFirst <em>Fetch First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fetch First</em>'.
   * @see com.jaspersoft.studio.data.sql.FetchFirst
   * @generated
   */
  EClass getFetchFirst();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FetchFirst#getFetchFirst <em>Fetch First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fetch First</em>'.
   * @see com.jaspersoft.studio.data.sql.FetchFirst#getFetchFirst()
   * @see #getFetchFirst()
   * @generated
   */
  EReference getFetchFirst_FetchFirst();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.FetchFirst#getRow <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Row</em>'.
   * @see com.jaspersoft.studio.data.sql.FetchFirst#getRow()
   * @see #getFetchFirst()
   * @generated
   */
  EAttribute getFetchFirst_Row();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Offset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Offset</em>'.
   * @see com.jaspersoft.studio.data.sql.Offset
   * @generated
   */
  EClass getOffset();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.Offset#getOffset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Offset</em>'.
   * @see com.jaspersoft.studio.data.sql.Offset#getOffset()
   * @see #getOffset()
   * @generated
   */
  EAttribute getOffset_Offset();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Limit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Limit</em>'.
   * @see com.jaspersoft.studio.data.sql.Limit
   * @generated
   */
  EClass getLimit();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.Limit#getL1 <em>L1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>L1</em>'.
   * @see com.jaspersoft.studio.data.sql.Limit#getL1()
   * @see #getLimit()
   * @generated
   */
  EAttribute getLimit_L1();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.Limit#getL2 <em>L2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>L2</em>'.
   * @see com.jaspersoft.studio.data.sql.Limit#getL2()
   * @see #getLimit()
   * @generated
   */
  EAttribute getLimit_L2();

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
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Select#getOrderByEntry <em>Order By Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Order By Entry</em>'.
   * @see com.jaspersoft.studio.data.sql.Select#getOrderByEntry()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_OrderByEntry();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Select#getLim <em>Lim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lim</em>'.
   * @see com.jaspersoft.studio.data.sql.Select#getLim()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Lim();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Select#getOffset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Offset</em>'.
   * @see com.jaspersoft.studio.data.sql.Select#getOffset()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Offset();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Select#getFetchFirst <em>Fetch First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fetch First</em>'.
   * @see com.jaspersoft.studio.data.sql.Select#getFetchFirst()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_FetchFirst();

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
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.ColumnOrAlias#getDbAllCols <em>Db All Cols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db All Cols</em>'.
   * @see com.jaspersoft.studio.data.sql.ColumnOrAlias#getDbAllCols()
   * @see #getColumnOrAlias()
   * @generated
   */
  EReference getColumnOrAlias_DbAllCols();

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
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FromTableJoin#getJoinCond <em>Join Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Join Cond</em>'.
   * @see com.jaspersoft.studio.data.sql.FromTableJoin#getJoinCond()
   * @see #getFromTableJoin()
   * @generated
   */
  EReference getFromTableJoin_JoinCond();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.JoinCondition <em>Join Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Condition</em>'.
   * @see com.jaspersoft.studio.data.sql.JoinCondition
   * @generated
   */
  EClass getJoinCondition();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.JoinCondition#getUseCols <em>Use Cols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Use Cols</em>'.
   * @see com.jaspersoft.studio.data.sql.JoinCondition#getUseCols()
   * @see #getJoinCondition()
   * @generated
   */
  EReference getJoinCondition_UseCols();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.UsingCols <em>Using Cols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Using Cols</em>'.
   * @see com.jaspersoft.studio.data.sql.UsingCols
   * @generated
   */
  EClass getUsingCols();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.UsingCols#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.UsingCols#getEntries()
   * @see #getUsingCols()
   * @generated
   */
  EReference getUsingCols_Entries();

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
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.TableOrAlias#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values</em>'.
   * @see com.jaspersoft.studio.data.sql.TableOrAlias#getValues()
   * @see #getTableOrAlias()
   * @generated
   */
  EReference getTableOrAlias_Values();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.TableOrAlias#getPivot <em>Pivot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pivot</em>'.
   * @see com.jaspersoft.studio.data.sql.TableOrAlias#getPivot()
   * @see #getTableOrAlias()
   * @generated
   */
  EReference getTableOrAlias_Pivot();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.TableOrAlias#getUnpivot <em>Unpivot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unpivot</em>'.
   * @see com.jaspersoft.studio.data.sql.TableOrAlias#getUnpivot()
   * @see #getTableOrAlias()
   * @generated
   */
  EReference getTableOrAlias_Unpivot();

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
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.FromValues <em>From Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Values</em>'.
   * @see com.jaspersoft.studio.data.sql.FromValues
   * @generated
   */
  EClass getFromValues();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FromValues#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values</em>'.
   * @see com.jaspersoft.studio.data.sql.FromValues#getValues()
   * @see #getFromValues()
   * @generated
   */
  EReference getFromValues_Values();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FromValues#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see com.jaspersoft.studio.data.sql.FromValues#getC()
   * @see #getFromValues()
   * @generated
   */
  EReference getFromValues_C();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.FromValuesColumns <em>From Values Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Values Columns</em>'.
   * @see com.jaspersoft.studio.data.sql.FromValuesColumns
   * @generated
   */
  EClass getFromValuesColumns();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FromValuesColumns#getFvCols <em>Fv Cols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fv Cols</em>'.
   * @see com.jaspersoft.studio.data.sql.FromValuesColumns#getFvCols()
   * @see #getFromValuesColumns()
   * @generated
   */
  EReference getFromValuesColumns_FvCols();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.FromValuesColumnNames <em>From Values Column Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Values Column Names</em>'.
   * @see com.jaspersoft.studio.data.sql.FromValuesColumnNames
   * @generated
   */
  EClass getFromValuesColumnNames();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.ColumnNames <em>Column Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Names</em>'.
   * @see com.jaspersoft.studio.data.sql.ColumnNames
   * @generated
   */
  EClass getColumnNames();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.ColumnNames#getColName <em>Col Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Col Name</em>'.
   * @see com.jaspersoft.studio.data.sql.ColumnNames#getColName()
   * @see #getColumnNames()
   * @generated
   */
  EAttribute getColumnNames_ColName();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Values <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Values</em>'.
   * @see com.jaspersoft.studio.data.sql.Values
   * @generated
   */
  EClass getValues();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Values#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rows</em>'.
   * @see com.jaspersoft.studio.data.sql.Values#getRows()
   * @see #getValues()
   * @generated
   */
  EReference getValues_Rows();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Rows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rows</em>'.
   * @see com.jaspersoft.studio.data.sql.Rows
   * @generated
   */
  EClass getRows();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.Rows#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.Rows#getEntries()
   * @see #getRows()
   * @generated
   */
  EReference getRows_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Row <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Row</em>'.
   * @see com.jaspersoft.studio.data.sql.Row
   * @generated
   */
  EClass getRow();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Row#getRowValues <em>Row Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Row Values</em>'.
   * @see com.jaspersoft.studio.data.sql.Row#getRowValues()
   * @see #getRow()
   * @generated
   */
  EReference getRow_RowValues();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.RowValues <em>Row Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Row Values</em>'.
   * @see com.jaspersoft.studio.data.sql.RowValues
   * @generated
   */
  EClass getRowValues();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.RowValues#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.RowValues#getEntries()
   * @see #getRowValues()
   * @generated
   */
  EReference getRowValues_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.RowValue <em>Row Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Row Value</em>'.
   * @see com.jaspersoft.studio.data.sql.RowValue
   * @generated
   */
  EClass getRowValue();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.RowValue#getNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null</em>'.
   * @see com.jaspersoft.studio.data.sql.RowValue#getNull()
   * @see #getRowValue()
   * @generated
   */
  EAttribute getRowValue_Null();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.PivotTable <em>Pivot Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pivot Table</em>'.
   * @see com.jaspersoft.studio.data.sql.PivotTable
   * @generated
   */
  EClass getPivotTable();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.PivotTable#getPfun <em>Pfun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pfun</em>'.
   * @see com.jaspersoft.studio.data.sql.PivotTable#getPfun()
   * @see #getPivotTable()
   * @generated
   */
  EReference getPivotTable_Pfun();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.PivotTable#getPfor <em>Pfor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pfor</em>'.
   * @see com.jaspersoft.studio.data.sql.PivotTable#getPfor()
   * @see #getPivotTable()
   * @generated
   */
  EReference getPivotTable_Pfor();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.PivotTable#getPin <em>Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pin</em>'.
   * @see com.jaspersoft.studio.data.sql.PivotTable#getPin()
   * @see #getPivotTable()
   * @generated
   */
  EReference getPivotTable_Pin();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.PivotFunctions <em>Pivot Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pivot Functions</em>'.
   * @see com.jaspersoft.studio.data.sql.PivotFunctions
   * @generated
   */
  EClass getPivotFunctions();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.PivotFunctions#getAbc <em>Abc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abc</em>'.
   * @see com.jaspersoft.studio.data.sql.PivotFunctions#getAbc()
   * @see #getPivotFunctions()
   * @generated
   */
  EAttribute getPivotFunctions_Abc();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.PivotFunction <em>Pivot Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pivot Function</em>'.
   * @see com.jaspersoft.studio.data.sql.PivotFunction
   * @generated
   */
  EClass getPivotFunction();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.PivotInClause <em>Pivot In Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pivot In Clause</em>'.
   * @see com.jaspersoft.studio.data.sql.PivotInClause
   * @generated
   */
  EClass getPivotInClause();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.PivotInClause#getSq <em>Sq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sq</em>'.
   * @see com.jaspersoft.studio.data.sql.PivotInClause#getSq()
   * @see #getPivotInClause()
   * @generated
   */
  EReference getPivotInClause_Sq();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.PivotInClause#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see com.jaspersoft.studio.data.sql.PivotInClause#getArgs()
   * @see #getPivotInClause()
   * @generated
   */
  EReference getPivotInClause_Args();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.PivotInClause#getPinany <em>Pinany</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pinany</em>'.
   * @see com.jaspersoft.studio.data.sql.PivotInClause#getPinany()
   * @see #getPivotInClause()
   * @generated
   */
  EAttribute getPivotInClause_Pinany();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.UnpivotTable <em>Unpivot Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unpivot Table</em>'.
   * @see com.jaspersoft.studio.data.sql.UnpivotTable
   * @generated
   */
  EClass getUnpivotTable();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.UnpivotTable#getPcols <em>Pcols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pcols</em>'.
   * @see com.jaspersoft.studio.data.sql.UnpivotTable#getPcols()
   * @see #getUnpivotTable()
   * @generated
   */
  EReference getUnpivotTable_Pcols();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.UnpivotTable#getPfor <em>Pfor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pfor</em>'.
   * @see com.jaspersoft.studio.data.sql.UnpivotTable#getPfor()
   * @see #getUnpivotTable()
   * @generated
   */
  EReference getUnpivotTable_Pfor();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.UnpivotTable#getInop <em>Inop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inop</em>'.
   * @see com.jaspersoft.studio.data.sql.UnpivotTable#getInop()
   * @see #getUnpivotTable()
   * @generated
   */
  EReference getUnpivotTable_Inop();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.UnpivotInClause <em>Unpivot In Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unpivot In Clause</em>'.
   * @see com.jaspersoft.studio.data.sql.UnpivotInClause
   * @generated
   */
  EClass getUnpivotInClause();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.UnpivotInClauseArgs <em>Unpivot In Clause Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unpivot In Clause Args</em>'.
   * @see com.jaspersoft.studio.data.sql.UnpivotInClauseArgs
   * @generated
   */
  EClass getUnpivotInClauseArgs();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.UnpivotInClauseArg <em>Unpivot In Clause Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unpivot In Clause Arg</em>'.
   * @see com.jaspersoft.studio.data.sql.UnpivotInClauseArg
   * @generated
   */
  EClass getUnpivotInClauseArg();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.UnpivotInClauseArg#getPcols <em>Pcols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pcols</em>'.
   * @see com.jaspersoft.studio.data.sql.UnpivotInClauseArg#getPcols()
   * @see #getUnpivotInClauseArg()
   * @generated
   */
  EReference getUnpivotInClauseArg_Pcols();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.UnpivotInClauseArg#getCfuls <em>Cfuls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cfuls</em>'.
   * @see com.jaspersoft.studio.data.sql.UnpivotInClauseArg#getCfuls()
   * @see #getUnpivotInClauseArg()
   * @generated
   */
  EReference getUnpivotInClauseArg_Cfuls();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.PivotForClause <em>Pivot For Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pivot For Clause</em>'.
   * @see com.jaspersoft.studio.data.sql.PivotForClause
   * @generated
   */
  EClass getPivotForClause();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.PivotColumns <em>Pivot Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pivot Columns</em>'.
   * @see com.jaspersoft.studio.data.sql.PivotColumns
   * @generated
   */
  EClass getPivotColumns();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Pivots <em>Pivots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pivots</em>'.
   * @see com.jaspersoft.studio.data.sql.Pivots
   * @generated
   */
  EClass getPivots();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.PivotCol <em>Pivot Col</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pivot Col</em>'.
   * @see com.jaspersoft.studio.data.sql.PivotCol
   * @generated
   */
  EClass getPivotCol();

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
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.DbObjectNameAll <em>Db Object Name All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Db Object Name All</em>'.
   * @see com.jaspersoft.studio.data.sql.DbObjectNameAll
   * @generated
   */
  EClass getDbObjectNameAll();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.DbObjectNameAll#getDbname <em>Dbname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dbname</em>'.
   * @see com.jaspersoft.studio.data.sql.DbObjectNameAll#getDbname()
   * @see #getDbObjectNameAll()
   * @generated
   */
  EAttribute getDbObjectNameAll_Dbname();

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
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.OrderByColumnFull#getColOrderInt <em>Col Order Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Col Order Int</em>'.
   * @see com.jaspersoft.studio.data.sql.OrderByColumnFull#getColOrderInt()
   * @see #getOrderByColumnFull()
   * @generated
   */
  EAttribute getOrderByColumnFull_ColOrderInt();

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
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.GroupByColumnFull#getGbFunction <em>Gb Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gb Function</em>'.
   * @see com.jaspersoft.studio.data.sql.GroupByColumnFull#getGbFunction()
   * @see #getGroupByColumnFull()
   * @generated
   */
  EReference getGroupByColumnFull_GbFunction();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.GroupByColumnFull#getGrByInt <em>Gr By Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gr By Int</em>'.
   * @see com.jaspersoft.studio.data.sql.GroupByColumnFull#getGrByInt()
   * @see #getGroupByColumnFull()
   * @generated
   */
  EAttribute getGroupByColumnFull_GrByInt();

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
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.FullExpression#getNotPrm <em>Not Prm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Prm</em>'.
   * @see com.jaspersoft.studio.data.sql.FullExpression#getNotPrm()
   * @see #getFullExpression()
   * @generated
   */
  EAttribute getFullExpression_NotPrm();

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
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FullExpression#getExists <em>Exists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exists</em>'.
   * @see com.jaspersoft.studio.data.sql.FullExpression#getExists()
   * @see #getFullExpression()
   * @generated
   */
  EReference getFullExpression_Exists();

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
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.ExprGroup#getIsnot <em>Isnot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isnot</em>'.
   * @see com.jaspersoft.studio.data.sql.ExprGroup#getIsnot()
   * @see #getExprGroup()
   * @generated
   */
  EAttribute getExprGroup_Isnot();

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
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Like#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op2</em>'.
   * @see com.jaspersoft.studio.data.sql.Like#getOp2()
   * @see #getLike()
   * @generated
   */
  EReference getLike_Op2();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.LikeOperand <em>Like Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Like Operand</em>'.
   * @see com.jaspersoft.studio.data.sql.LikeOperand
   * @generated
   */
  EClass getLikeOperand();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.LikeOperand#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op2</em>'.
   * @see com.jaspersoft.studio.data.sql.LikeOperand#getOp2()
   * @see #getLikeOperand()
   * @generated
   */
  EAttribute getLikeOperand_Op2();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.LikeOperand#getFop2 <em>Fop2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fop2</em>'.
   * @see com.jaspersoft.studio.data.sql.LikeOperand#getFop2()
   * @see #getLikeOperand()
   * @generated
   */
  EReference getLikeOperand_Fop2();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.LikeOperand#getFcast <em>Fcast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fcast</em>'.
   * @see com.jaspersoft.studio.data.sql.LikeOperand#getFcast()
   * @see #getLikeOperand()
   * @generated
   */
  EReference getLikeOperand_Fcast();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.LikeOperand#getFparam <em>Fparam</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fparam</em>'.
   * @see com.jaspersoft.studio.data.sql.LikeOperand#getFparam()
   * @see #getLikeOperand()
   * @generated
   */
  EReference getLikeOperand_Fparam();

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
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.ExistsOper <em>Exists Oper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exists Oper</em>'.
   * @see com.jaspersoft.studio.data.sql.ExistsOper
   * @generated
   */
  EClass getExistsOper();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.ExistsOper#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.jaspersoft.studio.data.sql.ExistsOper#getOp()
   * @see #getExistsOper()
   * @generated
   */
  EAttribute getExistsOper_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.ExistsOper#getSubquery <em>Subquery</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subquery</em>'.
   * @see com.jaspersoft.studio.data.sql.ExistsOper#getSubquery()
   * @see #getExistsOper()
   * @generated
   */
  EReference getExistsOper_Subquery();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.ExistsOper#getOpList <em>Op List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op List</em>'.
   * @see com.jaspersoft.studio.data.sql.ExistsOper#getOpList()
   * @see #getExistsOper()
   * @generated
   */
  EReference getExistsOper_OpList();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OperandListGroup <em>Operand List Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operand List Group</em>'.
   * @see com.jaspersoft.studio.data.sql.OperandListGroup
   * @generated
   */
  EClass getOperandListGroup();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.OperandListGroup#getOpGroup <em>Op Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Group</em>'.
   * @see com.jaspersoft.studio.data.sql.OperandListGroup#getOpGroup()
   * @see #getOperandListGroup()
   * @generated
   */
  EReference getOperandListGroup_OpGroup();

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
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Operands#getOp1 <em>Op1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op1</em>'.
   * @see com.jaspersoft.studio.data.sql.Operands#getOp1()
   * @see #getOperands()
   * @generated
   */
  EReference getOperands_Op1();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Operands#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.jaspersoft.studio.data.sql.Operands#getLeft()
   * @see #getOperands()
   * @generated
   */
  EReference getOperands_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Operands#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.jaspersoft.studio.data.sql.Operands#getRight()
   * @see #getOperands()
   * @generated
   */
  EReference getOperands_Right();

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
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Operand#getFcast <em>Fcast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fcast</em>'.
   * @see com.jaspersoft.studio.data.sql.Operand#getFcast()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Fcast();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Operand#getFext <em>Fext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fext</em>'.
   * @see com.jaspersoft.studio.data.sql.Operand#getFext()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Fext();

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
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.Operand#getSqlcase <em>Sqlcase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sqlcase</em>'.
   * @see com.jaspersoft.studio.data.sql.Operand#getSqlcase()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Sqlcase();

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
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OpFunction <em>Op Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Function</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFunction
   * @generated
   */
  EClass getOpFunction();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.OpFunction#getFname <em>Fname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fname</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFunction#getFname()
   * @see #getOpFunction()
   * @generated
   */
  EAttribute getOpFunction_Fname();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.OpFunction#getStar <em>Star</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Star</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFunction#getStar()
   * @see #getOpFunction()
   * @generated
   */
  EAttribute getOpFunction_Star();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.OpFunction#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFunction#getArgs()
   * @see #getOpFunction()
   * @generated
   */
  EReference getOpFunction_Args();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.OpFunction#getFan <em>Fan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fan</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFunction#getFan()
   * @see #getOpFunction()
   * @generated
   */
  EReference getOpFunction_Fan();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.FunctionExtract <em>Function Extract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Extract</em>'.
   * @see com.jaspersoft.studio.data.sql.FunctionExtract
   * @generated
   */
  EClass getFunctionExtract();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.FunctionExtract#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V</em>'.
   * @see com.jaspersoft.studio.data.sql.FunctionExtract#getV()
   * @see #getFunctionExtract()
   * @generated
   */
  EAttribute getFunctionExtract_V();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FunctionExtract#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see com.jaspersoft.studio.data.sql.FunctionExtract#getOperand()
   * @see #getFunctionExtract()
   * @generated
   */
  EReference getFunctionExtract_Operand();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.FunctionAnalytical <em>Function Analytical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Analytical</em>'.
   * @see com.jaspersoft.studio.data.sql.FunctionAnalytical
   * @generated
   */
  EClass getFunctionAnalytical();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.FunctionAnalytical#getAnClause <em>An Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>An Clause</em>'.
   * @see com.jaspersoft.studio.data.sql.FunctionAnalytical#getAnClause()
   * @see #getFunctionAnalytical()
   * @generated
   */
  EReference getFunctionAnalytical_AnClause();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.AnalyticClause <em>Analytic Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Analytic Clause</em>'.
   * @see com.jaspersoft.studio.data.sql.AnalyticClause
   * @generated
   */
  EClass getAnalyticClause();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.AnalyticClause#getAbc <em>Abc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abc</em>'.
   * @see com.jaspersoft.studio.data.sql.AnalyticClause#getAbc()
   * @see #getAnalyticClause()
   * @generated
   */
  EReference getAnalyticClause_Abc();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.AnalyticClause#getObc <em>Obc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Obc</em>'.
   * @see com.jaspersoft.studio.data.sql.AnalyticClause#getObc()
   * @see #getAnalyticClause()
   * @generated
   */
  EReference getAnalyticClause_Obc();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.AnalyticClause#getWinc <em>Winc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Winc</em>'.
   * @see com.jaspersoft.studio.data.sql.AnalyticClause#getWinc()
   * @see #getAnalyticClause()
   * @generated
   */
  EReference getAnalyticClause_Winc();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.WindowingClause <em>Windowing Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Windowing Clause</em>'.
   * @see com.jaspersoft.studio.data.sql.WindowingClause
   * @generated
   */
  EClass getWindowingClause();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.WindowingClauseBetween <em>Windowing Clause Between</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Windowing Clause Between</em>'.
   * @see com.jaspersoft.studio.data.sql.WindowingClauseBetween
   * @generated
   */
  EClass getWindowingClauseBetween();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.WindowingClauseBetween#getWcoP <em>Wco P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wco P</em>'.
   * @see com.jaspersoft.studio.data.sql.WindowingClauseBetween#getWcoP()
   * @see #getWindowingClauseBetween()
   * @generated
   */
  EReference getWindowingClauseBetween_WcoP();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.WindowingClauseBetween#getWcoF <em>Wco F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wco F</em>'.
   * @see com.jaspersoft.studio.data.sql.WindowingClauseBetween#getWcoF()
   * @see #getWindowingClauseBetween()
   * @generated
   */
  EReference getWindowingClauseBetween_WcoF();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.WindowingClauseOperandFollowing <em>Windowing Clause Operand Following</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Windowing Clause Operand Following</em>'.
   * @see com.jaspersoft.studio.data.sql.WindowingClauseOperandFollowing
   * @generated
   */
  EClass getWindowingClauseOperandFollowing();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.WindowingClauseOperandFollowing#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see com.jaspersoft.studio.data.sql.WindowingClauseOperandFollowing#getExp()
   * @see #getWindowingClauseOperandFollowing()
   * @generated
   */
  EReference getWindowingClauseOperandFollowing_Exp();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.WindowingClauseOperandPreceding <em>Windowing Clause Operand Preceding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Windowing Clause Operand Preceding</em>'.
   * @see com.jaspersoft.studio.data.sql.WindowingClauseOperandPreceding
   * @generated
   */
  EClass getWindowingClauseOperandPreceding();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.WindowingClauseOperandPreceding#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.jaspersoft.studio.data.sql.WindowingClauseOperandPreceding#getExpr()
   * @see #getWindowingClauseOperandPreceding()
   * @generated
   */
  EReference getWindowingClauseOperandPreceding_Expr();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OrderByClause <em>Order By Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Order By Clause</em>'.
   * @see com.jaspersoft.studio.data.sql.OrderByClause
   * @generated
   */
  EClass getOrderByClause();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.OrderByClause#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see com.jaspersoft.studio.data.sql.OrderByClause#getArgs()
   * @see #getOrderByClause()
   * @generated
   */
  EReference getOrderByClause_Args();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OrderByClauseArgs <em>Order By Clause Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Order By Clause Args</em>'.
   * @see com.jaspersoft.studio.data.sql.OrderByClauseArgs
   * @generated
   */
  EClass getOrderByClauseArgs();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OrderByClauseArg <em>Order By Clause Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Order By Clause Arg</em>'.
   * @see com.jaspersoft.studio.data.sql.OrderByClauseArg
   * @generated
   */
  EClass getOrderByClauseArg();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.OrderByClauseArg#getCol <em>Col</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Col</em>'.
   * @see com.jaspersoft.studio.data.sql.OrderByClauseArg#getCol()
   * @see #getOrderByClauseArg()
   * @generated
   */
  EReference getOrderByClauseArg_Col();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.QueryPartitionClause <em>Query Partition Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Partition Clause</em>'.
   * @see com.jaspersoft.studio.data.sql.QueryPartitionClause
   * @generated
   */
  EClass getQueryPartitionClause();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.QueryPartitionClause#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see com.jaspersoft.studio.data.sql.QueryPartitionClause#getArgs()
   * @see #getQueryPartitionClause()
   * @generated
   */
  EReference getQueryPartitionClause_Args();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.AnalyticExprArgs <em>Analytic Expr Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Analytic Expr Args</em>'.
   * @see com.jaspersoft.studio.data.sql.AnalyticExprArgs
   * @generated
   */
  EClass getAnalyticExprArgs();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.AnalyticExprArg <em>Analytic Expr Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Analytic Expr Arg</em>'.
   * @see com.jaspersoft.studio.data.sql.AnalyticExprArg
   * @generated
   */
  EClass getAnalyticExprArg();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.AnalyticExprArg#getCe <em>Ce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ce</em>'.
   * @see com.jaspersoft.studio.data.sql.AnalyticExprArg#getCe()
   * @see #getAnalyticExprArg()
   * @generated
   */
  EReference getAnalyticExprArg_Ce();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.AnalyticExprArg#getColAlias <em>Col Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Col Alias</em>'.
   * @see com.jaspersoft.studio.data.sql.AnalyticExprArg#getColAlias()
   * @see #getAnalyticExprArg()
   * @generated
   */
  EReference getAnalyticExprArg_ColAlias();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OpFunctionArg <em>Op Function Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Function Arg</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFunctionArg
   * @generated
   */
  EClass getOpFunctionArg();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OpFunctionArgOperand <em>Op Function Arg Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Function Arg Operand</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFunctionArgOperand
   * @generated
   */
  EClass getOpFunctionArgOperand();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.OpFunctionArgOperand#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFunctionArgOperand#getOp()
   * @see #getOpFunctionArgOperand()
   * @generated
   */
  EReference getOpFunctionArgOperand_Op();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OpFunctionCast <em>Op Function Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Function Cast</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFunctionCast
   * @generated
   */
  EClass getOpFunctionCast();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.OpFunctionCast#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFunctionCast#getOp()
   * @see #getOpFunctionCast()
   * @generated
   */
  EReference getOpFunctionCast_Op();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.OpFunctionCast#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFunctionCast#getType()
   * @see #getOpFunctionCast()
   * @generated
   */
  EAttribute getOpFunctionCast_Type();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.OpFunctionCast#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>P</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFunctionCast#getP()
   * @see #getOpFunctionCast()
   * @generated
   */
  EAttribute getOpFunctionCast_P();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.OpFunctionCast#getP2 <em>P2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>P2</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFunctionCast#getP2()
   * @see #getOpFunctionCast()
   * @generated
   */
  EAttribute getOpFunctionCast_P2();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OpFunctionArgAgregate <em>Op Function Arg Agregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Function Arg Agregate</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFunctionArgAgregate
   * @generated
   */
  EClass getOpFunctionArgAgregate();

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
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.ColumnOperand#getOra <em>Ora</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ora</em>'.
   * @see com.jaspersoft.studio.data.sql.ColumnOperand#getOra()
   * @see #getColumnOperand()
   * @generated
   */
  EAttribute getColumnOperand_Ora();

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
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.ScalarOperand#getSoUInt <em>So UInt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>So UInt</em>'.
   * @see com.jaspersoft.studio.data.sql.ScalarOperand#getSoUInt()
   * @see #getScalarOperand()
   * @generated
   */
  EAttribute getScalarOperand_SoUInt();

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
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.SQLCaseOperand <em>SQL Case Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SQL Case Operand</em>'.
   * @see com.jaspersoft.studio.data.sql.SQLCaseOperand
   * @generated
   */
  EClass getSQLCaseOperand();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.SQLCaseOperand#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.jaspersoft.studio.data.sql.SQLCaseOperand#getExpr()
   * @see #getSQLCaseOperand()
   * @generated
   */
  EReference getSQLCaseOperand_Expr();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.SQLCaseOperand#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When</em>'.
   * @see com.jaspersoft.studio.data.sql.SQLCaseOperand#getWhen()
   * @see #getSQLCaseOperand()
   * @generated
   */
  EReference getSQLCaseOperand_When();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.SQLCaseWhens <em>SQL Case Whens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SQL Case Whens</em>'.
   * @see com.jaspersoft.studio.data.sql.SQLCaseWhens
   * @generated
   */
  EClass getSQLCaseWhens();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.SqlCaseWhen <em>Case When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case When</em>'.
   * @see com.jaspersoft.studio.data.sql.SqlCaseWhen
   * @generated
   */
  EClass getSqlCaseWhen();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.SqlCaseWhen#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.jaspersoft.studio.data.sql.SqlCaseWhen#getExpr()
   * @see #getSqlCaseWhen()
   * @generated
   */
  EReference getSqlCaseWhen_Expr();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.SqlCaseWhen#getTexp <em>Texp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Texp</em>'.
   * @see com.jaspersoft.studio.data.sql.SqlCaseWhen#getTexp()
   * @see #getSqlCaseWhen()
   * @generated
   */
  EReference getSqlCaseWhen_Texp();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.SqlCaseWhen#getEexp <em>Eexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Eexp</em>'.
   * @see com.jaspersoft.studio.data.sql.SqlCaseWhen#getEexp()
   * @see #getSqlCaseWhen()
   * @generated
   */
  EReference getSqlCaseWhen_Eexp();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.IntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Value</em>'.
   * @see com.jaspersoft.studio.data.sql.IntegerValue
   * @generated
   */
  EClass getIntegerValue();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.IntegerValue#getInteger <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Integer</em>'.
   * @see com.jaspersoft.studio.data.sql.IntegerValue#getInteger()
   * @see #getIntegerValue()
   * @generated
   */
  EAttribute getIntegerValue_Integer();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.UnsignedValue <em>Unsigned Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unsigned Value</em>'.
   * @see com.jaspersoft.studio.data.sql.UnsignedValue
   * @generated
   */
  EClass getUnsignedValue();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.UnsignedValue#getInteger <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Integer</em>'.
   * @see com.jaspersoft.studio.data.sql.UnsignedValue#getInteger()
   * @see #getUnsignedValue()
   * @generated
   */
  EAttribute getUnsignedValue_Integer();

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
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.abc <em>abc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>abc</em>'.
   * @see com.jaspersoft.studio.data.sql.abc
   * @generated
   */
  EClass getabc();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.abc#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.abc#getEntries()
   * @see #getabc()
   * @generated
   */
  EReference getabc_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.UnipivotInClause <em>Unipivot In Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unipivot In Clause</em>'.
   * @see com.jaspersoft.studio.data.sql.UnipivotInClause
   * @generated
   */
  EClass getUnipivotInClause();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.data.sql.UnipivotInClause#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.jaspersoft.studio.data.sql.UnipivotInClause#getOp()
   * @see #getUnipivotInClause()
   * @generated
   */
  EAttribute getUnipivotInClause_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.data.sql.UnipivotInClause#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see com.jaspersoft.studio.data.sql.UnipivotInClause#getArgs()
   * @see #getUnipivotInClause()
   * @generated
   */
  EReference getUnipivotInClause_Args();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.uicargs <em>uicargs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>uicargs</em>'.
   * @see com.jaspersoft.studio.data.sql.uicargs
   * @generated
   */
  EClass getuicargs();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.uicargs#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.uicargs#getEntries()
   * @see #getuicargs()
   * @generated
   */
  EReference getuicargs_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.pvcs <em>pvcs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pvcs</em>'.
   * @see com.jaspersoft.studio.data.sql.pvcs
   * @generated
   */
  EClass getpvcs();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.pvcs#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.pvcs#getEntries()
   * @see #getpvcs()
   * @generated
   */
  EReference getpvcs_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.pcols <em>pcols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pcols</em>'.
   * @see com.jaspersoft.studio.data.sql.pcols
   * @generated
   */
  EClass getpcols();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.pcols#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.pcols#getEntries()
   * @see #getpcols()
   * @generated
   */
  EReference getpcols_Entries();

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
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see com.jaspersoft.studio.data.sql.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see com.jaspersoft.studio.data.sql.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Concat <em>Concat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concat</em>'.
   * @see com.jaspersoft.studio.data.sql.Concat
   * @generated
   */
  EClass getConcat();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Multiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiply</em>'.
   * @see com.jaspersoft.studio.data.sql.Multiply
   * @generated
   */
  EClass getMultiply();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see com.jaspersoft.studio.data.sql.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OBCArgs <em>OBC Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OBC Args</em>'.
   * @see com.jaspersoft.studio.data.sql.OBCArgs
   * @generated
   */
  EClass getOBCArgs();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.OBCArgs#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.OBCArgs#getEntries()
   * @see #getOBCArgs()
   * @generated
   */
  EReference getOBCArgs_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.AExpArgs <em>AExp Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AExp Args</em>'.
   * @see com.jaspersoft.studio.data.sql.AExpArgs
   * @generated
   */
  EClass getAExpArgs();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.AExpArgs#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.AExpArgs#getEntries()
   * @see #getAExpArgs()
   * @generated
   */
  EReference getAExpArgs_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.OpFList <em>Op FList</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op FList</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFList
   * @generated
   */
  EClass getOpFList();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.OpFList#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.OpFList#getEntries()
   * @see #getOpFList()
   * @generated
   */
  EReference getOpFList_Entries();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.data.sql.WhenList <em>When List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When List</em>'.
   * @see com.jaspersoft.studio.data.sql.WhenList
   * @generated
   */
  EClass getWhenList();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.data.sql.WhenList#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see com.jaspersoft.studio.data.sql.WhenList#getEntries()
   * @see #getWhenList()
   * @generated
   */
  EReference getWhenList_Entries();

  /**
   * Returns the meta object for enum '{@link com.jaspersoft.studio.data.sql.EXTRACT_VALUES <em>EXTRACT VALUES</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>EXTRACT VALUES</em>'.
   * @see com.jaspersoft.studio.data.sql.EXTRACT_VALUES
   * @generated
   */
  EEnum getEXTRACT_VALUES();

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
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.FetchFirstImpl <em>Fetch First</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.FetchFirstImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFetchFirst()
     * @generated
     */
    EClass FETCH_FIRST = eINSTANCE.getFetchFirst();

    /**
     * The meta object literal for the '<em><b>Fetch First</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FETCH_FIRST__FETCH_FIRST = eINSTANCE.getFetchFirst_FetchFirst();

    /**
     * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FETCH_FIRST__ROW = eINSTANCE.getFetchFirst_Row();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OffsetImpl <em>Offset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OffsetImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOffset()
     * @generated
     */
    EClass OFFSET = eINSTANCE.getOffset();

    /**
     * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OFFSET__OFFSET = eINSTANCE.getOffset_Offset();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.LimitImpl <em>Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.LimitImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getLimit()
     * @generated
     */
    EClass LIMIT = eINSTANCE.getLimit();

    /**
     * The meta object literal for the '<em><b>L1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIMIT__L1 = eINSTANCE.getLimit_L1();

    /**
     * The meta object literal for the '<em><b>L2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIMIT__L2 = eINSTANCE.getLimit_L2();

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
     * The meta object literal for the '<em><b>Order By Entry</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__ORDER_BY_ENTRY = eINSTANCE.getSelect_OrderByEntry();

    /**
     * The meta object literal for the '<em><b>Lim</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__LIM = eINSTANCE.getSelect_Lim();

    /**
     * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__OFFSET = eINSTANCE.getSelect_Offset();

    /**
     * The meta object literal for the '<em><b>Fetch First</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__FETCH_FIRST = eINSTANCE.getSelect_FetchFirst();

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
     * The meta object literal for the '<em><b>Db All Cols</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_OR_ALIAS__DB_ALL_COLS = eINSTANCE.getColumnOrAlias_DbAllCols();

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
     * The meta object literal for the '<em><b>Join Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_TABLE_JOIN__JOIN_COND = eINSTANCE.getFromTableJoin_JoinCond();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.JoinConditionImpl <em>Join Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.JoinConditionImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getJoinCondition()
     * @generated
     */
    EClass JOIN_CONDITION = eINSTANCE.getJoinCondition();

    /**
     * The meta object literal for the '<em><b>Use Cols</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_CONDITION__USE_COLS = eINSTANCE.getJoinCondition_UseCols();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.UsingColsImpl <em>Using Cols</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.UsingColsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getUsingCols()
     * @generated
     */
    EClass USING_COLS = eINSTANCE.getUsingCols();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USING_COLS__ENTRIES = eINSTANCE.getUsingCols_Entries();

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
     * The meta object literal for the '<em><b>Values</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_OR_ALIAS__VALUES = eINSTANCE.getTableOrAlias_Values();

    /**
     * The meta object literal for the '<em><b>Pivot</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_OR_ALIAS__PIVOT = eINSTANCE.getTableOrAlias_Pivot();

    /**
     * The meta object literal for the '<em><b>Unpivot</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_OR_ALIAS__UNPIVOT = eINSTANCE.getTableOrAlias_Unpivot();

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
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.FromValuesImpl <em>From Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.FromValuesImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFromValues()
     * @generated
     */
    EClass FROM_VALUES = eINSTANCE.getFromValues();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_VALUES__VALUES = eINSTANCE.getFromValues_Values();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_VALUES__C = eINSTANCE.getFromValues_C();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.FromValuesColumnsImpl <em>From Values Columns</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.FromValuesColumnsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFromValuesColumns()
     * @generated
     */
    EClass FROM_VALUES_COLUMNS = eINSTANCE.getFromValuesColumns();

    /**
     * The meta object literal for the '<em><b>Fv Cols</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_VALUES_COLUMNS__FV_COLS = eINSTANCE.getFromValuesColumns_FvCols();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.FromValuesColumnNamesImpl <em>From Values Column Names</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.FromValuesColumnNamesImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFromValuesColumnNames()
     * @generated
     */
    EClass FROM_VALUES_COLUMN_NAMES = eINSTANCE.getFromValuesColumnNames();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.ColumnNamesImpl <em>Column Names</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.ColumnNamesImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getColumnNames()
     * @generated
     */
    EClass COLUMN_NAMES = eINSTANCE.getColumnNames();

    /**
     * The meta object literal for the '<em><b>Col Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_NAMES__COL_NAME = eINSTANCE.getColumnNames_ColName();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.ValuesImpl <em>Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.ValuesImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getValues()
     * @generated
     */
    EClass VALUES = eINSTANCE.getValues();

    /**
     * The meta object literal for the '<em><b>Rows</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUES__ROWS = eINSTANCE.getValues_Rows();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.RowsImpl <em>Rows</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.RowsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getRows()
     * @generated
     */
    EClass ROWS = eINSTANCE.getRows();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROWS__ENTRIES = eINSTANCE.getRows_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.RowImpl <em>Row</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.RowImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getRow()
     * @generated
     */
    EClass ROW = eINSTANCE.getRow();

    /**
     * The meta object literal for the '<em><b>Row Values</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROW__ROW_VALUES = eINSTANCE.getRow_RowValues();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.RowValuesImpl <em>Row Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.RowValuesImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getRowValues()
     * @generated
     */
    EClass ROW_VALUES = eINSTANCE.getRowValues();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROW_VALUES__ENTRIES = eINSTANCE.getRowValues_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.RowValueImpl <em>Row Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.RowValueImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getRowValue()
     * @generated
     */
    EClass ROW_VALUE = eINSTANCE.getRowValue();

    /**
     * The meta object literal for the '<em><b>Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROW_VALUE__NULL = eINSTANCE.getRowValue_Null();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.PivotTableImpl <em>Pivot Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.PivotTableImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivotTable()
     * @generated
     */
    EClass PIVOT_TABLE = eINSTANCE.getPivotTable();

    /**
     * The meta object literal for the '<em><b>Pfun</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PIVOT_TABLE__PFUN = eINSTANCE.getPivotTable_Pfun();

    /**
     * The meta object literal for the '<em><b>Pfor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PIVOT_TABLE__PFOR = eINSTANCE.getPivotTable_Pfor();

    /**
     * The meta object literal for the '<em><b>Pin</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PIVOT_TABLE__PIN = eINSTANCE.getPivotTable_Pin();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.PivotFunctionsImpl <em>Pivot Functions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.PivotFunctionsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivotFunctions()
     * @generated
     */
    EClass PIVOT_FUNCTIONS = eINSTANCE.getPivotFunctions();

    /**
     * The meta object literal for the '<em><b>Abc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PIVOT_FUNCTIONS__ABC = eINSTANCE.getPivotFunctions_Abc();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.PivotFunctionImpl <em>Pivot Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.PivotFunctionImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivotFunction()
     * @generated
     */
    EClass PIVOT_FUNCTION = eINSTANCE.getPivotFunction();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.PivotInClauseImpl <em>Pivot In Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.PivotInClauseImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivotInClause()
     * @generated
     */
    EClass PIVOT_IN_CLAUSE = eINSTANCE.getPivotInClause();

    /**
     * The meta object literal for the '<em><b>Sq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PIVOT_IN_CLAUSE__SQ = eINSTANCE.getPivotInClause_Sq();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PIVOT_IN_CLAUSE__ARGS = eINSTANCE.getPivotInClause_Args();

    /**
     * The meta object literal for the '<em><b>Pinany</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PIVOT_IN_CLAUSE__PINANY = eINSTANCE.getPivotInClause_Pinany();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.UnpivotTableImpl <em>Unpivot Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.UnpivotTableImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getUnpivotTable()
     * @generated
     */
    EClass UNPIVOT_TABLE = eINSTANCE.getUnpivotTable();

    /**
     * The meta object literal for the '<em><b>Pcols</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNPIVOT_TABLE__PCOLS = eINSTANCE.getUnpivotTable_Pcols();

    /**
     * The meta object literal for the '<em><b>Pfor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNPIVOT_TABLE__PFOR = eINSTANCE.getUnpivotTable_Pfor();

    /**
     * The meta object literal for the '<em><b>Inop</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNPIVOT_TABLE__INOP = eINSTANCE.getUnpivotTable_Inop();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.UnpivotInClauseImpl <em>Unpivot In Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.UnpivotInClauseImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getUnpivotInClause()
     * @generated
     */
    EClass UNPIVOT_IN_CLAUSE = eINSTANCE.getUnpivotInClause();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.UnpivotInClauseArgsImpl <em>Unpivot In Clause Args</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.UnpivotInClauseArgsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getUnpivotInClauseArgs()
     * @generated
     */
    EClass UNPIVOT_IN_CLAUSE_ARGS = eINSTANCE.getUnpivotInClauseArgs();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.UnpivotInClauseArgImpl <em>Unpivot In Clause Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.UnpivotInClauseArgImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getUnpivotInClauseArg()
     * @generated
     */
    EClass UNPIVOT_IN_CLAUSE_ARG = eINSTANCE.getUnpivotInClauseArg();

    /**
     * The meta object literal for the '<em><b>Pcols</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNPIVOT_IN_CLAUSE_ARG__PCOLS = eINSTANCE.getUnpivotInClauseArg_Pcols();

    /**
     * The meta object literal for the '<em><b>Cfuls</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNPIVOT_IN_CLAUSE_ARG__CFULS = eINSTANCE.getUnpivotInClauseArg_Cfuls();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.PivotForClauseImpl <em>Pivot For Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.PivotForClauseImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivotForClause()
     * @generated
     */
    EClass PIVOT_FOR_CLAUSE = eINSTANCE.getPivotForClause();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.PivotColumnsImpl <em>Pivot Columns</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.PivotColumnsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivotColumns()
     * @generated
     */
    EClass PIVOT_COLUMNS = eINSTANCE.getPivotColumns();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.PivotsImpl <em>Pivots</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.PivotsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivots()
     * @generated
     */
    EClass PIVOTS = eINSTANCE.getPivots();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.PivotColImpl <em>Pivot Col</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.PivotColImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPivotCol()
     * @generated
     */
    EClass PIVOT_COL = eINSTANCE.getPivotCol();

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
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.DbObjectNameAllImpl <em>Db Object Name All</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.DbObjectNameAllImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getDbObjectNameAll()
     * @generated
     */
    EClass DB_OBJECT_NAME_ALL = eINSTANCE.getDbObjectNameAll();

    /**
     * The meta object literal for the '<em><b>Dbname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DB_OBJECT_NAME_ALL__DBNAME = eINSTANCE.getDbObjectNameAll_Dbname();

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
     * The meta object literal for the '<em><b>Col Order Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORDER_BY_COLUMN_FULL__COL_ORDER_INT = eINSTANCE.getOrderByColumnFull_ColOrderInt();

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
     * The meta object literal for the '<em><b>Gb Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BY_COLUMN_FULL__GB_FUNCTION = eINSTANCE.getGroupByColumnFull_GbFunction();

    /**
     * The meta object literal for the '<em><b>Gr By Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_BY_COLUMN_FULL__GR_BY_INT = eINSTANCE.getGroupByColumnFull_GrByInt();

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
     * The meta object literal for the '<em><b>Not Prm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FULL_EXPRESSION__NOT_PRM = eINSTANCE.getFullExpression_NotPrm();

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
     * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_EXPRESSION__IN = eINSTANCE.getFullExpression_In();

    /**
     * The meta object literal for the '<em><b>Exists</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_EXPRESSION__EXISTS = eINSTANCE.getFullExpression_Exists();

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
     * The meta object literal for the '<em><b>Isnot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_GROUP__ISNOT = eINSTANCE.getExprGroup_Isnot();

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
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIKE__OP2 = eINSTANCE.getLike_Op2();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.LikeOperandImpl <em>Like Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.LikeOperandImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getLikeOperand()
     * @generated
     */
    EClass LIKE_OPERAND = eINSTANCE.getLikeOperand();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIKE_OPERAND__OP2 = eINSTANCE.getLikeOperand_Op2();

    /**
     * The meta object literal for the '<em><b>Fop2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIKE_OPERAND__FOP2 = eINSTANCE.getLikeOperand_Fop2();

    /**
     * The meta object literal for the '<em><b>Fcast</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIKE_OPERAND__FCAST = eINSTANCE.getLikeOperand_Fcast();

    /**
     * The meta object literal for the '<em><b>Fparam</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIKE_OPERAND__FPARAM = eINSTANCE.getLikeOperand_Fparam();

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
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.ExistsOperImpl <em>Exists Oper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.ExistsOperImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getExistsOper()
     * @generated
     */
    EClass EXISTS_OPER = eINSTANCE.getExistsOper();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXISTS_OPER__OP = eINSTANCE.getExistsOper_Op();

    /**
     * The meta object literal for the '<em><b>Subquery</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXISTS_OPER__SUBQUERY = eINSTANCE.getExistsOper_Subquery();

    /**
     * The meta object literal for the '<em><b>Op List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXISTS_OPER__OP_LIST = eINSTANCE.getExistsOper_OpList();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OperandListGroupImpl <em>Operand List Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OperandListGroupImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOperandListGroup()
     * @generated
     */
    EClass OPERAND_LIST_GROUP = eINSTANCE.getOperandListGroup();

    /**
     * The meta object literal for the '<em><b>Op Group</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND_LIST_GROUP__OP_GROUP = eINSTANCE.getOperandListGroup_OpGroup();

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
     * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERANDS__OP1 = eINSTANCE.getOperands_Op1();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERANDS__LEFT = eINSTANCE.getOperands_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERANDS__RIGHT = eINSTANCE.getOperands_Right();

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
     * The meta object literal for the '<em><b>Fcast</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__FCAST = eINSTANCE.getOperand_Fcast();

    /**
     * The meta object literal for the '<em><b>Fext</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__FEXT = eINSTANCE.getOperand_Fext();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__FUNC = eINSTANCE.getOperand_Func();

    /**
     * The meta object literal for the '<em><b>Sqlcase</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__SQLCASE = eINSTANCE.getOperand_Sqlcase();

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
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OpFunctionImpl <em>Op Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OpFunctionImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpFunction()
     * @generated
     */
    EClass OP_FUNCTION = eINSTANCE.getOpFunction();

    /**
     * The meta object literal for the '<em><b>Fname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OP_FUNCTION__FNAME = eINSTANCE.getOpFunction_Fname();

    /**
     * The meta object literal for the '<em><b>Star</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OP_FUNCTION__STAR = eINSTANCE.getOpFunction_Star();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_FUNCTION__ARGS = eINSTANCE.getOpFunction_Args();

    /**
     * The meta object literal for the '<em><b>Fan</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_FUNCTION__FAN = eINSTANCE.getOpFunction_Fan();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.FunctionExtractImpl <em>Function Extract</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.FunctionExtractImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFunctionExtract()
     * @generated
     */
    EClass FUNCTION_EXTRACT = eINSTANCE.getFunctionExtract();

    /**
     * The meta object literal for the '<em><b>V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_EXTRACT__V = eINSTANCE.getFunctionExtract_V();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_EXTRACT__OPERAND = eINSTANCE.getFunctionExtract_Operand();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.FunctionAnalyticalImpl <em>Function Analytical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.FunctionAnalyticalImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getFunctionAnalytical()
     * @generated
     */
    EClass FUNCTION_ANALYTICAL = eINSTANCE.getFunctionAnalytical();

    /**
     * The meta object literal for the '<em><b>An Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_ANALYTICAL__AN_CLAUSE = eINSTANCE.getFunctionAnalytical_AnClause();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.AnalyticClauseImpl <em>Analytic Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.AnalyticClauseImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getAnalyticClause()
     * @generated
     */
    EClass ANALYTIC_CLAUSE = eINSTANCE.getAnalyticClause();

    /**
     * The meta object literal for the '<em><b>Abc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANALYTIC_CLAUSE__ABC = eINSTANCE.getAnalyticClause_Abc();

    /**
     * The meta object literal for the '<em><b>Obc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANALYTIC_CLAUSE__OBC = eINSTANCE.getAnalyticClause_Obc();

    /**
     * The meta object literal for the '<em><b>Winc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANALYTIC_CLAUSE__WINC = eINSTANCE.getAnalyticClause_Winc();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.WindowingClauseImpl <em>Windowing Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.WindowingClauseImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getWindowingClause()
     * @generated
     */
    EClass WINDOWING_CLAUSE = eINSTANCE.getWindowingClause();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.WindowingClauseBetweenImpl <em>Windowing Clause Between</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.WindowingClauseBetweenImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getWindowingClauseBetween()
     * @generated
     */
    EClass WINDOWING_CLAUSE_BETWEEN = eINSTANCE.getWindowingClauseBetween();

    /**
     * The meta object literal for the '<em><b>Wco P</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WINDOWING_CLAUSE_BETWEEN__WCO_P = eINSTANCE.getWindowingClauseBetween_WcoP();

    /**
     * The meta object literal for the '<em><b>Wco F</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WINDOWING_CLAUSE_BETWEEN__WCO_F = eINSTANCE.getWindowingClauseBetween_WcoF();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.WindowingClauseOperandFollowingImpl <em>Windowing Clause Operand Following</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.WindowingClauseOperandFollowingImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getWindowingClauseOperandFollowing()
     * @generated
     */
    EClass WINDOWING_CLAUSE_OPERAND_FOLLOWING = eINSTANCE.getWindowingClauseOperandFollowing();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WINDOWING_CLAUSE_OPERAND_FOLLOWING__EXP = eINSTANCE.getWindowingClauseOperandFollowing_Exp();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.WindowingClauseOperandPrecedingImpl <em>Windowing Clause Operand Preceding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.WindowingClauseOperandPrecedingImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getWindowingClauseOperandPreceding()
     * @generated
     */
    EClass WINDOWING_CLAUSE_OPERAND_PRECEDING = eINSTANCE.getWindowingClauseOperandPreceding();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WINDOWING_CLAUSE_OPERAND_PRECEDING__EXPR = eINSTANCE.getWindowingClauseOperandPreceding_Expr();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OrderByClauseImpl <em>Order By Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OrderByClauseImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrderByClause()
     * @generated
     */
    EClass ORDER_BY_CLAUSE = eINSTANCE.getOrderByClause();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDER_BY_CLAUSE__ARGS = eINSTANCE.getOrderByClause_Args();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OrderByClauseArgsImpl <em>Order By Clause Args</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OrderByClauseArgsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrderByClauseArgs()
     * @generated
     */
    EClass ORDER_BY_CLAUSE_ARGS = eINSTANCE.getOrderByClauseArgs();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OrderByClauseArgImpl <em>Order By Clause Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OrderByClauseArgImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOrderByClauseArg()
     * @generated
     */
    EClass ORDER_BY_CLAUSE_ARG = eINSTANCE.getOrderByClauseArg();

    /**
     * The meta object literal for the '<em><b>Col</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDER_BY_CLAUSE_ARG__COL = eINSTANCE.getOrderByClauseArg_Col();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.QueryPartitionClauseImpl <em>Query Partition Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.QueryPartitionClauseImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getQueryPartitionClause()
     * @generated
     */
    EClass QUERY_PARTITION_CLAUSE = eINSTANCE.getQueryPartitionClause();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_PARTITION_CLAUSE__ARGS = eINSTANCE.getQueryPartitionClause_Args();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.AnalyticExprArgsImpl <em>Analytic Expr Args</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.AnalyticExprArgsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getAnalyticExprArgs()
     * @generated
     */
    EClass ANALYTIC_EXPR_ARGS = eINSTANCE.getAnalyticExprArgs();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.AnalyticExprArgImpl <em>Analytic Expr Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.AnalyticExprArgImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getAnalyticExprArg()
     * @generated
     */
    EClass ANALYTIC_EXPR_ARG = eINSTANCE.getAnalyticExprArg();

    /**
     * The meta object literal for the '<em><b>Ce</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANALYTIC_EXPR_ARG__CE = eINSTANCE.getAnalyticExprArg_Ce();

    /**
     * The meta object literal for the '<em><b>Col Alias</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANALYTIC_EXPR_ARG__COL_ALIAS = eINSTANCE.getAnalyticExprArg_ColAlias();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OpFunctionArgImpl <em>Op Function Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OpFunctionArgImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpFunctionArg()
     * @generated
     */
    EClass OP_FUNCTION_ARG = eINSTANCE.getOpFunctionArg();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OpFunctionArgOperandImpl <em>Op Function Arg Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OpFunctionArgOperandImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpFunctionArgOperand()
     * @generated
     */
    EClass OP_FUNCTION_ARG_OPERAND = eINSTANCE.getOpFunctionArgOperand();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_FUNCTION_ARG_OPERAND__OP = eINSTANCE.getOpFunctionArgOperand_Op();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OpFunctionCastImpl <em>Op Function Cast</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OpFunctionCastImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpFunctionCast()
     * @generated
     */
    EClass OP_FUNCTION_CAST = eINSTANCE.getOpFunctionCast();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_FUNCTION_CAST__OP = eINSTANCE.getOpFunctionCast_Op();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OP_FUNCTION_CAST__TYPE = eINSTANCE.getOpFunctionCast_Type();

    /**
     * The meta object literal for the '<em><b>P</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OP_FUNCTION_CAST__P = eINSTANCE.getOpFunctionCast_P();

    /**
     * The meta object literal for the '<em><b>P2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OP_FUNCTION_CAST__P2 = eINSTANCE.getOpFunctionCast_P2();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OpFunctionArgAgregateImpl <em>Op Function Arg Agregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OpFunctionArgAgregateImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpFunctionArgAgregate()
     * @generated
     */
    EClass OP_FUNCTION_ARG_AGREGATE = eINSTANCE.getOpFunctionArgAgregate();

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
     * The meta object literal for the '<em><b>Ora</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_OPERAND__ORA = eINSTANCE.getColumnOperand_Ora();

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
     * The meta object literal for the '<em><b>So UInt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCALAR_OPERAND__SO_UINT = eINSTANCE.getScalarOperand_SoUInt();

    /**
     * The meta object literal for the '<em><b>Soint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCALAR_OPERAND__SOINT = eINSTANCE.getScalarOperand_Soint();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.SQLCaseOperandImpl <em>SQL Case Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.SQLCaseOperandImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSQLCaseOperand()
     * @generated
     */
    EClass SQL_CASE_OPERAND = eINSTANCE.getSQLCaseOperand();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_CASE_OPERAND__EXPR = eINSTANCE.getSQLCaseOperand_Expr();

    /**
     * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_CASE_OPERAND__WHEN = eINSTANCE.getSQLCaseOperand_When();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.SQLCaseWhensImpl <em>SQL Case Whens</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.SQLCaseWhensImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSQLCaseWhens()
     * @generated
     */
    EClass SQL_CASE_WHENS = eINSTANCE.getSQLCaseWhens();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.SqlCaseWhenImpl <em>Case When</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.SqlCaseWhenImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getSqlCaseWhen()
     * @generated
     */
    EClass SQL_CASE_WHEN = eINSTANCE.getSqlCaseWhen();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_CASE_WHEN__EXPR = eINSTANCE.getSqlCaseWhen_Expr();

    /**
     * The meta object literal for the '<em><b>Texp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_CASE_WHEN__TEXP = eINSTANCE.getSqlCaseWhen_Texp();

    /**
     * The meta object literal for the '<em><b>Eexp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_CASE_WHEN__EEXP = eINSTANCE.getSqlCaseWhen_Eexp();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.IntegerValueImpl <em>Integer Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.IntegerValueImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getIntegerValue()
     * @generated
     */
    EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

    /**
     * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_VALUE__INTEGER = eINSTANCE.getIntegerValue_Integer();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.UnsignedValueImpl <em>Unsigned Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.UnsignedValueImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getUnsignedValue()
     * @generated
     */
    EClass UNSIGNED_VALUE = eINSTANCE.getUnsignedValue();

    /**
     * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNSIGNED_VALUE__INTEGER = eINSTANCE.getUnsignedValue_Integer();

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
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.abcImpl <em>abc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.abcImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getabc()
     * @generated
     */
    EClass ABC = eINSTANCE.getabc();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABC__ENTRIES = eINSTANCE.getabc_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.UnipivotInClauseImpl <em>Unipivot In Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.UnipivotInClauseImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getUnipivotInClause()
     * @generated
     */
    EClass UNIPIVOT_IN_CLAUSE = eINSTANCE.getUnipivotInClause();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIPIVOT_IN_CLAUSE__OP = eINSTANCE.getUnipivotInClause_Op();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIPIVOT_IN_CLAUSE__ARGS = eINSTANCE.getUnipivotInClause_Args();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.uicargsImpl <em>uicargs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.uicargsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getuicargs()
     * @generated
     */
    EClass UICARGS = eINSTANCE.getuicargs();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UICARGS__ENTRIES = eINSTANCE.getuicargs_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.pvcsImpl <em>pvcs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.pvcsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getpvcs()
     * @generated
     */
    EClass PVCS = eINSTANCE.getpvcs();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PVCS__ENTRIES = eINSTANCE.getpvcs_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.pcolsImpl <em>pcols</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.pcolsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getpcols()
     * @generated
     */
    EClass PCOLS = eINSTANCE.getpcols();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PCOLS__ENTRIES = eINSTANCE.getpcols_Entries();

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
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.PlusImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.MinusImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.ConcatImpl <em>Concat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.ConcatImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getConcat()
     * @generated
     */
    EClass CONCAT = eINSTANCE.getConcat();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.MultiplyImpl <em>Multiply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.MultiplyImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getMultiply()
     * @generated
     */
    EClass MULTIPLY = eINSTANCE.getMultiply();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.DivisionImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getDivision()
     * @generated
     */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OBCArgsImpl <em>OBC Args</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OBCArgsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOBCArgs()
     * @generated
     */
    EClass OBC_ARGS = eINSTANCE.getOBCArgs();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBC_ARGS__ENTRIES = eINSTANCE.getOBCArgs_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.AExpArgsImpl <em>AExp Args</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.AExpArgsImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getAExpArgs()
     * @generated
     */
    EClass AEXP_ARGS = eINSTANCE.getAExpArgs();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AEXP_ARGS__ENTRIES = eINSTANCE.getAExpArgs_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.OpFListImpl <em>Op FList</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.OpFListImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getOpFList()
     * @generated
     */
    EClass OP_FLIST = eINSTANCE.getOpFList();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_FLIST__ENTRIES = eINSTANCE.getOpFList_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.impl.WhenListImpl <em>When List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.impl.WhenListImpl
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getWhenList()
     * @generated
     */
    EClass WHEN_LIST = eINSTANCE.getWhenList();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_LIST__ENTRIES = eINSTANCE.getWhenList_Entries();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.EXTRACT_VALUES <em>EXTRACT VALUES</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.EXTRACT_VALUES
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getEXTRACT_VALUES()
     * @generated
     */
    EEnum EXTRACT_VALUES = eINSTANCE.getEXTRACT_VALUES();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.data.sql.XFunction <em>XFunction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.data.sql.XFunction
     * @see com.jaspersoft.studio.data.sql.impl.SqlPackageImpl#getXFunction()
     * @generated
     */
    EEnum XFUNCTION = eINSTANCE.getXFunction();

  }

} //SqlPackage
