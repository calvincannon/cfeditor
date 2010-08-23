package cfeditor.wizards;

import org.eclipse.osgi.util.NLS;

/**
 * Define externalized strings.
 * 
 * @author Andreas Bender
 * 
 */
public class Messages extends NLS {
	/**
	 * the bundle name
	 */
	private static final String BUNDLE_NAME = "cfeditor.wizards.messages"; //$NON-NLS-1$
	/**
	 * CfeditorProjectNewWizard_PageDescription
	 */
	public static String CfeditorProjectNewWizard_PageDescription;
	/**
	 * CfeditorProjectNewWizard_PageName
	 */
	public static String CfeditorProjectNewWizard_PageName;
	/**
	 * CfeditorProjectNewWizard_PageTitle;
	 */
	public static String CfeditorProjectNewWizard_PageTitle;
	/**
	 * CfeditorProjectNewWizard_WizardTitle
	 */
	public static String CfeditorProjectNewWizard_WizardTitle;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	/**
	 * 
	 */
	private Messages() {
	}
}
