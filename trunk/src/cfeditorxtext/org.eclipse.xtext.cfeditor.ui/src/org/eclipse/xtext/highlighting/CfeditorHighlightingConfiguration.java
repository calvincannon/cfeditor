package org.eclipse.xtext.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class CfeditorHighlightingConfiguration implements
		IHighlightingConfiguration {
	
	public static final String PROMISEHL = "promiseTypeHighlighting";

	//@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(PROMISEHL, "Promise type",
				promiseType());

	}

	public TextStyle promiseType() {
		TextStyle textStyle = new TextStyle();
		// textStyle.setBackgroundColor(new RGB(155, 55, 255));
		// textStyle.setColor(new RGB(5, 10, 20));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

}
