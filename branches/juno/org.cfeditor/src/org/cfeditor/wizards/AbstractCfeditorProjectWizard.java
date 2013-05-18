package org.cfeditor.wizards;

import java.net.URI;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public abstract class AbstractCfeditorProjectWizard extends Wizard implements INewWizard {

	private static final String WIZARD_TITLE = CfeditorMessages.AbstractCfeditorProjectWizard_NewcfEditorProject;

	private static final String PAGE_NAME = CfeditorMessages.AbstractCfeditorProjectWizard_CuswtomPlugin;

	private WizardNewProjectCreationPage _pageOne;

	public AbstractCfeditorProjectWizard() {
		setWindowTitle(WIZARD_TITLE);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPages() {
		super.addPages();

		_pageOne = new WizardNewProjectCreationPage(PAGE_NAME);
		_pageOne.setTitle(CfeditorMessages.AbstractCfeditorProjectWizard_FromScratch);
		_pageOne.setDescription(CfeditorMessages.AbstractCfeditorProjectWizard_SomethingFromScratch);

		addPage(_pageOne);
	}

	@Override
	public boolean performFinish() {
		String name = _pageOne.getProjectName();
		URI location = null;
		if (!_pageOne.useDefaults()) {
			location = _pageOne.getLocationURI();
			System.err.println(CfeditorMessages.AbstractCfeditorProjectWizard_Location + location.toString());
		} // else location == null

		//call abstract Creator
		AbstractCfeditorProjectCreator.createProject(name, location);

		return true;
	}

}
