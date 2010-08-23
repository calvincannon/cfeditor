package cfeditor.editors;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * Rule based scanner which can be used for all partitions.
 * 
 * @author Andreas Bender
 *
 */
public class CfCodeScanner extends RuleBasedScanner {

	/**
	 * The constructor. Defines rules for different code areas.
	 * 
	 * @param manager color manager
	 */
	public CfCodeScanner(ColorManager manager) {
		IToken comment = new Token(new TextAttribute(
				manager.getColor(ICfColorConstants.CF_COMMENT)));
		IToken quote = new Token(new TextAttribute(
				manager.getColor(ICfColorConstants.QUOTE)));
//		IToken word = new Token(new TextAttribute(manager.getColor(ICfColorConstants.QUOTE), null,1));

		IRule[] rules = new IRule[2];

		rules[0] = new EndOfLineRule("#", comment);
		rules[1] = new MultiLineRule("\"", "\"", quote, '\\');
		//rules[2] = new WordPatternRule(new CfWordDetector(), "body", "", word);
		// rules[1]=new
		// Add a rule for single quotes
		// rules[1] = new SingleLineRule("'", "'", string, '\\');
		// Add generic whitespace rule.
		// rules[2] = new WhitespaceRule(new XMLWhitespaceDetector());

		setRules(rules);
	}
}
