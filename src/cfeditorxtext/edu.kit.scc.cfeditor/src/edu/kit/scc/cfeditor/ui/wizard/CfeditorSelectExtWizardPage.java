package edu.kit.scc.cfeditor.ui.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class CfeditorSelectExtWizardPage extends WizardPage implements Listener {

	private Button btCfengine;
	private Button btPuppet;
//	private Button btDummy;

	protected CfeditorSelectExtWizardPage(String pageName) {
		super(pageName);
		setTitle("Create a Cfeditor Project");
		setDescription("Select a Configuration Management Engine.");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin("edu.kit.scc.cfeditor","icons/CfeditorWizard.png"));
	}

	@Override
	public boolean canFlipToNextPage() {
		return false;
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		RowLayout layout = new RowLayout(SWT.VERTICAL);

		composite.setLayout(layout);

		btCfengine = new Button(composite, SWT.RADIO);
		btCfengine.setText("Cfengine Project");
		btCfengine.addListener(SWT.Selection, this);
		
		btPuppet = new Button(composite, SWT.RADIO);
		btPuppet.setText("Puppet Project");
		btPuppet.addListener(SWT.Selection, this);
		btPuppet.setEnabled(false);
//		
//		btDummy = new Button(composite, SWT.RADIO);
//		btDummy.setText("Dummy Project");
//		btDummy.addListener(SWT.Selection, this);
//		btDummy.setEnabled(false);

		setControl(composite);
	}

	@Override
	public void handleEvent(Event event) {
		NewCfProjectWizard cfWizard = (NewCfProjectWizard) getWizard();

		if (btCfengine.getSelection()) {
			cfWizard.setSelectedEngine(CMEngine.CFENGINE);
		} else if (btPuppet.getSelection()) {
			cfWizard.setSelectedEngine(CMEngine.PUPPET);
//		} else if (btDummy.getSelection()) {
//			cfWizard.setSelectedEngine(CMEngine.DUMMY);
		}
		cfWizard.getContainer().updateButtons();
	}

	// public IWizardPage getNextPage() {
	// if (btCfengine.getSelection()) {
	// CfeditorSelectExtWizardPage page = ((NewCfProjectWizard)
	// getWizard()).extensionSelectPage;
	// return page;
	// }
	// return null;
	// }

}
