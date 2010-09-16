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
import org.eclipse.xtext.cfeditor.BundleComponent;
import org.eclipse.xtext.cfeditor.BundlePromiseType;
import org.eclipse.xtext.cfeditor.CfeditorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.cfeditor.impl.BundleImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.xtext.cfeditor.impl.BundleImpl#getPromiseType <em>Promise Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleImpl extends PartImpl implements Bundle
{
  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected BundleComponent component;

  /**
   * The cached value of the '{@link #getPromiseType() <em>Promise Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPromiseType()
   * @generated
   * @ordered
   */
  protected EList<BundlePromiseType> promiseType;

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
  public BundleComponent getComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponent(BundleComponent newComponent, NotificationChain msgs)
  {
    BundleComponent oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfeditorPackage.BUNDLE__COMPONENT, oldComponent, newComponent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(BundleComponent newComponent)
  {
    if (newComponent != component)
    {
      NotificationChain msgs = null;
      if (component != null)
        msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfeditorPackage.BUNDLE__COMPONENT, null, msgs);
      if (newComponent != null)
        msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfeditorPackage.BUNDLE__COMPONENT, null, msgs);
      msgs = basicSetComponent(newComponent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfeditorPackage.BUNDLE__COMPONENT, newComponent, newComponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BundlePromiseType> getPromiseType()
  {
    if (promiseType == null)
    {
      promiseType = new EObjectContainmentEList<BundlePromiseType>(BundlePromiseType.class, this, CfeditorPackage.BUNDLE__PROMISE_TYPE);
    }
    return promiseType;
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
      case CfeditorPackage.BUNDLE__COMPONENT:
        return basicSetComponent(null, msgs);
      case CfeditorPackage.BUNDLE__PROMISE_TYPE:
        return ((InternalEList<?>)getPromiseType()).basicRemove(otherEnd, msgs);
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
      case CfeditorPackage.BUNDLE__COMPONENT:
        return getComponent();
      case CfeditorPackage.BUNDLE__PROMISE_TYPE:
        return getPromiseType();
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
      case CfeditorPackage.BUNDLE__COMPONENT:
        setComponent((BundleComponent)newValue);
        return;
      case CfeditorPackage.BUNDLE__PROMISE_TYPE:
        getPromiseType().clear();
        getPromiseType().addAll((Collection<? extends BundlePromiseType>)newValue);
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
      case CfeditorPackage.BUNDLE__COMPONENT:
        setComponent((BundleComponent)null);
        return;
      case CfeditorPackage.BUNDLE__PROMISE_TYPE:
        getPromiseType().clear();
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
      case CfeditorPackage.BUNDLE__COMPONENT:
        return component != null;
      case CfeditorPackage.BUNDLE__PROMISE_TYPE:
        return promiseType != null && !promiseType.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BundleImpl
