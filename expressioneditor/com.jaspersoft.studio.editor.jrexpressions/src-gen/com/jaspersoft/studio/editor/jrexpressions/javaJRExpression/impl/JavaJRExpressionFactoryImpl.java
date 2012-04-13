/**
 * <copyright>
 * </copyright>
 *
 */
package com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.impl;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaJRExpressionFactoryImpl extends EFactoryImpl implements JavaJRExpressionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JavaJRExpressionFactory init()
  {
    try
    {
      JavaJRExpressionFactory theJavaJRExpressionFactory = (JavaJRExpressionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.jaspersoft.com/studio/editor/jrexpressions/JavaJRExpression"); 
      if (theJavaJRExpressionFactory != null)
      {
        return theJavaJRExpressionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JavaJRExpressionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaJRExpressionFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JavaJRExpressionPackage.MODEL: return createModel();
      case JavaJRExpressionPackage.EXPRESSION: return createExpression();
      case JavaJRExpressionPackage.METHOD_INVOCATION: return createMethodInvocation();
      case JavaJRExpressionPackage.BASE_JR_EXPR: return createBaseJRExpr();
      case JavaJRExpressionPackage.ARGUMENTS: return createArguments();
      case JavaJRExpressionPackage.EXPRESSION_LIST: return createExpressionList();
      case JavaJRExpressionPackage.CAST: return createCast();
      case JavaJRExpressionPackage.CREATOR: return createCreator();
      case JavaJRExpressionPackage.CLASS_CREATOR: return createClassCreator();
      case JavaJRExpressionPackage.ARRAY_CREATOR: return createArrayCreator();
      case JavaJRExpressionPackage.ARRAY_INITIALIZER: return createArrayInitializer();
      case JavaJRExpressionPackage.INNER_CREATOR: return createInnerCreator();
      case JavaJRExpressionPackage.ARRAY_TYPE: return createArrayType();
      case JavaJRExpressionPackage.CLASS_OR_INTERFACE_TYPE: return createClassOrInterfaceType();
      case JavaJRExpressionPackage.QUALIFIED_NAME: return createQualifiedName();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodInvocation createMethodInvocation()
  {
    MethodInvocationImpl methodInvocation = new MethodInvocationImpl();
    return methodInvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseJRExpr createBaseJRExpr()
  {
    BaseJRExprImpl baseJRExpr = new BaseJRExprImpl();
    return baseJRExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arguments createArguments()
  {
    ArgumentsImpl arguments = new ArgumentsImpl();
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList createExpressionList()
  {
    ExpressionListImpl expressionList = new ExpressionListImpl();
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cast createCast()
  {
    CastImpl cast = new CastImpl();
    return cast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Creator createCreator()
  {
    CreatorImpl creator = new CreatorImpl();
    return creator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassCreator createClassCreator()
  {
    ClassCreatorImpl classCreator = new ClassCreatorImpl();
    return classCreator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayCreator createArrayCreator()
  {
    ArrayCreatorImpl arrayCreator = new ArrayCreatorImpl();
    return arrayCreator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayInitializer createArrayInitializer()
  {
    ArrayInitializerImpl arrayInitializer = new ArrayInitializerImpl();
    return arrayInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InnerCreator createInnerCreator()
  {
    InnerCreatorImpl innerCreator = new InnerCreatorImpl();
    return innerCreator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType createArrayType()
  {
    ArrayTypeImpl arrayType = new ArrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassOrInterfaceType createClassOrInterfaceType()
  {
    ClassOrInterfaceTypeImpl classOrInterfaceType = new ClassOrInterfaceTypeImpl();
    return classOrInterfaceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedName createQualifiedName()
  {
    QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaJRExpressionPackage getJavaJRExpressionPackage()
  {
    return (JavaJRExpressionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JavaJRExpressionPackage getPackage()
  {
    return JavaJRExpressionPackage.eINSTANCE;
  }

} //JavaJRExpressionFactoryImpl
