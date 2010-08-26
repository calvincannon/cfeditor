package cfeditor.editors;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * TODO delete
 * @author Andreas Bender
 *
 */
public class CfCommentScanner extends RuleBasedScanner {
	/**
	 * 
	 * @param manager
	 */
	public CfCommentScanner(ColorManager manager) {
		IToken comment = new Token(new TextAttribute(
				manager.getColor(ICfColorConstants.CF_COMMENT)));
		IToken quote = new Token(new TextAttribute(
				manager.getColor(ICfColorConstants.QUOTE)));

		IRule[] rules = new IRule[2];

		// Add rule for double quotes
		rules[0] = new EndOfLineRule("#", comment);
		rules[1] = new MultiLineRule("\"", "\"", quote, '\\');
		//rules[1]=new WordPatternRule(null,"bo", "dy", quote);
		//rules[1]=new 
		// Add a rule for single quotes
		// rules[1] = new SingleLineRule("'", "'", string, '\\');
		// Add generic whitespace rule.
		// rules[2] = new WhitespaceRule(new XMLWhitespaceDetector());

		setRules(rules);
	}
}
