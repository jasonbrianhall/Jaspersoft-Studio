/**
 */
package com.jaspersoft.studio.data.sql.impl;

import com.jaspersoft.studio.data.sql.Like;
import com.jaspersoft.studio.data.sql.SqlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Like</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.data.sql.impl.LikeImpl#getOpLike <em>Op Like</em>}</li>
 *   <li>{@link com.jaspersoft.studio.data.sql.impl.LikeImpl#getOp2 <em>Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LikeImpl extends MinimalEObjectImpl.Container implements Like
{
  /**
   * The default value of the '{@link #getOpLike() <em>Op Like</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpLike()
   * @generated
   * @ordered
   */
  protected static final String OP_LIKE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpLike() <em>Op Like</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpLike()
   * @generated
   * @ordered
   */
  protected String opLike = OP_LIKE_EDEFAULT;

  /**
   * The default value of the '{@link #getOp2() <em>Op2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp2()
   * @generated
   * @ordered
   */
  protected static final String OP2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp2() <em>Op2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp2()
   * @generated
   * @ordered
   */
  protected String op2 = OP2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LikeImpl()
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
    return SqlPackage.Literals.LIKE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpLike()
  {
    return opLike;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpLike(String newOpLike)
  {
    String oldOpLike = opLike;
    opLike = newOpLike;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.LIKE__OP_LIKE, oldOpLike, opLike));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp2()
  {
    return op2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp2(String newOp2)
  {
    String oldOp2 = op2;
    op2 = newOp2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.LIKE__OP2, oldOp2, op2));
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
      case SqlPackage.LIKE__OP_LIKE:
        return getOpLike();
      case SqlPackage.LIKE__OP2:
        return getOp2();
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
      case SqlPackage.LIKE__OP_LIKE:
        setOpLike((String)newValue);
        return;
      case SqlPackage.LIKE__OP2:
        setOp2((String)newValue);
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
      case SqlPackage.LIKE__OP_LIKE:
        setOpLike(OP_LIKE_EDEFAULT);
        return;
      case SqlPackage.LIKE__OP2:
        setOp2(OP2_EDEFAULT);
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
      case SqlPackage.LIKE__OP_LIKE:
        return OP_LIKE_EDEFAULT == null ? opLike != null : !OP_LIKE_EDEFAULT.equals(opLike);
      case SqlPackage.LIKE__OP2:
        return OP2_EDEFAULT == null ? op2 != null : !OP2_EDEFAULT.equals(op2);
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
    result.append(" (opLike: ");
    result.append(opLike);
    result.append(", op2: ");
    result.append(op2);
    result.append(')');
    return result.toString();
  }

} //LikeImpl
