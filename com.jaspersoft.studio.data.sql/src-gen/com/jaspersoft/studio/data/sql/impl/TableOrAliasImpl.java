/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
/**
 */
package com.jaspersoft.studio.data.sql.impl;

import com.jaspersoft.studio.data.sql.DbObjectName;
import com.jaspersoft.studio.data.sql.FromValues;
import com.jaspersoft.studio.data.sql.PivotTable;
import com.jaspersoft.studio.data.sql.SqlPackage;
import com.jaspersoft.studio.data.sql.SubQueryOperand;
import com.jaspersoft.studio.data.sql.TableFull;
import com.jaspersoft.studio.data.sql.TableOrAlias;
import com.jaspersoft.studio.data.sql.UnpivotTable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Or Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.impl.TableOrAliasImpl#getTfull <em>Tfull</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.impl.TableOrAliasImpl#getSq <em>Sq</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.impl.TableOrAliasImpl#getValues <em>Values</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.impl.TableOrAliasImpl#getPivot <em>Pivot</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.impl.TableOrAliasImpl#getUnpivot <em>Unpivot</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.impl.TableOrAliasImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.impl.TableOrAliasImpl#getTblAlias <em>Tbl Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableOrAliasImpl extends MinimalEObjectImpl.Container implements TableOrAlias
{
  /**
   * The cached value of the '{@link #getTfull() <em>Tfull</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTfull()
   * @generated
   * @ordered
   */
  protected TableFull tfull;

  /**
   * The cached value of the '{@link #getSq() <em>Sq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSq()
   * @generated
   * @ordered
   */
  protected SubQueryOperand sq;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected FromValues values;

  /**
   * The cached value of the '{@link #getPivot() <em>Pivot</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPivot()
   * @generated
   * @ordered
   */
  protected PivotTable pivot;

  /**
   * The cached value of the '{@link #getUnpivot() <em>Unpivot</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnpivot()
   * @generated
   * @ordered
   */
  protected UnpivotTable unpivot;

  /**
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

  /**
   * The cached value of the '{@link #getTblAlias() <em>Tbl Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTblAlias()
   * @generated
   * @ordered
   */
  protected DbObjectName tblAlias;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableOrAliasImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SqlPackage.Literals.TABLE_OR_ALIAS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableFull getTfull()
  {
    return tfull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTfull(TableFull newTfull, NotificationChain msgs)
  {
    TableFull oldTfull = tfull;
    tfull = newTfull;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE_OR_ALIAS__TFULL, oldTfull, newTfull);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTfull(TableFull newTfull)
  {
    if (newTfull != tfull)
    {
      NotificationChain msgs = null;
      if (tfull != null)
        msgs = ((InternalEObject)tfull).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.TABLE_OR_ALIAS__TFULL, null, msgs);
      if (newTfull != null)
        msgs = ((InternalEObject)newTfull).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.TABLE_OR_ALIAS__TFULL, null, msgs);
      msgs = basicSetTfull(newTfull, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE_OR_ALIAS__TFULL, newTfull, newTfull));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubQueryOperand getSq()
  {
    return sq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSq(SubQueryOperand newSq, NotificationChain msgs)
  {
    SubQueryOperand oldSq = sq;
    sq = newSq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE_OR_ALIAS__SQ, oldSq, newSq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSq(SubQueryOperand newSq)
  {
    if (newSq != sq)
    {
      NotificationChain msgs = null;
      if (sq != null)
        msgs = ((InternalEObject)sq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.TABLE_OR_ALIAS__SQ, null, msgs);
      if (newSq != null)
        msgs = ((InternalEObject)newSq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.TABLE_OR_ALIAS__SQ, null, msgs);
      msgs = basicSetSq(newSq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE_OR_ALIAS__SQ, newSq, newSq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromValues getValues()
  {
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValues(FromValues newValues, NotificationChain msgs)
  {
    FromValues oldValues = values;
    values = newValues;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE_OR_ALIAS__VALUES, oldValues, newValues);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValues(FromValues newValues)
  {
    if (newValues != values)
    {
      NotificationChain msgs = null;
      if (values != null)
        msgs = ((InternalEObject)values).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.TABLE_OR_ALIAS__VALUES, null, msgs);
      if (newValues != null)
        msgs = ((InternalEObject)newValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.TABLE_OR_ALIAS__VALUES, null, msgs);
      msgs = basicSetValues(newValues, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE_OR_ALIAS__VALUES, newValues, newValues));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PivotTable getPivot()
  {
    return pivot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPivot(PivotTable newPivot, NotificationChain msgs)
  {
    PivotTable oldPivot = pivot;
    pivot = newPivot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE_OR_ALIAS__PIVOT, oldPivot, newPivot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPivot(PivotTable newPivot)
  {
    if (newPivot != pivot)
    {
      NotificationChain msgs = null;
      if (pivot != null)
        msgs = ((InternalEObject)pivot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.TABLE_OR_ALIAS__PIVOT, null, msgs);
      if (newPivot != null)
        msgs = ((InternalEObject)newPivot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.TABLE_OR_ALIAS__PIVOT, null, msgs);
      msgs = basicSetPivot(newPivot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE_OR_ALIAS__PIVOT, newPivot, newPivot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnpivotTable getUnpivot()
  {
    return unpivot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnpivot(UnpivotTable newUnpivot, NotificationChain msgs)
  {
    UnpivotTable oldUnpivot = unpivot;
    unpivot = newUnpivot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE_OR_ALIAS__UNPIVOT, oldUnpivot, newUnpivot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnpivot(UnpivotTable newUnpivot)
  {
    if (newUnpivot != unpivot)
    {
      NotificationChain msgs = null;
      if (unpivot != null)
        msgs = ((InternalEObject)unpivot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.TABLE_OR_ALIAS__UNPIVOT, null, msgs);
      if (newUnpivot != null)
        msgs = ((InternalEObject)newUnpivot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.TABLE_OR_ALIAS__UNPIVOT, null, msgs);
      msgs = basicSetUnpivot(newUnpivot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE_OR_ALIAS__UNPIVOT, newUnpivot, newUnpivot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE_OR_ALIAS__ALIAS, oldAlias, alias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbObjectName getTblAlias()
  {
    return tblAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTblAlias(DbObjectName newTblAlias, NotificationChain msgs)
  {
    DbObjectName oldTblAlias = tblAlias;
    tblAlias = newTblAlias;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE_OR_ALIAS__TBL_ALIAS, oldTblAlias, newTblAlias);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTblAlias(DbObjectName newTblAlias)
  {
    if (newTblAlias != tblAlias)
    {
      NotificationChain msgs = null;
      if (tblAlias != null)
        msgs = ((InternalEObject)tblAlias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.TABLE_OR_ALIAS__TBL_ALIAS, null, msgs);
      if (newTblAlias != null)
        msgs = ((InternalEObject)newTblAlias).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.TABLE_OR_ALIAS__TBL_ALIAS, null, msgs);
      msgs = basicSetTblAlias(newTblAlias, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.TABLE_OR_ALIAS__TBL_ALIAS, newTblAlias, newTblAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SqlPackage.TABLE_OR_ALIAS__TFULL:
        return basicSetTfull(null, msgs);
      case SqlPackage.TABLE_OR_ALIAS__SQ:
        return basicSetSq(null, msgs);
      case SqlPackage.TABLE_OR_ALIAS__VALUES:
        return basicSetValues(null, msgs);
      case SqlPackage.TABLE_OR_ALIAS__PIVOT:
        return basicSetPivot(null, msgs);
      case SqlPackage.TABLE_OR_ALIAS__UNPIVOT:
        return basicSetUnpivot(null, msgs);
      case SqlPackage.TABLE_OR_ALIAS__TBL_ALIAS:
        return basicSetTblAlias(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SqlPackage.TABLE_OR_ALIAS__TFULL:
        return getTfull();
      case SqlPackage.TABLE_OR_ALIAS__SQ:
        return getSq();
      case SqlPackage.TABLE_OR_ALIAS__VALUES:
        return getValues();
      case SqlPackage.TABLE_OR_ALIAS__PIVOT:
        return getPivot();
      case SqlPackage.TABLE_OR_ALIAS__UNPIVOT:
        return getUnpivot();
      case SqlPackage.TABLE_OR_ALIAS__ALIAS:
        return getAlias();
      case SqlPackage.TABLE_OR_ALIAS__TBL_ALIAS:
        return getTblAlias();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SqlPackage.TABLE_OR_ALIAS__TFULL:
        setTfull((TableFull)newValue);
        return;
      case SqlPackage.TABLE_OR_ALIAS__SQ:
        setSq((SubQueryOperand)newValue);
        return;
      case SqlPackage.TABLE_OR_ALIAS__VALUES:
        setValues((FromValues)newValue);
        return;
      case SqlPackage.TABLE_OR_ALIAS__PIVOT:
        setPivot((PivotTable)newValue);
        return;
      case SqlPackage.TABLE_OR_ALIAS__UNPIVOT:
        setUnpivot((UnpivotTable)newValue);
        return;
      case SqlPackage.TABLE_OR_ALIAS__ALIAS:
        setAlias((String)newValue);
        return;
      case SqlPackage.TABLE_OR_ALIAS__TBL_ALIAS:
        setTblAlias((DbObjectName)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SqlPackage.TABLE_OR_ALIAS__TFULL:
        setTfull((TableFull)null);
        return;
      case SqlPackage.TABLE_OR_ALIAS__SQ:
        setSq((SubQueryOperand)null);
        return;
      case SqlPackage.TABLE_OR_ALIAS__VALUES:
        setValues((FromValues)null);
        return;
      case SqlPackage.TABLE_OR_ALIAS__PIVOT:
        setPivot((PivotTable)null);
        return;
      case SqlPackage.TABLE_OR_ALIAS__UNPIVOT:
        setUnpivot((UnpivotTable)null);
        return;
      case SqlPackage.TABLE_OR_ALIAS__ALIAS:
        setAlias(ALIAS_EDEFAULT);
        return;
      case SqlPackage.TABLE_OR_ALIAS__TBL_ALIAS:
        setTblAlias((DbObjectName)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SqlPackage.TABLE_OR_ALIAS__TFULL:
        return tfull != null;
      case SqlPackage.TABLE_OR_ALIAS__SQ:
        return sq != null;
      case SqlPackage.TABLE_OR_ALIAS__VALUES:
        return values != null;
      case SqlPackage.TABLE_OR_ALIAS__PIVOT:
        return pivot != null;
      case SqlPackage.TABLE_OR_ALIAS__UNPIVOT:
        return unpivot != null;
      case SqlPackage.TABLE_OR_ALIAS__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
      case SqlPackage.TABLE_OR_ALIAS__TBL_ALIAS:
        return tblAlias != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (alias: ");
    result.append(alias);
    result.append(')');
    return result.toString();
  }

} //TableOrAliasImpl
