/*
* generated by Xtext
*/
grammar InternalCfeditor;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.eclipse.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.xtext.ui.contentassist.antlr.internal; 

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
import org.eclipse.xtext.services.CfeditorGrammarAccess;

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



// Entry rule entryRuleMethode
entryRuleMethode 
:
{ before(grammarAccess.getMethodeRule()); }
	 ruleMethode
{ after(grammarAccess.getMethodeRule()); } 
	 EOF 
;

// Rule Methode
ruleMethode
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMethodeAccess().getGroup()); }
(rule__Methode__Group__0)
{ after(grammarAccess.getMethodeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleZuweisung
entryRuleZuweisung 
:
{ before(grammarAccess.getZuweisungRule()); }
	 ruleZuweisung
{ after(grammarAccess.getZuweisungRule()); } 
	 EOF 
;

// Rule Zuweisung
ruleZuweisung
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getZuweisungAccess().getGroup()); }
(rule__Zuweisung__Group__0)
{ after(grammarAccess.getZuweisungAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePromiseType
entryRulePromiseType 
:
{ before(grammarAccess.getPromiseTypeRule()); }
	 rulePromiseType
{ after(grammarAccess.getPromiseTypeRule()); } 
	 EOF 
;

// Rule PromiseType
rulePromiseType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPromiseTypeAccess().getNameAssignment()); }
(rule__PromiseType__NameAssignment)
{ after(grammarAccess.getPromiseTypeAccess().getNameAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleComponent
entryRuleComponent 
:
{ before(grammarAccess.getComponentRule()); }
	 ruleComponent
{ after(grammarAccess.getComponentRule()); } 
	 EOF 
;

// Rule Component
ruleComponent
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getComponentAccess().getNameAssignment()); }
(rule__Component__NameAssignment)
{ after(grammarAccess.getComponentAccess().getNameAssignment()); }
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

rule__Methode__Alternatives_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodeAccess().getSemicolonKeyword_1_0()); }

	';' 

