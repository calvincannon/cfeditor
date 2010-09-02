/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.xtext.cfeditor.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.cfeditor.Body;
import org.eclipse.xtext.cfeditor.CfeditorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.cfeditor.impl.BodyImpl#getPromiseType <em>Promise Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyImpl extends PartImpl implements Body
{
  /**
   * The default value of the '{@link #getPromiseType() <em>Promise Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPromiseType()
   * @generated
   * @ordered
   */
  protected static final String PROMISE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPromiseType() <em>Promise Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPromiseType()
   * @generated
   * @ordered
   */
  protected String promiseType = PROMISE_TYPE_EDEFAULT;

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
  public String getPromiseType()
  {
    return promiseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPromiseType(String newPromiseType)
  {
    String oldPromiseType = promiseType;
    promiseType = newPromiseType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfeditorPackage.BODY__PROMISE_TYPE, oldPromiseType, promiseType));
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
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CfeditorPackage.BODY__PROMISE_TYPE:
        setPromiseType((String)newValue);
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
      case CfeditorPackage.BODY__PROMISE_TYPE:
        setPromiseType(PROMISE_TYPE_EDEFAULT);
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
      case CfeditorPackage.BODY__PROMISE_TYPE:
        return PROMISE_TYPE_EDEFAULT == null ? promiseType != null : !PROMISE_TYPE_EDEFAULT.equals(promiseType);
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
    result.append(" (promiseType: ");
    result.append(promiseType);
    result.append(')');
    return result.toString();
  }

} //BodyImpl
