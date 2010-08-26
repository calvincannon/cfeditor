package cfeditor.editors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

/**
 * Document provider for Cfeditor files
 * 
 * @author Andreas Bender
 * 
 */
public class CfDocumentProvider extends FileDocumentProvider {

	/**
	 * Creates document and connects it with partitioner.
	 * 
	 * @param element
	 * @return document
	 * @throws CoreException
	 * 
	 */
	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);
		if (document != null) {
			IDocumentPartitioner partitioner = new CfPartitioner( // TODO FastPartitioner instead of CfPartitioner
					new CfPartitionScanner(), new String[] { CfPartitionScanner.CF_LISTING,
							CfPartitionScanner.CF_COMMENT });
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		return document;
	}
}
