/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.uno.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotating Cards</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.uno.game.RotatingCards#getRotatingZero <em>Rotating Zero</em>}</li>
 *   <li>{@link org.xtext.example.uno.game.RotatingCards#getRotatingSeven <em>Rotating Seven</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.uno.game.GamePackage#getRotatingCards()
 * @model
 * @generated
 */
public interface RotatingCards extends EObject
{
  /**
   * Returns the value of the '<em><b>Rotating Zero</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rotating Zero</em>' attribute.
   * @see #setRotatingZero(String)
   * @see org.xtext.example.uno.game.GamePackage#getRotatingCards_RotatingZero()
   * @model
   * @generated
   */
  String getRotatingZero();

  /**
   * Sets the value of the '{@link org.xtext.example.uno.game.RotatingCards#getRotatingZero <em>Rotating Zero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rotating Zero</em>' attribute.
   * @see #getRotatingZero()
   * @generated
   */
  void setRotatingZero(String value);

  /**
   * Returns the value of the '<em><b>Rotating Seven</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rotating Seven</em>' attribute.
   * @see #setRotatingSeven(String)
   * @see org.xtext.example.uno.game.GamePackage#getRotatingCards_RotatingSeven()
   * @model
   * @generated
   */
  String getRotatingSeven();

  /**
   * Sets the value of the '{@link org.xtext.example.uno.game.RotatingCards#getRotatingSeven <em>Rotating Seven</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rotating Seven</em>' attribute.
   * @see #getRotatingSeven()
   * @generated
   */
  void setRotatingSeven(String value);

} // RotatingCards
