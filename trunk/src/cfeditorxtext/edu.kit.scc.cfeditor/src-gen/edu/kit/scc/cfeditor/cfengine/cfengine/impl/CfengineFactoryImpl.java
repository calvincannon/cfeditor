/**
 * <copyright>
 * </copyright>
 *

 */
package edu.kit.scc.cfeditor.cfengine.cfengine.impl;

import edu.kit.scc.cfeditor.cfengine.cfengine.*;

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
public class CfengineFactoryImpl extends EFactoryImpl implements CfengineFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CfengineFactory init()
  {
    try
    {
      CfengineFactory theCfengineFactory = (CfengineFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kit.edu/scc/cfeditor/cfengine/CfengineEditor"); 
      if (theCfengineFactory != null)
      {
        return theCfengineFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CfengineFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CfengineFactoryImpl()
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
      case CfenginePackage.CF_MODEL: return createCfModel();
      case CfenginePackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case CfenginePackage.PART: return createPart();
      case CfenginePackage.BUNDLE: return createBundle();
      case CfenginePackage.BODY: return createBody();
      case CfenginePackage.BODY_FUNCTION: return createBodyFunction();
      case CfenginePackage.SPECIAL_FUNCTION: return createSpecialFunction();
      case CfenginePackage.BUNDLE_PROMISE_TYPE: return createBundlePromiseType();
      case CfenginePackage.BODY_PROMISE_TYPE: return createBodyPromiseType();
      case CfenginePackage.BUNDLE_COMPONENT: return createBundleComponent();
      case CfenginePackage.BODY_COMPONENT: return createBodyComponent();
      case CfenginePackage.BODY_CLASS: return createBodyClass();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CfModel createCfModel()
  {
    CfModelImpl cfModel = new CfModelImpl();
    return cfModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Part createPart()
  {
    PartImpl part = new PartImpl();
    return part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bundle createBundle()
  {
    BundleImpl bundle = new BundleImpl();
    return bundle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyFunction createBodyFunction()
  {
    BodyFunctionImpl bodyFunction = new BodyFunctionImpl();
    return bodyFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecialFunction createSpecialFunction()
  {
    SpecialFunctionImpl specialFunction = new SpecialFunctionImpl();
    return specialFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BundlePromiseType createBundlePromiseType()
  {
    BundlePromiseTypeImpl bundlePromiseType = new BundlePromiseTypeImpl();
    return bundlePromiseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyPromiseType createBodyPromiseType()
  {
    BodyPromiseTypeImpl bodyPromiseType = new BodyPromiseTypeImpl();
    return bodyPromiseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BundleComponent createBundleComponent()
  {
    BundleComponentImpl bundleComponent = new BundleComponentImpl();
    return bundleComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyComponent createBodyComponent()
  {
    BodyComponentImpl bodyComponent = new BodyComponentImpl();
    return bodyComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyClass createBodyClass()
  {
    BodyClassImpl bodyClass = new BodyClassImpl();
    return bodyClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CfenginePackage getCfenginePackage()
  {
    return (CfenginePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CfenginePackage getPackage()
  {
    return CfenginePackage.eINSTANCE;
  }

} //CfengineFactoryImpl
