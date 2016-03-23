/**
 */
package com.jaspersoft.studio.data.sql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.SqlCaseWhen#getExpr <em>Expr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.SqlCaseWhen#getTexp <em>Texp</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.SqlCaseWhen#getEexp <em>Eexp</em>}</li>
 * </ul>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getSqlCaseWhen()
 * @model
 * @generated
 */
public interface SqlCaseWhen extends SQLCaseWhens
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
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getSqlCaseWhen_Expr()
   * @model containment="true"
   * @generated
   */
  OrExpr getExpr();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.SqlCaseWhen#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(OrExpr value);

  /**
   * Returns the value of the '<em><b>Texp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Texp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Texp</em>' containment reference.
   * @see #setTexp(Operands)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getSqlCaseWhen_Texp()
   * @model containment="true"
   * @generated
   */
  Operands getTexp();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.SqlCaseWhen#getTexp <em>Texp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texp</em>' containment reference.
   * @see #getTexp()
   * @generated
   */
  void setTexp(Operands value);

  /**
   * Returns the value of the '<em><b>Eexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eexp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eexp</em>' containment reference.
   * @see #setEexp(Operands)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getSqlCaseWhen_Eexp()
   * @model containment="true"
   * @generated
   */
  Operands getEexp();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.SqlCaseWhen#getEexp <em>Eexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eexp</em>' containment reference.
   * @see #getEexp()
   * @generated
   */
  void setEexp(Operands value);

} // SqlCaseWhen
