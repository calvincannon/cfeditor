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

import org.eclipse.xtext.cfeditor.Body;
import org.eclipse.xtext.cfeditor.BodyComponent;
import org.eclipse.xtext.cfeditor.BodyFunction;
import org.eclipse.xtext.cfeditor.CfeditorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.cfeditor.impl.BodyImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.xtext.cfeditor.impl.BodyImpl#getPromiseType <em>Promise Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyImpl extends PartImpl implements Body
{
  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected BodyComponent component;

  /**
   * The cached value of the '{@link #getPromiseType() <em>Promise Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPromiseType()
   * @generated
   * @ordered
   */
  protected EList<BodyFunction> promiseType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyImpl()
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
    return CfeditorPackage.Literals.BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyComponent getComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponent(BodyComponent newComponent, NotificationChain msgs)
  {
    BodyComponent oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfeditorPackage.BODY__COMPONENT, oldComponent, newComponent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(BodyComponent newComponent)
  {
    if (newComponent != component)
    {
      NotificationChain msgs = null;
      if (component != null)
        msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfeditorPackage.BODY__COMPONENT, null, msgs);
      if (newComponent != null)
        msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfeditorPackage.BODY__COMPONENT, null, msgs);
      msgs = basicSetComponent(newComponent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfeditorPackage.BODY__COMPONENT, newComponent, newComponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BodyFunction> getPromiseType()
  {
    if (promiseType == null)
    {
      promiseType = new EObjectContainmentEList<BodyFunction>(BodyFunction.class, this, CfeditorPackage.BODY__PROMISE_TYPE);
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
      case CfeditorPackage.BODY__COMPONENT:
        return basicSetComponent(null, msgs);
      case CfeditorPackage.BODY__PROMISE_TYPE:
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
      case CfeditorPackage.BODY__COMPONENT:
        return getComponent();
      case CfeditorPackage.BODY__PROMISE_TYPE:
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
      case CfeditorPackage.BODY__COMPONENT:
        setComponent((BodyComponent)newValue);
        return;
      case CfeditorPackage.BODY__PROMISE_TYPE:
        getPromiseType().clear();
        getPromiseType().addAll((Collection<? extends BodyFunction>)newValue);
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
      case CfeditorPackage.BODY__COMPONENT:
        setComponent((BodyComponent)null);
        return;
      case CfeditorPackage.BODY__PROMISE_TYPE:
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
      case CfeditorPackage.BODY__COMPONENT:
        return component != null;
      case CfeditorPackage.BODY__PROMISE_TYPE:
        return promiseType != null && !promiseType.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BodyImpl
