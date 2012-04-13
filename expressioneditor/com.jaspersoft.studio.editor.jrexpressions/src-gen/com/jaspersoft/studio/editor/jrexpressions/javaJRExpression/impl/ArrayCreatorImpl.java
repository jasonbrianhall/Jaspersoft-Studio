/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayCreator;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayInitializer;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayType;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Creator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayCreatorImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayCreatorImpl#getArrayInitializer <em>Array Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayCreatorImpl extends CreatorImpl implements ArrayCreator
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ArrayType type;

  /**
   * The cached value of the '{@link #getArrayInitializer() <em>Array Initializer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayInitializer()
   * @generated
   * @ordered
   */
  protected ArrayInitializer arrayInitializer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayCreatorImpl()
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
    return JavaJRExpressionPackage.Literals.ARRAY_CREATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(ArrayType newType, NotificationChain msgs)
  {
    ArrayType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.ARRAY_CREATOR__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ArrayType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.ARRAY_CREATOR__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.ARRAY_CREATOR__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.ARRAY_CREATOR__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayInitializer getArrayInitializer()
  {
    return arrayInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayInitializer(ArrayInitializer newArrayInitializer, NotificationChain msgs)
  {
    ArrayInitializer oldArrayInitializer = arrayInitializer;
    arrayInitializer = newArrayInitializer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.ARRAY_CREATOR__ARRAY_INITIALIZER, oldArrayInitializer, newArrayInitializer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayInitializer(ArrayInitializer newArrayInitializer)
  {
    if (newArrayInitializer != arrayInitializer)
    {
      NotificationChain msgs = null;
      if (arrayInitializer != null)
        msgs = ((InternalEObject)arrayInitializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.ARRAY_CREATOR__ARRAY_INITIALIZER, null, msgs);
      if (newArrayInitializer != null)
        msgs = ((InternalEObject)newArrayInitializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.ARRAY_CREATOR__ARRAY_INITIALIZER, null, msgs);
      msgs = basicSetArrayInitializer(newArrayInitializer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.ARRAY_CREATOR__ARRAY_INITIALIZER, newArrayInitializer, newArrayInitializer));
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
      case JavaJRExpressionPackage.ARRAY_CREATOR__TYPE:
        return basicSetType(null, msgs);
      case JavaJRExpressionPackage.ARRAY_CREATOR__ARRAY_INITIALIZER:
        return basicSetArrayInitializer(null, msgs);
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
      case JavaJRExpressionPackage.ARRAY_CREATOR__TYPE:
        return getType();
      case JavaJRExpressionPackage.ARRAY_CREATOR__ARRAY_INITIALIZER:
        return getArrayInitializer();
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
      case JavaJRExpressionPackage.ARRAY_CREATOR__TYPE:
        setType((ArrayType)newValue);
        return;
      case JavaJRExpressionPackage.ARRAY_CREATOR__ARRAY_INITIALIZER:
        setArrayInitializer((ArrayInitializer)newValue);
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
      case JavaJRExpressionPackage.ARRAY_CREATOR__TYPE:
        setType((ArrayType)null);
        return;
      case JavaJRExpressionPackage.ARRAY_CREATOR__ARRAY_INITIALIZER:
        setArrayInitializer((ArrayInitializer)null);
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
      case JavaJRExpressionPackage.ARRAY_CREATOR__TYPE:
        return type != null;
      case JavaJRExpressionPackage.ARRAY_CREATOR__ARRAY_INITIALIZER:
        return arrayInitializer != null;
    }
    return super.eIsSet(featureID);
  }

} //ArrayCreatorImpl
