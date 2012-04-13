/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayType;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassOrInterfaceType;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.CastImpl#getLpar <em>Lpar</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.CastImpl#getPtype <em>Ptype</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.CastImpl#getArrtype <em>Arrtype</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.CastImpl#getClazztype <em>Clazztype</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.CastImpl#getRpar <em>Rpar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CastImpl extends ExpressionImpl implements Cast
{
  /**
   * The default value of the '{@link #getLpar() <em>Lpar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLpar()
   * @generated
   * @ordered
   */
  protected static final String LPAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLpar() <em>Lpar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLpar()
   * @generated
   * @ordered
   */
  protected String lpar = LPAR_EDEFAULT;

  /**
   * The default value of the '{@link #getPtype() <em>Ptype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPtype()
   * @generated
   * @ordered
   */
  protected static final String PTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPtype() <em>Ptype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPtype()
   * @generated
   * @ordered
   */
  protected String ptype = PTYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getArrtype() <em>Arrtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrtype()
   * @generated
   * @ordered
   */
  protected ArrayType arrtype;

  /**
   * The cached value of the '{@link #getClazztype() <em>Clazztype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClazztype()
   * @generated
   * @ordered
   */
  protected ClassOrInterfaceType clazztype;

  /**
   * The default value of the '{@link #getRpar() <em>Rpar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRpar()
   * @generated
   * @ordered
   */
  protected static final String RPAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRpar() <em>Rpar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRpar()
   * @generated
   * @ordered
   */
  protected String rpar = RPAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CastImpl()
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
    return JavaJRExpressionPackage.Literals.CAST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLpar()
  {
    return lpar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLpar(String newLpar)
  {
    String oldLpar = lpar;
    lpar = newLpar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.CAST__LPAR, oldLpar, lpar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPtype()
  {
    return ptype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPtype(String newPtype)
  {
    String oldPtype = ptype;
    ptype = newPtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.CAST__PTYPE, oldPtype, ptype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType getArrtype()
  {
    return arrtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrtype(ArrayType newArrtype, NotificationChain msgs)
  {
    ArrayType oldArrtype = arrtype;
    arrtype = newArrtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.CAST__ARRTYPE, oldArrtype, newArrtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrtype(ArrayType newArrtype)
  {
    if (newArrtype != arrtype)
    {
      NotificationChain msgs = null;
      if (arrtype != null)
        msgs = ((InternalEObject)arrtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.CAST__ARRTYPE, null, msgs);
      if (newArrtype != null)
        msgs = ((InternalEObject)newArrtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.CAST__ARRTYPE, null, msgs);
      msgs = basicSetArrtype(newArrtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.CAST__ARRTYPE, newArrtype, newArrtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassOrInterfaceType getClazztype()
  {
    return clazztype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClazztype(ClassOrInterfaceType newClazztype, NotificationChain msgs)
  {
    ClassOrInterfaceType oldClazztype = clazztype;
    clazztype = newClazztype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.CAST__CLAZZTYPE, oldClazztype, newClazztype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClazztype(ClassOrInterfaceType newClazztype)
  {
    if (newClazztype != clazztype)
    {
      NotificationChain msgs = null;
      if (clazztype != null)
        msgs = ((InternalEObject)clazztype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.CAST__CLAZZTYPE, null, msgs);
      if (newClazztype != null)
        msgs = ((InternalEObject)newClazztype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.CAST__CLAZZTYPE, null, msgs);
      msgs = basicSetClazztype(newClazztype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.CAST__CLAZZTYPE, newClazztype, newClazztype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRpar()
  {
    return rpar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRpar(String newRpar)
  {
    String oldRpar = rpar;
    rpar = newRpar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.CAST__RPAR, oldRpar, rpar));
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
      case JavaJRExpressionPackage.CAST__ARRTYPE:
        return basicSetArrtype(null, msgs);
      case JavaJRExpressionPackage.CAST__CLAZZTYPE:
        return basicSetClazztype(null, msgs);
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
      case JavaJRExpressionPackage.CAST__LPAR:
        return getLpar();
      case JavaJRExpressionPackage.CAST__PTYPE:
        return getPtype();
      case JavaJRExpressionPackage.CAST__ARRTYPE:
        return getArrtype();
      case JavaJRExpressionPackage.CAST__CLAZZTYPE:
        return getClazztype();
      case JavaJRExpressionPackage.CAST__RPAR:
        return getRpar();
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
      case JavaJRExpressionPackage.CAST__LPAR:
        setLpar((String)newValue);
        return;
      case JavaJRExpressionPackage.CAST__PTYPE:
        setPtype((String)newValue);
        return;
      case JavaJRExpressionPackage.CAST__ARRTYPE:
        setArrtype((ArrayType)newValue);
        return;
      case JavaJRExpressionPackage.CAST__CLAZZTYPE:
        setClazztype((ClassOrInterfaceType)newValue);
        return;
      case JavaJRExpressionPackage.CAST__RPAR:
        setRpar((String)newValue);
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
      case JavaJRExpressionPackage.CAST__LPAR:
        setLpar(LPAR_EDEFAULT);
        return;
      case JavaJRExpressionPackage.CAST__PTYPE:
        setPtype(PTYPE_EDEFAULT);
        return;
      case JavaJRExpressionPackage.CAST__ARRTYPE:
        setArrtype((ArrayType)null);
        return;
      case JavaJRExpressionPackage.CAST__CLAZZTYPE:
        setClazztype((ClassOrInterfaceType)null);
        return;
      case JavaJRExpressionPackage.CAST__RPAR:
        setRpar(RPAR_EDEFAULT);
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
      case JavaJRExpressionPackage.CAST__LPAR:
        return LPAR_EDEFAULT == null ? lpar != null : !LPAR_EDEFAULT.equals(lpar);
      case JavaJRExpressionPackage.CAST__PTYPE:
        return PTYPE_EDEFAULT == null ? ptype != null : !PTYPE_EDEFAULT.equals(ptype);
      case JavaJRExpressionPackage.CAST__ARRTYPE:
        return arrtype != null;
      case JavaJRExpressionPackage.CAST__CLAZZTYPE:
        return clazztype != null;
      case JavaJRExpressionPackage.CAST__RPAR:
        return RPAR_EDEFAULT == null ? rpar != null : !RPAR_EDEFAULT.equals(rpar);
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
    result.append(" (lpar: ");
    result.append(lpar);
    result.append(", ptype: ");
    result.append(ptype);
    result.append(", rpar: ");
    result.append(rpar);
    result.append(')');
    return result.toString();
  }

} //CastImpl
