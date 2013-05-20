package org.cfeditor.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.cfeditor.services.CfengineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfengineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "RULE_WS", "'.'", "'!'", "'('", "')'", "'bundle'", "','", "'{'", "'}'", "':'", "'::'", "';'", "'=>'", "'@'", "'body'", "'$('", "'${'"
    };
    public static final int RULE_ID=4;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=6;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;
    public static final int T__9=9;
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
    public static final int T__10=10;
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
    public String getGrammarFileName() { return "../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g"; }



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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:67:1: entryRuleCfModel returns [EObject current=null] : iv_ruleCfModel= ruleCfModel EOF ;
    public final EObject entryRuleCfModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCfModel = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:68:2: (iv_ruleCfModel= ruleCfModel EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:69:2: iv_ruleCfModel= ruleCfModel EOF
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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:76:1: ruleCfModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleCfModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:79:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:82:3: lv_elements_0_0= ruleAbstractElement
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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:106:1: entryRuleCLASS_ID returns [String current=null] : iv_ruleCLASS_ID= ruleCLASS_ID EOF ;
    public final String entryRuleCLASS_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCLASS_ID = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:107:2: (iv_ruleCLASS_ID= ruleCLASS_ID EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:108:2: iv_ruleCLASS_ID= ruleCLASS_ID EOF
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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:115:1: ruleCLASS_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_4= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? ) ) ;
    public final AntlrDatatypeRuleToken ruleCLASS_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_CLASS_ID_2 = null;

        AntlrDatatypeRuleToken this_CLASS_ID_4 = null;

        AntlrDatatypeRuleToken this_CLASS_ID_6 = null;

        AntlrDatatypeRuleToken this_CLASS_ID_9 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:118:28: ( ( (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_4= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? ) ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:119:1: ( (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_4= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? ) )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:119:1: ( (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? ) | (kw= '!' this_CLASS_ID_4= ruleCLASS_ID ) | (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 10:
                {
                alt4=2;
                }
                break;
            case 11:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:119:2: (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:119:2: (this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )? )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:119:7: this_ID_0= RULE_ID (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )?
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCLASS_ID219); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_0_0()); 
                        
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:126:1: (kw= '.' this_CLASS_ID_2= ruleCLASS_ID )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==9) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:127:2: kw= '.' this_CLASS_ID_2= ruleCLASS_ID
                            {
                            kw=(Token)match(input,9,FOLLOW_9_in_ruleCLASS_ID238); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCLASS_IDAccess().getFullStopKeyword_0_1_0()); 
                                
                             
                                    newCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_0_1_1()); 
                                
                            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID260);
                            this_CLASS_ID_2=ruleCLASS_ID();

                            state._fsp--;


                            		current.merge(this_CLASS_ID_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:144:6: (kw= '!' this_CLASS_ID_4= ruleCLASS_ID )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:144:6: (kw= '!' this_CLASS_ID_4= ruleCLASS_ID )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:145:2: kw= '!' this_CLASS_ID_4= ruleCLASS_ID
                    {
                    kw=(Token)match(input,10,FOLLOW_10_in_ruleCLASS_ID288); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCLASS_IDAccess().getExclamationMarkKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID310);
                    this_CLASS_ID_4=ruleCLASS_ID();

                    state._fsp--;


                    		current.merge(this_CLASS_ID_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:162:6: (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:162:6: (kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )? )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:163:2: kw= '(' this_CLASS_ID_6= ruleCLASS_ID kw= ')' (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )?
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleCLASS_ID336); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCLASS_IDAccess().getLeftParenthesisKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID358);
                    this_CLASS_ID_6=ruleCLASS_ID();

                    state._fsp--;


                    		current.merge(this_CLASS_ID_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleCLASS_ID376); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_2_2()); 
                        
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:185:1: (kw= '.' this_CLASS_ID_9= ruleCLASS_ID )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==9) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:186:2: kw= '.' this_CLASS_ID_9= ruleCLASS_ID
                            {
                            kw=(Token)match(input,9,FOLLOW_9_in_ruleCLASS_ID390); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCLASS_IDAccess().getFullStopKeyword_2_3_0()); 
                                
                             
                                    newCompositeNode(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_3_1()); 
                                
                            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID412);
                            this_CLASS_ID_9=ruleCLASS_ID();

                            state._fsp--;


                            		current.merge(this_CLASS_ID_9);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:210:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:211:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:212:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement460);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement470); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:219:1: ruleAbstractElement returns [EObject current=null] : (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Bundle_0 = null;

        EObject this_Body_1 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:222:28: ( (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:223:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:223:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:224:5: this_Bundle_0= ruleBundle
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getBundleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBundle_in_ruleAbstractElement517);
                    this_Bundle_0=ruleBundle();

                    state._fsp--;

                     
                            current = this_Bundle_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:234:5: this_Body_1= ruleBody
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getBodyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBody_in_ruleAbstractElement544);
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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:250:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:251:2: (iv_ruleBundle= ruleBundle EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:252:2: iv_ruleBundle= ruleBundle EOF
            {
             newCompositeNode(grammarAccess.getBundleRule()); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle579);
            iv_ruleBundle=ruleBundle();

            state._fsp--;

             current =iv_ruleBundle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle589); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:259:1: ruleBundle returns [EObject current=null] : (otherlv_0= 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* otherlv_10= '}' ) ;
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
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:262:28: ( (otherlv_0= 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* otherlv_10= '}' ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:263:1: (otherlv_0= 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* otherlv_10= '}' )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:263:1: (otherlv_0= 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* otherlv_10= '}' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:263:3: otherlv_0= 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBundlePromiseType ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleBundle626); 

                	newLeafNode(otherlv_0, grammarAccess.getBundleAccess().getBundleKeyword_0());
                
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:267:1: ( (lv_component_1_0= ruleBundleComponent ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:268:1: (lv_component_1_0= ruleBundleComponent )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:268:1: (lv_component_1_0= ruleBundleComponent )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:269:3: lv_component_1_0= ruleBundleComponent
            {
             
            	        newCompositeNode(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBundleComponent_in_ruleBundle647);
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

            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:285:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:286:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:286:1: (lv_name_2_0= RULE_ID )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:287:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle664); 

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

            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:303:2: (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:303:4: otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleBundle682); 

                        	newLeafNode(otherlv_3, grammarAccess.getBundleAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:307:1: ( (lv_variables_4_0= RULE_ID ) )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:308:1: (lv_variables_4_0= RULE_ID )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:308:1: (lv_variables_4_0= RULE_ID )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:309:3: lv_variables_4_0= RULE_ID
                    {
                    lv_variables_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle699); 

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

                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:325:2: (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:325:4: otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleBundle717); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getBundleAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:329:1: ( (lv_variables_6_0= RULE_ID ) )
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:330:1: (lv_variables_6_0= RULE_ID )
                    	    {
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:330:1: (lv_variables_6_0= RULE_ID )
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:331:3: lv_variables_6_0= RULE_ID
                    	    {
                    	    lv_variables_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle734); 

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

                    otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleBundle753); 

                        	newLeafNode(otherlv_7, grammarAccess.getBundleAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleBundle767); 

                	newLeafNode(otherlv_8, grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:355:1: ( (lv_promiseType_9_0= ruleBundlePromiseType ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:356:1: (lv_promiseType_9_0= ruleBundlePromiseType )
            	    {
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:356:1: (lv_promiseType_9_0= ruleBundlePromiseType )
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:357:3: lv_promiseType_9_0= ruleBundlePromiseType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromiseType_in_ruleBundle788);
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

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleBundle801); 

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


    // $ANTLR start "entryRuleBundleComponent"
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:385:1: entryRuleBundleComponent returns [EObject current=null] : iv_ruleBundleComponent= ruleBundleComponent EOF ;
    public final EObject entryRuleBundleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleComponent = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:386:2: (iv_ruleBundleComponent= ruleBundleComponent EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:387:2: iv_ruleBundleComponent= ruleBundleComponent EOF
            {
             newCompositeNode(grammarAccess.getBundleComponentRule()); 
            pushFollow(FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent837);
            iv_ruleBundleComponent=ruleBundleComponent();

            state._fsp--;

             current =iv_ruleBundleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleComponent847); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:394:1: ruleBundleComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBundleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:397:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:398:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:398:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:399:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:399:1: (lv_name_0_0= RULE_ID )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:400:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundleComponent888); 

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


    // $ANTLR start "entryRuleBundlePromiseType"
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:424:1: entryRuleBundlePromiseType returns [EObject current=null] : iv_ruleBundlePromiseType= ruleBundlePromiseType EOF ;
    public final EObject entryRuleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundlePromiseType = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:425:2: (iv_ruleBundlePromiseType= ruleBundlePromiseType EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:426:2: iv_ruleBundlePromiseType= ruleBundlePromiseType EOF
            {
             newCompositeNode(grammarAccess.getBundlePromiseTypeRule()); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType928);
            iv_ruleBundlePromiseType=ruleBundlePromiseType();

            state._fsp--;

             current =iv_ruleBundlePromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromiseType938); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:433:1: ruleBundlePromiseType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* ) ;
    public final EObject ruleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_promises_2_0 = null;

        EObject lv_classes_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:436:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:437:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:437:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )* )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:437:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_promises_2_0= ruleBundlePromise ) )* ( (lv_classes_3_0= ruleBundleClass ) )*
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:437:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:438:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:438:1: (lv_name_0_0= RULE_ID )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:439:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundlePromiseType980); 

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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleBundlePromiseType997); 

                	newLeafNode(otherlv_1, grammarAccess.getBundlePromiseTypeAccess().getColonKeyword_1());
                
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:459:1: ( (lv_promises_2_0= ruleBundlePromise ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:460:1: (lv_promises_2_0= ruleBundlePromise )
            	    {
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:460:1: (lv_promises_2_0= ruleBundlePromise )
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:461:3: lv_promises_2_0= ruleBundlePromise
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundlePromiseTypeAccess().getPromisesBundlePromiseParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromise_in_ruleBundlePromiseType1018);
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

            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:477:3: ( (lv_classes_3_0= ruleBundleClass ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==9||LA10_2==18) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>=10 && LA10_0<=11)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:478:1: (lv_classes_3_0= ruleBundleClass )
            	    {
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:478:1: (lv_classes_3_0= ruleBundleClass )
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:479:3: lv_classes_3_0= ruleBundleClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundlePromiseTypeAccess().getClassesBundleClassParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundleClass_in_ruleBundlePromiseType1040);
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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:503:1: entryRuleBundleClass returns [EObject current=null] : iv_ruleBundleClass= ruleBundleClass EOF ;
    public final EObject entryRuleBundleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleClass = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:504:2: (iv_ruleBundleClass= ruleBundleClass EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:505:2: iv_ruleBundleClass= ruleBundleClass EOF
            {
             newCompositeNode(grammarAccess.getBundleClassRule()); 
            pushFollow(FOLLOW_ruleBundleClass_in_entryRuleBundleClass1077);
            iv_ruleBundleClass=ruleBundleClass();

            state._fsp--;

             current =iv_ruleBundleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleClass1087); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:512:1: ruleBundleClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ ) ;
    public final EObject ruleBundleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_promises_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:515:28: ( ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:516:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:516:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promises_2_0= ruleBundlePromise ) )+ )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:516:2: ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promises_2_0= ruleBundlePromise ) )+
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:516:2: ( (lv_name_0_0= ruleCLASS_ID ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:517:1: (lv_name_0_0= ruleCLASS_ID )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:517:1: (lv_name_0_0= ruleCLASS_ID )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:518:3: lv_name_0_0= ruleCLASS_ID
            {
             
            	        newCompositeNode(grammarAccess.getBundleClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleBundleClass1133);
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBundleClass1145); 

                	newLeafNode(otherlv_1, grammarAccess.getBundleClassAccess().getColonColonKeyword_1());
                
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:538:1: ( (lv_promises_2_0= ruleBundlePromise ) )+
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
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:539:1: (lv_promises_2_0= ruleBundlePromise )
            	    {
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:539:1: (lv_promises_2_0= ruleBundlePromise )
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:540:3: lv_promises_2_0= ruleBundlePromise
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleClassAccess().getPromisesBundlePromiseParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromise_in_ruleBundleClass1166);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:564:1: entryRuleBundlePromise returns [EObject current=null] : iv_ruleBundlePromise= ruleBundlePromise EOF ;
    public final EObject entryRuleBundlePromise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundlePromise = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:565:2: (iv_ruleBundlePromise= ruleBundlePromise EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:566:2: iv_ruleBundlePromise= ruleBundlePromise EOF
            {
             newCompositeNode(grammarAccess.getBundlePromiseRule()); 
            pushFollow(FOLLOW_ruleBundlePromise_in_entryRuleBundlePromise1203);
            iv_ruleBundlePromise=ruleBundlePromise();

            state._fsp--;

             current =iv_ruleBundlePromise; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromise1213); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:573:1: ruleBundlePromise returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )? otherlv_4= ';' ) ;
    public final EObject ruleBundlePromise() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:576:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )? otherlv_4= ';' ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:577:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )? otherlv_4= ';' )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:577:1: ( ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )? otherlv_4= ';' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:577:2: ( (lv_name_0_0= RULE_STRING ) ) ( ( (lv_values_1_0= rulePromiseValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )? otherlv_4= ';'
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:577:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:578:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:578:1: (lv_name_0_0= RULE_STRING )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:579:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBundlePromise1255); 

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

            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:595:2: ( ( (lv_values_1_0= rulePromiseValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:595:3: ( (lv_values_1_0= rulePromiseValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )*
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:595:3: ( (lv_values_1_0= rulePromiseValue ) )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:596:1: (lv_values_1_0= rulePromiseValue )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:596:1: (lv_values_1_0= rulePromiseValue )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:597:3: lv_values_1_0= rulePromiseValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePromiseValue_in_ruleBundlePromise1282);
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

                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:613:2: (otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:613:4: otherlv_2= ',' ( (lv_values_3_0= rulePromiseValue ) )
                    	    {
                    	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBundlePromise1295); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getBundlePromiseAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:617:1: ( (lv_values_3_0= rulePromiseValue ) )
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:618:1: (lv_values_3_0= rulePromiseValue )
                    	    {
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:618:1: (lv_values_3_0= rulePromiseValue )
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:619:3: lv_values_3_0= rulePromiseValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePromiseValue_in_ruleBundlePromise1316);
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

            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleBundlePromise1332); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:647:1: entryRulePromiseValue returns [EObject current=null] : iv_rulePromiseValue= rulePromiseValue EOF ;
    public final EObject entryRulePromiseValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePromiseValue = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:648:2: (iv_rulePromiseValue= rulePromiseValue EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:649:2: iv_rulePromiseValue= rulePromiseValue EOF
            {
             newCompositeNode(grammarAccess.getPromiseValueRule()); 
            pushFollow(FOLLOW_rulePromiseValue_in_entryRulePromiseValue1368);
            iv_rulePromiseValue=rulePromiseValue();

            state._fsp--;

             current =iv_rulePromiseValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePromiseValue1378); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:656:1: rulePromiseValue returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' ) | (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' ) ) ) ;
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
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:659:28: ( ( ( (lv_keyword_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' ) | (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' ) ) ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:660:1: ( ( (lv_keyword_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' ) | (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' ) ) )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:660:1: ( ( (lv_keyword_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' ) | (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' ) ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:660:2: ( (lv_keyword_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' ) | (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' ) )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:660:2: ( (lv_keyword_0_0= RULE_ID ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:661:1: (lv_keyword_0_0= RULE_ID )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:661:1: (lv_keyword_0_0= RULE_ID )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:662:3: lv_keyword_0_0= RULE_ID
            {
            lv_keyword_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePromiseValue1420); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_rulePromiseValue1437); 

                	newLeafNode(otherlv_1, grammarAccess.getPromiseValueAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:682:1: ( ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) ) | (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' ) | (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
                alt18=1;
            }
            else if ( (LA18_0==15) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==21) ) {
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
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:682:2: ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:682:2: ( ( (lv_values_2_0= RULE_STRING ) ) | ( (lv_functions_3_0= ruleSimpleFunction ) ) | ( (lv_values_4_0= RULE_ID ) ) )
                    int alt14=3;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_STRING) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==RULE_ID) ) {
                        int LA14_2 = input.LA(2);

                        if ( (LA14_2==EOF||LA14_2==14||LA14_2==19) ) {
                            alt14=3;
                        }
                        else if ( (LA14_2==11) ) {
                            alt14=2;
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
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:682:3: ( (lv_values_2_0= RULE_STRING ) )
                            {
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:682:3: ( (lv_values_2_0= RULE_STRING ) )
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:683:1: (lv_values_2_0= RULE_STRING )
                            {
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:683:1: (lv_values_2_0= RULE_STRING )
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:684:3: lv_values_2_0= RULE_STRING
                            {
                            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1456); 

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
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:701:6: ( (lv_functions_3_0= ruleSimpleFunction ) )
                            {
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:701:6: ( (lv_functions_3_0= ruleSimpleFunction ) )
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:702:1: (lv_functions_3_0= ruleSimpleFunction )
                            {
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:702:1: (lv_functions_3_0= ruleSimpleFunction )
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:703:3: lv_functions_3_0= ruleSimpleFunction
                            {
                             
                            	        newCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1488);
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
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:720:6: ( (lv_values_4_0= RULE_ID ) )
                            {
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:720:6: ( (lv_values_4_0= RULE_ID ) )
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:721:1: (lv_values_4_0= RULE_ID )
                            {
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:721:1: (lv_values_4_0= RULE_ID )
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:722:3: lv_values_4_0= RULE_ID
                            {
                            lv_values_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePromiseValue1511); 

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
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:739:6: (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:739:6: (otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}' )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:739:8: otherlv_5= '{' ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) ) (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )* otherlv_11= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_rulePromiseValue1536); 

                        	newLeafNode(otherlv_5, grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:743:1: ( ( (lv_values_6_0= RULE_STRING ) ) | ( (lv_functions_7_0= ruleSimpleFunction ) ) )
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
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:743:2: ( (lv_values_6_0= RULE_STRING ) )
                            {
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:743:2: ( (lv_values_6_0= RULE_STRING ) )
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:744:1: (lv_values_6_0= RULE_STRING )
                            {
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:744:1: (lv_values_6_0= RULE_STRING )
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:745:3: lv_values_6_0= RULE_STRING
                            {
                            lv_values_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1554); 

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
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:762:6: ( (lv_functions_7_0= ruleSimpleFunction ) )
                            {
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:762:6: ( (lv_functions_7_0= ruleSimpleFunction ) )
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:763:1: (lv_functions_7_0= ruleSimpleFunction )
                            {
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:763:1: (lv_functions_7_0= ruleSimpleFunction )
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:764:3: lv_functions_7_0= ruleSimpleFunction
                            {
                             
                            	        newCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1586);
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

                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:780:3: (otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:780:5: otherlv_8= ',' ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_14_in_rulePromiseValue1600); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getPromiseValueAccess().getCommaKeyword_2_1_2_0());
                    	        
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:784:1: ( ( (lv_values_9_0= RULE_STRING ) ) | ( (lv_functions_10_0= ruleSimpleFunction ) ) )
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
                    	            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:784:2: ( (lv_values_9_0= RULE_STRING ) )
                    	            {
                    	            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:784:2: ( (lv_values_9_0= RULE_STRING ) )
                    	            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:785:1: (lv_values_9_0= RULE_STRING )
                    	            {
                    	            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:785:1: (lv_values_9_0= RULE_STRING )
                    	            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:786:3: lv_values_9_0= RULE_STRING
                    	            {
                    	            lv_values_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePromiseValue1618); 

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
                    	            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:803:6: ( (lv_functions_10_0= ruleSimpleFunction ) )
                    	            {
                    	            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:803:6: ( (lv_functions_10_0= ruleSimpleFunction ) )
                    	            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:804:1: (lv_functions_10_0= ruleSimpleFunction )
                    	            {
                    	            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:804:1: (lv_functions_10_0= ruleSimpleFunction )
                    	            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:805:3: lv_functions_10_0= ruleSimpleFunction
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_2_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleSimpleFunction_in_rulePromiseValue1650);
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

                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_rulePromiseValue1665); 

                        	newLeafNode(otherlv_11, grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:826:6: (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:826:6: (otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}' )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:826:8: otherlv_12= '{' otherlv_13= '@' otherlv_14= '(' this_ID_15= RULE_ID otherlv_16= ')' otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,15,FOLLOW_15_in_rulePromiseValue1685); 

                        	newLeafNode(otherlv_12, grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_2_0());
                        
                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_rulePromiseValue1697); 

                        	newLeafNode(otherlv_13, grammarAccess.getPromiseValueAccess().getCommercialAtKeyword_2_2_1());
                        
                    otherlv_14=(Token)match(input,11,FOLLOW_11_in_rulePromiseValue1709); 

                        	newLeafNode(otherlv_14, grammarAccess.getPromiseValueAccess().getLeftParenthesisKeyword_2_2_2());
                        
                    this_ID_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePromiseValue1720); 
                     
                        newLeafNode(this_ID_15, grammarAccess.getPromiseValueAccess().getIDTerminalRuleCall_2_2_3()); 
                        
                    otherlv_16=(Token)match(input,12,FOLLOW_12_in_rulePromiseValue1731); 

                        	newLeafNode(otherlv_16, grammarAccess.getPromiseValueAccess().getRightParenthesisKeyword_2_2_4());
                        
                    otherlv_17=(Token)match(input,16,FOLLOW_16_in_rulePromiseValue1743); 

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


    // $ANTLR start "entryRuleSimpleFunction"
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:858:1: entryRuleSimpleFunction returns [EObject current=null] : iv_ruleSimpleFunction= ruleSimpleFunction EOF ;
    public final EObject entryRuleSimpleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFunction = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:859:2: (iv_ruleSimpleFunction= ruleSimpleFunction EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:860:2: iv_ruleSimpleFunction= ruleSimpleFunction EOF
            {
             newCompositeNode(grammarAccess.getSimpleFunctionRule()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_entryRuleSimpleFunction1781);
            iv_ruleSimpleFunction=ruleSimpleFunction();

            state._fsp--;

             current =iv_ruleSimpleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFunction1791); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:867:1: ruleSimpleFunction returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ')' ) ;
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
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:870:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ')' ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:871:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ')' )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:871:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ')' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:871:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ')'
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:871:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:872:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:872:1: (lv_id_0_0= RULE_ID )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:873:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleFunction1833); 

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

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleSimpleFunction1850); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleFunctionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:893:1: ( (lv_values_2_0= RULE_STRING ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:894:1: (lv_values_2_0= RULE_STRING )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:894:1: (lv_values_2_0= RULE_STRING )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:895:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleFunction1867); 

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

            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:911:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:911:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleSimpleFunction1885); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSimpleFunctionAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:915:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:916:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:916:1: (lv_values_4_0= RULE_STRING )
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:917:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleFunction1902); 

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
            	    break loop19;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleSimpleFunction1921); 

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


    // $ANTLR start "entryRuleBody"
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:945:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:946:2: (iv_ruleBody= ruleBody EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:947:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody1957);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody1967); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:954:1: ruleBody returns [EObject current=null] : (otherlv_0= 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* otherlv_11= '}' ) ;
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
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:957:28: ( (otherlv_0= 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* otherlv_11= '}' ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:958:1: (otherlv_0= 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* otherlv_11= '}' )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:958:1: (otherlv_0= 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* otherlv_11= '}' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:958:3: otherlv_0= 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_promiseType_9_0= ruleBodyFunction ) )* ( (lv_classes_10_0= ruleBodyClass ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleBody2004); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getBodyKeyword_0());
                
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:962:1: ( (lv_component_1_0= ruleBodyComponent ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:963:1: (lv_component_1_0= ruleBodyComponent )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:963:1: (lv_component_1_0= ruleBodyComponent )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:964:3: lv_component_1_0= ruleBodyComponent
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyComponent_in_ruleBody2025);
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

            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:980:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:981:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:981:1: (lv_name_2_0= RULE_ID )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:982:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody2042); 

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

            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:998:2: (otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==11) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:998:4: otherlv_3= '(' ( (lv_variables_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleBody2060); 

                        	newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1002:1: ( (lv_variables_4_0= RULE_ID ) )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1003:1: (lv_variables_4_0= RULE_ID )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1003:1: (lv_variables_4_0= RULE_ID )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1004:3: lv_variables_4_0= RULE_ID
                    {
                    lv_variables_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody2077); 

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

                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1020:2: (otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1020:4: otherlv_5= ',' ( (lv_variables_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleBody2095); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getBodyAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1024:1: ( (lv_variables_6_0= RULE_ID ) )
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1025:1: (lv_variables_6_0= RULE_ID )
                    	    {
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1025:1: (lv_variables_6_0= RULE_ID )
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1026:3: lv_variables_6_0= RULE_ID
                    	    {
                    	    lv_variables_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody2112); 

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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleBody2131); 

                        	newLeafNode(otherlv_7, grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleBody2145); 

                	newLeafNode(otherlv_8, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1050:1: ( (lv_promiseType_9_0= ruleBodyFunction ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==20) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1051:1: (lv_promiseType_9_0= ruleBodyFunction )
            	    {
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1051:1: (lv_promiseType_9_0= ruleBodyFunction )
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1052:3: lv_promiseType_9_0= ruleBodyFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBody2166);
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
            	    break loop22;
                }
            } while (true);

            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1068:3: ( (lv_classes_10_0= ruleBodyClass ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=10 && LA23_0<=11)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1069:1: (lv_classes_10_0= ruleBodyClass )
            	    {
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1069:1: (lv_classes_10_0= ruleBodyClass )
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1070:3: lv_classes_10_0= ruleBodyClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBodyAccess().getClassesBodyClassParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyClass_in_ruleBody2188);
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
            	    break loop23;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleBody2201); 

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


    // $ANTLR start "entryRuleBodyPromiseType"
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1098:1: entryRuleBodyPromiseType returns [EObject current=null] : iv_ruleBodyPromiseType= ruleBodyPromiseType EOF ;
    public final EObject entryRuleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyPromiseType = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1099:2: (iv_ruleBodyPromiseType= ruleBodyPromiseType EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1100:2: iv_ruleBodyPromiseType= ruleBodyPromiseType EOF
            {
             newCompositeNode(grammarAccess.getBodyPromiseTypeRule()); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType2237);
            iv_ruleBodyPromiseType=ruleBodyPromiseType();

            state._fsp--;

             current =iv_ruleBodyPromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyPromiseType2247); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1107:1: ruleBodyPromiseType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1110:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1111:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1111:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1112:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1112:1: (lv_name_0_0= RULE_ID )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1113:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyPromiseType2288); 

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


    // $ANTLR start "entryRuleBodyComponent"
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1137:1: entryRuleBodyComponent returns [EObject current=null] : iv_ruleBodyComponent= ruleBodyComponent EOF ;
    public final EObject entryRuleBodyComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyComponent = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1138:2: (iv_ruleBodyComponent= ruleBodyComponent EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1139:2: iv_ruleBodyComponent= ruleBodyComponent EOF
            {
             newCompositeNode(grammarAccess.getBodyComponentRule()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent2328);
            iv_ruleBodyComponent=ruleBodyComponent();

            state._fsp--;

             current =iv_ruleBodyComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent2338); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1146:1: ruleBodyComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1149:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1150:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1150:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1151:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1151:1: (lv_name_0_0= RULE_ID )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1152:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyComponent2379); 

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


    // $ANTLR start "entryRuleBodyClass"
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1176:1: entryRuleBodyClass returns [EObject current=null] : iv_ruleBodyClass= ruleBodyClass EOF ;
    public final EObject entryRuleBodyClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyClass = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1177:2: (iv_ruleBodyClass= ruleBodyClass EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1178:2: iv_ruleBodyClass= ruleBodyClass EOF
            {
             newCompositeNode(grammarAccess.getBodyClassRule()); 
            pushFollow(FOLLOW_ruleBodyClass_in_entryRuleBodyClass2419);
            iv_ruleBodyClass=ruleBodyClass();

            state._fsp--;

             current =iv_ruleBodyClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyClass2429); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1185:1: ruleBodyClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* ) ;
    public final EObject ruleBodyClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_promiseType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1188:28: ( ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1189:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1189:1: ( ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )* )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1189:2: ( (lv_name_0_0= ruleCLASS_ID ) ) otherlv_1= '::' ( (lv_promiseType_2_0= ruleBodyFunction ) )*
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1189:2: ( (lv_name_0_0= ruleCLASS_ID ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1190:1: (lv_name_0_0= ruleCLASS_ID )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1190:1: (lv_name_0_0= ruleCLASS_ID )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1191:3: lv_name_0_0= ruleCLASS_ID
            {
             
            	        newCompositeNode(grammarAccess.getBodyClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCLASS_ID_in_ruleBodyClass2475);
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBodyClass2487); 

                	newLeafNode(otherlv_1, grammarAccess.getBodyClassAccess().getColonColonKeyword_1());
                
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1211:1: ( (lv_promiseType_2_0= ruleBodyFunction ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==20) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1212:1: (lv_promiseType_2_0= ruleBodyFunction )
            	    {
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1212:1: (lv_promiseType_2_0= ruleBodyFunction )
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1213:3: lv_promiseType_2_0= ruleBodyFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBodyClassAccess().getPromiseTypeBodyFunctionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBodyClass2508);
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
            	    break loop24;
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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1237:1: entryRuleBodyFunction returns [EObject current=null] : iv_ruleBodyFunction= ruleBodyFunction EOF ;
    public final EObject entryRuleBodyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyFunction = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1238:2: (iv_ruleBodyFunction= ruleBodyFunction EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1239:2: iv_ruleBodyFunction= ruleBodyFunction EOF
            {
             newCompositeNode(grammarAccess.getBodyFunctionRule()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction2545);
            iv_ruleBodyFunction=ruleBodyFunction();

            state._fsp--;

             current =iv_ruleBodyFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyFunction2555); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1246:1: ruleBodyFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleBodyPromiseType ) ) otherlv_1= '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' ) ) otherlv_15= ';' ) ;
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
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1249:28: ( ( ( (lv_name_0_0= ruleBodyPromiseType ) ) otherlv_1= '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' ) ) otherlv_15= ';' ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1250:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) otherlv_1= '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' ) ) otherlv_15= ';' )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1250:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) otherlv_1= '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' ) ) otherlv_15= ';' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1250:2: ( (lv_name_0_0= ruleBodyPromiseType ) ) otherlv_1= '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' ) ) otherlv_15= ';'
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1250:2: ( (lv_name_0_0= ruleBodyPromiseType ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1251:1: (lv_name_0_0= ruleBodyPromiseType )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1251:1: (lv_name_0_0= ruleBodyPromiseType )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1252:3: lv_name_0_0= ruleBodyPromiseType
            {
             
            	        newCompositeNode(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction2601);
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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleBodyFunction2613); 

                	newLeafNode(otherlv_1, grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1272:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) | (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt26=1;
                }
                break;
            case 15:
                {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==RULE_STRING) ) {
                    alt26=2;
                }
                else if ( (LA26_2==21) ) {
                    alt26=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1272:2: ( (lv_values_2_0= RULE_STRING ) )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1272:2: ( (lv_values_2_0= RULE_STRING ) )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1273:1: (lv_values_2_0= RULE_STRING )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1273:1: (lv_values_2_0= RULE_STRING )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1274:3: lv_values_2_0= RULE_STRING
                    {
                    lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2631); 

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
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1291:6: ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1291:6: ( ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}' )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1291:7: ( (lv_List_3_0= '{' ) ) ( (lv_values_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )* otherlv_7= '}'
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1291:7: ( (lv_List_3_0= '{' ) )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1292:1: (lv_List_3_0= '{' )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1292:1: (lv_List_3_0= '{' )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1293:3: lv_List_3_0= '{'
                    {
                    lv_List_3_0=(Token)match(input,15,FOLLOW_15_in_ruleBodyFunction2661); 

                            newLeafNode(lv_List_3_0, grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBodyFunctionRule());
                    	        }
                           		setWithLastConsumed(current, "List", true, "{");
                    	    

                    }


                    }

                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1306:2: ( (lv_values_4_0= RULE_STRING ) )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1307:1: (lv_values_4_0= RULE_STRING )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1307:1: (lv_values_4_0= RULE_STRING )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1308:3: lv_values_4_0= RULE_STRING
                    {
                    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2691); 

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

                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1324:2: (otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1324:4: otherlv_5= ',' ( (lv_values_6_0= RULE_STRING ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleBodyFunction2709); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0());
                    	        
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1328:1: ( (lv_values_6_0= RULE_STRING ) )
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1329:1: (lv_values_6_0= RULE_STRING )
                    	    {
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1329:1: (lv_values_6_0= RULE_STRING )
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1330:3: lv_values_6_0= RULE_STRING
                    	    {
                    	    lv_values_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction2726); 

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
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleBodyFunction2745); 

                        	newLeafNode(otherlv_7, grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1351:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1351:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1352:1: (lv_function_8_0= ruleSpecialFunction )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1352:1: (lv_function_8_0= ruleSpecialFunction )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1353:3: lv_function_8_0= ruleSpecialFunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleBodyFunction2773);
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
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1370:6: (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' )
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1370:6: (otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}' )
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1370:8: otherlv_9= '{' otherlv_10= '@' otherlv_11= '(' this_ID_12= RULE_ID otherlv_13= ')' otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleBodyFunction2792); 

                        	newLeafNode(otherlv_9, grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_3_0());
                        
                    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleBodyFunction2804); 

                        	newLeafNode(otherlv_10, grammarAccess.getBodyFunctionAccess().getCommercialAtKeyword_2_3_1());
                        
                    otherlv_11=(Token)match(input,11,FOLLOW_11_in_ruleBodyFunction2816); 

                        	newLeafNode(otherlv_11, grammarAccess.getBodyFunctionAccess().getLeftParenthesisKeyword_2_3_2());
                        
                    this_ID_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyFunction2827); 
                     
                        newLeafNode(this_ID_12, grammarAccess.getBodyFunctionAccess().getIDTerminalRuleCall_2_3_3()); 
                        
                    otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleBodyFunction2838); 

                        	newLeafNode(otherlv_13, grammarAccess.getBodyFunctionAccess().getRightParenthesisKeyword_2_3_4());
                        
                    otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleBodyFunction2850); 

                        	newLeafNode(otherlv_14, grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_3_5());
                        

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleBodyFunction2864); 

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


    // $ANTLR start "entryRuleSpecialFunction"
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1406:1: entryRuleSpecialFunction returns [EObject current=null] : iv_ruleSpecialFunction= ruleSpecialFunction EOF ;
    public final EObject entryRuleSpecialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialFunction = null;


        try {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1407:2: (iv_ruleSpecialFunction= ruleSpecialFunction EOF )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1408:2: iv_ruleSpecialFunction= ruleSpecialFunction EOF
            {
             newCompositeNode(grammarAccess.getSpecialFunctionRule()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction2900);
            iv_ruleSpecialFunction=ruleSpecialFunction();

            state._fsp--;

             current =iv_ruleSpecialFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialFunction2910); 

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
    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1415:1: ruleSpecialFunction returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' (this_ANY_OTHER_2= RULE_ANY_OTHER | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | otherlv_5= ',' | (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' ) | (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* otherlv_13= ')' ) ;
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
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1418:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' (this_ANY_OTHER_2= RULE_ANY_OTHER | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | otherlv_5= ',' | (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' ) | (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* otherlv_13= ')' ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1419:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' (this_ANY_OTHER_2= RULE_ANY_OTHER | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | otherlv_5= ',' | (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' ) | (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* otherlv_13= ')' )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1419:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' (this_ANY_OTHER_2= RULE_ANY_OTHER | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | otherlv_5= ',' | (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' ) | (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* otherlv_13= ')' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1419:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' (this_ANY_OTHER_2= RULE_ANY_OTHER | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | otherlv_5= ',' | (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' ) | (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )* otherlv_13= ')'
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1419:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1420:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1420:1: (lv_id_0_0= RULE_ID )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1421:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2952); 

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

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleSpecialFunction2969); 

                	newLeafNode(otherlv_1, grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1441:1: (this_ANY_OTHER_2= RULE_ANY_OTHER | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | otherlv_5= ',' | (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' ) | (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )*
            loop27:
            do {
                int alt27=8;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1441:2: this_ANY_OTHER_2= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSpecialFunction2981); 
            	     
            	        newLeafNode(this_ANY_OTHER_2, grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1446:6: this_ID_3= RULE_ID
            	    {
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction2997); 
            	     
            	        newLeafNode(this_ID_3, grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1451:6: this_STRING_4= RULE_STRING
            	    {
            	    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpecialFunction3013); 
            	     
            	        newLeafNode(this_STRING_4, grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1456:7: otherlv_5= ','
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSpecialFunction3030); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_3());
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1461:6: (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' )
            	    {
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1461:6: (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' )
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1461:8: otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')'
            	    {
            	    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleSpecialFunction3049); 

            	        	newLeafNode(otherlv_6, grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_2_4_0());
            	        
            	    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction3060); 
            	     
            	        newLeafNode(this_ID_7, grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_4_1()); 
            	        
            	    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleSpecialFunction3071); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_2_4_2());
            	        

            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1474:6: (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' )
            	    {
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1474:6: (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' )
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1474:8: otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}'
            	    {
            	    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleSpecialFunction3091); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_2_5_0());
            	        
            	    this_ID_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction3102); 
            	     
            	        newLeafNode(this_ID_10, grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_5_1()); 
            	        
            	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleSpecialFunction3113); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_2_5_2());
            	        

            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1487:6: ( (lv_func_12_0= ruleSpecialFunction ) )
            	    {
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1487:6: ( (lv_func_12_0= ruleSpecialFunction ) )
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1488:1: (lv_func_12_0= ruleSpecialFunction )
            	    {
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1488:1: (lv_func_12_0= ruleSpecialFunction )
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1489:3: lv_func_12_0= ruleSpecialFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSpecialFunctionAccess().getFuncSpecialFunctionParserRuleCall_2_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleSpecialFunction3141);
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

            otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleSpecialFunction3155); 

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

    // Delegated rules


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\12\uffff";
    static final String DFA27_eofS =
        "\12\uffff";
    static final String DFA27_minS =
        "\1\4\2\uffff\1\4\6\uffff";
    static final String DFA27_maxS =
        "\1\30\2\uffff\1\30\6\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\10\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\2";
    static final String DFA27_specialS =
        "\12\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\3\1\4\1\2\5\uffff\1\1\1\uffff\1\5\10\uffff\1\6\1\7",
            "",
            "",
            "\3\11\4\uffff\1\10\1\11\1\uffff\1\11\10\uffff\2\11",
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
            return "()* loopback of 1441:1: (this_ANY_OTHER_2= RULE_ANY_OTHER | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING | otherlv_5= ',' | (otherlv_6= '$(' this_ID_7= RULE_ID otherlv_8= ')' ) | (otherlv_9= '${' this_ID_10= RULE_ID otherlv_11= '}' ) | ( (lv_func_12_0= ruleSpecialFunction ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleCfModel_in_entryRuleCfModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCfModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleCfModel130 = new BitSet(new long[]{0x0000000000402002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_entryRuleCLASS_ID167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLASS_ID178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCLASS_ID219 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_ruleCLASS_ID238 = new BitSet(new long[]{0x0000000000000C10L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleCLASS_ID288 = new BitSet(new long[]{0x0000000000000C10L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCLASS_ID336 = new BitSet(new long[]{0x0000000000000C10L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID358 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCLASS_ID376 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_ruleCLASS_ID390 = new BitSet(new long[]{0x0000000000000C10L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleCLASS_ID412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_ruleAbstractElement517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_ruleAbstractElement544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBundle626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_ruleBundle647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle664 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_11_in_ruleBundle682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle699 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleBundle717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle734 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleBundle753 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBundle767 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_ruleBundle788 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleBundle801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleComponent847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundleComponent888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromiseType938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundlePromiseType980 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBundlePromiseType997 = new BitSet(new long[]{0x0000000000000C32L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_ruleBundlePromiseType1018 = new BitSet(new long[]{0x0000000000000C32L});
    public static final BitSet FOLLOW_ruleBundleClass_in_ruleBundlePromiseType1040 = new BitSet(new long[]{0x0000000000000C12L});
    public static final BitSet FOLLOW_ruleBundleClass_in_entryRuleBundleClass1077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleClass1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleBundleClass1133 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBundleClass1145 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_ruleBundleClass1166 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_entryRuleBundlePromise1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromise1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBundlePromise1255 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rulePromiseValue_in_ruleBundlePromise1282 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14_in_ruleBundlePromise1295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePromiseValue_in_ruleBundlePromise1316 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_ruleBundlePromise1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_entryRulePromiseValue1368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePromiseValue1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePromiseValue1420 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePromiseValue1437 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePromiseValue1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePromiseValue1536 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1554 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1586 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_rulePromiseValue1600 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePromiseValue1618 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rulePromiseValue1650 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_rulePromiseValue1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePromiseValue1685 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePromiseValue1697 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePromiseValue1709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePromiseValue1720 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePromiseValue1731 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePromiseValue1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_entryRuleSimpleFunction1781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFunction1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleFunction1833 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSimpleFunction1850 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleFunction1867 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleSimpleFunction1885 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleFunction1902 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleSimpleFunction1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody1957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBody2004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_ruleBody2025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody2042 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_11_in_ruleBody2060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody2077 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleBody2095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody2112 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleBody2131 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBody2145 = new BitSet(new long[]{0x0000000000010C10L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBody2166 = new BitSet(new long[]{0x0000000000010C10L});
    public static final BitSet FOLLOW_ruleBodyClass_in_ruleBody2188 = new BitSet(new long[]{0x0000000000010C10L});
    public static final BitSet FOLLOW_16_in_ruleBody2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType2237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyPromiseType2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyPromiseType2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent2328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyComponent2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_entryRuleBodyClass2419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyClass2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_ruleBodyClass2475 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBodyClass2487 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBodyClass2508 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction2545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyFunction2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction2601 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBodyFunction2613 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2631 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15_in_ruleBodyFunction2661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2691 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleBodyFunction2709 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction2726 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_ruleBodyFunction2745 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleBodyFunction2773 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15_in_ruleBodyFunction2792 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBodyFunction2804 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBodyFunction2816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyFunction2827 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBodyFunction2838 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBodyFunction2850 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBodyFunction2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction2900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialFunction2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2952 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSpecialFunction2969 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSpecialFunction2981 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction2997 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpecialFunction3013 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_14_in_ruleSpecialFunction3030 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_23_in_ruleSpecialFunction3049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction3060 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSpecialFunction3071 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_24_in_ruleSpecialFunction3091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction3102 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSpecialFunction3113 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleSpecialFunction3141 = new BitSet(new long[]{0x0000000001805070L});
    public static final BitSet FOLLOW_12_in_ruleSpecialFunction3155 = new BitSet(new long[]{0x0000000000000002L});

}