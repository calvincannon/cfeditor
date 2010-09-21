/*
* generated by Xtext
*/
grammar InternalCfeditor;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.eclipse.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.services.CfeditorGrammarAccess;

}

@parser::members {

 	private CfeditorGrammarAccess grammarAccess;
 	
    public InternalCfeditorParser(TokenStream input, IAstFactory factory, CfeditorGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "CfModel";	
   	}
   	
   	@Override
   	protected CfeditorGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleCfModel
entryRuleCfModel returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getCfModelRule(), currentNode); }
	 iv_ruleCfModel=ruleCfModel 
	 { $current=$iv_ruleCfModel.current; } 
	 EOF 
;

// Rule CfModel
ruleCfModel returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0(), currentNode); 
	    }
		lv_elements_0_0=ruleAbstractElement		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getCfModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"elements",
	        		lv_elements_0_0, 
	        		"AbstractElement", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*
;





// Entry rule entryRulePLACEHOLDER
entryRulePLACEHOLDER returns [String current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getPLACEHOLDERRule(), currentNode); } 
	 iv_rulePLACEHOLDER=rulePLACEHOLDER 
	 { $current=$iv_rulePLACEHOLDER.current.getText(); }  
	 EOF 
;

// Rule PLACEHOLDER
rulePLACEHOLDER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
    }:
(    this_ANY_OTHER_0=RULE_ANY_OTHER    {
		$current.merge(this_ANY_OTHER_0);
    }

    { 
    createLeafNode(grammarAccess.getPLACEHOLDERAccess().getANY_OTHERTerminalRuleCall_0(), null); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    createLeafNode(grammarAccess.getPLACEHOLDERAccess().getIDTerminalRuleCall_1(), null); 
    }

    |    this_STRING_2=RULE_STRING    {
		$current.merge(this_STRING_2);
    }

    { 
    createLeafNode(grammarAccess.getPLACEHOLDERAccess().getSTRINGTerminalRuleCall_2(), null); 
    }

    |
	kw='=>' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getPLACEHOLDERAccess().getEqualsSignGreaterThanSignKeyword_3(), null); 
    }

    |
	kw=';' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getPLACEHOLDERAccess().getSemicolonKeyword_4(), null); 
    }

    |
	kw=',' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getPLACEHOLDERAccess().getCommaKeyword_5(), null); 
    }

    |
	kw='(' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getPLACEHOLDERAccess().getLeftParenthesisKeyword_6(), null); 
    }

    |
	kw=')' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getPLACEHOLDERAccess().getRightParenthesisKeyword_7(), null); 
    }
)
    ;





// Entry rule entryRuleAbstractElement
entryRuleAbstractElement returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getAbstractElementRule(), currentNode); }
	 iv_ruleAbstractElement=ruleAbstractElement 
	 { $current=$iv_ruleAbstractElement.current; } 
	 EOF 
;

// Rule AbstractElement
ruleAbstractElement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:

    { 
        currentNode=createCompositeNode(grammarAccess.getAbstractElementAccess().getPartParserRuleCall(), currentNode); 
    }
    this_Part_0=rulePart
    { 
        $current = $this_Part_0.current; 
        currentNode = currentNode.getParent();
    }

;





// Entry rule entryRulePart
entryRulePart returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getPartRule(), currentNode); }
	 iv_rulePart=rulePart 
	 { $current=$iv_rulePart.current; } 
	 EOF 
;

// Rule Part
rulePart returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getPartAccess().getBundleParserRuleCall_0(), currentNode); 
    }
    this_Bundle_0=ruleBundle
    { 
        $current = $this_Bundle_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getPartAccess().getBodyParserRuleCall_1(), currentNode); 
    }
    this_Body_1=ruleBody
    { 
        $current = $this_Body_1.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRuleBundle
entryRuleBundle returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getBundleRule(), currentNode); }
	 iv_ruleBundle=ruleBundle 
	 { $current=$iv_ruleBundle.current; } 
	 EOF 
;

// Rule Bundle
ruleBundle returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'bundle' 
    {
        createLeafNode(grammarAccess.getBundleAccess().getBundleKeyword_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0(), currentNode); 
	    }
		lv_component_1_0=ruleBundleComponent		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"component",
	        		lv_component_1_0, 
	        		"BundleComponent", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			createLeafNode(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_2_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(
    { 
        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPLACEHOLDERParserRuleCall_3(), currentNode); 
    }
rulePLACEHOLDER
    { 
        currentNode = currentNode.getParent();
    }
)*	'{' 
    {
        createLeafNode(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4(), null); 
    }
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0_0(), currentNode); 
	    }
		lv_promiseType_5_0=ruleBundlePromiseType		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"promiseType",
	        		lv_promiseType_5_0, 
	        		"BundlePromiseType", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	':' 
    {
        createLeafNode(grammarAccess.getBundleAccess().getColonKeyword_5_1(), null); 
    }
(
    { 
        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPLACEHOLDERParserRuleCall_5_2(), currentNode); 
    }
rulePLACEHOLDER
    { 
        currentNode = currentNode.getParent();
    }
)*)*	'}' 
    {
        createLeafNode(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_6(), null); 
    }
)
;





// Entry rule entryRuleBody
entryRuleBody returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getBodyRule(), currentNode); }
	 iv_ruleBody=ruleBody 
	 { $current=$iv_ruleBody.current; } 
	 EOF 
