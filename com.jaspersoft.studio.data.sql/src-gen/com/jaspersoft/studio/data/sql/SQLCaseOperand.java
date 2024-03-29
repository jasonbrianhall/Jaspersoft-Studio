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
 * A representation of the model object '<em><b>SQL Case Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.SQLCaseOperand#getExpr <em>Expr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.SQLCaseOperand#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getSQLCaseOperand()
 * @model
 * @generated
 */
public interface SQLCaseOperand extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(OrExpr)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getSQLCaseOperand_Expr()
   * @model containment="true"
   * @generated
   */
  OrExpr getExpr();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.SQLCaseOperand#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(OrExpr value);

  /**
   * Returns the value of the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' containment reference.
   * @see #setWhen(SQLCaseWhens)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getSQLCaseOperand_When()
   * @model containment="true"
   * @generated
   */
  SQLCaseWhens getWhen();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.SQLCaseOperand#getWhen <em>When</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' containment reference.
   * @see #getWhen()
   * @generated
   */
  void setWhen(SQLCaseWhens value);

} // SQLCaseOperand
