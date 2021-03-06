/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.uno.game.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.uno.game.GamePackage;
import org.xtext.example.uno.game.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.uno.game.impl.TimeImpl#getLimited <em>Limited</em>}</li>
 *   <li>{@link org.xtext.example.uno.game.impl.TimeImpl#getUnlimited <em>Unlimited</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeImpl extends MinimalEObjectImpl.Container implements Time
{
  /**
   * The default value of the '{@link #getLimited() <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimited()
   * @generated
   * @ordered
   */
  protected static final String LIMITED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLimited() <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimited()
   * @generated
   * @ordered
   */
  protected String limited = LIMITED_EDEFAULT;

  /**
   * The default value of the '{@link #getUnlimited() <em>Unlimited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnlimited()
   * @generated
   * @ordered
   */
  protected static final String UNLIMITED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnlimited() <em>Unlimited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnlimited()
   * @generated
   * @ordered
   */
  protected String unlimited = UNLIMITED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeImpl()
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
    return GamePackage.Literals.TIME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLimited()
  {
    return limited;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLimited(String newLimited)
  {
    String oldLimited = limited;
    limited = newLimited;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TIME__LIMITED, oldLimited, limited));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUnlimited()
  {
    return unlimited;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnlimited(String newUnlimited)
  {
    String oldUnlimited = unlimited;
    unlimited = newUnlimited;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TIME__UNLIMITED, oldUnlimited, unlimited));
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
      case GamePackage.TIME__LIMITED:
        return getLimited();
      case GamePackage.TIME__UNLIMITED:
        return getUnlimited();
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
      case GamePackage.TIME__LIMITED:
        setLimited((String)newValue);
        return;
      case GamePackage.TIME__UNLIMITED:
        setUnlimited((String)newValue);
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
      case GamePackage.TIME__LIMITED:
        setLimited(LIMITED_EDEFAULT);
        return;
      case GamePackage.TIME__UNLIMITED:
        setUnlimited(UNLIMITED_EDEFAULT);
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
      case GamePackage.TIME__LIMITED:
        return LIMITED_EDEFAULT == null ? limited != null : !LIMITED_EDEFAULT.equals(limited);
      case GamePackage.TIME__UNLIMITED:
        return UNLIMITED_EDEFAULT == null ? unlimited != null : !UNLIMITED_EDEFAULT.equals(unlimited);
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
    result.append(" (limited: ");
    result.append(limited);
    result.append(", unlimited: ");
    result.append(unlimited);
    result.append(')');
    return result.toString();
  }

} //TimeImpl
