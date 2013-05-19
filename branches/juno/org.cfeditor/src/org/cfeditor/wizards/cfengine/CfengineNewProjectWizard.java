package org.cfeditor.wizards.cfengine;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class CfengineNewProjectWizard extends Wizard implements INewWizard {

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		MessageBox box = new MessageBox(new Shell(),SWT.ICON_INFORMATION);
	    box.setMessage("This part is not implemented yet.");
	    box.open();
	    System.out.print("CfengineNewProjectWizard was called, but ....");
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}
}
