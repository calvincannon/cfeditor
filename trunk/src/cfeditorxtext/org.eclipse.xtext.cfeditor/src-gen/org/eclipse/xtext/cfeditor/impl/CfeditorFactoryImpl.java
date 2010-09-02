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
      case CfeditorPackage.METHODE: return createMethode();
      case CfeditorPackage.ZUWEISUNG: return createZuweisung();
      case CfeditorPackage.PROMISE_TYPE: return createPromiseType();
      case CfeditorPackage.COMPONENT: return createComponent();
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
  public Methode createMethode()
  {
    MethodeImpl methode = new MethodeImpl();
    return methode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Zuweisung createZuweisung()
  {
    ZuweisungImpl zuweisung = new ZuweisungImpl();
    return zuweisung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PromiseType createPromiseType()
  {
    PromiseTypeImpl promiseType = new PromiseTypeImpl();
    return promiseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
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
