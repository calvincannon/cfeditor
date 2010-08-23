package cfeditor.editors;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * Rule based partition scanner. Defines the different blocks (partitions) in cf-code.
 * 
 * @author Andreas Bender
 *
 */
public class CfPartitionScanner extends RuleBasedPartitionScanner {

	/**
	 * label for default partition
	 */
	public final static String CF_DEFAULT = "__cf_default";
	/**
	 * label for comment partition
	 */
	public final static String CF_COMMENT = "__cf_comment";
	/**
	 * label for listing partition
	 */
	public final static String CF_LISTING = "__cf_listing";

	// public final static String CF_BLOCK = "__cf_block";

	// public final static String CF_START_BRACE = "__cf_start_brace";
	// public final static String CF_END_BRACE = "__cf_end_brace";
	// public final static String CF_QUOTE = "__cf_quote";
	/* public final static String XML_TAG = "__xml_tag"; */

	/**
	 * The Constructor. Defines partition rules.
	 */
	public CfPartitionScanner() {

		IToken cfComment = new Token(CF_COMMENT);
		IToken cfListing = new Token(CF_LISTING);
		// IToken cfBlock = new Token(CF_BLOCK);
		// IToken cfQuote = new Token(CF_QUOTE);
		/* IToken tag = new Token(XML_TAG); */

		IPredicateRule[] rules = new IPredicateRule[2];

		// rules[0] = new SingleLineRule("#", null, cfComment);

		// rules[0] = new MultiLineRule("{", "}", cfBlock);
		rules[0] = new MultiLineRule("=>",";", cfListing);
		rules[1] = new EndOfLineRule("#", cfComment);
		
		/*
		 * rules[1] = new EndOfLineRule("{", cfComment); rules[2] = new
		 * EndOfLineRule("}", cfComment);
		 */
		// rules[1] = new MultiLineRule("\"", "\", cfComment);
		// rules[1] = new TagRule(tag);

		setPredicateRules(rules);
	}

}
