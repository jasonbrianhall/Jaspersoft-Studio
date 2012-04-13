/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.JavaJRExpressionFactory
 * @model kind="package"
 * @generated
 */
public interface JavaJRExpressionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "javaJRExpression";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.jaspersoft.com/studio/editor/jrexpressions/JavaJRExpression";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "javaJRExpression";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JavaJRExpressionPackage eINSTANCE = com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl.init();

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ModelImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__COND_EXPR = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Basejrexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__BASEJREXPR = MODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LITERAL = MODEL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ok Returned Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OK_RETURNED_EXPR = MODEL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Ko Returned Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__KO_RETURNED_EXPR = MODEL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>And Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__AND_EXP = MODEL_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Primary Cond</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__PRIMARY_COND = MODEL_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPR = MODEL_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Instanceof</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__INSTANCEOF = MODEL_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Rel</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__REL = MODEL_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EL = MODEL_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__TARGET = MODEL_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Mult Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__MULT_EXPR = MODEL_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Base Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__BASE_EXPR = MODEL_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__METHODS = MODEL_FEATURE_COUNT + 14;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = MODEL_FEATURE_COUNT + 15;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.MethodInvocationImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getMethodInvocation()
   * @generated
   */
  int METHOD_INVOCATION = 2;

  /**
   * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__COND_EXPR = EXPRESSION__COND_EXPR;

  /**
   * The feature id for the '<em><b>Basejrexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__BASEJREXPR = EXPRESSION__BASEJREXPR;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__LITERAL = EXPRESSION__LITERAL;

  /**
   * The feature id for the '<em><b>Ok Returned Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__OK_RETURNED_EXPR = EXPRESSION__OK_RETURNED_EXPR;

  /**
   * The feature id for the '<em><b>Ko Returned Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__KO_RETURNED_EXPR = EXPRESSION__KO_RETURNED_EXPR;

  /**
   * The feature id for the '<em><b>And Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__AND_EXP = EXPRESSION__AND_EXP;

  /**
   * The feature id for the '<em><b>Primary Cond</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__PRIMARY_COND = EXPRESSION__PRIMARY_COND;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Instanceof</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__INSTANCEOF = EXPRESSION__INSTANCEOF;

  /**
   * The feature id for the '<em><b>Rel</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__REL = EXPRESSION__REL;

  /**
   * The feature id for the '<em><b>El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__EL = EXPRESSION__EL;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__TARGET = EXPRESSION__TARGET;

  /**
   * The feature id for the '<em><b>Mult Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__MULT_EXPR = EXPRESSION__MULT_EXPR;

  /**
   * The feature id for the '<em><b>Base Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__BASE_EXPR = EXPRESSION__BASE_EXPR;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__METHODS = EXPRESSION__METHODS;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__METHOD_NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__ARGS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method Invocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.BaseJRExprImpl <em>Base JR Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.BaseJRExprImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getBaseJRExpr()
   * @generated
   */
  int BASE_JR_EXPR = 3;

  /**
   * The feature id for the '<em><b>Field Token</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_JR_EXPR__FIELD_TOKEN = 0;

  /**
   * The feature id for the '<em><b>Parameter Token</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_JR_EXPR__PARAMETER_TOKEN = 1;

  /**
   * The feature id for the '<em><b>Variable Token</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_JR_EXPR__VARIABLE_TOKEN = 2;

  /**
   * The number of structural features of the '<em>Base JR Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_JR_EXPR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArgumentsImpl <em>Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArgumentsImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getArguments()
   * @generated
   */
  int ARGUMENTS = 4;

  /**
   * The feature id for the '<em><b>Left P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__LEFT_P = 0;

  /**
   * The feature id for the '<em><b>Expr Lst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__EXPR_LST = 1;

  /**
   * The feature id for the '<em><b>Right P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__RIGHT_P = 2;

  /**
   * The number of structural features of the '<em>Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionListImpl <em>Expression List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionListImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getExpressionList()
   * @generated
   */
  int EXPRESSION_LIST = 5;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__EXPRESSIONS = 0;

  /**
   * The feature id for the '<em><b>Commas</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__COMMAS = 1;

  /**
   * The number of structural features of the '<em>Expression List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.CastImpl <em>Cast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.CastImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getCast()
   * @generated
   */
  int CAST = 6;

  /**
   * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__COND_EXPR = EXPRESSION__COND_EXPR;

  /**
   * The feature id for the '<em><b>Basejrexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__BASEJREXPR = EXPRESSION__BASEJREXPR;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__LITERAL = EXPRESSION__LITERAL;

  /**
   * The feature id for the '<em><b>Ok Returned Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__OK_RETURNED_EXPR = EXPRESSION__OK_RETURNED_EXPR;

  /**
   * The feature id for the '<em><b>Ko Returned Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__KO_RETURNED_EXPR = EXPRESSION__KO_RETURNED_EXPR;

  /**
   * The feature id for the '<em><b>And Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__AND_EXP = EXPRESSION__AND_EXP;

  /**
   * The feature id for the '<em><b>Primary Cond</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__PRIMARY_COND = EXPRESSION__PRIMARY_COND;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Instanceof</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__INSTANCEOF = EXPRESSION__INSTANCEOF;

  /**
   * The feature id for the '<em><b>Rel</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__REL = EXPRESSION__REL;

  /**
   * The feature id for the '<em><b>El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__EL = EXPRESSION__EL;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__TARGET = EXPRESSION__TARGET;

  /**
   * The feature id for the '<em><b>Mult Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__MULT_EXPR = EXPRESSION__MULT_EXPR;

  /**
   * The feature id for the '<em><b>Base Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__BASE_EXPR = EXPRESSION__BASE_EXPR;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__METHODS = EXPRESSION__METHODS;

  /**
   * The feature id for the '<em><b>Lpar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__LPAR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ptype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__PTYPE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arrtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__ARRTYPE = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Clazztype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__CLAZZTYPE = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Rpar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__RPAR = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Cast</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.CreatorImpl <em>Creator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.CreatorImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getCreator()
   * @generated
   */
  int CREATOR = 7;

  /**
   * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__COND_EXPR = EXPRESSION__COND_EXPR;

  /**
   * The feature id for the '<em><b>Basejrexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__BASEJREXPR = EXPRESSION__BASEJREXPR;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__LITERAL = EXPRESSION__LITERAL;

  /**
   * The feature id for the '<em><b>Ok Returned Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__OK_RETURNED_EXPR = EXPRESSION__OK_RETURNED_EXPR;

  /**
   * The feature id for the '<em><b>Ko Returned Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__KO_RETURNED_EXPR = EXPRESSION__KO_RETURNED_EXPR;

  /**
   * The feature id for the '<em><b>And Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__AND_EXP = EXPRESSION__AND_EXP;

  /**
   * The feature id for the '<em><b>Primary Cond</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__PRIMARY_COND = EXPRESSION__PRIMARY_COND;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Instanceof</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__INSTANCEOF = EXPRESSION__INSTANCEOF;

  /**
   * The feature id for the '<em><b>Rel</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__REL = EXPRESSION__REL;

  /**
   * The feature id for the '<em><b>El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__EL = EXPRESSION__EL;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__TARGET = EXPRESSION__TARGET;

  /**
   * The feature id for the '<em><b>Mult Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__MULT_EXPR = EXPRESSION__MULT_EXPR;

  /**
   * The feature id for the '<em><b>Base Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__BASE_EXPR = EXPRESSION__BASE_EXPR;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__METHODS = EXPRESSION__METHODS;

  /**
   * The number of structural features of the '<em>Creator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ClassCreatorImpl <em>Class Creator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ClassCreatorImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getClassCreator()
   * @generated
   */
  int CLASS_CREATOR = 8;

  /**
   * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__COND_EXPR = CREATOR__COND_EXPR;

  /**
   * The feature id for the '<em><b>Basejrexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__BASEJREXPR = CREATOR__BASEJREXPR;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__LITERAL = CREATOR__LITERAL;

  /**
   * The feature id for the '<em><b>Ok Returned Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__OK_RETURNED_EXPR = CREATOR__OK_RETURNED_EXPR;

  /**
   * The feature id for the '<em><b>Ko Returned Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__KO_RETURNED_EXPR = CREATOR__KO_RETURNED_EXPR;

  /**
   * The feature id for the '<em><b>And Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__AND_EXP = CREATOR__AND_EXP;

  /**
   * The feature id for the '<em><b>Primary Cond</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__PRIMARY_COND = CREATOR__PRIMARY_COND;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__EXPR = CREATOR__EXPR;

  /**
   * The feature id for the '<em><b>Instanceof</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__INSTANCEOF = CREATOR__INSTANCEOF;

  /**
   * The feature id for the '<em><b>Rel</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__REL = CREATOR__REL;

  /**
   * The feature id for the '<em><b>El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__EL = CREATOR__EL;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__TARGET = CREATOR__TARGET;

  /**
   * The feature id for the '<em><b>Mult Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__MULT_EXPR = CREATOR__MULT_EXPR;

  /**
   * The feature id for the '<em><b>Base Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__BASE_EXPR = CREATOR__BASE_EXPR;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__METHODS = CREATOR__METHODS;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__CLAZZ = CREATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR__ARGS = CREATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class Creator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR_FEATURE_COUNT = CREATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayCreatorImpl <em>Array Creator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayCreatorImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getArrayCreator()
   * @generated
   */
  int ARRAY_CREATOR = 9;

  /**
   * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__COND_EXPR = CREATOR__COND_EXPR;

  /**
   * The feature id for the '<em><b>Basejrexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__BASEJREXPR = CREATOR__BASEJREXPR;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__LITERAL = CREATOR__LITERAL;

  /**
   * The feature id for the '<em><b>Ok Returned Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__OK_RETURNED_EXPR = CREATOR__OK_RETURNED_EXPR;

  /**
   * The feature id for the '<em><b>Ko Returned Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__KO_RETURNED_EXPR = CREATOR__KO_RETURNED_EXPR;

  /**
   * The feature id for the '<em><b>And Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__AND_EXP = CREATOR__AND_EXP;

  /**
   * The feature id for the '<em><b>Primary Cond</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__PRIMARY_COND = CREATOR__PRIMARY_COND;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__EXPR = CREATOR__EXPR;

  /**
   * The feature id for the '<em><b>Instanceof</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__INSTANCEOF = CREATOR__INSTANCEOF;

  /**
   * The feature id for the '<em><b>Rel</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__REL = CREATOR__REL;

  /**
   * The feature id for the '<em><b>El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__EL = CREATOR__EL;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__TARGET = CREATOR__TARGET;

  /**
   * The feature id for the '<em><b>Mult Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__MULT_EXPR = CREATOR__MULT_EXPR;

  /**
   * The feature id for the '<em><b>Base Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__BASE_EXPR = CREATOR__BASE_EXPR;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__METHODS = CREATOR__METHODS;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__TYPE = CREATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Array Initializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR__ARRAY_INITIALIZER = CREATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array Creator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR_FEATURE_COUNT = CREATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayInitializerImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getArrayInitializer()
   * @generated
   */
  int ARRAY_INITIALIZER = 10;

  /**
   * The feature id for the '<em><b>First El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZER__FIRST_EL = 0;

  /**
   * The feature id for the '<em><b>Other Els</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZER__OTHER_ELS = 1;

  /**
   * The number of structural features of the '<em>Array Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.InnerCreatorImpl <em>Inner Creator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.InnerCreatorImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getInnerCreator()
   * @generated
   */
  int INNER_CREATOR = 11;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_CREATOR__ARGS = 0;

  /**
   * The number of structural features of the '<em>Inner Creator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_CREATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayTypeImpl <em>Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayTypeImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getArrayType()
   * @generated
   */
  int ARRAY_TYPE = 12;

  /**
   * The feature id for the '<em><b>Clazz Interf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__CLAZZ_INTERF = 0;

  /**
   * The feature id for the '<em><b>Primtype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__PRIMTYPE = 1;

  /**
   * The number of structural features of the '<em>Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ClassOrInterfaceTypeImpl <em>Class Or Interface Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ClassOrInterfaceTypeImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getClassOrInterfaceType()
   * @generated
   */
  int CLASS_OR_INTERFACE_TYPE = 13;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OR_INTERFACE_TYPE__QUALIFIED_NAME = 0;

  /**
   * The number of structural features of the '<em>Class Or Interface Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.QualifiedNameImpl
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getQualifiedName()
   * @generated
   */
  int QUALIFIED_NAME = 14;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__DOT = 1;

  /**
   * The number of structural features of the '<em>Qualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getCondExpr <em>Cond Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond Expr</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getCondExpr()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_CondExpr();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getBasejrexpr <em>Basejrexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Basejrexpr</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getBasejrexpr()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Basejrexpr();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getLiteral()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Literal();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getOkReturnedExpr <em>Ok Returned Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ok Returned Expr</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getOkReturnedExpr()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_OkReturnedExpr();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getKoReturnedExpr <em>Ko Returned Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ko Returned Expr</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getKoReturnedExpr()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_KoReturnedExpr();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getAndExp <em>And Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>And Exp</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getAndExp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_AndExp();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getPrimaryCond <em>Primary Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Primary Cond</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getPrimaryCond()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_PrimaryCond();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getExpr()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Expr();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getInstanceof <em>Instanceof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instanceof</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getInstanceof()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Instanceof();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getRel <em>Rel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rel</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getRel()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Rel();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getEl <em>El</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>El</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getEl()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_El();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getTarget()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Target();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getMultExpr <em>Mult Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mult Expr</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getMultExpr()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_MultExpr();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getBaseExpr <em>Base Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Base Expr</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getBaseExpr()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_BaseExpr();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Expression#getMethods()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Methods();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation <em>Method Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Invocation</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation
   * @generated
   */
  EClass getMethodInvocation();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation#getMethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method Name</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation#getMethodName()
   * @see #getMethodInvocation()
   * @generated
   */
  EReference getMethodInvocation_MethodName();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation#getArgs()
   * @see #getMethodInvocation()
   * @generated
   */
  EReference getMethodInvocation_Args();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr <em>Base JR Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base JR Expr</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr
   * @generated
   */
  EClass getBaseJRExpr();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr#getFieldToken <em>Field Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Token</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr#getFieldToken()
   * @see #getBaseJRExpr()
   * @generated
   */
  EAttribute getBaseJRExpr_FieldToken();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr#getParameterToken <em>Parameter Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter Token</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr#getParameterToken()
   * @see #getBaseJRExpr()
   * @generated
   */
  EAttribute getBaseJRExpr_ParameterToken();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr#getVariableToken <em>Variable Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Token</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.BaseJRExpr#getVariableToken()
   * @see #getBaseJRExpr()
   * @generated
   */
  EAttribute getBaseJRExpr_VariableToken();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arguments</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments
   * @generated
   */
  EClass getArguments();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments#getLeftP <em>Left P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left P</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments#getLeftP()
   * @see #getArguments()
   * @generated
   */
  EAttribute getArguments_LeftP();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments#getExprLst <em>Expr Lst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Lst</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments#getExprLst()
   * @see #getArguments()
   * @generated
   */
  EReference getArguments_ExprLst();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments#getRightP <em>Right P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right P</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments#getRightP()
   * @see #getArguments()
   * @generated
   */
  EAttribute getArguments_RightP();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ExpressionList <em>Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression List</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ExpressionList
   * @generated
   */
  EClass getExpressionList();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ExpressionList#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ExpressionList#getExpressions()
   * @see #getExpressionList()
   * @generated
   */
  EReference getExpressionList_Expressions();

  /**
   * Returns the meta object for the attribute list '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ExpressionList#getCommas <em>Commas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Commas</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ExpressionList#getCommas()
   * @see #getExpressionList()
   * @generated
   */
  EAttribute getExpressionList_Commas();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast <em>Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast
   * @generated
   */
  EClass getCast();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getLpar <em>Lpar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lpar</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getLpar()
   * @see #getCast()
   * @generated
   */
  EAttribute getCast_Lpar();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getPtype <em>Ptype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ptype</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getPtype()
   * @see #getCast()
   * @generated
   */
  EAttribute getCast_Ptype();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getArrtype <em>Arrtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arrtype</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getArrtype()
   * @see #getCast()
   * @generated
   */
  EReference getCast_Arrtype();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getClazztype <em>Clazztype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clazztype</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getClazztype()
   * @see #getCast()
   * @generated
   */
  EReference getCast_Clazztype();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getRpar <em>Rpar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rpar</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Cast#getRpar()
   * @see #getCast()
   * @generated
   */
  EAttribute getCast_Rpar();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Creator <em>Creator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Creator</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Creator
   * @generated
   */
  EClass getCreator();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassCreator <em>Class Creator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Creator</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassCreator
   * @generated
   */
  EClass getClassCreator();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassCreator#getClazz <em>Clazz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clazz</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassCreator#getClazz()
   * @see #getClassCreator()
   * @generated
   */
  EReference getClassCreator_Clazz();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassCreator#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassCreator#getArgs()
   * @see #getClassCreator()
   * @generated
   */
  EReference getClassCreator_Args();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayCreator <em>Array Creator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Creator</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayCreator
   * @generated
   */
  EClass getArrayCreator();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayCreator#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayCreator#getType()
   * @see #getArrayCreator()
   * @generated
   */
  EReference getArrayCreator_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayCreator#getArrayInitializer <em>Array Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Initializer</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayCreator#getArrayInitializer()
   * @see #getArrayCreator()
   * @generated
   */
  EReference getArrayCreator_ArrayInitializer();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayInitializer <em>Array Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Initializer</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayInitializer
   * @generated
   */
  EClass getArrayInitializer();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayInitializer#getFirstEl <em>First El</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First El</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayInitializer#getFirstEl()
   * @see #getArrayInitializer()
   * @generated
   */
  EReference getArrayInitializer_FirstEl();

  /**
   * Returns the meta object for the containment reference list '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayInitializer#getOtherEls <em>Other Els</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Other Els</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayInitializer#getOtherEls()
   * @see #getArrayInitializer()
   * @generated
   */
  EReference getArrayInitializer_OtherEls();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.InnerCreator <em>Inner Creator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inner Creator</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.InnerCreator
   * @generated
   */
  EClass getInnerCreator();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.InnerCreator#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.InnerCreator#getArgs()
   * @see #getInnerCreator()
   * @generated
   */
  EReference getInnerCreator_Args();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Type</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayType
   * @generated
   */
  EClass getArrayType();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayType#getClazzInterf <em>Clazz Interf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clazz Interf</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayType#getClazzInterf()
   * @see #getArrayType()
   * @generated
   */
  EReference getArrayType_ClazzInterf();

  /**
   * Returns the meta object for the attribute '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayType#getPrimtype <em>Primtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primtype</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ArrayType#getPrimtype()
   * @see #getArrayType()
   * @generated
   */
  EAttribute getArrayType_Primtype();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassOrInterfaceType <em>Class Or Interface Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Or Interface Type</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassOrInterfaceType
   * @generated
   */
  EClass getClassOrInterfaceType();

  /**
   * Returns the meta object for the containment reference '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassOrInterfaceType#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ClassOrInterfaceType#getQualifiedName()
   * @see #getClassOrInterfaceType()
   * @generated
   */
  EReference getClassOrInterfaceType_QualifiedName();

  /**
   * Returns the meta object for class '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.QualifiedName
   * @generated
   */
  EClass getQualifiedName();

  /**
   * Returns the meta object for the attribute list '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.QualifiedName#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Identifier</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.QualifiedName#getIdentifier()
   * @see #getQualifiedName()
   * @generated
   */
  EAttribute getQualifiedName_Identifier();

  /**
   * Returns the meta object for the attribute list '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.QualifiedName#getDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dot</em>'.
   * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.QualifiedName#getDot()
   * @see #getQualifiedName()
   * @generated
   */
  EAttribute getQualifiedName_Dot();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JavaJRExpressionFactory getJavaJRExpressionFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ModelImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Cond Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__COND_EXPR = eINSTANCE.getExpression_CondExpr();

    /**
     * The meta object literal for the '<em><b>Basejrexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__BASEJREXPR = eINSTANCE.getExpression_Basejrexpr();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__LITERAL = eINSTANCE.getExpression_Literal();

    /**
     * The meta object literal for the '<em><b>Ok Returned Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__OK_RETURNED_EXPR = eINSTANCE.getExpression_OkReturnedExpr();

    /**
     * The meta object literal for the '<em><b>Ko Returned Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__KO_RETURNED_EXPR = eINSTANCE.getExpression_KoReturnedExpr();

    /**
     * The meta object literal for the '<em><b>And Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__AND_EXP = eINSTANCE.getExpression_AndExp();

    /**
     * The meta object literal for the '<em><b>Primary Cond</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__PRIMARY_COND = eINSTANCE.getExpression_PrimaryCond();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPR = eINSTANCE.getExpression_Expr();

    /**
     * The meta object literal for the '<em><b>Instanceof</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__INSTANCEOF = eINSTANCE.getExpression_Instanceof();

    /**
     * The meta object literal for the '<em><b>Rel</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__REL = eINSTANCE.getExpression_Rel();

    /**
     * The meta object literal for the '<em><b>El</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EL = eINSTANCE.getExpression_El();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__TARGET = eINSTANCE.getExpression_Target();

    /**
     * The meta object literal for the '<em><b>Mult Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__MULT_EXPR = eINSTANCE.getExpression_MultExpr();

    /**
     * The meta object literal for the '<em><b>Base Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__BASE_EXPR = eINSTANCE.getExpression_BaseExpr();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__METHODS = eINSTANCE.getExpression_Methods();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.MethodInvocationImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getMethodInvocation()
     * @generated
     */
    EClass METHOD_INVOCATION = eINSTANCE.getMethodInvocation();

    /**
     * The meta object literal for the '<em><b>Method Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_INVOCATION__METHOD_NAME = eINSTANCE.getMethodInvocation_MethodName();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_INVOCATION__ARGS = eINSTANCE.getMethodInvocation_Args();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.BaseJRExprImpl <em>Base JR Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.BaseJRExprImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getBaseJRExpr()
     * @generated
     */
    EClass BASE_JR_EXPR = eINSTANCE.getBaseJRExpr();

    /**
     * The meta object literal for the '<em><b>Field Token</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASE_JR_EXPR__FIELD_TOKEN = eINSTANCE.getBaseJRExpr_FieldToken();

    /**
     * The meta object literal for the '<em><b>Parameter Token</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASE_JR_EXPR__PARAMETER_TOKEN = eINSTANCE.getBaseJRExpr_ParameterToken();

    /**
     * The meta object literal for the '<em><b>Variable Token</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASE_JR_EXPR__VARIABLE_TOKEN = eINSTANCE.getBaseJRExpr_VariableToken();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArgumentsImpl <em>Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArgumentsImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getArguments()
     * @generated
     */
    EClass ARGUMENTS = eINSTANCE.getArguments();

    /**
     * The meta object literal for the '<em><b>Left P</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENTS__LEFT_P = eINSTANCE.getArguments_LeftP();

    /**
     * The meta object literal for the '<em><b>Expr Lst</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENTS__EXPR_LST = eINSTANCE.getArguments_ExprLst();

    /**
     * The meta object literal for the '<em><b>Right P</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENTS__RIGHT_P = eINSTANCE.getArguments_RightP();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionListImpl <em>Expression List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ExpressionListImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getExpressionList()
     * @generated
     */
    EClass EXPRESSION_LIST = eINSTANCE.getExpressionList();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LIST__EXPRESSIONS = eINSTANCE.getExpressionList_Expressions();

    /**
     * The meta object literal for the '<em><b>Commas</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_LIST__COMMAS = eINSTANCE.getExpressionList_Commas();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.CastImpl <em>Cast</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.CastImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getCast()
     * @generated
     */
    EClass CAST = eINSTANCE.getCast();

    /**
     * The meta object literal for the '<em><b>Lpar</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAST__LPAR = eINSTANCE.getCast_Lpar();

    /**
     * The meta object literal for the '<em><b>Ptype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAST__PTYPE = eINSTANCE.getCast_Ptype();

    /**
     * The meta object literal for the '<em><b>Arrtype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST__ARRTYPE = eINSTANCE.getCast_Arrtype();

    /**
     * The meta object literal for the '<em><b>Clazztype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST__CLAZZTYPE = eINSTANCE.getCast_Clazztype();

    /**
     * The meta object literal for the '<em><b>Rpar</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAST__RPAR = eINSTANCE.getCast_Rpar();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.CreatorImpl <em>Creator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.CreatorImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getCreator()
     * @generated
     */
    EClass CREATOR = eINSTANCE.getCreator();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ClassCreatorImpl <em>Class Creator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ClassCreatorImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getClassCreator()
     * @generated
     */
    EClass CLASS_CREATOR = eINSTANCE.getClassCreator();

    /**
     * The meta object literal for the '<em><b>Clazz</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_CREATOR__CLAZZ = eINSTANCE.getClassCreator_Clazz();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_CREATOR__ARGS = eINSTANCE.getClassCreator_Args();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayCreatorImpl <em>Array Creator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayCreatorImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getArrayCreator()
     * @generated
     */
    EClass ARRAY_CREATOR = eINSTANCE.getArrayCreator();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_CREATOR__TYPE = eINSTANCE.getArrayCreator_Type();

    /**
     * The meta object literal for the '<em><b>Array Initializer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_CREATOR__ARRAY_INITIALIZER = eINSTANCE.getArrayCreator_ArrayInitializer();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayInitializerImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getArrayInitializer()
     * @generated
     */
    EClass ARRAY_INITIALIZER = eINSTANCE.getArrayInitializer();

    /**
     * The meta object literal for the '<em><b>First El</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_INITIALIZER__FIRST_EL = eINSTANCE.getArrayInitializer_FirstEl();

    /**
     * The meta object literal for the '<em><b>Other Els</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_INITIALIZER__OTHER_ELS = eINSTANCE.getArrayInitializer_OtherEls();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.InnerCreatorImpl <em>Inner Creator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.InnerCreatorImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getInnerCreator()
     * @generated
     */
    EClass INNER_CREATOR = eINSTANCE.getInnerCreator();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INNER_CREATOR__ARGS = eINSTANCE.getInnerCreator_Args();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayTypeImpl <em>Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ArrayTypeImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getArrayType()
     * @generated
     */
    EClass ARRAY_TYPE = eINSTANCE.getArrayType();

    /**
     * The meta object literal for the '<em><b>Clazz Interf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__CLAZZ_INTERF = eINSTANCE.getArrayType_ClazzInterf();

    /**
     * The meta object literal for the '<em><b>Primtype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_TYPE__PRIMTYPE = eINSTANCE.getArrayType_Primtype();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ClassOrInterfaceTypeImpl <em>Class Or Interface Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.ClassOrInterfaceTypeImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getClassOrInterfaceType()
     * @generated
     */
    EClass CLASS_OR_INTERFACE_TYPE = eINSTANCE.getClassOrInterfaceType();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_OR_INTERFACE_TYPE__QUALIFIED_NAME = eINSTANCE.getClassOrInterfaceType_QualifiedName();

    /**
     * The meta object literal for the '{@link com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.QualifiedNameImpl
     * @see com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl.JavaJRExpressionPackageImpl#getQualifiedName()
     * @generated
     */
    EClass QUALIFIED_NAME = eINSTANCE.getQualifiedName();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_NAME__IDENTIFIER = eINSTANCE.getQualifiedName_Identifier();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_NAME__DOT = eINSTANCE.getQualifiedName_Dot();

  }

} //JavaJRExpressionPackage
