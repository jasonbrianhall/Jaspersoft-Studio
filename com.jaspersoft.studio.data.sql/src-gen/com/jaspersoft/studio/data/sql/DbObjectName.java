/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
/**
 */
package com.jaspersoft.studio.data.sql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Db Object Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.DbObjectName#getDbname <em>Dbname</em>}</li>
 * </ul>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getDbObjectName()
 * @model
 * @generated
 */
public interface DbObjectName extends ColumnFull, UsingCols, PivotCol, TableFull
{
  /**
   * Returns the value of the '<em><b>Dbname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dbname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dbname</em>' attribute.
   * @see #setDbname(String)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getDbObjectName_Dbname()
   * @model
   * @generated
   */
  String getDbname();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.DbObjectName#getDbname <em>Dbname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dbname</em>' attribute.
   * @see #getDbname()
   * @generated
   */
  void setDbname(String value);

} // DbObjectName
