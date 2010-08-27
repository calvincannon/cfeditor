package cfeditor.editors;

import java.util.ArrayList;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;

import cfeditor.definitions.CfDefinitionProvider;

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
	 * @param manager
	 *            color manager
	 */
	public CfCodeHeadScanner(ColorManager manager) {
		super(manager);
		IToken wordToken = new Token(new TextAttribute(manager.getColor(ICfColorConstants.CF_WORD), null, 1));
		IToken functionWordToken = new Token(new TextAttribute(manager.getColor(ICfColorConstants.DEFAULT), null, 2));
		IToken quoteToken = new Token(new TextAttribute(manager.getColor(ICfColorConstants.QUOTE)));
		IToken defaultToken = new Token(new TextAttribute(manager.getColor(ICfColorConstants.DEFAULT)));

		// String[] words = {"common", "control", "agent", "server", "monitor",
		// "runagent", "executor",
		// "knowledge", "reporter", "hub", "string", "int", "real", "slist",
		// "ilist", "rlist", "policy", "or",
		// "and", "xor", "dist", "expression", "not", "vars", "classes",
		// "reports", "action", "commands",
		// "databases", "environments", "files", "methods", "interfaces",
		// "outputs", "packages", "processes",
		// "services", "storage", "access", "roles", "topics", "occurrences",
		// "inferences", "measurement" };
		CfDefinitionProvider defProvider = new CfDefinitionProvider();
		ArrayList<String> mainwords = defProvider.getDefinitions("mainwords");
		ArrayList<String> functionwords = defProvider.getDefinitions("functionwords");

		WordRule wordRule = new WordRule(new CfWordDetector(), defaultToken);
		WordRule functionWordRule = new WordRule(new CfFunctionWordDetector(), Token.UNDEFINED);

		for (String strWord : mainwords) {
			wordRule.addWord(strWord, wordToken);
		}

		for (String strWord : functionwords) {
			functionWordRule.addWord(strWord, functionWordToken);
		}
		// for (String strWord : words) {
		// wordRule.addWord(strWord, wordToken);
		// }

		IRule[] rules = new IRule[3];
		// rules[0] = new WordPatternRule(new CfWordDetector(), "body", "",
		// wordToken);
		// rules[1] = new WordPatternRule(new CfWordDetector(), "bundle", "",
		// wordToken);
		rules[0] = new MultiLineRule("\"", "\"", quoteToken, '\\');
		rules[1] = functionWordRule;
		rules[2] = wordRule;

		setRules(rules);
	}
}
