package org.eclipse.xtext.ui.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewCfFileWizard extends Wizard implements INewWizard {

	private IStructuredSelection selection;
	private NewCfFileWizardPage newFileWizardPage;
	private IWorkbench workbench;

	public NewCfFileWizard() {
		setWindowTitle("New Cf File");
	}

	@Override
	public void addPages() {
		newFileWizardPage = new NewCfFileWizardPage(selection);
		addPage(newFileWizardPage);
	}

	@Override
	public boolean performFinish() {
		IFile file = newFileWizardPage.createNewFile();
		if (file != null)
			return true;
		else
			return false;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}
}