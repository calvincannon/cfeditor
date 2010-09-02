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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfeditorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bundle'", "'{'", "':'", "'}'", "'body'", "'control'", "';'", "','", "'=>'", "'access'", "'classes'", "'commands'", "'databases'", "'environments'", "'files'", "'inferences'", "'interfaces'", "'measurements'", "'methods'", "'occurrences'", "'outputs'", "'packages'", "'processes'", "'reports'", "'roles'", "'services'", "'storage'", "'topics'", "'vars'", "'common'", "'agent'", "'server'", "'monitor'", "'runagent'", "'executor'", "'knowledge'", "'reporter'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=9;
    public static final int RULE_INT=6;
    public static final int RULE_WS=8;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=7;

        public InternalCfeditorParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g"; }



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



    // $ANTLR start entryRuleCfModel
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:77:1: entryRuleCfModel returns [EObject current=null] : iv_ruleCfModel= ruleCfModel EOF ;
    public final EObject entryRuleCfModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCfModel = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:78:2: (iv_ruleCfModel= ruleCfModel EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:79:2: iv_ruleCfModel= ruleCfModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCfModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleCfModel_in_entryRuleCfModel75);
            iv_ruleCfModel=ruleCfModel();
            _fsp--;

             current =iv_ruleCfModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCfModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCfModel


    // $ANTLR start ruleCfModel
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:86:1: ruleCfModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleCfModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:91:6: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:92:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:92:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==10||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:93:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:93:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:94:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleCfModel130);
            	    lv_elements_0_0=ruleAbstractElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCfModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_0_0, 
            	    	        		"AbstractElement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCfModel


    // $ANTLR start entryRuleAbstractElement
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:124:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:125:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:126:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166);
            iv_ruleAbstractElement=ruleAbstractElement();
            _fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbstractElement


    // $ANTLR start ruleAbstractElement
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:133:1: ruleAbstractElement returns [EObject current=null] : this_Part_0= rulePart ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Part_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:138:6: (this_Part_0= rulePart )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:140:5: this_Part_0= rulePart
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAbstractElementAccess().getPartParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_rulePart_in_ruleAbstractElement222);
            this_Part_0=rulePart();
            _fsp--;

             
                    current = this_Part_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbstractElement


    // $ANTLR start entryRulePart
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:156:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:157:2: (iv_rulePart= rulePart EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:158:2: iv_rulePart= rulePart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPartRule(), currentNode); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart256);
            iv_rulePart=rulePart();
            _fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart266); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePart


    // $ANTLR start rulePart
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:165:1: rulePart returns [EObject current=null] : (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        EObject this_Bundle_0 = null;

        EObject this_Body_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:170:6: ( (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:171:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:171:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("171:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:172:5: this_Bundle_0= ruleBundle
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getBundleParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBundle_in_rulePart313);
                    this_Bundle_0=ruleBundle();
                    _fsp--;

                     
                            current = this_Bundle_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:182:5: this_Body_1= ruleBody
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getBodyParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBody_in_rulePart340);
                    this_Body_1=ruleBody();
                    _fsp--;

                     
                            current = this_Body_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePart


    // $ANTLR start entryRuleBundle
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:198:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:199:2: (iv_ruleBundle= ruleBundle EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:200:2: iv_ruleBundle= ruleBundle EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle375);
            iv_ruleBundle=ruleBundle();
            _fsp--;

             current =iv_ruleBundle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle385); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBundle


    // $ANTLR start ruleBundle
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:207:1: ruleBundle returns [EObject current=null] : ( 'bundle' ( (lv_component_1_0= ruleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) '{' ( ( (lv_promiseType_4_0= rulePromiseType ) ) ':' ( (lv_methods_6_0= ruleMethode ) )* )* '}' ) ;
    public final EObject ruleBundle() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_component_1_0 = null;

        EObject lv_promiseType_4_0 = null;

        EObject lv_methods_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:212:6: ( ( 'bundle' ( (lv_component_1_0= ruleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) '{' ( ( (lv_promiseType_4_0= rulePromiseType ) ) ':' ( (lv_methods_6_0= ruleMethode ) )* )* '}' ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:213:1: ( 'bundle' ( (lv_component_1_0= ruleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) '{' ( ( (lv_promiseType_4_0= rulePromiseType ) ) ':' ( (lv_methods_6_0= ruleMethode ) )* )* '}' )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:213:1: ( 'bundle' ( (lv_component_1_0= ruleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) '{' ( ( (lv_promiseType_4_0= rulePromiseType ) ) ':' ( (lv_methods_6_0= ruleMethode ) )* )* '}' )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:213:3: 'bundle' ( (lv_component_1_0= ruleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) '{' ( ( (lv_promiseType_4_0= rulePromiseType ) ) ':' ( (lv_methods_6_0= ruleMethode ) )* )* '}'
            {
            match(input,10,FOLLOW_10_in_ruleBundle420); 

                    createLeafNode(grammarAccess.getBundleAccess().getBundleKeyword_0(), null); 
                
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:217:1: ( (lv_component_1_0= ruleComponent ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:218:1: (lv_component_1_0= ruleComponent )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:218:1: (lv_component_1_0= ruleComponent )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:219:3: lv_component_1_0= ruleComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getComponentComponentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleComponent_in_ruleBundle441);
            lv_component_1_0=ruleComponent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"component",
            	        		lv_component_1_0, 
            	        		"Component", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:241:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:242:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:242:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:243:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle458); 

            			createLeafNode(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,11,FOLLOW_11_in_ruleBundle473); 

                    createLeafNode(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:269:1: ( ( (lv_promiseType_4_0= rulePromiseType ) ) ':' ( (lv_methods_6_0= ruleMethode ) )* )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=19 && LA4_0<=38)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:269:2: ( (lv_promiseType_4_0= rulePromiseType ) ) ':' ( (lv_methods_6_0= ruleMethode ) )*
            	    {
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:269:2: ( (lv_promiseType_4_0= rulePromiseType ) )
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:270:1: (lv_promiseType_4_0= rulePromiseType )
            	    {
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:270:1: (lv_promiseType_4_0= rulePromiseType )
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:271:3: lv_promiseType_4_0= rulePromiseType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPromiseTypePromiseTypeParserRuleCall_4_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePromiseType_in_ruleBundle495);
            	    lv_promiseType_4_0=rulePromiseType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"promiseType",
            	    	        		lv_promiseType_4_0, 
            	    	        		"PromiseType", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,12,FOLLOW_12_in_ruleBundle505); 

            	            createLeafNode(grammarAccess.getBundleAccess().getColonKeyword_4_1(), null); 
            	        
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:297:1: ( (lv_methods_6_0= ruleMethode ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_STRING) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:298:1: (lv_methods_6_0= ruleMethode )
            	    	    {
            	    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:298:1: (lv_methods_6_0= ruleMethode )
            	    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:299:3: lv_methods_6_0= ruleMethode
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getMethodsMethodeParserRuleCall_4_2_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMethode_in_ruleBundle526);
            	    	    lv_methods_6_0=ruleMethode();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        try {
            	    	    	       		add(
            	    	    	       			current, 
            	    	    	       			"methods",
            	    	    	        		lv_methods_6_0, 
            	    	    	        		"Methode", 
            	    	    	        		currentNode);
            	    	    	        } catch (ValueConverterException vce) {
            	    	    				handleValueConverterException(vce);
            	    	    	        }
            	    	    	        currentNode = currentNode.getParent();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleBundle539); 

                    createLeafNode(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBundle


    // $ANTLR start entryRuleBody
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:333:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:334:2: (iv_ruleBody= ruleBody EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:335:2: iv_ruleBody= ruleBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody575);
            iv_ruleBody=ruleBody();
            _fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody585); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBody


    // $ANTLR start ruleBody
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:342:1: ruleBody returns [EObject current=null] : ( 'body' ( (lv_component_1_0= ruleComponent ) ) ( (lv_promiseType_2_0= 'control' ) ) '{' '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token lv_promiseType_2_0=null;
        EObject lv_component_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:347:6: ( ( 'body' ( (lv_component_1_0= ruleComponent ) ) ( (lv_promiseType_2_0= 'control' ) ) '{' '}' ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:348:1: ( 'body' ( (lv_component_1_0= ruleComponent ) ) ( (lv_promiseType_2_0= 'control' ) ) '{' '}' )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:348:1: ( 'body' ( (lv_component_1_0= ruleComponent ) ) ( (lv_promiseType_2_0= 'control' ) ) '{' '}' )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:348:3: 'body' ( (lv_component_1_0= ruleComponent ) ) ( (lv_promiseType_2_0= 'control' ) ) '{' '}'
            {
            match(input,14,FOLLOW_14_in_ruleBody620); 

                    createLeafNode(grammarAccess.getBodyAccess().getBodyKeyword_0(), null); 
                
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:352:1: ( (lv_component_1_0= ruleComponent ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:353:1: (lv_component_1_0= ruleComponent )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:353:1: (lv_component_1_0= ruleComponent )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:354:3: lv_component_1_0= ruleComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getComponentComponentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleComponent_in_ruleBody641);
            lv_component_1_0=ruleComponent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"component",
            	        		lv_component_1_0, 
            	        		"Component", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:376:2: ( (lv_promiseType_2_0= 'control' ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:377:1: (lv_promiseType_2_0= 'control' )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:377:1: (lv_promiseType_2_0= 'control' )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:378:3: lv_promiseType_2_0= 'control'
            {
            lv_promiseType_2_0=(Token)input.LT(1);
            match(input,15,FOLLOW_15_in_ruleBody659); 

                    createLeafNode(grammarAccess.getBodyAccess().getPromiseTypeControlKeyword_2_0(), "promiseType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "promiseType", lv_promiseType_2_0, "control", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,11,FOLLOW_11_in_ruleBody682); 

                    createLeafNode(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            match(input,13,FOLLOW_13_in_ruleBody692); 

                    createLeafNode(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBody


    // $ANTLR start entryRuleMethode
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:413:1: entryRuleMethode returns [EObject current=null] : iv_ruleMethode= ruleMethode EOF ;
    public final EObject entryRuleMethode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethode = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:414:2: (iv_ruleMethode= ruleMethode EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:415:2: iv_ruleMethode= ruleMethode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMethodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleMethode_in_entryRuleMethode728);
            iv_ruleMethode=ruleMethode();
            _fsp--;

             current =iv_ruleMethode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethode738); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMethode


    // $ANTLR start ruleMethode
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:422:1: ruleMethode returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( ';' | ( ( (lv_zuweisung_2_0= ruleZuweisung ) ) ( ',' ( (lv_zuweisung_4_0= ruleZuweisung ) ) )* ';' ) ) ) ;
    public final EObject ruleMethode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_zuweisung_2_0 = null;

        EObject lv_zuweisung_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:427:6: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( ';' | ( ( (lv_zuweisung_2_0= ruleZuweisung ) ) ( ',' ( (lv_zuweisung_4_0= ruleZuweisung ) ) )* ';' ) ) ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:428:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( ';' | ( ( (lv_zuweisung_2_0= ruleZuweisung ) ) ( ',' ( (lv_zuweisung_4_0= ruleZuweisung ) ) )* ';' ) ) )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:428:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( ';' | ( ( (lv_zuweisung_2_0= ruleZuweisung ) ) ( ',' ( (lv_zuweisung_4_0= ruleZuweisung ) ) )* ';' ) ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:428:2: ( (lv_name_0_0= RULE_STRING ) ) ( ';' | ( ( (lv_zuweisung_2_0= ruleZuweisung ) ) ( ',' ( (lv_zuweisung_4_0= ruleZuweisung ) ) )* ';' ) )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:428:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:429:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:429:1: (lv_name_0_0= RULE_STRING )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:430:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMethode780); 

            			createLeafNode(grammarAccess.getMethodeAccess().getNameSTRINGTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMethodeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:452:2: ( ';' | ( ( (lv_zuweisung_2_0= ruleZuweisung ) ) ( ',' ( (lv_zuweisung_4_0= ruleZuweisung ) ) )* ';' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("452:2: ( ';' | ( ( (lv_zuweisung_2_0= ruleZuweisung ) ) ( ',' ( (lv_zuweisung_4_0= ruleZuweisung ) ) )* ';' ) )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:452:4: ';'
                    {
                    match(input,16,FOLLOW_16_in_ruleMethode796); 

                            createLeafNode(grammarAccess.getMethodeAccess().getSemicolonKeyword_1_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:457:6: ( ( (lv_zuweisung_2_0= ruleZuweisung ) ) ( ',' ( (lv_zuweisung_4_0= ruleZuweisung ) ) )* ';' )
                    {
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:457:6: ( ( (lv_zuweisung_2_0= ruleZuweisung ) ) ( ',' ( (lv_zuweisung_4_0= ruleZuweisung ) ) )* ';' )
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:457:7: ( (lv_zuweisung_2_0= ruleZuweisung ) ) ( ',' ( (lv_zuweisung_4_0= ruleZuweisung ) ) )* ';'
                    {
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:457:7: ( (lv_zuweisung_2_0= ruleZuweisung ) )
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:458:1: (lv_zuweisung_2_0= ruleZuweisung )
                    {
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:458:1: (lv_zuweisung_2_0= ruleZuweisung )
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:459:3: lv_zuweisung_2_0= ruleZuweisung
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMethodeAccess().getZuweisungZuweisungParserRuleCall_1_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleZuweisung_in_ruleMethode824);
                    lv_zuweisung_2_0=ruleZuweisung();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMethodeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"zuweisung",
                    	        		lv_zuweisung_2_0, 
                    	        		"Zuweisung", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:481:2: ( ',' ( (lv_zuweisung_4_0= ruleZuweisung ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:481:4: ',' ( (lv_zuweisung_4_0= ruleZuweisung ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleMethode835); 

                    	            createLeafNode(grammarAccess.getMethodeAccess().getCommaKeyword_1_1_1_0(), null); 
                    	        
                    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:485:1: ( (lv_zuweisung_4_0= ruleZuweisung ) )
                    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:486:1: (lv_zuweisung_4_0= ruleZuweisung )
                    	    {
                    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:486:1: (lv_zuweisung_4_0= ruleZuweisung )
                    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:487:3: lv_zuweisung_4_0= ruleZuweisung
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMethodeAccess().getZuweisungZuweisungParserRuleCall_1_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleZuweisung_in_ruleMethode856);
                    	    lv_zuweisung_4_0=ruleZuweisung();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMethodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"zuweisung",
                    	    	        		lv_zuweisung_4_0, 
                    	    	        		"Zuweisung", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleMethode868); 

                            createLeafNode(grammarAccess.getMethodeAccess().getSemicolonKeyword_1_1_2(), null); 
                        

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMethode


    // $ANTLR start entryRuleZuweisung
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:521:1: entryRuleZuweisung returns [EObject current=null] : iv_ruleZuweisung= ruleZuweisung EOF ;
    public final EObject entryRuleZuweisung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZuweisung = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:522:2: (iv_ruleZuweisung= ruleZuweisung EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:523:2: iv_ruleZuweisung= ruleZuweisung EOF
            {
             currentNode = createCompositeNode(grammarAccess.getZuweisungRule(), currentNode); 
            pushFollow(FOLLOW_ruleZuweisung_in_entryRuleZuweisung906);
            iv_ruleZuweisung=ruleZuweisung();
            _fsp--;

             current =iv_ruleZuweisung; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleZuweisung916); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleZuweisung


    // $ANTLR start ruleZuweisung
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:530:1: ruleZuweisung returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( '=>' ( RULE_ID | RULE_STRING )* )? ) ;
    public final EObject ruleZuweisung() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:535:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( '=>' ( RULE_ID | RULE_STRING )* )? ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:536:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '=>' ( RULE_ID | RULE_STRING )* )? )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:536:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '=>' ( RULE_ID | RULE_STRING )* )? )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:536:2: ( (lv_name_0_0= RULE_ID ) ) ( '=>' ( RULE_ID | RULE_STRING )* )?
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:536:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:537:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:537:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:538:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleZuweisung958); 

            			createLeafNode(grammarAccess.getZuweisungAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getZuweisungRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:560:2: ( '=>' ( RULE_ID | RULE_STRING )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:560:4: '=>' ( RULE_ID | RULE_STRING )*
                    {
                    match(input,18,FOLLOW_18_in_ruleZuweisung974); 

                            createLeafNode(grammarAccess.getZuweisungAccess().getEqualsSignGreaterThanSignKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:564:1: ( RULE_ID | RULE_STRING )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }
                        else if ( (LA7_0==RULE_STRING) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:564:2: RULE_ID
                    	    {
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleZuweisung984); 
                    	     
                    	        createLeafNode(grammarAccess.getZuweisungAccess().getIDTerminalRuleCall_1_1_0(), null); 
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:569:6: RULE_STRING
                    	    {
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleZuweisung998); 
                    	     
                    	        createLeafNode(grammarAccess.getZuweisungAccess().getSTRINGTerminalRuleCall_1_1_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleZuweisung


    // $ANTLR start entryRulePromiseType
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:581:1: entryRulePromiseType returns [EObject current=null] : iv_rulePromiseType= rulePromiseType EOF ;
    public final EObject entryRulePromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePromiseType = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:582:2: (iv_rulePromiseType= rulePromiseType EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:583:2: iv_rulePromiseType= rulePromiseType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPromiseTypeRule(), currentNode); 
            pushFollow(FOLLOW_rulePromiseType_in_entryRulePromiseType1037);
            iv_rulePromiseType=rulePromiseType();
            _fsp--;

             current =iv_rulePromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePromiseType1047); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePromiseType


    // $ANTLR start rulePromiseType
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:590:1: rulePromiseType returns [EObject current=null] : ( ( (lv_name_0_1= 'access' | lv_name_0_2= 'classes' | lv_name_0_3= 'commands' | lv_name_0_4= 'databases' | lv_name_0_5= 'environments' | lv_name_0_6= 'files' | lv_name_0_7= 'inferences' | lv_name_0_8= 'interfaces' | lv_name_0_9= 'measurements' | lv_name_0_10= 'methods' | lv_name_0_11= 'occurrences' | lv_name_0_12= 'outputs' | lv_name_0_13= 'packages' | lv_name_0_14= 'processes' | lv_name_0_15= 'reports' | lv_name_0_16= 'roles' | lv_name_0_17= 'services' | lv_name_0_18= 'storage' | lv_name_0_19= 'topics' | lv_name_0_20= 'vars' ) ) ) ;
    public final EObject rulePromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;
        Token lv_name_0_7=null;
        Token lv_name_0_8=null;
        Token lv_name_0_9=null;
        Token lv_name_0_10=null;
        Token lv_name_0_11=null;
        Token lv_name_0_12=null;
        Token lv_name_0_13=null;
        Token lv_name_0_14=null;
        Token lv_name_0_15=null;
        Token lv_name_0_16=null;
        Token lv_name_0_17=null;
        Token lv_name_0_18=null;
        Token lv_name_0_19=null;
        Token lv_name_0_20=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:595:6: ( ( ( (lv_name_0_1= 'access' | lv_name_0_2= 'classes' | lv_name_0_3= 'commands' | lv_name_0_4= 'databases' | lv_name_0_5= 'environments' | lv_name_0_6= 'files' | lv_name_0_7= 'inferences' | lv_name_0_8= 'interfaces' | lv_name_0_9= 'measurements' | lv_name_0_10= 'methods' | lv_name_0_11= 'occurrences' | lv_name_0_12= 'outputs' | lv_name_0_13= 'packages' | lv_name_0_14= 'processes' | lv_name_0_15= 'reports' | lv_name_0_16= 'roles' | lv_name_0_17= 'services' | lv_name_0_18= 'storage' | lv_name_0_19= 'topics' | lv_name_0_20= 'vars' ) ) ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:596:1: ( ( (lv_name_0_1= 'access' | lv_name_0_2= 'classes' | lv_name_0_3= 'commands' | lv_name_0_4= 'databases' | lv_name_0_5= 'environments' | lv_name_0_6= 'files' | lv_name_0_7= 'inferences' | lv_name_0_8= 'interfaces' | lv_name_0_9= 'measurements' | lv_name_0_10= 'methods' | lv_name_0_11= 'occurrences' | lv_name_0_12= 'outputs' | lv_name_0_13= 'packages' | lv_name_0_14= 'processes' | lv_name_0_15= 'reports' | lv_name_0_16= 'roles' | lv_name_0_17= 'services' | lv_name_0_18= 'storage' | lv_name_0_19= 'topics' | lv_name_0_20= 'vars' ) ) )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:596:1: ( ( (lv_name_0_1= 'access' | lv_name_0_2= 'classes' | lv_name_0_3= 'commands' | lv_name_0_4= 'databases' | lv_name_0_5= 'environments' | lv_name_0_6= 'files' | lv_name_0_7= 'inferences' | lv_name_0_8= 'interfaces' | lv_name_0_9= 'measurements' | lv_name_0_10= 'methods' | lv_name_0_11= 'occurrences' | lv_name_0_12= 'outputs' | lv_name_0_13= 'packages' | lv_name_0_14= 'processes' | lv_name_0_15= 'reports' | lv_name_0_16= 'roles' | lv_name_0_17= 'services' | lv_name_0_18= 'storage' | lv_name_0_19= 'topics' | lv_name_0_20= 'vars' ) ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:597:1: ( (lv_name_0_1= 'access' | lv_name_0_2= 'classes' | lv_name_0_3= 'commands' | lv_name_0_4= 'databases' | lv_name_0_5= 'environments' | lv_name_0_6= 'files' | lv_name_0_7= 'inferences' | lv_name_0_8= 'interfaces' | lv_name_0_9= 'measurements' | lv_name_0_10= 'methods' | lv_name_0_11= 'occurrences' | lv_name_0_12= 'outputs' | lv_name_0_13= 'packages' | lv_name_0_14= 'processes' | lv_name_0_15= 'reports' | lv_name_0_16= 'roles' | lv_name_0_17= 'services' | lv_name_0_18= 'storage' | lv_name_0_19= 'topics' | lv_name_0_20= 'vars' ) )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:597:1: ( (lv_name_0_1= 'access' | lv_name_0_2= 'classes' | lv_name_0_3= 'commands' | lv_name_0_4= 'databases' | lv_name_0_5= 'environments' | lv_name_0_6= 'files' | lv_name_0_7= 'inferences' | lv_name_0_8= 'interfaces' | lv_name_0_9= 'measurements' | lv_name_0_10= 'methods' | lv_name_0_11= 'occurrences' | lv_name_0_12= 'outputs' | lv_name_0_13= 'packages' | lv_name_0_14= 'processes' | lv_name_0_15= 'reports' | lv_name_0_16= 'roles' | lv_name_0_17= 'services' | lv_name_0_18= 'storage' | lv_name_0_19= 'topics' | lv_name_0_20= 'vars' ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:598:1: (lv_name_0_1= 'access' | lv_name_0_2= 'classes' | lv_name_0_3= 'commands' | lv_name_0_4= 'databases' | lv_name_0_5= 'environments' | lv_name_0_6= 'files' | lv_name_0_7= 'inferences' | lv_name_0_8= 'interfaces' | lv_name_0_9= 'measurements' | lv_name_0_10= 'methods' | lv_name_0_11= 'occurrences' | lv_name_0_12= 'outputs' | lv_name_0_13= 'packages' | lv_name_0_14= 'processes' | lv_name_0_15= 'reports' | lv_name_0_16= 'roles' | lv_name_0_17= 'services' | lv_name_0_18= 'storage' | lv_name_0_19= 'topics' | lv_name_0_20= 'vars' )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:598:1: (lv_name_0_1= 'access' | lv_name_0_2= 'classes' | lv_name_0_3= 'commands' | lv_name_0_4= 'databases' | lv_name_0_5= 'environments' | lv_name_0_6= 'files' | lv_name_0_7= 'inferences' | lv_name_0_8= 'interfaces' | lv_name_0_9= 'measurements' | lv_name_0_10= 'methods' | lv_name_0_11= 'occurrences' | lv_name_0_12= 'outputs' | lv_name_0_13= 'packages' | lv_name_0_14= 'processes' | lv_name_0_15= 'reports' | lv_name_0_16= 'roles' | lv_name_0_17= 'services' | lv_name_0_18= 'storage' | lv_name_0_19= 'topics' | lv_name_0_20= 'vars' )
            int alt9=20;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 23:
                {
                alt9=5;
                }
                break;
            case 24:
                {
                alt9=6;
                }
                break;
            case 25:
                {
                alt9=7;
                }
                break;
            case 26:
                {
                alt9=8;
                }
                break;
            case 27:
                {
                alt9=9;
                }
                break;
            case 28:
                {
                alt9=10;
                }
                break;
            case 29:
                {
                alt9=11;
                }
                break;
            case 30:
                {
                alt9=12;
                }
                break;
            case 31:
                {
                alt9=13;
                }
                break;
            case 32:
                {
                alt9=14;
                }
                break;
            case 33:
                {
                alt9=15;
                }
                break;
            case 34:
                {
                alt9=16;
                }
                break;
            case 35:
                {
                alt9=17;
                }
                break;
            case 36:
                {
                alt9=18;
                }
                break;
            case 37:
                {
                alt9=19;
                }
                break;
            case 38:
                {
                alt9=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("598:1: (lv_name_0_1= 'access' | lv_name_0_2= 'classes' | lv_name_0_3= 'commands' | lv_name_0_4= 'databases' | lv_name_0_5= 'environments' | lv_name_0_6= 'files' | lv_name_0_7= 'inferences' | lv_name_0_8= 'interfaces' | lv_name_0_9= 'measurements' | lv_name_0_10= 'methods' | lv_name_0_11= 'occurrences' | lv_name_0_12= 'outputs' | lv_name_0_13= 'packages' | lv_name_0_14= 'processes' | lv_name_0_15= 'reports' | lv_name_0_16= 'roles' | lv_name_0_17= 'services' | lv_name_0_18= 'storage' | lv_name_0_19= 'topics' | lv_name_0_20= 'vars' )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:599:3: lv_name_0_1= 'access'
                    {
                    lv_name_0_1=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_rulePromiseType1091); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameAccessKeyword_0_0(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_1, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:617:8: lv_name_0_2= 'classes'
                    {
                    lv_name_0_2=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_rulePromiseType1120); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameClassesKeyword_0_1(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_2, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:635:8: lv_name_0_3= 'commands'
                    {
                    lv_name_0_3=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_rulePromiseType1149); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameCommandsKeyword_0_2(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_3, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:653:8: lv_name_0_4= 'databases'
                    {
                    lv_name_0_4=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_rulePromiseType1178); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameDatabasesKeyword_0_3(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_4, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:671:8: lv_name_0_5= 'environments'
                    {
                    lv_name_0_5=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_rulePromiseType1207); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameEnvironmentsKeyword_0_4(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_5, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:689:8: lv_name_0_6= 'files'
                    {
                    lv_name_0_6=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_rulePromiseType1236); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameFilesKeyword_0_5(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_6, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:707:8: lv_name_0_7= 'inferences'
                    {
                    lv_name_0_7=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_rulePromiseType1265); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameInferencesKeyword_0_6(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_7, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:725:8: lv_name_0_8= 'interfaces'
                    {
                    lv_name_0_8=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_rulePromiseType1294); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameInterfacesKeyword_0_7(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_8, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:743:8: lv_name_0_9= 'measurements'
                    {
                    lv_name_0_9=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_rulePromiseType1323); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameMeasurementsKeyword_0_8(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_9, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 10 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:761:8: lv_name_0_10= 'methods'
                    {
                    lv_name_0_10=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_rulePromiseType1352); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameMethodsKeyword_0_9(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_10, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 11 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:779:8: lv_name_0_11= 'occurrences'
                    {
                    lv_name_0_11=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_rulePromiseType1381); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameOccurrencesKeyword_0_10(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_11, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 12 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:797:8: lv_name_0_12= 'outputs'
                    {
                    lv_name_0_12=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_rulePromiseType1410); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameOutputsKeyword_0_11(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_12, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 13 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:815:8: lv_name_0_13= 'packages'
                    {
                    lv_name_0_13=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_rulePromiseType1439); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNamePackagesKeyword_0_12(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_13, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 14 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:833:8: lv_name_0_14= 'processes'
                    {
                    lv_name_0_14=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_rulePromiseType1468); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameProcessesKeyword_0_13(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_14, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 15 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:851:8: lv_name_0_15= 'reports'
                    {
                    lv_name_0_15=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_rulePromiseType1497); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameReportsKeyword_0_14(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_15, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 16 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:869:8: lv_name_0_16= 'roles'
                    {
                    lv_name_0_16=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_rulePromiseType1526); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameRolesKeyword_0_15(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_16, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 17 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:887:8: lv_name_0_17= 'services'
                    {
                    lv_name_0_17=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_rulePromiseType1555); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameServicesKeyword_0_16(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_17, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 18 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:905:8: lv_name_0_18= 'storage'
                    {
                    lv_name_0_18=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_rulePromiseType1584); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameStorageKeyword_0_17(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_18, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 19 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:923:8: lv_name_0_19= 'topics'
                    {
                    lv_name_0_19=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_rulePromiseType1613); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameTopicsKeyword_0_18(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_19, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 20 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:941:8: lv_name_0_20= 'vars'
                    {
                    lv_name_0_20=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_rulePromiseType1642); 

                            createLeafNode(grammarAccess.getPromiseTypeAccess().getNameVarsKeyword_0_19(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPromiseTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_20, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePromiseType


    // $ANTLR start entryRuleComponent
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:970:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:971:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:972:2: iv_ruleComponent= ruleComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent1693);
            iv_ruleComponent=ruleComponent();
            _fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent1703); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleComponent


    // $ANTLR start ruleComponent
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:979:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_1= 'common' | lv_name_0_2= 'agent' | lv_name_0_3= 'server' | lv_name_0_4= 'monitor' | lv_name_0_5= 'runagent' | lv_name_0_6= 'executor' | lv_name_0_7= 'knowledge' | lv_name_0_8= 'reporter' ) ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;
        Token lv_name_0_7=null;
        Token lv_name_0_8=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:984:6: ( ( ( (lv_name_0_1= 'common' | lv_name_0_2= 'agent' | lv_name_0_3= 'server' | lv_name_0_4= 'monitor' | lv_name_0_5= 'runagent' | lv_name_0_6= 'executor' | lv_name_0_7= 'knowledge' | lv_name_0_8= 'reporter' ) ) ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:985:1: ( ( (lv_name_0_1= 'common' | lv_name_0_2= 'agent' | lv_name_0_3= 'server' | lv_name_0_4= 'monitor' | lv_name_0_5= 'runagent' | lv_name_0_6= 'executor' | lv_name_0_7= 'knowledge' | lv_name_0_8= 'reporter' ) ) )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:985:1: ( ( (lv_name_0_1= 'common' | lv_name_0_2= 'agent' | lv_name_0_3= 'server' | lv_name_0_4= 'monitor' | lv_name_0_5= 'runagent' | lv_name_0_6= 'executor' | lv_name_0_7= 'knowledge' | lv_name_0_8= 'reporter' ) ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:986:1: ( (lv_name_0_1= 'common' | lv_name_0_2= 'agent' | lv_name_0_3= 'server' | lv_name_0_4= 'monitor' | lv_name_0_5= 'runagent' | lv_name_0_6= 'executor' | lv_name_0_7= 'knowledge' | lv_name_0_8= 'reporter' ) )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:986:1: ( (lv_name_0_1= 'common' | lv_name_0_2= 'agent' | lv_name_0_3= 'server' | lv_name_0_4= 'monitor' | lv_name_0_5= 'runagent' | lv_name_0_6= 'executor' | lv_name_0_7= 'knowledge' | lv_name_0_8= 'reporter' ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:987:1: (lv_name_0_1= 'common' | lv_name_0_2= 'agent' | lv_name_0_3= 'server' | lv_name_0_4= 'monitor' | lv_name_0_5= 'runagent' | lv_name_0_6= 'executor' | lv_name_0_7= 'knowledge' | lv_name_0_8= 'reporter' )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:987:1: (lv_name_0_1= 'common' | lv_name_0_2= 'agent' | lv_name_0_3= 'server' | lv_name_0_4= 'monitor' | lv_name_0_5= 'runagent' | lv_name_0_6= 'executor' | lv_name_0_7= 'knowledge' | lv_name_0_8= 'reporter' )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt10=1;
                }
                break;
            case 40:
                {
                alt10=2;
                }
                break;
            case 41:
                {
                alt10=3;
                }
                break;
            case 42:
                {
                alt10=4;
                }
                break;
            case 43:
                {
                alt10=5;
                }
                break;
            case 44:
                {
                alt10=6;
                }
                break;
            case 45:
                {
                alt10=7;
                }
                break;
            case 46:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("987:1: (lv_name_0_1= 'common' | lv_name_0_2= 'agent' | lv_name_0_3= 'server' | lv_name_0_4= 'monitor' | lv_name_0_5= 'runagent' | lv_name_0_6= 'executor' | lv_name_0_7= 'knowledge' | lv_name_0_8= 'reporter' )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:988:3: lv_name_0_1= 'common'
                    {
                    lv_name_0_1=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_ruleComponent1747); 

                            createLeafNode(grammarAccess.getComponentAccess().getNameCommonKeyword_0_0(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_1, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:1006:8: lv_name_0_2= 'agent'
                    {
                    lv_name_0_2=(Token)input.LT(1);
                    match(input,40,FOLLOW_40_in_ruleComponent1776); 

                            createLeafNode(grammarAccess.getComponentAccess().getNameAgentKeyword_0_1(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_2, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:1024:8: lv_name_0_3= 'server'
                    {
                    lv_name_0_3=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleComponent1805); 

                            createLeafNode(grammarAccess.getComponentAccess().getNameServerKeyword_0_2(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_3, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:1042:8: lv_name_0_4= 'monitor'
                    {
                    lv_name_0_4=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_ruleComponent1834); 

                            createLeafNode(grammarAccess.getComponentAccess().getNameMonitorKeyword_0_3(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_4, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:1060:8: lv_name_0_5= 'runagent'
                    {
                    lv_name_0_5=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_ruleComponent1863); 

                            createLeafNode(grammarAccess.getComponentAccess().getNameRunagentKeyword_0_4(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_5, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:1078:8: lv_name_0_6= 'executor'
                    {
                    lv_name_0_6=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleComponent1892); 

                            createLeafNode(grammarAccess.getComponentAccess().getNameExecutorKeyword_0_5(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_6, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:1096:8: lv_name_0_7= 'knowledge'
                    {
                    lv_name_0_7=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_ruleComponent1921); 

                            createLeafNode(grammarAccess.getComponentAccess().getNameKnowledgeKeyword_0_6(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_7, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:1114:8: lv_name_0_8= 'reporter'
                    {
                    lv_name_0_8=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_ruleComponent1950); 

                            createLeafNode(grammarAccess.getComponentAccess().getNameReporterKeyword_0_7(), "name"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0_8, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleComponent


 

    public static final BitSet FOLLOW_ruleCfModel_in_entryRuleCfModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCfModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleCfModel130 = new BitSet(new long[]{0x0000000000004402L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_ruleAbstractElement222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_rulePart313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rulePart340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleBundle420 = new BitSet(new long[]{0x00007F8000000000L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleBundle441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle458 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBundle473 = new BitSet(new long[]{0x0000007FFFF82000L});
    public static final BitSet FOLLOW_rulePromiseType_in_ruleBundle495 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBundle505 = new BitSet(new long[]{0x0000007FFFF82020L});
    public static final BitSet FOLLOW_ruleMethode_in_ruleBundle526 = new BitSet(new long[]{0x0000007FFFF82020L});
    public static final BitSet FOLLOW_13_in_ruleBundle539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBody620 = new BitSet(new long[]{0x00007F8000000000L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleBody641 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBody659 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBody682 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBody692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethode_in_entryRuleMethode728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethode738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMethode780 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleMethode796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZuweisung_in_ruleMethode824 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleMethode835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleZuweisung_in_ruleMethode856 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleMethode868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZuweisung_in_entryRuleZuweisung906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZuweisung916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleZuweisung958 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleZuweisung974 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleZuweisung984 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleZuweisung998 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rulePromiseType_in_entryRulePromiseType1037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePromiseType1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePromiseType1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePromiseType1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePromiseType1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePromiseType1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePromiseType1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePromiseType1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePromiseType1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePromiseType1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePromiseType1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePromiseType1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePromiseType1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePromiseType1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePromiseType1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePromiseType1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePromiseType1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePromiseType1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePromiseType1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePromiseType1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePromiseType1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePromiseType1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent1693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleComponent1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleComponent1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleComponent1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleComponent1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleComponent1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleComponent1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleComponent1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleComponent1950 = new BitSet(new long[]{0x0000000000000002L});

}