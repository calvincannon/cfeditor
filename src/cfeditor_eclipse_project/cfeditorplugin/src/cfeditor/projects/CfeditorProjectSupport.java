package cfeditor.projects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

/**
 * Defines the structure of a Cfeditor project.
 * 
 * @author Andreas Bender
 * 
 */
public class CfeditorProjectSupport {
	/**
	 * Creates Cfeditor eclipse project and defines the folder structure.
	 * 
	 * @param projectName
	 * @param location
	 * @return eclipse project
	 */
	public static IProject createProject(String projectName, URI location) {

		IProject project = createBaseProject(projectName, location);
		try {
			String[] paths = { "inputs/cflib", "inputs/tasks", "inputs/services", "repl/scripts", "repl/configs",
					"repl/modules", "repl/scripts/monitors", "repl/scripts/reports", "repl/scripts/services",
					"repl/scripts/tasks", "repl/configs/services", "repl/configs/tasks" };
			String[] files = { "inputs/failsafe.cf", "inputs/promises.cf", "inputs/update.cf" };
			addToProjectStructure(project, paths, files);
		} catch (CoreException e) {
			e.printStackTrace();
			project = null;
		}

		return project;
	}

	/**
	 * Creates a basic project.
	 * 
	 * @param location
	 * @param projectName
	 * @return base project
	 */
	private static IProject createBaseProject(String projectName, URI location) {
		IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);

		if (!newProject.exists()) {
			URI projectLocation = location;
			IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
			if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
				projectLocation = null;
			}

			desc.setLocationURI(projectLocation);
			try {
				newProject.create(desc, null);
				if (!newProject.isOpen()) {
					newProject.open(null);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return newProject;
	}

	/**
	 * Creates a folder in the project structure.
	 * 
	 * @param folder
	 * @throws CoreException
	 */
	private static void createFolder(IFolder folder) throws CoreException {
		IContainer parent = folder.getParent();
		if (parent instanceof IFolder) {
			createFolder((IFolder) parent);
		}
		if (!folder.exists()) {
			folder.create(false, true, null);
		}
	}

	/**
	 * Creates a new file in the project.
	 * 
	 * @param file
	 */
	private static void createFile(IFile file) {
		FileOutputStream out;
		// PrintStream p;

		try {
			out = new FileOutputStream(file.getName());

			// p = new PrintStream(out);
			//
			// p.println(file.getName());
			//
			// p.close();

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			file.create(new FileInputStream(file.getName()), false, null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates a folder structure and files.
	 * 
	 * @param newProject
	 * @param paths
	 * @param files
	 * @throws CoreException
	 */
	private static void addToProjectStructure(IProject newProject, String[] paths, String[] files) throws CoreException {
		for (String path : paths) {
			IFolder ifolders = newProject.getFolder(path);
			createFolder(ifolders);
		}

		for (String file : files) {
			IFile ifile = newProject.getFile(file);
			createFile(ifile);
		}
	}

}
