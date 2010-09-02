package org.eclipse.xtext.ui.wizard;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.util.ProjectFactory;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class CfeditorNewProjectCreator extends AbstractProjectCreator {

	@Inject
	private Provider<ProjectFactory> projectFactoryProvider;

	// protected static final String DSL_GENERATOR_PROJECT_NAME =
	// "org.eclipse.xtext.cfeditor.generator";

	protected static final String SRC_ROOT = "inputs";
	// protected static final String SRC_GEN_ROOT = "src-genb";
	protected final List<String> SRC_FOLDER_LIST = ImmutableList.of("inputs",
			"inputs/cflib", "inputs/tasks", "inputs/services", "repl",
			"repl/scripts", "repl/configs", "repl/modules",
			"repl/scripts/monitors", "repl/scripts/reports",
			"repl/scripts/services", "repl/scripts/tasks",
			"repl/configs/services", "repl/configs/tasks");

	@Override
	protected CfeditorProjectInfo getProjectInfo() {
		return (CfeditorProjectInfo) super.getProjectInfo();
	}

	protected String getModelFolderName() {
		return SRC_ROOT;// TODO
	}

	protected List<String> getAllFolders() {
		return SRC_FOLDER_LIST;
	}

	// @Override
	// protected List<String> getRequiredBundles() {
	// List<String> result = Lists.newArrayList(super.getRequiredBundles());
	// result.add(DSL_GENERATOR_PROJECT_NAME);
	// return result;
	// }

	protected void enhanceProject(final IProject project,
			final IProgressMonitor monitor) throws CoreException {
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, getEncoding(), null, true, project
				.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(
				output, null);
		execCtx.getResourceManager().setFileEncoding("Cp1252");
		execCtx.registerMetaModel(new JavaBeansMetaModel());

		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate(
				"org::eclipse::xtext::ui::wizard::CfeditorNewProject::main",
				getProjectInfo());

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	@Override
	protected ProjectFactory createProjectFactory() {
		return projectFactoryProvider.get();
	}

	@Override
	protected ProjectFactory configureProjectFactory(ProjectFactory factory) {
		factory.setProjectName(getProjectInfo().getProjectName());
		factory.addFolders(getAllFolders());
		// factory.addReferencedProjects(getReferencedProjects());
		 factory.addProjectNatures(XtextProjectHelper.NATURE_ID);
		// factory.addBuilderIds(getBuilders());
		return factory;
	}
	
//	@Override
//	protected void execute(final IProgressMonitor monitor)
//			throws CoreException, InvocationTargetException, InterruptedException {
//		SubMonitor subMonitor = SubMonitor.convert(monitor, 
//				getCreateModelProjectMessage(), 
//				2);
//		try {
//			final IProject project = createProject(subMonitor.newChild(1));
//			if (project == null)
//				return;
//			enhanceProject(project, subMonitor.newChild(1));
////			IFile modelFile = getModelFile(project);
////			setResult(modelFile);
//		} finally {
//			subMonitor.done();
//		}
//	}

}