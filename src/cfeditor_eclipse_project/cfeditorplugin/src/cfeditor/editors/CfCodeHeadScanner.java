package cfeditor.editors;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordPatternRule;

/**
 * Rule based scanner which is used for default partition.
 * 
 * @author Andreas Bender
 *
 */
public class CfCodeHeadScanner extends CfCodeScanner {

	/**
	 * The constructor. Defines rules for different code areas.
	 * 
	 * @param manager color manager
	 */
	public CfCodeHeadScanner(ColorManager manager) {
		super(manager);
		IToken word = new Token(new TextAttribute(manager.getColor(ICfColorConstants.CF_WORD), null,1));

		IRule[] rules = new IRule[1];
		rules[0] = new WordPatternRule(new CfWordDetector(), "body", "", word);

		setRules(rules);
	}

}
