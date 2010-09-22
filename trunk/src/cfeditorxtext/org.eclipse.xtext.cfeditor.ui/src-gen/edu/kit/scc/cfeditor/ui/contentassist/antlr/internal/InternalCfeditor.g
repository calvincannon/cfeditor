/*
* generated by Xtext
*/
grammar InternalCfeditor;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package edu.kit.scc.cfeditor.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package edu.kit.scc.cfeditor.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import edu.kit.scc.cfeditor.services.CfeditorGrammarAccess;

}

@parser::members {
 
 	private CfeditorGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(CfeditorGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleCfModel
entryRuleCfModel 
:
{ before(grammarAccess.getCfModelRule()); }
	 ruleCfModel
{ after(grammarAccess.getCfModelRule()); } 
	 EOF 
;

// Rule CfModel
ruleCfModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCfModelAccess().getElementsAssignment()); }
(rule__CfModel__ElementsAssignment)*
{ after(grammarAccess.getCfModelAccess().getElementsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePLACEHOLDER
entryRulePLACEHOLDER 
:
{ before(grammarAccess.getPLACEHOLDERRule()); }
	 rulePLACEHOLDER
{ after(grammarAccess.getPLACEHOLDERRule()); } 
	 EOF 
;

// Rule PLACEHOLDER
rulePLACEHOLDER
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPLACEHOLDERAccess().getAlternatives()); }
(rule__PLACEHOLDER__Alternatives)
{ after(grammarAccess.getPLACEHOLDERAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractElement
entryRuleAbstractElement 
:
{ before(grammarAccess.getAbstractElementRule()); }
	 ruleAbstractElement
{ after(grammarAccess.getAbstractElementRule()); } 
	 EOF 
;

// Rule AbstractElement
ruleAbstractElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractElementAccess().getPartParserRuleCall()); }
	rulePart
{ after(grammarAccess.getAbstractElementAccess().getPartParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePart
entryRulePart 
:
{ before(grammarAccess.getPartRule()); }
	 rulePart
{ after(grammarAccess.getPartRule()); } 
	 EOF 
;

// Rule Part
rulePart
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPartAccess().getAlternatives()); }
(rule__Part__Alternatives)
{ after(grammarAccess.getPartAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBundle
entryRuleBundle 
:
{ before(grammarAccess.getBundleRule()); }
	 ruleBundle
{ after(grammarAccess.getBundleRule()); } 
	 EOF 
;

// Rule Bundle
ruleBundle
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBundleAccess().getGroup()); }
(rule__Bundle__Group__0)
{ after(grammarAccess.getBundleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBody
entryRuleBody 
:
{ before(grammarAccess.getBodyRule()); }
	 ruleBody
{ after(grammarAccess.getBodyRule()); } 
	 EOF 
;

// Rule Body
ruleBody
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBodyAccess().getGroup()); }
(rule__Body__Group__0)
{ after(grammarAccess.getBodyAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBodyFunction
entryRuleBodyFunction 
:
{ before(grammarAccess.getBodyFunctionRule()); }
	 ruleBodyFunction
{ after(grammarAccess.getBodyFunctionRule()); } 
	 EOF 
;

// Rule BodyFunction
ruleBodyFunction
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBodyFunctionAccess().getGroup()); }
(rule__BodyFunction__Group__0)
{ after(grammarAccess.getBodyFunctionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSpecialFunction
entryRuleSpecialFunction 
:
{ before(grammarAccess.getSpecialFunctionRule()); }
	 ruleSpecialFunction
{ after(grammarAccess.getSpecialFunctionRule()); } 
	 EOF 
;

// Rule SpecialFunction
ruleSpecialFunction
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSpecialFunctionAccess().getGroup()); }
(rule__SpecialFunction__Group__0)
{ after(grammarAccess.getSpecialFunctionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBundlePromiseType
entryRuleBundlePromiseType 
:
{ before(grammarAccess.getBundlePromiseTypeRule()); }
	 ruleBundlePromiseType
{ after(grammarAccess.getBundlePromiseTypeRule()); } 
	 EOF 
;

// Rule BundlePromiseType
ruleBundlePromiseType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBundlePromiseTypeAccess().getNameAssignment()); }
(rule__BundlePromiseType__NameAssignment)
{ after(grammarAccess.getBundlePromiseTypeAccess().getNameAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBodyPromiseType
entryRuleBodyPromiseType 
:
{ before(grammarAccess.getBodyPromiseTypeRule()); }
	 ruleBodyPromiseType
{ after(grammarAccess.getBodyPromiseTypeRule()); } 
	 EOF 
;

// Rule BodyPromiseType
ruleBodyPromiseType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBodyPromiseTypeAccess().getNameAssignment()); }
(rule__BodyPromiseType__NameAssignment)
{ after(grammarAccess.getBodyPromiseTypeAccess().getNameAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBundleComponent
entryRuleBundleComponent 
:
{ before(grammarAccess.getBundleComponentRule()); }
	 ruleBundleComponent
{ after(grammarAccess.getBundleComponentRule()); } 
	 EOF 
;

// Rule BundleComponent
ruleBundleComponent
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBundleComponentAccess().getNameAssignment()); }
(rule__BundleComponent__NameAssignment)
{ after(grammarAccess.getBundleComponentAccess().getNameAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBodyComponent
entryRuleBodyComponent 
:
{ before(grammarAccess.getBodyComponentRule()); }
	 ruleBodyComponent
{ after(grammarAccess.getBodyComponentRule()); } 
	 EOF 
;

// Rule BodyComponent
ruleBodyComponent
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBodyComponentAccess().getNameAssignment()); }
(rule__BodyComponent__NameAssignment)
{ after(grammarAccess.getBodyComponentAccess().getNameAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__PLACEHOLDER__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPLACEHOLDERAccess().getANY_OTHERTerminalRuleCall_0()); }
	RULE_ANY_OTHER
{ after(grammarAccess.getPLACEHOLDERAccess().getANY_OTHERTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getPLACEHOLDERAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
{ after(grammarAccess.getPLACEHOLDERAccess().getIDTerminalRuleCall_1()); }
)

    |(
{ before(grammarAccess.getPLACEHOLDERAccess().getSTRINGTerminalRuleCall_2()); }
	RULE_STRING
{ after(grammarAccess.getPLACEHOLDERAccess().getSTRINGTerminalRuleCall_2()); }
)

    |(
{ before(grammarAccess.getPLACEHOLDERAccess().getEqualsSignGreaterThanSignKeyword_3()); }

	'=>' 

{ after(grammarAccess.getPLACEHOLDERAccess().getEqualsSignGreaterThanSignKeyword_3()); }
)

    |(
{ before(grammarAccess.getPLACEHOLDERAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getPLACEHOLDERAccess().getSemicolonKeyword_4()); }
)

    |(
{ before(grammarAccess.getPLACEHOLDERAccess().getCommaKeyword_5()); }

	',' 

{ after(grammarAccess.getPLACEHOLDERAccess().getCommaKeyword_5()); }
)

    |(
{ before(grammarAccess.getPLACEHOLDERAccess().getLeftParenthesisKeyword_6()); }

	'(' 

{ after(grammarAccess.getPLACEHOLDERAccess().getLeftParenthesisKeyword_6()); }
)

    |(
{ before(grammarAccess.getPLACEHOLDERAccess().getRightParenthesisKeyword_7()); }

	')' 

{ after(grammarAccess.getPLACEHOLDERAccess().getRightParenthesisKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Part__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartAccess().getBundleParserRuleCall_0()); }
	ruleBundle
{ after(grammarAccess.getPartAccess().getBundleParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getPartAccess().getBodyParserRuleCall_1()); }
	ruleBody
{ after(grammarAccess.getPartAccess().getBodyParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__Alternatives_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0()); }
(rule__BodyFunction__ValuesAssignment_2_0)
{ after(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0()); }
)

    |(
{ before(grammarAccess.getBodyFunctionAccess().getGroup_2_1()); }
(rule__BodyFunction__Group_2_1__0)
{ after(grammarAccess.getBodyFunctionAccess().getGroup_2_1()); }
)

    |(
{ before(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2()); }
(rule__BodyFunction__FunctionAssignment_2_2)
{ after(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Bundle__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group__0__Impl
	rule__Bundle__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getBundleKeyword_0()); }

	'bundle' 

{ after(grammarAccess.getBundleAccess().getBundleKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group__1__Impl
	rule__Bundle__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getComponentAssignment_1()); }
(rule__Bundle__ComponentAssignment_1)
{ after(grammarAccess.getBundleAccess().getComponentAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group__2__Impl
	rule__Bundle__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getNameAssignment_2()); }
(rule__Bundle__NameAssignment_2)
{ after(grammarAccess.getBundleAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group__3__Impl
	rule__Bundle__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getPLACEHOLDERParserRuleCall_3()); }
(	rulePLACEHOLDER)*
{ after(grammarAccess.getBundleAccess().getPLACEHOLDERParserRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group__4__Impl
	rule__Bundle__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group__5__Impl
	rule__Bundle__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getGroup_5()); }
(rule__Bundle__Group_5__0)*
{ after(grammarAccess.getBundleAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Bundle__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group_5__0__Impl
	rule__Bundle__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getPromiseTypeAssignment_5_0()); }
(rule__Bundle__PromiseTypeAssignment_5_0)
{ after(grammarAccess.getBundleAccess().getPromiseTypeAssignment_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group_5__1__Impl
	rule__Bundle__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getColonKeyword_5_1()); }

	':' 

{ after(grammarAccess.getBundleAccess().getColonKeyword_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getPLACEHOLDERParserRuleCall_5_2()); }
(	rulePLACEHOLDER)*
{ after(grammarAccess.getBundleAccess().getPLACEHOLDERParserRuleCall_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Body__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Body__Group__0__Impl
	rule__Body__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getBodyKeyword_0()); }

	'body' 

{ after(grammarAccess.getBodyAccess().getBodyKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Body__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Body__Group__1__Impl
	rule__Body__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getComponentAssignment_1()); }
(rule__Body__ComponentAssignment_1)
{ after(grammarAccess.getBodyAccess().getComponentAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Body__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Body__Group__2__Impl
	rule__Body__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getNameAssignment_2()); }
(rule__Body__NameAssignment_2)
{ after(grammarAccess.getBodyAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Body__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Body__Group__3__Impl
	rule__Body__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getGroup_3()); }
(rule__Body__Group_3__0)?
{ after(grammarAccess.getBodyAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Body__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Body__Group__4__Impl
	rule__Body__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Body__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Body__Group__5__Impl
	rule__Body__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getPromiseTypeAssignment_5()); }
(rule__Body__PromiseTypeAssignment_5)*
{ after(grammarAccess.getBodyAccess().getPromiseTypeAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Body__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Body__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Body__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Body__Group_3__0__Impl
	rule__Body__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0()); }

	'(' 

{ after(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Body__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Body__Group_3__1__Impl
	rule__Body__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getVariablesAssignment_3_1()); }
(rule__Body__VariablesAssignment_3_1)
{ after(grammarAccess.getBodyAccess().getVariablesAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Body__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Body__Group_3__2__Impl
	rule__Body__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getGroup_3_2()); }
(rule__Body__Group_3_2__0)*
{ after(grammarAccess.getBodyAccess().getGroup_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Body__Group_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Body__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3()); }

	')' 

{ after(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Body__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Body__Group_3_2__0__Impl
	rule__Body__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0()); }

	',' 

{ after(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Body__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Body__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Body__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getVariablesAssignment_3_2_1()); }
(rule__Body__VariablesAssignment_3_2_1)
{ after(grammarAccess.getBodyAccess().getVariablesAssignment_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__BodyFunction__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BodyFunction__Group__0__Impl
	rule__BodyFunction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getNameAssignment_0()); }
(rule__BodyFunction__NameAssignment_0)
{ after(grammarAccess.getBodyFunctionAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BodyFunction__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BodyFunction__Group__1__Impl
	rule__BodyFunction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1()); }

	'=>' 

{ after(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BodyFunction__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BodyFunction__Group__2__Impl
	rule__BodyFunction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getAlternatives_2()); }
(rule__BodyFunction__Alternatives_2)
{ after(grammarAccess.getBodyFunctionAccess().getAlternatives_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BodyFunction__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BodyFunction__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getSemicolonKeyword_3()); }

	';' 

{ after(grammarAccess.getBodyFunctionAccess().getSemicolonKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__BodyFunction__Group_2_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BodyFunction__Group_2_1__0__Impl
	rule__BodyFunction__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__Group_2_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getListAssignment_2_1_0()); }
(rule__BodyFunction__ListAssignment_2_1_0)
{ after(grammarAccess.getBodyFunctionAccess().getListAssignment_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BodyFunction__Group_2_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BodyFunction__Group_2_1__1__Impl
	rule__BodyFunction__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__Group_2_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_1()); }
(rule__BodyFunction__ValuesAssignment_2_1_1)
{ after(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BodyFunction__Group_2_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BodyFunction__Group_2_1__2__Impl
	rule__BodyFunction__Group_2_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__Group_2_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getGroup_2_1_2()); }
(rule__BodyFunction__Group_2_1_2__0)*
{ after(grammarAccess.getBodyFunctionAccess().getGroup_2_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BodyFunction__Group_2_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BodyFunction__Group_2_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__Group_2_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3()); }

	'}' 

{ after(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__BodyFunction__Group_2_1_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BodyFunction__Group_2_1_2__0__Impl
	rule__BodyFunction__Group_2_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__Group_2_1_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0()); }

	',' 

{ after(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BodyFunction__Group_2_1_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BodyFunction__Group_2_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__Group_2_1_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_2_1()); }
(rule__BodyFunction__ValuesAssignment_2_1_2_1)
{ after(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__SpecialFunction__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SpecialFunction__Group__0__Impl
	rule__SpecialFunction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecialFunction__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecialFunctionAccess().getNameAssignment_0()); }
(rule__SpecialFunction__NameAssignment_0)
{ after(grammarAccess.getSpecialFunctionAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SpecialFunction__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SpecialFunction__Group__1__Impl
	rule__SpecialFunction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecialFunction__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SpecialFunction__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SpecialFunction__Group__2__Impl
	rule__SpecialFunction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecialFunction__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecialFunctionAccess().getParametersAssignment_2()); }
(rule__SpecialFunction__ParametersAssignment_2)
{ after(grammarAccess.getSpecialFunctionAccess().getParametersAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SpecialFunction__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SpecialFunction__Group__3__Impl
	rule__SpecialFunction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecialFunction__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecialFunctionAccess().getGroup_3()); }
(rule__SpecialFunction__Group_3__0)*
{ after(grammarAccess.getSpecialFunctionAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SpecialFunction__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SpecialFunction__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecialFunction__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_4()); }

	')' 

{ after(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__SpecialFunction__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SpecialFunction__Group_3__0__Impl
	rule__SpecialFunction__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecialFunction__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_3_0()); }

	',' 

{ after(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SpecialFunction__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SpecialFunction__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecialFunction__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecialFunctionAccess().getParametersAssignment_3_1()); }
(rule__SpecialFunction__ParametersAssignment_3_1)
{ after(grammarAccess.getSpecialFunctionAccess().getParametersAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__CfModel__ElementsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0()); }
	ruleAbstractElement{ after(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__ComponentAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0()); }
	ruleBundleComponent{ after(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__PromiseTypeAssignment_5_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0_0()); }
	ruleBundlePromiseType{ after(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Body__ComponentAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0()); }
	ruleBodyComponent{ after(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Body__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Body__VariablesAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_1_0()); }
	RULE_ID{ after(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Body__VariablesAssignment_3_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_2_1_0()); }
	RULE_ID{ after(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Body__PromiseTypeAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0()); }
	ruleBodyFunction{ after(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0()); }
	ruleBodyPromiseType{ after(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__ValuesAssignment_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0_0()); }
	RULE_STRING{ after(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__ListAssignment_2_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); }
(
{ before(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); }

	'{' 

{ after(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); }
)

{ after(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__ValuesAssignment_2_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0()); }
	RULE_STRING{ after(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__ValuesAssignment_2_1_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0()); }
	RULE_STRING{ after(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BodyFunction__FunctionAssignment_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0()); }
	ruleSpecialFunction{ after(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SpecialFunction__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecialFunctionAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getSpecialFunctionAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SpecialFunction__ParametersAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecialFunctionAccess().getParametersSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getSpecialFunctionAccess().getParametersSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SpecialFunction__ParametersAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpecialFunctionAccess().getParametersSTRINGTerminalRuleCall_3_1_0()); }
	RULE_STRING{ after(grammarAccess.getSpecialFunctionAccess().getParametersSTRINGTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BundlePromiseType__NameAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0()); }
	RULE_ID{ after(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BodyPromiseType__NameAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0()); }
	RULE_ID{ after(grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BundleComponent__NameAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0()); }
	RULE_ID{ after(grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BodyComponent__NameAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0()); }
	RULE_ID{ after(grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' (~(('\\'|'"'))|'\\' .)* '"'|'\'' (~(('\\'|'\''))|'\\' .)* '\'');

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

