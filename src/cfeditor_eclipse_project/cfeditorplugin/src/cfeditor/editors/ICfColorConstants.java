package cfeditor.editors;

import org.eclipse.swt.graphics.RGB;

/**
 * Interface which defines color constants used for syntax highlighting.
 * 
 * @author Andreas Bender
 * 
 */
public interface ICfColorConstants {
	/**
	 * RGB value for comments
	 */
	RGB CF_COMMENT = new RGB(63, 127, 95);
	// RGB PROC_INSTR = new RGB(128, 128, 128);
	/**
	 * RGB value for strings
	 */
	RGB STRING = new RGB(0, 128, 0);
	// RGB QUOTE = new RGB(0, 0, 128);
	/**
	 * RGB value for quoted strings
	 */
	RGB QUOTE = new RGB(42, 0, 255);
	/**
	 * default RGB value
	 */
	RGB DEFAULT = new RGB(0, 0, 0);
	/**
	 * RGB value of red
	 */
	RGB RED = new RGB(255, 0, 0);
	/**
	 * RGB value for special words
	 */
	RGB CF_WORD = new RGB(127, 0, 85);
	// RGB TAG = new RGB(0, 0, 128);
}
