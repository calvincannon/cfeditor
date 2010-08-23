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
	
	/**
	 * The constructor. Sets default return token.
	 * 
	 * @param attribute the attribute for the default token
	 */
	public SingleTokenScanner(TextAttribute attribute) {
		setDefaultReturnToken(new Token(attribute));
	}
}
