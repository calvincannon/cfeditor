package edu.kit.scc.cfeditor.cfengine.ui.views;

import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.viewers.TreeNodeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.texteditor.ITextEditor;

import edu.kit.scc.cfeditor.cfengine.ui.reporting.BodyFunctionElement;
import edu.kit.scc.cfeditor.cfengine.ui.reporting.ClassLabelProvider;
import edu.kit.scc.cfeditor.cfengine.ui.reporting.ClassTreeBuilder;

/**
 * This class is responsible for displaying the "Class View". It creates the
 * view window and handles user interactions with the view.
 * 
 * @author Andreas Bender
 * 
 */
public class ClassViewPart extends ViewPart {
	private IProject activeProject;

	private IPartListener2 partListener;
	private IPropertyListener propertyListener;

	private TreeViewer treeViewer;
	private ClassTreeBuilder treeBuilder;

	/**
	 * Creates the graphical tree elements and handles user interactions (double
	 * click event).
	 */
	@Override
	public void createPartControl(Composite parent) {
		treeBuilder = new ClassTreeBuilder();

		treeViewer = new TreeViewer(parent, 0);
		treeViewer.setContentProvider(new TreeNodeContentProvider());
		treeViewer.setLabelProvider(new ClassLabelProvider());

		ColumnViewerToolTipSupport.enableFor(treeViewer);

		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			/**
			 * Handles double click event on a body function. Opens
			 * corresponding file in editor and jumps to the position of the
			 * selected body function.
			 */
			public void doubleClick(DoubleClickEvent event) {
				if (event.getSelection() instanceof ISelection) {
					IStructuredSelection selection = (IStructuredSelection) event.getSelection();
					Object domain = selection.getFirstElement();

					if (domain instanceof TreeNode) {
						if (((TreeNode) domain).getValue() instanceof BodyFunctionElement) {
							BodyFunctionElement functionElement = (BodyFunctionElement) ((TreeNode) domain).getValue();

							URI uri = URI.create(functionElement.getUri());

							try {
								ITextEditor cfEditor = (ITextEditor) IDE.openEditor(PlatformUI.getWorkbench()
										.getActiveWorkbenchWindow().getActivePage(), uri, "org.eclipse.xtext.Cfeditor",
										true);
								cfEditor.selectAndReveal(functionElement.getOffset(), 0);
							} catch (PartInitException e) {
								// ignore
							}
						}
					}
				}
			}
		});
	}

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		treeViewer.getControl().setFocus();

	}

	/**
	 * Initializes the "Class View". Adds part listener to the workbench window.
	 * 
	 * @param site
	 *            current site
	 * @throws PartInitException
	 */
	@Override
	public void init(final IViewSite site) throws PartInitException {
		super.init(site);

		partListener = new IPartListener2() {
			public void partVisible(IWorkbenchPartReference partRef) {
			}

			public void partOpened(IWorkbenchPartReference partRef) {
			}

			public void partInputChanged(IWorkbenchPartReference partRef) {
			}

			public void partHidden(IWorkbenchPartReference partRef) {
			}

			public void partDeactivated(IWorkbenchPartReference partRef) {
			}

			public void partClosed(IWorkbenchPartReference partRef) {
			}

			public void partBroughtToTop(IWorkbenchPartReference partRef) {
			}

			/**
			 * Actualizes the tree if current active project has changed.
			 */
			public void partActivated(IWorkbenchPartReference partRef) {
				IEditorPart editorPart = null;
				try {
					editorPart = partRef.getPage().getActiveEditor();
				} catch (NullPointerException e) {
					// ignore
				}
				if (editorPart != null) {
					editorPart.addPropertyListener(propertyListener);// TODO !

					refreshView(editorPart, false);
				}
			}
		};
		site.getWorkbenchWindow().getPartService().addPartListener(partListener);

		propertyListener = new IPropertyListener() {
			/**
			 * Checks if active editor input has been saved and refreshes view if necessary.
			 */
			public void propertyChanged(Object source, int propId) {
				if (propId == IEditorPart.PROP_DIRTY) {
					IEditorPart editorPart = null;
					try {
						editorPart = site.getWorkbenchWindow().getActivePage().getActiveEditor();

						if (editorPart != null) {
							refreshView(editorPart, true);
						}
					} catch (NullPointerException e) {
						// ignore
					}
				}
			}
		};
	}

	/**
	 * Disposes the view. Removes used listeners from workbench window.
	 */
	public void dispose() {
		super.dispose();
		this.getSite().getWorkbenchWindow().getPartService().removePartListener(partListener);
	}

	/**
	 * Refreshes the body class tree if active project has changed or forceRefresh flag is true.
	 */
	private void refreshView(IEditorPart editorPart, boolean forceRefresh) {
		IProject oldActiveProject = activeProject;

		try {
			IFileEditorInput input = (IFileEditorInput) editorPart.getEditorInput();
			IFile file = input.getFile();
			activeProject = file.getProject();

			if (forceRefresh || null == oldActiveProject || !oldActiveProject.equals(activeProject)) {
				if (treeViewer != null) {
					treeViewer.setInput(treeBuilder.getTreeNodes(activeProject));
				}
			}
		} catch (ClassCastException e) {
			// ignore
		}
	}
}
