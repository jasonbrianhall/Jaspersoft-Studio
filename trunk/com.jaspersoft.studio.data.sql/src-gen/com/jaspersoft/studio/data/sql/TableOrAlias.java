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
 * A representation of the model object '<em><b>Table Or Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.TableOrAlias#getTfull <em>Tfull</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.TableOrAlias#getSq <em>Sq</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.TableOrAlias#getValues <em>Values</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.TableOrAlias#getPivot <em>Pivot</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.TableOrAlias#getUnpivot <em>Unpivot</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.TableOrAlias#getAlias <em>Alias</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.TableOrAlias#getTblAlias <em>Tbl Alias</em>}</li>
 * </ul>
 *
 * @see com.jaspersoft.studio.data.sql.SqlPackage#getTableOrAlias()
 * @model
 * @generated
 */
public interface TableOrAlias extends EObject
{
  /**
   * Returns the value of the '<em><b>Tfull</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tfull</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tfull</em>' containment reference.
   * @see #setTfull(TableFull)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getTableOrAlias_Tfull()
   * @model containment="true"
   * @generated
   */
  TableFull getTfull();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.TableOrAlias#getTfull <em>Tfull</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tfull</em>' containment reference.
   * @see #getTfull()
   * @generated
   */
  void setTfull(TableFull value);

  /**
   * Returns the value of the '<em><b>Sq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sq</em>' containment reference.
   * @see #setSq(SubQueryOperand)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getTableOrAlias_Sq()
   * @model containment="true"
   * @generated
   */
  SubQueryOperand getSq();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.TableOrAlias#getSq <em>Sq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sq</em>' containment reference.
   * @see #getSq()
   * @generated
   */
  void setSq(SubQueryOperand value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference.
   * @see #setValues(FromValues)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getTableOrAlias_Values()
   * @model containment="true"
   * @generated
   */
  FromValues getValues();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.TableOrAlias#getValues <em>Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Values</em>' containment reference.
   * @see #getValues()
   * @generated
   */
  void setValues(FromValues value);

  /**
   * Returns the value of the '<em><b>Pivot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pivot</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pivot</em>' containment reference.
   * @see #setPivot(PivotTable)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getTableOrAlias_Pivot()
   * @model containment="true"
   * @generated
   */
  PivotTable getPivot();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.TableOrAlias#getPivot <em>Pivot</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pivot</em>' containment reference.
   * @see #getPivot()
   * @generated
   */
  void setPivot(PivotTable value);

  /**
   * Returns the value of the '<em><b>Unpivot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unpivot</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unpivot</em>' containment reference.
   * @see #setUnpivot(UnpivotTable)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getTableOrAlias_Unpivot()
   * @model containment="true"
   * @generated
   */
  UnpivotTable getUnpivot();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.TableOrAlias#getUnpivot <em>Unpivot</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unpivot</em>' containment reference.
   * @see #getUnpivot()
   * @generated
   */
  void setUnpivot(UnpivotTable value);

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
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getTableOrAlias_Alias()
   * @model
   * @generated
   */
  String getAlias();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.TableOrAlias#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #getAlias()
   * @generated
   */
  void setAlias(String value);

  /**
   * Returns the value of the '<em><b>Tbl Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tbl Alias</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tbl Alias</em>' containment reference.
   * @see #setTblAlias(DbObjectName)
   * @see com.jaspersoft.studio.data.sql.SqlPackage#getTableOrAlias_TblAlias()
   * @model containment="true"
   * @generated
   */
  DbObjectName getTblAlias();

  /**
   * Sets the value of the '{@link com.jaspersoft.studio.data.sql.TableOrAlias#getTblAlias <em>Tbl Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tbl Alias</em>' containment reference.
   * @see #getTblAlias()
   * @generated
   */
  void setTblAlias(DbObjectName value);

} // TableOrAlias
