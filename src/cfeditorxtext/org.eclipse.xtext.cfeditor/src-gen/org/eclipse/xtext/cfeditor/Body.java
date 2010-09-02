/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.xtext.cfeditor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.cfeditor.Body#getPromiseType <em>Promise Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends Part
{
  /**
   * Returns the value of the '<em><b>Promise Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Promise Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Promise Type</em>' attribute.
   * @see #setPromiseType(String)
   * @see org.eclipse.xtext.cfeditor.CfeditorPackage#getBody_PromiseType()
   * @model
   * @generated
   */
  String getPromiseType();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.cfeditor.Body#getPromiseType <em>Promise Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Promise Type</em>' attribute.
   * @see #getPromiseType()
   * @generated
   */
  void setPromiseType(String value);

} // Body
