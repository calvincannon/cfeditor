package org.cfeditor.cfengine.ui.wizard;

/*
 * Simple Class for File wizard of cfengine syntax.
 * content is reading from the /template/newFile.cf
 * 
 * @author: Oleg Dulov olegdulov@gmail.com
 * 
 * */

import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class CfengineNewProjectWizard extends Wizard implements INewWizard {
	private WizardNewProjectCreationPage _pageOne;
	public CfengineNewProjectWizard() {
		// TODO Auto-generated constructor stub
		setWindowTitle("Cfengine Project");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		
		final String prjName = _pageOne.getProjectName();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(prjName, monitor);
				} catch (CoreException e) {
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
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		
		return true;
	}
	
	@Override
	 public void addPages() {
	 super.addPages();
	 
	 _pageOne = new WizardNewProjectCreationPage("Cfengine Project Wizard");
	 _pageOne.setTitle("Cfengine Project");
	 _pageOne.setDescription("Creating Cfengine Project");
	 
	 addPage(_pageOne);
	 }
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	private void doFinish(String prjName, IProgressMonitor monitor)	throws CoreException {
        IProgressMonitor progressMonitor = new NullProgressMonitor();

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
	    IProject project = root.getProject(prjName);
	        project.create(progressMonitor);
	        project.open(progressMonitor);

        String dirPath ="/template/newProject/";
        
        /**
    	 * list of all folders which are initially created
    	 */
        String sArray[] = new String[] { "inputs", "inputs/cflib", "inputs/tasks",
    			"inputs/services", "repl", "repl/scripts", "repl/configs", "repl/modules", "repl/scripts/monitors",
    			"repl/scripts/reports", "repl/scripts/services", "repl/scripts/tasks", "repl/configs/services",
    			"repl/configs/tasks"};
        
        try {
	        for (int i = 0; i < sArray.length; i++) {
	    		System.out.println(sArray[i]);
	    		    
				IFolder firstFolder = project.getFolder(sArray[i]);
		        firstFolder.create(true, true, progressMonitor);			        
	        }
		} catch (CoreException e) {
	        e.printStackTrace();
	    }
        
        /*
         * Add initial *.cf files
         * */
        String fArray[] = new String[] { 
        		"inputs/promises.cf", "inputs/update.cf", "inputs/failsafe.cf", "inputs/cflib/cfengine_stdlib.cf"
        		};
        		
        for (int i = 0; i < fArray.length; i++) {	    		    
        	IFile file = project.getFile(fArray[i]);
            
            
            file.create(this.getClass().getResourceAsStream(dirPath+fArray[i]), true, monitor);
		}
        
	}
			
}