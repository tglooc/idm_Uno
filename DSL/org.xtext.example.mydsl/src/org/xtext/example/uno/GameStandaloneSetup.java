/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.uno;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class GameStandaloneSetup extends GameStandaloneSetupGenerated {

	public static void doSetup() {
		new GameStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}