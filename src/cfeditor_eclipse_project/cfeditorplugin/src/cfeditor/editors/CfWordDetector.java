package cfeditor.editors;

import org.eclipse.jface.text.rules.IWordDetector;

/**
 * Implementation of IWordDetector
 * 
 * @author Andreas Bender
 * 
 */
public class CfWordDetector implements IWordDetector {

	/**
	 * @see org.eclipse.jface.text.rules.IWordDetector#isWordStart(char)
	 */
	@Override
	public boolean isWordStart(char c) {
//		if (Character.isLetterOrDigit(c))
//			return true; 
//		return false; // or isWhitespace??
		
		if (Character.isWhitespace(c))return false;
		return true;
	}

	/**
	 * @see org.eclipse.jface.text.rules.IWordDetector#isWordPart(char)
	 */
	@Override
	public boolean isWordPart(char c) {
//		if (Character.isLetterOrDigit(c))
//			return true; 
//		return false; // or isWhitespace??
		
		if (Character.isWhitespace(c))return false;
		return true;
	}

}
