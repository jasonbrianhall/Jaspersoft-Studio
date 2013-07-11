/**
 */
package com.jaspersoft.studio.data.sql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Or Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.ColumnOrAlias#getCfull <em>Cfull</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.ColumnOrAlias#getAlias <em>Alias</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.ColumnOrAlias#getColAlias <em>Col Alias</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.ColumnOrAlias#getAllCols <em>All Cols</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getColumnOrAlias()
 * @model
 * @generated
 */
public interface ColumnOrAlias extends OrColumn
{
  /**
   * Returns the value of the '<em><b>Cfull</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cfull</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cfull</em>' containment reference.
   * @see #setCfull(ColumnFull)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getColumnOrAlias_Cfull()
   * @model containment="true"
   * @generated
   */
  ColumnFull getCfull();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.ColumnOrAlias#getCfull <em>Cfull</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cfull</em>' containment reference.
   * @see #getCfull()
   * @generated
   */
  void setCfull(ColumnFull value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' attribute.
   * @see #setAlias(String)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getColumnOrAlias_Alias()
   * @model
   * @generated
   */
  String getAlias();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.ColumnOrAlias#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #getAlias()
   * @generated
   */
  void setAlias(String value);

  /**
   * Returns the value of the '<em><b>Col Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Col Alias</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col Alias</em>' containment reference.
   * @see #setColAlias(DbObjectName)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getColumnOrAlias_ColAlias()
   * @model containment="true"
   * @generated
   */
  DbObjectName getColAlias();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.ColumnOrAlias#getColAlias <em>Col Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col Alias</em>' containment reference.
   * @see #getColAlias()
   * @generated
   */
  void setColAlias(DbObjectName value);

  /**
   * Returns the value of the '<em><b>All Cols</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Cols</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Cols</em>' attribute.
   * @see #setAllCols(String)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getColumnOrAlias_AllCols()
   * @model
   * @generated
   */
  String getAllCols();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.ColumnOrAlias#getAllCols <em>All Cols</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All Cols</em>' attribute.
   * @see #getAllCols()
   * @generated
   */
  void setAllCols(String value);

} // ColumnOrAlias
