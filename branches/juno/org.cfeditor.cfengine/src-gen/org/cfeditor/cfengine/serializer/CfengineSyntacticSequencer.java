package org.cfeditor.cfengine.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.cfeditor.cfengine.services.CfengineGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CfengineSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CfengineGrammarAccess grammarAccess;
	protected AbstractElementAlias match_SpecialFunction___ANY_OTHERTerminalRuleCall_2_0_or_CommaKeyword_2_3_or_IDTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_2__a;
	protected AbstractElementAlias match_SpecialFunction_______DollarSignLeftCurlyBracketKeyword_2_5_0_IDTerminalRuleCall_2_5_1_RightCurlyBracketKeyword_2_5_2___or___DollarSignLeftParenthesisKeyword_2_4_0_IDTerminalRuleCall_2_4_1_RightParenthesisKeyword_2_4_2_______ANY_OTHERTerminalRuleCall_2_0_or_CommaKeyword_2_3_or_IDTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_2__a__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CfengineGrammarAccess) access;
		match_SpecialFunction___ANY_OTHERTerminalRuleCall_2_0_or_CommaKeyword_2_3_or_IDTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_2__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_3()), new TokenAlias(false, false, grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2()));
		match_SpecialFunction_______DollarSignLeftCurlyBracketKeyword_2_5_0_IDTerminalRuleCall_2_5_1_RightCurlyBracketKeyword_2_5_2___or___DollarSignLeftParenthesisKeyword_2_4_0_IDTerminalRuleCall_2_4_1_RightParenthesisKeyword_2_4_2_______ANY_OTHERTerminalRuleCall_2_0_or_CommaKeyword_2_3_or_IDTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_2__a__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_2_5_0()), new TokenAlias(false, false, grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_5_1()), new TokenAlias(false, false, grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_2_5_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_2_4_0()), new TokenAlias(false, false, grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_4_1()), new TokenAlias(false, false, grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_2_4_2()))), new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_3()), new TokenAlias(false, false, grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getANY_OTHERRule())
			return getANY_OTHERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ANY_OTHER:
	 * 	.;
	 */
	protected String getANY_OTHERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal ID:
	 * 	('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING:
	 * 	'"' (!('\\' | '"') | '\\' .)* '"' |
	 * 	"'" (!('\\' | "'") | '\\' .)* "'";
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_SpecialFunction___ANY_OTHERTerminalRuleCall_2_0_or_CommaKeyword_2_3_or_IDTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_2__a.equals(syntax))
				emit_SpecialFunction___ANY_OTHERTerminalRuleCall_2_0_or_CommaKeyword_2_3_or_IDTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SpecialFunction_______DollarSignLeftCurlyBracketKeyword_2_5_0_IDTerminalRuleCall_2_5_1_RightCurlyBracketKeyword_2_5_2___or___DollarSignLeftParenthesisKeyword_2_4_0_IDTerminalRuleCall_2_4_1_RightParenthesisKeyword_2_4_2_______ANY_OTHERTerminalRuleCall_2_0_or_CommaKeyword_2_3_or_IDTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_2__a__a.equals(syntax))
				emit_SpecialFunction_______DollarSignLeftCurlyBracketKeyword_2_5_0_IDTerminalRuleCall_2_5_1_RightCurlyBracketKeyword_2_5_2___or___DollarSignLeftParenthesisKeyword_2_4_0_IDTerminalRuleCall_2_4_1_RightParenthesisKeyword_2_4_2_______ANY_OTHERTerminalRuleCall_2_0_or_CommaKeyword_2_3_or_IDTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_2__a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (',' | STRING | ID | ANY_OTHER)*
	 */
	protected void emit_SpecialFunction___ANY_OTHERTerminalRuleCall_2_0_or_CommaKeyword_2_3_or_IDTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ((('$(' ID ')') | ('${' ID '}')) (',' | STRING | ID | ANY_OTHER)*)*
	 */
	protected void emit_SpecialFunction_______DollarSignLeftCurlyBracketKeyword_2_5_0_IDTerminalRuleCall_2_5_1_RightCurlyBracketKeyword_2_5_2___or___DollarSignLeftParenthesisKeyword_2_4_0_IDTerminalRuleCall_2_4_1_RightParenthesisKeyword_2_4_2_______ANY_OTHERTerminalRuleCall_2_0_or_CommaKeyword_2_3_or_IDTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_2__a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
