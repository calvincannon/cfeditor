/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.xtext.cfeditor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.cfeditor.Bundle;
import org.eclipse.xtext.cfeditor.CfeditorPackage;
import org.eclipse.xtext.cfeditor.Methode;
import org.eclipse.xtext.cfeditor.PromiseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.cfeditor.impl.BundleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.cfeditor.impl.BundleImpl#getPromiseType <em>Promise Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.cfeditor.impl.BundleImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleImpl extends PartImpl implements Bundle
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPromiseType() <em>Promise Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPromiseType()
   * @generated
   * @ordered
   */
  protected EList<PromiseType> promiseType;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<Methode> methods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BundleImpl()
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
    return CfeditorPackage.Literals.BUNDLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfeditorPackage.BUNDLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PromiseType> getPromiseType()
  {
    if (promiseType == null)
    {
      promiseType = new EObjectContainmentEList<PromiseType>(PromiseType.class, this, CfeditorPackage.BUNDLE__PROMISE_TYPE);
    }
    return promiseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Methode> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<Methode>(Methode.class, this, CfeditorPackage.BUNDLE__METHODS);
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
      case CfeditorPackage.BUNDLE__PROMISE_TYPE:
        return ((InternalEList<?>)getPromiseType()).basicRemove(otherEnd, msgs);
      case CfeditorPackage.BUNDLE__METHODS:
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
      case CfeditorPackage.BUNDLE__NAME:
        return getName();
      case CfeditorPackage.BUNDLE__PROMISE_TYPE:
        return getPromiseType();
      case CfeditorPackage.BUNDLE__METHODS:
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
      case CfeditorPackage.BUNDLE__NAME:
        setName((String)newValue);
        return;
      case CfeditorPackage.BUNDLE__PROMISE_TYPE:
        getPromiseType().clear();
        getPromiseType().addAll((Collection<? extends PromiseType>)newValue);
        return;
      case CfeditorPackage.BUNDLE__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Methode>)newValue);
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
      case CfeditorPackage.BUNDLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CfeditorPackage.BUNDLE__PROMISE_TYPE:
        getPromiseType().clear();
        return;
      case CfeditorPackage.BUNDLE__METHODS:
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
      case CfeditorPackage.BUNDLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CfeditorPackage.BUNDLE__PROMISE_TYPE:
        return promiseType != null && !promiseType.isEmpty();
      case CfeditorPackage.BUNDLE__METHODS:
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BundleImpl
