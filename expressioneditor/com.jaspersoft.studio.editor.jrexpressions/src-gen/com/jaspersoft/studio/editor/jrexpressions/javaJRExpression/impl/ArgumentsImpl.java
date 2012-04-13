/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ExpressionList;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arguments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArgumentsImpl#getLeftP <em>Left P</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArgumentsImpl#getExprLst <em>Expr Lst</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArgumentsImpl#getRightP <em>Right P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentsImpl extends MinimalEObjectImpl.Container implements Arguments
{
  /**
   * The default value of the '{@link #getLeftP() <em>Left P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftP()
   * @generated
   * @ordered
   */
  protected static final String LEFT_P_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeftP() <em>Left P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftP()
   * @generated
   * @ordered
   */
  protected String leftP = LEFT_P_EDEFAULT;

  /**
   * The cached value of the '{@link #getExprLst() <em>Expr Lst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprLst()
   * @generated
   * @ordered
   */
  protected ExpressionList exprLst;

  /**
   * The default value of the '{@link #getRightP() <em>Right P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightP()
   * @generated
   * @ordered
   */
  protected static final String RIGHT_P_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRightP() <em>Right P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightP()
   * @generated
   * @ordered
   */
  protected String rightP = RIGHT_P_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArgumentsImpl()
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
    return JavaJRExpressionPackage.Literals.ARGUMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLeftP()
  {
    return leftP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftP(String newLeftP)
  {
    String oldLeftP = leftP;
    leftP = newLeftP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.ARGUMENTS__LEFT_P, oldLeftP, leftP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList getExprLst()
  {
    return exprLst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprLst(ExpressionList newExprLst, NotificationChain msgs)
  {
    ExpressionList oldExprLst = exprLst;
    exprLst = newExprLst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.ARGUMENTS__EXPR_LST, oldExprLst, newExprLst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprLst(ExpressionList newExprLst)
  {
    if (newExprLst != exprLst)
    {
      NotificationChain msgs = null;
      if (exprLst != null)
        msgs = ((InternalEObject)exprLst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.ARGUMENTS__EXPR_LST, null, msgs);
      if (newExprLst != null)
        msgs = ((InternalEObject)newExprLst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.ARGUMENTS__EXPR_LST, null, msgs);
      msgs = basicSetExprLst(newExprLst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.ARGUMENTS__EXPR_LST, newExprLst, newExprLst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRightP()
  {
    return rightP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightP(String newRightP)
  {
    String oldRightP = rightP;
    rightP = newRightP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.ARGUMENTS__RIGHT_P, oldRightP, rightP));
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
      case JavaJRExpressionPackage.ARGUMENTS__EXPR_LST:
        return basicSetExprLst(null, msgs);
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
      case JavaJRExpressionPackage.ARGUMENTS__LEFT_P:
        return getLeftP();
      case JavaJRExpressionPackage.ARGUMENTS__EXPR_LST:
        return getExprLst();
      case JavaJRExpressionPackage.ARGUMENTS__RIGHT_P:
        return getRightP();
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
      case JavaJRExpressionPackage.ARGUMENTS__LEFT_P:
        setLeftP((String)newValue);
        return;
      case JavaJRExpressionPackage.ARGUMENTS__EXPR_LST:
        setExprLst((ExpressionList)newValue);
        return;
      case JavaJRExpressionPackage.ARGUMENTS__RIGHT_P:
        setRightP((String)newValue);
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
      case JavaJRExpressionPackage.ARGUMENTS__LEFT_P:
        setLeftP(LEFT_P_EDEFAULT);
        return;
      case JavaJRExpressionPackage.ARGUMENTS__EXPR_LST:
        setExprLst((ExpressionList)null);
        return;
      case JavaJRExpressionPackage.ARGUMENTS__RIGHT_P:
        setRightP(RIGHT_P_EDEFAULT);
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
      case JavaJRExpressionPackage.ARGUMENTS__LEFT_P:
        return LEFT_P_EDEFAULT == null ? leftP != null : !LEFT_P_EDEFAULT.equals(leftP);
      case JavaJRExpressionPackage.ARGUMENTS__EXPR_LST:
        return exprLst != null;
      case JavaJRExpressionPackage.ARGUMENTS__RIGHT_P:
        return RIGHT_P_EDEFAULT == null ? rightP != null : !RIGHT_P_EDEFAULT.equals(rightP);
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
    result.append(" (leftP: ");
    result.append(leftP);
    result.append(", rightP: ");
    result.append(rightP);
    result.append(')');
    return result.toString();
  }

} //ArgumentsImpl
