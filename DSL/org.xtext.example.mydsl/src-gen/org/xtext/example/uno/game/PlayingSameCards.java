/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.uno.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playing Same Cards</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.uno.game.PlayingSameCards#getSameNumber <em>Same Number</em>}</li>
 *   <li>{@link org.xtext.example.uno.game.PlayingSameCards#getSameColor <em>Same Color</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.uno.game.GamePackage#getPlayingSameCards()
 * @model
 * @generated
 */
public interface PlayingSameCards extends EObject
{
  /**
   * Returns the value of the '<em><b>Same Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Same Number</em>' attribute.
   * @see #setSameNumber(String)
   * @see org.xtext.example.uno.game.GamePackage#getPlayingSameCards_SameNumber()
   * @model
   * @generated
   */
  String getSameNumber();

  /**
   * Sets the value of the '{@link org.xtext.example.uno.game.PlayingSameCards#getSameNumber <em>Same Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Same Number</em>' attribute.
   * @see #getSameNumber()
   * @generated
   */
  void setSameNumber(String value);

  /**
   * Returns the value of the '<em><b>Same Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Same Color</em>' attribute.
   * @see #setSameColor(String)
   * @see org.xtext.example.uno.game.GamePackage#getPlayingSameCards_SameColor()
   * @model
   * @generated
   */
  String getSameColor();

  /**
   * Sets the value of the '{@link org.xtext.example.uno.game.PlayingSameCards#getSameColor <em>Same Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Same Color</em>' attribute.
   * @see #getSameColor()
   * @generated
   */
  void setSameColor(String value);

} // PlayingSameCards
