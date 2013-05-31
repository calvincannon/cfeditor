package org.cfeditor.cfengine.ui.perspectives;

/*
 * Manage cfEditor Project perspective
 * @author: olegdulov@gmail.com 
 * 
 * */
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class CfenginePerspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		
		// Get the editor area.
        String editorArea = layout.getEditorArea();

        // Top left: Resource Navigator view and Bookmarks view placeholder
        IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.25f,
                editorArea);
        topLeft.addView(IPageLayout.ID_RES_NAV);
        topLeft.addPlaceholder(IPageLayout.ID_BOOKMARKS);

        // Bottom left: Outline view and Property Sheet view
        IFolderLayout bottomLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, 0.50f,
                "topLeft");
        bottomLeft.addView(IPageLayout.ID_OUTLINE);
        bottomLeft.addView(IPageLayout.ID_PROP_SHEET);

        // Bottom right: Task List view
        layout.addView(IPageLayout.ID_TASK_LIST, IPageLayout.BOTTOM, 0.66f, editorArea);
		/*
		defineActions(layout);
	    defineLayout(layout);
	    */
	}

	/*
	 * few File > New and Show View items are added.
	 * */
	public void defineActions(IPageLayout layout) {
        // Add "new wizards".
        layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");
        layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");

        // Add "show views".
        layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
        layout.addShowViewShortcut(IPageLayout.ID_BOOKMARKS);
        layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
        layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
        layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);
	}


	public void defineLayout(IPageLayout layout) {
        // Editors are placed for free.
        String editorArea = layout.getEditorArea();

        // Place navigator and outline to left of
        // editor area.
        IFolderLayout left =
                layout.createFolder("left", IPageLayout.LEFT, (float) 0.26, editorArea);
        left.addView(IPageLayout.ID_PROJECT_EXPLORER);
        left.addView(IPageLayout.ID_OUTLINE);
	}
}
