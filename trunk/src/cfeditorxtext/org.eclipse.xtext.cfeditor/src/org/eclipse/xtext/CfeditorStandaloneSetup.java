
package org.eclipse.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CfeditorStandaloneSetup extends CfeditorStandaloneSetupGenerated{

	public static void doSetup() {
		new CfeditorStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

