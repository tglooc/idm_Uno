/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.uno.game.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.uno.game.GamePackage;
import org.xtext.example.uno.game.RotatingCards;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotating Cards</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.uno.game.impl.RotatingCardsImpl#getRotatingZero <em>Rotating Zero</em>}</li>
 *   <li>{@link org.xtext.example.uno.game.impl.RotatingCardsImpl#getRotatingSeven <em>Rotating Seven</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotatingCardsImpl extends MinimalEObjectImpl.Container implements RotatingCards
{
  /**
   * The default value of the '{@link #getRotatingZero() <em>Rotating Zero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotatingZero()
   * @generated
   * @ordered
   */
  protected static final String ROTATING_ZERO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRotatingZero() <em>Rotating Zero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotatingZero()
   * @generated
   * @ordered
   */
  protected String rotatingZero = ROTATING_ZERO_EDEFAULT;

  /**
   * The default value of the '{@link #getRotatingSeven() <em>Rotating Seven</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotatingSeven()
   * @generated
   * @ordered
   */
  protected static final String ROTATING_SEVEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRotatingSeven() <em>Rotating Seven</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotatingSeven()
   * @generated
   * @ordered
   */
  protected String rotatingSeven = ROTATING_SEVEN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RotatingCardsImpl()
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
    return GamePackage.Literals.ROTATING_CARDS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRotatingZero()
  {
    return rotatingZero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRotatingZero(String newRotatingZero)
  {
    String oldRotatingZero = rotatingZero;
    rotatingZero = newRotatingZero;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ROTATING_CARDS__ROTATING_ZERO, oldRotatingZero, rotatingZero));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRotatingSeven()
  {
    return rotatingSeven;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRotatingSeven(String newRotatingSeven)
  {
    String oldRotatingSeven = rotatingSeven;
    rotatingSeven = newRotatingSeven;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ROTATING_CARDS__ROTATING_SEVEN, oldRotatingSeven, rotatingSeven));
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
      case GamePackage.ROTATING_CARDS__ROTATING_ZERO:
        return getRotatingZero();
      case GamePackage.ROTATING_CARDS__ROTATING_SEVEN:
        return getRotatingSeven();
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
      case GamePackage.ROTATING_CARDS__ROTATING_ZERO:
        setRotatingZero((String)newValue);
        return;
      case GamePackage.ROTATING_CARDS__ROTATING_SEVEN:
        setRotatingSeven((String)newValue);
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
      case GamePackage.ROTATING_CARDS__ROTATING_ZERO:
        setRotatingZero(ROTATING_ZERO_EDEFAULT);
        return;
      case GamePackage.ROTATING_CARDS__ROTATING_SEVEN:
        setRotatingSeven(ROTATING_SEVEN_EDEFAULT);
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
      case GamePackage.ROTATING_CARDS__ROTATING_ZERO:
        return ROTATING_ZERO_EDEFAULT == null ? rotatingZero != null : !ROTATING_ZERO_EDEFAULT.equals(rotatingZero);
      case GamePackage.ROTATING_CARDS__ROTATING_SEVEN:
        return ROTATING_SEVEN_EDEFAULT == null ? rotatingSeven != null : !ROTATING_SEVEN_EDEFAULT.equals(rotatingSeven);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (rotatingZero: ");
    result.append(rotatingZero);
    result.append(", rotatingSeven: ");
    result.append(rotatingSeven);
    result.append(')');
    return result.toString();
  }

} //RotatingCardsImpl
