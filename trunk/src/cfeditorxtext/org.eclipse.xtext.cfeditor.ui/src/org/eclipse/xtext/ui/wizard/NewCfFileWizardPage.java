package org.eclipse.xtext.ui.wizard;

import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.xtext.definitions.CfDefinitionProvider;

/**
 * First page of new .cf file wizard.
 * 
 * @author Andreas Bender
 * 
 */
public class NewCfFileWizardPage extends WizardNewFileCreationPage {

	/**
	 * Constructor. Defines title and description of the wizard page and defines
	 * the default file extension (.cf).
	 * 
	 * @param selection
	 */
	public NewCfFileWizardPage(final IStructuredSelection selection) {
		super("NewCfFileWizardPage", selection);
		setTitle("Cf File");
		setDescription("Creates a new Cf File");
		setFileExtension("cf");
	}

	/**
	 * Returns the initial file content which is written into a new file.
	 * 
	 * @return the default file content
	 */
	@Override
	protected InputStream getInitialContents() {
		final CfDefinitionProvider defProvider = CfDefinitionProvider.getInstance();
		return defProvider.getDefinitionStream("CfFileContents");
	}
}