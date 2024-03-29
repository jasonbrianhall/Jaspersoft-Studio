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
 * A representation of the model object '<em><b>Op Function Cast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.OpFunctionCast#getOp <em>Op</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.OpFunctionCast#getType <em>Type</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.OpFunctionCast#getP <em>P</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.OpFunctionCast#getP2 <em>P2</em>}</li>
 * </ul>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getOpFunctionCast()
 * @model
 * @generated
 */
public interface OpFunctionCast extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(Operands)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getOpFunctionCast_Op()
   * @model containment="true"
   * @generated
   */
  Operands getOp();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.OpFunctionCast#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(Operands value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getOpFunctionCast_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.OpFunctionCast#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' attribute.
   * @see #setP(Long)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getOpFunctionCast_P()
   * @model
   * @generated
   */
  Long getP();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.OpFunctionCast#getP <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' attribute.
   * @see #getP()
   * @generated
   */
  void setP(Long value);

  /**
   * Returns the value of the '<em><b>P2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P2</em>' attribute.
   * @see #setP2(Long)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getOpFunctionCast_P2()
   * @model
   * @generated
   */
  Long getP2();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.OpFunctionCast#getP2 <em>P2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P2</em>' attribute.
   * @see #getP2()
   * @generated
   */
  void setP2(Long value);

} // OpFunctionCast
