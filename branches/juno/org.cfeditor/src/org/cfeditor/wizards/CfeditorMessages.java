package org.cfeditor.wizards;

import org.eclipse.osgi.util.NLS;

public class CfeditorMessages extends NLS {
	private static final String BUNDLE_NAME = "org.cfeditor.wizards.messages"; //$NON-NLS-1$
	public static String AbstractCfeditorProjectWizard_CuswtomPlugin;
	public static String AbstractCfeditorProjectWizard_FromScratch;
	public static String AbstractCfeditorProjectWizard_Location;
	public static String AbstractCfeditorProjectWizard_NewcfEditorProject;
	public static String AbstractCfeditorProjectWizard_SomethingFromScratch;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, CfeditorMessages.class);
	}

	private CfeditorMessages() {
	}
}
