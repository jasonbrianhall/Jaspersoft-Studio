/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionPackage;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getCondExpr <em>Cond Expr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getBasejrexpr <em>Basejrexpr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getOkReturnedExpr <em>Ok Returned Expr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getKoReturnedExpr <em>Ko Returned Expr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getAndExp <em>And Exp</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getPrimaryCond <em>Primary Cond</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getInstanceof <em>Instanceof</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getRel <em>Rel</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getEl <em>El</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getMultExpr <em>Mult Expr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getBaseExpr <em>Base Expr</em>}</li>
 *   <li>{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends ModelImpl implements Expression
{
  /**
   * The cached value of the '{@link #getCondExpr() <em>Cond Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondExpr()
   * @generated
   * @ordered
   */
  protected Expression condExpr;

  /**
   * The cached value of the '{@link #getBasejrexpr() <em>Basejrexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasejrexpr()
   * @generated
   * @ordered
   */
  protected BaseJRExpr basejrexpr;

  /**
   * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected static final String LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected String literal = LITERAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getOkReturnedExpr() <em>Ok Returned Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOkReturnedExpr()
   * @generated
   * @ordered
   */
  protected Expression okReturnedExpr;

  /**
   * The cached value of the '{@link #getKoReturnedExpr() <em>Ko Returned Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKoReturnedExpr()
   * @generated
   * @ordered
   */
  protected Expression koReturnedExpr;

  /**
   * The cached value of the '{@link #getAndExp() <em>And Exp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAndExp()
   * @generated
   * @ordered
   */
  protected EList<Expression> andExp;

  /**
   * The cached value of the '{@link #getPrimaryCond() <em>Primary Cond</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryCond()
   * @generated
   * @ordered
   */
  protected EList<Expression> primaryCond;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

  /**
   * The cached value of the '{@link #getInstanceof() <em>Instanceof</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstanceof()
   * @generated
   * @ordered
   */
  protected EList<Expression> instanceof_;

  /**
   * The cached value of the '{@link #getRel() <em>Rel</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRel()
   * @generated
   * @ordered
   */
  protected EList<Expression> rel;

  /**
   * The cached value of the '{@link #getEl() <em>El</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEl()
   * @generated
   * @ordered
   */
  protected Expression el;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected EObject target;

  /**
   * The cached value of the '{@link #getMultExpr() <em>Mult Expr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultExpr()
   * @generated
   * @ordered
   */
  protected EList<Expression> multExpr;

  /**
   * The cached value of the '{@link #getBaseExpr() <em>Base Expr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseExpr()
   * @generated
   * @ordered
   */
  protected EList<Expression> baseExpr;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<MethodInvocation> methods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return JavaJRExpressionPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCondExpr()
  {
    return condExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondExpr(Expression newCondExpr, NotificationChain msgs)
  {
    Expression oldCondExpr = condExpr;
    condExpr = newCondExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__COND_EXPR, oldCondExpr, newCondExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondExpr(Expression newCondExpr)
  {
    if (newCondExpr != condExpr)
    {
      NotificationChain msgs = null;
      if (condExpr != null)
        msgs = ((InternalEObject)condExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.EXPRESSION__COND_EXPR, null, msgs);
      if (newCondExpr != null)
        msgs = ((InternalEObject)newCondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.EXPRESSION__COND_EXPR, null, msgs);
      msgs = basicSetCondExpr(newCondExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__COND_EXPR, newCondExpr, newCondExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseJRExpr getBasejrexpr()
  {
    return basejrexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasejrexpr(BaseJRExpr newBasejrexpr, NotificationChain msgs)
  {
    BaseJRExpr oldBasejrexpr = basejrexpr;
    basejrexpr = newBasejrexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__BASEJREXPR, oldBasejrexpr, newBasejrexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasejrexpr(BaseJRExpr newBasejrexpr)
  {
    if (newBasejrexpr != basejrexpr)
    {
      NotificationChain msgs = null;
      if (basejrexpr != null)
        msgs = ((InternalEObject)basejrexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.EXPRESSION__BASEJREXPR, null, msgs);
      if (newBasejrexpr != null)
        msgs = ((InternalEObject)newBasejrexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.EXPRESSION__BASEJREXPR, null, msgs);
      msgs = basicSetBasejrexpr(newBasejrexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__BASEJREXPR, newBasejrexpr, newBasejrexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(String newLiteral)
  {
    String oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__LITERAL, oldLiteral, literal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getOkReturnedExpr()
  {
    return okReturnedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOkReturnedExpr(Expression newOkReturnedExpr, NotificationChain msgs)
  {
    Expression oldOkReturnedExpr = okReturnedExpr;
    okReturnedExpr = newOkReturnedExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__OK_RETURNED_EXPR, oldOkReturnedExpr, newOkReturnedExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOkReturnedExpr(Expression newOkReturnedExpr)
  {
    if (newOkReturnedExpr != okReturnedExpr)
    {
      NotificationChain msgs = null;
      if (okReturnedExpr != null)
        msgs = ((InternalEObject)okReturnedExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.EXPRESSION__OK_RETURNED_EXPR, null, msgs);
      if (newOkReturnedExpr != null)
        msgs = ((InternalEObject)newOkReturnedExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.EXPRESSION__OK_RETURNED_EXPR, null, msgs);
      msgs = basicSetOkReturnedExpr(newOkReturnedExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__OK_RETURNED_EXPR, newOkReturnedExpr, newOkReturnedExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getKoReturnedExpr()
  {
    return koReturnedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKoReturnedExpr(Expression newKoReturnedExpr, NotificationChain msgs)
  {
    Expression oldKoReturnedExpr = koReturnedExpr;
    koReturnedExpr = newKoReturnedExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__KO_RETURNED_EXPR, oldKoReturnedExpr, newKoReturnedExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKoReturnedExpr(Expression newKoReturnedExpr)
  {
    if (newKoReturnedExpr != koReturnedExpr)
    {
      NotificationChain msgs = null;
      if (koReturnedExpr != null)
        msgs = ((InternalEObject)koReturnedExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.EXPRESSION__KO_RETURNED_EXPR, null, msgs);
      if (newKoReturnedExpr != null)
        msgs = ((InternalEObject)newKoReturnedExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.EXPRESSION__KO_RETURNED_EXPR, null, msgs);
      msgs = basicSetKoReturnedExpr(newKoReturnedExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__KO_RETURNED_EXPR, newKoReturnedExpr, newKoReturnedExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getAndExp()
  {
    if (andExp == null)
    {
      andExp = new EObjectContainmentEList<Expression>(Expression.class, this, JavaJRExpressionPackage.EXPRESSION__AND_EXP);
    }
    return andExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getPrimaryCond()
  {
    if (primaryCond == null)
    {
      primaryCond = new EObjectContainmentEList<Expression>(Expression.class, this, JavaJRExpressionPackage.EXPRESSION__PRIMARY_COND);
    }
    return primaryCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.EXPRESSION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.EXPRESSION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getInstanceof()
  {
    if (instanceof_ == null)
    {
      instanceof_ = new EObjectContainmentEList<Expression>(Expression.class, this, JavaJRExpressionPackage.EXPRESSION__INSTANCEOF);
    }
    return instanceof_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getRel()
  {
    if (rel == null)
    {
      rel = new EObjectContainmentEList<Expression>(Expression.class, this, JavaJRExpressionPackage.EXPRESSION__REL);
    }
    return rel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getEl()
  {
    return el;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEl(Expression newEl, NotificationChain msgs)
  {
    Expression oldEl = el;
    el = newEl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__EL, oldEl, newEl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEl(Expression newEl)
  {
    if (newEl != el)
    {
      NotificationChain msgs = null;
      if (el != null)
        msgs = ((InternalEObject)el).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.EXPRESSION__EL, null, msgs);
      if (newEl != null)
        msgs = ((InternalEObject)newEl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.EXPRESSION__EL, null, msgs);
      msgs = basicSetEl(newEl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__EL, newEl, newEl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(EObject newTarget, NotificationChain msgs)
  {
    EObject oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(EObject newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.EXPRESSION__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaJRExpressionPackage.EXPRESSION__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaJRExpressionPackage.EXPRESSION__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getMultExpr()
  {
    if (multExpr == null)
    {
      multExpr = new EObjectContainmentEList<Expression>(Expression.class, this, JavaJRExpressionPackage.EXPRESSION__MULT_EXPR);
    }
    return multExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getBaseExpr()
  {
    if (baseExpr == null)
    {
      baseExpr = new EObjectContainmentEList<Expression>(Expression.class, this, JavaJRExpressionPackage.EXPRESSION__BASE_EXPR);
    }
    return baseExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MethodInvocation> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<MethodInvocation>(MethodInvocation.class, this, JavaJRExpressionPackage.EXPRESSION__METHODS);
    }
    return methods;
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
      case JavaJRExpressionPackage.EXPRESSION__COND_EXPR:
        return basicSetCondExpr(null, msgs);
      case JavaJRExpressionPackage.EXPRESSION__BASEJREXPR:
        return basicSetBasejrexpr(null, msgs);
      case JavaJRExpressionPackage.EXPRESSION__OK_RETURNED_EXPR:
        return basicSetOkReturnedExpr(null, msgs);
      case JavaJRExpressionPackage.EXPRESSION__KO_RETURNED_EXPR:
        return basicSetKoReturnedExpr(null, msgs);
      case JavaJRExpressionPackage.EXPRESSION__AND_EXP:
        return ((InternalEList<?>)getAndExp()).basicRemove(otherEnd, msgs);
      case JavaJRExpressionPackage.EXPRESSION__PRIMARY_COND:
        return ((InternalEList<?>)getPrimaryCond()).basicRemove(otherEnd, msgs);
      case JavaJRExpressionPackage.EXPRESSION__EXPR:
        return basicSetExpr(null, msgs);
      case JavaJRExpressionPackage.EXPRESSION__INSTANCEOF:
        return ((InternalEList<?>)getInstanceof()).basicRemove(otherEnd, msgs);
      case JavaJRExpressionPackage.EXPRESSION__REL:
        return ((InternalEList<?>)getRel()).basicRemove(otherEnd, msgs);
      case JavaJRExpressionPackage.EXPRESSION__EL:
        return basicSetEl(null, msgs);
      case JavaJRExpressionPackage.EXPRESSION__TARGET:
        return basicSetTarget(null, msgs);
      case JavaJRExpressionPackage.EXPRESSION__MULT_EXPR:
        return ((InternalEList<?>)getMultExpr()).basicRemove(otherEnd, msgs);
      case JavaJRExpressionPackage.EXPRESSION__BASE_EXPR:
        return ((InternalEList<?>)getBaseExpr()).basicRemove(otherEnd, msgs);
      case JavaJRExpressionPackage.EXPRESSION__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
      case JavaJRExpressionPackage.EXPRESSION__COND_EXPR:
        return getCondExpr();
      case JavaJRExpressionPackage.EXPRESSION__BASEJREXPR:
        return getBasejrexpr();
      case JavaJRExpressionPackage.EXPRESSION__LITERAL:
        return getLiteral();
      case JavaJRExpressionPackage.EXPRESSION__OK_RETURNED_EXPR:
        return getOkReturnedExpr();
      case JavaJRExpressionPackage.EXPRESSION__KO_RETURNED_EXPR:
        return getKoReturnedExpr();
      case JavaJRExpressionPackage.EXPRESSION__AND_EXP:
        return getAndExp();
      case JavaJRExpressionPackage.EXPRESSION__PRIMARY_COND:
        return getPrimaryCond();
      case JavaJRExpressionPackage.EXPRESSION__EXPR:
        return getExpr();
      case JavaJRExpressionPackage.EXPRESSION__INSTANCEOF:
        return getInstanceof();
      case JavaJRExpressionPackage.EXPRESSION__REL:
        return getRel();
      case JavaJRExpressionPackage.EXPRESSION__EL:
        return getEl();
      case JavaJRExpressionPackage.EXPRESSION__TARGET:
        return getTarget();
      case JavaJRExpressionPackage.EXPRESSION__MULT_EXPR:
        return getMultExpr();
      case JavaJRExpressionPackage.EXPRESSION__BASE_EXPR:
        return getBaseExpr();
      case JavaJRExpressionPackage.EXPRESSION__METHODS:
        return getMethods();
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
      case JavaJRExpressionPackage.EXPRESSION__COND_EXPR:
        setCondExpr((Expression)newValue);
        return;
      case JavaJRExpressionPackage.EXPRESSION__BASEJREXPR:
        setBasejrexpr((BaseJRExpr)newValue);
        return;
      case JavaJRExpressionPackage.EXPRESSION__LITERAL:
        setLiteral((String)newValue);
        return;
      case JavaJRExpressionPackage.EXPRESSION__OK_RETURNED_EXPR:
        setOkReturnedExpr((Expression)newValue);
        return;
      case JavaJRExpressionPackage.EXPRESSION__KO_RETURNED_EXPR:
        setKoReturnedExpr((Expression)newValue);
        return;
      case JavaJRExpressionPackage.EXPRESSION__AND_EXP:
        getAndExp().clear();
        getAndExp().addAll((Collection<? extends Expression>)newValue);
        return;
      case JavaJRExpressionPackage.EXPRESSION__PRIMARY_COND:
        getPrimaryCond().clear();
        getPrimaryCond().addAll((Collection<? extends Expression>)newValue);
        return;
      case JavaJRExpressionPackage.EXPRESSION__EXPR:
        setExpr((Expression)newValue);
        return;
      case JavaJRExpressionPackage.EXPRESSION__INSTANCEOF:
        getInstanceof().clear();
        getInstanceof().addAll((Collection<? extends Expression>)newValue);
        return;
      case JavaJRExpressionPackage.EXPRESSION__REL:
        getRel().clear();
        getRel().addAll((Collection<? extends Expression>)newValue);
        return;
      case JavaJRExpressionPackage.EXPRESSION__EL:
        setEl((Expression)newValue);
        return;
      case JavaJRExpressionPackage.EXPRESSION__TARGET:
        setTarget((EObject)newValue);
        return;
      case JavaJRExpressionPackage.EXPRESSION__MULT_EXPR:
        getMultExpr().clear();
        getMultExpr().addAll((Collection<? extends Expression>)newValue);
        return;
      case JavaJRExpressionPackage.EXPRESSION__BASE_EXPR:
        getBaseExpr().clear();
        getBaseExpr().addAll((Collection<? extends Expression>)newValue);
        return;
      case JavaJRExpressionPackage.EXPRESSION__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends MethodInvocation>)newValue);
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
      case JavaJRExpressionPackage.EXPRESSION__COND_EXPR:
        setCondExpr((Expression)null);
        return;
      case JavaJRExpressionPackage.EXPRESSION__BASEJREXPR:
        setBasejrexpr((BaseJRExpr)null);
        return;
      case JavaJRExpressionPackage.EXPRESSION__LITERAL:
        setLiteral(LITERAL_EDEFAULT);
        return;
      case JavaJRExpressionPackage.EXPRESSION__OK_RETURNED_EXPR:
        setOkReturnedExpr((Expression)null);
        return;
      case JavaJRExpressionPackage.EXPRESSION__KO_RETURNED_EXPR:
        setKoReturnedExpr((Expression)null);
        return;
      case JavaJRExpressionPackage.EXPRESSION__AND_EXP:
        getAndExp().clear();
        return;
      case JavaJRExpressionPackage.EXPRESSION__PRIMARY_COND:
        getPrimaryCond().clear();
        return;
      case JavaJRExpressionPackage.EXPRESSION__EXPR:
        setExpr((Expression)null);
        return;
      case JavaJRExpressionPackage.EXPRESSION__INSTANCEOF:
        getInstanceof().clear();
        return;
      case JavaJRExpressionPackage.EXPRESSION__REL:
        getRel().clear();
        return;
      case JavaJRExpressionPackage.EXPRESSION__EL:
        setEl((Expression)null);
        return;
      case JavaJRExpressionPackage.EXPRESSION__TARGET:
        setTarget((EObject)null);
        return;
      case JavaJRExpressionPackage.EXPRESSION__MULT_EXPR:
        getMultExpr().clear();
        return;
      case JavaJRExpressionPackage.EXPRESSION__BASE_EXPR:
        getBaseExpr().clear();
        return;
      case JavaJRExpressionPackage.EXPRESSION__METHODS:
        getMethods().clear();
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
      case JavaJRExpressionPackage.EXPRESSION__COND_EXPR:
        return condExpr != null;
      case JavaJRExpressionPackage.EXPRESSION__BASEJREXPR:
        return basejrexpr != null;
      case JavaJRExpressionPackage.EXPRESSION__LITERAL:
        return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
      case JavaJRExpressionPackage.EXPRESSION__OK_RETURNED_EXPR:
        return okReturnedExpr != null;
      case JavaJRExpressionPackage.EXPRESSION__KO_RETURNED_EXPR:
        return koReturnedExpr != null;
      case JavaJRExpressionPackage.EXPRESSION__AND_EXP:
        return andExp != null && !andExp.isEmpty();
      case JavaJRExpressionPackage.EXPRESSION__PRIMARY_COND:
        return primaryCond != null && !primaryCond.isEmpty();
      case JavaJRExpressionPackage.EXPRESSION__EXPR:
        return expr != null;
      case JavaJRExpressionPackage.EXPRESSION__INSTANCEOF:
        return instanceof_ != null && !instanceof_.isEmpty();
      case JavaJRExpressionPackage.EXPRESSION__REL:
        return rel != null && !rel.isEmpty();
      case JavaJRExpressionPackage.EXPRESSION__EL:
        return el != null;
      case JavaJRExpressionPackage.EXPRESSION__TARGET:
        return target != null;
      case JavaJRExpressionPackage.EXPRESSION__MULT_EXPR:
        return multExpr != null && !multExpr.isEmpty();
      case JavaJRExpressionPackage.EXPRESSION__BASE_EXPR:
        return baseExpr != null && !baseExpr.isEmpty();
      case JavaJRExpressionPackage.EXPRESSION__METHODS:
        return methods != null && !methods.isEmpty();
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
    result.append(" (literal: ");
    result.append(literal);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
