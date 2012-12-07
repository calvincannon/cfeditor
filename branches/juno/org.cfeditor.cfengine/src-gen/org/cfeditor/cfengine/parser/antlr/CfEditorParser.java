/*
* generated by Xtext
*/
package org.cfeditor.cfengine.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.cfeditor.cfengine.services.CfEditorGrammarAccess;

public class CfEditorParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private CfEditorGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.cfeditor.cfengine.parser.antlr.internal.InternalCfEditorParser createParser(XtextTokenStream stream) {
		return new org.cfeditor.cfengine.parser.antlr.internal.InternalCfEditorParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public CfEditorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CfEditorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}