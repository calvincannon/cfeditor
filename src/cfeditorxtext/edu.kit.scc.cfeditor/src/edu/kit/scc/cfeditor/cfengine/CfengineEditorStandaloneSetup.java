
package edu.kit.scc.cfeditor.cfengine;

import edu.kit.scc.cfeditor.cfengine.CfengineEditorStandaloneSetup;


/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CfengineEditorStandaloneSetup extends CfengineEditorStandaloneSetupGenerated{

	/**
	 * Initializes the language infrastructure.
	 */
	public static void doSetup() {
		new CfengineEditorStandaloneSetup().createInjectorAndDoEMFRegistration(); //can be omitted if plug-in runs in eclipse
	}
}