{ after(grammarAccess.getMethodeAccess().getSemicolonKeyword_1_0()); }
)

    |(
{ before(grammarAccess.getMethodeAccess().getGroup_1_1()); }
(rule__Methode__Group_1_1__0)
{ after(grammarAccess.getMethodeAccess().getGroup_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Zuweisung__Alternatives_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getZuweisungAccess().getIDTerminalRuleCall_1_1_0()); }
	RULE_ID
{ after(grammarAccess.getZuweisungAccess().getIDTerminalRuleCall_1_1_0()); }
)

    |(
{ before(grammarAccess.getZuweisungAccess().getSTRINGTerminalRuleCall_1_1_1()); }
	RULE_STRING
{ after(grammarAccess.getZuweisungAccess().getSTRINGTerminalRuleCall_1_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PromiseType__NameAlternatives_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPromiseTypeAccess().getNameAccessKeyword_0_0()); }

	'access' 

{ after(grammarAccess.getPromiseTypeAccess().getNameAccessKeyword_0_0()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameClassesKeyword_0_1()); }

	'classes' 

{ after(grammarAccess.getPromiseTypeAccess().getNameClassesKeyword_0_1()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameCommandsKeyword_0_2()); }

	'commands' 

{ after(grammarAccess.getPromiseTypeAccess().getNameCommandsKeyword_0_2()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameDatabasesKeyword_0_3()); }

	'databases' 

{ after(grammarAccess.getPromiseTypeAccess().getNameDatabasesKeyword_0_3()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameEnvironmentsKeyword_0_4()); }

	'environments' 

{ after(grammarAccess.getPromiseTypeAccess().getNameEnvironmentsKeyword_0_4()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameFilesKeyword_0_5()); }

	'files' 

{ after(grammarAccess.getPromiseTypeAccess().getNameFilesKeyword_0_5()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameInferencesKeyword_0_6()); }

	'inferences' 

{ after(grammarAccess.getPromiseTypeAccess().getNameInferencesKeyword_0_6()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameInterfacesKeyword_0_7()); }

	'interfaces' 

{ after(grammarAccess.getPromiseTypeAccess().getNameInterfacesKeyword_0_7()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameMeasurementsKeyword_0_8()); }

	'measurements' 

{ after(grammarAccess.getPromiseTypeAccess().getNameMeasurementsKeyword_0_8()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameMethodsKeyword_0_9()); }

	'methods' 

{ after(grammarAccess.getPromiseTypeAccess().getNameMethodsKeyword_0_9()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameOccurrencesKeyword_0_10()); }

	'occurrences' 

{ after(grammarAccess.getPromiseTypeAccess().getNameOccurrencesKeyword_0_10()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameOutputsKeyword_0_11()); }

	'outputs' 

{ after(grammarAccess.getPromiseTypeAccess().getNameOutputsKeyword_0_11()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNamePackagesKeyword_0_12()); }

	'packages' 

{ after(grammarAccess.getPromiseTypeAccess().getNamePackagesKeyword_0_12()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameProcessesKeyword_0_13()); }

	'processes' 

{ after(grammarAccess.getPromiseTypeAccess().getNameProcessesKeyword_0_13()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameReportsKeyword_0_14()); }

	'reports' 

{ after(grammarAccess.getPromiseTypeAccess().getNameReportsKeyword_0_14()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameRolesKeyword_0_15()); }

	'roles' 

{ after(grammarAccess.getPromiseTypeAccess().getNameRolesKeyword_0_15()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameServicesKeyword_0_16()); }

	'services' 

{ after(grammarAccess.getPromiseTypeAccess().getNameServicesKeyword_0_16()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameStorageKeyword_0_17()); }

	'storage' 

{ after(grammarAccess.getPromiseTypeAccess().getNameStorageKeyword_0_17()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameTopicsKeyword_0_18()); }

	'topics' 

{ after(grammarAccess.getPromiseTypeAccess().getNameTopicsKeyword_0_18()); }
)

    |(
{ before(grammarAccess.getPromiseTypeAccess().getNameVarsKeyword_0_19()); }

	'vars' 

{ after(grammarAccess.getPromiseTypeAccess().getNameVarsKeyword_0_19()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__NameAlternatives_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getNameCommonKeyword_0_0()); }

	'common' 

{ after(grammarAccess.getComponentAccess().getNameCommonKeyword_0_0()); }
)

    |(
{ before(grammarAccess.getComponentAccess().getNameAgentKeyword_0_1()); }

	'agent' 

{ after(grammarAccess.getComponentAccess().getNameAgentKeyword_0_1()); }
)

    |(
{ before(grammarAccess.getComponentAccess().getNameServerKeyword_0_2()); }

	'server' 

{ after(grammarAccess.getComponentAccess().getNameServerKeyword_0_2()); }
)

    |(
{ before(grammarAccess.getComponentAccess().getNameMonitorKeyword_0_3()); }

	'monitor' 

{ after(grammarAccess.getComponentAccess().getNameMonitorKeyword_0_3()); }
)

    |(
{ before(grammarAccess.getComponentAccess().getNameRunagentKeyword_0_4()); }

	'runagent' 

{ after(grammarAccess.getComponentAccess().getNameRunagentKeyword_0_4()); }
)

    |(
{ before(grammarAccess.getComponentAccess().getNameExecutorKeyword_0_5()); }

	'executor' 

{ after(grammarAccess.getComponentAccess().getNameExecutorKeyword_0_5()); }
)

    |(
{ before(grammarAccess.getComponentAccess().getNameKnowledgeKeyword_0_6()); }

	'knowledge' 

{ after(grammarAccess.getComponentAccess().getNameKnowledgeKeyword_0_6()); }
)

    |(
{ before(grammarAccess.getComponentAccess().getNameReporterKeyword_0_7()); }

	'reporter' 

{ after(grammarAccess.getComponentAccess().getNameReporterKeyword_0_7()); }
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
{ before(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_3()); }
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
{ before(grammarAccess.getBundleAccess().getGroup_4()); }
(rule__Bundle__Group_4__0)*
{ after(grammarAccess.getBundleAccess().getGroup_4()); }
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
{ before(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Bundle__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group_4__0__Impl
	rule__Bundle__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getPromiseTypeAssignment_4_0()); }
(rule__Bundle__PromiseTypeAssignment_4_0)
{ after(grammarAccess.getBundleAccess().getPromiseTypeAssignment_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group_4__1__Impl
	rule__Bundle__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getColonKeyword_4_1()); }

	':' 

{ after(grammarAccess.getBundleAccess().getColonKeyword_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getMethodsAssignment_4_2()); }
(rule__Bundle__MethodsAssignment_4_2)*
{ after(grammarAccess.getBundleAccess().getMethodsAssignment_4_2()); }
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
{ before(grammarAccess.getBodyAccess().getPromiseTypeAssignment_2()); }
(rule__Body__PromiseTypeAssignment_2)
{ after(grammarAccess.getBodyAccess().getPromiseTypeAssignment_2()); }
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
{ before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_3()); }
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
{ before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Methode__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Methode__Group__0__Impl
	rule__Methode__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodeAccess().getNameAssignment_0()); }
(rule__Methode__NameAssignment_0)
{ after(grammarAccess.getMethodeAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Methode__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Methode__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodeAccess().getAlternatives_1()); }
(rule__Methode__Alternatives_1)
{ after(grammarAccess.getMethodeAccess().getAlternatives_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Methode__Group_1_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Methode__Group_1_1__0__Impl
	rule__Methode__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_1_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodeAccess().getZuweisungAssignment_1_1_0()); }
