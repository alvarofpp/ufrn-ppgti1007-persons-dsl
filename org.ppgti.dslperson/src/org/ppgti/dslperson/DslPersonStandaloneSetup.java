/*
 * generated by Xtext 2.25.0
 */
package org.ppgti.dslperson;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DslPersonStandaloneSetup extends DslPersonStandaloneSetupGenerated {

	public static void doSetup() {
		new DslPersonStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}