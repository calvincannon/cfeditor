package edu.kit.scc.cfeditor.cfengine.parser.antlr.internal; 

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
import edu.kit.scc.cfeditor.cfengine.services.CfengineEditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfengineEditorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANY_OTHER", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "'.'", "'!'", "'('", "')'", "'=>'", "';'", "','", "'bundle'", "'{'", "'}'", "':'", "'::'", "'@'", "'body'", "'$('", "'${'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=5;
    public static final int RULE_INT=7;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;

        public InternalCfengineEditorParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g"; }



     	private CfengineEditorGrammarAccess grammarAccess;
     	
        public InternalCfengineEditorParser(TokenStream input, IAstFactory factory, CfengineEditorGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CfModel";	
       	}
       	
       	@Override
       	protected CfengineEditorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleCfModel
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:77:1: entryRuleCfModel returns [EObject current=null] : iv_ruleCfModel= ruleCfModel EOF ;
    public final EObject entryRuleCfModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCfModel = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:78:2: (iv_ruleCfModel= ruleCfModel EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:79:2: iv_ruleCfModel= ruleCfModel EOF
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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:86:1: ruleCfModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleCfModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:91:6: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:92:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:92:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:93:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:93:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:94:3: lv_elements_0_0= ruleAbstractElement
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


    // $ANTLR start entryRuleCLASS_ID
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:124:1: entryRuleCLASS_ID returns [String current=null] : iv_ruleCLASS_ID= ruleCLASS_ID EOF ;
    public final String entryRuleCLASS_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCLASS_ID = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:125:2: (iv_ruleCLASS_ID= ruleCLASS_ID EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:126:2: iv_ruleCLASS_ID= ruleCLASS_ID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCLASS_IDRule(), currentNode); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_entryRuleCLASS_ID167);
            iv_ruleCLASS_ID=ruleCLASS_ID();
            _fsp--;

             current =iv_ruleCLASS_ID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCLASS_ID178); 

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
    // $ANTLR end entryRuleCLASS_ID


    // $ANTLR start ruleCLASS_ID
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:133:1: ruleCLASS_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) | (kw= '!' this_CLASS_ID_5= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleCLASS_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_CLASS_ID_5 = null;

        AntlrDatatypeRuleToken this_CLASS_ID_7 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:138:6: ( (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) | (kw= '!' this_CLASS_ID_5= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')' ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:139:1: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) | (kw= '!' this_CLASS_ID_5= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')' ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:139:1: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) | (kw= '!' this_CLASS_ID_5= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==10) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==13||LA2_1==21) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("139:1: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) | (kw= '!' this_CLASS_ID_5= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')' ) )", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            case 12:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("139:1: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) | (kw= '!' this_CLASS_ID_5= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')' ) )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:139:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCLASS_ID218); 

                    		current.merge(this_ID_0);
                        
                     
                        createLeafNode(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:147:6: (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:147:6: (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:147:11: this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCLASS_ID245); 

                    		current.merge(this_ID_1);
                        
                     
                        createLeafNode(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_1_0(), null); 
                        
                    kw=(Token)input.LT(1);
                    match(input,10,FOLLOW_10_in_ruleCLASS_ID263); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_1_1(), null); 
                        
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCLASS_ID278); 

                    		current.merge(this_ID_3);
                        
                     
                        createLeafNode(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_1_2(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:168:6: (kw= '!' this_CLASS_ID_5= ruleCLASS_ID )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:168:6: (kw= '!' this_CLASS_ID_5= ruleCLASS_ID )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:169:2: kw= '!' this_CLASS_ID_5= ruleCLASS_ID
                    {
                    kw=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleCLASS_ID304); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCLASS_IDAccess().getExclamationMarkKeyword_2_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID326);
                    this_CLASS_ID_5=ruleCLASS_ID();
                    _fsp--;


                    		current.merge(this_CLASS_ID_5);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:186:6: (kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:186:6: (kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:187:2: kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')'
                    {
                    kw=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleCLASS_ID352); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCLASS_IDAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_3_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID374);
                    this_CLASS_ID_7=ruleCLASS_ID();
                    _fsp--;


                    		current.merge(this_CLASS_ID_7);
                        
                     
                            currentNode = currentNode.getParent();
                        
                    kw=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleCLASS_ID392); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_3_2(), null); 
                        

                    }


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
    // $ANTLR end ruleCLASS_ID


    // $ANTLR start entryRulePLACEHOLDERB
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:217:1: entryRulePLACEHOLDERB returns [String current=null] : iv_rulePLACEHOLDERB= rulePLACEHOLDERB EOF ;
    public final String entryRulePLACEHOLDERB() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePLACEHOLDERB = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:218:2: (iv_rulePLACEHOLDERB= rulePLACEHOLDERB EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:219:2: iv_rulePLACEHOLDERB= rulePLACEHOLDERB EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPLACEHOLDERBRule(), currentNode); 
            pushFollow(FOLLOW_rulePLACEHOLDERB_in_entryRulePLACEHOLDERB434);
            iv_rulePLACEHOLDERB=rulePLACEHOLDERB();
            _fsp--;

             current =iv_rulePLACEHOLDERB.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePLACEHOLDERB445); 

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
    // $ANTLR end entryRulePLACEHOLDERB


    // $ANTLR start rulePLACEHOLDERB
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:226:1: rulePLACEHOLDERB returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulePLACEHOLDERB() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_0=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:231:6: ( (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:232:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:232:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )
            int alt3=8;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 12:
                {
                alt3=7;
                }
                break;
            case 13:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("232:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:232:6: this_ANY_OTHER_0= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_0=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rulePLACEHOLDERB485); 

                    		current.merge(this_ANY_OTHER_0);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getANY_OTHERTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:240:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePLACEHOLDERB511); 

                    		current.merge(this_ID_1);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getIDTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:248:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePLACEHOLDERB537); 

                    		current.merge(this_STRING_2);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getSTRINGTerminalRuleCall_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:257:2: kw= '=>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_rulePLACEHOLDERB561); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getEqualsSignGreaterThanSignKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:264:2: kw= ';'
                    {
                    kw=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_rulePLACEHOLDERB580); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getSemicolonKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:271:2: kw= ','
                    {
                    kw=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_rulePLACEHOLDERB599); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getCommaKeyword_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:278:2: kw= '('
                    {
                    kw=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_rulePLACEHOLDERB618); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getLeftParenthesisKeyword_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:285:2: kw= ')'
                    {
                    kw=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_rulePLACEHOLDERB637); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getRightParenthesisKeyword_7(), null); 
                        

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
    // $ANTLR end rulePLACEHOLDERB


    // $ANTLR start entryRuleAbstractElement
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:298:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:299:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:300:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement677);
            iv_ruleAbstractElement=ruleAbstractElement();
            _fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement687); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:307:1: ruleAbstractElement returns [EObject current=null] : this_Part_0= rulePart ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Part_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:312:6: (this_Part_0= rulePart )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:314:5: this_Part_0= rulePart
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAbstractElementAccess().getPartParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_rulePart_in_ruleAbstractElement733);
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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:330:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:331:2: (iv_rulePart= rulePart EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:332:2: iv_rulePart= rulePart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPartRule(), currentNode); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart767);
            iv_rulePart=rulePart();
            _fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart777); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:339:1: rulePart returns [EObject current=null] : (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        EObject this_Bundle_0 = null;

        EObject this_Body_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:344:6: ( (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:345:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:345:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("345:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:346:5: this_Bundle_0= ruleBundle
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getBundleParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBundle_in_rulePart824);
                    this_Bundle_0=ruleBundle();
                    _fsp--;

                     
                            current = this_Bundle_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:356:5: this_Body_1= ruleBody
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getBodyParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBody_in_rulePart851);
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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:372:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:373:2: (iv_ruleBundle= ruleBundle EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:374:2: iv_ruleBundle= ruleBundle EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle886);
            iv_ruleBundle=ruleBundle();
            _fsp--;

             current =iv_ruleBundle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle896); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:381:1: ruleBundle returns [EObject current=null] : ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( (lv_promiseType_5_0= ruleBundlePromiseType ) )* '}' ) ;
    public final EObject ruleBundle() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_component_1_0 = null;

        EObject lv_promiseType_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:386:6: ( ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( (lv_promiseType_5_0= ruleBundlePromiseType ) )* '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:387:1: ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( (lv_promiseType_5_0= ruleBundlePromiseType ) )* '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:387:1: ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( (lv_promiseType_5_0= ruleBundlePromiseType ) )* '}' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:387:3: 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( (lv_promiseType_5_0= ruleBundlePromiseType ) )* '}'
            {
            match(input,17,FOLLOW_17_in_ruleBundle931); 

                    createLeafNode(grammarAccess.getBundleAccess().getBundleKeyword_0(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:391:1: ( (lv_component_1_0= ruleBundleComponent ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:392:1: (lv_component_1_0= ruleBundleComponent )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:392:1: (lv_component_1_0= ruleBundleComponent )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:393:3: lv_component_1_0= ruleBundleComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBundleComponent_in_ruleBundle952);
            lv_component_1_0=ruleBundleComponent();
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
            	        		"BundleComponent", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:415:2: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:416:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:416:1: (lv_name_2_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:417:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle969); 

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

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:439:2: ( rulePLACEHOLDERB )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)||(LA5_0>=12 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:440:5: rulePLACEHOLDERB
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_3(), currentNode); 
            	        
            	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_ruleBundle991);
            	    rulePLACEHOLDERB();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleBundle1002); 

                    createLeafNode(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:451:1: ( (lv_promiseType_5_0= ruleBundlePromiseType ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:452:1: (lv_promiseType_5_0= ruleBundlePromiseType )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:452:1: (lv_promiseType_5_0= ruleBundlePromiseType )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:453:3: lv_promiseType_5_0= ruleBundlePromiseType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromiseType_in_ruleBundle1023);
            	    lv_promiseType_5_0=ruleBundlePromiseType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBundleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"promiseType",
            	    	        		lv_promiseType_5_0, 
            	    	        		"BundlePromiseType", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_ruleBundle1034); 

                    createLeafNode(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_6(), null); 
                

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


    // $ANTLR start entryRuleBundlePromiseType
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:487:1: entryRuleBundlePromiseType returns [EObject current=null] : iv_ruleBundlePromiseType= ruleBundlePromiseType EOF ;
    public final EObject entryRuleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundlePromiseType = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:488:2: (iv_ruleBundlePromiseType= ruleBundlePromiseType EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:489:2: iv_ruleBundlePromiseType= ruleBundlePromiseType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundlePromiseTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType1070);
            iv_ruleBundlePromiseType=ruleBundlePromiseType();
            _fsp--;

             current =iv_ruleBundlePromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromiseType1080); 

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
    // $ANTLR end entryRuleBundlePromiseType


    // $ANTLR start ruleBundlePromiseType
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:496:1: ruleBundlePromiseType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* ) ;
    public final EObject ruleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_promises_2_0 = null;

        EObject lv_classes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:501:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:502:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:502:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:502:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )*
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:502:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:503:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:503:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:504:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundlePromiseType1122); 

            			createLeafNode(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBundlePromiseTypeRule().getType().getClassifier());
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

            match(input,20,FOLLOW_20_in_ruleBundlePromiseType1137); 

                    createLeafNode(grammarAccess.getBundlePromiseTypeAccess().getColonKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:530:1: ( (lv_promises_2_0= ruleBundlePromise ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:531:1: (lv_promises_2_0= ruleBundlePromise )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:531:1: (lv_promises_2_0= ruleBundlePromise )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:532:3: lv_promises_2_0= ruleBundlePromise
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundlePromiseTypeAccess().getPromisesBundlePromiseParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromise_in_ruleBundlePromiseType1158);
            	    lv_promises_2_0=ruleBundlePromise();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBundlePromiseTypeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"promises",
            	    	        		lv_promises_2_0, 
            	    	        		"BundlePromise", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:554:3: ( (lv_classes_3_0= ruleBundleClass ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==10||LA8_2==21) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:555:1: (lv_classes_3_0= ruleBundleClass )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:555:1: (lv_classes_3_0= ruleBundleClass )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:556:3: lv_classes_3_0= ruleBundleClass
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundlePromiseTypeAccess().getClassesBundleClassParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundleClass_in_ruleBundlePromiseType1180);
            	    lv_classes_3_0=ruleBundleClass();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBundlePromiseTypeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"classes",
            	    	        		lv_classes_3_0, 
            	    	        		"BundleClass", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end ruleBundlePromiseType


    // $ANTLR start entryRuleBundleClass
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:586:1: entryRuleBundleClass returns [EObject current=null] : iv_ruleBundleClass= ruleBundleClass EOF ;
    public final EObject entryRuleBundleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleClass = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:587:2: (iv_ruleBundleClass= ruleBundleClass EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:588:2: iv_ruleBundleClass= ruleBundleClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundleClass_in_entryRuleBundleClass1217);
            iv_ruleBundleClass=ruleBundleClass();
            _fsp--;

             current =iv_ruleBundleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleClass1227); 

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
    // $ANTLR end entryRuleBundleClass


    // $ANTLR start ruleBundleClass
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:595:1: ruleBundleClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ ) ;
    public final EObject ruleBundleClass() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_promises_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:600:6: ( ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:601:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:601:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:601:2: ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:601:2: ( (lv_name_0_0= ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:602:1: (lv_name_0_0= ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:602:1: (lv_name_0_0= ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:603:3: lv_name_0_0= ruleCLASS_ID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBundleClassAccess().getNameCLASS_IDParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleBundleClass1273);
            lv_name_0_0=ruleCLASS_ID();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBundleClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"CLASS_ID", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,21,FOLLOW_21_in_ruleBundleClass1283); 

                    createLeafNode(grammarAccess.getBundleClassAccess().getColonColonKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:629:1: ( (lv_promises_2_0= ruleBundlePromise ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:630:1: (lv_promises_2_0= ruleBundlePromise )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:630:1: (lv_promises_2_0= ruleBundlePromise )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:631:3: lv_promises_2_0= ruleBundlePromise
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundleClassAccess().getPromisesBundlePromiseParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromise_in_ruleBundleClass1304);
            	    lv_promises_2_0=ruleBundlePromise();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBundleClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"promises",
            	    	        		lv_promises_2_0, 
            	    	        		"BundlePromise", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


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
    // $ANTLR end ruleBundleClass


    // $ANTLR start entryRuleBundlePromise
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:661:1: entryRuleBundlePromise returns [EObject current=null] : iv_ruleBundlePromise= ruleBundlePromise EOF ;
    public final EObject entryRuleBundlePromise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundlePromise = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:662:2: (iv_ruleBundlePromise= ruleBundlePromise EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:663:2: iv_ruleBundlePromise= ruleBundlePromise EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundlePromiseRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundlePromise_in_entryRuleBundlePromise1341);
            iv_ruleBundlePromise=ruleBundlePromise();
            _fsp--;

             current =iv_ruleBundlePromise; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromise1351); 

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
    // $ANTLR end entryRuleBundlePromise


    // $ANTLR start ruleBundlePromise
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:670:1: ruleBundlePromise returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* ';' ) ;
    public final EObject ruleBundlePromise() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:675:6: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* ';' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:676:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* ';' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:676:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* ';' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:676:2: ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* ';'
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:676:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:677:1: (lv_name_0_0= RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:677:1: (lv_name_0_0= RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:678:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBundlePromise1393); 

            			createLeafNode(grammarAccess.getBundlePromiseAccess().getNameSTRINGTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBundlePromiseRule().getType().getClassifier());
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

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:700:2: ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:700:3: ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )*
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:700:3: ( (lv_values_1_0= rulePromiseValue ) )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:701:1: (lv_values_1_0= rulePromiseValue )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:701:1: (lv_values_1_0= rulePromiseValue )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:702:3: lv_values_1_0= rulePromiseValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePromiseValue_in_ruleBundlePromise1420);
            	    lv_values_1_0=rulePromiseValue();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBundlePromiseRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"values",
            	    	        		lv_values_1_0, 
            	    	        		"PromiseValue", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:724:2: ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==16) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:724:4: ',' ( (lv_values_3_0= rulePromiseValue ) )
            	    	    {
            	    	    match(input,16,FOLLOW_16_in_ruleBundlePromise1431); 

            	    	            createLeafNode(grammarAccess.getBundlePromiseAccess().getCommaKeyword_1_1_0(), null); 
            	    	        
            	    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:728:1: ( (lv_values_3_0= rulePromiseValue ) )
            	    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:729:1: (lv_values_3_0= rulePromiseValue )
            	    	    {
            	    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:729:1: (lv_values_3_0= rulePromiseValue )
            	    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:730:3: lv_values_3_0= rulePromiseValue
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_1_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_rulePromiseValue_in_ruleBundlePromise1452);
            	    	    lv_values_3_0=rulePromiseValue();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getBundlePromiseRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        try {
            	    	    	       		add(
            	    	    	       			current, 
            	    	    	       			"values",
            	    	    	        		lv_values_3_0, 
            	    	    	        		"PromiseValue", 
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
            	    	    break loop10;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleBundlePromise1466); 

                    createLeafNode(grammarAccess.getBundlePromiseAccess().getSemicolonKeyword_2(), null); 
                

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
    // $ANTLR end ruleBundlePromise


    // $ANTLR start entryRulePromiseValue
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:764:1: entryRulePromiseValue returns [EObject current=null] : iv_rulePromiseValue= rulePromiseValue EOF ;
    public final EObject entryRulePromiseValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePromiseValue = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:765:2: (iv_rulePromiseValue= rulePromiseValue EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:766:2: iv_rulePromiseValue= rulePromiseValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPromiseValueRule(), currentNode); 
            pushFollow(FOLLOW_rulePromiseValue_in_entryRulePromiseValue1502);
            iv_rulePromiseValue=rulePromiseValue();
            _fsp--;

             current =iv_rulePromiseValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePromiseValue1512); 

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
    // $ANTLR end entryRulePromiseValue


    // $ANTLR start rulePromiseValue
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:773:1: rulePromiseValue returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ) ;
    public final EObject rulePromiseValue() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_values_2_0=null;
        Token lv_values_5_0=null;
        Token lv_values_8_0=null;
        EObject lv_functions_3_0 = null;

        EObject lv_functions_6_0 = null;

        EObject lv_functions_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:778:6: ( ( ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:779:1: ( ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:779:1: ( ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:779:2: ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:779:2: ( (lv_keyword_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:780:1: (lv_keyword_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:780:1: (lv_keyword_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:781:3: lv_keyword_0_0= RULE_ID
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePromiseValue1554); 

            			createLeafNode(grammarAccess.getPromiseValueAccess().getKeywordIDTerminalRuleCall_0_0(), "keyword"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"keyword",
            	        		lv_keyword_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_rulePromiseValue1569); 

                    createLeafNode(grammarAccess.getPromiseValueAccess().getEqualsSignGreaterThanSignKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:807:1: ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==18) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==22) ) {
                    alt16=3;
                }
                else if ( (LA16_2==RULE_ID||LA16_2==RULE_STRING) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("807:1: ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) )", 16, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("807:1: ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:807:2: ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:807:2: ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_STRING) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==RULE_ID) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("807:2: ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) )", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:807:3: ( (lv_values_2_0= RULE_STRING ) )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:807:3: ( (lv_values_2_0= RULE_STRING ) )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:808:1: (lv_values_2_0= RULE_STRING )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:808:1: (lv_values_2_0= RULE_STRING )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:809:3: lv_values_2_0= RULE_STRING
                            {
                            lv_values_2_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1588); 

                            			createLeafNode(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_0_0_0(), "values"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"values",
                            	        		lv_values_2_0, 
                            	        		"STRING", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:832:6: ( (lv_functions_3_0= ruleSimpleFunction ) )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:832:6: ( (lv_functions_3_0= ruleSimpleFunction ) )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:833:1: (lv_functions_3_0= ruleSimpleFunction )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:833:1: (lv_functions_3_0= ruleSimpleFunction )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:834:3: lv_functions_3_0= ruleSimpleFunction
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_0_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1620);
                            lv_functions_3_0=ruleSimpleFunction();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"functions",
                            	        		lv_functions_3_0, 
                            	        		"SimpleFunction", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:857:6: ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:857:6: ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:857:8: '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}'
                    {
                    match(input,18,FOLLOW_18_in_rulePromiseValue1638); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_1_0(), null); 
                        
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:861:1: ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_STRING) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==RULE_ID) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("861:1: ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) )", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:861:2: ( (lv_values_5_0= RULE_STRING ) )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:861:2: ( (lv_values_5_0= RULE_STRING ) )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:862:1: (lv_values_5_0= RULE_STRING )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:862:1: (lv_values_5_0= RULE_STRING )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:863:3: lv_values_5_0= RULE_STRING
                            {
                            lv_values_5_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1656); 

                            			createLeafNode(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0_0(), "values"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"values",
                            	        		lv_values_5_0, 
                            	        		"STRING", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:886:6: ( (lv_functions_6_0= ruleSimpleFunction ) )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:886:6: ( (lv_functions_6_0= ruleSimpleFunction ) )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:887:1: (lv_functions_6_0= ruleSimpleFunction )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:887:1: (lv_functions_6_0= ruleSimpleFunction )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:888:3: lv_functions_6_0= ruleSimpleFunction
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1688);
                            lv_functions_6_0=ruleSimpleFunction();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"functions",
                            	        		lv_functions_6_0, 
                            	        		"SimpleFunction", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:910:3: ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:910:5: ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_rulePromiseValue1700); 

                    	            createLeafNode(grammarAccess.getPromiseValueAccess().getCommaKeyword_2_1_2_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:914:1: ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) )
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==RULE_STRING) ) {
                    	        alt14=1;
                    	    }
                    	    else if ( (LA14_0==RULE_ID) ) {
                    	        alt14=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("914:1: ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) )", 14, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:914:2: ( (lv_values_8_0= RULE_STRING ) )
                    	            {
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:914:2: ( (lv_values_8_0= RULE_STRING ) )
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:915:1: (lv_values_8_0= RULE_STRING )
                    	            {
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:915:1: (lv_values_8_0= RULE_STRING )
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:916:3: lv_values_8_0= RULE_STRING
                    	            {
                    	            lv_values_8_0=(Token)input.LT(1);
                    	            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1718); 

                    	            			createLeafNode(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0_0(), "values"); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode, current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"values",
                    	            	        		lv_values_8_0, 
                    	            	        		"STRING", 
                    	            	        		lastConsumedNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:939:6: ( (lv_functions_9_0= ruleSimpleFunction ) )
                    	            {
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:939:6: ( (lv_functions_9_0= ruleSimpleFunction ) )
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:940:1: (lv_functions_9_0= ruleSimpleFunction )
                    	            {
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:940:1: (lv_functions_9_0= ruleSimpleFunction )
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:941:3: lv_functions_9_0= ruleSimpleFunction
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_2_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1750);
                    	            lv_functions_9_0=ruleSimpleFunction();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getPromiseValueRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"functions",
                    	            	        		lv_functions_9_0, 
                    	            	        		"SimpleFunction", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match(input,19,FOLLOW_19_in_rulePromiseValue1763); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_1_3(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:968:6: ( '{' '@' '(' RULE_ID ')' '}' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:968:6: ( '{' '@' '(' RULE_ID ')' '}' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:968:8: '{' '@' '(' RULE_ID ')' '}'
                    {
                    match(input,18,FOLLOW_18_in_rulePromiseValue1781); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_2_0(), null); 
                        
                    match(input,22,FOLLOW_22_in_rulePromiseValue1791); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getCommercialAtKeyword_2_2_1(), null); 
                        
                    match(input,12,FOLLOW_12_in_rulePromiseValue1801); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getLeftParenthesisKeyword_2_2_2(), null); 
                        
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePromiseValue1810); 
                     
                        createLeafNode(grammarAccess.getPromiseValueAccess().getIDTerminalRuleCall_2_2_3(), null); 
                        
                    match(input,13,FOLLOW_13_in_rulePromiseValue1819); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getRightParenthesisKeyword_2_2_4(), null); 
                        
                    match(input,19,FOLLOW_19_in_rulePromiseValue1829); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_2_5(), null); 
                        

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
    // $ANTLR end rulePromiseValue


    // $ANTLR start entryRuleBody
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1000:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1001:2: (iv_ruleBody= ruleBody EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1002:2: iv_ruleBody= ruleBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody1867);
            iv_ruleBody=ruleBody();
            _fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody1877); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1009:1: ruleBody returns [EObject current=null] : ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_variables_4_0=null;
        Token lv_variables_6_0=null;
        EObject lv_component_1_0 = null;

        EObject lv_promiseType_9_0 = null;

        EObject lv_classes_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1014:6: ( ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1015:1: ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1015:1: ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1015:3: 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}'
            {
            match(input,23,FOLLOW_23_in_ruleBody1912); 

                    createLeafNode(grammarAccess.getBodyAccess().getBodyKeyword_0(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1019:1: ( (lv_component_1_0= ruleBodyComponent ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1020:1: (lv_component_1_0= ruleBodyComponent )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1020:1: (lv_component_1_0= ruleBodyComponent )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1021:3: lv_component_1_0= ruleBodyComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBodyComponent_in_ruleBody1933);
            lv_component_1_0=ruleBodyComponent();
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
            	        		"BodyComponent", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1043:2: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1044:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1044:1: (lv_name_2_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1045:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1950); 

            			createLeafNode(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
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

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1067:2: ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1067:4: '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')'
                    {
                    match(input,12,FOLLOW_12_in_ruleBody1966); 

                            createLeafNode(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1071:1: ( (lv_variables_4_0= RULE_ID ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1072:1: (lv_variables_4_0= RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1072:1: (lv_variables_4_0= RULE_ID )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1073:3: lv_variables_4_0= RULE_ID
                    {
                    lv_variables_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1983); 

                    			createLeafNode(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_1_0(), "variables"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"variables",
                    	        		lv_variables_4_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1095:2: ( ',' ( (lv_variables_6_0= RULE_ID ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1095:4: ',' ( (lv_variables_6_0= RULE_ID ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleBody1999); 

                    	            createLeafNode(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1099:1: ( (lv_variables_6_0= RULE_ID ) )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1100:1: (lv_variables_6_0= RULE_ID )
                    	    {
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1100:1: (lv_variables_6_0= RULE_ID )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1101:3: lv_variables_6_0= RULE_ID
                    	    {
                    	    lv_variables_6_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody2016); 

                    	    			createLeafNode(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_2_1_0(), "variables"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"variables",
                    	    	        		lv_variables_6_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match(input,13,FOLLOW_13_in_ruleBody2033); 

                            createLeafNode(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            match(input,18,FOLLOW_18_in_ruleBody2045); 

                    createLeafNode(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1131:1: ( (lv_promiseType_9_0= ruleBodyFunction ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==14) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1132:1: (lv_promiseType_9_0= ruleBodyFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1132:1: (lv_promiseType_9_0= ruleBodyFunction )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1133:3: lv_promiseType_9_0= ruleBodyFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBody2066);
            	    lv_promiseType_9_0=ruleBodyFunction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"promiseType",
            	    	        		lv_promiseType_9_0, 
            	    	        		"BodyFunction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1155:3: ( (lv_classes_10_0= ruleBodyClass ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=11 && LA20_0<=12)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1156:1: (lv_classes_10_0= ruleBodyClass )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1156:1: (lv_classes_10_0= ruleBodyClass )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1157:3: lv_classes_10_0= ruleBodyClass
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getClassesBodyClassParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyClass_in_ruleBody2088);
            	    lv_classes_10_0=ruleBodyClass();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"classes",
            	    	        		lv_classes_10_0, 
            	    	        		"BodyClass", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_ruleBody2099); 

                    createLeafNode(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_7(), null); 
                

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


    // $ANTLR start entryRuleBodyClass
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1191:1: entryRuleBodyClass returns [EObject current=null] : iv_ruleBodyClass= ruleBodyClass EOF ;
    public final EObject entryRuleBodyClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyClass = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1192:2: (iv_ruleBodyClass= ruleBodyClass EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1193:2: iv_ruleBodyClass= ruleBodyClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyClass_in_entryRuleBodyClass2135);
            iv_ruleBodyClass=ruleBodyClass();
            _fsp--;

             current =iv_ruleBodyClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyClass2145); 

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
    // $ANTLR end entryRuleBodyClass


    // $ANTLR start ruleBodyClass
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1200:1: ruleBodyClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* ) ;
    public final EObject ruleBodyClass() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_promiseType_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1205:6: ( ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1206:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1206:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1206:2: ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )*
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1206:2: ( (lv_name_0_0= ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1207:1: (lv_name_0_0= ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1207:1: (lv_name_0_0= ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1208:3: lv_name_0_0= ruleCLASS_ID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyClassAccess().getNameCLASS_IDParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleBodyClass2191);
            lv_name_0_0=ruleCLASS_ID();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBodyClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"CLASS_ID", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,21,FOLLOW_21_in_ruleBodyClass2201); 

                    createLeafNode(grammarAccess.getBodyClassAccess().getColonColonKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1234:1: ( (lv_promiseType_2_0= ruleBodyFunction ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==14) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1235:1: (lv_promiseType_2_0= ruleBodyFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1235:1: (lv_promiseType_2_0= ruleBodyFunction )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1236:3: lv_promiseType_2_0= ruleBodyFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyClassAccess().getPromiseTypeBodyFunctionParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBodyClass2222);
            	    lv_promiseType_2_0=ruleBodyFunction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBodyClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"promiseType",
            	    	        		lv_promiseType_2_0, 
            	    	        		"BodyFunction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end ruleBodyClass


    // $ANTLR start entryRuleBodyFunction
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1266:1: entryRuleBodyFunction returns [EObject current=null] : iv_ruleBodyFunction= ruleBodyFunction EOF ;
    public final EObject entryRuleBodyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyFunction = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1267:2: (iv_ruleBodyFunction= ruleBodyFunction EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1268:2: iv_ruleBodyFunction= ruleBodyFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction2259);
            iv_ruleBodyFunction=ruleBodyFunction();
            _fsp--;

             current =iv_ruleBodyFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyFunction2269); 

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
    // $ANTLR end entryRuleBodyFunction


    // $ANTLR start ruleBodyFunction
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1275:1: ruleBodyFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';' ) ;
    public final EObject ruleBodyFunction() throws RecognitionException {
        EObject current = null;

        Token lv_values_2_0=null;
        Token lv_List_3_0=null;
        Token lv_values_4_0=null;
        Token lv_values_6_0=null;
        EObject lv_name_0_0 = null;

        EObject lv_function_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1280:6: ( ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1281:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1281:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1281:2: ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';'
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1281:2: ( (lv_name_0_0= ruleBodyPromiseType ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1282:1: (lv_name_0_0= ruleBodyPromiseType )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1282:1: (lv_name_0_0= ruleBodyPromiseType )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1283:3: lv_name_0_0= ruleBodyPromiseType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction2315);
            lv_name_0_0=ruleBodyPromiseType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"BodyPromiseType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleBodyFunction2325); 

                    createLeafNode(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1309:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt23=1;
                }
                break;
            case 18:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==RULE_STRING) ) {
                    alt23=2;
                }
                else if ( (LA23_2==22) ) {
                    alt23=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1309:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) )", 23, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1309:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1309:2: ( (lv_values_2_0= RULE_STRING ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1309:2: ( (lv_values_2_0= RULE_STRING ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1310:1: (lv_values_2_0= RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1310:1: (lv_values_2_0= RULE_STRING )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1311:3: lv_values_2_0= RULE_STRING
                    {
                    lv_values_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2343); 

                    			createLeafNode(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0_0(), "values"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"values",
                    	        		lv_values_2_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1334:6: ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1334:6: ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1334:7: ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}'
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1334:7: ( (lv_List_3_0= '{' ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1335:1: (lv_List_3_0= '{' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1335:1: (lv_List_3_0= '{' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1336:3: lv_List_3_0= '{'
                    {
                    lv_List_3_0=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleBodyFunction2373); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0(), "List"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "List", true, "{", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1355:2: ( (lv_values_4_0= RULE_STRING ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1356:1: (lv_values_4_0= RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1356:1: (lv_values_4_0= RULE_STRING )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1357:3: lv_values_4_0= RULE_STRING
                    {
                    lv_values_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2403); 

                    			createLeafNode(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0(), "values"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"values",
                    	        		lv_values_4_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1379:2: ( ',' ( (lv_values_6_0= RULE_STRING ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==16) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1379:4: ',' ( (lv_values_6_0= RULE_STRING ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleBodyFunction2419); 

                    	            createLeafNode(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1383:1: ( (lv_values_6_0= RULE_STRING ) )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1384:1: (lv_values_6_0= RULE_STRING )
                    	    {
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1384:1: (lv_values_6_0= RULE_STRING )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1385:3: lv_values_6_0= RULE_STRING
                    	    {
                    	    lv_values_6_0=(Token)input.LT(1);
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2436); 

                    	    			createLeafNode(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0(), "values"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"values",
                    	    	        		lv_values_6_0, 
                    	    	        		"STRING", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match(input,19,FOLLOW_19_in_ruleBodyFunction2453); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1412:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1412:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1413:1: (lv_function_8_0= ruleSpecialFunction )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1413:1: (lv_function_8_0= ruleSpecialFunction )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1414:3: lv_function_8_0= ruleSpecialFunction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleBodyFunction2481);
                    lv_function_8_0=ruleSpecialFunction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBodyFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"function",
                    	        		lv_function_8_0, 
                    	        		"SpecialFunction", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1437:6: ( '{' '@' '(' RULE_ID ')' '}' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1437:6: ( '{' '@' '(' RULE_ID ')' '}' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1437:8: '{' '@' '(' RULE_ID ')' '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleBodyFunction2498); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_3_0(), null); 
                        
                    match(input,22,FOLLOW_22_in_ruleBodyFunction2508); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getCommercialAtKeyword_2_3_1(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleBodyFunction2518); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getLeftParenthesisKeyword_2_3_2(), null); 
                        
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyFunction2527); 
                     
                        createLeafNode(grammarAccess.getBodyFunctionAccess().getIDTerminalRuleCall_2_3_3(), null); 
                        
                    match(input,13,FOLLOW_13_in_ruleBodyFunction2536); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getRightParenthesisKeyword_2_3_4(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleBodyFunction2546); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_3_5(), null); 
                        

                    }


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleBodyFunction2558); 

                    createLeafNode(grammarAccess.getBodyFunctionAccess().getSemicolonKeyword_3(), null); 
                

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
    // $ANTLR end ruleBodyFunction


    // $ANTLR start entryRuleSimpleFunction
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1473:1: entryRuleSimpleFunction returns [EObject current=null] : iv_ruleSimpleFunction= ruleSimpleFunction EOF ;
    public final EObject entryRuleSimpleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFunction = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1474:2: (iv_ruleSimpleFunction= ruleSimpleFunction EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1475:2: iv_ruleSimpleFunction= ruleSimpleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_entryRuleSimpleFunction2594);
            iv_ruleSimpleFunction=ruleSimpleFunction();
            _fsp--;

             current =iv_ruleSimpleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFunction2604); 

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
    // $ANTLR end entryRuleSimpleFunction


    // $ANTLR start ruleSimpleFunction
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1482:1: ruleSimpleFunction returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')' ) ;
    public final EObject ruleSimpleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_values_2_0=null;
        Token lv_values_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1487:6: ( ( ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1488:1: ( ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1488:1: ( ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1488:2: ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')'
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1488:2: ( (lv_id_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1489:1: (lv_id_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1489:1: (lv_id_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1490:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleFunction2646); 

            			createLeafNode(grammarAccess.getSimpleFunctionAccess().getIdIDTerminalRuleCall_0_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"id",
            	        		lv_id_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleSimpleFunction2661); 

                    createLeafNode(grammarAccess.getSimpleFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1516:1: ( (lv_values_2_0= RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1517:1: (lv_values_2_0= RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1517:1: (lv_values_2_0= RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1518:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleFunction2678); 

            			createLeafNode(grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0(), "values"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"values",
            	        		lv_values_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1540:2: ( ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1540:4: ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleSimpleFunction2694); 

            	            createLeafNode(grammarAccess.getSimpleFunctionAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1544:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1545:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1545:1: (lv_values_4_0= RULE_STRING )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1546:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleFunction2711); 

            	    			createLeafNode(grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_3_1_0(), "values"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSimpleFunctionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"values",
            	    	        		lv_values_4_0, 
            	    	        		"STRING", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleSimpleFunction2728); 

                    createLeafNode(grammarAccess.getSimpleFunctionAccess().getRightParenthesisKeyword_4(), null); 
                

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
    // $ANTLR end ruleSimpleFunction


    // $ANTLR start entryRuleSpecialFunction
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1580:1: entryRuleSpecialFunction returns [EObject current=null] : iv_ruleSpecialFunction= ruleSpecialFunction EOF ;
    public final EObject entryRuleSpecialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialFunction = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1581:2: (iv_ruleSpecialFunction= ruleSpecialFunction EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1582:2: iv_ruleSpecialFunction= ruleSpecialFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSpecialFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction2764);
            iv_ruleSpecialFunction=ruleSpecialFunction();
            _fsp--;

             current =iv_ruleSpecialFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialFunction2774); 

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
    // $ANTLR end entryRuleSpecialFunction


    // $ANTLR start ruleSpecialFunction
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1589:1: ruleSpecialFunction returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')' ) ;
    public final EObject ruleSpecialFunction() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_func_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1594:6: ( ( ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1595:1: ( ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1595:1: ( ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1595:2: ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')'
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1595:2: ( (lv_id_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1596:1: (lv_id_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1596:1: (lv_id_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1597:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2816); 

            			createLeafNode(grammarAccess.getSpecialFunctionAccess().getIdIDTerminalRuleCall_0_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSpecialFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"id",
            	        		lv_id_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleSpecialFunction2831); 

                    createLeafNode(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1623:1: ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )*
            loop25:
            do {
                int alt25=9;
                switch ( input.LA(1) ) {
                case RULE_ANY_OTHER:
                    {
                    alt25=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA25_3 = input.LA(2);

                    if ( (LA25_3==12) ) {
                        alt25=8;
                    }
                    else if ( ((LA25_3>=RULE_ID && LA25_3<=RULE_INT)||LA25_3==13||LA25_3==16||(LA25_3>=24 && LA25_3<=25)) ) {
                        alt25=2;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    alt25=3;
                    }
                    break;
                case RULE_INT:
                    {
                    alt25=4;
                    }
                    break;
                case 16:
                    {
                    alt25=5;
                    }
                    break;
                case 24:
                    {
                    alt25=6;
                    }
                    break;
                case 25:
                    {
                    alt25=7;
                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1623:2: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSpecialFunction2841); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1628:6: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2855); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1633:6: RULE_STRING
            	    {
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpecialFunction2869); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1638:6: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSpecialFunction2883); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getINTTerminalRuleCall_2_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1643:7: ','
            	    {
            	    match(input,16,FOLLOW_16_in_ruleSpecialFunction2898); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1648:6: ( '$(' RULE_ID ')' )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1648:6: ( '$(' RULE_ID ')' )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1648:8: '$(' RULE_ID ')'
            	    {
            	    match(input,24,FOLLOW_24_in_ruleSpecialFunction2915); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_2_5_0(), null); 
            	        
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2924); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_5_1(), null); 
            	        
            	    match(input,13,FOLLOW_13_in_ruleSpecialFunction2933); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_2_5_2(), null); 
            	        

            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1661:6: ( '${' RULE_ID '}' )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1661:6: ( '${' RULE_ID '}' )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1661:8: '${' RULE_ID '}'
            	    {
            	    match(input,25,FOLLOW_25_in_ruleSpecialFunction2951); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_2_6_0(), null); 
            	        
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2960); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_6_1(), null); 
            	        
            	    match(input,19,FOLLOW_19_in_ruleSpecialFunction2969); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_2_6_2(), null); 
            	        

            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1674:6: ( (lv_func_13_0= ruleSpecialFunction ) )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1674:6: ( (lv_func_13_0= ruleSpecialFunction ) )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1675:1: (lv_func_13_0= ruleSpecialFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1675:1: (lv_func_13_0= ruleSpecialFunction )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1676:3: lv_func_13_0= ruleSpecialFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSpecialFunctionAccess().getFuncSpecialFunctionParserRuleCall_2_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleSpecialFunction2997);
            	    lv_func_13_0=ruleSpecialFunction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSpecialFunctionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"func",
            	    	        		lv_func_13_0, 
            	    	        		"SpecialFunction", 
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
            	    break loop25;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleSpecialFunction3009); 

                    createLeafNode(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_3(), null); 
                

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
    // $ANTLR end ruleSpecialFunction


    // $ANTLR start entryRuleBodyPromiseType
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1710:1: entryRuleBodyPromiseType returns [EObject current=null] : iv_ruleBodyPromiseType= ruleBodyPromiseType EOF ;
    public final EObject entryRuleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyPromiseType = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1711:2: (iv_ruleBodyPromiseType= ruleBodyPromiseType EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1712:2: iv_ruleBodyPromiseType= ruleBodyPromiseType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyPromiseTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType3045);
            iv_ruleBodyPromiseType=ruleBodyPromiseType();
            _fsp--;

             current =iv_ruleBodyPromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyPromiseType3055); 

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
    // $ANTLR end entryRuleBodyPromiseType


    // $ANTLR start ruleBodyPromiseType
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1719:1: ruleBodyPromiseType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1724:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1725:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1725:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1726:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1726:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1727:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyPromiseType3096); 

            			createLeafNode(grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBodyPromiseTypeRule().getType().getClassifier());
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
    // $ANTLR end ruleBodyPromiseType


    // $ANTLR start entryRuleBundleComponent
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1757:1: entryRuleBundleComponent returns [EObject current=null] : iv_ruleBundleComponent= ruleBundleComponent EOF ;
    public final EObject entryRuleBundleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleComponent = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1758:2: (iv_ruleBundleComponent= ruleBundleComponent EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1759:2: iv_ruleBundleComponent= ruleBundleComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent3136);
            iv_ruleBundleComponent=ruleBundleComponent();
            _fsp--;

             current =iv_ruleBundleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleComponent3146); 

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
    // $ANTLR end entryRuleBundleComponent


    // $ANTLR start ruleBundleComponent
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1766:1: ruleBundleComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBundleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1771:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1772:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1772:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1773:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1773:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1774:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundleComponent3187); 

            			createLeafNode(grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBundleComponentRule().getType().getClassifier());
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
    // $ANTLR end ruleBundleComponent


    // $ANTLR start entryRuleBodyComponent
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1804:1: entryRuleBodyComponent returns [EObject current=null] : iv_ruleBodyComponent= ruleBodyComponent EOF ;
    public final EObject entryRuleBodyComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyComponent = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1805:2: (iv_ruleBodyComponent= ruleBodyComponent EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1806:2: iv_ruleBodyComponent= ruleBodyComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent3227);
            iv_ruleBodyComponent=ruleBodyComponent();
            _fsp--;

             current =iv_ruleBodyComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent3237); 

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
    // $ANTLR end entryRuleBodyComponent


    // $ANTLR start ruleBodyComponent
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1813:1: ruleBodyComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1818:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1819:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1819:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1820:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1820:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1821:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyComponent3278); 

            			createLeafNode(grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBodyComponentRule().getType().getClassifier());
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
    // $ANTLR end ruleBodyComponent


 

    public static final BitSet FOLLOW_ruleCfModel_in_entryRuleCfModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCfModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleCfModel130 = new BitSet(new long[]{0x0000000000820002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_entryRuleCLASS_ID167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLASS_ID178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCLASS_ID218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCLASS_ID245 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleCLASS_ID263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCLASS_ID278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCLASS_ID304 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleCLASS_ID352 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID374 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCLASS_ID392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_entryRulePLACEHOLDERB434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePLACEHOLDERB445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rulePLACEHOLDERB485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePLACEHOLDERB511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePLACEHOLDERB537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePLACEHOLDERB561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePLACEHOLDERB580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePLACEHOLDERB599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePLACEHOLDERB618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePLACEHOLDERB637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_ruleAbstractElement733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_rulePart824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rulePart851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBundle931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_ruleBundle952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle969 = new BitSet(new long[]{0x000000000005F070L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_ruleBundle991 = new BitSet(new long[]{0x000000000005F070L});
    public static final BitSet FOLLOW_18_in_ruleBundle1002 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_ruleBundle1023 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleBundle1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType1070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromiseType1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundlePromiseType1122 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBundlePromiseType1137 = new BitSet(new long[]{0x0000000000001852L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_ruleBundlePromiseType1158 = new BitSet(new long[]{0x0000000000001852L});
    public static final BitSet FOLLOW_ruleBundleClass_in_ruleBundlePromiseType1180 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_ruleBundleClass_in_entryRuleBundleClass1217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleClass1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleBundleClass1273 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBundleClass1283 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_ruleBundleClass1304 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_entryRuleBundlePromise1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromise1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBundlePromise1393 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rulePromiseValue_in_ruleBundlePromise1420 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_16_in_ruleBundlePromise1431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePromiseValue_in_ruleBundlePromise1452 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_15_in_ruleBundlePromise1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_entryRulePromiseValue1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePromiseValue1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePromiseValue1554 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePromiseValue1569 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePromiseValue1638 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1656 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1688 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_rulePromiseValue1700 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1718 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1750 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_rulePromiseValue1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePromiseValue1781 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePromiseValue1791 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePromiseValue1801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePromiseValue1810 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePromiseValue1819 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePromiseValue1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBody1912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_ruleBody1933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1950 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_12_in_ruleBody1966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1983 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleBody1999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody2016 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleBody2033 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBody2045 = new BitSet(new long[]{0x0000000000081810L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBody2066 = new BitSet(new long[]{0x0000000000081810L});
    public static final BitSet FOLLOW_ruleBodyClass_in_ruleBody2088 = new BitSet(new long[]{0x0000000000081810L});
    public static final BitSet FOLLOW_19_in_ruleBody2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_entryRuleBodyClass2135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyClass2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleBodyClass2191 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBodyClass2201 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBodyClass2222 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction2259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyFunction2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction2315 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBodyFunction2325 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2343 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18_in_ruleBodyFunction2373 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2403 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleBodyFunction2419 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2436 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleBodyFunction2453 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleBodyFunction2481 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18_in_ruleBodyFunction2498 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBodyFunction2508 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBodyFunction2518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyFunction2527 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBodyFunction2536 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBodyFunction2546 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBodyFunction2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_entryRuleSimpleFunction2594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFunction2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleFunction2646 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSimpleFunction2661 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleFunction2678 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleSimpleFunction2694 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleFunction2711 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleSimpleFunction2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction2764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialFunction2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2816 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSpecialFunction2831 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSpecialFunction2841 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2855 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpecialFunction2869 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSpecialFunction2883 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_16_in_ruleSpecialFunction2898 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_24_in_ruleSpecialFunction2915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2924 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSpecialFunction2933 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_25_in_ruleSpecialFunction2951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2960 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSpecialFunction2969 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleSpecialFunction2997 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_13_in_ruleSpecialFunction3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType3045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyPromiseType3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyPromiseType3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent3136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleComponent3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundleComponent3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent3227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyComponent3278 = new BitSet(new long[]{0x0000000000000002L});

}