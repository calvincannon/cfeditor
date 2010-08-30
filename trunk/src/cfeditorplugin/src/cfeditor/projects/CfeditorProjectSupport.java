package cfeditor.projects;

import java.io.ByteArrayInputStream;
import java.net.URI;
import java.util.HashMap;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import cfeditor.definitions.CfDefinitionProvider;

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
			// String[] files = { "inputs/failsafe.cf", "inputs/promises.cf",
			// "inputs/update.cf" };

//			HashMap<String, String> filemap = new HashMap<String, String>();
//			filemap.put("inputs/failsafe.cf", "content1");
//			filemap.put("inputs/promises.cf", "");
//			filemap.put("inputs/update.cf", "bundle agent-type identifier\n{\n\n}");

			HashMap<String, Boolean> filemap = new HashMap<String, Boolean>();
			filemap.put("inputs/failsafe.cf", true);
			filemap.put("inputs/promises.cf", true);
			filemap.put("inputs/update.cf", true);
			filemap.put("inputs/cflib/cfengine_stdlib.cf", true);

			addToProjectStructure(project, paths, filemap);
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
	 * Creates a new file in the file system and in the project structure.
	 * 
	 * @param file
	 */
	/*
	 * private static void createFile(IFile file) { // FileOutputStream out; //
	 * PrintStream p; // try { // out = new
	 * FileOutputStream(file.getLocation().toString()); // p = new
	 * PrintStream(out); // p.println(file.getLocation().toString()); //
	 * p.println(file.getLocation().toOSString()); //
	 * //p.println(file.getLocation().toPortableString()); // p.close(); //
	 * out.close(); // } catch (FileNotFoundException e) { //
	 * e.printStackTrace(); // } catch (IOException e) { // e.printStackTrace();
	 * // } try { // FileInputStream(file.getLocation().toString()); String cont
	 * = "content in file"; byte bytes[] = cont.getBytes(); file.create(new
	 * ByteArrayInputStream(bytes), false, null);// new // byte[0]), // false,
	 * // null); // } catch (FileNotFoundException e) { // e.printStackTrace();
	 * } catch (CoreException e) { e.printStackTrace(); // } catch (IOException
	 * e) { // e.printStackTrace(); } }
	 */

	/**
	 * Creates a new file in the file system and in the project structure.
	 * 
	 * @param file
	 * @param hasContent true if content definition file exists
	 */
	private static void createFile(IFile file, boolean hasContent) {
		CfDefinitionProvider defProvider = new CfDefinitionProvider();

		// try {
		// String cont = content;
		// byte bytes[] = cont.getBytes();
		// file.create(new ByteArrayInputStream(bytes), false, null);
		// } catch (CoreException e) {
		// e.printStackTrace();
		// }
		try {
			if (hasContent) {
				file.create(defProvider.getDefinitionStream(file.getName()), false, null);
			} else
				file.create(new ByteArrayInputStream(new byte[0]), false, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Creates a new file in the file system and in the project structure.
	 * 
	 * @param file
	 * @param content
	 *            initial file content
	 */
	@SuppressWarnings("unused")
	private static void createFile(IFile file, String content) {
		try {
			String cont = content;
			byte bytes[] = cont.getBytes();
			file.create(new ByteArrayInputStream(bytes), false, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates a folder structure and files.
	 * 
	 * @param newProject
	 * @param paths
	 * @param filemap
	 * @throws CoreException
	 */
	private static void addToProjectStructure(IProject newProject, String[] paths, HashMap<String, Boolean> filemap)
			throws CoreException {
		for (String path : paths) {
			IFolder ifolders = newProject.getFolder(path);
			createFolder(ifolders);
		}

		/*
		 * for (String file : files) { IFile ifile = newProject.getFile(file);
		 * createFile(ifile); }
		 */

		for (String filePath : filemap.keySet()) {
			IFile ifile = newProject.getFile(filePath);
			createFile(ifile, filemap.get(filePath));
		}
	}
}
