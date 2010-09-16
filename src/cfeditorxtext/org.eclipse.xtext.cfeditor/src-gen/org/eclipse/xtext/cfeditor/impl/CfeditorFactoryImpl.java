/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.xtext.cfeditor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.cfeditor.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CfeditorFactoryImpl extends EFactoryImpl implements CfeditorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CfeditorFactory init()
  {
    try
    {
      CfeditorFactory theCfeditorFactory = (CfeditorFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/xtext/Cfeditor"); 
      if (theCfeditorFactory != null)
      {
        return theCfeditorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CfeditorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CfeditorFactoryImpl()
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
      case CfeditorPackage.CF_MODEL: return createCfModel();
      case CfeditorPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case CfeditorPackage.PART: return createPart();
      case CfeditorPackage.BUNDLE: return createBundle();
      case CfeditorPackage.BODY: return createBody();
      case CfeditorPackage.BODY_FUNCTION: return createBodyFunction();
      case CfeditorPackage.SPECIAL_FUNCTION: return createSpecialFunction();
      case CfeditorPackage.BUNDLE_PROMISE_TYPE: return createBundlePromiseType();
      case CfeditorPackage.BODY_PROMISE_TYPE: return createBodyPromiseType();
      case CfeditorPackage.BUNDLE_COMPONENT: return createBundleComponent();
      case CfeditorPackage.BODY_COMPONENT: return createBodyComponent();
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
  public CfeditorPackage getCfeditorPackage()
  {
    return (CfeditorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CfeditorPackage getPackage()
  {
    return CfeditorPackage.eINSTANCE;
  }

} //CfeditorFactoryImpl
