package cfeditor.editors;

import org.eclipse.jface.text.rules.IWordDetector;

/**
 * Implementation of IWordDetector
 * 
 * @author Andreas Bender
 *
 */
public class CfWordDetector implements IWordDetector{

	/**
	 * @see org.eclipse.jface.text.rules.IWordDetector#isWordStart(char)
	 */
	@Override
	public boolean isWordStart(char c) {
		//if(c == 'b')return true;
		return false;
	}

	/**
	 * @see org.eclipse.jface.text.rules.IWordDetector#isWordPart(char)
	 */
	@Override
	public boolean isWordPart(char c) {
		//if(c== 'o' ||c== 'd' ||c== 'y')return true;
		return false;
	}

}
