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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "'=>'", "';'", "','", "'('", "')'", "'bundle'", "'{'", "':'", "'}'", "'body'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=4;
    public static final int RULE_INT=7;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;

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

                if ( (LA1_0==15||LA1_0==19) ) {
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


    // $ANTLR start entryRulePLACEHOLDER
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:124:1: entryRulePLACEHOLDER returns [String current=null] : iv_rulePLACEHOLDER= rulePLACEHOLDER EOF ;
    public final String entryRulePLACEHOLDER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePLACEHOLDER = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:125:2: (iv_rulePLACEHOLDER= rulePLACEHOLDER EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:126:2: iv_rulePLACEHOLDER= rulePLACEHOLDER EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPLACEHOLDERRule(), currentNode); 
            pushFollow(FOLLOW_rulePLACEHOLDER_in_entryRulePLACEHOLDER167);
            iv_rulePLACEHOLDER=rulePLACEHOLDER();
            _fsp--;

             current =iv_rulePLACEHOLDER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePLACEHOLDER178); 

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
    // $ANTLR end entryRulePLACEHOLDER


    // $ANTLR start rulePLACEHOLDER
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:133:1: rulePLACEHOLDER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulePLACEHOLDER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_0=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:138:6: ( (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:139:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:139:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )
            int alt2=8;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
                {
                alt2=3;
                }
                break;
            case 10:
                {
                alt2=4;
                }
                break;
            case 11:
                {
                alt2=5;
                }
                break;
            case 12:
                {
                alt2=6;
                }
                break;
            case 13:
                {
                alt2=7;
                }
                break;
            case 14:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("139:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | kw= '=>' | kw= ';' | kw= ',' | kw= '(' | kw= ')' )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:139:6: this_ANY_OTHER_0= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_0=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rulePLACEHOLDER218); 

                    		current.merge(this_ANY_OTHER_0);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERAccess().getANY_OTHERTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:147:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePLACEHOLDER244); 

                    		current.merge(this_ID_1);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERAccess().getIDTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:155:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePLACEHOLDER270); 

                    		current.merge(this_STRING_2);
                        
                     
                        createLeafNode(grammarAccess.getPLACEHOLDERAccess().getSTRINGTerminalRuleCall_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:164:2: kw= '=>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,10,FOLLOW_10_in_rulePLACEHOLDER294); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERAccess().getEqualsSignGreaterThanSignKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:171:2: kw= ';'
                    {
                    kw=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_rulePLACEHOLDER313); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERAccess().getSemicolonKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:178:2: kw= ','
                    {
                    kw=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_rulePLACEHOLDER332); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERAccess().getCommaKeyword_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:185:2: kw= '('
                    {
                    kw=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_rulePLACEHOLDER351); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERAccess().getLeftParenthesisKeyword_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:192:2: kw= ')'
                    {
                    kw=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_rulePLACEHOLDER370); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPLACEHOLDERAccess().getRightParenthesisKeyword_7(), null); 
                        

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
    // $ANTLR end rulePLACEHOLDER


    // $ANTLR start entryRuleAbstractElement
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:205:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:206:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:207:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement410);
            iv_ruleAbstractElement=ruleAbstractElement();
            _fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement420); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:214:1: ruleAbstractElement returns [EObject current=null] : this_Part_0= rulePart ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Part_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:219:6: (this_Part_0= rulePart )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:221:5: this_Part_0= rulePart
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAbstractElementAccess().getPartParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_rulePart_in_ruleAbstractElement466);
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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:237:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:238:2: (iv_rulePart= rulePart EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:239:2: iv_rulePart= rulePart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPartRule(), currentNode); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart500);
            iv_rulePart=rulePart();
            _fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart510); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:246:1: rulePart returns [EObject current=null] : (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        EObject this_Bundle_0 = null;

        EObject this_Body_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:251:6: ( (this_Bundle_0= ruleBundle | this_Body_1= ruleBody ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:252:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:252:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("252:1: (this_Bundle_0= ruleBundle | this_Body_1= ruleBody )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:253:5: this_Bundle_0= ruleBundle
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getBundleParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBundle_in_rulePart557);
                    this_Bundle_0=ruleBundle();
                    _fsp--;

                     
                            current = this_Bundle_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:263:5: this_Body_1= ruleBody
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getBodyParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBody_in_rulePart584);
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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:279:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:280:2: (iv_ruleBundle= ruleBundle EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:281:2: iv_ruleBundle= ruleBundle EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle619);
            iv_ruleBundle=ruleBundle();
            _fsp--;

             current =iv_ruleBundle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle629); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:288:1: ruleBundle returns [EObject current=null] : ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) '{' ( ( (lv_promiseType_4_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDER )* )* '}' ) ;
    public final EObject ruleBundle() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_component_1_0 = null;

        EObject lv_promiseType_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:293:6: ( ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) '{' ( ( (lv_promiseType_4_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDER )* )* '}' ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:294:1: ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) '{' ( ( (lv_promiseType_4_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDER )* )* '}' )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:294:1: ( 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) '{' ( ( (lv_promiseType_4_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDER )* )* '}' )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:294:3: 'bundle' ( (lv_component_1_0= ruleBundleComponent ) ) ( (lv_name_2_0= RULE_ID ) ) '{' ( ( (lv_promiseType_4_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDER )* )* '}'
            {
            match(input,15,FOLLOW_15_in_ruleBundle664); 

                    createLeafNode(grammarAccess.getBundleAccess().getBundleKeyword_0(), null); 
                
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:298:1: ( (lv_component_1_0= ruleBundleComponent ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:299:1: (lv_component_1_0= ruleBundleComponent )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:299:1: (lv_component_1_0= ruleBundleComponent )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:300:3: lv_component_1_0= ruleBundleComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBundleComponent_in_ruleBundle685);
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

            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:322:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:323:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:323:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:324:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle702); 

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

            match(input,16,FOLLOW_16_in_ruleBundle717); 

                    createLeafNode(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:350:1: ( ( (lv_promiseType_4_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDER )* )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:350:2: ( (lv_promiseType_4_0= ruleBundlePromiseType ) ) ':' ( rulePLACEHOLDER )*
            	    {
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:350:2: ( (lv_promiseType_4_0= ruleBundlePromiseType ) )
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:351:1: (lv_promiseType_4_0= ruleBundlePromiseType )
            	    {
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:351:1: (lv_promiseType_4_0= ruleBundlePromiseType )
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:352:3: lv_promiseType_4_0= ruleBundlePromiseType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_4_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBundlePromiseType_in_ruleBundle739);
            	    lv_promiseType_4_0=ruleBundlePromiseType();
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
            	    	        		"BundlePromiseType", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,17,FOLLOW_17_in_ruleBundle749); 

            	            createLeafNode(grammarAccess.getBundleAccess().getColonKeyword_4_1(), null); 
            	        
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:378:1: ( rulePLACEHOLDER )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==RULE_ID) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((LA4_2>=RULE_ANY_OTHER && LA4_2<=RULE_STRING)||(LA4_2>=10 && LA4_2<=14)||LA4_2==18) ) {
            	                alt4=1;
            	            }


            	        }
            	        else if ( (LA4_0==RULE_ANY_OTHER||LA4_0==RULE_STRING||(LA4_0>=10 && LA4_0<=14)) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:378:2: rulePLACEHOLDER
            	    	    {
            	    	    pushFollow(FOLLOW_rulePLACEHOLDER_in_ruleBundle759);
            	    	    rulePLACEHOLDER();
            	    	    _fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleBundle765); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:390:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:391:2: (iv_ruleBody= ruleBody EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:392:2: iv_ruleBody= ruleBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody801);
            iv_ruleBody=ruleBody();
            _fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody811); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:399:1: ruleBody returns [EObject current=null] : ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDER )* '{' ( (lv_promiseType_5_0= ruleBodyFunction ) )* '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_component_1_0 = null;

        EObject lv_promiseType_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:404:6: ( ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDER )* '{' ( (lv_promiseType_5_0= ruleBodyFunction ) )* '}' ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:405:1: ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDER )* '{' ( (lv_promiseType_5_0= ruleBodyFunction ) )* '}' )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:405:1: ( 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDER )* '{' ( (lv_promiseType_5_0= ruleBodyFunction ) )* '}' )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:405:3: 'body' ( (lv_component_1_0= ruleBodyComponent ) ) ( (lv_name_2_0= RULE_ID ) ) ( rulePLACEHOLDER )* '{' ( (lv_promiseType_5_0= ruleBodyFunction ) )* '}'
            {
            match(input,19,FOLLOW_19_in_ruleBody846); 

                    createLeafNode(grammarAccess.getBodyAccess().getBodyKeyword_0(), null); 
                
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:409:1: ( (lv_component_1_0= ruleBodyComponent ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:410:1: (lv_component_1_0= ruleBodyComponent )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:410:1: (lv_component_1_0= ruleBodyComponent )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:411:3: lv_component_1_0= ruleBodyComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBodyComponent_in_ruleBody867);
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

            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:433:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:434:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:434:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:435:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody884); 

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

            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:457:2: ( rulePLACEHOLDER )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ANY_OTHER && LA6_0<=RULE_STRING)||(LA6_0>=10 && LA6_0<=14)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:457:3: rulePLACEHOLDER
            	    {
            	    pushFollow(FOLLOW_rulePLACEHOLDER_in_ruleBody899);
            	    rulePLACEHOLDER();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleBody903); 

                    createLeafNode(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:461:1: ( (lv_promiseType_5_0= ruleBodyFunction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:462:1: (lv_promiseType_5_0= ruleBodyFunction )
            	    {
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:462:1: (lv_promiseType_5_0= ruleBodyFunction )
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:463:3: lv_promiseType_5_0= ruleBodyFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyFunction_in_ruleBody924);
            	    lv_promiseType_5_0=ruleBodyFunction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBodyRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"promiseType",
            	    	        		lv_promiseType_5_0, 
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
            	    break loop7;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleBody935); 

                    createLeafNode(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_6(), null); 
                

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:497:1: entryRuleBodyFunction returns [EObject current=null] : iv_ruleBodyFunction= ruleBodyFunction EOF ;
    public final EObject entryRuleBodyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyFunction = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:498:2: (iv_ruleBodyFunction= ruleBodyFunction EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:499:2: iv_ruleBodyFunction= ruleBodyFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction971);
            iv_ruleBodyFunction=ruleBodyFunction();
            _fsp--;

             current =iv_ruleBodyFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyFunction981); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:506:1: ruleBodyFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( '{' ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) ) ';' ) ;
    public final EObject ruleBodyFunction() throws RecognitionException {
        EObject current = null;

        Token lv_values_2_0=null;
        Token lv_values_4_0=null;
        Token lv_values_6_0=null;
        EObject lv_name_0_0 = null;

        EObject lv_function_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:511:6: ( ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( '{' ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) ) ';' ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:512:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( '{' ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) ) ';' )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:512:1: ( ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( '{' ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) ) ';' )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:512:2: ( (lv_name_0_0= ruleBodyPromiseType ) ) '=>' ( ( (lv_values_2_0= RULE_STRING ) ) | ( '{' ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) ) ';'
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:512:2: ( (lv_name_0_0= ruleBodyPromiseType ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:513:1: (lv_name_0_0= ruleBodyPromiseType )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:513:1: (lv_name_0_0= ruleBodyPromiseType )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:514:3: lv_name_0_0= ruleBodyPromiseType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction1027);
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

            match(input,10,FOLLOW_10_in_ruleBodyFunction1037); 

                    createLeafNode(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1(), null); 
                
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:540:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( '{' ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("540:1: ( ( (lv_values_2_0= RULE_STRING ) ) | ( '{' ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' ) | ( (lv_function_8_0= ruleSpecialFunction ) ) )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:540:2: ( (lv_values_2_0= RULE_STRING ) )
                    {
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:540:2: ( (lv_values_2_0= RULE_STRING ) )
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:541:1: (lv_values_2_0= RULE_STRING )
                    {
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:541:1: (lv_values_2_0= RULE_STRING )
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:542:3: lv_values_2_0= RULE_STRING
                    {
                    lv_values_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction1055); 

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
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:565:6: ( '{' ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' )
                    {
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:565:6: ( '{' ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}' )
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:565:8: '{' ( (lv_values_4_0= RULE_STRING ) ) ( ',' ( (lv_values_6_0= RULE_STRING ) ) )* '}'
                    {
                    match(input,16,FOLLOW_16_in_ruleBodyFunction1077); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_1_0(), null); 
                        
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:569:1: ( (lv_values_4_0= RULE_STRING ) )
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:570:1: (lv_values_4_0= RULE_STRING )
                    {
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:570:1: (lv_values_4_0= RULE_STRING )
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:571:3: lv_values_4_0= RULE_STRING
                    {
                    lv_values_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction1094); 

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

                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:593:2: ( ',' ( (lv_values_6_0= RULE_STRING ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==12) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:593:4: ',' ( (lv_values_6_0= RULE_STRING ) )
                    	    {
                    	    match(input,12,FOLLOW_12_in_ruleBodyFunction1110); 

                    	            createLeafNode(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0(), null); 
                    	        
                    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:597:1: ( (lv_values_6_0= RULE_STRING ) )
                    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:598:1: (lv_values_6_0= RULE_STRING )
                    	    {
                    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:598:1: (lv_values_6_0= RULE_STRING )
                    	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:599:3: lv_values_6_0= RULE_STRING
                    	    {
                    	    lv_values_6_0=(Token)input.LT(1);
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBodyFunction1127); 

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
                    	    break loop8;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleBodyFunction1144); 

                            createLeafNode(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:626:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    {
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:626:6: ( (lv_function_8_0= ruleSpecialFunction ) )
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:627:1: (lv_function_8_0= ruleSpecialFunction )
                    {
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:627:1: (lv_function_8_0= ruleSpecialFunction )
                    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:628:3: lv_function_8_0= ruleSpecialFunction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSpecialFunction_in_ruleBodyFunction1172);
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

            }

            match(input,11,FOLLOW_11_in_ruleBodyFunction1183); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:662:1: entryRuleSpecialFunction returns [EObject current=null] : iv_ruleSpecialFunction= ruleSpecialFunction EOF ;
    public final EObject entryRuleSpecialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialFunction = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:663:2: (iv_ruleSpecialFunction= ruleSpecialFunction EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:664:2: iv_ruleSpecialFunction= ruleSpecialFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSpecialFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction1219);
            iv_ruleSpecialFunction=ruleSpecialFunction();
            _fsp--;

             current =iv_ruleSpecialFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialFunction1229); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:671:1: ruleSpecialFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_parameters_2_0= RULE_STRING ) ) ( ',' ( (lv_parameters_4_0= RULE_STRING ) ) )* ')' ) ;
    public final EObject ruleSpecialFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_parameters_2_0=null;
        Token lv_parameters_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:676:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_parameters_2_0= RULE_STRING ) ) ( ',' ( (lv_parameters_4_0= RULE_STRING ) ) )* ')' ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:677:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_parameters_2_0= RULE_STRING ) ) ( ',' ( (lv_parameters_4_0= RULE_STRING ) ) )* ')' )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:677:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_parameters_2_0= RULE_STRING ) ) ( ',' ( (lv_parameters_4_0= RULE_STRING ) ) )* ')' )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:677:2: ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_parameters_2_0= RULE_STRING ) ) ( ',' ( (lv_parameters_4_0= RULE_STRING ) ) )* ')'
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:677:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:678:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:678:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:679:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialFunction1271); 

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

            match(input,13,FOLLOW_13_in_ruleSpecialFunction1286); 

                    createLeafNode(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:705:1: ( (lv_parameters_2_0= RULE_STRING ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:706:1: (lv_parameters_2_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:706:1: (lv_parameters_2_0= RULE_STRING )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:707:3: lv_parameters_2_0= RULE_STRING
            {
            lv_parameters_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpecialFunction1303); 

            			createLeafNode(grammarAccess.getSpecialFunctionAccess().getParametersSTRINGTerminalRuleCall_2_0(), "parameters"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSpecialFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"parameters",
            	        		lv_parameters_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:729:2: ( ',' ( (lv_parameters_4_0= RULE_STRING ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:729:4: ',' ( (lv_parameters_4_0= RULE_STRING ) )
            	    {
            	    match(input,12,FOLLOW_12_in_ruleSpecialFunction1319); 

            	            createLeafNode(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:733:1: ( (lv_parameters_4_0= RULE_STRING ) )
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:734:1: (lv_parameters_4_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:734:1: (lv_parameters_4_0= RULE_STRING )
            	    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:735:3: lv_parameters_4_0= RULE_STRING
            	    {
            	    lv_parameters_4_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpecialFunction1336); 

            	    			createLeafNode(grammarAccess.getSpecialFunctionAccess().getParametersSTRINGTerminalRuleCall_3_1_0(), "parameters"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSpecialFunctionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"parameters",
            	    	        		lv_parameters_4_0, 
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
            	    break loop10;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleSpecialFunction1353); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:769:1: entryRuleBundlePromiseType returns [EObject current=null] : iv_ruleBundlePromiseType= ruleBundlePromiseType EOF ;
    public final EObject entryRuleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundlePromiseType = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:770:2: (iv_ruleBundlePromiseType= ruleBundlePromiseType EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:771:2: iv_ruleBundlePromiseType= ruleBundlePromiseType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundlePromiseTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType1389);
            iv_ruleBundlePromiseType=ruleBundlePromiseType();
            _fsp--;

             current =iv_ruleBundlePromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromiseType1399); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:778:1: ruleBundlePromiseType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBundlePromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:783:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:784:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:784:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:785:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:785:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:786:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundlePromiseType1440); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:816:1: entryRuleBodyPromiseType returns [EObject current=null] : iv_ruleBodyPromiseType= ruleBodyPromiseType EOF ;
    public final EObject entryRuleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyPromiseType = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:817:2: (iv_ruleBodyPromiseType= ruleBodyPromiseType EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:818:2: iv_ruleBodyPromiseType= ruleBodyPromiseType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyPromiseTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType1480);
            iv_ruleBodyPromiseType=ruleBodyPromiseType();
            _fsp--;

             current =iv_ruleBodyPromiseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyPromiseType1490); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:825:1: ruleBodyPromiseType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyPromiseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:830:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:831:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:831:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:832:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:832:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:833:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyPromiseType1531); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:863:1: entryRuleBundleComponent returns [EObject current=null] : iv_ruleBundleComponent= ruleBundleComponent EOF ;
    public final EObject entryRuleBundleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleComponent = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:864:2: (iv_ruleBundleComponent= ruleBundleComponent EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:865:2: iv_ruleBundleComponent= ruleBundleComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBundleComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent1571);
            iv_ruleBundleComponent=ruleBundleComponent();
            _fsp--;

             current =iv_ruleBundleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleComponent1581); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:872:1: ruleBundleComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBundleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:877:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:878:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:878:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:879:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:879:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:880:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundleComponent1622); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:910:1: entryRuleBodyComponent returns [EObject current=null] : iv_ruleBodyComponent= ruleBodyComponent EOF ;
    public final EObject entryRuleBodyComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyComponent = null;


        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:911:2: (iv_ruleBodyComponent= ruleBodyComponent EOF )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:912:2: iv_ruleBodyComponent= ruleBodyComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBodyComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent1662);
            iv_ruleBodyComponent=ruleBodyComponent();
            _fsp--;

             current =iv_ruleBodyComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent1672); 

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
    // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:919:1: ruleBodyComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBodyComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:924:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:925:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:925:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:926:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:926:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g:927:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyComponent1713); 

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
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleCfModel130 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_rulePLACEHOLDER_in_entryRulePLACEHOLDER167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePLACEHOLDER178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rulePLACEHOLDER218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePLACEHOLDER244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePLACEHOLDER270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rulePLACEHOLDER294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePLACEHOLDER313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePLACEHOLDER332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePLACEHOLDER351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePLACEHOLDER370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_ruleAbstractElement466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_rulePart557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rulePart584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBundle664 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_ruleBundle685 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle702 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBundle717 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_ruleBundle739 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBundle749 = new BitSet(new long[]{0x0000000000047C70L});
    public static final BitSet FOLLOW_rulePLACEHOLDER_in_ruleBundle759 = new BitSet(new long[]{0x0000000000047C70L});
    public static final BitSet FOLLOW_18_in_ruleBundle765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBody846 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_ruleBody867 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody884 = new BitSet(new long[]{0x0000000000017C70L});
    public static final BitSet FOLLOW_rulePLACEHOLDER_in_ruleBody899 = new BitSet(new long[]{0x0000000000017C70L});
    public static final BitSet FOLLOW_16_in_ruleBody903 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_ruleBody924 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_ruleBody935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyFunction981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_ruleBodyFunction1027 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleBodyFunction1037 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction1055 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_16_in_ruleBodyFunction1077 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction1094 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_12_in_ruleBodyFunction1110 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBodyFunction1127 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_18_in_ruleBodyFunction1144 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_ruleBodyFunction1172 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBodyFunction1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction1219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialFunction1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialFunction1271 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSpecialFunction1286 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpecialFunction1303 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleSpecialFunction1319 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpecialFunction1336 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleSpecialFunction1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromiseType1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundlePromiseType1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType1480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyPromiseType1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyPromiseType1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent1571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleComponent1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundleComponent1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent1662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyComponent1713 = new BitSet(new long[]{0x0000000000000002L});

}