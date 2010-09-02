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
	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getComponentComponentParserRuleCall_1_0(), currentNode); 
	    }
		lv_component_1_0=ruleComponent		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"component",
	        		lv_component_1_0, 
	        		"Component", 
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
)	'{' 
    {
        createLeafNode(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_3(), null); 
    }
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPromiseTypePromiseTypeParserRuleCall_4_0_0(), currentNode); 
	    }
		lv_promiseType_4_0=rulePromiseType		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"promiseType",
	        		lv_promiseType_4_0, 
	        		"PromiseType", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	':' 
    {
        createLeafNode(grammarAccess.getBundleAccess().getColonKeyword_4_1(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getMethodsMethodeParserRuleCall_4_2_0(), currentNode); 
	    }
		lv_methods_6_0=ruleMethode		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"methods",
	        		lv_methods_6_0, 
	        		"Methode", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*)*	'}' 
    {
        createLeafNode(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_5(), null); 
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
	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getComponentComponentParserRuleCall_1_0(), currentNode); 
	    }
		lv_component_1_0=ruleComponent		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"component",
	        		lv_component_1_0, 
	        		"Component", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(
(
		lv_promiseType_2_0=	'control' 
    {
        createLeafNode(grammarAccess.getBodyAccess().getPromiseTypeControlKeyword_2_0(), "promiseType"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "promiseType", lv_promiseType_2_0, "control", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	'{' 
    {
        createLeafNode(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_3(), null); 
    }
	'}' 
    {
        createLeafNode(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4(), null); 
    }
)
;





// Entry rule entryRuleMethode
entryRuleMethode returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getMethodeRule(), currentNode); }
	 iv_ruleMethode=ruleMethode 
	 { $current=$iv_ruleMethode.current; } 
	 EOF 
;

// Rule Methode
ruleMethode returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_name_0_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getMethodeAccess().getNameSTRINGTerminalRuleCall_0_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMethodeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_0_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(	';' 
    {
        createLeafNode(grammarAccess.getMethodeAccess().getSemicolonKeyword_1_0(), null); 
    }

    |((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getMethodeAccess().getZuweisungZuweisungParserRuleCall_1_1_0_0(), currentNode); 
	    }
		lv_zuweisung_2_0=ruleZuweisung		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMethodeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"zuweisung",
	        		lv_zuweisung_2_0, 
	        		"Zuweisung", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(	',' 
    {
        createLeafNode(grammarAccess.getMethodeAccess().getCommaKeyword_1_1_1_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getMethodeAccess().getZuweisungZuweisungParserRuleCall_1_1_1_1_0(), currentNode); 
	    }
		lv_zuweisung_4_0=ruleZuweisung		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMethodeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"zuweisung",
	        		lv_zuweisung_4_0, 
	        		"Zuweisung", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*	';' 
    {
        createLeafNode(grammarAccess.getMethodeAccess().getSemicolonKeyword_1_1_2(), null); 
    }
)))
;





// Entry rule entryRuleZuweisung
entryRuleZuweisung returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getZuweisungRule(), currentNode); }
	 iv_ruleZuweisung=ruleZuweisung 
	 { $current=$iv_ruleZuweisung.current; } 
	 EOF 
;

// Rule Zuweisung
ruleZuweisung returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getZuweisungAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getZuweisungRule().getType().getClassifier());
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
)(	'=>' 
    {
        createLeafNode(grammarAccess.getZuweisungAccess().getEqualsSignGreaterThanSignKeyword_1_0(), null); 
    }
(RULE_ID
    { 
    createLeafNode(grammarAccess.getZuweisungAccess().getIDTerminalRuleCall_1_1_0(), null); 
    }

    |RULE_STRING
    { 
    createLeafNode(grammarAccess.getZuweisungAccess().getSTRINGTerminalRuleCall_1_1_1(), null); 
    }
)*)?)
;





// Entry rule entryRulePromiseType
entryRulePromiseType returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getPromiseTypeRule(), currentNode); }
	 iv_rulePromiseType=rulePromiseType 
	 { $current=$iv_rulePromiseType.current; } 
	 EOF 
;

// Rule PromiseType
rulePromiseType returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
(
(
		lv_name_0_1=	'access' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameAccessKeyword_0_0(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_1, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_2=	'classes' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameClassesKeyword_0_1(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_2, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_3=	'commands' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameCommandsKeyword_0_2(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_3, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_4=	'databases' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameDatabasesKeyword_0_3(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_4, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_5=	'environments' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameEnvironmentsKeyword_0_4(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_5, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_6=	'files' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameFilesKeyword_0_5(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_6, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_7=	'inferences' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameInferencesKeyword_0_6(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_7, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_8=	'interfaces' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameInterfacesKeyword_0_7(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_8, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_9=	'measurements' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameMeasurementsKeyword_0_8(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_9, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_10=	'methods' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameMethodsKeyword_0_9(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_10, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_11=	'occurrences' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameOccurrencesKeyword_0_10(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_11, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_12=	'outputs' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameOutputsKeyword_0_11(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_12, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_13=	'packages' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNamePackagesKeyword_0_12(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_13, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_14=	'processes' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameProcessesKeyword_0_13(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_14, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_15=	'reports' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameReportsKeyword_0_14(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_15, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_16=	'roles' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameRolesKeyword_0_15(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_16, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_17=	'services' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameServicesKeyword_0_16(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_17, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_18=	'storage' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameStorageKeyword_0_17(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_18, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_19=	'topics' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameTopicsKeyword_0_18(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_19, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_20=	'vars' 
    {
        createLeafNode(grammarAccess.getPromiseTypeAccess().getNameVarsKeyword_0_19(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_20, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)

)
)
;





// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getComponentRule(), currentNode); }
	 iv_ruleComponent=ruleComponent 
	 { $current=$iv_ruleComponent.current; } 
	 EOF 
;

// Rule Component
ruleComponent returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
(
(
		lv_name_0_1=	'common' 
    {
        createLeafNode(grammarAccess.getComponentAccess().getNameCommonKeyword_0_0(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_1, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_2=	'agent' 
    {
        createLeafNode(grammarAccess.getComponentAccess().getNameAgentKeyword_0_1(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_2, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_3=	'server' 
    {
        createLeafNode(grammarAccess.getComponentAccess().getNameServerKeyword_0_2(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_3, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_4=	'monitor' 
    {
        createLeafNode(grammarAccess.getComponentAccess().getNameMonitorKeyword_0_3(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_4, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_5=	'runagent' 
    {
        createLeafNode(grammarAccess.getComponentAccess().getNameRunagentKeyword_0_4(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_5, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_6=	'executor' 
    {
        createLeafNode(grammarAccess.getComponentAccess().getNameExecutorKeyword_0_5(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_6, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_7=	'knowledge' 
    {
        createLeafNode(grammarAccess.getComponentAccess().getNameKnowledgeKeyword_0_6(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_7, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_name_0_8=	'reporter' 
    {
        createLeafNode(grammarAccess.getComponentAccess().getNameReporterKeyword_0_7(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0_8, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)

)
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' (~(('\\'|'"'))|'\\' .)* '"'|'\'' (~(('\\'|'\''))|'\\' .)* '\'');

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

