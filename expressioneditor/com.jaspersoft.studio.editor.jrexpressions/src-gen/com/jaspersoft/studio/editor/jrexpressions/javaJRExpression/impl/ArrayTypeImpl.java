/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayType;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassOrInterfaceType;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayTypeImpl#getClazzInterf <em>Clazz Interf</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayTypeImpl#getPrimtype <em>Primtype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayTypeImpl extends MinimalEObjectImpl.Container implements ArrayType
{
  /**
   * The cached value of the '{@link #getClazzInterf() <em>Clazz Interf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClazzInterf()
   * @generated
   * @ordered
   */
  protected ClassOrInterfaceType clazzInterf;

  /**
   * The default value of the '{@link #getPrimtype() <em>Primtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimtype()
   * @generated
   * @ordered
   */
  protected static final String PRIMTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimtype() <em>Primtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimtype()
   * @generated
   * @ordered
   */
  protected String primtype = PRIMTYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayTypeImpl()
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
    return JavaJRExpressionPackage.Literals.ARRAY_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassOrInterfaceType getClazzInterf()
  {
    return clazzInterf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClazzInterf(ClassOrInterfaceType newClazzInterf, NotificationChain msgs)
  {
    ClassOrInterfaceType oldClazzInterf = clazzInterf;
    clazzInterf = newClazzInterf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.ARRAY_TYPE__CLAZZ_INTERF, oldClazzInterf, newClazzInterf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClazzInterf(ClassOrInterfaceType newClazzInterf)
  {
    if (newClazzInterf != clazzInterf)
    {
      NotificationChain msgs = null;
      if (clazzInterf != null)
        msgs = ((InternalEObject)clazzInterf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.ARRAY_TYPE__CLAZZ_INTERF, null, msgs);
      if (newClazzInterf != null)
        msgs = ((InternalEObject)newClazzInterf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.ARRAY_TYPE__CLAZZ_INTERF, null, msgs);
      msgs = basicSetClazzInterf(newClazzInterf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.ARRAY_TYPE__CLAZZ_INTERF, newClazzInterf, newClazzInterf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrimtype()
  {
    return primtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimtype(String newPrimtype)
  {
    String oldPrimtype = primtype;
    primtype = newPrimtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.ARRAY_TYPE__PRIMTYPE, oldPrimtype, primtype));
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
      case JavaJRExpressionPackage.ARRAY_TYPE__CLAZZ_INTERF:
        return basicSetClazzInterf(null, msgs);
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
      case JavaJRExpressionPackage.ARRAY_TYPE__CLAZZ_INTERF:
        return getClazzInterf();
      case JavaJRExpressionPackage.ARRAY_TYPE__PRIMTYPE:
        return getPrimtype();
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
      case JavaJRExpressionPackage.ARRAY_TYPE__CLAZZ_INTERF:
        setClazzInterf((ClassOrInterfaceType)newValue);
        return;
      case JavaJRExpressionPackage.ARRAY_TYPE__PRIMTYPE:
        setPrimtype((String)newValue);
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
      case JavaJRExpressionPackage.ARRAY_TYPE__CLAZZ_INTERF:
        setClazzInterf((ClassOrInterfaceType)null);
        return;
      case JavaJRExpressionPackage.ARRAY_TYPE__PRIMTYPE:
        setPrimtype(PRIMTYPE_EDEFAULT);
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
      case JavaJRExpressionPackage.ARRAY_TYPE__CLAZZ_INTERF:
        return clazzInterf != null;
      case JavaJRExpressionPackage.ARRAY_TYPE__PRIMTYPE:
        return PRIMTYPE_EDEFAULT == null ? primtype != null : !PRIMTYPE_EDEFAULT.equals(primtype);
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
    result.append(" (primtype: ");
    result.append(primtype);
    result.append(')');
    return result.toString();
  }

} //ArrayTypeImpl
