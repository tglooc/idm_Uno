/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.uno.game.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.uno.game.Draw;
import org.xtext.example.uno.game.Game;
import org.xtext.example.uno.game.GameFactory;
import org.xtext.example.uno.game.GamePackage;
import org.xtext.example.uno.game.PlayingSameCards;
import org.xtext.example.uno.game.RotatingCards;
import org.xtext.example.uno.game.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GamePackageImpl extends EPackageImpl implements GamePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rotatingCardsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass playingSameCardsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass drawEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.uno.game.GamePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GamePackageImpl()
  {
    super(eNS_URI, GameFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link GamePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GamePackage init()
  {
    if (isInited) return (GamePackage)EPackage.Registry.INSTANCE.getEPackage(GamePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredGamePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    GamePackageImpl theGamePackage = registeredGamePackage instanceof GamePackageImpl ? (GamePackageImpl)registeredGamePackage : new GamePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theGamePackage.createPackageContents();

    // Initialize created meta-data
    theGamePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGamePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GamePackage.eNS_URI, theGamePackage);
    return theGamePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGame()
  {
    return gameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGame_TwoPlayers()
  {
    return (EAttribute)gameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGame_Time()
  {
    return (EReference)gameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGame_RotatingCards()
  {
    return (EReference)gameEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGame_PlayingSameCards()
  {
    return (EReference)gameEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGame_Draw()
  {
    return (EReference)gameEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTime()
  {
    return timeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTime_Limited()
  {
    return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTime_Unlimited()
  {
    return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRotatingCards()
  {
    return rotatingCardsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRotatingCards_RotatingZero()
  {
    return (EAttribute)rotatingCardsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRotatingCards_RotatingSeven()
  {
    return (EAttribute)rotatingCardsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPlayingSameCards()
  {
    return playingSameCardsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlayingSameCards_SameNumber()
  {
    return (EAttribute)playingSameCardsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlayingSameCards_SameColor()
  {
    return (EAttribute)playingSameCardsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDraw()
  {
    return drawEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDraw_OneCard()
  {
    return (EAttribute)drawEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDraw_ThreeCards()
  {
    return (EAttribute)drawEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GameFactory getGameFactory()
  {
    return (GameFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    gameEClass = createEClass(GAME);
    createEAttribute(gameEClass, GAME__TWO_PLAYERS);
    createEReference(gameEClass, GAME__TIME);
    createEReference(gameEClass, GAME__ROTATING_CARDS);
    createEReference(gameEClass, GAME__PLAYING_SAME_CARDS);
    createEReference(gameEClass, GAME__DRAW);

    timeEClass = createEClass(TIME);
    createEAttribute(timeEClass, TIME__LIMITED);
    createEAttribute(timeEClass, TIME__UNLIMITED);

    rotatingCardsEClass = createEClass(ROTATING_CARDS);
    createEAttribute(rotatingCardsEClass, ROTATING_CARDS__ROTATING_ZERO);
    createEAttribute(rotatingCardsEClass, ROTATING_CARDS__ROTATING_SEVEN);

    playingSameCardsEClass = createEClass(PLAYING_SAME_CARDS);
    createEAttribute(playingSameCardsEClass, PLAYING_SAME_CARDS__SAME_NUMBER);
    createEAttribute(playingSameCardsEClass, PLAYING_SAME_CARDS__SAME_COLOR);

    drawEClass = createEClass(DRAW);
    createEAttribute(drawEClass, DRAW__ONE_CARD);
    createEAttribute(drawEClass, DRAW__THREE_CARDS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGame_TwoPlayers(), ecorePackage.getEString(), "twoPlayers", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGame_Time(), this.getTime(), null, "time", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGame_RotatingCards(), this.getRotatingCards(), null, "rotatingCards", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGame_PlayingSameCards(), this.getPlayingSameCards(), null, "playingSameCards", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGame_Draw(), this.getDraw(), null, "draw", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTime_Limited(), ecorePackage.getEString(), "limited", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTime_Unlimited(), ecorePackage.getEString(), "unlimited", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rotatingCardsEClass, RotatingCards.class, "RotatingCards", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRotatingCards_RotatingZero(), ecorePackage.getEString(), "rotatingZero", null, 0, 1, RotatingCards.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRotatingCards_RotatingSeven(), ecorePackage.getEString(), "rotatingSeven", null, 0, 1, RotatingCards.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(playingSameCardsEClass, PlayingSameCards.class, "PlayingSameCards", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlayingSameCards_SameNumber(), ecorePackage.getEString(), "sameNumber", null, 0, 1, PlayingSameCards.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlayingSameCards_SameColor(), ecorePackage.getEString(), "sameColor", null, 0, 1, PlayingSameCards.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(drawEClass, Draw.class, "Draw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDraw_OneCard(), ecorePackage.getEString(), "oneCard", null, 0, 1, Draw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDraw_ThreeCards(), ecorePackage.getEString(), "threeCards", null, 0, 1, Draw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GamePackageImpl