(rule__Methode__ZuweisungAssignment_1_1_0)
{ after(grammarAccess.getMethodeAccess().getZuweisungAssignment_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Methode__Group_1_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Methode__Group_1_1__1__Impl
	rule__Methode__Group_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_1_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodeAccess().getGroup_1_1_1()); }
(rule__Methode__Group_1_1_1__0)*
{ after(grammarAccess.getMethodeAccess().getGroup_1_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Methode__Group_1_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Methode__Group_1_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_1_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodeAccess().getSemicolonKeyword_1_1_2()); }

	';' 

{ after(grammarAccess.getMethodeAccess().getSemicolonKeyword_1_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Methode__Group_1_1_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Methode__Group_1_1_1__0__Impl
	rule__Methode__Group_1_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_1_1_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodeAccess().getCommaKeyword_1_1_1_0()); }

	',' 

{ after(grammarAccess.getMethodeAccess().getCommaKeyword_1_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Methode__Group_1_1_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Methode__Group_1_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_1_1_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodeAccess().getZuweisungAssignment_1_1_1_1()); }
(rule__Methode__ZuweisungAssignment_1_1_1_1)
{ after(grammarAccess.getMethodeAccess().getZuweisungAssignment_1_1_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Zuweisung__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Zuweisung__Group__0__Impl
	rule__Zuweisung__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Zuweisung__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getZuweisungAccess().getNameAssignment_0()); }
(rule__Zuweisung__NameAssignment_0)
{ after(grammarAccess.getZuweisungAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Zuweisung__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Zuweisung__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Zuweisung__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getZuweisungAccess().getGroup_1()); }
(rule__Zuweisung__Group_1__0)?
{ after(grammarAccess.getZuweisungAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Zuweisung__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Zuweisung__Group_1__0__Impl
	rule__Zuweisung__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Zuweisung__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getZuweisungAccess().getEqualsSignGreaterThanSignKeyword_1_0()); }

	'=>' 

{ after(grammarAccess.getZuweisungAccess().getEqualsSignGreaterThanSignKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Zuweisung__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Zuweisung__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Zuweisung__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getZuweisungAccess().getAlternatives_1_1()); }
(rule__Zuweisung__Alternatives_1_1)*
{ after(grammarAccess.getZuweisungAccess().getAlternatives_1_1()); }
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
{ before(grammarAccess.getBundleAccess().getComponentComponentParserRuleCall_1_0()); }
	ruleComponent{ after(grammarAccess.getBundleAccess().getComponentComponentParserRuleCall_1_0()); }
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

rule__Bundle__PromiseTypeAssignment_4_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getPromiseTypePromiseTypeParserRuleCall_4_0_0()); }
	rulePromiseType{ after(grammarAccess.getBundleAccess().getPromiseTypePromiseTypeParserRuleCall_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__MethodsAssignment_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getMethodsMethodeParserRuleCall_4_2_0()); }
	ruleMethode{ after(grammarAccess.getBundleAccess().getMethodsMethodeParserRuleCall_4_2_0()); }
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
{ before(grammarAccess.getBodyAccess().getComponentComponentParserRuleCall_1_0()); }
	ruleComponent{ after(grammarAccess.getBodyAccess().getComponentComponentParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Body__PromiseTypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBodyAccess().getPromiseTypeControlKeyword_2_0()); }
(
{ before(grammarAccess.getBodyAccess().getPromiseTypeControlKeyword_2_0()); }

	'control' 

{ after(grammarAccess.getBodyAccess().getPromiseTypeControlKeyword_2_0()); }
)

{ after(grammarAccess.getBodyAccess().getPromiseTypeControlKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodeAccess().getNameSTRINGTerminalRuleCall_0_0()); }
	RULE_STRING{ after(grammarAccess.getMethodeAccess().getNameSTRINGTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__ZuweisungAssignment_1_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodeAccess().getZuweisungZuweisungParserRuleCall_1_1_0_0()); }
	ruleZuweisung{ after(grammarAccess.getMethodeAccess().getZuweisungZuweisungParserRuleCall_1_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__ZuweisungAssignment_1_1_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodeAccess().getZuweisungZuweisungParserRuleCall_1_1_1_1_0()); }
	ruleZuweisung{ after(grammarAccess.getMethodeAccess().getZuweisungZuweisungParserRuleCall_1_1_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Zuweisung__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getZuweisungAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getZuweisungAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PromiseType__NameAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPromiseTypeAccess().getNameAlternatives_0()); }
(rule__PromiseType__NameAlternatives_0)
{ after(grammarAccess.getPromiseTypeAccess().getNameAlternatives_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__NameAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getNameAlternatives_0()); }
(rule__Component__NameAlternatives_0)
{ after(grammarAccess.getComponentAccess().getNameAlternatives_0()); }
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


