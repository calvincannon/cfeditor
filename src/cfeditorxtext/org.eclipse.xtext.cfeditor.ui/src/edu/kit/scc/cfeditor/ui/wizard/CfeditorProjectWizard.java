package edu.kit.scc.cfeditor.ui.wizard;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.xtext.ui.wizard.IProjectInfo;

//TODO delete this class (rename NewProjectWizard to CfeditorProjectWizard
/**
 * The project wizard for a Cfeditor project.
 * 
 * @author Andreas Bender
 * 
 */
public class CfeditorProjectWizard extends Wizard implements INewWizard, IExecutableExtension {
	/**
	 * the wizard page
	 */
	private WizardNewProjectCreationPage mainPage;

	/**
	 * the configuration element
	 */
	private IConfigurationElement _configurationElement;

	/**
	 * The constructor. Sets wizard window title.
	 */
	public CfeditorProjectWizard() {
		setWindowTitle("New Cfeditor Project");
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 */
	// @Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * Creates project after finishing the wizard and updates the perspective.
	 */
	@Override
	public boolean performFinish() {
		BasicNewProjectResourceWizard.updatePerspective(_configurationElement);
		return true;
	}// TODO

	/**
	 * Adds pages to the wizard and sets titles and descriptions.
	 */
	@Override
	public void addPages() {
		super.addPages();

		mainPage = new WizardNewProjectCreationPage("Cfeditor Project Wizard");
		mainPage.setTitle("Create a Cfeditor Project");
		mainPage.setDescription("Enter a project name.");
		addPage(mainPage);
	}

	/**
	 * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement,
	 *      java.lang.String, java.lang.Object)
	 */
	// @Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		_configurationElement = config;
	}

	/**
	 * Use this method to read the project settings from the wizard pages and
	 * feed them into the project info class.
	 */
	protected IProjectInfo getProjectInfo() {
		edu.kit.scc.cfeditor.ui.wizard.CfeditorProjectInfo projectInfo = new edu.kit.scc.cfeditor.ui.wizard.CfeditorProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		return projectInfo;
	}// TODO

}
