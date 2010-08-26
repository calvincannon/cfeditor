package cfeditor.editors;

import org.eclipse.ui.editors.text.TextEditor;

/**
 * Main class for Cfeditor code editor
 * 
 * @author Andreas Bender
 * 
 */
public class CfEditor extends TextEditor {
	/**
	 * the colorManager
	 */
	private ColorManager colorManager;

	/**
	 * The Constructor. Adds ColorManager, DocumentProvider and
	 * SourceViewerConfiguration to the editor.
	 */
	public CfEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new CfConfiguration(colorManager));
		setDocumentProvider(new CfDocumentProvider());
	}

	/**
	 * @see org.eclipse.ui.editors.text.TextEditor#dispose()
	 */
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
