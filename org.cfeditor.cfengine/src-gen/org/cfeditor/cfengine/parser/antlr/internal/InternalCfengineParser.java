package org.cfeditor.cfengine.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.cfeditor.cfengine.services.CfengineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfengineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "RULE_WS", "RULE_INT", "RULE_ML_COMMENT", "'.'", "'|'", "'!'", "'('", "')'", "'!('", "'! ('", "'bundle'", "','", "'{'", "'}'", "':'", "'::'", "';'", "'=>'", "'@'", "'body'", "'$('", "'${'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=6;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=9;
    public static final int RULE_WS=8;

    // delegates
    // delegators


        public InternalCfengineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCfengineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCfengineParser.tokenNames; }
    public String getGrammarFileName() { return "../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g"; }



     	private CfengineGrammarAccess grammarAccess;
     	
        public InternalCfengineParser(TokenStream input, CfengineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CfModel";	
       	}
       	
       	@Override
       	protected CfengineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCfModel"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:67:1: entryRuleCfModel returns [EObject current=null] : iv_ruleCfModel= ruleCfModel EOF ;
    public final EObject entryRuleCfModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCfModel = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:68:2: (iv_ruleCfModel= ruleCfModel EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:69:2: iv_ruleCfModel= ruleCfModel EOF
            {
             newCompositeNode(grammarAccess.getCfModelRule()); 
            pushFollow(FOLLOW_ruleCfModel_in_entryRuleCfModel75);
            iv_ruleCfModel=ruleCfModel();

            state._fsp--;

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
    // $ANTLR end "entryRuleCfModel"


    // $ANTLR start "ruleCfModel"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:76:1: ruleCfModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleCfModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:79:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:82:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleCfModel130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCfModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCfModel"


    // $ANTLR start "entryRuleCLASS_ID"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:106:1: entryRuleCLASS_ID returns [String current=null] : iv_ruleCLASS_ID= ruleCLASS_ID EOF ;
    public final String entryRuleCLASS_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCLASS_ID = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:107:2: (iv_ruleCLASS_ID= ruleCLASS_ID EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:108:2: iv_ruleCLASS_ID= ruleCLASS_ID EOF
            {
             newCompositeNode(grammarAccess.getCLASS_IDRule()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_entryRuleCLASS_ID167);
            iv_ruleCLASS_ID=ruleCLASS_ID();

            state._fsp--;

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
    // $ANTLR end "entryRuleCLASS_ID"


    // $ANTLR start "ruleCLASS_ID"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:115:1: ruleCLASS_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '|' )? this_CLASS_ID_3= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_5= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')' ) | (kw= '!(' this_CLASS_ID_10= ruleCLASS_ID kw= ')' ) | (kw= '! (' this_CLASS_ID_13= ruleCLASS_ID kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleCLASS_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_CLASS_ID_3 = null;

        AntlrDatatypeRuleToken this_CLASS_ID_5 = null;

        AntlrDatatypeRuleToken this_CLASS_ID_7 = null;

        AntlrDatatypeRuleToken this_CLASS_ID_10 = null;

        AntlrDatatypeRuleToken this_CLASS_ID_13 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:118:28: ( ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '|' )? this_CLASS_ID_3= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_5= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')' ) | (kw= '!(' this_CLASS_ID_10= ruleCLASS_ID kw= ')' ) | (kw= '! (' this_CLASS_ID_13= ruleCLASS_ID kw= ')' ) ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:119:1: ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '|' )? this_CLASS_ID_3= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_5= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')' ) | (kw= '!(' this_CLASS_ID_10= ruleCLASS_ID kw= ')' ) | (kw= '! (' this_CLASS_ID_13= ruleCLASS_ID kw= ')' ) )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:119:1: ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '|' )? this_CLASS_ID_3= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_5= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')' ) | (kw= '!(' this_CLASS_ID_10= ruleCLASS_ID kw= ')' ) | (kw= '! (' this_CLASS_ID_13= ruleCLASS_ID kw= ')' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:119:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '|' )? this_CLASS_ID_3= ruleCLASS_ID )? )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:119:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '|' )? this_CLASS_ID_3= ruleCLASS_ID )? )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:119:7: this_ID_0= RULE_ID ( (kw= '.' | kw= '|' )? this_CLASS_ID_3= ruleCLASS_ID )?
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCLASS_ID219); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_0_0()); 
                        
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:126:1: ( (kw= '.' | kw= '|' )? this_CLASS_ID_3= ruleCLASS_ID )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_ID||(LA3_0>=11 && LA3_0<=14)||(LA3_0>=16 && LA3_0<=17)) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:126:2: (kw= '.' | kw= '|' )? this_CLASS_ID_3= ruleCLASS_ID
                            {
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:126:2: (kw= '.' | kw= '|' )?
                            int alt2=3;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0==11) ) {
                                alt2=1;
                            }
                            else if ( (LA2_0==12) ) {
                                alt2=2;
                            }
                            switch (alt2) {
                                case 1 :
                                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:127:2: kw= '.'
                                    {
                                    kw=(Token)match(input,11,FOLLOW_11_in_ruleCLASS_ID239); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getCLASS_IDAccess().getFullStopKeyword_0_1_0_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:134:2: kw= '|'
                                    {
                                    kw=(Token)match(input,12,FOLLOW_12_in_ruleCLASS_ID258); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getCLASS_IDAccess().getVerticalLineKeyword_0_1_0_1()); 
                                        

                                    }
                                    break;

                            }

                             
                                    newCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_0_1_1()); 
                                
                            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID282);
                            this_CLASS_ID_3=ruleCLASS_ID();

                            state._fsp--;


                            		current.merge(this_CLASS_ID_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:151:6: (kw= '!' this_CLASS_ID_5= ruleCLASS_ID )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:151:6: (kw= '!' this_CLASS_ID_5= ruleCLASS_ID )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:152:2: kw= '!' this_CLASS_ID_5= ruleCLASS_ID
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleCLASS_ID310); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCLASS_IDAccess().getExclamationMarkKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID332);
                    this_CLASS_ID_5=ruleCLASS_ID();

                    state._fsp--;


                    		current.merge(this_CLASS_ID_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:169:6: (kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')' )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:169:6: (kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')' )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:170:2: kw= '(' this_CLASS_ID_7= ruleCLASS_ID kw= ')'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleCLASS_ID358); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCLASS_IDAccess().getLeftParenthesisKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID380);
                    this_CLASS_ID_7=ruleCLASS_ID();

                    state._fsp--;


                    		current.merge(this_CLASS_ID_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleCLASS_ID398); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_2_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:193:6: (kw= '!(' this_CLASS_ID_10= ruleCLASS_ID kw= ')' )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:193:6: (kw= '!(' this_CLASS_ID_10= ruleCLASS_ID kw= ')' )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:194:2: kw= '!(' this_CLASS_ID_10= ruleCLASS_ID kw= ')'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleCLASS_ID419); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCLASS_IDAccess().getExclamationMarkLeftParenthesisKeyword_3_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID441);
                    this_CLASS_ID_10=ruleCLASS_ID();

                    state._fsp--;


                    		current.merge(this_CLASS_ID_10);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleCLASS_ID459); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_3_2()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:217:6: (kw= '! (' this_CLASS_ID_13= ruleCLASS_ID kw= ')' )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:217:6: (kw= '! (' this_CLASS_ID_13= ruleCLASS_ID kw= ')' )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:218:2: kw= '! (' this_CLASS_ID_13= ruleCLASS_ID kw= ')'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleCLASS_ID480); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCLASS_IDAccess().getExclamationMarkSpaceLeftParenthesisKeyword_4_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID502);
                    this_CLASS_ID_13=ruleCLASS_ID();

                    state._fsp--;


                    		current.merge(this_CLASS_ID_13);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleCLASS_ID520); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_4_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCLASS_ID"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:248:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:249:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:250:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement561);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement571); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:257:1: ruleAbstractElement returns [EObject current=null] : (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Bundle_0 = null;

        EObject this_Body_1 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:260:28: ( (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:261:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:261:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:262:5: this_Bundle_0= ruleBundle
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getBundleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBundle_in_ruleAbstractElement618);
                    this_Bundle_0=ruleBundle();

                    state._fsp--;

                     
                            current = this_Bundle_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:272:5: this_Body_1= ruleBody
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getBodyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBody_in_ruleAbstractElement645);
                    this_Body_1=ruleBody();

                    state._fsp--;

                     
                            current = this_Body_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleBundle"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:288:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:289:2: (iv_ruleBundle= ruleBundle EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:290:2: iv_ruleBundle= ruleBundle EOF
            {
             newCompositeNode(grammarAccess.getBundleRule()); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle680);
            iv_ruleBundle=ruleBundle();

            state._fsp--;

             current =iv_ruleBundle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle690); 

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
    // $ANTLR end "entryRuleBundle"


    // $ANTLR start "ruleBundle"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:297:1: ruleBundle returns [EObject current=null] : (otherlv_0= 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* otherlv_10= '}' ) ;
    public final EObject ruleBundle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_variables_4_0=null;
        Token otherlv_5=null;
        Token lv_variables_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_component_1_0 = null;

        EObject lv_promiseType_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:300:28: ( (otherlv_0= 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* otherlv_10= '}' ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:301:1: (otherlv_0= 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* otherlv_10= '}' )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:301:1: (otherlv_0= 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* otherlv_10= '}' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:301:3: otherlv_0= 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleBundle727); 

                	newLeafNode(otherlv_0, grammarAccess.getBundleAccess().getBundleKeyword_0());
                
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:305:1: ( (lv_component_1_0= ruleBundleComponent ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:306:1: (lv_component_1_0= ruleBundleComponent )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:306:1: (lv_component_1_0= ruleBundleComponent )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:307:3: lv_component_1_0= ruleBundleComponent
            {
             
            	        newCompositeNode(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBundleComponent_in_ruleBundle748);
            lv_component_1_0=ruleBundleComponent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBundleRule());
            	        }
                   		set(
                   			current, 
                   			"component",
                    		lv_component_1_0, 
                    		"BundleComponent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:323:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:324:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:324:1: (lv_name_2_0= RULE_ID )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:325:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle765); 

            			newLeafNode(lv_name_2_0, grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBundleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:341:2: (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:341:4: otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleBundle783); 

                        	newLeafNode(otherlv_3, grammarAccess.getBundleAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:345:1: ( (lv_variables_4_0= RULE_ID ) )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:346:1: (lv_variables_4_0= RULE_ID )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:346:1: (lv_variables_4_0= RULE_ID )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:347:3: lv_variables_4_0= RULE_ID
                    {
                    lv_variables_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle800); 

                    			newLeafNode(lv_variables_4_0, grammarAccess.getBundleAccess().getVariablesIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBundleRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"variables",
                            		lv_variables_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:363:2: (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:363:4: otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleBundle818); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getBundleAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:367:1: ( (lv_variables_6_0= RULE_ID ) )
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:368:1: (lv_variables_6_0= RULE_ID )
                    	    {
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:368:1: (lv_variables_6_0= RULE_ID )
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:369:3: lv_variables_6_0= RULE_ID
                    	    {
                    	    lv_variables_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle835); 

                    	    			newLeafNode(lv_variables_6_0, grammarAccess.getBundleAccess().getVariablesIDTerminalRuleCall_3_2_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getBundleRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"variables",
                    	            		lv_variables_6_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleBundle854); 

                        	newLeafNode(otherlv_7, grammarAccess.getBundleAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleBundle868); 

                	newLeafNode(otherlv_8, grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:393:1: ( (lv_promiseType_9_0= ruleBundlePromiseType ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:394:1: (lv_promiseType_9_0= ruleBundlePromiseType )
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:394:1: (lv_promiseType_9_0= ruleBundlePromiseType )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:395:3: lv_promiseType_9_0= ruleBundlePromiseType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromiseType_in_ruleBundle889);
            	    lv_promiseType_9_0=ruleBundlePromiseType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBundleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"promiseType",
            	            		lv_promiseType_9_0, 
            	            		"BundlePromiseType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleBundle902); 

                	newLeafNode(otherlv_10, grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBundle"


    // $ANTLR start "entryRuleBundlePromiseType"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:423:1: entryRuleBundlePromiseType returns [EObject current=null] : iv_ruleBundlePromiseType= ruleBundlePromiseType EOF ;
    public final EObject entryRuleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundlePromiseType = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:424:2: (iv_ruleBundlePromiseType= ruleBundlePromiseType EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:425:2: iv_ruleBundlePromiseType= ruleBundlePromiseType EOF
            {
             newCompositeNode(grammarAccess.getBundlePromiseTypeRule()); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType938);
            iv_ruleBundlePromiseType=ruleBundlePromiseType();

            state._fsp--;

             current =iv_ruleBundlePromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromiseType948); 

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
    // $ANTLR end "entryRuleBundlePromiseType"


    // $ANTLR start "ruleBundlePromiseType"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:432:1: ruleBundlePromiseType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* ) ;
    public final EObject ruleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_promises_2_0 = null;

        EObject lv_classes_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:435:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:436:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:436:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:436:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )*
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:436:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:437:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:437:1: (lv_name_0_0= RULE_ID )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:438:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundlePromiseType990); 

            			newLeafNode(lv_name_0_0, grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBundlePromiseTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleBundlePromiseType1007); 

                	newLeafNode(otherlv_1, grammarAccess.getBundlePromiseTypeAccess().getColonKeyword_1());
                
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:458:1: ( (lv_promises_2_0= ruleBundlePromise ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:459:1: (lv_promises_2_0= ruleBundlePromise )
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:459:1: (lv_promises_2_0= ruleBundlePromise )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:460:3: lv_promises_2_0= ruleBundlePromise
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundlePromiseTypeAccess().getPromisesBundlePromiseParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromise_in_ruleBundlePromiseType1028);
            	    lv_promises_2_0=ruleBundlePromise();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBundlePromiseTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"promises",
            	            		lv_promises_2_0, 
            	            		"BundlePromise");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:476:3: ( (lv_classes_3_0= ruleBundleClass ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==RULE_ID||(LA10_2>=11 && LA10_2<=14)||(LA10_2>=16 && LA10_2<=17)||LA10_2==23) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>=13 && LA10_0<=14)||(LA10_0>=16 && LA10_0<=17)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:477:1: (lv_classes_3_0= ruleBundleClass )
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:477:1: (lv_classes_3_0= ruleBundleClass )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:478:3: lv_classes_3_0= ruleBundleClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundlePromiseTypeAccess().getClassesBundleClassParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundleClass_in_ruleBundlePromiseType1050);
            	    lv_classes_3_0=ruleBundleClass();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBundlePromiseTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classes",
            	            		lv_classes_3_0, 
            	            		"BundleClass");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBundlePromiseType"


    // $ANTLR start "entryRuleBundleClass"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:502:1: entryRuleBundleClass returns [EObject current=null] : iv_ruleBundleClass= ruleBundleClass EOF ;
    public final EObject entryRuleBundleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleClass = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:503:2: (iv_ruleBundleClass= ruleBundleClass EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:504:2: iv_ruleBundleClass= ruleBundleClass EOF
            {
             newCompositeNode(grammarAccess.getBundleClassRule()); 
            pushFollow(FOLLOW_ruleBundleClass_in_entryRuleBundleClass1087);
            iv_ruleBundleClass=ruleBundleClass();

            state._fsp--;

             current =iv_ruleBundleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleClass1097); 

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
    // $ANTLR end "entryRuleBundleClass"


    // $ANTLR start "ruleBundleClass"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:511:1: ruleBundleClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promises_2_0= ruleBundlePromise ) )* ) ;
    public final EObject ruleBundleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_promises_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:514:28: ( ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promises_2_0= ruleBundlePromise ) )* ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:515:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promises_2_0= ruleBundlePromise ) )* )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:515:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promises_2_0= ruleBundlePromise ) )* )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:515:2: ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promises_2_0= ruleBundlePromise ) )*
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:515:2: ( (lv_name_0_0= ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:516:1: (lv_name_0_0= ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:516:1: (lv_name_0_0= ruleCLASS_ID )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:517:3: lv_name_0_0= ruleCLASS_ID
            {
             
            	        newCompositeNode(grammarAccess.getBundleClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleBundleClass1143);
            lv_name_0_0=ruleCLASS_ID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBundleClassRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"CLASS_ID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleBundleClass1155); 

                	newLeafNode(otherlv_1, grammarAccess.getBundleClassAccess().getColonColonKeyword_1());
                
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:537:1: ( (lv_promises_2_0= ruleBundlePromise ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:538:1: (lv_promises_2_0= ruleBundlePromise )
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:538:1: (lv_promises_2_0= ruleBundlePromise )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:539:3: lv_promises_2_0= ruleBundlePromise
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleClassAccess().getPromisesBundlePromiseParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromise_in_ruleBundleClass1176);
            	    lv_promises_2_0=ruleBundlePromise();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBundleClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"promises",
            	            		lv_promises_2_0, 
            	            		"BundlePromise");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBundleClass"


    // $ANTLR start "entryRuleBundlePromise"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:563:1: entryRuleBundlePromise returns [EObject current=null] : iv_ruleBundlePromise= ruleBundlePromise EOF ;
    public final EObject entryRuleBundlePromise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundlePromise = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:564:2: (iv_ruleBundlePromise= ruleBundlePromise EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:565:2: iv_ruleBundlePromise= ruleBundlePromise EOF
            {
             newCompositeNode(grammarAccess.getBundlePromiseRule()); 
            pushFollow(FOLLOW_ruleBundlePromise_in_entryRuleBundlePromise1213);
            iv_ruleBundlePromise=ruleBundlePromise();

            state._fsp--;

             current =iv_ruleBundlePromise; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromise1223); 

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
    // $ANTLR end "entryRuleBundlePromise"


    // $ANTLR start "ruleBundlePromise"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:572:1: ruleBundlePromise returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* otherlv_4= ';' ) ;
    public final EObject ruleBundlePromise() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:575:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* otherlv_4= ';' ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:576:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* otherlv_4= ';' )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:576:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* otherlv_4= ';' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:576:2: ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )* otherlv_4= ';'
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:576:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:577:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:577:1: (lv_name_0_0= RULE_STRING )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:578:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBundlePromise1265); 

            			newLeafNode(lv_name_0_0, grammarAccess.getBundlePromiseAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBundlePromiseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:594:2: ( ( (lv_values_1_0= rulePromiseValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:594:3: ( (lv_values_1_0= rulePromiseValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )*
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:594:3: ( (lv_values_1_0= rulePromiseValue ) )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:595:1: (lv_values_1_0= rulePromiseValue )
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:595:1: (lv_values_1_0= rulePromiseValue )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:596:3: lv_values_1_0= rulePromiseValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePromiseValue_in_ruleBundlePromise1292);
            	    lv_values_1_0=rulePromiseValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBundlePromiseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_1_0, 
            	            		"PromiseValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:612:2: (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==19) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:612:4: otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleBundlePromise1305); 

            	    	        	newLeafNode(otherlv_2, grammarAccess.getBundlePromiseAccess().getCommaKeyword_1_1_0());
            	    	        
            	    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:616:1: ( (lv_values_3_0= rulePromiseValue ) )
            	    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:617:1: (lv_values_3_0= rulePromiseValue )
            	    	    {
            	    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:617:1: (lv_values_3_0= rulePromiseValue )
            	    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:618:3: lv_values_3_0= rulePromiseValue
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_rulePromiseValue_in_ruleBundlePromise1326);
            	    	    lv_values_3_0=rulePromiseValue();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getBundlePromiseRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"values",
            	    	            		lv_values_3_0, 
            	    	            		"PromiseValue");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleBundlePromise1342); 

                	newLeafNode(otherlv_4, grammarAccess.getBundlePromiseAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBundlePromise"


    // $ANTLR start "entryRulePromiseValue"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:646:1: entryRulePromiseValue returns [EObject current=null] : iv_rulePromiseValue= rulePromiseValue EOF ;
    public final EObject entryRulePromiseValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePromiseValue = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:647:2: (iv_rulePromiseValue= rulePromiseValue EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:648:2: iv_rulePromiseValue= rulePromiseValue EOF
            {
             newCompositeNode(grammarAccess.getPromiseValueRule()); 
            pushFollow(FOLLOW_rulePromiseValue_in_entryRulePromiseValue1378);
            iv_rulePromiseValue=rulePromiseValue();

            state._fsp--;

             current =iv_rulePromiseValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePromiseValue1388); 

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
    // $ANTLR end "entryRulePromiseValue"


    // $ANTLR start "rulePromiseValue"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:655:1: rulePromiseValue returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' ) | (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' ) ) ) ;
    public final EObject rulePromiseValue() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token lv_values_4_0=null;
        Token otherlv_5=null;
        Token lv_values_6_0=null;
        Token otherlv_8=null;
        Token lv_values_9_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_ID_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_functions_3_0 = null;

        EObject lv_functions_7_0 = null;

        EObject lv_functions_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:658:28: ( ( ( (lv_keyword_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' ) | (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' ) ) ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:659:1: ( ( (lv_keyword_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' ) | (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' ) ) )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:659:1: ( ( (lv_keyword_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' ) | (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' ) ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:659:2: ( (lv_keyword_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' ) | (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' ) )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:659:2: ( (lv_keyword_0_0= RULE_ID ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:660:1: (lv_keyword_0_0= RULE_ID )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:660:1: (lv_keyword_0_0= RULE_ID )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:661:3: lv_keyword_0_0= RULE_ID
            {
            lv_keyword_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePromiseValue1430); 

            			newLeafNode(lv_keyword_0_0, grammarAccess.getPromiseValueAccess().getKeywordIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPromiseValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"keyword",
                    		lv_keyword_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_rulePromiseValue1447); 

                	newLeafNode(otherlv_1, grammarAccess.getPromiseValueAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:681:1: ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' ) | (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
                alt18=1;
            }
            else if ( (LA18_0==20) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==26) ) {
                    alt18=3;
                }
                else if ( ((LA18_2>=RULE_ID && LA18_2<=RULE_STRING)) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:681:2: ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:681:2: ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) )
                    int alt14=3;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_STRING) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==RULE_ID) ) {
                        int LA14_2 = input.LA(2);

                        if ( (LA14_2==14) ) {
                            alt14=2;
                        }
                        else if ( (LA14_2==EOF||LA14_2==RULE_ID||LA14_2==19||LA14_2==24) ) {
                            alt14=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:681:3: ( (lv_values_2_0= RULE_STRING ) )
                            {
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:681:3: ( (lv_values_2_0= RULE_STRING ) )
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:682:1: (lv_values_2_0= RULE_STRING )
                            {
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:682:1: (lv_values_2_0= RULE_STRING )
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:683:3: lv_values_2_0= RULE_STRING
                            {
                            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1466); 

                            			newLeafNode(lv_values_2_0, grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPromiseValueRule());
                            	        }
                                   		addWithLastConsumed(
                                   			current, 
                                   			"values",
                                    		lv_values_2_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:700:6: ( (lv_functions_3_0= ruleSimpleFunction ) )
                            {
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:700:6: ( (lv_functions_3_0= ruleSimpleFunction ) )
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:701:1: (lv_functions_3_0= ruleSimpleFunction )
                            {
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:701:1: (lv_functions_3_0= ruleSimpleFunction )
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:702:3: lv_functions_3_0= ruleSimpleFunction
                            {
                             
                            	        newCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1498);
                            lv_functions_3_0=ruleSimpleFunction();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPromiseValueRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"functions",
                                    		lv_functions_3_0, 
                                    		"SimpleFunction");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:719:6: ( (lv_values_4_0= RULE_ID ) )
                            {
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:719:6: ( (lv_values_4_0= RULE_ID ) )
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:720:1: (lv_values_4_0= RULE_ID )
                            {
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:720:1: (lv_values_4_0= RULE_ID )
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:721:3: lv_values_4_0= RULE_ID
                            {
                            lv_values_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePromiseValue1521); 

                            			newLeafNode(lv_values_4_0, grammarAccess.getPromiseValueAccess().getValuesIDTerminalRuleCall_2_0_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPromiseValueRule());
                            	        }
                                   		addWithLastConsumed(
                                   			current, 
                                   			"values",
                                    		lv_values_4_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:738:6: (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:738:6: (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:738:8: otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_rulePromiseValue1546); 

                        	newLeafNode(otherlv_5, grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:742:1: ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) )
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
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:742:2: ( (lv_values_6_0= RULE_STRING ) )
                            {
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:742:2: ( (lv_values_6_0= RULE_STRING ) )
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:743:1: (lv_values_6_0= RULE_STRING )
                            {
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:743:1: (lv_values_6_0= RULE_STRING )
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:744:3: lv_values_6_0= RULE_STRING
                            {
                            lv_values_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1564); 

                            			newLeafNode(lv_values_6_0, grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPromiseValueRule());
                            	        }
                                   		addWithLastConsumed(
                                   			current, 
                                   			"values",
                                    		lv_values_6_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:761:6: ( (lv_functions_7_0= ruleSimpleFunction ) )
                            {
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:761:6: ( (lv_functions_7_0= ruleSimpleFunction ) )
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:762:1: (lv_functions_7_0= ruleSimpleFunction )
                            {
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:762:1: (lv_functions_7_0= ruleSimpleFunction )
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:763:3: lv_functions_7_0= ruleSimpleFunction
                            {
                             
                            	        newCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1596);
                            lv_functions_7_0=ruleSimpleFunction();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPromiseValueRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"functions",
                                    		lv_functions_7_0, 
                                    		"SimpleFunction");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:779:3: (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==19) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:779:5: otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) )
                    	    {
                    	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_rulePromiseValue1610); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getPromiseValueAccess().getCommaKeyword_2_1_2_0());
                    	        
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:783:1: ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) )
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
                    	            new NoViableAltException("", 16, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:783:2: ( (lv_values_9_0= RULE_STRING ) )
                    	            {
                    	            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:783:2: ( (lv_values_9_0= RULE_STRING ) )
                    	            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:784:1: (lv_values_9_0= RULE_STRING )
                    	            {
                    	            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:784:1: (lv_values_9_0= RULE_STRING )
                    	            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:785:3: lv_values_9_0= RULE_STRING
                    	            {
                    	            lv_values_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1628); 

                    	            			newLeafNode(lv_values_9_0, grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getPromiseValueRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"values",
                    	                    		lv_values_9_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:802:6: ( (lv_functions_10_0= ruleSimpleFunction ) )
                    	            {
                    	            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:802:6: ( (lv_functions_10_0= ruleSimpleFunction ) )
                    	            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:803:1: (lv_functions_10_0= ruleSimpleFunction )
                    	            {
                    	            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:803:1: (lv_functions_10_0= ruleSimpleFunction )
                    	            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:804:3: lv_functions_10_0= ruleSimpleFunction
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_2_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1660);
                    	            lv_functions_10_0=ruleSimpleFunction();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getPromiseValueRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"functions",
                    	                    		lv_functions_10_0, 
                    	                    		"SimpleFunction");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

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

                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_rulePromiseValue1675); 

                        	newLeafNode(otherlv_11, grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:825:6: (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:825:6: (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:825:8: otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_rulePromiseValue1695); 

                        	newLeafNode(otherlv_12, grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_2_0());
                        
                    otherlv_13=(Token)match(input,26,FOLLOW_26_in_rulePromiseValue1707); 

                        	newLeafNode(otherlv_13, grammarAccess.getPromiseValueAccess().getCommercialAtKeyword_2_2_1());
                        
                    otherlv_14=(Token)match(input,14,FOLLOW_14_in_rulePromiseValue1719); 

                        	newLeafNode(otherlv_14, grammarAccess.getPromiseValueAccess().getLeftParenthesisKeyword_2_2_2());
                        
                    this_ID_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePromiseValue1730); 
                     
                        newLeafNode(this_ID_15, grammarAccess.getPromiseValueAccess().getIDTerminalRuleCall_2_2_3()); 
                        
                    otherlv_16=(Token)match(input,15,FOLLOW_15_in_rulePromiseValue1741); 

                        	newLeafNode(otherlv_16, grammarAccess.getPromiseValueAccess().getRightParenthesisKeyword_2_2_4());
                        
                    otherlv_17=(Token)match(input,21,FOLLOW_21_in_rulePromiseValue1753); 

                        	newLeafNode(otherlv_17, grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_2_5());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePromiseValue"


    // $ANTLR start "entryRuleBody"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:857:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:858:2: (iv_ruleBody= ruleBody EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:859:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody1791);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody1801); 

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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:866:1: ruleBody returns [EObject current=null] : (otherlv_0= 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* otherlv_11= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_variables_4_0=null;
        Token otherlv_5=null;
        Token lv_variables_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_component_1_0 = null;

        EObject lv_promiseType_9_0 = null;

        EObject lv_classes_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:869:28: ( (otherlv_0= 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* otherlv_11= '}' ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:870:1: (otherlv_0= 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* otherlv_11= '}' )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:870:1: (otherlv_0= 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* otherlv_11= '}' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:870:3: otherlv_0= 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleBody1838); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getBodyKeyword_0());
                
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:874:1: ( (lv_component_1_0= ruleBodyComponent ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:875:1: (lv_component_1_0= ruleBodyComponent )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:875:1: (lv_component_1_0= ruleBodyComponent )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:876:3: lv_component_1_0= ruleBodyComponent
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyComponent_in_ruleBody1859);
            lv_component_1_0=ruleBodyComponent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		set(
                   			current, 
                   			"component",
                    		lv_component_1_0, 
                    		"BodyComponent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:892:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:893:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:893:1: (lv_name_2_0= RULE_ID )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:894:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1876); 

            			newLeafNode(lv_name_2_0, grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBodyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:910:2: (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==14) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:910:4: otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleBody1894); 

                        	newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:914:1: ( (lv_variables_4_0= RULE_ID ) )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:915:1: (lv_variables_4_0= RULE_ID )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:915:1: (lv_variables_4_0= RULE_ID )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:916:3: lv_variables_4_0= RULE_ID
                    {
                    lv_variables_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1911); 

                    			newLeafNode(lv_variables_4_0, grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBodyRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"variables",
                            		lv_variables_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:932:2: (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==19) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:932:4: otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleBody1929); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getBodyAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:936:1: ( (lv_variables_6_0= RULE_ID ) )
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:937:1: (lv_variables_6_0= RULE_ID )
                    	    {
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:937:1: (lv_variables_6_0= RULE_ID )
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:938:3: lv_variables_6_0= RULE_ID
                    	    {
                    	    lv_variables_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1946); 

                    	    			newLeafNode(lv_variables_6_0, grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_2_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getBodyRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"variables",
                    	            		lv_variables_6_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleBody1965); 

                        	newLeafNode(otherlv_7, grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleBody1979); 

                	newLeafNode(otherlv_8, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:962:1: ( (lv_promiseType_9_0= ruleBodyFunction ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==25) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:963:1: (lv_promiseType_9_0= ruleBodyFunction )
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:963:1: (lv_promiseType_9_0= ruleBodyFunction )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:964:3: lv_promiseType_9_0= ruleBodyFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBody2000);
            	    lv_promiseType_9_0=ruleBodyFunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"promiseType",
            	            		lv_promiseType_9_0, 
            	            		"BodyFunction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:980:3: ( (lv_classes_10_0= ruleBodyClass ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=13 && LA22_0<=14)||(LA22_0>=16 && LA22_0<=17)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:981:1: (lv_classes_10_0= ruleBodyClass )
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:981:1: (lv_classes_10_0= ruleBodyClass )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:982:3: lv_classes_10_0= ruleBodyClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBodyAccess().getClassesBodyClassParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyClass_in_ruleBody2022);
            	    lv_classes_10_0=ruleBodyClass();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classes",
            	            		lv_classes_10_0, 
            	            		"BodyClass");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleBody2035); 

                	newLeafNode(otherlv_11, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleBodyClass"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1010:1: entryRuleBodyClass returns [EObject current=null] : iv_ruleBodyClass= ruleBodyClass EOF ;
    public final EObject entryRuleBodyClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyClass = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1011:2: (iv_ruleBodyClass= ruleBodyClass EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1012:2: iv_ruleBodyClass= ruleBodyClass EOF
            {
             newCompositeNode(grammarAccess.getBodyClassRule()); 
            pushFollow(FOLLOW_ruleBodyClass_in_entryRuleBodyClass2071);
            iv_ruleBodyClass=ruleBodyClass();

            state._fsp--;

             current =iv_ruleBodyClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyClass2081); 

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
    // $ANTLR end "entryRuleBodyClass"


    // $ANTLR start "ruleBodyClass"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1019:1: ruleBodyClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* ) ;
    public final EObject ruleBodyClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_promiseType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1022:28: ( ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1023:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1023:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1023:2: ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )*
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1023:2: ( (lv_name_0_0= ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1024:1: (lv_name_0_0= ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1024:1: (lv_name_0_0= ruleCLASS_ID )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1025:3: lv_name_0_0= ruleCLASS_ID
            {
             
            	        newCompositeNode(grammarAccess.getBodyClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleBodyClass2127);
            lv_name_0_0=ruleCLASS_ID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyClassRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"CLASS_ID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleBodyClass2139); 

                	newLeafNode(otherlv_1, grammarAccess.getBodyClassAccess().getColonColonKeyword_1());
                
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1045:1: ( (lv_promiseType_2_0= ruleBodyFunction ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==25) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1046:1: (lv_promiseType_2_0= ruleBodyFunction )
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1046:1: (lv_promiseType_2_0= ruleBodyFunction )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1047:3: lv_promiseType_2_0= ruleBodyFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBodyClassAccess().getPromiseTypeBodyFunctionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBodyClass2160);
            	    lv_promiseType_2_0=ruleBodyFunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBodyClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"promiseType",
            	            		lv_promiseType_2_0, 
            	            		"BodyFunction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyClass"


    // $ANTLR start "entryRuleBodyFunction"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1071:1: entryRuleBodyFunction returns [EObject current=null] : iv_ruleBodyFunction= ruleBodyFunction EOF ;
    public final EObject entryRuleBodyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyFunction = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1072:2: (iv_ruleBodyFunction= ruleBodyFunction EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1073:2: iv_ruleBodyFunction= ruleBodyFunction EOF
            {
             newCompositeNode(grammarAccess.getBodyFunctionRule()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction2197);
            iv_ruleBodyFunction=ruleBodyFunction();

            state._fsp--;

             current =iv_ruleBodyFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyFunction2207); 

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
    // $ANTLR end "entryRuleBodyFunction"


    // $ANTLR start "ruleBodyFunction"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1080:1: ruleBodyFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleBodyPromiseType ) ) otherlv_1= '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' ) ) otherlv_15= ';' ) ;
    public final EObject ruleBodyFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token lv_List_3_0=null;
        Token lv_values_4_0=null;
        Token otherlv_5=null;
        Token lv_values_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_ID_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_name_0_0 = null;

        EObject lv_function_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1083:28: ( ( ( (lv_name_0_0= ruleBodyPromiseType ) ) otherlv_1= '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' ) ) otherlv_15= ';' ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1084:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) otherlv_1= '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' ) ) otherlv_15= ';' )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1084:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) otherlv_1= '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' ) ) otherlv_15= ';' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1084:2: ( (lv_name_0_0= ruleBodyPromiseType ) ) otherlv_1= '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' ) ) otherlv_15= ';'
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1084:2: ( (lv_name_0_0= ruleBodyPromiseType ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1085:1: (lv_name_0_0= ruleBodyPromiseType )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1085:1: (lv_name_0_0= ruleBodyPromiseType )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1086:3: lv_name_0_0= ruleBodyPromiseType
            {
             
            	        newCompositeNode(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction2253);
            lv_name_0_0=ruleBodyPromiseType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyFunctionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"BodyPromiseType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleBodyFunction2265); 

                	newLeafNode(otherlv_1, grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1106:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt25=1;
                }
                break;
            case 20:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==26) ) {
                    alt25=4;
                }
                else if ( (LA25_2==RULE_STRING) ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

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
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1106:2: ( (lv_values_2_0= RULE_STRING ) )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1106:2: ( (lv_values_2_0= RULE_STRING ) )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1107:1: (lv_values_2_0= RULE_STRING )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1107:1: (lv_values_2_0= RULE_STRING )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1108:3: lv_values_2_0= RULE_STRING
                    {
                    lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2283); 

                    			newLeafNode(lv_values_2_0, grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBodyFunctionRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"values",
                            		lv_values_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1125:6: ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1125:6: ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1125:7: ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}'
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1125:7: ( (lv_List_3_0= '{' ) )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1126:1: (lv_List_3_0= '{' )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1126:1: (lv_List_3_0= '{' )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1127:3: lv_List_3_0= '{'
                    {
                    lv_List_3_0=(Token)match(input,20,FOLLOW_20_in_ruleBodyFunction2313); 

                            newLeafNode(lv_List_3_0, grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBodyFunctionRule());
                    	        }
                           		setWithLastConsumed(current, "List", true, "{");
                    	    

                    }


                    }

                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1140:2: ( (lv_values_4_0= RULE_STRING ) )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1141:1: (lv_values_4_0= RULE_STRING )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1141:1: (lv_values_4_0= RULE_STRING )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1142:3: lv_values_4_0= RULE_STRING
                    {
                    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2343); 

                    			newLeafNode(lv_values_4_0, grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBodyFunctionRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"values",
                            		lv_values_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1158:2: (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==19) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1158:4: otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleBodyFunction2361); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0());
                    	        
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1162:1: ( (lv_values_6_0= RULE_STRING ) )
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1163:1: (lv_values_6_0= RULE_STRING )
                    	    {
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1163:1: (lv_values_6_0= RULE_STRING )
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1164:3: lv_values_6_0= RULE_STRING
                    	    {
                    	    lv_values_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2378); 

                    	    			newLeafNode(lv_values_6_0, grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getBodyFunctionRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"values",
                    	            		lv_values_6_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleBodyFunction2397); 

                        	newLeafNode(otherlv_7, grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1185:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1185:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1186:1: (lv_function_8_0= ruleSpecialFunction )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1186:1: (lv_function_8_0= ruleSpecialFunction )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1187:3: lv_function_8_0= ruleSpecialFunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleBodyFunction2425);
                    lv_function_8_0=ruleSpecialFunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBodyFunctionRule());
                    	        }
                           		add(
                           			current, 
                           			"function",
                            		lv_function_8_0, 
                            		"SpecialFunction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1204:6: (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' )
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1204:6: (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' )
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1204:8: otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleBodyFunction2444); 

                        	newLeafNode(otherlv_9, grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_3_0());
                        
                    otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleBodyFunction2456); 

                        	newLeafNode(otherlv_10, grammarAccess.getBodyFunctionAccess().getCommercialAtKeyword_2_3_1());
                        
                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleBodyFunction2468); 

                        	newLeafNode(otherlv_11, grammarAccess.getBodyFunctionAccess().getLeftParenthesisKeyword_2_3_2());
                        
                    this_ID_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyFunction2479); 
                     
                        newLeafNode(this_ID_12, grammarAccess.getBodyFunctionAccess().getIDTerminalRuleCall_2_3_3()); 
                        
                    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleBodyFunction2490); 

                        	newLeafNode(otherlv_13, grammarAccess.getBodyFunctionAccess().getRightParenthesisKeyword_2_3_4());
                        
                    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleBodyFunction2502); 

                        	newLeafNode(otherlv_14, grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_3_5());
                        

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,24,FOLLOW_24_in_ruleBodyFunction2516); 

                	newLeafNode(otherlv_15, grammarAccess.getBodyFunctionAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyFunction"


    // $ANTLR start "entryRuleSimpleFunction"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1240:1: entryRuleSimpleFunction returns [EObject current=null] : iv_ruleSimpleFunction= ruleSimpleFunction EOF ;
    public final EObject entryRuleSimpleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFunction = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1241:2: (iv_ruleSimpleFunction= ruleSimpleFunction EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1242:2: iv_ruleSimpleFunction= ruleSimpleFunction EOF
            {
             newCompositeNode(grammarAccess.getSimpleFunctionRule()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_entryRuleSimpleFunction2552);
            iv_ruleSimpleFunction=ruleSimpleFunction();

            state._fsp--;

             current =iv_ruleSimpleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFunction2562); 

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
    // $ANTLR end "entryRuleSimpleFunction"


    // $ANTLR start "ruleSimpleFunction"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1249:1: ruleSimpleFunction returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleSimpleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1252:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ')' ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1253:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ')' )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1253:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ')' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1253:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ')'
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1253:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1254:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1254:1: (lv_id_0_0= RULE_ID )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1255:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleFunction2604); 

            			newLeafNode(lv_id_0_0, grammarAccess.getSimpleFunctionAccess().getIdIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSimpleFunction2621); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleFunctionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1275:1: ( (lv_values_2_0= RULE_STRING ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1276:1: (lv_values_2_0= RULE_STRING )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1276:1: (lv_values_2_0= RULE_STRING )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1277:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleFunction2638); 

            			newLeafNode(lv_values_2_0, grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleFunctionRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1293:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==19) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1293:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSimpleFunction2656); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSimpleFunctionAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1297:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1298:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1298:1: (lv_values_4_0= RULE_STRING )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1299:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleFunction2673); 

            	    			newLeafNode(lv_values_4_0, grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSimpleFunctionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_4_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleSimpleFunction2692); 

                	newLeafNode(otherlv_5, grammarAccess.getSimpleFunctionAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleFunction"


    // $ANTLR start "entryRuleSpecialFunction"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1327:1: entryRuleSpecialFunction returns [EObject current=null] : iv_ruleSpecialFunction= ruleSpecialFunction EOF ;
    public final EObject entryRuleSpecialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialFunction = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1328:2: (iv_ruleSpecialFunction= ruleSpecialFunction EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1329:2: iv_ruleSpecialFunction= ruleSpecialFunction EOF
            {
             newCompositeNode(grammarAccess.getSpecialFunctionRule()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction2728);
            iv_ruleSpecialFunction=ruleSpecialFunction();

            state._fsp--;

             current =iv_ruleSpecialFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialFunction2738); 

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
    // $ANTLR end "entryRuleSpecialFunction"


    // $ANTLR start "ruleSpecialFunction"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1336:1: ruleSpecialFunction returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' (this_ANY_OTHER_2= RULE_ANY_OTHER | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | otherlv_5= ',' | (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' ) | (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* otherlv_13= ')' ) ;
    public final EObject ruleSpecialFunction() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token this_ANY_OTHER_2=null;
        Token this_ID_3=null;
        Token this_STRING_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_ID_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token this_ID_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_func_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1339:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' (this_ANY_OTHER_2= RULE_ANY_OTHER | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | otherlv_5= ',' | (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' ) | (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* otherlv_13= ')' ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1340:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' (this_ANY_OTHER_2= RULE_ANY_OTHER | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | otherlv_5= ',' | (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' ) | (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* otherlv_13= ')' )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1340:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' (this_ANY_OTHER_2= RULE_ANY_OTHER | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | otherlv_5= ',' | (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' ) | (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* otherlv_13= ')' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1340:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' (this_ANY_OTHER_2= RULE_ANY_OTHER | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | otherlv_5= ',' | (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' ) | (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* otherlv_13= ')'
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1340:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1341:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1341:1: (lv_id_0_0= RULE_ID )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1342:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2780); 

            			newLeafNode(lv_id_0_0, grammarAccess.getSpecialFunctionAccess().getIdIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpecialFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSpecialFunction2797); 

                	newLeafNode(otherlv_1, grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1362:1: (this_ANY_OTHER_2= RULE_ANY_OTHER | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | otherlv_5= ',' | (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' ) | (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )*
            loop27:
            do {
                int alt27=8;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1362:2: this_ANY_OTHER_2= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSpecialFunction2809); 
            	     
            	        newLeafNode(this_ANY_OTHER_2, grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1367:6: this_ID_3= RULE_ID
            	    {
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2825); 
            	     
            	        newLeafNode(this_ID_3, grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1372:6: this_STRING_4= RULE_STRING
            	    {
            	    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpecialFunction2841); 
            	     
            	        newLeafNode(this_STRING_4, grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1377:7: otherlv_5= ','
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleSpecialFunction2858); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_3());
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1382:6: (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' )
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1382:6: (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1382:8: otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')'
            	    {
            	    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleSpecialFunction2877); 

            	        	newLeafNode(otherlv_6, grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_2_4_0());
            	        
            	    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2888); 
            	     
            	        newLeafNode(this_ID_7, grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_4_1()); 
            	        
            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleSpecialFunction2899); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_2_4_2());
            	        

            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1395:6: (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' )
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1395:6: (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1395:8: otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}'
            	    {
            	    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleSpecialFunction2919); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_2_5_0());
            	        
            	    this_ID_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2930); 
            	     
            	        newLeafNode(this_ID_10, grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_5_1()); 
            	        
            	    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleSpecialFunction2941); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_2_5_2());
            	        

            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1408:6: ( (lv_func_12_0= ruleSpecialFunction ) )
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1408:6: ( (lv_func_12_0= ruleSpecialFunction ) )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1409:1: (lv_func_12_0= ruleSpecialFunction )
            	    {
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1409:1: (lv_func_12_0= ruleSpecialFunction )
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1410:3: lv_func_12_0= ruleSpecialFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSpecialFunctionAccess().getFuncSpecialFunctionParserRuleCall_2_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleSpecialFunction2969);
            	    lv_func_12_0=ruleSpecialFunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSpecialFunctionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"func",
            	            		lv_func_12_0, 
            	            		"SpecialFunction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleSpecialFunction2983); 

                	newLeafNode(otherlv_13, grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecialFunction"


    // $ANTLR start "entryRuleBodyPromiseType"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1438:1: entryRuleBodyPromiseType returns [EObject current=null] : iv_ruleBodyPromiseType= ruleBodyPromiseType EOF ;
    public final EObject entryRuleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyPromiseType = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1439:2: (iv_ruleBodyPromiseType= ruleBodyPromiseType EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1440:2: iv_ruleBodyPromiseType= ruleBodyPromiseType EOF
            {
             newCompositeNode(grammarAccess.getBodyPromiseTypeRule()); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType3019);
            iv_ruleBodyPromiseType=ruleBodyPromiseType();

            state._fsp--;

             current =iv_ruleBodyPromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyPromiseType3029); 

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
    // $ANTLR end "entryRuleBodyPromiseType"


    // $ANTLR start "ruleBodyPromiseType"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1447:1: ruleBodyPromiseType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1450:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1451:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1451:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1452:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1452:1: (lv_name_0_0= RULE_ID )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1453:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyPromiseType3070); 

            			newLeafNode(lv_name_0_0, grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBodyPromiseTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyPromiseType"


    // $ANTLR start "entryRuleBundleComponent"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1477:1: entryRuleBundleComponent returns [EObject current=null] : iv_ruleBundleComponent= ruleBundleComponent EOF ;
    public final EObject entryRuleBundleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleComponent = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1478:2: (iv_ruleBundleComponent= ruleBundleComponent EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1479:2: iv_ruleBundleComponent= ruleBundleComponent EOF
            {
             newCompositeNode(grammarAccess.getBundleComponentRule()); 
            pushFollow(FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent3110);
            iv_ruleBundleComponent=ruleBundleComponent();

            state._fsp--;

             current =iv_ruleBundleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleComponent3120); 

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
    // $ANTLR end "entryRuleBundleComponent"


    // $ANTLR start "ruleBundleComponent"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1486:1: ruleBundleComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBundleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1489:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1490:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1490:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1491:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1491:1: (lv_name_0_0= RULE_ID )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1492:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundleComponent3161); 

            			newLeafNode(lv_name_0_0, grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBundleComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBundleComponent"


    // $ANTLR start "entryRuleBodyComponent"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1516:1: entryRuleBodyComponent returns [EObject current=null] : iv_ruleBodyComponent= ruleBodyComponent EOF ;
    public final EObject entryRuleBodyComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyComponent = null;


        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1517:2: (iv_ruleBodyComponent= ruleBodyComponent EOF )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1518:2: iv_ruleBodyComponent= ruleBodyComponent EOF
            {
             newCompositeNode(grammarAccess.getBodyComponentRule()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent3201);
            iv_ruleBodyComponent=ruleBodyComponent();

            state._fsp--;

             current =iv_ruleBodyComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent3211); 

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
    // $ANTLR end "entryRuleBodyComponent"


    // $ANTLR start "ruleBodyComponent"
    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1525:1: ruleBodyComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1528:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1529:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1529:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1530:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1530:1: (lv_name_0_0= RULE_ID )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1531:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyComponent3252); 

            			newLeafNode(lv_name_0_0, grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBodyComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyComponent"

    // Delegated rules


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\12\uffff";
    static final String DFA27_eofS =
        "\12\uffff";
    static final String DFA27_minS =
        "\1\4\2\uffff\1\4\6\uffff";
    static final String DFA27_maxS =
        "\1\35\2\uffff\1\35\6\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\10\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\2";
    static final String DFA27_specialS =
        "\12\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\3\1\4\1\2\10\uffff\1\1\3\uffff\1\5\10\uffff\1\6\1\7",
            "",
            "",
            "\3\11\7\uffff\1\10\1\11\3\uffff\1\11\10\uffff\2\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 1362:1: (this_ANY_OTHER_2= RULE_ANY_OTHER | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | otherlv_5= ',' | (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' ) | (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleCfModel_in_entryRuleCfModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCfModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleCfModel130 = new BitSet(new long[]{0x0000000008040002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_entryRuleCLASS_ID167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLASS_ID178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCLASS_ID219 = new BitSet(new long[]{0x0000000000037812L});
    public static final BitSet FOLLOW_11_in_ruleCLASS_ID239 = new BitSet(new long[]{0x0000000000037810L});
    public static final BitSet FOLLOW_12_in_ruleCLASS_ID258 = new BitSet(new long[]{0x0000000000037810L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleCLASS_ID310 = new BitSet(new long[]{0x0000000000037810L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCLASS_ID358 = new BitSet(new long[]{0x0000000000037810L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID380 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCLASS_ID398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCLASS_ID419 = new BitSet(new long[]{0x0000000000037810L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID441 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCLASS_ID459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleCLASS_ID480 = new BitSet(new long[]{0x0000000000037810L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID502 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCLASS_ID520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_ruleAbstractElement618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_ruleAbstractElement645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBundle727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_ruleBundle748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle765 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14_in_ruleBundle783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle800 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleBundle818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle835 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleBundle854 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBundle868 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_ruleBundle889 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleBundle902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromiseType948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundlePromiseType990 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBundlePromiseType1007 = new BitSet(new long[]{0x0000000000037832L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_ruleBundlePromiseType1028 = new BitSet(new long[]{0x0000000000037832L});
    public static final BitSet FOLLOW_ruleBundleClass_in_ruleBundlePromiseType1050 = new BitSet(new long[]{0x0000000000037812L});
    public static final BitSet FOLLOW_ruleBundleClass_in_entryRuleBundleClass1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleClass1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleBundleClass1143 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBundleClass1155 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_ruleBundleClass1176 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_entryRuleBundlePromise1213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromise1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBundlePromise1265 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rulePromiseValue_in_ruleBundlePromise1292 = new BitSet(new long[]{0x0000000001080010L});
    public static final BitSet FOLLOW_19_in_ruleBundlePromise1305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePromiseValue_in_ruleBundlePromise1326 = new BitSet(new long[]{0x0000000001080010L});
    public static final BitSet FOLLOW_24_in_ruleBundlePromise1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_entryRulePromiseValue1378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePromiseValue1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePromiseValue1430 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePromiseValue1447 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePromiseValue1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePromiseValue1546 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1564 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1596 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19_in_rulePromiseValue1610 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1628 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1660 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_21_in_rulePromiseValue1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePromiseValue1695 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePromiseValue1707 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePromiseValue1719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePromiseValue1730 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePromiseValue1741 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePromiseValue1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody1791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBody1838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_ruleBody1859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1876 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14_in_ruleBody1894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1911 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleBody1929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1946 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleBody1965 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBody1979 = new BitSet(new long[]{0x0000000000237810L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBody2000 = new BitSet(new long[]{0x0000000000237810L});
    public static final BitSet FOLLOW_ruleBodyClass_in_ruleBody2022 = new BitSet(new long[]{0x0000000000237810L});
    public static final BitSet FOLLOW_21_in_ruleBody2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_entryRuleBodyClass2071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyClass2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleBodyClass2127 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBodyClass2139 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBodyClass2160 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction2197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyFunction2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction2253 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleBodyFunction2265 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2283 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20_in_ruleBodyFunction2313 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2343 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19_in_ruleBodyFunction2361 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2378 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_21_in_ruleBodyFunction2397 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleBodyFunction2425 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20_in_ruleBodyFunction2444 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBodyFunction2456 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBodyFunction2468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyFunction2479 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBodyFunction2490 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBodyFunction2502 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBodyFunction2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_entryRuleSimpleFunction2552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFunction2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleFunction2604 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSimpleFunction2621 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleFunction2638 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleSimpleFunction2656 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleFunction2673 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleSimpleFunction2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction2728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialFunction2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2780 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSpecialFunction2797 = new BitSet(new long[]{0x0000000030088070L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSpecialFunction2809 = new BitSet(new long[]{0x0000000030088070L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2825 = new BitSet(new long[]{0x0000000030088070L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpecialFunction2841 = new BitSet(new long[]{0x0000000030088070L});
    public static final BitSet FOLLOW_19_in_ruleSpecialFunction2858 = new BitSet(new long[]{0x0000000030088070L});
    public static final BitSet FOLLOW_28_in_ruleSpecialFunction2877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2888 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSpecialFunction2899 = new BitSet(new long[]{0x0000000030088070L});
    public static final BitSet FOLLOW_29_in_ruleSpecialFunction2919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2930 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSpecialFunction2941 = new BitSet(new long[]{0x0000000030088070L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleSpecialFunction2969 = new BitSet(new long[]{0x0000000030088070L});
    public static final BitSet FOLLOW_15_in_ruleSpecialFunction2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType3019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyPromiseType3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyPromiseType3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent3110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleComponent3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundleComponent3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent3201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyComponent3252 = new BitSet(new long[]{0x0000000000000002L});

}