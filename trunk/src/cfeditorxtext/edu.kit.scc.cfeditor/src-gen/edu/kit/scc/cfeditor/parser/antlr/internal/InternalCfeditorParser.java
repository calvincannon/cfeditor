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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANY_OTHER", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "'!'", "'=>'", "';'", "','", "'('", "')'", "'bundle'", "'{'", "':'", "'@'", "'}'", "'body'", "'$('", "'${'", "'::'"
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

                if ( (LA1_0==16||LA1_0==21) ) {
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


    // $ANTLR start entryRuleID_EXCL
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:124:1: entryRuleID_EXCL returns [String current=null] : iv_ruleID_EXCL= ruleID_EXCL EOF ;
    public final String entryRuleID_EXCL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID_EXCL = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:125:2: (iv_ruleID_EXCL= ruleID_EXCL EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:126:2: iv_ruleID_EXCL= ruleID_EXCL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getID_EXCLRule(), currentNode); 
            pushFollow(FOLLOW_ruleID_EXCL_in_entryRuleID_EXCL167);
            iv_ruleID_EXCL=ruleID_EXCL();
            _fsp--;

             current =iv_ruleID_EXCL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleID_EXCL178); 

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
    // $ANTLR end entryRuleID_EXCL


    // $ANTLR start ruleID_EXCL
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:133:1: ruleID_EXCL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '!' )? this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleID_EXCL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:138:6: ( ( (kw= '!' )? this_ID_1= RULE_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:139:1: ( (kw= '!' )? this_ID_1= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:139:1: ( (kw= '!' )? this_ID_1= RULE_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:139:2: (kw= '!' )? this_ID_1= RULE_ID
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:139:2: (kw= '!' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:140:2: kw= '!'
                    {
                    kw=(Token)input.LT(1);
                    match(input,10,FOLLOW_10_in_ruleID_EXCL217); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getID_EXCLAccess().getExclamationMarkKeyword_0(), null); 
                        

                    }
                    break;

            }

            this_ID_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleID_EXCL234); 

            		current.merge(this_ID_1);
                
             
                createLeafNode(grammarAccess.getID_EXCLAccess().getIDTerminalRuleCall_1(), null); 
                

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
    // $ANTLR end ruleID_EXCL


    // $ANTLR start entryRulePLACEHOLDERB
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:162:1: entryRulePLACEHOLDERB returns [String current=null] : iv_rulePLACEHOLDERB= rulePLACEHOLDERB EOF ;
    public final String entryRulePLACEHOLDERB() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePLACEHOLDERB = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:163:2: (iv_rulePLACEHOLDERB= rulePLACEHOLDERB EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:164:2: iv_rulePLACEHOLDERB= rulePLACEHOLDERB EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPLACEHOLDERBRule(), currentNode); 
            pushFollow(FOLLOW_rulePLACEHOLDERB_in_entryRulePLACEHOLDERB282);
            iv_rulePLACEHOLDERB=rulePLACEHOLDERB();
            _fsp--;

             current =iv_rulePLACEHOLDERB.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePLACEHOLDERB293); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:171:1: rulePLACEHOLDERB returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulePLACEHOLDERB() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_0=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:176:6: ( (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:177:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:177:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )
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
            case 11:
                {
                alt3=4;
                }
                break;
            case 12:
                {
                alt3=5;
                }
                break;
            case 13:
                {
                alt3=6;
                }
                break;
            case 14:
                {
                alt3=7;
                }
                break;
            case 15:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("177:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:177:6: this_ANY_OTHER_0= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_0=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rulePLACEHOLDERB333); 

                    		current.merge(this_ANY_OTHER_0);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getANY_OTHERTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:185:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePLACEHOLDERB359); 

                    		current.merge(this_ID_1);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getIDTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:193:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePLACEHOLDERB385); 

                    		current.merge(this_STRING_2);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getSTRINGTerminalRuleCall_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:202:2: kw= '=>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_rulePLACEHOLDERB409); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getEqualsSignGreaterThanSignKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:209:2: kw= ';'
                    {
                    kw=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_rulePLACEHOLDERB428); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getSemicolonKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:216:2: kw= ','
                    {
                    kw=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_rulePLACEHOLDERB447); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getCommaKeyword_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:223:2: kw= '('
                    {
                    kw=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_rulePLACEHOLDERB466); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERBAccess().getLeftParenthesisKeyword_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:230:2: kw= ')'
                    {
                    kw=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_rulePLACEHOLDERB485); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:243:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:244:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:245:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement525);
            iv_ruleAbstractElement=ruleAbstractElement();
            _fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement535); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:252:1: ruleAbstractElement returns [EObject current=null] : this_Part_0= rulePart ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Part_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:257:6: (this_Part_0= rulePart )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:259:5: this_Part_0= rulePart
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAbstractElementAccess().getPartParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_rulePart_in_ruleAbstractElement581);
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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:275:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:276:2: (iv_rulePart= rulePart EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:277:2: iv_rulePart= rulePart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPartRule(), currentNode); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart615);
            iv_rulePart=rulePart();
            _fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart625); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:284:1: rulePart returns [EObject current=null] : (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        EObject this_Bundle_0 = null;

        EObject this_Body_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:289:6: ( (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:290:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:290:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("290:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:291:5: this_Bundle_0= ruleBundle
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getBundleParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBundle_in_rulePart672);
                    this_Bundle_0=ruleBundle();
                    _fsp--;

                     
                            current = this_Bundle_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:301:5: this_Body_1= ruleBody
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getBodyParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBody_in_rulePart699);
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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:317:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:318:2: (iv_ruleBundle= ruleBundle EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:319:2: iv_ruleBundle= ruleBundle EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle734);
            iv_ruleBundle=ruleBundle();
            _fsp--;

             current =iv_ruleBundle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle744); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:326:1: ruleBundle returns [EObject current=null] : ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( ( (lv_promiseType_5_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )* )* '}' ) ;
    public final EObject ruleBundle() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_component_1_0 = null;

        EObject lv_promiseType_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:331:6: ( ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( ( (lv_promiseType_5_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )* )* '}' ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:332:1: ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( ( (lv_promiseType_5_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )* )* '}' )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:332:1: ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( ( (lv_promiseType_5_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )* )* '}' )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:332:3: 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDERB )* '{' ( ( (lv_promiseType_5_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )* )* '}'
            {
            match(input,16,FOLLOW_16_in_ruleBundle779); 

                    createLeafNode(grammarAccess.getBundleAccess().getBundleKeyword_0(), null); 
                
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:336:1: ( (lv_component_1_0= ruleBundleComponent ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:337:1: (lv_component_1_0= ruleBundleComponent )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:337:1: (lv_component_1_0= ruleBundleComponent )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:338:3: lv_component_1_0= ruleBundleComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBundleComponent_in_ruleBundle800);
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

            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:360:2: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:361:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:361:1: (lv_name_2_0= RULE_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:362:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle817); 

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

            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:384:2: ( rulePLACEHOLDERB )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)||(LA5_0>=11 && LA5_0<=15)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:385:5: rulePLACEHOLDERB
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_3(), currentNode); 
            	        
            	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_ruleBundle839);
            	    rulePLACEHOLDERB();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleBundle850); 

                    createLeafNode(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:396:1: ( ( (lv_promiseType_5_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )* )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:396:2: ( (lv_promiseType_5_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )*
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:396:2: ( (lv_promiseType_5_0= ruleBundlePromiseType ) )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:397:1: (lv_promiseType_5_0= ruleBundlePromiseType )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:397:1: (lv_promiseType_5_0= ruleBundlePromiseType )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:398:3: lv_promiseType_5_0= ruleBundlePromiseType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromiseType_in_ruleBundle872);
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

            	    match(input,18,FOLLOW_18_in_ruleBundle882); 

            	            createLeafNode(grammarAccess.getBundleAccess().getColonKeyword_5_1(), null); 
            	        
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:424:1: ( rulePLACEHOLDERB | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )*
            	    loop7:
            	    do {
            	        int alt7=3;
            	        switch ( input.LA(1) ) {
            	        case RULE_ID:
            	            {
            	            int LA7_2 = input.LA(2);

            	            if ( ((LA7_2>=RULE_ID && LA7_2<=RULE_STRING)||(LA7_2>=11 && LA7_2<=15)||LA7_2==17||LA7_2==20) ) {
            	                alt7=1;
            	            }


            	            }
            	            break;
            	        case RULE_ANY_OTHER:
            	        case RULE_STRING:
            	        case 11:
            	        case 12:
            	        case 13:
            	        case 14:
            	        case 15:
            	            {
            	            alt7=1;
            	            }
            	            break;
            	        case 17:
            	            {
            	            alt7=2;
            	            }
            	            break;

            	        }

            	        switch (alt7) {
            	    	case 1 :
            	    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:425:5: rulePLACEHOLDERB
            	    	    {
            	    	     
            	    	            currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_5_2_0(), currentNode); 
            	    	        
            	    	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_ruleBundle899);
            	    	    rulePLACEHOLDERB();
            	    	    _fsp--;

            	    	     
            	    	            currentNode = currentNode.getParent();
            	    	        

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:433:6: ( '{' '@' ( rulePLACEHOLDERB )* '}' )
            	    	    {
            	    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:433:6: ( '{' '@' ( rulePLACEHOLDERB )* '}' )
            	    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:433:8: '{' '@' ( rulePLACEHOLDERB )* '}'
            	    	    {
            	    	    match(input,17,FOLLOW_17_in_ruleBundle915); 

            	    	            createLeafNode(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_5_2_1_0(), null); 
            	    	        
            	    	    match(input,19,FOLLOW_19_in_ruleBundle925); 

            	    	            createLeafNode(grammarAccess.getBundleAccess().getCommercialAtKeyword_5_2_1_1(), null); 
            	    	        
            	    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:441:1: ( rulePLACEHOLDERB )*
            	    	    loop6:
            	    	    do {
            	    	        int alt6=2;
            	    	        int LA6_0 = input.LA(1);

            	    	        if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||(LA6_0>=11 && LA6_0<=15)) ) {
            	    	            alt6=1;
            	    	        }


            	    	        switch (alt6) {
            	    	    	case 1 :
            	    	    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:442:5: rulePLACEHOLDERB
            	    	    	    {
            	    	    	     
            	    	    	            currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_5_2_1_2(), currentNode); 
            	    	    	        
            	    	    	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_ruleBundle942);
            	    	    	    rulePLACEHOLDERB();
            	    	    	    _fsp--;

            	    	    	     
            	    	    	            currentNode = currentNode.getParent();
            	    	    	        

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop6;
            	    	        }
            	    	    } while (true);

            	    	    match(input,20,FOLLOW_20_in_ruleBundle953); 

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

            match(input,20,FOLLOW_20_in_ruleBundle968); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:465:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:466:2: (iv_ruleBody= ruleBody EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:467:2: iv_ruleBody= ruleBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody1004);
            iv_ruleBody=ruleBody();
            _fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody1014); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:474:1: ruleBody returns [EObject current=null] : ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' ) ;
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
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:479:6: ( ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:480:1: ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:480:1: ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}' )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:480:3: 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )? '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* '}'
            {
            match(input,21,FOLLOW_21_in_ruleBody1049); 

                    createLeafNode(grammarAccess.getBodyAccess().getBodyKeyword_0(), null); 
                
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:484:1: ( (lv_component_1_0= ruleBodyComponent ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:485:1: (lv_component_1_0= ruleBodyComponent )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:485:1: (lv_component_1_0= ruleBodyComponent )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:486:3: lv_component_1_0= ruleBodyComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBodyComponent_in_ruleBody1070);
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

            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:508:2: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:509:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:509:1: (lv_name_2_0= RULE_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:510:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1087); 

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

            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:532:2: ( '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:532:4: '(' ( (lv_variables_4_0= RULE_ID ) ) ( ',' ( (lv_variables_6_0= RULE_ID ) ) )* ')'
                    {
                    match(input,14,FOLLOW_14_in_ruleBody1103); 

                            createLeafNode(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:536:1: ( (lv_variables_4_0= RULE_ID ) )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:537:1: (lv_variables_4_0= RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:537:1: (lv_variables_4_0= RULE_ID )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:538:3: lv_variables_4_0= RULE_ID
                    {
                    lv_variables_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1120); 

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

                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:560:2: ( ',' ( (lv_variables_6_0= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==13) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:560:4: ',' ( (lv_variables_6_0= RULE_ID ) )
                    	    {
                    	    match(input,13,FOLLOW_13_in_ruleBody1136); 

                    	            createLeafNode(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:564:1: ( (lv_variables_6_0= RULE_ID ) )
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:565:1: (lv_variables_6_0= RULE_ID )
                    	    {
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:565:1: (lv_variables_6_0= RULE_ID )
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:566:3: lv_variables_6_0= RULE_ID
                    	    {
                    	    lv_variables_6_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1153); 

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

                    match(input,15,FOLLOW_15_in_ruleBody1170); 

                            createLeafNode(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleBody1182); 

                    createLeafNode(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:596:1: ( (lv_promiseType_9_0= ruleBodyFunction ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==11) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:597:1: (lv_promiseType_9_0= ruleBodyFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:597:1: (lv_promiseType_9_0= ruleBodyFunction )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:598:3: lv_promiseType_9_0= ruleBodyFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBody1203);
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

            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:620:3: ( (lv_classes_10_0= ruleBodyClass ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==10) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:621:1: (lv_classes_10_0= ruleBodyClass )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:621:1: (lv_classes_10_0= ruleBodyClass )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:622:3: lv_classes_10_0= ruleBodyClass
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getClassesBodyClassParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyClass_in_ruleBody1225);
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

            match(input,20,FOLLOW_20_in_ruleBody1236); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:656:1: entryRuleBodyFunction returns [EObject current=null] : iv_ruleBodyFunction= ruleBodyFunction EOF ;
    public final EObject entryRuleBodyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyFunction = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:657:2: (iv_ruleBodyFunction= ruleBodyFunction EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:658:2: iv_ruleBodyFunction= ruleBodyFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction1272);
            iv_ruleBodyFunction=ruleBodyFunction();
            _fsp--;

             current =iv_ruleBodyFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyFunction1282); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:665:1: ruleBodyFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) ) ';' ) ;
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
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:670:6: ( ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) ) ';' ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:671:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) ) ';' )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:671:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) ) ';' )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:671:2: ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) ) ';'
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:671:2: ( (lv_name_0_0= ruleBodyPromiseType ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:672:1: (lv_name_0_0= ruleBodyPromiseType )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:672:1: (lv_name_0_0= ruleBodyPromiseType )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:673:3: lv_name_0_0= ruleBodyPromiseType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction1328);
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

            match(input,11,FOLLOW_11_in_ruleBodyFunction1338); 

                    createLeafNode(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:699:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt15=1;
                }
                break;
            case 17:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==RULE_STRING) ) {
                    alt15=2;
                }
                else if ( (LA15_2==19) ) {
                    alt15=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("699:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )", 15, 2, input);

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
                    new NoViableAltException("699:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | ( '{' '@' ( rulePLACEHOLDERB )* '}' ) )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:699:2: ( (lv_values_2_0= RULE_STRING ) )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:699:2: ( (lv_values_2_0= RULE_STRING ) )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:700:1: (lv_values_2_0= RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:700:1: (lv_values_2_0= RULE_STRING )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:701:3: lv_values_2_0= RULE_STRING
                    {
                    lv_values_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction1356); 

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
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:724:6: ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:724:6: ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:724:7: ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}'
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:724:7: ( (lv_List_3_0= '{' ) )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:725:1: (lv_List_3_0= '{' )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:725:1: (lv_List_3_0= '{' )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:726:3: lv_List_3_0= '{'
                    {
                    lv_List_3_0=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleBodyFunction1386); 

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

                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:745:2: ( (lv_values_4_0= RULE_STRING ) )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:746:1: (lv_values_4_0= RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:746:1: (lv_values_4_0= RULE_STRING )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:747:3: lv_values_4_0= RULE_STRING
                    {
                    lv_values_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction1416); 

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

                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:769:2: ( ',' ( (lv_values_6_0= RULE_STRING ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==13) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:769:4: ',' ( (lv_values_6_0= RULE_STRING ) )
                    	    {
                    	    match(input,13,FOLLOW_13_in_ruleBodyFunction1432); 

                    	            createLeafNode(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0(), null); 
                    	        
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:773:1: ( (lv_values_6_0= RULE_STRING ) )
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:774:1: (lv_values_6_0= RULE_STRING )
                    	    {
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:774:1: (lv_values_6_0= RULE_STRING )
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:775:3: lv_values_6_0= RULE_STRING
                    	    {
                    	    lv_values_6_0=(Token)input.LT(1);
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction1449); 

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

                    match(input,20,FOLLOW_20_in_ruleBodyFunction1466); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:802:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:802:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:803:1: (lv_function_8_0= ruleSpecialFunction )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:803:1: (lv_function_8_0= ruleSpecialFunction )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:804:3: lv_function_8_0= ruleSpecialFunction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleBodyFunction1494);
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
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:827:6: ( '{' '@' ( rulePLACEHOLDERB )* '}' )
                    {
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:827:6: ( '{' '@' ( rulePLACEHOLDERB )* '}' )
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:827:8: '{' '@' ( rulePLACEHOLDERB )* '}'
                    {
                    match(input,17,FOLLOW_17_in_ruleBodyFunction1511); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_3_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleBodyFunction1521); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getCommercialAtKeyword_2_3_1(), null); 
                        
                    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:835:1: ( rulePLACEHOLDERB )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||(LA14_0>=11 && LA14_0<=15)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:836:5: rulePLACEHOLDERB
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getPLACEHOLDERBParserRuleCall_2_3_2(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_ruleBodyFunction1538);
                    	    rulePLACEHOLDERB();
                    	    _fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match(input,20,FOLLOW_20_in_ruleBodyFunction1549); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_3_3(), null); 
                        

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleBodyFunction1561); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:859:1: entryRuleSpecialFunction returns [EObject current=null] : iv_ruleSpecialFunction= ruleSpecialFunction EOF ;
    public final EObject entryRuleSpecialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialFunction = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:860:2: (iv_ruleSpecialFunction= ruleSpecialFunction EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:861:2: iv_ruleSpecialFunction= ruleSpecialFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSpecialFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction1597);
            iv_ruleSpecialFunction=ruleSpecialFunction();
            _fsp--;

             current =iv_ruleSpecialFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialFunction1607); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:868:1: ruleSpecialFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')' ) ;
    public final EObject ruleSpecialFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_func_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:873:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')' ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:874:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')' )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:874:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')' )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:874:2: ( (lv_name_0_0= RULE_ID ) ) '(' ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )* ')'
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:874:2: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:875:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:875:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:876:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction1649); 

            			createLeafNode(grammarAccess.getSpecialFunctionAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSpecialFunctionRule().getType().getClassifier());
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

            match(input,14,FOLLOW_14_in_ruleSpecialFunction1664); 

                    createLeafNode(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:902:1: ( RULE_ANY_OTHER | RULE_ID | RULE_STRING | RULE_INT | ',' | ( '$(' RULE_ID ')' ) | ( '${' RULE_ID '}' ) | ( (lv_func_13_0= ruleSpecialFunction ) ) )*
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

                    if ( (LA16_3==14) ) {
                        alt16=8;
                    }
                    else if ( ((LA16_3>=RULE_ID && LA16_3<=RULE_INT)||LA16_3==13||LA16_3==15||(LA16_3>=22 && LA16_3<=23)) ) {
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
                case 13:
                    {
                    alt16=5;
                    }
                    break;
                case 22:
                    {
                    alt16=6;
                    }
                    break;
                case 23:
                    {
                    alt16=7;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:902:2: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSpecialFunction1674); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:907:6: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction1688); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:912:6: RULE_STRING
            	    {
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpecialFunction1702); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:917:6: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSpecialFunction1716); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getINTTerminalRuleCall_2_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:922:7: ','
            	    {
            	    match(input,13,FOLLOW_13_in_ruleSpecialFunction1731); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:927:6: ( '$(' RULE_ID ')' )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:927:6: ( '$(' RULE_ID ')' )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:927:8: '$(' RULE_ID ')'
            	    {
            	    match(input,22,FOLLOW_22_in_ruleSpecialFunction1748); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_2_5_0(), null); 
            	        
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction1757); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_5_1(), null); 
            	        
            	    match(input,15,FOLLOW_15_in_ruleSpecialFunction1766); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_2_5_2(), null); 
            	        

            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:940:6: ( '${' RULE_ID '}' )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:940:6: ( '${' RULE_ID '}' )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:940:8: '${' RULE_ID '}'
            	    {
            	    match(input,23,FOLLOW_23_in_ruleSpecialFunction1784); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_2_6_0(), null); 
            	        
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction1793); 
            	     
            	        createLeafNode(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_6_1(), null); 
            	        
            	    match(input,20,FOLLOW_20_in_ruleSpecialFunction1802); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_2_6_2(), null); 
            	        

            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:953:6: ( (lv_func_13_0= ruleSpecialFunction ) )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:953:6: ( (lv_func_13_0= ruleSpecialFunction ) )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:954:1: (lv_func_13_0= ruleSpecialFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:954:1: (lv_func_13_0= ruleSpecialFunction )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:955:3: lv_func_13_0= ruleSpecialFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSpecialFunctionAccess().getFuncSpecialFunctionParserRuleCall_2_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleSpecialFunction1830);
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
            	    break loop16;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleSpecialFunction1842); 

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


    // $ANTLR start entryRuleBundlePromiseType
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:989:1: entryRuleBundlePromiseType returns [EObject current=null] : iv_ruleBundlePromiseType= ruleBundlePromiseType EOF ;
    public final EObject entryRuleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundlePromiseType = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:990:2: (iv_ruleBundlePromiseType= ruleBundlePromiseType EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:991:2: iv_ruleBundlePromiseType= ruleBundlePromiseType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundlePromiseTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType1878);
            iv_ruleBundlePromiseType=ruleBundlePromiseType();
            _fsp--;

             current =iv_ruleBundlePromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromiseType1888); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:998:1: ruleBundlePromiseType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1003:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1004:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1004:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1005:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1005:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1006:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundlePromiseType1929); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1036:1: entryRuleBodyPromiseType returns [EObject current=null] : iv_ruleBodyPromiseType= ruleBodyPromiseType EOF ;
    public final EObject entryRuleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyPromiseType = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1037:2: (iv_ruleBodyPromiseType= ruleBodyPromiseType EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1038:2: iv_ruleBodyPromiseType= ruleBodyPromiseType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyPromiseTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType1969);
            iv_ruleBodyPromiseType=ruleBodyPromiseType();
            _fsp--;

             current =iv_ruleBodyPromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyPromiseType1979); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1045:1: ruleBodyPromiseType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1050:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1051:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1051:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1052:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1052:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1053:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyPromiseType2020); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1083:1: entryRuleBundleComponent returns [EObject current=null] : iv_ruleBundleComponent= ruleBundleComponent EOF ;
    public final EObject entryRuleBundleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleComponent = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1084:2: (iv_ruleBundleComponent= ruleBundleComponent EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1085:2: iv_ruleBundleComponent= ruleBundleComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent2060);
            iv_ruleBundleComponent=ruleBundleComponent();
            _fsp--;

             current =iv_ruleBundleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleComponent2070); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1092:1: ruleBundleComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBundleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1097:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1098:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1098:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1099:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1099:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1100:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundleComponent2111); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1130:1: entryRuleBodyComponent returns [EObject current=null] : iv_ruleBodyComponent= ruleBodyComponent EOF ;
    public final EObject entryRuleBodyComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyComponent = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1131:2: (iv_ruleBodyComponent= ruleBodyComponent EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1132:2: iv_ruleBodyComponent= ruleBodyComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent2151);
            iv_ruleBodyComponent=ruleBodyComponent();
            _fsp--;

             current =iv_ruleBodyComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent2161); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1139:1: ruleBodyComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1144:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1145:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1145:1: ( (lv_name_0_0= RULE_ID ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1146:1: (lv_name_0_0= RULE_ID )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1146:1: (lv_name_0_0= RULE_ID )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1147:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyComponent2202); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1177:1: entryRuleBodyClass returns [EObject current=null] : iv_ruleBodyClass= ruleBodyClass EOF ;
    public final EObject entryRuleBodyClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyClass = null;


        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1178:2: (iv_ruleBodyClass= ruleBodyClass EOF )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1179:2: iv_ruleBodyClass= ruleBodyClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyClass_in_entryRuleBodyClass2242);
            iv_ruleBodyClass=ruleBodyClass();
            _fsp--;

             current =iv_ruleBodyClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyClass2252); 

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
    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1186:1: ruleBodyClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleID_EXCL ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* ) ;
    public final EObject ruleBodyClass() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_promiseType_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1191:6: ( ( ( (lv_name_0_0= ruleID_EXCL ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1192:1: ( ( (lv_name_0_0= ruleID_EXCL ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1192:1: ( ( (lv_name_0_0= ruleID_EXCL ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1192:2: ( (lv_name_0_0= ruleID_EXCL ) ) '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )*
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1192:2: ( (lv_name_0_0= ruleID_EXCL ) )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1193:1: (lv_name_0_0= ruleID_EXCL )
            {
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1193:1: (lv_name_0_0= ruleID_EXCL )
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1194:3: lv_name_0_0= ruleID_EXCL
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyClassAccess().getNameID_EXCLParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleID_EXCL_in_ruleBodyClass2298);
            lv_name_0_0=ruleID_EXCL();
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
            	        		"ID_EXCL", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,24,FOLLOW_24_in_ruleBodyClass2308); 

                    createLeafNode(grammarAccess.getBodyClassAccess().getColonColonKeyword_1(), null); 
                
            // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1220:1: ( (lv_promiseType_2_0= ruleBodyFunction ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==11) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1221:1: (lv_promiseType_2_0= ruleBodyFunction )
            	    {
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1221:1: (lv_promiseType_2_0= ruleBodyFunction )
            	    // ../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g:1222:3: lv_promiseType_2_0= ruleBodyFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyClassAccess().getPromiseTypeBodyFunctionParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBodyClass2329);
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
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleCfModel130 = new BitSet(new long[]{0x0000000000210002L});
    public static final BitSet FOLLOW_ruleID_EXCL_in_entryRuleID_EXCL167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleID_EXCL178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleID_EXCL217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleID_EXCL234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_entryRulePLACEHOLDERB282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePLACEHOLDERB293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rulePLACEHOLDERB333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePLACEHOLDERB359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePLACEHOLDERB385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePLACEHOLDERB409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePLACEHOLDERB428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePLACEHOLDERB447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePLACEHOLDERB466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePLACEHOLDERB485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_ruleAbstractElement581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_rulePart672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rulePart699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBundle779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_ruleBundle800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle817 = new BitSet(new long[]{0x000000000002F870L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_ruleBundle839 = new BitSet(new long[]{0x000000000002F870L});
    public static final BitSet FOLLOW_17_in_ruleBundle850 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_ruleBundle872 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBundle882 = new BitSet(new long[]{0x000000000012F870L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_ruleBundle899 = new BitSet(new long[]{0x000000000012F870L});
    public static final BitSet FOLLOW_17_in_ruleBundle915 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBundle925 = new BitSet(new long[]{0x000000000010F870L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_ruleBundle942 = new BitSet(new long[]{0x000000000010F870L});
    public static final BitSet FOLLOW_20_in_ruleBundle953 = new BitSet(new long[]{0x000000000012F870L});
    public static final BitSet FOLLOW_20_in_ruleBundle968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody1004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBody1049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_ruleBody1070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1087 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleBody1103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1120 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleBody1136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1153 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleBody1170 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBody1182 = new BitSet(new long[]{0x0000000000100410L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBody1203 = new BitSet(new long[]{0x0000000000100410L});
    public static final BitSet FOLLOW_ruleBodyClass_in_ruleBody1225 = new BitSet(new long[]{0x0000000000100410L});
    public static final BitSet FOLLOW_20_in_ruleBody1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction1272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyFunction1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction1328 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBodyFunction1338 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction1356 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_17_in_ruleBodyFunction1386 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction1416 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13_in_ruleBodyFunction1432 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction1449 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_20_in_ruleBodyFunction1466 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleBodyFunction1494 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_17_in_ruleBodyFunction1511 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBodyFunction1521 = new BitSet(new long[]{0x000000000010F870L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_ruleBodyFunction1538 = new BitSet(new long[]{0x000000000010F870L});
    public static final BitSet FOLLOW_20_in_ruleBodyFunction1549 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBodyFunction1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction1597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialFunction1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction1649 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSpecialFunction1664 = new BitSet(new long[]{0x0000000000C0A0F0L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSpecialFunction1674 = new BitSet(new long[]{0x0000000000C0A0F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction1688 = new BitSet(new long[]{0x0000000000C0A0F0L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpecialFunction1702 = new BitSet(new long[]{0x0000000000C0A0F0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSpecialFunction1716 = new BitSet(new long[]{0x0000000000C0A0F0L});
    public static final BitSet FOLLOW_13_in_ruleSpecialFunction1731 = new BitSet(new long[]{0x0000000000C0A0F0L});
    public static final BitSet FOLLOW_22_in_ruleSpecialFunction1748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction1757 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSpecialFunction1766 = new BitSet(new long[]{0x0000000000C0A0F0L});
    public static final BitSet FOLLOW_23_in_ruleSpecialFunction1784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction1793 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSpecialFunction1802 = new BitSet(new long[]{0x0000000000C0A0F0L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleSpecialFunction1830 = new BitSet(new long[]{0x0000000000C0A0F0L});
    public static final BitSet FOLLOW_15_in_ruleSpecialFunction1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType1878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromiseType1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundlePromiseType1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType1969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyPromiseType1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyPromiseType2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent2060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleComponent2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundleComponent2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent2151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyComponent2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_entryRuleBodyClass2242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyClass2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_EXCL_in_ruleBodyClass2298 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBodyClass2308 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBodyClass2329 = new BitSet(new long[]{0x0000000000000012L});

}