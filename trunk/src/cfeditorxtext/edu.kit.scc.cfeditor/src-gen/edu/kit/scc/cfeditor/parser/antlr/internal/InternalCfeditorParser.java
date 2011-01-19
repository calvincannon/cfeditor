package edu.kit.scc.cfeditor.parser.antlr.internal; 

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
import edu.kit.scc.cfeditor.services.CfeditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfeditorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANY_OTHER", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "'('", "')'", "'|'", "'!'", "'.'", "'=>'", "';'", "','", "'bundle'", "'{'", "':'", "'@'", "'}'", "'body'", "'$('", "'${'", "'::'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=5;
    public static final int RULE_INT=7;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;

        public InternalCfeditorParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g"; }



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
        	return classLoader.getResourceAsStream("edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.tokens");
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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:77:1: entryRuleCfModel returns [EObject current=null] : iv_ruleCfModel= ruleCfModel EOF ;
    public final EObject entryRuleCfModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCfModel = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:78:2: (iv_ruleCfModel= ruleCfModel EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:79:2: iv_ruleCfModel= ruleCfModel EOF
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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:86:1: ruleCfModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleCfModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:91:6: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:92:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:92:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:93:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:93:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:94:3: lv_elements_0_0= ruleAbstractElement
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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:124:1: entryRuleCLASS_ID returns [String current=null] : iv_ruleCLASS_ID= ruleCLASS_ID EOF ;
    public final String entryRuleCLASS_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCLASS_ID = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:125:2: (iv_ruleCLASS_ID= ruleCLASS_ID EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:126:2: iv_ruleCLASS_ID= ruleCLASS_ID EOF
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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:133:1: ruleCLASS_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '(' | kw= ')' | kw= '|' | kw= '!' | kw= '.' )+ ;
    public final AntlrDatatypeRuleToken ruleCLASS_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:138:6: ( (this_ID_0= RULE_ID | kw= '(' | kw= ')' | kw= '|' | kw= '!' | kw= '.' )+ )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:139:1: (this_ID_0= RULE_ID | kw= '(' | kw= ')' | kw= '|' | kw= '!' | kw= '.' )+
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:139:1: (this_ID_0= RULE_ID | kw= '(' | kw= ')' | kw= '|' | kw= '!' | kw= '.' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=7;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt2=1;
                    }
                    break;
                case 10:
                    {
                    alt2=2;
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
                case 13:
                    {
                    alt2=5;
                    }
                    break;
                case 14:
                    {
                    alt2=6;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:139:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCLASS_ID218); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:148:2: kw= '('
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,10,FOLLOW_10_in_ruleCLASS_ID242); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCLASS_IDAccess().getLeftParenthesisKeyword_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:155:2: kw= ')'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,11,FOLLOW_11_in_ruleCLASS_ID261); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:162:2: kw= '|'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,12,FOLLOW_12_in_ruleCLASS_ID280); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCLASS_IDAccess().getVerticalLineKeyword_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:169:2: kw= '!'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,13,FOLLOW_13_in_ruleCLASS_ID299); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCLASS_IDAccess().getExclamationMarkKeyword_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:176:2: kw= '.'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,14,FOLLOW_14_in_ruleCLASS_ID318); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_5(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end ruleCLASS_ID


    // $ANTLR start entryRulePLACEHOLDERB
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:191:1: entryRulePLACEHOLDERB returns [String current=null] : iv_rulePLACEHOLDERB= rulePLACEHOLDERB EOF ;
    public final String entryRulePLACEHOLDERB() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePLACEHOLDERB = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:192:2: (iv_rulePLACEHOLDERB= rulePLACEHOLDERB EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:193:2: iv_rulePLACEHOLDERB= rulePLACEHOLDERB EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPLACEHOLDERBRule(), currentNode); 
            pushFollow(FOLLOW_rulePLACEHOLDERB_in_entryRulePLACEHOLDERB362);
            iv_rulePLACEHOLDERB=rulePLACEHOLDERB();
            _fsp--;

             current =iv_rulePLACEHOLDERB.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePLACEHOLDERB373); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:200:1: rulePLACEHOLDERB returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulePLACEHOLDERB() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_0=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:205:6: ( (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:206:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:206:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )
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
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 10:
                {
                alt3=7;
                }
                break;
            case 11:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("206:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:206:6: this_ANY_OTHER_0= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_0=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rulePLACEHOLDERB413); 

                    		current.merge(this_ANY_OTHER_0);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getANY_OTHERTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:214:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePLACEHOLDERB439); 

                    		current.merge(this_ID_1);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getIDTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:222:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePLACEHOLDERB465); 

                    		current.merge(this_STRING_2);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getSTRINGTerminalRuleCall_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:231:2: kw= '=>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_rulePLACEHOLDERB489); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getEqualsSignGreaterThanSignKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:238:2: kw= ';'
                    {
                    kw=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_rulePLACEHOLDERB508); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getSemicolonKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:245:2: kw= ','
                    {
                    kw=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_rulePLACEHOLDERB527); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getCommaKeyword_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:252:2: kw= '('
                    {
                    kw=(Token)input.LT(1);
                    match(input,10,FOLLOW_10_in_rulePLACEHOLDERB546); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getLeftParenthesisKeyword_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:259:2: kw= ')'
                    {
                    kw=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_rulePLACEHOLDERB565); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:272:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:273:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:274:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement605);
            iv_ruleAbstractElement=ruleAbstractElement();
            _fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement615); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:281:1: ruleAbstractElement returns [EObject current=null] : this_Part_0= rulePart ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Part_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:286:6: (this_Part_0= rulePart )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:288:5: this_Part_0= rulePart
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAbstractElementAccess().getPartParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_rulePart_in_ruleAbstractElement661);
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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:304:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:305:2: (iv_rulePart= rulePart EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:306:2: iv_rulePart= rulePart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPartRule(), currentNode); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart695);
            iv_rulePart=rulePart();
            _fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart705); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:313:1: rulePart returns [EObject current=null] : (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        EObject this_Bundle_0 = null;

        EObject this_Body_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:318:6: ( (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:319:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:319:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("319:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:320:5: this_Bundle_0= ruleBundle
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getBundleParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBundle_in_rulePart752);
                    this_Bundle_0=ruleBundle();
                    _fsp--;

                     
                            current = this_Bundle_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:330:5: this_Body_1= ruleBody
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getBodyParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBody_in_rulePart779);
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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:346:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:347:2: (iv_ruleBundle= ruleBundle EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:348:2: iv_ruleBundle= ruleBundle EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle814);
            iv_ruleBundle=ruleBundle();
            _fsp--;

             current =iv_ruleBundle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle824); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:355:1: ruleBundle returns [EObject current=null] : ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( ( (lv_promiseType_5_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )* )* '}' ) ;
    public final EObject ruleBundle() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_component_1_0 = null;

        EObject lv_promiseType_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:360:6: ( ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( ( (lv_promiseType_5_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )* )* '}' ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:361:1: ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( ( (lv_promiseType_5_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )* )* '}' )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:361:1: ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( ( (lv_promiseType_5_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )* )* '}' )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:361:3: 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( ( (lv_promiseType_5_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )* )* '}'
            {
            match(input,18,FOLLOW_18_in_ruleBundle859); 

                    createLeafNode(grammarAccess.getBundleAccess().getBundleKeyword_0(), null); 
                
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:365:1: ( (lv_component_1_0= ruleBundleComponent ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:366:1: (lv_component_1_0= ruleBundleComponent )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:366:1: (lv_component_1_0= ruleBundleComponent )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:367:3: lv_component_1_0= ruleBundleComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBundleComponent_in_ruleBundle880);
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

            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:389:2: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:390:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:390:1: (lv_name_2_0= RULE_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:391:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle897); 

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

            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:413:2: ( rulePLACEHOLDERB )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)||(LA5_0>=10 && LA5_0<=11)||(LA5_0>=15 && LA5_0<=17)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:414:5: rulePLACEHOLDERB
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_3(), currentNode); 
            	        
            	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_ruleBundle919);
            	    rulePLACEHOLDERB();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_ruleBundle930); 

                    createLeafNode(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:425:1: ( ( (lv_promiseType_5_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )* )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:425:2: ( (lv_promiseType_5_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )*
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:425:2: ( (lv_promiseType_5_0= ruleBundlePromiseType ) )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:426:1: (lv_promiseType_5_0= ruleBundlePromiseType )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:426:1: (lv_promiseType_5_0= ruleBundlePromiseType )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:427:3: lv_promiseType_5_0= ruleBundlePromiseType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromiseType_in_ruleBundle952);
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

            	    match(input,20,FOLLOW_20_in_ruleBundle962); 

            	            createLeafNode(grammarAccess.getBundleAccess().getColonKeyword_5_1(), null); 
            	        
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:453:1: ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )*
            	    loop7:
            	    do {
            	        int alt7=3;
            	        switch ( input.LA(1) ) {
            	        case RULE_ID:
            	            {
            	            int LA7_2 = input.LA(2);

            	            if ( ((LA7_2>=RULE_ID && LA7_2<=RULE_STRING)||(LA7_2>=10 && LA7_2<=11)||(LA7_2>=15 && LA7_2<=17)||LA7_2==19||LA7_2==22) ) {
            	                alt7=1;
            	            }


            	            }
            	            break;
            	        case RULE_ANY_OTHER:
            	        case RULE_STRING:
            	        case 10:
            	        case 11:
            	        case 15:
            	        case 16:
            	        case 17:
            	            {
            	            alt7=1;
            	            }
            	            break;
            	        case 19:
            	            {
            	            alt7=2;
            	            }
            	            break;

            	        }

            	        switch (alt7) {
            	    	case 1 :
            	    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:454:5: rulePLACEHOLDERB
            	    	    {
            	    	     
            	    	            currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_5_2_0(), currentNode); 
            	    	        
            	    	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_ruleBundle979);
            	    	    rulePLACEHOLDERB();
            	    	    _fsp--;

            	    	     
            	    	            currentNode = currentNode.getParent();
            	    	        

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:462:6: ( '{' '@' ( rulePLACEHOLDERB )* '}' )
            	    	    {
            	    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:462:6: ( '{' '@' ( rulePLACEHOLDERB )* '}' )
            	    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:462:8: '{' '@' ( rulePLACEHOLDERB )* '}'
            	    	    {
            	    	    match(input,19,FOLLOW_19_in_ruleBundle995); 

            	    	            createLeafNode(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_5_2_1_0(), null); 
            	    	        
            	    	    match(input,21,FOLLOW_21_in_ruleBundle1005); 

            	    	            createLeafNode(grammarAccess.getBundleAccess().getCommercialAtKeyword_5_2_1_1(), null); 
            	    	        
            	    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:470:1: ( rulePLACEHOLDERB )*
            	    	    loop6:
            	    	    do {
            	    	        int alt6=2;
            	    	        int LA6_0 = input.LA(1);

            	    	        if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||(LA6_0>=10 && LA6_0<=11)||(LA6_0>=15 && LA6_0<=17)) ) {
            	    	            alt6=1;
            	    	        }


            	    	        switch (alt6) {
            	    	    	case 1 :
            	    	    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:471:5: rulePLACEHOLDERB
            	    	    	    {
            	    	    	     
            	    	    	            currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_5_2_1_2(), currentNode); 
            	    	    	        
            	    	    	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_ruleBundle1022);
            	    	    	    rulePLACEHOLDERB();
            	    	    	    _fsp--;

            	    	    	     
            	    	    	            currentNode = currentNode.getParent();
            	    	    	        

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop6;
            	    	        }
            	    	    } while (true);

            	    	    match(input,22,FOLLOW_22_in_ruleBundle1033); 

            	    	            createLeafNode(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_5_2_1_3(), null); 
            	    	        

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,22,FOLLOW_22_in_ruleBundle1048); 

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


    // $ANTLR start entryRuleBody
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:494:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:495:2: (iv_ruleBody= ruleBody EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:496:2: iv_ruleBody= ruleBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody1084);
            iv_ruleBody=ruleBody();
            _fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody1094); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:503:1: ruleBody returns [EObject current=null] : ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' ) ;
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
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:508:6: ( ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:509:1: ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:509:1: ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:509:3: 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}'
            {
            match(input,23,FOLLOW_23_in_ruleBody1129); 

                    createLeafNode(grammarAccess.getBodyAccess().getBodyKeyword_0(), null); 
                
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:513:1: ( (lv_component_1_0= ruleBodyComponent ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:514:1: (lv_component_1_0= ruleBodyComponent )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:514:1: (lv_component_1_0= ruleBodyComponent )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:515:3: lv_component_1_0= ruleBodyComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBodyComponent_in_ruleBody1150);
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

            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:537:2: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:538:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:538:1: (lv_name_2_0= RULE_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:539:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1167); 

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

            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:561:2: ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==10) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:561:4: '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')'
                    {
                    match(input,10,FOLLOW_10_in_ruleBody1183); 

                            createLeafNode(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:565:1: ( (lv_variables_4_0= RULE_ID ) )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:566:1: (lv_variables_4_0= RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:566:1: (lv_variables_4_0= RULE_ID )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:567:3: lv_variables_4_0= RULE_ID
                    {
                    lv_variables_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1200); 

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

                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:589:2: ( ',' ( (lv_variables_6_0= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==17) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:589:4: ',' ( (lv_variables_6_0= RULE_ID ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleBody1216); 

                    	            createLeafNode(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:593:1: ( (lv_variables_6_0= RULE_ID ) )
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:594:1: (lv_variables_6_0= RULE_ID )
                    	    {
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:594:1: (lv_variables_6_0= RULE_ID )
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:595:3: lv_variables_6_0= RULE_ID
                    	    {
                    	    lv_variables_6_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1233); 

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
                    	    break loop9;
                        }
                    } while (true);

                    match(input,11,FOLLOW_11_in_ruleBody1250); 

                            createLeafNode(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleBody1262); 

                    createLeafNode(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:625:1: ( (lv_promiseType_9_0= ruleBodyFunction ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==15) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:626:1: (lv_promiseType_9_0= ruleBodyFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:626:1: (lv_promiseType_9_0= ruleBodyFunction )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:627:3: lv_promiseType_9_0= ruleBodyFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBody1283);
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
            	    break loop11;
                }
            } while (true);

            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:649:3: ( (lv_classes_10_0= ruleBodyClass ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=10 && LA12_0<=14)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:650:1: (lv_classes_10_0= ruleBodyClass )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:650:1: (lv_classes_10_0= ruleBodyClass )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:651:3: lv_classes_10_0= ruleBodyClass
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getClassesBodyClassParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyClass_in_ruleBody1305);
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
            	    break loop12;
                }
            } while (true);

            match(input,22,FOLLOW_22_in_ruleBody1316); 

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


    // $ANTLR start entryRuleBodyFunction
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:685:1: entryRuleBodyFunction returns [EObject current=null] : iv_ruleBodyFunction= ruleBodyFunction EOF ;
    public final EObject entryRuleBodyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyFunction = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:686:2: (iv_ruleBodyFunction= ruleBodyFunction EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:687:2: iv_ruleBodyFunction= ruleBodyFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction1352);
            iv_ruleBodyFunction=ruleBodyFunction();
            _fsp--;

             current =iv_ruleBodyFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyFunction1362); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:694:1: ruleBodyFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) ) ';' ) ;
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
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:699:6: ( ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) ) ';' ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:700:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) ) ';' )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:700:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) ) ';' )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:700:2: ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) ) ';'
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:700:2: ( (lv_name_0_0= ruleBodyPromiseType ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:701:1: (lv_name_0_0= ruleBodyPromiseType )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:701:1: (lv_name_0_0= ruleBodyPromiseType )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:702:3: lv_name_0_0= ruleBodyPromiseType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction1408);
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

            match(input,15,FOLLOW_15_in_ruleBodyFunction1418); 

                    createLeafNode(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:728:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt15=1;
                }
                break;
            case 19:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==RULE_STRING) ) {
                    alt15=2;
                }
                else if ( (LA15_2==21) ) {
                    alt15=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("728:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("728:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:728:2: ( (lv_values_2_0= RULE_STRING ) )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:728:2: ( (lv_values_2_0= RULE_STRING ) )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:729:1: (lv_values_2_0= RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:729:1: (lv_values_2_0= RULE_STRING )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:730:3: lv_values_2_0= RULE_STRING
                    {
                    lv_values_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction1436); 

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
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:753:6: ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:753:6: ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:753:7: ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}'
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:753:7: ( (lv_List_3_0= '{' ) )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:754:1: (lv_List_3_0= '{' )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:754:1: (lv_List_3_0= '{' )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:755:3: lv_List_3_0= '{'
                    {
                    lv_List_3_0=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleBodyFunction1466); 

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

                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:774:2: ( (lv_values_4_0= RULE_STRING ) )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:775:1: (lv_values_4_0= RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:775:1: (lv_values_4_0= RULE_STRING )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:776:3: lv_values_4_0= RULE_STRING
                    {
                    lv_values_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction1496); 

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

                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:798:2: ( ',' ( (lv_values_6_0= RULE_STRING ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==17) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:798:4: ',' ( (lv_values_6_0= RULE_STRING ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleBodyFunction1512); 

                    	            createLeafNode(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:802:1: ( (lv_values_6_0= RULE_STRING ) )
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:803:1: (lv_values_6_0= RULE_STRING )
                    	    {
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:803:1: (lv_values_6_0= RULE_STRING )
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:804:3: lv_values_6_0= RULE_STRING
                    	    {
                    	    lv_values_6_0=(Token)input.LT(1);
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction1529); 

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
                    	    break loop13;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_ruleBodyFunction1546); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:831:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:831:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:832:1: (lv_function_8_0= ruleSpecialFunction )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:832:1: (lv_function_8_0= ruleSpecialFunction )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:833:3: lv_function_8_0= ruleSpecialFunction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleBodyFunction1574);
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
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:856:6: ( '{' '@' ( rulePLACEHOLDERB )* '}' )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:856:6: ( '{' '@' ( rulePLACEHOLDERB )* '}' )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:856:8: '{' '@' ( rulePLACEHOLDERB )* '}'
                    {
                    match(input,19,FOLLOW_19_in_ruleBodyFunction1591); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_3_0(), null); 
                        
                    match(input,21,FOLLOW_21_in_ruleBodyFunction1601); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getCommercialAtKeyword_2_3_1(), null); 
                        
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:864:1: ( rulePLACEHOLDERB )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||(LA14_0>=10 && LA14_0<=11)||(LA14_0>=15 && LA14_0<=17)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:865:5: rulePLACEHOLDERB
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getPLACEHOLDERBParserRuleCall_2_3_2(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_ruleBodyFunction1618);
                    	    rulePLACEHOLDERB();
                    	    _fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_ruleBodyFunction1629); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_3_3(), null); 
                        

                    }


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleBodyFunction1641); 

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


    // $ANTLR start entryRuleSpecialFunction
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:888:1: entryRuleSpecialFunction returns [EObject current=null] : iv_ruleSpecialFunction= ruleSpecialFunction EOF ;
    public final EObject entryRuleSpecialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialFunction = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:889:2: (iv_ruleSpecialFunction= ruleSpecialFunction EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:890:2: iv_ruleSpecialFunction= ruleSpecialFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSpecialFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction1677);
            iv_ruleSpecialFunction=ruleSpecialFunction();
            _fsp--;

             current =iv_ruleSpecialFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialFunction1687); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:897:1: ruleSpecialFunction returns [EObject current=null] : ( () RULE_ID '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_14_0= ruleSpecialFunction ) ) )* ')' ) ;
    public final EObject ruleSpecialFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_func_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:902:6: ( ( () RULE_ID '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_14_0= ruleSpecialFunction ) ) )* ')' ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:903:1: ( () RULE_ID '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_14_0= ruleSpecialFunction ) ) )* ')' )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:903:1: ( () RULE_ID '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_14_0= ruleSpecialFunction ) ) )* ')' )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:903:2: () RULE_ID '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_14_0= ruleSpecialFunction ) ) )* ')'
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:903:2: ()
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:904:5: 
            {
             
                    temp=factory.create(grammarAccess.getSpecialFunctionAccess().getSpecialFunctionAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getSpecialFunctionAccess().getSpecialFunctionAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction1730); 
             
                createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_1(), null); 
                
            match(input,10,FOLLOW_10_in_ruleSpecialFunction1739); 

                    createLeafNode(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:922:1: ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_14_0= ruleSpecialFunction ) ) )*
            loop16:
            do {
                int alt16=9;
                switch ( input.LA(1) ) {
                case RULE_ANY_OTHER:
                    {
                    alt16=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (LA16_3==10) ) {
                        alt16=8;
                    }
                    else if ( ((LA16_3>=RULE_ID && LA16_3<=RULE_INT)||LA16_3==11||LA16_3==17||(LA16_3>=24 && LA16_3<=25)) ) {
                        alt16=2;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    alt16=3;
                    }
                    break;
                case RULE_INT:
                    {
                    alt16=4;
                    }
                    break;
                case 17:
                    {
                    alt16=5;
                    }
                    break;
                case 24:
                    {
                    alt16=6;
                    }
                    break;
                case 25:
                    {
                    alt16=7;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:922:2: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSpecialFunction1749); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_3_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:927:6: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction1763); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_3_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:932:6: RULE_STRING
            	    {
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpecialFunction1777); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_3_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:937:6: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSpecialFunction1791); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getINTTerminalRuleCall_3_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:942:7: ','
            	    {
            	    match(input,17,FOLLOW_17_in_ruleSpecialFunction1806); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_3_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:947:6: ( '$(' RULE_ID ')' )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:947:6: ( '$(' RULE_ID ')' )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:947:8: '$(' RULE_ID ')'
            	    {
            	    match(input,24,FOLLOW_24_in_ruleSpecialFunction1823); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_3_5_0(), null); 
            	        
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction1832); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_3_5_1(), null); 
            	        
            	    match(input,11,FOLLOW_11_in_ruleSpecialFunction1841); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_3_5_2(), null); 
            	        

            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:960:6: ( '${' RULE_ID '}' )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:960:6: ( '${' RULE_ID '}' )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:960:8: '${' RULE_ID '}'
            	    {
            	    match(input,25,FOLLOW_25_in_ruleSpecialFunction1859); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_3_6_0(), null); 
            	        
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction1868); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_3_6_1(), null); 
            	        
            	    match(input,22,FOLLOW_22_in_ruleSpecialFunction1877); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_3_6_2(), null); 
            	        

            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:973:6: ( (lv_func_14_0= ruleSpecialFunction ) )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:973:6: ( (lv_func_14_0= ruleSpecialFunction ) )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:974:1: (lv_func_14_0= ruleSpecialFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:974:1: (lv_func_14_0= ruleSpecialFunction )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:975:3: lv_func_14_0= ruleSpecialFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSpecialFunctionAccess().getFuncSpecialFunctionParserRuleCall_3_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleSpecialFunction1905);
            	    lv_func_14_0=ruleSpecialFunction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSpecialFunctionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"func",
            	    	        		lv_func_14_0, 
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
            	    break loop16;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_ruleSpecialFunction1917); 

                    createLeafNode(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_4(), null); 
                

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


    // $ANTLR start entryRuleBundlePromiseType
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1009:1: entryRuleBundlePromiseType returns [EObject current=null] : iv_ruleBundlePromiseType= ruleBundlePromiseType EOF ;
    public final EObject entryRuleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundlePromiseType = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1010:2: (iv_ruleBundlePromiseType= ruleBundlePromiseType EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1011:2: iv_ruleBundlePromiseType= ruleBundlePromiseType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundlePromiseTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType1953);
            iv_ruleBundlePromiseType=ruleBundlePromiseType();
            _fsp--;

             current =iv_ruleBundlePromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromiseType1963); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1018:1: ruleBundlePromiseType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1023:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1024:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1024:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1025:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1025:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1026:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundlePromiseType2004); 

            			createLeafNode(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

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


    // $ANTLR start entryRuleBodyPromiseType
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1056:1: entryRuleBodyPromiseType returns [EObject current=null] : iv_ruleBodyPromiseType= ruleBodyPromiseType EOF ;
    public final EObject entryRuleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyPromiseType = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1057:2: (iv_ruleBodyPromiseType= ruleBodyPromiseType EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1058:2: iv_ruleBodyPromiseType= ruleBodyPromiseType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyPromiseTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType2044);
            iv_ruleBodyPromiseType=ruleBodyPromiseType();
            _fsp--;

             current =iv_ruleBodyPromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyPromiseType2054); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1065:1: ruleBodyPromiseType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1070:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1071:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1071:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1072:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1072:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1073:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyPromiseType2095); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1103:1: entryRuleBundleComponent returns [EObject current=null] : iv_ruleBundleComponent= ruleBundleComponent EOF ;
    public final EObject entryRuleBundleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleComponent = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1104:2: (iv_ruleBundleComponent= ruleBundleComponent EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1105:2: iv_ruleBundleComponent= ruleBundleComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent2135);
            iv_ruleBundleComponent=ruleBundleComponent();
            _fsp--;

             current =iv_ruleBundleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleComponent2145); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1112:1: ruleBundleComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBundleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1117:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1118:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1118:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1119:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1119:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1120:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundleComponent2186); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1150:1: entryRuleBodyComponent returns [EObject current=null] : iv_ruleBodyComponent= ruleBodyComponent EOF ;
    public final EObject entryRuleBodyComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyComponent = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1151:2: (iv_ruleBodyComponent= ruleBodyComponent EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1152:2: iv_ruleBodyComponent= ruleBodyComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent2226);
            iv_ruleBodyComponent=ruleBodyComponent();
            _fsp--;

             current =iv_ruleBodyComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent2236); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1159:1: ruleBodyComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1164:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1165:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1165:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1166:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1166:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1167:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyComponent2277); 

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


    // $ANTLR start entryRuleBodyClass
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1197:1: entryRuleBodyClass returns [EObject current=null] : iv_ruleBodyClass= ruleBodyClass EOF ;
    public final EObject entryRuleBodyClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyClass = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1198:2: (iv_ruleBodyClass= ruleBodyClass EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1199:2: iv_ruleBodyClass= ruleBodyClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyClass_in_entryRuleBodyClass2317);
            iv_ruleBodyClass=ruleBodyClass();
            _fsp--;

             current =iv_ruleBodyClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyClass2327); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1206:1: ruleBodyClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* ) ;
    public final EObject ruleBodyClass() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_promiseType_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1211:6: ( ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1212:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1212:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1212:2: ( (lv_name_0_0= ruleCLASS_ID ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )*
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1212:2: ( (lv_name_0_0= ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1213:1: (lv_name_0_0= ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1213:1: (lv_name_0_0= ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1214:3: lv_name_0_0= ruleCLASS_ID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyClassAccess().getNameCLASS_IDParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleBodyClass2373);
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

            match(input,26,FOLLOW_26_in_ruleBodyClass2383); 

                    createLeafNode(grammarAccess.getBodyClassAccess().getColonColonKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1240:1: ( (lv_promiseType_2_0= ruleBodyFunction ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==15) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1241:1: (lv_promiseType_2_0= ruleBodyFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1241:1: (lv_promiseType_2_0= ruleBodyFunction )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1242:3: lv_promiseType_2_0= ruleBodyFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyClassAccess().getPromiseTypeBodyFunctionParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBodyClass2404);
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
            	    break loop17;
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


 

    public static final BitSet FOLLOW_ruleCfModel_in_entryRuleCfModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCfModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleCfModel130 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_entryRuleCLASS_ID167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLASS_ID178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCLASS_ID218 = new BitSet(new long[]{0x0000000000007C12L});
    public static final BitSet FOLLOW_10_in_ruleCLASS_ID242 = new BitSet(new long[]{0x0000000000007C12L});
    public static final BitSet FOLLOW_11_in_ruleCLASS_ID261 = new BitSet(new long[]{0x0000000000007C12L});
    public static final BitSet FOLLOW_12_in_ruleCLASS_ID280 = new BitSet(new long[]{0x0000000000007C12L});
    public static final BitSet FOLLOW_13_in_ruleCLASS_ID299 = new BitSet(new long[]{0x0000000000007C12L});
    public static final BitSet FOLLOW_14_in_ruleCLASS_ID318 = new BitSet(new long[]{0x0000000000007C12L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_entryRulePLACEHOLDERB362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePLACEHOLDERB373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rulePLACEHOLDERB413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePLACEHOLDERB439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePLACEHOLDERB465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePLACEHOLDERB489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePLACEHOLDERB508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePLACEHOLDERB527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rulePLACEHOLDERB546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePLACEHOLDERB565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_ruleAbstractElement661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_rulePart752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rulePart779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBundle859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_ruleBundle880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle897 = new BitSet(new long[]{0x00000000000B8C70L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_ruleBundle919 = new BitSet(new long[]{0x00000000000B8C70L});
    public static final BitSet FOLLOW_19_in_ruleBundle930 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_ruleBundle952 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBundle962 = new BitSet(new long[]{0x00000000004B8C70L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_ruleBundle979 = new BitSet(new long[]{0x00000000004B8C70L});
    public static final BitSet FOLLOW_19_in_ruleBundle995 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBundle1005 = new BitSet(new long[]{0x0000000000438C70L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_ruleBundle1022 = new BitSet(new long[]{0x0000000000438C70L});
    public static final BitSet FOLLOW_22_in_ruleBundle1033 = new BitSet(new long[]{0x00000000004B8C70L});
    public static final BitSet FOLLOW_22_in_ruleBundle1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody1084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBody1129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_ruleBody1150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1167 = new BitSet(new long[]{0x0000000000080400L});
    public static final BitSet FOLLOW_10_in_ruleBody1183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1200 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_17_in_ruleBody1216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1233 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_11_in_ruleBody1250 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBody1262 = new BitSet(new long[]{0x0000000000407C10L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBody1283 = new BitSet(new long[]{0x0000000000407C10L});
    public static final BitSet FOLLOW_ruleBodyClass_in_ruleBody1305 = new BitSet(new long[]{0x0000000000407C10L});
    public static final BitSet FOLLOW_22_in_ruleBody1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction1352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyFunction1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction1408 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBodyFunction1418 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction1436 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19_in_ruleBodyFunction1466 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction1496 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_17_in_ruleBodyFunction1512 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction1529 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_22_in_ruleBodyFunction1546 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleBodyFunction1574 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19_in_ruleBodyFunction1591 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBodyFunction1601 = new BitSet(new long[]{0x0000000000438C70L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_ruleBodyFunction1618 = new BitSet(new long[]{0x0000000000438C70L});
    public static final BitSet FOLLOW_22_in_ruleBodyFunction1629 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBodyFunction1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction1677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialFunction1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction1730 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleSpecialFunction1739 = new BitSet(new long[]{0x00000000030208F0L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSpecialFunction1749 = new BitSet(new long[]{0x00000000030208F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction1763 = new BitSet(new long[]{0x00000000030208F0L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpecialFunction1777 = new BitSet(new long[]{0x00000000030208F0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSpecialFunction1791 = new BitSet(new long[]{0x00000000030208F0L});
    public static final BitSet FOLLOW_17_in_ruleSpecialFunction1806 = new BitSet(new long[]{0x00000000030208F0L});
    public static final BitSet FOLLOW_24_in_ruleSpecialFunction1823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction1832 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSpecialFunction1841 = new BitSet(new long[]{0x00000000030208F0L});
    public static final BitSet FOLLOW_25_in_ruleSpecialFunction1859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction1868 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSpecialFunction1877 = new BitSet(new long[]{0x00000000030208F0L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleSpecialFunction1905 = new BitSet(new long[]{0x00000000030208F0L});
    public static final BitSet FOLLOW_11_in_ruleSpecialFunction1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType1953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromiseType1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundlePromiseType2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType2044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyPromiseType2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyPromiseType2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent2135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleComponent2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundleComponent2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent2226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyComponent2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_entryRuleBodyClass2317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyClass2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleBodyClass2373 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBodyClass2383 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBodyClass2404 = new BitSet(new long[]{0x0000000000000012L});

}