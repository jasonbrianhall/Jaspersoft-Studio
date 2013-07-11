/**
 */
package com.jaspersoft.studio.data.sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.Comparison#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.Comparison#getOp2 <em>Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends EObject
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getComparison_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.Comparison#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op2</em>' containment reference.
   * @see #setOp2(Operands)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getComparison_Op2()
   * @model containment="true"
   * @generated
   */
  Operands getOp2();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.Comparison#getOp2 <em>Op2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op2</em>' containment reference.
   * @see #getOp2()
   * @generated
   */
  void setOp2(Operands value);

} // Comparison
