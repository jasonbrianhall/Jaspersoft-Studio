/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
/**
 */
package com.jaspersoft.studio.data.sql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operands</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.Operands#getOp1 <em>Op1</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.Operands#getLeft <em>Left</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.Operands#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getOperands()
 * @model
 * @generated
 */
public interface Operands extends OpFunctionArgAgregate
{
  /**
   * Returns the value of the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op1</em>' containment reference.
   * @see #setOp1(Operand)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getOperands_Op1()
   * @model containment="true"
   * @generated
   */
  Operand getOp1();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.Operands#getOp1 <em>Op1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op1</em>' containment reference.
   * @see #getOp1()
   * @generated
   */
  void setOp1(Operand value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Operands)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getOperands_Left()
   * @model containment="true"
   * @generated
   */
  Operands getLeft();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.Operands#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Operands value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Operand)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getOperands_Right()
   * @model containment="true"
   * @generated
   */
  Operand getRight();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.Operands#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Operand value);

} // Operands
