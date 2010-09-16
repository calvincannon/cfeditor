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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.cfeditor.BodyFunction;
import org.eclipse.xtext.cfeditor.BodyPromiseType;
import org.eclipse.xtext.cfeditor.CfeditorPackage;
import org.eclipse.xtext.cfeditor.SpecialFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.cfeditor.impl.BodyFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.cfeditor.impl.BodyFunctionImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipse.xtext.cfeditor.impl.BodyFunctionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyFunctionImpl extends MinimalEObjectImpl.Container implements BodyFunction
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected BodyPromiseType name;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<String> values;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected EList<SpecialFunction> function;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyFunctionImpl()
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
    return CfeditorPackage.Literals.BODY_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyPromiseType getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(BodyPromiseType newName, NotificationChain msgs)
  {
    BodyPromiseType oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfeditorPackage.BODY_FUNCTION__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(BodyPromiseType newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfeditorPackage.BODY_FUNCTION__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfeditorPackage.BODY_FUNCTION__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfeditorPackage.BODY_FUNCTION__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getValues()
  {
    if (values == null)
    {
      values = new EDataTypeEList<String>(String.class, this, CfeditorPackage.BODY_FUNCTION__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SpecialFunction> getFunction()
  {
    if (function == null)
    {
      function = new EObjectContainmentEList<SpecialFunction>(SpecialFunction.class, this, CfeditorPackage.BODY_FUNCTION__FUNCTION);
    }
    return function;
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
      case CfeditorPackage.BODY_FUNCTION__NAME:
        return basicSetName(null, msgs);
      case CfeditorPackage.BODY_FUNCTION__FUNCTION:
        return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
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
      case CfeditorPackage.BODY_FUNCTION__NAME:
        return getName();
      case CfeditorPackage.BODY_FUNCTION__VALUES:
        return getValues();
      case CfeditorPackage.BODY_FUNCTION__FUNCTION:
        return getFunction();
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
      case CfeditorPackage.BODY_FUNCTION__NAME:
        setName((BodyPromiseType)newValue);
        return;
      case CfeditorPackage.BODY_FUNCTION__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends String>)newValue);
        return;
      case CfeditorPackage.BODY_FUNCTION__FUNCTION:
        getFunction().clear();
        getFunction().addAll((Collection<? extends SpecialFunction>)newValue);
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
      case CfeditorPackage.BODY_FUNCTION__NAME:
        setName((BodyPromiseType)null);
        return;
      case CfeditorPackage.BODY_FUNCTION__VALUES:
        getValues().clear();
        return;
      case CfeditorPackage.BODY_FUNCTION__FUNCTION:
        getFunction().clear();
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
      case CfeditorPackage.BODY_FUNCTION__NAME:
        return name != null;
      case CfeditorPackage.BODY_FUNCTION__VALUES:
        return values != null && !values.isEmpty();
      case CfeditorPackage.BODY_FUNCTION__FUNCTION:
        return function != null && !function.isEmpty();
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
    result.append(" (values: ");
    result.append(values);
    result.append(')');
    return result.toString();
  }

} //BodyFunctionImpl
