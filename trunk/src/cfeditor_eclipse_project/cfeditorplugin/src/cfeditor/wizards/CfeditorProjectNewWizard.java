package cfeditor.wizards;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import cfeditor.projects.CfeditorProjectSupport;

/**
 * The project wizard for a Cfeditor project.
 * 
 * @author Andreas Bender
 * 
 */
public class CfeditorProjectNewWizard extends Wizard implements INewWizard, IExecutableExtension {
	/**
	 * the wizard page
	 */
	private WizardNewProjectCreationPage _pageOne;
	/**
	 * the configuration element
	 */
	private IConfigurationElement _configurationElement;

	/**
	 * The constructor. Sets wizard window title.
	 */
	public CfeditorProjectNewWizard() {
		setWindowTitle(Messages.CfeditorProjectNewWizard_WizardTitle);
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * Creates project after finishing the wizard and updates the perspective.
	 */
	@Override
	public boolean performFinish() {
		String name = _pageOne.getProjectName();
		URI location = null;
		if (!_pageOne.useDefaults()) {
			location = _pageOne.getLocationURI();
		} // else location == null
		CfeditorProjectSupport.createProject(name, location);
		BasicNewProjectResourceWizard.updatePerspective(_configurationElement);
		return true;
	}

	/**
	 * Adds pages to the wizard and sets titles and descriptions.
	 */
	@Override
	public void addPages() {
		super.addPages();

		_pageOne = new WizardNewProjectCreationPage(Messages.CfeditorProjectNewWizard_PageName);
		_pageOne.setTitle(Messages.CfeditorProjectNewWizard_PageTitle);
		_pageOne.setDescription(Messages.CfeditorProjectNewWizard_PageDescription);

		addPage(_pageOne);
	}

	/**
	 * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
	 */
	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		_configurationElement = config;

	}

}
