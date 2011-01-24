/*
 * generated by Xtext
 */
package edu.kit.scc.cfeditor.cfengine.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

import edu.kit.scc.cfeditor.cfengine.services.CfengineEditorGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 */
public class CfengineEditorFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		CfengineEditorGrammarAccess f = (CfengineEditorGrammarAccess) getGrammarAccess();

		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());

		// ...
	}
}