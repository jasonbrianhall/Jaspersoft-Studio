/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassCreator;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassOrInterfaceType;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Creator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ClassCreatorImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ClassCreatorImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassCreatorImpl extends CreatorImpl implements ClassCreator
{
  /**
   * The cached value of the '{@link #getClazz() <em>Clazz</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClazz()
   * @generated
   * @ordered
   */
  protected ClassOrInterfaceType clazz;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected Arguments args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassCreatorImpl()
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
    return JavaJRExpressionPackage.Literals.CLASS_CREATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassOrInterfaceType getClazz()
  {
    return clazz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClazz(ClassOrInterfaceType newClazz, NotificationChain msgs)
  {
    ClassOrInterfaceType oldClazz = clazz;
    clazz = newClazz;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.CLASS_CREATOR__CLAZZ, oldClazz, newClazz);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClazz(ClassOrInterfaceType newClazz)
  {
    if (newClazz != clazz)
    {
      NotificationChain msgs = null;
      if (clazz != null)
        msgs = ((InternalEObject)clazz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.CLASS_CREATOR__CLAZZ, null, msgs);
      if (newClazz != null)
        msgs = ((InternalEObject)newClazz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.CLASS_CREATOR__CLAZZ, null, msgs);
      msgs = basicSetClazz(newClazz, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.CLASS_CREATOR__CLAZZ, newClazz, newClazz));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arguments getArgs()
  {
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgs(Arguments newArgs, NotificationChain msgs)
  {
    Arguments oldArgs = args;
    args = newArgs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.CLASS_CREATOR__ARGS, oldArgs, newArgs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgs(Arguments newArgs)
  {
    if (newArgs != args)
    {
      NotificationChain msgs = null;
      if (args != null)
        msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.CLASS_CREATOR__ARGS, null, msgs);
      if (newArgs != null)
        msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.CLASS_CREATOR__ARGS, null, msgs);
      msgs = basicSetArgs(newArgs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.CLASS_CREATOR__ARGS, newArgs, newArgs));
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
      case JavaJRExpressionPackage.CLASS_CREATOR__CLAZZ:
        return basicSetClazz(null, msgs);
      case JavaJRExpressionPackage.CLASS_CREATOR__ARGS:
        return basicSetArgs(null, msgs);
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
      case JavaJRExpressionPackage.CLASS_CREATOR__CLAZZ:
        return getClazz();
      case JavaJRExpressionPackage.CLASS_CREATOR__ARGS:
        return getArgs();
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
      case JavaJRExpressionPackage.CLASS_CREATOR__CLAZZ:
        setClazz((ClassOrInterfaceType)newValue);
        return;
      case JavaJRExpressionPackage.CLASS_CREATOR__ARGS:
        setArgs((Arguments)newValue);
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
      case JavaJRExpressionPackage.CLASS_CREATOR__CLAZZ:
        setClazz((ClassOrInterfaceType)null);
        return;
      case JavaJRExpressionPackage.CLASS_CREATOR__ARGS:
        setArgs((Arguments)null);
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
      case JavaJRExpressionPackage.CLASS_CREATOR__CLAZZ:
        return clazz != null;
      case JavaJRExpressionPackage.CLASS_CREATOR__ARGS:
        return args != null;
    }
    return super.eIsSet(featureID);
  }

} //ClassCreatorImpl
