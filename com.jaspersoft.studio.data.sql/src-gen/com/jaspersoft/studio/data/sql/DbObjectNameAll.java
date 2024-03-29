/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
/**
 */
package com.jaspersoft.studio.data.sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Db Object Name All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.DbObjectNameAll#getDbname <em>Dbname</em>}</li>
 * </ul>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getDbObjectNameAll()
 * @model
 * @generated
 */
public interface DbObjectNameAll extends EObject
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
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getDbObjectNameAll_Dbname()
   * @model
   * @generated
   */
  String getDbname();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.DbObjectNameAll#getDbname <em>Dbname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dbname</em>' attribute.
   * @see #getDbname()
   * @generated
   */
  void setDbname(String value);

} // DbObjectNameAll