;

// Rule Body
ruleBody returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'body' 
    {
        createLeafNode(grammarAccess.getBodyAccess().getBodyKeyword_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0(), currentNode); 
	    }
		lv_component_1_0=ruleBodyComponent		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"component",
	        		lv_component_1_0, 
	        		"BodyComponent", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			createLeafNode(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_2_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(	'(' 
    {
        createLeafNode(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0(), null); 
    }
(
(
		lv_variables_4_0=RULE_ID
		{
			createLeafNode(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_1_0(), "variables"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"variables",
	        		lv_variables_4_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(	',' 
    {
        createLeafNode(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0(), null); 
    }
(
(
		lv_variables_6_0=RULE_ID
		{
			createLeafNode(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_2_1_0(), "variables"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"variables",
	        		lv_variables_6_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))*	')' 
    {
        createLeafNode(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3(), null); 
    }
)?	'{' 
    {
        createLeafNode(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0(), currentNode); 
	    }
		lv_promiseType_9_0=ruleBodyFunction		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"promiseType",
	        		lv_promiseType_9_0, 
	        		"BodyFunction", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*	'}' 
    {
        createLeafNode(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_6(), null); 
    }
)
;





// Entry rule entryRuleBodyFunction
entryRuleBodyFunction returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getBodyFunctionRule(), currentNode); }
	 iv_ruleBodyFunction=ruleBodyFunction 
	 { $current=$iv_ruleBodyFunction.current; } 
	 EOF 
;

// Rule BodyFunction
ruleBodyFunction returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0(), currentNode); 
	    }
		lv_name_0_0=ruleBodyPromiseType		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_0_0, 
	        		"BodyPromiseType", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	'=>' 
    {
        createLeafNode(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1(), null); 
    }
((
(
		lv_values_2_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0_0(), "values"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"values",
	        		lv_values_2_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |((
(
		lv_List_3_0=	'{' 
    {
        createLeafNode(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0(), "List"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "List", true, "{", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(
(
		lv_values_4_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0(), "values"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"values",
	        		lv_values_4_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(	',' 
    {
        createLeafNode(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0(), null); 
    }
(
(
		lv_values_6_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0(), "values"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"values",
	        		lv_values_6_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))*	'}' 
    {
        createLeafNode(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3(), null); 
    }
)
    |(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0(), currentNode); 
	    }
		lv_function_8_0=ruleSpecialFunction		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"function",
	        		lv_function_8_0, 
	        		"SpecialFunction", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))	';' 
    {
        createLeafNode(grammarAccess.getBodyFunctionAccess().getSemicolonKeyword_3(), null); 
    }
)
;





// Entry rule entryRuleSpecialFunction
entryRuleSpecialFunction returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getSpecialFunctionRule(), currentNode); }
	 iv_ruleSpecialFunction=ruleSpecialFunction 
	 { $current=$iv_ruleSpecialFunction.current; } 
	 EOF 
;

// Rule SpecialFunction
ruleSpecialFunction returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getSpecialFunctionAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getSpecialFunctionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_0_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	'(' 
    {
        createLeafNode(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1(), null); 
    }
(
(
		lv_parameters_2_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getSpecialFunctionAccess().getParametersSTRINGTerminalRuleCall_2_0(), "parameters"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getSpecialFunctionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"parameters",
	        		lv_parameters_2_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(	',' 
    {
        createLeafNode(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_3_0(), null); 
    }
(
(
		lv_parameters_4_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getSpecialFunctionAccess().getParametersSTRINGTerminalRuleCall_3_1_0(), "parameters"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getSpecialFunctionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"parameters",
	        		lv_parameters_4_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))*	')' 
    {
        createLeafNode(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_4(), null); 
    }
)
;





// Entry rule entryRuleBundlePromiseType
entryRuleBundlePromiseType returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getBundlePromiseTypeRule(), currentNode); }
	 iv_ruleBundlePromiseType=ruleBundlePromiseType 
	 { $current=$iv_ruleBundlePromiseType.current; } 
	 EOF 
;

// Rule BundlePromiseType
ruleBundlePromiseType returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBundlePromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_0_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
;





// Entry rule entryRuleBodyPromiseType
entryRuleBodyPromiseType returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getBodyPromiseTypeRule(), currentNode); }
	 iv_ruleBodyPromiseType=ruleBodyPromiseType 
	 { $current=$iv_ruleBodyPromiseType.current; } 
	 EOF 
;

// Rule BodyPromiseType
ruleBodyPromiseType returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_0_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
;





// Entry rule entryRuleBundleComponent
entryRuleBundleComponent returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getBundleComponentRule(), currentNode); }
	 iv_ruleBundleComponent=ruleBundleComponent 
	 { $current=$iv_ruleBundleComponent.current; } 
	 EOF 
;

// Rule BundleComponent
ruleBundleComponent returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBundleComponentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_0_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
;





// Entry rule entryRuleBodyComponent
entryRuleBodyComponent returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getBodyComponentRule(), currentNode); }
	 iv_ruleBodyComponent=ruleBodyComponent 
	 { $current=$iv_ruleBodyComponent.current; } 
	 EOF 
;

// Rule BodyComponent
ruleBodyComponent returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyComponentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_0_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' (~(('\\'|'"'))|'\\' .)* '"'|'\'' (~(('\\'|'\''))|'\\' .)* '\'');

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

