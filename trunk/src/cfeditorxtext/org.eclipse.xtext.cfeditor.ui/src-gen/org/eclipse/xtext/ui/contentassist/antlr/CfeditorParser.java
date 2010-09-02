/*
* generated by Xtext
*/
package org.eclipse.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.xtext.services.CfeditorGrammarAccess;

public class CfeditorParser extends AbstractContentAssistParser {
	
	@Inject
	private CfeditorGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.xtext.ui.contentassist.antlr.internal.InternalCfeditorParser createParser() {
		org.eclipse.xtext.ui.contentassist.antlr.internal.InternalCfeditorParser result = new org.eclipse.xtext.ui.contentassist.antlr.internal.InternalCfeditorParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPartAccess().getAlternatives(), "rule__Part__Alternatives");
					put(grammarAccess.getMethodeAccess().getAlternatives_1(), "rule__Methode__Alternatives_1");
					put(grammarAccess.getZuweisungAccess().getAlternatives_1_1(), "rule__Zuweisung__Alternatives_1_1");
					put(grammarAccess.getPromiseTypeAccess().getNameAlternatives_0(), "rule__PromiseType__NameAlternatives_0");
					put(grammarAccess.getComponentAccess().getNameAlternatives_0(), "rule__Component__NameAlternatives_0");
					put(grammarAccess.getBundleAccess().getGroup(), "rule__Bundle__Group__0");
					put(grammarAccess.getBundleAccess().getGroup_4(), "rule__Bundle__Group_4__0");
					put(grammarAccess.getBodyAccess().getGroup(), "rule__Body__Group__0");
					put(grammarAccess.getMethodeAccess().getGroup(), "rule__Methode__Group__0");
					put(grammarAccess.getMethodeAccess().getGroup_1_1(), "rule__Methode__Group_1_1__0");
					put(grammarAccess.getMethodeAccess().getGroup_1_1_1(), "rule__Methode__Group_1_1_1__0");
					put(grammarAccess.getZuweisungAccess().getGroup(), "rule__Zuweisung__Group__0");
					put(grammarAccess.getZuweisungAccess().getGroup_1(), "rule__Zuweisung__Group_1__0");
					put(grammarAccess.getCfModelAccess().getElementsAssignment(), "rule__CfModel__ElementsAssignment");
					put(grammarAccess.getBundleAccess().getComponentAssignment_1(), "rule__Bundle__ComponentAssignment_1");
					put(grammarAccess.getBundleAccess().getNameAssignment_2(), "rule__Bundle__NameAssignment_2");
					put(grammarAccess.getBundleAccess().getPromiseTypeAssignment_4_0(), "rule__Bundle__PromiseTypeAssignment_4_0");
					put(grammarAccess.getBundleAccess().getMethodsAssignment_4_2(), "rule__Bundle__MethodsAssignment_4_2");
					put(grammarAccess.getBodyAccess().getComponentAssignment_1(), "rule__Body__ComponentAssignment_1");
					put(grammarAccess.getBodyAccess().getPromiseTypeAssignment_2(), "rule__Body__PromiseTypeAssignment_2");
					put(grammarAccess.getMethodeAccess().getNameAssignment_0(), "rule__Methode__NameAssignment_0");
					put(grammarAccess.getMethodeAccess().getZuweisungAssignment_1_1_0(), "rule__Methode__ZuweisungAssignment_1_1_0");
					put(grammarAccess.getMethodeAccess().getZuweisungAssignment_1_1_1_1(), "rule__Methode__ZuweisungAssignment_1_1_1_1");
					put(grammarAccess.getZuweisungAccess().getNameAssignment_0(), "rule__Zuweisung__NameAssignment_0");
					put(grammarAccess.getPromiseTypeAccess().getNameAssignment(), "rule__PromiseType__NameAssignment");
					put(grammarAccess.getComponentAccess().getNameAssignment(), "rule__Component__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.xtext.ui.contentassist.antlr.internal.InternalCfeditorParser typedParser = (org.eclipse.xtext.ui.contentassist.antlr.internal.InternalCfeditorParser) parser;
			typedParser.entryRuleCfModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}
	
	public CfeditorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CfeditorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}