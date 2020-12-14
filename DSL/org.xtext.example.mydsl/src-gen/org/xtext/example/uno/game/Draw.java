/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.uno.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Draw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.uno.game.Draw#getOneCard <em>One Card</em>}</li>
 *   <li>{@link org.xtext.example.uno.game.Draw#getThreeCards <em>Three Cards</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.uno.game.GamePackage#getDraw()
 * @model
 * @generated
 */
public interface Draw extends EObject
{
  /**
   * Returns the value of the '<em><b>One Card</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>One Card</em>' attribute.
   * @see #setOneCard(String)
   * @see org.xtext.example.uno.game.GamePackage#getDraw_OneCard()
   * @model
   * @generated
   */
  String getOneCard();

  /**
   * Sets the value of the '{@link org.xtext.example.uno.game.Draw#getOneCard <em>One Card</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>One Card</em>' attribute.
   * @see #getOneCard()
   * @generated
   */
  void setOneCard(String value);

  /**
   * Returns the value of the '<em><b>Three Cards</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Three Cards</em>' attribute.
   * @see #setThreeCards(String)
   * @see org.xtext.example.uno.game.GamePackage#getDraw_ThreeCards()
   * @model
   * @generated
   */
  String getThreeCards();

  /**
   * Sets the value of the '{@link org.xtext.example.uno.game.Draw#getThreeCards <em>Three Cards</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Three Cards</em>' attribute.
   * @see #getThreeCards()
   * @generated
   */
  void setThreeCards(String value);

} // Draw