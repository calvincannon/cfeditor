package cfeditor.editors;


/**
 * Implementation of IWordDetector. Extends {@link CfWordDetector} with the case of a ':' at the end of a word.
 * 
 * @author Andreas Bender
 * 
 */
public class CfFunctionWordDetector extends CfWordDetector {


	/**
	 * @see org.eclipse.jface.text.rules.IWordDetector#isWordPart(char)
	 */
	@Override
	public boolean isWordPart(char c) {
		if (Character.isWhitespace(c)||c==':')return false;
		return true;
	}

}
