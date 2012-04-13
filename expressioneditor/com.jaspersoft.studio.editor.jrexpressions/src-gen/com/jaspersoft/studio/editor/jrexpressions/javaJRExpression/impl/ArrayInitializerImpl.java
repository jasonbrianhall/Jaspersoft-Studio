/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayInitializer;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayInitializerImpl#getFirstEl <em>First El</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayInitializerImpl#getOtherEls <em>Other Els</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayInitializerImpl extends MinimalEObjectImpl.Container implements ArrayInitializer
{
  /**
   * The cached value of the '{@link #getFirstEl() <em>First El</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstEl()
   * @generated
   * @ordered
   */
  protected Expression firstEl;

  /**
   * The cached value of the '{@link #getOtherEls() <em>Other Els</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherEls()
   * @generated
   * @ordered
   */
  protected EList<Expression> otherEls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayInitializerImpl()
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
    return JavaJRExpressionPackage.Literals.ARRAY_INITIALIZER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getFirstEl()
  {
    return firstEl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstEl(Expression newFirstEl, NotificationChain msgs)
  {
    Expression oldFirstEl = firstEl;
    firstEl = newFirstEl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.ARRAY_INITIALIZER__FIRST_EL, oldFirstEl, newFirstEl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstEl(Expression newFirstEl)
  {
    if (newFirstEl != firstEl)
    {
      NotificationChain msgs = null;
      if (firstEl != null)
        msgs = ((InternalEObject)firstEl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.ARRAY_INITIALIZER__FIRST_EL, null, msgs);
      if (newFirstEl != null)
        msgs = ((InternalEObject)newFirstEl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.ARRAY_INITIALIZER__FIRST_EL, null, msgs);
      msgs = basicSetFirstEl(newFirstEl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.ARRAY_INITIALIZER__FIRST_EL, newFirstEl, newFirstEl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getOtherEls()
  {
    if (otherEls == null)
    {
      otherEls = new EObjectContainmentEList<Expression>(Expression.class, this, JavaJRExpressionPackage.ARRAY_INITIALIZER__OTHER_ELS);
    }
    return otherEls;
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
      case JavaJRExpressionPackage.ARRAY_INITIALIZER__FIRST_EL:
        return basicSetFirstEl(null, msgs);
      case JavaJRExpressionPackage.ARRAY_INITIALIZER__OTHER_ELS:
        return ((InternalEList<?>)getOtherEls()).basicRemove(otherEnd, msgs);
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
      case JavaJRExpressionPackage.ARRAY_INITIALIZER__FIRST_EL:
        return getFirstEl();
      case JavaJRExpressionPackage.ARRAY_INITIALIZER__OTHER_ELS:
        return getOtherEls();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JavaJRExpressionPackage.ARRAY_INITIALIZER__FIRST_EL:
        setFirstEl((Expression)newValue);
        return;
      case JavaJRExpressionPackage.ARRAY_INITIALIZER__OTHER_ELS:
        getOtherEls().clear();
        getOtherEls().addAll((Collection<? extends Expression>)newValue);
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
      case JavaJRExpressionPackage.ARRAY_INITIALIZER__FIRST_EL:
        setFirstEl((Expression)null);
        return;
      case JavaJRExpressionPackage.ARRAY_INITIALIZER__OTHER_ELS:
        getOtherEls().clear();
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
      case JavaJRExpressionPackage.ARRAY_INITIALIZER__FIRST_EL:
        return firstEl != null;
      case JavaJRExpressionPackage.ARRAY_INITIALIZER__OTHER_ELS:
        return otherEls != null && !otherEls.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArrayInitializerImpl
