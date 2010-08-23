package cfeditor.editors;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

/**
 * Configuration class for the cf code editor. Manages syntax highlighting.
 * 
 * @author Andreas Bender
 * 
 */
public class CfConfiguration extends SourceViewerConfiguration {
	/**
	 * the color manager
	 */
	private ColorManager colorManager;

	/**
	 * scanner for quoted strings
	 */
	private CfQuoteScanner cfQuoteScanner;

	/**
	 * scanner for comments
	 */
	private CfCommentScanner cfCommentScanner;

	/**
	 * scanner for all partitions
	 */
	private CfCodeScanner cfCodeScanner;

	/**
	 * scanner for default partition
	 */
	private CfCodeHeadScanner cfCodeHeadScanner;

	/**
	 * The Constructor. Sets color manager.
	 * 
	 * @param colorManager
	 */
	public CfConfiguration(ColorManager colorManager) {
		this.colorManager = colorManager;
	}

	/**
	 * Defines allowed content types.
	 * 
	 * @param sourceViewer
	 * @return String array with ids of the content types
	 */
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] { IDocument.DEFAULT_CONTENT_TYPE, CfPartitionScanner.CF_COMMENT,
				CfPartitionScanner.CF_LISTING };
	}

	/**
	 * Returns a comment scanner.
	 * 
	 * @return comment scanner.
	 */
	protected CfCommentScanner getCfCommentScanner() {
		/*
		 * RuleBasedScanner rbs = new RuleBasedScanner();
		 * rbs.setDefaultReturnToken(new Token(new TextAttribute(colorManager
		 * .getColor(ICfColorConstants.CF_COMMENT)))); return rbs;
		 */

		if (cfCommentScanner == null) {
			cfCommentScanner = new CfCommentScanner(colorManager);

			// cfCommentScanner.setDefaultReturnToken(new Token(new
			// TextAttribute(
			// colorManager.getColor(ICfColorConstants.RED))));

		}
		return cfCommentScanner;
	}

	/**
	 * Returns a code scanner.
	 * 
	 * @return code scanner
	 */
	protected CfCodeScanner getCfCodeScanner() {

		if (cfCodeScanner == null) {
			cfCodeScanner = new CfCodeScanner(colorManager);

			cfCodeScanner.setDefaultReturnToken(new Token(new TextAttribute(colorManager
					.getColor(ICfColorConstants.DEFAULT))));
		}
		return cfCodeScanner;
	}

	/**
	 * Returns a code head scanner.
	 * 
	 * @return code head scanner
	 */
	protected CfCodeHeadScanner getCfCodeHeadScanner() {

		if (cfCodeHeadScanner == null) {
			cfCodeHeadScanner = new CfCodeHeadScanner(colorManager);

			cfCodeHeadScanner.setDefaultReturnToken(new Token(new TextAttribute(colorManager
					.getColor(ICfColorConstants.DEFAULT))));
		}
		return cfCodeHeadScanner;
	}

	/**
	 * Returns a standard rule based scanner.
	 * 
	 * @return rule based scanner
	 */
	protected RuleBasedScanner getCfListingScanner() {
		RuleBasedScanner rbs = new RuleBasedScanner();
		rbs.setDefaultReturnToken(new Token(new TextAttribute(colorManager.getColor(ICfColorConstants.RED))));
		return rbs;
	}

	/**
	 * Returns a quote scanner.
	 * 
	 * @return quote scanner
	 */
	protected CfQuoteScanner getCfQuoteScanner() {
		if (cfQuoteScanner == null) {
			cfQuoteScanner = new CfQuoteScanner(colorManager);
			// cfQuoteScanner.setDefaultReturnToken(new Token(new TextAttribute(
			// colorManager.getColor(ICfColorConstants.DEFAULT))));
		}
		return cfQuoteScanner;
	}

	/**
	 * Main method for the syntax highlighting process. Matches code blocks and
	 * rule scanners.
	 * 
	 * @param sourceViewer
	 * @return presentation reconciler
	 * 
	 */
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

		/*
		 * DefaultDamagerRepairer dr = new
		 * DefaultDamagerRepairer(getXMLTagScanner()); reconciler.setDamager(dr,
		 * XMLPartitionScanner.XML_TAG); reconciler.setRepairer(dr,
		 * XMLPartitionScanner.XML_TAG);
		 * 
		 * dr = new DefaultDamagerRepairer(getXMLScanner());
		 * reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		 * reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
		 */

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(new SingleTokenScanner(new TextAttribute(
				colorManager.getColor(ICfColorConstants.CF_COMMENT))));
		reconciler.setDamager(dr, CfPartitionScanner.CF_COMMENT);
		reconciler.setRepairer(dr, CfPartitionScanner.CF_COMMENT);

		dr = new DefaultDamagerRepairer(getCfCodeScanner());
		reconciler.setDamager(dr, CfPartitionScanner.CF_LISTING);
		reconciler.setRepairer(dr, CfPartitionScanner.CF_LISTING);

		dr = new DefaultDamagerRepairer(getCfCodeHeadScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		return reconciler;
	}

}
