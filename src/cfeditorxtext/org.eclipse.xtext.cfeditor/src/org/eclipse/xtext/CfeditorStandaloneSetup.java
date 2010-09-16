
package org.eclipse.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CfeditorStandaloneSetup extends CfeditorStandaloneSetupGenerated{

	/**
	 * Initializes the language infrastructure.
	 */
	public static void doSetup() {
		new CfeditorStandaloneSetup().createInjectorAndDoEMFRegistration(); //can be omitted if plug-in runs in eclipse
	}
}

