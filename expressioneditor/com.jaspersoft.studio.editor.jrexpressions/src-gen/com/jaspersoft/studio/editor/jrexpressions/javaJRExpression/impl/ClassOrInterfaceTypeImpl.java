/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassOrInterfaceType;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.QualifiedName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Or Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ClassOrInterfaceTypeImpl#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassOrInterfaceTypeImpl extends MinimalEObjectImpl.Container implements ClassOrInterfaceType
{
  /**
   * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedName()
   * @generated
   * @ordered
   */
  protected QualifiedName qualifiedName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassOrInterfaceTypeImpl()
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
    return JavaJRExpressionPackage.Literals.CLASS_OR_INTERFACE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedName getQualifiedName()
  {
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQualifiedName(QualifiedName newQualifiedName, NotificationChain msgs)
  {
    QualifiedName oldQualifiedName = qualifiedName;
    qualifiedName = newQualifiedName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.CLASS_OR_INTERFACE_TYPE__QUALIFIED_NAME, oldQualifiedName, newQualifiedName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifiedName(QualifiedName newQualifiedName)
  {
    if (newQualifiedName != qualifiedName)
    {
      NotificationChain msgs = null;
      if (qualifiedName != null)
        msgs = ((InternalEObject)qualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.CLASS_OR_INTERFACE_TYPE__QUALIFIED_NAME, null, msgs);
      if (newQualifiedName != null)
        msgs = ((InternalEObject)newQualifiedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.CLASS_OR_INTERFACE_TYPE__QUALIFIED_NAME, null, msgs);
      msgs = basicSetQualifiedName(newQualifiedName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.CLASS_OR_INTERFACE_TYPE__QUALIFIED_NAME, newQualifiedName, newQualifiedName));
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
      case JavaJRExpressionPackage.CLASS_OR_INTERFACE_TYPE__QUALIFIED_NAME:
        return basicSetQualifiedName(null, msgs);
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
      case JavaJRExpressionPackage.CLASS_OR_INTERFACE_TYPE__QUALIFIED_NAME:
        return getQualifiedName();
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
      case JavaJRExpressionPackage.CLASS_OR_INTERFACE_TYPE__QUALIFIED_NAME:
        setQualifiedName((QualifiedName)newValue);
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
      case JavaJRExpressionPackage.CLASS_OR_INTERFACE_TYPE__QUALIFIED_NAME:
        setQualifiedName((QualifiedName)null);
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
      case JavaJRExpressionPackage.CLASS_OR_INTERFACE_TYPE__QUALIFIED_NAME:
        return qualifiedName != null;
    }
    return super.eIsSet(featureID);
  }

} //ClassOrInterfaceTypeImpl
