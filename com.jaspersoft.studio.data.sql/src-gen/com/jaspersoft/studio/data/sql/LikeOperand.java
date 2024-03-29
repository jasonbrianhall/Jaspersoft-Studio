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
 * A representation of the model object '<em><b>Like Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.LikeOperand#getOp2 <em>Op2</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.LikeOperand#getFop2 <em>Fop2</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.LikeOperand#getFcast <em>Fcast</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.LikeOperand#getFparam <em>Fparam</em>}</li>
 * </ul>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getLikeOperand()
 * @model
 * @generated
 */
public interface LikeOperand extends EObject
{
  /**
   * Returns the value of the '<em><b>Op2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op2</em>' attribute.
   * @see #setOp2(String)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getLikeOperand_Op2()
   * @model
   * @generated
   */
  String getOp2();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.LikeOperand#getOp2 <em>Op2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op2</em>' attribute.
   * @see #getOp2()
   * @generated
   */
  void setOp2(String value);

  /**
   * Returns the value of the '<em><b>Fop2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fop2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fop2</em>' containment reference.
   * @see #setFop2(OpFunction)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getLikeOperand_Fop2()
   * @model containment="true"
   * @generated
   */
  OpFunction getFop2();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.LikeOperand#getFop2 <em>Fop2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fop2</em>' containment reference.
   * @see #getFop2()
   * @generated
   */
  void setFop2(OpFunction value);

  /**
   * Returns the value of the '<em><b>Fcast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fcast</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fcast</em>' containment reference.
   * @see #setFcast(OpFunctionCast)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getLikeOperand_Fcast()
   * @model containment="true"
   * @generated
   */
  OpFunctionCast getFcast();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.LikeOperand#getFcast <em>Fcast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fcast</em>' containment reference.
   * @see #getFcast()
   * @generated
   */
  void setFcast(OpFunctionCast value);

  /**
   * Returns the value of the '<em><b>Fparam</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fparam</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fparam</em>' containment reference.
   * @see #setFparam(POperand)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getLikeOperand_Fparam()
   * @model containment="true"
   * @generated
   */
  POperand getFparam();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.LikeOperand#getFparam <em>Fparam</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fparam</em>' containment reference.
   * @see #getFparam()
   * @generated
   */
  void setFparam(POperand value);

} // LikeOperand
