
package org.cfeditor.cfengine;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CfEditorStandaloneSetup extends CfEditorStandaloneSetupGenerated{

	public static void doSetup() {
		new CfEditorStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

