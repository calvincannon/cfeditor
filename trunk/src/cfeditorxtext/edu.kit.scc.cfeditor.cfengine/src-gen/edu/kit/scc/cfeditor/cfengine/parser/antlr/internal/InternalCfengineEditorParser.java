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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:133:1: ruleCLASS_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_4= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? ) ) ;
    public final AntlrDatatypeRuleToken ruleCLASS_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_CLASS_ID_2 = null;

        AntlrDatatypeRuleToken this_CLASS_ID_4 = null;

        AntlrDatatypeRuleToken this_CLASS_ID_6 = null;

        AntlrDatatypeRuleToken this_CLASS_ID_9 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:138:6: ( ( (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_4= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:139:1: ( (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_4= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:139:1: ( (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_4= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 11:
                {
                alt4=2;
                }
                break;
            case 12:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("139:1: ( (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_4= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? ) )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:139:2: (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:139:2: (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:139:7: this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )?
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCLASS_ID219); 

                    		current.merge(this_ID_0);
                        
                     
                        createLeafNode(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_0_0(), null); 
                        
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:146:1: (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==10) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:147:2: kw= '.' this_CLASS_ID_2= ruleCLASS_ID
                            {
                            kw=(Token)input.LT(1);
                            match(input,10,FOLLOW_10_in_ruleCLASS_ID238); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_0_1_0(), null); 
                                
                             
                                    currentNode=createCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_0_1_1(), currentNode); 
                                
                            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID260);
                            this_CLASS_ID_2=ruleCLASS_ID();
                            _fsp--;


                            		current.merge(this_CLASS_ID_2);
                                
                             
                                    currentNode = currentNode.getParent();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:164:6: (kw= '!' this_CLASS_ID_4= ruleCLASS_ID )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:164:6: (kw= '!' this_CLASS_ID_4= ruleCLASS_ID )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:165:2: kw= '!' this_CLASS_ID_4= ruleCLASS_ID
                    {
                    kw=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleCLASS_ID288); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCLASS_IDAccess().getExclamationMarkKeyword_1_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_1_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID310);
                    this_CLASS_ID_4=ruleCLASS_ID();
                    _fsp--;


                    		current.merge(this_CLASS_ID_4);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:182:6: (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:182:6: (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:183:2: kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )?
                    {
                    kw=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleCLASS_ID336); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCLASS_IDAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID358);
                    this_CLASS_ID_6=ruleCLASS_ID();
                    _fsp--;


                    		current.merge(this_CLASS_ID_6);
                        
                     
                            currentNode = currentNode.getParent();
                        
                    kw=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleCLASS_ID376); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_2_2(), null); 
                        
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:205:1: (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==10) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:206:2: kw= '.' this_CLASS_ID_9= ruleCLASS_ID
                            {
                            kw=(Token)input.LT(1);
                            match(input,10,FOLLOW_10_in_ruleCLASS_ID390); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_2_3_0(), null); 
                                
                             
                                    currentNode=createCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_3_1(), currentNode); 
                                
                            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID412);
                            this_CLASS_ID_9=ruleCLASS_ID();
                            _fsp--;


                            		current.merge(this_CLASS_ID_9);
                                
                             
                                    currentNode = currentNode.getParent();
                                

                            }
                            break;

                    }


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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:230:1: entryRulePLACEHOLDERB returns [String current=null] : iv_rulePLACEHOLDERB= rulePLACEHOLDERB EOF ;
    public final String entryRulePLACEHOLDERB() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePLACEHOLDERB = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:231:2: (iv_rulePLACEHOLDERB= rulePLACEHOLDERB EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:232:2: iv_rulePLACEHOLDERB= rulePLACEHOLDERB EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPLACEHOLDERBRule(), currentNode); 
            pushFollow(FOLLOW_rulePLACEHOLDERB_in_entryRulePLACEHOLDERB461);
            iv_rulePLACEHOLDERB=rulePLACEHOLDERB();
            _fsp--;

             current =iv_rulePLACEHOLDERB.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePLACEHOLDERB472); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:239:1: rulePLACEHOLDERB returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulePLACEHOLDERB() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_0=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:244:6: ( (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:245:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:245:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )
            int alt5=8;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            case 12:
                {
                alt5=7;
                }
                break;
            case 13:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("245:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:245:6: this_ANY_OTHER_0= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_0=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rulePLACEHOLDERB512); 

                    		current.merge(this_ANY_OTHER_0);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getANY_OTHERTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:253:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePLACEHOLDERB538); 

                    		current.merge(this_ID_1);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getIDTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:261:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePLACEHOLDERB564); 

                    		current.merge(this_STRING_2);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getSTRINGTerminalRuleCall_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:270:2: kw= '=>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_rulePLACEHOLDERB588); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getEqualsSignGreaterThanSignKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:277:2: kw= ';'
                    {
                    kw=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_rulePLACEHOLDERB607); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getSemicolonKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:284:2: kw= ','
                    {
                    kw=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_rulePLACEHOLDERB626); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getCommaKeyword_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:291:2: kw= '('
                    {
                    kw=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_rulePLACEHOLDERB645); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getLeftParenthesisKeyword_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:298:2: kw= ')'
                    {
                    kw=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_rulePLACEHOLDERB664); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:311:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:312:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:313:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement704);
            iv_ruleAbstractElement=ruleAbstractElement();
            _fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement714); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:320:1: ruleAbstractElement returns [EObject current=null] : this_Part_0= rulePart ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Part_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:325:6: (this_Part_0= rulePart )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:327:5: this_Part_0= rulePart
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAbstractElementAccess().getPartParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_rulePart_in_ruleAbstractElement760);
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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:343:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:344:2: (iv_rulePart= rulePart EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:345:2: iv_rulePart= rulePart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPartRule(), currentNode); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart794);
            iv_rulePart=rulePart();
            _fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart804); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:352:1: rulePart returns [EObject current=null] : (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        EObject this_Bundle_0 = null;

        EObject this_Body_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:357:6: ( (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:358:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:358:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("358:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:359:5: this_Bundle_0= ruleBundle
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getBundleParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBundle_in_rulePart851);
                    this_Bundle_0=ruleBundle();
                    _fsp--;

                     
                            current = this_Bundle_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:369:5: this_Body_1= ruleBody
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getBodyParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBody_in_rulePart878);
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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:385:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:386:2: (iv_ruleBundle= ruleBundle EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:387:2: iv_ruleBundle= ruleBundle EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle913);
            iv_ruleBundle=ruleBundle();
            _fsp--;

             current =iv_ruleBundle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle923); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:394:1: ruleBundle returns [EObject current=null] : ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( (lv_promiseType_5_0= ruleBundlePromiseType ) )* '}' ) ;
    public final EObject ruleBundle() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_component_1_0 = null;

        EObject lv_promiseType_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:399:6: ( ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( (lv_promiseType_5_0= ruleBundlePromiseType ) )* '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:400:1: ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( (lv_promiseType_5_0= ruleBundlePromiseType ) )* '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:400:1: ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( (lv_promiseType_5_0= ruleBundlePromiseType ) )* '}' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:400:3: 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( (lv_promiseType_5_0= ruleBundlePromiseType ) )* '}'
            {
            match(input,17,FOLLOW_17_in_ruleBundle958); 

                    createLeafNode(grammarAccess.getBundleAccess().getBundleKeyword_0(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:404:1: ( (lv_component_1_0= ruleBundleComponent ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:405:1: (lv_component_1_0= ruleBundleComponent )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:405:1: (lv_component_1_0= ruleBundleComponent )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:406:3: lv_component_1_0= ruleBundleComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBundleComponent_in_ruleBundle979);
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

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:428:2: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:429:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:429:1: (lv_name_2_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:430:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle996); 

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

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:452:2: ( rulePLACEHOLDERB )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||(LA7_0>=12 && LA7_0<=16)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:453:5: rulePLACEHOLDERB
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_3(), currentNode); 
            	        
            	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_ruleBundle1018);
            	    rulePLACEHOLDERB();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleBundle1029); 

                    createLeafNode(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:464:1: ( (lv_promiseType_5_0= ruleBundlePromiseType ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:465:1: (lv_promiseType_5_0= ruleBundlePromiseType )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:465:1: (lv_promiseType_5_0= ruleBundlePromiseType )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:466:3: lv_promiseType_5_0= ruleBundlePromiseType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromiseType_in_ruleBundle1050);
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
            	    break loop8;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_ruleBundle1061); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:500:1: entryRuleBundlePromiseType returns [EObject current=null] : iv_ruleBundlePromiseType= ruleBundlePromiseType EOF ;
    public final EObject entryRuleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundlePromiseType = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:501:2: (iv_ruleBundlePromiseType= ruleBundlePromiseType EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:502:2: iv_ruleBundlePromiseType= ruleBundlePromiseType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundlePromiseTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType1097);
            iv_ruleBundlePromiseType=ruleBundlePromiseType();
            _fsp--;

             current =iv_ruleBundlePromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromiseType1107); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:509:1: ruleBundlePromiseType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* ) ;
    public final EObject ruleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_promises_2_0 = null;

        EObject lv_classes_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:514:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:515:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:515:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:515:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )*
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:515:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:516:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:516:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:517:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundlePromiseType1149); 

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

            match(input,20,FOLLOW_20_in_ruleBundlePromiseType1164); 

                    createLeafNode(grammarAccess.getBundlePromiseTypeAccess().getColonKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:543:1: ( (lv_promises_2_0= ruleBundlePromise ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:544:1: (lv_promises_2_0= ruleBundlePromise )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:544:1: (lv_promises_2_0= ruleBundlePromise )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:545:3: lv_promises_2_0= ruleBundlePromise
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundlePromiseTypeAccess().getPromisesBundlePromiseParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromise_in_ruleBundlePromiseType1185);
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
            	    break loop9;
                }
            } while (true);

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:567:3: ( (lv_classes_3_0= ruleBundleClass ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==10||LA10_2==21) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>=11 && LA10_0<=12)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:568:1: (lv_classes_3_0= ruleBundleClass )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:568:1: (lv_classes_3_0= ruleBundleClass )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:569:3: lv_classes_3_0= ruleBundleClass
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundlePromiseTypeAccess().getClassesBundleClassParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundleClass_in_ruleBundlePromiseType1207);
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
            	    break loop10;
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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:599:1: entryRuleBundleClass returns [EObject current=null] : iv_ruleBundleClass= ruleBundleClass EOF ;
    public final EObject entryRuleBundleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleClass = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:600:2: (iv_ruleBundleClass= ruleBundleClass EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:601:2: iv_ruleBundleClass= ruleBundleClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundleClass_in_entryRuleBundleClass1244);
            iv_ruleBundleClass=ruleBundleClass();
            _fsp--;

             current =iv_ruleBundleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleClass1254); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:608:1: ruleBundleClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ ) ;
    public final EObject ruleBundleClass() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_promises_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:613:6: ( ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:614:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:614:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:614:2: ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promises_2_0= ruleBundlePromise ) )+
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:614:2: ( (lv_name_0_0= ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:615:1: (lv_name_0_0= ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:615:1: (lv_name_0_0= ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:616:3: lv_name_0_0= ruleCLASS_ID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBundleClassAccess().getNameCLASS_IDParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleBundleClass1300);
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

            match(input,21,FOLLOW_21_in_ruleBundleClass1310); 

                    createLeafNode(grammarAccess.getBundleClassAccess().getColonColonKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:642:1: ( (lv_promises_2_0= ruleBundlePromise ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:643:1: (lv_promises_2_0= ruleBundlePromise )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:643:1: (lv_promises_2_0= ruleBundlePromise )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:644:3: lv_promises_2_0= ruleBundlePromise
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundleClassAccess().getPromisesBundlePromiseParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromise_in_ruleBundleClass1331);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:674:1: entryRuleBundlePromise returns [EObject current=null] : iv_ruleBundlePromise= ruleBundlePromise EOF ;
    public final EObject entryRuleBundlePromise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundlePromise = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:675:2: (iv_ruleBundlePromise= ruleBundlePromise EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:676:2: iv_ruleBundlePromise= ruleBundlePromise EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundlePromiseRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundlePromise_in_entryRuleBundlePromise1368);
            iv_ruleBundlePromise=ruleBundlePromise();
            _fsp--;

             current =iv_ruleBundlePromise; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromise1378); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:683:1: ruleBundlePromise returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* ';' ) ;
    public final EObject ruleBundlePromise() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:688:6: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* ';' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:689:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* ';' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:689:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* ';' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:689:2: ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* ';'
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:689:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:690:1: (lv_name_0_0= RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:690:1: (lv_name_0_0= RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:691:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBundlePromise1420); 

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

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:713:2: ( ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:713:3: ( (lv_values_1_0= rulePromiseValue ) ) ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )*
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:713:3: ( (lv_values_1_0= rulePromiseValue ) )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:714:1: (lv_values_1_0= rulePromiseValue )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:714:1: (lv_values_1_0= rulePromiseValue )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:715:3: lv_values_1_0= rulePromiseValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePromiseValue_in_ruleBundlePromise1447);
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

            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:737:2: ( ',' ( (lv_values_3_0= rulePromiseValue ) ) )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==16) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:737:4: ',' ( (lv_values_3_0= rulePromiseValue ) )
            	    	    {
            	    	    match(input,16,FOLLOW_16_in_ruleBundlePromise1458); 

            	    	            createLeafNode(grammarAccess.getBundlePromiseAccess().getCommaKeyword_1_1_0(), null); 
            	    	        
            	    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:741:1: ( (lv_values_3_0= rulePromiseValue ) )
            	    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:742:1: (lv_values_3_0= rulePromiseValue )
            	    	    {
            	    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:742:1: (lv_values_3_0= rulePromiseValue )
            	    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:743:3: lv_values_3_0= rulePromiseValue
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_1_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_rulePromiseValue_in_ruleBundlePromise1479);
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
            	    	    break loop12;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleBundlePromise1493); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:777:1: entryRulePromiseValue returns [EObject current=null] : iv_rulePromiseValue= rulePromiseValue EOF ;
    public final EObject entryRulePromiseValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePromiseValue = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:778:2: (iv_rulePromiseValue= rulePromiseValue EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:779:2: iv_rulePromiseValue= rulePromiseValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPromiseValueRule(), currentNode); 
            pushFollow(FOLLOW_rulePromiseValue_in_entryRulePromiseValue1529);
            iv_rulePromiseValue=rulePromiseValue();
            _fsp--;

             current =iv_rulePromiseValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePromiseValue1539); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:786:1: rulePromiseValue returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ) ;
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
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:791:6: ( ( ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:792:1: ( ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:792:1: ( ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:792:2: ( (lv_keyword_0_0= RULE_ID ) ) '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:792:2: ( (lv_keyword_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:793:1: (lv_keyword_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:793:1: (lv_keyword_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:794:3: lv_keyword_0_0= RULE_ID
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePromiseValue1581); 

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

            match(input,14,FOLLOW_14_in_rulePromiseValue1596); 

                    createLeafNode(grammarAccess.getPromiseValueAccess().getEqualsSignGreaterThanSignKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:820:1: ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==18) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==22) ) {
                    alt18=3;
                }
                else if ( (LA18_2==RULE_ID||LA18_2==RULE_STRING) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("820:1: ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) )", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("820:1: ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) ) | ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' ) | ( '{' '@' '(' RULE_ID ')' '}' ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:820:2: ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:820:2: ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) )
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
                            new NoViableAltException("820:2: ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) )", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:820:3: ( (lv_values_2_0= RULE_STRING ) )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:820:3: ( (lv_values_2_0= RULE_STRING ) )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:821:1: (lv_values_2_0= RULE_STRING )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:821:1: (lv_values_2_0= RULE_STRING )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:822:3: lv_values_2_0= RULE_STRING
                            {
                            lv_values_2_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1615); 

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
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:845:6: ( (lv_functions_3_0= ruleSimpleFunction ) )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:845:6: ( (lv_functions_3_0= ruleSimpleFunction ) )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:846:1: (lv_functions_3_0= ruleSimpleFunction )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:846:1: (lv_functions_3_0= ruleSimpleFunction )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:847:3: lv_functions_3_0= ruleSimpleFunction
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_0_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1647);
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
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:870:6: ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:870:6: ( '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:870:8: '{' ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) ) ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )* '}'
                    {
                    match(input,18,FOLLOW_18_in_rulePromiseValue1665); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_1_0(), null); 
                        
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:874:1: ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_STRING) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_ID) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("874:1: ( ( (lv_values_5_0= RULE_STRING ) ) | ( (lv_functions_6_0= ruleSimpleFunction ) ) )", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:874:2: ( (lv_values_5_0= RULE_STRING ) )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:874:2: ( (lv_values_5_0= RULE_STRING ) )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:875:1: (lv_values_5_0= RULE_STRING )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:875:1: (lv_values_5_0= RULE_STRING )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:876:3: lv_values_5_0= RULE_STRING
                            {
                            lv_values_5_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1683); 

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
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:899:6: ( (lv_functions_6_0= ruleSimpleFunction ) )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:899:6: ( (lv_functions_6_0= ruleSimpleFunction ) )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:900:1: (lv_functions_6_0= ruleSimpleFunction )
                            {
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:900:1: (lv_functions_6_0= ruleSimpleFunction )
                            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:901:3: lv_functions_6_0= ruleSimpleFunction
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1715);
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

                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:923:3: ( ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:923:5: ',' ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_rulePromiseValue1727); 

                    	            createLeafNode(grammarAccess.getPromiseValueAccess().getCommaKeyword_2_1_2_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:927:1: ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) )
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0==RULE_STRING) ) {
                    	        alt16=1;
                    	    }
                    	    else if ( (LA16_0==RULE_ID) ) {
                    	        alt16=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("927:1: ( ( (lv_values_8_0= RULE_STRING ) ) | ( (lv_functions_9_0= ruleSimpleFunction ) ) )", 16, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:927:2: ( (lv_values_8_0= RULE_STRING ) )
                    	            {
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:927:2: ( (lv_values_8_0= RULE_STRING ) )
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:928:1: (lv_values_8_0= RULE_STRING )
                    	            {
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:928:1: (lv_values_8_0= RULE_STRING )
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:929:3: lv_values_8_0= RULE_STRING
                    	            {
                    	            lv_values_8_0=(Token)input.LT(1);
                    	            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1745); 

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
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:952:6: ( (lv_functions_9_0= ruleSimpleFunction ) )
                    	            {
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:952:6: ( (lv_functions_9_0= ruleSimpleFunction ) )
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:953:1: (lv_functions_9_0= ruleSimpleFunction )
                    	            {
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:953:1: (lv_functions_9_0= ruleSimpleFunction )
                    	            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:954:3: lv_functions_9_0= ruleSimpleFunction
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_2_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1777);
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
                    	    break loop17;
                        }
                    } while (true);

                    match(input,19,FOLLOW_19_in_rulePromiseValue1790); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_1_3(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:981:6: ( '{' '@' '(' RULE_ID ')' '}' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:981:6: ( '{' '@' '(' RULE_ID ')' '}' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:981:8: '{' '@' '(' RULE_ID ')' '}'
                    {
                    match(input,18,FOLLOW_18_in_rulePromiseValue1808); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_2_0(), null); 
                        
                    match(input,22,FOLLOW_22_in_rulePromiseValue1818); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getCommercialAtKeyword_2_2_1(), null); 
                        
                    match(input,12,FOLLOW_12_in_rulePromiseValue1828); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getLeftParenthesisKeyword_2_2_2(), null); 
                        
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePromiseValue1837); 
                     
                        createLeafNode(grammarAccess.getPromiseValueAccess().getIDTerminalRuleCall_2_2_3(), null); 
                        
                    match(input,13,FOLLOW_13_in_rulePromiseValue1846); 

                            createLeafNode(grammarAccess.getPromiseValueAccess().getRightParenthesisKeyword_2_2_4(), null); 
                        
                    match(input,19,FOLLOW_19_in_rulePromiseValue1856); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1013:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1014:2: (iv_ruleBody= ruleBody EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1015:2: iv_ruleBody= ruleBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody1894);
            iv_ruleBody=ruleBody();
            _fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody1904); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1022:1: ruleBody returns [EObject current=null] : ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' ) ;
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
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1027:6: ( ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1028:1: ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1028:1: ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1028:3: 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}'
            {
            match(input,23,FOLLOW_23_in_ruleBody1939); 

                    createLeafNode(grammarAccess.getBodyAccess().getBodyKeyword_0(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1032:1: ( (lv_component_1_0= ruleBodyComponent ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1033:1: (lv_component_1_0= ruleBodyComponent )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1033:1: (lv_component_1_0= ruleBodyComponent )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1034:3: lv_component_1_0= ruleBodyComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBodyComponent_in_ruleBody1960);
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

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1056:2: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1057:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1057:1: (lv_name_2_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1058:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1977); 

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

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1080:2: ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1080:4: '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')'
                    {
                    match(input,12,FOLLOW_12_in_ruleBody1993); 

                            createLeafNode(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1084:1: ( (lv_variables_4_0= RULE_ID ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1085:1: (lv_variables_4_0= RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1085:1: (lv_variables_4_0= RULE_ID )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1086:3: lv_variables_4_0= RULE_ID
                    {
                    lv_variables_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody2010); 

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

                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1108:2: ( ',' ( (lv_variables_6_0= RULE_ID ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1108:4: ',' ( (lv_variables_6_0= RULE_ID ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleBody2026); 

                    	            createLeafNode(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1112:1: ( (lv_variables_6_0= RULE_ID ) )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1113:1: (lv_variables_6_0= RULE_ID )
                    	    {
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1113:1: (lv_variables_6_0= RULE_ID )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1114:3: lv_variables_6_0= RULE_ID
                    	    {
                    	    lv_variables_6_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody2043); 

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
                    	    break loop19;
                        }
                    } while (true);

                    match(input,13,FOLLOW_13_in_ruleBody2060); 

                            createLeafNode(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            match(input,18,FOLLOW_18_in_ruleBody2072); 

                    createLeafNode(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1144:1: ( (lv_promiseType_9_0= ruleBodyFunction ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==14) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1145:1: (lv_promiseType_9_0= ruleBodyFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1145:1: (lv_promiseType_9_0= ruleBodyFunction )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1146:3: lv_promiseType_9_0= ruleBodyFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBody2093);
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
            	    break loop21;
                }
            } while (true);

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1168:3: ( (lv_classes_10_0= ruleBodyClass ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=11 && LA22_0<=12)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1169:1: (lv_classes_10_0= ruleBodyClass )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1169:1: (lv_classes_10_0= ruleBodyClass )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1170:3: lv_classes_10_0= ruleBodyClass
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getClassesBodyClassParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyClass_in_ruleBody2115);
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
            	    break loop22;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_ruleBody2126); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1204:1: entryRuleBodyClass returns [EObject current=null] : iv_ruleBodyClass= ruleBodyClass EOF ;
    public final EObject entryRuleBodyClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyClass = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1205:2: (iv_ruleBodyClass= ruleBodyClass EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1206:2: iv_ruleBodyClass= ruleBodyClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyClass_in_entryRuleBodyClass2162);
            iv_ruleBodyClass=ruleBodyClass();
            _fsp--;

             current =iv_ruleBodyClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyClass2172); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1213:1: ruleBodyClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* ) ;
    public final EObject ruleBodyClass() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_promiseType_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1218:6: ( ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1219:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1219:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1219:2: ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )*
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1219:2: ( (lv_name_0_0= ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1220:1: (lv_name_0_0= ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1220:1: (lv_name_0_0= ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1221:3: lv_name_0_0= ruleCLASS_ID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyClassAccess().getNameCLASS_IDParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleBodyClass2218);
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

            match(input,21,FOLLOW_21_in_ruleBodyClass2228); 

                    createLeafNode(grammarAccess.getBodyClassAccess().getColonColonKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1247:1: ( (lv_promiseType_2_0= ruleBodyFunction ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==14) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1248:1: (lv_promiseType_2_0= ruleBodyFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1248:1: (lv_promiseType_2_0= ruleBodyFunction )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1249:3: lv_promiseType_2_0= ruleBodyFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyClassAccess().getPromiseTypeBodyFunctionParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBodyClass2249);
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
            	    break loop23;
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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1279:1: entryRuleBodyFunction returns [EObject current=null] : iv_ruleBodyFunction= ruleBodyFunction EOF ;
    public final EObject entryRuleBodyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyFunction = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1280:2: (iv_ruleBodyFunction= ruleBodyFunction EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1281:2: iv_ruleBodyFunction= ruleBodyFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction2286);
            iv_ruleBodyFunction=ruleBodyFunction();
            _fsp--;

             current =iv_ruleBodyFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyFunction2296); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1288:1: ruleBodyFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';' ) ;
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
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1293:6: ( ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1294:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1294:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1294:2: ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) ) ';'
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1294:2: ( (lv_name_0_0= ruleBodyPromiseType ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1295:1: (lv_name_0_0= ruleBodyPromiseType )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1295:1: (lv_name_0_0= ruleBodyPromiseType )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1296:3: lv_name_0_0= ruleBodyPromiseType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction2342);
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

            match(input,14,FOLLOW_14_in_ruleBodyFunction2352); 

                    createLeafNode(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1322:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt25=1;
                }
                break;
            case 18:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==22) ) {
                    alt25=4;
                }
                else if ( (LA25_2==RULE_STRING) ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1322:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) )", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1322:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' '(' RULE_ID ')' '}' ) )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1322:2: ( (lv_values_2_0= RULE_STRING ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1322:2: ( (lv_values_2_0= RULE_STRING ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1323:1: (lv_values_2_0= RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1323:1: (lv_values_2_0= RULE_STRING )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1324:3: lv_values_2_0= RULE_STRING
                    {
                    lv_values_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2370); 

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
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1347:6: ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1347:6: ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1347:7: ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}'
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1347:7: ( (lv_List_3_0= '{' ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1348:1: (lv_List_3_0= '{' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1348:1: (lv_List_3_0= '{' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1349:3: lv_List_3_0= '{'
                    {
                    lv_List_3_0=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleBodyFunction2400); 

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

                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1368:2: ( (lv_values_4_0= RULE_STRING ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1369:1: (lv_values_4_0= RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1369:1: (lv_values_4_0= RULE_STRING )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1370:3: lv_values_4_0= RULE_STRING
                    {
                    lv_values_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2430); 

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

                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1392:2: ( ',' ( (lv_values_6_0= RULE_STRING ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==16) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1392:4: ',' ( (lv_values_6_0= RULE_STRING ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleBodyFunction2446); 

                    	            createLeafNode(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1396:1: ( (lv_values_6_0= RULE_STRING ) )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1397:1: (lv_values_6_0= RULE_STRING )
                    	    {
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1397:1: (lv_values_6_0= RULE_STRING )
                    	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1398:3: lv_values_6_0= RULE_STRING
                    	    {
                    	    lv_values_6_0=(Token)input.LT(1);
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2463); 

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
                    	    break loop24;
                        }
                    } while (true);

                    match(input,19,FOLLOW_19_in_ruleBodyFunction2480); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1425:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1425:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1426:1: (lv_function_8_0= ruleSpecialFunction )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1426:1: (lv_function_8_0= ruleSpecialFunction )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1427:3: lv_function_8_0= ruleSpecialFunction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleBodyFunction2508);
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
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1450:6: ( '{' '@' '(' RULE_ID ')' '}' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1450:6: ( '{' '@' '(' RULE_ID ')' '}' )
                    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1450:8: '{' '@' '(' RULE_ID ')' '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleBodyFunction2525); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_3_0(), null); 
                        
                    match(input,22,FOLLOW_22_in_ruleBodyFunction2535); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getCommercialAtKeyword_2_3_1(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleBodyFunction2545); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getLeftParenthesisKeyword_2_3_2(), null); 
                        
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyFunction2554); 
                     
                        createLeafNode(grammarAccess.getBodyFunctionAccess().getIDTerminalRuleCall_2_3_3(), null); 
                        
                    match(input,13,FOLLOW_13_in_ruleBodyFunction2563); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getRightParenthesisKeyword_2_3_4(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleBodyFunction2573); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_3_5(), null); 
                        

                    }


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleBodyFunction2585); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1486:1: entryRuleSimpleFunction returns [EObject current=null] : iv_ruleSimpleFunction= ruleSimpleFunction EOF ;
    public final EObject entryRuleSimpleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFunction = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1487:2: (iv_ruleSimpleFunction= ruleSimpleFunction EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1488:2: iv_ruleSimpleFunction= ruleSimpleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_entryRuleSimpleFunction2621);
            iv_ruleSimpleFunction=ruleSimpleFunction();
            _fsp--;

             current =iv_ruleSimpleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFunction2631); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1495:1: ruleSimpleFunction returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')' ) ;
    public final EObject ruleSimpleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_values_2_0=null;
        Token lv_values_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1500:6: ( ( ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1501:1: ( ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1501:1: ( ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1501:2: ( (lv_id_0_0= RULE_ID ) ) '(' ( (lv_values_2_0= RULE_STRING ) ) ( ',' ( (lv_values_4_0= RULE_STRING ) ) )* ')'
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1501:2: ( (lv_id_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1502:1: (lv_id_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1502:1: (lv_id_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1503:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleFunction2673); 

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

            match(input,12,FOLLOW_12_in_ruleSimpleFunction2688); 

                    createLeafNode(grammarAccess.getSimpleFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1529:1: ( (lv_values_2_0= RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1530:1: (lv_values_2_0= RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1530:1: (lv_values_2_0= RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1531:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleFunction2705); 

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

            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1553:2: ( ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==16) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1553:4: ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleSimpleFunction2721); 

            	            createLeafNode(grammarAccess.getSimpleFunctionAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1557:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1558:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1558:1: (lv_values_4_0= RULE_STRING )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1559:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleFunction2738); 

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
            	    break loop26;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleSimpleFunction2755); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1593:1: entryRuleSpecialFunction returns [EObject current=null] : iv_ruleSpecialFunction= ruleSpecialFunction EOF ;
    public final EObject entryRuleSpecialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialFunction = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1594:2: (iv_ruleSpecialFunction= ruleSpecialFunction EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1595:2: iv_ruleSpecialFunction= ruleSpecialFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSpecialFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction2791);
            iv_ruleSpecialFunction=ruleSpecialFunction();
            _fsp--;

             current =iv_ruleSpecialFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialFunction2801); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1602:1: ruleSpecialFunction returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')' ) ;
    public final EObject ruleSpecialFunction() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_func_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1607:6: ( ( ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1608:1: ( ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1608:1: ( ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')' )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1608:2: ( (lv_id_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')'
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1608:2: ( (lv_id_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1609:1: (lv_id_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1609:1: (lv_id_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1610:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2843); 

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

            match(input,12,FOLLOW_12_in_ruleSpecialFunction2858); 

                    createLeafNode(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1636:1: ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )*
            loop27:
            do {
                int alt27=9;
                switch ( input.LA(1) ) {
                case RULE_ANY_OTHER:
                    {
                    alt27=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA27_3 = input.LA(2);

                    if ( (LA27_3==12) ) {
                        alt27=8;
                    }
                    else if ( ((LA27_3>=RULE_ID && LA27_3<=RULE_INT)||LA27_3==13||LA27_3==16||(LA27_3>=24 && LA27_3<=25)) ) {
                        alt27=2;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    alt27=3;
                    }
                    break;
                case RULE_INT:
                    {
                    alt27=4;
                    }
                    break;
                case 16:
                    {
                    alt27=5;
                    }
                    break;
                case 24:
                    {
                    alt27=6;
                    }
                    break;
                case 25:
                    {
                    alt27=7;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1636:2: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSpecialFunction2868); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1641:6: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2882); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1646:6: RULE_STRING
            	    {
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpecialFunction2896); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1651:6: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSpecialFunction2910); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getINTTerminalRuleCall_2_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1656:7: ','
            	    {
            	    match(input,16,FOLLOW_16_in_ruleSpecialFunction2925); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1661:6: ( '$(' RULE_ID ')' )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1661:6: ( '$(' RULE_ID ')' )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1661:8: '$(' RULE_ID ')'
            	    {
            	    match(input,24,FOLLOW_24_in_ruleSpecialFunction2942); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_2_5_0(), null); 
            	        
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2951); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_5_1(), null); 
            	        
            	    match(input,13,FOLLOW_13_in_ruleSpecialFunction2960); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_2_5_2(), null); 
            	        

            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1674:6: ( '${' RULE_ID '}' )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1674:6: ( '${' RULE_ID '}' )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1674:8: '${' RULE_ID '}'
            	    {
            	    match(input,25,FOLLOW_25_in_ruleSpecialFunction2978); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_2_6_0(), null); 
            	        
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2987); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_6_1(), null); 
            	        
            	    match(input,19,FOLLOW_19_in_ruleSpecialFunction2996); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_2_6_2(), null); 
            	        

            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1687:6: ( (lv_func_13_0= ruleSpecialFunction ) )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1687:6: ( (lv_func_13_0= ruleSpecialFunction ) )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1688:1: (lv_func_13_0= ruleSpecialFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1688:1: (lv_func_13_0= ruleSpecialFunction )
            	    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1689:3: lv_func_13_0= ruleSpecialFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSpecialFunctionAccess().getFuncSpecialFunctionParserRuleCall_2_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleSpecialFunction3024);
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
            	    break loop27;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleSpecialFunction3036); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1723:1: entryRuleBodyPromiseType returns [EObject current=null] : iv_ruleBodyPromiseType= ruleBodyPromiseType EOF ;
    public final EObject entryRuleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyPromiseType = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1724:2: (iv_ruleBodyPromiseType= ruleBodyPromiseType EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1725:2: iv_ruleBodyPromiseType= ruleBodyPromiseType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyPromiseTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType3072);
            iv_ruleBodyPromiseType=ruleBodyPromiseType();
            _fsp--;

             current =iv_ruleBodyPromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyPromiseType3082); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1732:1: ruleBodyPromiseType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1737:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1738:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1738:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1739:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1739:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1740:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyPromiseType3123); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1770:1: entryRuleBundleComponent returns [EObject current=null] : iv_ruleBundleComponent= ruleBundleComponent EOF ;
    public final EObject entryRuleBundleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleComponent = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1771:2: (iv_ruleBundleComponent= ruleBundleComponent EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1772:2: iv_ruleBundleComponent= ruleBundleComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent3163);
            iv_ruleBundleComponent=ruleBundleComponent();
            _fsp--;

             current =iv_ruleBundleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleComponent3173); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1779:1: ruleBundleComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBundleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1784:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1785:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1785:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1786:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1786:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1787:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundleComponent3214); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1817:1: entryRuleBodyComponent returns [EObject current=null] : iv_ruleBodyComponent= ruleBodyComponent EOF ;
    public final EObject entryRuleBodyComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyComponent = null;


        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1818:2: (iv_ruleBodyComponent= ruleBodyComponent EOF )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1819:2: iv_ruleBodyComponent= ruleBodyComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent3254);
            iv_ruleBodyComponent=ruleBodyComponent();
            _fsp--;

             current =iv_ruleBodyComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent3264); 

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
    // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1826:1: ruleBodyComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1831:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1832:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1832:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1833:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1833:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g:1834:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyComponent3305); 

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleCLASS_ID219 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_ruleCLASS_ID238 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCLASS_ID288 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleCLASS_ID336 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID358 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCLASS_ID376 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_ruleCLASS_ID390 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_entryRulePLACEHOLDERB461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePLACEHOLDERB472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rulePLACEHOLDERB512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePLACEHOLDERB538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePLACEHOLDERB564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePLACEHOLDERB588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePLACEHOLDERB607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePLACEHOLDERB626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePLACEHOLDERB645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePLACEHOLDERB664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_ruleAbstractElement760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_rulePart851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rulePart878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBundle958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_ruleBundle979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle996 = new BitSet(new long[]{0x000000000005F070L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_ruleBundle1018 = new BitSet(new long[]{0x000000000005F070L});
    public static final BitSet FOLLOW_18_in_ruleBundle1029 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_ruleBundle1050 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleBundle1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType1097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromiseType1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundlePromiseType1149 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBundlePromiseType1164 = new BitSet(new long[]{0x0000000000001852L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_ruleBundlePromiseType1185 = new BitSet(new long[]{0x0000000000001852L});
    public static final BitSet FOLLOW_ruleBundleClass_in_ruleBundlePromiseType1207 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_ruleBundleClass_in_entryRuleBundleClass1244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleClass1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleBundleClass1300 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBundleClass1310 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_ruleBundleClass1331 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_entryRuleBundlePromise1368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromise1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBundlePromise1420 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rulePromiseValue_in_ruleBundlePromise1447 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_16_in_ruleBundlePromise1458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePromiseValue_in_ruleBundlePromise1479 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_15_in_ruleBundlePromise1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_entryRulePromiseValue1529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePromiseValue1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePromiseValue1581 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePromiseValue1596 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePromiseValue1665 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1683 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1715 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_rulePromiseValue1727 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1745 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1777 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_rulePromiseValue1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePromiseValue1808 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePromiseValue1818 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePromiseValue1828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePromiseValue1837 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePromiseValue1846 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePromiseValue1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody1894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBody1939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_ruleBody1960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1977 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_12_in_ruleBody1993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody2010 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleBody2026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody2043 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleBody2060 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBody2072 = new BitSet(new long[]{0x0000000000081810L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBody2093 = new BitSet(new long[]{0x0000000000081810L});
    public static final BitSet FOLLOW_ruleBodyClass_in_ruleBody2115 = new BitSet(new long[]{0x0000000000081810L});
    public static final BitSet FOLLOW_19_in_ruleBody2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_entryRuleBodyClass2162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyClass2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleBodyClass2218 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBodyClass2228 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBodyClass2249 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction2286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyFunction2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction2342 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBodyFunction2352 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2370 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18_in_ruleBodyFunction2400 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2430 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleBodyFunction2446 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2463 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleBodyFunction2480 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleBodyFunction2508 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18_in_ruleBodyFunction2525 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBodyFunction2535 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBodyFunction2545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyFunction2554 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBodyFunction2563 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBodyFunction2573 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBodyFunction2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_entryRuleSimpleFunction2621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFunction2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleFunction2673 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSimpleFunction2688 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleFunction2705 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleSimpleFunction2721 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleFunction2738 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleSimpleFunction2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction2791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialFunction2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2843 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSpecialFunction2858 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSpecialFunction2868 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2882 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpecialFunction2896 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSpecialFunction2910 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_16_in_ruleSpecialFunction2925 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_24_in_ruleSpecialFunction2942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2951 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSpecialFunction2960 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_25_in_ruleSpecialFunction2978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2987 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSpecialFunction2996 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleSpecialFunction3024 = new BitSet(new long[]{0x00000000030120F0L});
    public static final BitSet FOLLOW_13_in_ruleSpecialFunction3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType3072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyPromiseType3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyPromiseType3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent3163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleComponent3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundleComponent3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent3254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyComponent3305 = new BitSet(new long[]{0x0000000000000002L});

}