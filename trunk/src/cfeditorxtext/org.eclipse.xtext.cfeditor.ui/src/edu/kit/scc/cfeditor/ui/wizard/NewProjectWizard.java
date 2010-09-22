package edu.kit.scc.cfeditor.ui.wizard;

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.xtext.ui.util.FileOpener;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;

import com.google.inject.Inject;

/**
 * Wizard for a new Cfeditor project.
 * 
 * @author Andreas Bender
 *
 */
public class NewProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

	/**
	 * the configuration element
	 */
	private IConfigurationElement _configurationElement;

	private static final Logger logger = Logger.getLogger(XtextNewProjectWizard.class);

	protected IStructuredSelection selection;

	@Inject
	private FileOpener fileOpener;

	private IProjectCreator creator;

	private IWorkbench workbench;

	private WizardNewProjectCreationPage mainPage;

	/**
	 * Constructor. Sets wizard window title.
	 * 
	 * @param creator
	 */
	@Inject
	public NewProjectWizard(IProjectCreator creator) {
		this.creator = creator;
		setNeedsProgressMonitor(true);
		setWindowTitle("New Cfeditor Project");
	}

	/**
	 * Creates the project and updates the perspective (sets current perspective to Cfeditor perspective).
	 */
	@Override
	public boolean performFinish() {
		final IProjectInfo projectInfo = getProjectInfo();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(projectInfo, monitor);
				} catch (Exception e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			logger.error(e.getMessage(), e);
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}

		BasicNewProjectResourceWizard.updatePerspective(_configurationElement);
		return true;
	}

	/**
	 * Runs project creator and opens the first file found in the defined root folder in the editor.
	 * 
	 * @param projectInfo
	 * @param monitor
	 */
	protected void doFinish(final IProjectInfo projectInfo, final IProgressMonitor monitor) {
		try {
			creator.setProjectInfo(projectInfo);
			creator.run(monitor);
			fileOpener.selectAndReveal(creator.getResult());
			fileOpener.openFileToEdit(getShell(), creator.getResult());
		} catch (final InvocationTargetException e) {
			logger.error(e.getMessage(), e);
		} catch (final InterruptedException e) {
			logger.error(e.getMessage(), e);
		}
	}

	/**
	 * Initializes workbench and selection.
	 * 
	 * @param workbench
	 * @param selection
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}

	/**
	 * Returns workbench.
	 * 
	 * @return workbench
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	protected IProjectCreator getCreator() {
		return creator;
	}

	/**
	 * Use this method to read the project settings from the wizard pages and
	 * feed them into the project info class.
	 */
	protected IProjectInfo getProjectInfo() {
		edu.kit.scc.cfeditor.ui.wizard.CfeditorProjectInfo projectInfo = new edu.kit.scc.cfeditor.ui.wizard.CfeditorProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		return projectInfo;
	}

	/**
	 * Use this method to add pages to the wizard. The one-time generated
	 * version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("Cfeditor Project Wizard");
		mainPage.setTitle("Create a Cfeditor Project");
		mainPage.setDescription("Enter a project name.");
		mainPage.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin("edu.kit.scc.cfeditor.ui", "icons/NewCfProjectWizard.png"));
		addPage(mainPage);
	}

	/**
	 * Sets the configuration element.
	 * 
	 * @param config 
	 * @param propertyName 
	 * @param data 
	 * @throws CoreException 
	 */
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		_configurationElement = config;
	}
}