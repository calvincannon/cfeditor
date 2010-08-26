package cfeditor.editors;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.BufferedRuleBasedScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * A simple token scanner which returns a single token with a given attribute.
 * 
 * @author Andreas Bender
 * 
 */
public class SingleTokenScanner extends BufferedRuleBasedScanner {
//	ColorManager manager;
	/**
	 * The constructor. Sets default return token.
	 * 
	 * @param attribute the attribute for the default token
	 */
	public SingleTokenScanner(TextAttribute attribute) {
		//manager =new ColorManager();
		setDefaultReturnToken(new Token(attribute));
//		
//		IToken string =
//			new Token(
//				new TextAttribute(manager.getColor(ICfColorConstants.RED)));
//
//		IRule[] rules = new IRule[1];
//
//		
//		rules[0] = new WhitespaceRule(new XMLWhitespaceDetector());
//
//		setRules(rules);
	}
}
