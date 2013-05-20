package org.cfeditor.wizards;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;

import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardDescriptor;

/*
 *This class is instantiated from plugin.xml
 *as navigator & ui handler 
 * */

public class NewCfProjectWizard extends Wizard implements INewWizard {
	private CfeditorSelectExtWizardPage extensionSelectPage;
	private CMEngine selectedEngine = null;

	public NewCfProjectWizard() {
		setWindowTitle("New Cfeditor Project");
	}

	public void addPages() {
		extensionSelectPage = new CfeditorSelectExtWizardPage("Cfeditor Project Wizard");
		addPage(extensionSelectPage);
	}

	@Override
	public boolean performFinish() {

		switch (selectedEngine) {
		case CFENGINE:
			try {
				//CfengineNewProjectWizard 
				openWizard("org.cfeditor.cfengine.ui.wizard.CfengineNewProjectWizard");
			} catch (CoreException e) {
				return false;
			}
			return true;
		case PUPPET:
			try {
				openWizard("org.cfeditor.wizards.puppet.PuppetNewProjectWizard");
			} catch (CoreException e) {
				return false;
			}
			return true;
			// case DUMMY:
			// break;
		}

		return false;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public boolean canFinish() {
		if (null != selectedEngine) {
			return true;
		}
		return false;
	}

	public void setSelectedEngine(CMEngine selectedEngine) {
		this.selectedEngine = selectedEngine;
	}

	public CMEngine getSelectedEngine() {
		return selectedEngine;
	}

	public  void openWizard(String id) throws CoreException {
		 
		 IWizardDescriptor descriptor;
				 
		 	// First see if this is a "new wizard".
		 	descriptor = PlatformUI.getWorkbench()
				 	.getNewWizardRegistry().findWizard(id);
		
			 System.out.print("getNewWizardRegistry: "+PlatformUI.getWorkbench().getNewWizardRegistry());

			 
		 // If not check if it is an "import wizard".
		 if  (descriptor == null) {
			 descriptor = PlatformUI.getWorkbench()
					 .getImportWizardRegistry().findWizard(id);
		 }

		 // Or maybe an export wizard
		 if  (descriptor == null) {
			 descriptor = PlatformUI.getWorkbench()
					 .getExportWizardRegistry().findWizard(id);
		 }
		 
		 try  {
		   // Then if we have a wizard, open it.
		   if  (descriptor != null) {
			   	System.out.print("descriptor seems to be not null, but ....");

			     IWizard wizard = descriptor.createWizard();
			     WizardDialog wd = new WizardDialog(this.getShell(), wizard);
			     wd.setTitle(wizard.getWindowTitle());
			     wd.open();
		   }
		 } catch  (CoreException e) {
			 	e.printStackTrace();
		 }
	}
}
