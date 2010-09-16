package org.eclipse.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.services.CfeditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfeditorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "'=>'", "';'", "','", "'('", "')'", "'bundle'", "'{'", "'}'", "':'", "'body'"
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
    public String getGrammarFileName() { return "../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g"; }


     
     	private CfeditorGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CfeditorGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleCfModel
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:61:1: entryRuleCfModel : ruleCfModel EOF ;
    public final void entryRuleCfModel() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:62:1: ( ruleCfModel EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:63:1: ruleCfModel EOF
            {
             before(grammarAccess.getCfModelRule()); 
            pushFollow(FOLLOW_ruleCfModel_in_entryRuleCfModel61);
            ruleCfModel();
            _fsp--;

             after(grammarAccess.getCfModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCfModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCfModel


    // $ANTLR start ruleCfModel
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:70:1: ruleCfModel : ( ( rule__CfModel__ElementsAssignment )* ) ;
    public final void ruleCfModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:74:2: ( ( ( rule__CfModel__ElementsAssignment )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:75:1: ( ( rule__CfModel__ElementsAssignment )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:75:1: ( ( rule__CfModel__ElementsAssignment )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:76:1: ( rule__CfModel__ElementsAssignment )*
            {
             before(grammarAccess.getCfModelAccess().getElementsAssignment()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:77:1: ( rule__CfModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:77:2: rule__CfModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__CfModel__ElementsAssignment_in_ruleCfModel94);
            	    rule__CfModel__ElementsAssignment();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getCfModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCfModel


    // $ANTLR start entryRulePLACEHOLDER
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:89:1: entryRulePLACEHOLDER : rulePLACEHOLDER EOF ;
    public final void entryRulePLACEHOLDER() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:90:1: ( rulePLACEHOLDER EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:91:1: rulePLACEHOLDER EOF
            {
             before(grammarAccess.getPLACEHOLDERRule()); 
            pushFollow(FOLLOW_rulePLACEHOLDER_in_entryRulePLACEHOLDER122);
            rulePLACEHOLDER();
            _fsp--;

             after(grammarAccess.getPLACEHOLDERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePLACEHOLDER129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePLACEHOLDER


    // $ANTLR start rulePLACEHOLDER
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:98:1: rulePLACEHOLDER : ( ( rule__PLACEHOLDER__Alternatives ) ) ;
    public final void rulePLACEHOLDER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:102:2: ( ( ( rule__PLACEHOLDER__Alternatives ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:103:1: ( ( rule__PLACEHOLDER__Alternatives ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:103:1: ( ( rule__PLACEHOLDER__Alternatives ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:104:1: ( rule__PLACEHOLDER__Alternatives )
            {
             before(grammarAccess.getPLACEHOLDERAccess().getAlternatives()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:105:1: ( rule__PLACEHOLDER__Alternatives )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:105:2: rule__PLACEHOLDER__Alternatives
            {
            pushFollow(FOLLOW_rule__PLACEHOLDER__Alternatives_in_rulePLACEHOLDER155);
            rule__PLACEHOLDER__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPLACEHOLDERAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePLACEHOLDER


    // $ANTLR start entryRuleAbstractElement
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:117:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:118:1: ( ruleAbstractElement EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:119:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement182);
            ruleAbstractElement();
            _fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAbstractElement


    // $ANTLR start ruleAbstractElement
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:126:1: ruleAbstractElement : ( rulePart ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:130:2: ( ( rulePart ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:131:1: ( rulePart )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:131:1: ( rulePart )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:132:1: rulePart
            {
             before(grammarAccess.getAbstractElementAccess().getPartParserRuleCall()); 
            pushFollow(FOLLOW_rulePart_in_ruleAbstractElement215);
            rulePart();
            _fsp--;

             after(grammarAccess.getAbstractElementAccess().getPartParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAbstractElement


    // $ANTLR start entryRulePart
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:145:1: entryRulePart : rulePart EOF ;
    public final void entryRulePart() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:146:1: ( rulePart EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:147:1: rulePart EOF
            {
             before(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart241);
            rulePart();
            _fsp--;

             after(grammarAccess.getPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePart


    // $ANTLR start rulePart
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:154:1: rulePart : ( ( rule__Part__Alternatives ) ) ;
    public final void rulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:158:2: ( ( ( rule__Part__Alternatives ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:159:1: ( ( rule__Part__Alternatives ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:159:1: ( ( rule__Part__Alternatives ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:160:1: ( rule__Part__Alternatives )
            {
             before(grammarAccess.getPartAccess().getAlternatives()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:161:1: ( rule__Part__Alternatives )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:161:2: rule__Part__Alternatives
            {
            pushFollow(FOLLOW_rule__Part__Alternatives_in_rulePart274);
            rule__Part__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePart


    // $ANTLR start entryRuleBundle
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:173:1: entryRuleBundle : ruleBundle EOF ;
    public final void entryRuleBundle() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:174:1: ( ruleBundle EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:175:1: ruleBundle EOF
            {
             before(grammarAccess.getBundleRule()); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle301);
            ruleBundle();
            _fsp--;

             after(grammarAccess.getBundleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBundle


    // $ANTLR start ruleBundle
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:182:1: ruleBundle : ( ( rule__Bundle__Group__0 ) ) ;
    public final void ruleBundle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:186:2: ( ( ( rule__Bundle__Group__0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:187:1: ( ( rule__Bundle__Group__0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:187:1: ( ( rule__Bundle__Group__0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:188:1: ( rule__Bundle__Group__0 )
            {
             before(grammarAccess.getBundleAccess().getGroup()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:189:1: ( rule__Bundle__Group__0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:189:2: rule__Bundle__Group__0
            {
            pushFollow(FOLLOW_rule__Bundle__Group__0_in_ruleBundle334);
            rule__Bundle__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBundleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBundle


    // $ANTLR start entryRuleBody
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:201:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:202:1: ( ruleBody EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:203:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody361);
            ruleBody();
            _fsp--;

             after(grammarAccess.getBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBody


    // $ANTLR start ruleBody
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:210:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:214:2: ( ( ( rule__Body__Group__0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:215:1: ( ( rule__Body__Group__0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:215:1: ( ( rule__Body__Group__0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:216:1: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:217:1: ( rule__Body__Group__0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:217:2: rule__Body__Group__0
            {
            pushFollow(FOLLOW_rule__Body__Group__0_in_ruleBody394);
            rule__Body__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBody


    // $ANTLR start entryRuleBodyFunction
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:229:1: entryRuleBodyFunction : ruleBodyFunction EOF ;
    public final void entryRuleBodyFunction() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:230:1: ( ruleBodyFunction EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:231:1: ruleBodyFunction EOF
            {
             before(grammarAccess.getBodyFunctionRule()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction421);
            ruleBodyFunction();
            _fsp--;

             after(grammarAccess.getBodyFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyFunction428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBodyFunction


    // $ANTLR start ruleBodyFunction
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:238:1: ruleBodyFunction : ( ( rule__BodyFunction__Group__0 ) ) ;
    public final void ruleBodyFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:242:2: ( ( ( rule__BodyFunction__Group__0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:243:1: ( ( rule__BodyFunction__Group__0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:243:1: ( ( rule__BodyFunction__Group__0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:244:1: ( rule__BodyFunction__Group__0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getGroup()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:245:1: ( rule__BodyFunction__Group__0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:245:2: rule__BodyFunction__Group__0
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__0_in_ruleBodyFunction454);
            rule__BodyFunction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBodyFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBodyFunction


    // $ANTLR start entryRuleSpecialFunction
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:257:1: entryRuleSpecialFunction : ruleSpecialFunction EOF ;
    public final void entryRuleSpecialFunction() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:258:1: ( ruleSpecialFunction EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:259:1: ruleSpecialFunction EOF
            {
             before(grammarAccess.getSpecialFunctionRule()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction481);
            ruleSpecialFunction();
            _fsp--;

             after(grammarAccess.getSpecialFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialFunction488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSpecialFunction


    // $ANTLR start ruleSpecialFunction
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:266:1: ruleSpecialFunction : ( ( rule__SpecialFunction__Group__0 ) ) ;
    public final void ruleSpecialFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:270:2: ( ( ( rule__SpecialFunction__Group__0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:271:1: ( ( rule__SpecialFunction__Group__0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:271:1: ( ( rule__SpecialFunction__Group__0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:272:1: ( rule__SpecialFunction__Group__0 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getGroup()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:273:1: ( rule__SpecialFunction__Group__0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:273:2: rule__SpecialFunction__Group__0
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__0_in_ruleSpecialFunction514);
            rule__SpecialFunction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSpecialFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSpecialFunction


    // $ANTLR start entryRuleBundlePromiseType
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:285:1: entryRuleBundlePromiseType : ruleBundlePromiseType EOF ;
    public final void entryRuleBundlePromiseType() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:286:1: ( ruleBundlePromiseType EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:287:1: ruleBundlePromiseType EOF
            {
             before(grammarAccess.getBundlePromiseTypeRule()); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType541);
            ruleBundlePromiseType();
            _fsp--;

             after(grammarAccess.getBundlePromiseTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromiseType548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBundlePromiseType


    // $ANTLR start ruleBundlePromiseType
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:294:1: ruleBundlePromiseType : ( ( rule__BundlePromiseType__NameAssignment ) ) ;
    public final void ruleBundlePromiseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:298:2: ( ( ( rule__BundlePromiseType__NameAssignment ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:299:1: ( ( rule__BundlePromiseType__NameAssignment ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:299:1: ( ( rule__BundlePromiseType__NameAssignment ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:300:1: ( rule__BundlePromiseType__NameAssignment )
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getNameAssignment()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:301:1: ( rule__BundlePromiseType__NameAssignment )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:301:2: rule__BundlePromiseType__NameAssignment
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__NameAssignment_in_ruleBundlePromiseType574);
            rule__BundlePromiseType__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getBundlePromiseTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBundlePromiseType


    // $ANTLR start entryRuleBodyPromiseType
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:313:1: entryRuleBodyPromiseType : ruleBodyPromiseType EOF ;
    public final void entryRuleBodyPromiseType() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:314:1: ( ruleBodyPromiseType EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:315:1: ruleBodyPromiseType EOF
            {
             before(grammarAccess.getBodyPromiseTypeRule()); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType601);
            ruleBodyPromiseType();
            _fsp--;

             after(grammarAccess.getBodyPromiseTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyPromiseType608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBodyPromiseType


    // $ANTLR start ruleBodyPromiseType
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:322:1: ruleBodyPromiseType : ( ( rule__BodyPromiseType__NameAssignment ) ) ;
    public final void ruleBodyPromiseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:326:2: ( ( ( rule__BodyPromiseType__NameAssignment ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:327:1: ( ( rule__BodyPromiseType__NameAssignment ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:327:1: ( ( rule__BodyPromiseType__NameAssignment ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:328:1: ( rule__BodyPromiseType__NameAssignment )
            {
             before(grammarAccess.getBodyPromiseTypeAccess().getNameAssignment()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:329:1: ( rule__BodyPromiseType__NameAssignment )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:329:2: rule__BodyPromiseType__NameAssignment
            {
            pushFollow(FOLLOW_rule__BodyPromiseType__NameAssignment_in_ruleBodyPromiseType634);
            rule__BodyPromiseType__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getBodyPromiseTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBodyPromiseType


    // $ANTLR start entryRuleBundleComponent
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:341:1: entryRuleBundleComponent : ruleBundleComponent EOF ;
    public final void entryRuleBundleComponent() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:342:1: ( ruleBundleComponent EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:343:1: ruleBundleComponent EOF
            {
             before(grammarAccess.getBundleComponentRule()); 
            pushFollow(FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent661);
            ruleBundleComponent();
            _fsp--;

             after(grammarAccess.getBundleComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleComponent668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBundleComponent


    // $ANTLR start ruleBundleComponent
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:350:1: ruleBundleComponent : ( ( rule__BundleComponent__NameAssignment ) ) ;
    public final void ruleBundleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:354:2: ( ( ( rule__BundleComponent__NameAssignment ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:355:1: ( ( rule__BundleComponent__NameAssignment ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:355:1: ( ( rule__BundleComponent__NameAssignment ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:356:1: ( rule__BundleComponent__NameAssignment )
            {
             before(grammarAccess.getBundleComponentAccess().getNameAssignment()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:357:1: ( rule__BundleComponent__NameAssignment )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:357:2: rule__BundleComponent__NameAssignment
            {
            pushFollow(FOLLOW_rule__BundleComponent__NameAssignment_in_ruleBundleComponent694);
            rule__BundleComponent__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getBundleComponentAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBundleComponent


    // $ANTLR start entryRuleBodyComponent
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:369:1: entryRuleBodyComponent : ruleBodyComponent EOF ;
    public final void entryRuleBodyComponent() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:370:1: ( ruleBodyComponent EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:371:1: ruleBodyComponent EOF
            {
             before(grammarAccess.getBodyComponentRule()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent721);
            ruleBodyComponent();
            _fsp--;

             after(grammarAccess.getBodyComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBodyComponent


    // $ANTLR start ruleBodyComponent
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:378:1: ruleBodyComponent : ( ( rule__BodyComponent__NameAssignment ) ) ;
    public final void ruleBodyComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:382:2: ( ( ( rule__BodyComponent__NameAssignment ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:383:1: ( ( rule__BodyComponent__NameAssignment ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:383:1: ( ( rule__BodyComponent__NameAssignment ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:384:1: ( rule__BodyComponent__NameAssignment )
            {
             before(grammarAccess.getBodyComponentAccess().getNameAssignment()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:385:1: ( rule__BodyComponent__NameAssignment )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:385:2: rule__BodyComponent__NameAssignment
            {
            pushFollow(FOLLOW_rule__BodyComponent__NameAssignment_in_ruleBodyComponent754);
            rule__BodyComponent__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getBodyComponentAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBodyComponent


    // $ANTLR start rule__PLACEHOLDER__Alternatives
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:397:1: rule__PLACEHOLDER__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( '=>' ) | ( ';' ) | ( ',' ) | ( '(' ) | ( ')' ) );
    public final void rule__PLACEHOLDER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:401:1: ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( '=>' ) | ( ';' ) | ( ',' ) | ( '(' ) | ( ')' ) )
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
                    new NoViableAltException("397:1: rule__PLACEHOLDER__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( '=>' ) | ( ';' ) | ( ',' ) | ( '(' ) | ( ')' ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:402:1: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:402:1: ( RULE_ANY_OTHER )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:403:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getPLACEHOLDERAccess().getANY_OTHERTerminalRuleCall_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__PLACEHOLDER__Alternatives790); 
                     after(grammarAccess.getPLACEHOLDERAccess().getANY_OTHERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:408:6: ( RULE_ID )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:408:6: ( RULE_ID )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:409:1: RULE_ID
                    {
                     before(grammarAccess.getPLACEHOLDERAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PLACEHOLDER__Alternatives807); 
                     after(grammarAccess.getPLACEHOLDERAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:414:6: ( RULE_STRING )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:414:6: ( RULE_STRING )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:415:1: RULE_STRING
                    {
                     before(grammarAccess.getPLACEHOLDERAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PLACEHOLDER__Alternatives824); 
                     after(grammarAccess.getPLACEHOLDERAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:420:6: ( '=>' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:420:6: ( '=>' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:421:1: '=>'
                    {
                     before(grammarAccess.getPLACEHOLDERAccess().getEqualsSignGreaterThanSignKeyword_3()); 
                    match(input,10,FOLLOW_10_in_rule__PLACEHOLDER__Alternatives842); 
                     after(grammarAccess.getPLACEHOLDERAccess().getEqualsSignGreaterThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:428:6: ( ';' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:428:6: ( ';' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:429:1: ';'
                    {
                     before(grammarAccess.getPLACEHOLDERAccess().getSemicolonKeyword_4()); 
                    match(input,11,FOLLOW_11_in_rule__PLACEHOLDER__Alternatives862); 
                     after(grammarAccess.getPLACEHOLDERAccess().getSemicolonKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:436:6: ( ',' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:436:6: ( ',' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:437:1: ','
                    {
                     before(grammarAccess.getPLACEHOLDERAccess().getCommaKeyword_5()); 
                    match(input,12,FOLLOW_12_in_rule__PLACEHOLDER__Alternatives882); 
                     after(grammarAccess.getPLACEHOLDERAccess().getCommaKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:444:6: ( '(' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:444:6: ( '(' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:445:1: '('
                    {
                     before(grammarAccess.getPLACEHOLDERAccess().getLeftParenthesisKeyword_6()); 
                    match(input,13,FOLLOW_13_in_rule__PLACEHOLDER__Alternatives902); 
                     after(grammarAccess.getPLACEHOLDERAccess().getLeftParenthesisKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:452:6: ( ')' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:452:6: ( ')' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:453:1: ')'
                    {
                     before(grammarAccess.getPLACEHOLDERAccess().getRightParenthesisKeyword_7()); 
                    match(input,14,FOLLOW_14_in_rule__PLACEHOLDER__Alternatives922); 
                     after(grammarAccess.getPLACEHOLDERAccess().getRightParenthesisKeyword_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PLACEHOLDER__Alternatives


    // $ANTLR start rule__Part__Alternatives
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:465:1: rule__Part__Alternatives : ( ( ruleBundle ) | ( ruleBody ) );
    public final void rule__Part__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:469:1: ( ( ruleBundle ) | ( ruleBody ) )
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
                    new NoViableAltException("465:1: rule__Part__Alternatives : ( ( ruleBundle ) | ( ruleBody ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:470:1: ( ruleBundle )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:470:1: ( ruleBundle )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:471:1: ruleBundle
                    {
                     before(grammarAccess.getPartAccess().getBundleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBundle_in_rule__Part__Alternatives956);
                    ruleBundle();
                    _fsp--;

                     after(grammarAccess.getPartAccess().getBundleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:476:6: ( ruleBody )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:476:6: ( ruleBody )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:477:1: ruleBody
                    {
                     before(grammarAccess.getPartAccess().getBodyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBody_in_rule__Part__Alternatives973);
                    ruleBody();
                    _fsp--;

                     after(grammarAccess.getPartAccess().getBodyParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Part__Alternatives


    // $ANTLR start rule__BodyFunction__Alternatives_2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:487:1: rule__BodyFunction__Alternatives_2 : ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) );
    public final void rule__BodyFunction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:491:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("487:1: rule__BodyFunction__Alternatives_2 : ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:492:1: ( ( rule__BodyFunction__ValuesAssignment_2_0 ) )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:492:1: ( ( rule__BodyFunction__ValuesAssignment_2_0 ) )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:493:1: ( rule__BodyFunction__ValuesAssignment_2_0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0()); 
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:494:1: ( rule__BodyFunction__ValuesAssignment_2_0 )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:494:2: rule__BodyFunction__ValuesAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_0_in_rule__BodyFunction__Alternatives_21005);
                    rule__BodyFunction__ValuesAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:498:6: ( ( rule__BodyFunction__Group_2_1__0 ) )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:498:6: ( ( rule__BodyFunction__Group_2_1__0 ) )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:499:1: ( rule__BodyFunction__Group_2_1__0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getGroup_2_1()); 
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:500:1: ( rule__BodyFunction__Group_2_1__0 )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:500:2: rule__BodyFunction__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__0_in_rule__BodyFunction__Alternatives_21023);
                    rule__BodyFunction__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:504:6: ( ( rule__BodyFunction__FunctionAssignment_2_2 ) )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:504:6: ( ( rule__BodyFunction__FunctionAssignment_2_2 ) )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:505:1: ( rule__BodyFunction__FunctionAssignment_2_2 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2()); 
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:506:1: ( rule__BodyFunction__FunctionAssignment_2_2 )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:506:2: rule__BodyFunction__FunctionAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__FunctionAssignment_2_2_in_rule__BodyFunction__Alternatives_21041);
                    rule__BodyFunction__FunctionAssignment_2_2();
                    _fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Alternatives_2


    // $ANTLR start rule__Bundle__Group__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:517:1: rule__Bundle__Group__0 : rule__Bundle__Group__0__Impl rule__Bundle__Group__1 ;
    public final void rule__Bundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:521:1: ( rule__Bundle__Group__0__Impl rule__Bundle__Group__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:522:2: rule__Bundle__Group__0__Impl rule__Bundle__Group__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group__0__Impl_in_rule__Bundle__Group__01072);
            rule__Bundle__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__1_in_rule__Bundle__Group__01075);
            rule__Bundle__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group__0


    // $ANTLR start rule__Bundle__Group__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:529:1: rule__Bundle__Group__0__Impl : ( 'bundle' ) ;
    public final void rule__Bundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:533:1: ( ( 'bundle' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:534:1: ( 'bundle' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:534:1: ( 'bundle' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:535:1: 'bundle'
            {
             before(grammarAccess.getBundleAccess().getBundleKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Bundle__Group__0__Impl1103); 
             after(grammarAccess.getBundleAccess().getBundleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group__0__Impl


    // $ANTLR start rule__Bundle__Group__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:548:1: rule__Bundle__Group__1 : rule__Bundle__Group__1__Impl rule__Bundle__Group__2 ;
    public final void rule__Bundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:552:1: ( rule__Bundle__Group__1__Impl rule__Bundle__Group__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:553:2: rule__Bundle__Group__1__Impl rule__Bundle__Group__2
            {
            pushFollow(FOLLOW_rule__Bundle__Group__1__Impl_in_rule__Bundle__Group__11134);
            rule__Bundle__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__2_in_rule__Bundle__Group__11137);
            rule__Bundle__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group__1


    // $ANTLR start rule__Bundle__Group__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:560:1: rule__Bundle__Group__1__Impl : ( ( rule__Bundle__ComponentAssignment_1 ) ) ;
    public final void rule__Bundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:564:1: ( ( ( rule__Bundle__ComponentAssignment_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:565:1: ( ( rule__Bundle__ComponentAssignment_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:565:1: ( ( rule__Bundle__ComponentAssignment_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:566:1: ( rule__Bundle__ComponentAssignment_1 )
            {
             before(grammarAccess.getBundleAccess().getComponentAssignment_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:567:1: ( rule__Bundle__ComponentAssignment_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:567:2: rule__Bundle__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Bundle__ComponentAssignment_1_in_rule__Bundle__Group__1__Impl1164);
            rule__Bundle__ComponentAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBundleAccess().getComponentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group__1__Impl


    // $ANTLR start rule__Bundle__Group__2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:577:1: rule__Bundle__Group__2 : rule__Bundle__Group__2__Impl rule__Bundle__Group__3 ;
    public final void rule__Bundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:581:1: ( rule__Bundle__Group__2__Impl rule__Bundle__Group__3 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:582:2: rule__Bundle__Group__2__Impl rule__Bundle__Group__3
            {
            pushFollow(FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__21194);
            rule__Bundle__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__21197);
            rule__Bundle__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group__2


    // $ANTLR start rule__Bundle__Group__2__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:589:1: rule__Bundle__Group__2__Impl : ( ( rule__Bundle__NameAssignment_2 ) ) ;
    public final void rule__Bundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:593:1: ( ( ( rule__Bundle__NameAssignment_2 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:594:1: ( ( rule__Bundle__NameAssignment_2 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:594:1: ( ( rule__Bundle__NameAssignment_2 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:595:1: ( rule__Bundle__NameAssignment_2 )
            {
             before(grammarAccess.getBundleAccess().getNameAssignment_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:596:1: ( rule__Bundle__NameAssignment_2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:596:2: rule__Bundle__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl1224);
            rule__Bundle__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBundleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group__2__Impl


    // $ANTLR start rule__Bundle__Group__3
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:606:1: rule__Bundle__Group__3 : rule__Bundle__Group__3__Impl rule__Bundle__Group__4 ;
    public final void rule__Bundle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:610:1: ( rule__Bundle__Group__3__Impl rule__Bundle__Group__4 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:611:2: rule__Bundle__Group__3__Impl rule__Bundle__Group__4
            {
            pushFollow(FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__31254);
            rule__Bundle__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__31257);
            rule__Bundle__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group__3


    // $ANTLR start rule__Bundle__Group__3__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:618:1: rule__Bundle__Group__3__Impl : ( '{' ) ;
    public final void rule__Bundle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:622:1: ( ( '{' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:623:1: ( '{' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:623:1: ( '{' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:624:1: '{'
            {
             before(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Bundle__Group__3__Impl1285); 
             after(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group__3__Impl


    // $ANTLR start rule__Bundle__Group__4
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:637:1: rule__Bundle__Group__4 : rule__Bundle__Group__4__Impl rule__Bundle__Group__5 ;
    public final void rule__Bundle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:641:1: ( rule__Bundle__Group__4__Impl rule__Bundle__Group__5 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:642:2: rule__Bundle__Group__4__Impl rule__Bundle__Group__5
            {
            pushFollow(FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__41316);
            rule__Bundle__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__41319);
            rule__Bundle__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group__4


    // $ANTLR start rule__Bundle__Group__4__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:649:1: rule__Bundle__Group__4__Impl : ( ( rule__Bundle__Group_4__0 )* ) ;
    public final void rule__Bundle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:653:1: ( ( ( rule__Bundle__Group_4__0 )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:654:1: ( ( rule__Bundle__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:654:1: ( ( rule__Bundle__Group_4__0 )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:655:1: ( rule__Bundle__Group_4__0 )*
            {
             before(grammarAccess.getBundleAccess().getGroup_4()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:656:1: ( rule__Bundle__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:656:2: rule__Bundle__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Bundle__Group_4__0_in_rule__Bundle__Group__4__Impl1346);
            	    rule__Bundle__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getBundleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group__4__Impl


    // $ANTLR start rule__Bundle__Group__5
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:666:1: rule__Bundle__Group__5 : rule__Bundle__Group__5__Impl ;
    public final void rule__Bundle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:670:1: ( rule__Bundle__Group__5__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:671:2: rule__Bundle__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__51377);
            rule__Bundle__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group__5


    // $ANTLR start rule__Bundle__Group__5__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:677:1: rule__Bundle__Group__5__Impl : ( '}' ) ;
    public final void rule__Bundle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:681:1: ( ( '}' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:682:1: ( '}' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:682:1: ( '}' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:683:1: '}'
            {
             before(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Bundle__Group__5__Impl1405); 
             after(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group__5__Impl


    // $ANTLR start rule__Bundle__Group_4__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:708:1: rule__Bundle__Group_4__0 : rule__Bundle__Group_4__0__Impl rule__Bundle__Group_4__1 ;
    public final void rule__Bundle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:712:1: ( rule__Bundle__Group_4__0__Impl rule__Bundle__Group_4__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:713:2: rule__Bundle__Group_4__0__Impl rule__Bundle__Group_4__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group_4__0__Impl_in_rule__Bundle__Group_4__01448);
            rule__Bundle__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_4__1_in_rule__Bundle__Group_4__01451);
            rule__Bundle__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group_4__0


    // $ANTLR start rule__Bundle__Group_4__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:720:1: rule__Bundle__Group_4__0__Impl : ( ( rule__Bundle__PromiseTypeAssignment_4_0 ) ) ;
    public final void rule__Bundle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:724:1: ( ( ( rule__Bundle__PromiseTypeAssignment_4_0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:725:1: ( ( rule__Bundle__PromiseTypeAssignment_4_0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:725:1: ( ( rule__Bundle__PromiseTypeAssignment_4_0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:726:1: ( rule__Bundle__PromiseTypeAssignment_4_0 )
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeAssignment_4_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:727:1: ( rule__Bundle__PromiseTypeAssignment_4_0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:727:2: rule__Bundle__PromiseTypeAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Bundle__PromiseTypeAssignment_4_0_in_rule__Bundle__Group_4__0__Impl1478);
            rule__Bundle__PromiseTypeAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getBundleAccess().getPromiseTypeAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group_4__0__Impl


    // $ANTLR start rule__Bundle__Group_4__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:737:1: rule__Bundle__Group_4__1 : rule__Bundle__Group_4__1__Impl rule__Bundle__Group_4__2 ;
    public final void rule__Bundle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:741:1: ( rule__Bundle__Group_4__1__Impl rule__Bundle__Group_4__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:742:2: rule__Bundle__Group_4__1__Impl rule__Bundle__Group_4__2
            {
            pushFollow(FOLLOW_rule__Bundle__Group_4__1__Impl_in_rule__Bundle__Group_4__11508);
            rule__Bundle__Group_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_4__2_in_rule__Bundle__Group_4__11511);
            rule__Bundle__Group_4__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group_4__1


    // $ANTLR start rule__Bundle__Group_4__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:749:1: rule__Bundle__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Bundle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:753:1: ( ( ':' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:754:1: ( ':' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:754:1: ( ':' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:755:1: ':'
            {
             before(grammarAccess.getBundleAccess().getColonKeyword_4_1()); 
            match(input,18,FOLLOW_18_in_rule__Bundle__Group_4__1__Impl1539); 
             after(grammarAccess.getBundleAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group_4__1__Impl


    // $ANTLR start rule__Bundle__Group_4__2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:768:1: rule__Bundle__Group_4__2 : rule__Bundle__Group_4__2__Impl ;
    public final void rule__Bundle__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:772:1: ( rule__Bundle__Group_4__2__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:773:2: rule__Bundle__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group_4__2__Impl_in_rule__Bundle__Group_4__21570);
            rule__Bundle__Group_4__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group_4__2


    // $ANTLR start rule__Bundle__Group_4__2__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:779:1: rule__Bundle__Group_4__2__Impl : ( ( rulePLACEHOLDER )* ) ;
    public final void rule__Bundle__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:783:1: ( ( ( rulePLACEHOLDER )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:784:1: ( ( rulePLACEHOLDER )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:784:1: ( ( rulePLACEHOLDER )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:785:1: ( rulePLACEHOLDER )*
            {
             before(grammarAccess.getBundleAccess().getPLACEHOLDERParserRuleCall_4_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:786:1: ( rulePLACEHOLDER )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    int LA6_2 = input.LA(2);

                    if ( ((LA6_2>=RULE_ANY_OTHER && LA6_2<=RULE_STRING)||(LA6_2>=10 && LA6_2<=14)||LA6_2==17) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==RULE_ANY_OTHER||LA6_0==RULE_STRING||(LA6_0>=10 && LA6_0<=14)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:786:3: rulePLACEHOLDER
            	    {
            	    pushFollow(FOLLOW_rulePLACEHOLDER_in_rule__Bundle__Group_4__2__Impl1598);
            	    rulePLACEHOLDER();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getBundleAccess().getPLACEHOLDERParserRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group_4__2__Impl


    // $ANTLR start rule__Body__Group__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:802:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:806:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:807:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__01635);
            rule__Body__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__01638);
            rule__Body__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__Group__0


    // $ANTLR start rule__Body__Group__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:814:1: rule__Body__Group__0__Impl : ( 'body' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:818:1: ( ( 'body' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:819:1: ( 'body' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:819:1: ( 'body' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:820:1: 'body'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Body__Group__0__Impl1666); 
             after(grammarAccess.getBodyAccess().getBodyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__Group__0__Impl


    // $ANTLR start rule__Body__Group__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:833:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:837:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:838:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__11697);
            rule__Body__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__11700);
            rule__Body__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__Group__1


    // $ANTLR start rule__Body__Group__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:845:1: rule__Body__Group__1__Impl : ( ( rule__Body__ComponentAssignment_1 ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:849:1: ( ( ( rule__Body__ComponentAssignment_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:850:1: ( ( rule__Body__ComponentAssignment_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:850:1: ( ( rule__Body__ComponentAssignment_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:851:1: ( rule__Body__ComponentAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getComponentAssignment_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:852:1: ( rule__Body__ComponentAssignment_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:852:2: rule__Body__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl1727);
            rule__Body__ComponentAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBodyAccess().getComponentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__Group__1__Impl


    // $ANTLR start rule__Body__Group__2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:862:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:866:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:867:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__21757);
            rule__Body__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__3_in_rule__Body__Group__21760);
            rule__Body__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__Group__2


    // $ANTLR start rule__Body__Group__2__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:874:1: rule__Body__Group__2__Impl : ( ( rule__Body__NameAssignment_2 ) ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:878:1: ( ( ( rule__Body__NameAssignment_2 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:879:1: ( ( rule__Body__NameAssignment_2 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:879:1: ( ( rule__Body__NameAssignment_2 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:880:1: ( rule__Body__NameAssignment_2 )
            {
             before(grammarAccess.getBodyAccess().getNameAssignment_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:881:1: ( rule__Body__NameAssignment_2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:881:2: rule__Body__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Body__NameAssignment_2_in_rule__Body__Group__2__Impl1787);
            rule__Body__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBodyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__Group__2__Impl


    // $ANTLR start rule__Body__Group__3
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:891:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:895:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:896:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__31817);
            rule__Body__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__4_in_rule__Body__Group__31820);
            rule__Body__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__Group__3


    // $ANTLR start rule__Body__Group__3__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:903:1: rule__Body__Group__3__Impl : ( ( rulePLACEHOLDER )* ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:907:1: ( ( ( rulePLACEHOLDER )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:908:1: ( ( rulePLACEHOLDER )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:908:1: ( ( rulePLACEHOLDER )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:909:1: ( rulePLACEHOLDER )*
            {
             before(grammarAccess.getBodyAccess().getPLACEHOLDERParserRuleCall_3()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:910:1: ( rulePLACEHOLDER )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ANY_OTHER && LA7_0<=RULE_STRING)||(LA7_0>=10 && LA7_0<=14)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:910:3: rulePLACEHOLDER
            	    {
            	    pushFollow(FOLLOW_rulePLACEHOLDER_in_rule__Body__Group__3__Impl1848);
            	    rulePLACEHOLDER();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getPLACEHOLDERParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__Group__3__Impl


    // $ANTLR start rule__Body__Group__4
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:920:1: rule__Body__Group__4 : rule__Body__Group__4__Impl rule__Body__Group__5 ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:924:1: ( rule__Body__Group__4__Impl rule__Body__Group__5 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:925:2: rule__Body__Group__4__Impl rule__Body__Group__5
            {
            pushFollow(FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__41879);
            rule__Body__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__5_in_rule__Body__Group__41882);
            rule__Body__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__Group__4


    // $ANTLR start rule__Body__Group__4__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:932:1: rule__Body__Group__4__Impl : ( '{' ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:936:1: ( ( '{' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:937:1: ( '{' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:937:1: ( '{' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:938:1: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Body__Group__4__Impl1910); 
             after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__Group__4__Impl


    // $ANTLR start rule__Body__Group__5
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:951:1: rule__Body__Group__5 : rule__Body__Group__5__Impl rule__Body__Group__6 ;
    public final void rule__Body__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:955:1: ( rule__Body__Group__5__Impl rule__Body__Group__6 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:956:2: rule__Body__Group__5__Impl rule__Body__Group__6
            {
            pushFollow(FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__51941);
            rule__Body__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__6_in_rule__Body__Group__51944);
            rule__Body__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__Group__5


    // $ANTLR start rule__Body__Group__5__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:963:1: rule__Body__Group__5__Impl : ( ( rule__Body__PromiseTypeAssignment_5 )* ) ;
    public final void rule__Body__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:967:1: ( ( ( rule__Body__PromiseTypeAssignment_5 )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:968:1: ( ( rule__Body__PromiseTypeAssignment_5 )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:968:1: ( ( rule__Body__PromiseTypeAssignment_5 )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:969:1: ( rule__Body__PromiseTypeAssignment_5 )*
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeAssignment_5()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:970:1: ( rule__Body__PromiseTypeAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:970:2: rule__Body__PromiseTypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Body__PromiseTypeAssignment_5_in_rule__Body__Group__5__Impl1971);
            	    rule__Body__PromiseTypeAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getPromiseTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__Group__5__Impl


    // $ANTLR start rule__Body__Group__6
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:980:1: rule__Body__Group__6 : rule__Body__Group__6__Impl ;
    public final void rule__Body__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:984:1: ( rule__Body__Group__6__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:985:2: rule__Body__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__6__Impl_in_rule__Body__Group__62002);
            rule__Body__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__Group__6


    // $ANTLR start rule__Body__Group__6__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:991:1: rule__Body__Group__6__Impl : ( '}' ) ;
    public final void rule__Body__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:995:1: ( ( '}' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:996:1: ( '}' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:996:1: ( '}' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:997:1: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Body__Group__6__Impl2030); 
             after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__Group__6__Impl


    // $ANTLR start rule__BodyFunction__Group__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1024:1: rule__BodyFunction__Group__0 : rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1 ;
    public final void rule__BodyFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1028:1: ( rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1029:2: rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__0__Impl_in_rule__BodyFunction__Group__02075);
            rule__BodyFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__1_in_rule__BodyFunction__Group__02078);
            rule__BodyFunction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group__0


    // $ANTLR start rule__BodyFunction__Group__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1036:1: rule__BodyFunction__Group__0__Impl : ( ( rule__BodyFunction__NameAssignment_0 ) ) ;
    public final void rule__BodyFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1040:1: ( ( ( rule__BodyFunction__NameAssignment_0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1041:1: ( ( rule__BodyFunction__NameAssignment_0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1041:1: ( ( rule__BodyFunction__NameAssignment_0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1042:1: ( rule__BodyFunction__NameAssignment_0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getNameAssignment_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1043:1: ( rule__BodyFunction__NameAssignment_0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1043:2: rule__BodyFunction__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BodyFunction__NameAssignment_0_in_rule__BodyFunction__Group__0__Impl2105);
            rule__BodyFunction__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBodyFunctionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group__0__Impl


    // $ANTLR start rule__BodyFunction__Group__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1053:1: rule__BodyFunction__Group__1 : rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2 ;
    public final void rule__BodyFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1057:1: ( rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1058:2: rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__1__Impl_in_rule__BodyFunction__Group__12135);
            rule__BodyFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__2_in_rule__BodyFunction__Group__12138);
            rule__BodyFunction__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group__1


    // $ANTLR start rule__BodyFunction__Group__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1065:1: rule__BodyFunction__Group__1__Impl : ( '=>' ) ;
    public final void rule__BodyFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1069:1: ( ( '=>' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1070:1: ( '=>' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1070:1: ( '=>' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1071:1: '=>'
            {
             before(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,10,FOLLOW_10_in_rule__BodyFunction__Group__1__Impl2166); 
             after(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group__1__Impl


    // $ANTLR start rule__BodyFunction__Group__2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1084:1: rule__BodyFunction__Group__2 : rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3 ;
    public final void rule__BodyFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1088:1: ( rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1089:2: rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__2__Impl_in_rule__BodyFunction__Group__22197);
            rule__BodyFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__3_in_rule__BodyFunction__Group__22200);
            rule__BodyFunction__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group__2


    // $ANTLR start rule__BodyFunction__Group__2__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1096:1: rule__BodyFunction__Group__2__Impl : ( ( rule__BodyFunction__Alternatives_2 ) ) ;
    public final void rule__BodyFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1100:1: ( ( ( rule__BodyFunction__Alternatives_2 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1101:1: ( ( rule__BodyFunction__Alternatives_2 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1101:1: ( ( rule__BodyFunction__Alternatives_2 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1102:1: ( rule__BodyFunction__Alternatives_2 )
            {
             before(grammarAccess.getBodyFunctionAccess().getAlternatives_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1103:1: ( rule__BodyFunction__Alternatives_2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1103:2: rule__BodyFunction__Alternatives_2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Alternatives_2_in_rule__BodyFunction__Group__2__Impl2227);
            rule__BodyFunction__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getBodyFunctionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group__2__Impl


    // $ANTLR start rule__BodyFunction__Group__3
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1113:1: rule__BodyFunction__Group__3 : rule__BodyFunction__Group__3__Impl ;
    public final void rule__BodyFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1117:1: ( rule__BodyFunction__Group__3__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1118:2: rule__BodyFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__3__Impl_in_rule__BodyFunction__Group__32257);
            rule__BodyFunction__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group__3


    // $ANTLR start rule__BodyFunction__Group__3__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1124:1: rule__BodyFunction__Group__3__Impl : ( ';' ) ;
    public final void rule__BodyFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1128:1: ( ( ';' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1129:1: ( ';' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1129:1: ( ';' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1130:1: ';'
            {
             before(grammarAccess.getBodyFunctionAccess().getSemicolonKeyword_3()); 
            match(input,11,FOLLOW_11_in_rule__BodyFunction__Group__3__Impl2285); 
             after(grammarAccess.getBodyFunctionAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group__3__Impl


    // $ANTLR start rule__BodyFunction__Group_2_1__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1151:1: rule__BodyFunction__Group_2_1__0 : rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1 ;
    public final void rule__BodyFunction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1155:1: ( rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1156:2: rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__0__Impl_in_rule__BodyFunction__Group_2_1__02324);
            rule__BodyFunction__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__1_in_rule__BodyFunction__Group_2_1__02327);
            rule__BodyFunction__Group_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group_2_1__0


    // $ANTLR start rule__BodyFunction__Group_2_1__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1163:1: rule__BodyFunction__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__BodyFunction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1167:1: ( ( '{' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1168:1: ( '{' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1168:1: ( '{' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1169:1: '{'
            {
             before(grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,16,FOLLOW_16_in_rule__BodyFunction__Group_2_1__0__Impl2355); 
             after(grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group_2_1__0__Impl


    // $ANTLR start rule__BodyFunction__Group_2_1__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1182:1: rule__BodyFunction__Group_2_1__1 : rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2 ;
    public final void rule__BodyFunction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1186:1: ( rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1187:2: rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__1__Impl_in_rule__BodyFunction__Group_2_1__12386);
            rule__BodyFunction__Group_2_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__2_in_rule__BodyFunction__Group_2_1__12389);
            rule__BodyFunction__Group_2_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group_2_1__1


    // $ANTLR start rule__BodyFunction__Group_2_1__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1194:1: rule__BodyFunction__Group_2_1__1__Impl : ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__BodyFunction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1198:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1199:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1199:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1200:1: ( rule__BodyFunction__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1201:1: ( rule__BodyFunction__ValuesAssignment_2_1_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1201:2: rule__BodyFunction__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_1_in_rule__BodyFunction__Group_2_1__1__Impl2416);
            rule__BodyFunction__ValuesAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group_2_1__1__Impl


    // $ANTLR start rule__BodyFunction__Group_2_1__2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1211:1: rule__BodyFunction__Group_2_1__2 : rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3 ;
    public final void rule__BodyFunction__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1215:1: ( rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1216:2: rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__2__Impl_in_rule__BodyFunction__Group_2_1__22446);
            rule__BodyFunction__Group_2_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__3_in_rule__BodyFunction__Group_2_1__22449);
            rule__BodyFunction__Group_2_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group_2_1__2


    // $ANTLR start rule__BodyFunction__Group_2_1__2__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1223:1: rule__BodyFunction__Group_2_1__2__Impl : ( ( rule__BodyFunction__Group_2_1_2__0 )* ) ;
    public final void rule__BodyFunction__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1227:1: ( ( ( rule__BodyFunction__Group_2_1_2__0 )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1228:1: ( ( rule__BodyFunction__Group_2_1_2__0 )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1228:1: ( ( rule__BodyFunction__Group_2_1_2__0 )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1229:1: ( rule__BodyFunction__Group_2_1_2__0 )*
            {
             before(grammarAccess.getBodyFunctionAccess().getGroup_2_1_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1230:1: ( rule__BodyFunction__Group_2_1_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1230:2: rule__BodyFunction__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__0_in_rule__BodyFunction__Group_2_1__2__Impl2476);
            	    rule__BodyFunction__Group_2_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getBodyFunctionAccess().getGroup_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group_2_1__2__Impl


    // $ANTLR start rule__BodyFunction__Group_2_1__3
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1240:1: rule__BodyFunction__Group_2_1__3 : rule__BodyFunction__Group_2_1__3__Impl ;
    public final void rule__BodyFunction__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1244:1: ( rule__BodyFunction__Group_2_1__3__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1245:2: rule__BodyFunction__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__3__Impl_in_rule__BodyFunction__Group_2_1__32507);
            rule__BodyFunction__Group_2_1__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group_2_1__3


    // $ANTLR start rule__BodyFunction__Group_2_1__3__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1251:1: rule__BodyFunction__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__BodyFunction__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1255:1: ( ( '}' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1256:1: ( '}' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1256:1: ( '}' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1257:1: '}'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,17,FOLLOW_17_in_rule__BodyFunction__Group_2_1__3__Impl2535); 
             after(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group_2_1__3__Impl


    // $ANTLR start rule__BodyFunction__Group_2_1_2__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1278:1: rule__BodyFunction__Group_2_1_2__0 : rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1 ;
    public final void rule__BodyFunction__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1282:1: ( rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1283:2: rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__0__Impl_in_rule__BodyFunction__Group_2_1_2__02574);
            rule__BodyFunction__Group_2_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__1_in_rule__BodyFunction__Group_2_1_2__02577);
            rule__BodyFunction__Group_2_1_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group_2_1_2__0


    // $ANTLR start rule__BodyFunction__Group_2_1_2__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1290:1: rule__BodyFunction__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__BodyFunction__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1294:1: ( ( ',' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1295:1: ( ',' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1295:1: ( ',' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1296:1: ','
            {
             before(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0()); 
            match(input,12,FOLLOW_12_in_rule__BodyFunction__Group_2_1_2__0__Impl2605); 
             after(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group_2_1_2__0__Impl


    // $ANTLR start rule__BodyFunction__Group_2_1_2__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1309:1: rule__BodyFunction__Group_2_1_2__1 : rule__BodyFunction__Group_2_1_2__1__Impl ;
    public final void rule__BodyFunction__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1313:1: ( rule__BodyFunction__Group_2_1_2__1__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1314:2: rule__BodyFunction__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__1__Impl_in_rule__BodyFunction__Group_2_1_2__12636);
            rule__BodyFunction__Group_2_1_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group_2_1_2__1


    // $ANTLR start rule__BodyFunction__Group_2_1_2__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1320:1: rule__BodyFunction__Group_2_1_2__1__Impl : ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) ) ;
    public final void rule__BodyFunction__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1324:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1325:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1325:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1326:1: ( rule__BodyFunction__ValuesAssignment_2_1_2_1 )
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_2_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1327:1: ( rule__BodyFunction__ValuesAssignment_2_1_2_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1327:2: rule__BodyFunction__ValuesAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_2_1_in_rule__BodyFunction__Group_2_1_2__1__Impl2663);
            rule__BodyFunction__ValuesAssignment_2_1_2_1();
            _fsp--;


            }

             after(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__Group_2_1_2__1__Impl


    // $ANTLR start rule__SpecialFunction__Group__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1341:1: rule__SpecialFunction__Group__0 : rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1 ;
    public final void rule__SpecialFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1345:1: ( rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1346:2: rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__0__Impl_in_rule__SpecialFunction__Group__02697);
            rule__SpecialFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__1_in_rule__SpecialFunction__Group__02700);
            rule__SpecialFunction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group__0


    // $ANTLR start rule__SpecialFunction__Group__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1353:1: rule__SpecialFunction__Group__0__Impl : ( ( rule__SpecialFunction__NameAssignment_0 ) ) ;
    public final void rule__SpecialFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1357:1: ( ( ( rule__SpecialFunction__NameAssignment_0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1358:1: ( ( rule__SpecialFunction__NameAssignment_0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1358:1: ( ( rule__SpecialFunction__NameAssignment_0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1359:1: ( rule__SpecialFunction__NameAssignment_0 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getNameAssignment_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1360:1: ( rule__SpecialFunction__NameAssignment_0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1360:2: rule__SpecialFunction__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SpecialFunction__NameAssignment_0_in_rule__SpecialFunction__Group__0__Impl2727);
            rule__SpecialFunction__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSpecialFunctionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group__0__Impl


    // $ANTLR start rule__SpecialFunction__Group__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1370:1: rule__SpecialFunction__Group__1 : rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2 ;
    public final void rule__SpecialFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1374:1: ( rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1375:2: rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__1__Impl_in_rule__SpecialFunction__Group__12757);
            rule__SpecialFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__2_in_rule__SpecialFunction__Group__12760);
            rule__SpecialFunction__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group__1


    // $ANTLR start rule__SpecialFunction__Group__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1382:1: rule__SpecialFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__SpecialFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1386:1: ( ( '(' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1387:1: ( '(' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1387:1: ( '(' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1388:1: '('
            {
             before(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__SpecialFunction__Group__1__Impl2788); 
             after(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group__1__Impl


    // $ANTLR start rule__SpecialFunction__Group__2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1401:1: rule__SpecialFunction__Group__2 : rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3 ;
    public final void rule__SpecialFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1405:1: ( rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1406:2: rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__2__Impl_in_rule__SpecialFunction__Group__22819);
            rule__SpecialFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__3_in_rule__SpecialFunction__Group__22822);
            rule__SpecialFunction__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group__2


    // $ANTLR start rule__SpecialFunction__Group__2__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1413:1: rule__SpecialFunction__Group__2__Impl : ( ( rule__SpecialFunction__ParametersAssignment_2 ) ) ;
    public final void rule__SpecialFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1417:1: ( ( ( rule__SpecialFunction__ParametersAssignment_2 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1418:1: ( ( rule__SpecialFunction__ParametersAssignment_2 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1418:1: ( ( rule__SpecialFunction__ParametersAssignment_2 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1419:1: ( rule__SpecialFunction__ParametersAssignment_2 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getParametersAssignment_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1420:1: ( rule__SpecialFunction__ParametersAssignment_2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1420:2: rule__SpecialFunction__ParametersAssignment_2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__ParametersAssignment_2_in_rule__SpecialFunction__Group__2__Impl2849);
            rule__SpecialFunction__ParametersAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSpecialFunctionAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group__2__Impl


    // $ANTLR start rule__SpecialFunction__Group__3
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1430:1: rule__SpecialFunction__Group__3 : rule__SpecialFunction__Group__3__Impl rule__SpecialFunction__Group__4 ;
    public final void rule__SpecialFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1434:1: ( rule__SpecialFunction__Group__3__Impl rule__SpecialFunction__Group__4 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1435:2: rule__SpecialFunction__Group__3__Impl rule__SpecialFunction__Group__4
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__3__Impl_in_rule__SpecialFunction__Group__32879);
            rule__SpecialFunction__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__4_in_rule__SpecialFunction__Group__32882);
            rule__SpecialFunction__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group__3


    // $ANTLR start rule__SpecialFunction__Group__3__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1442:1: rule__SpecialFunction__Group__3__Impl : ( ( rule__SpecialFunction__Group_3__0 )* ) ;
    public final void rule__SpecialFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1446:1: ( ( ( rule__SpecialFunction__Group_3__0 )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1447:1: ( ( rule__SpecialFunction__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1447:1: ( ( rule__SpecialFunction__Group_3__0 )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1448:1: ( rule__SpecialFunction__Group_3__0 )*
            {
             before(grammarAccess.getSpecialFunctionAccess().getGroup_3()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1449:1: ( rule__SpecialFunction__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1449:2: rule__SpecialFunction__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__SpecialFunction__Group_3__0_in_rule__SpecialFunction__Group__3__Impl2909);
            	    rule__SpecialFunction__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSpecialFunctionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group__3__Impl


    // $ANTLR start rule__SpecialFunction__Group__4
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1459:1: rule__SpecialFunction__Group__4 : rule__SpecialFunction__Group__4__Impl ;
    public final void rule__SpecialFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1463:1: ( rule__SpecialFunction__Group__4__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1464:2: rule__SpecialFunction__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__4__Impl_in_rule__SpecialFunction__Group__42940);
            rule__SpecialFunction__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group__4


    // $ANTLR start rule__SpecialFunction__Group__4__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1470:1: rule__SpecialFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__SpecialFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1474:1: ( ( ')' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1475:1: ( ')' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1475:1: ( ')' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1476:1: ')'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__SpecialFunction__Group__4__Impl2968); 
             after(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group__4__Impl


    // $ANTLR start rule__SpecialFunction__Group_3__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1499:1: rule__SpecialFunction__Group_3__0 : rule__SpecialFunction__Group_3__0__Impl rule__SpecialFunction__Group_3__1 ;
    public final void rule__SpecialFunction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1503:1: ( rule__SpecialFunction__Group_3__0__Impl rule__SpecialFunction__Group_3__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1504:2: rule__SpecialFunction__Group_3__0__Impl rule__SpecialFunction__Group_3__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_3__0__Impl_in_rule__SpecialFunction__Group_3__03009);
            rule__SpecialFunction__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_3__1_in_rule__SpecialFunction__Group_3__03012);
            rule__SpecialFunction__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group_3__0


    // $ANTLR start rule__SpecialFunction__Group_3__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1511:1: rule__SpecialFunction__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SpecialFunction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1515:1: ( ( ',' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1516:1: ( ',' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1516:1: ( ',' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1517:1: ','
            {
             before(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_3_0()); 
            match(input,12,FOLLOW_12_in_rule__SpecialFunction__Group_3__0__Impl3040); 
             after(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group_3__0__Impl


    // $ANTLR start rule__SpecialFunction__Group_3__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1530:1: rule__SpecialFunction__Group_3__1 : rule__SpecialFunction__Group_3__1__Impl ;
    public final void rule__SpecialFunction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1534:1: ( rule__SpecialFunction__Group_3__1__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1535:2: rule__SpecialFunction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_3__1__Impl_in_rule__SpecialFunction__Group_3__13071);
            rule__SpecialFunction__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group_3__1


    // $ANTLR start rule__SpecialFunction__Group_3__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1541:1: rule__SpecialFunction__Group_3__1__Impl : ( ( rule__SpecialFunction__ParametersAssignment_3_1 ) ) ;
    public final void rule__SpecialFunction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1545:1: ( ( ( rule__SpecialFunction__ParametersAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1546:1: ( ( rule__SpecialFunction__ParametersAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1546:1: ( ( rule__SpecialFunction__ParametersAssignment_3_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1547:1: ( rule__SpecialFunction__ParametersAssignment_3_1 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getParametersAssignment_3_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1548:1: ( rule__SpecialFunction__ParametersAssignment_3_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1548:2: rule__SpecialFunction__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__ParametersAssignment_3_1_in_rule__SpecialFunction__Group_3__1__Impl3098);
            rule__SpecialFunction__ParametersAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getSpecialFunctionAccess().getParametersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group_3__1__Impl


    // $ANTLR start rule__CfModel__ElementsAssignment
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1563:1: rule__CfModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__CfModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1567:1: ( ( ruleAbstractElement ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1568:1: ( ruleAbstractElement )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1568:1: ( ruleAbstractElement )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1569:1: ruleAbstractElement
            {
             before(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment3137);
            ruleAbstractElement();
            _fsp--;

             after(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CfModel__ElementsAssignment


    // $ANTLR start rule__Bundle__ComponentAssignment_1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1578:1: rule__Bundle__ComponentAssignment_1 : ( ruleBundleComponent ) ;
    public final void rule__Bundle__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1582:1: ( ( ruleBundleComponent ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1583:1: ( ruleBundleComponent )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1583:1: ( ruleBundleComponent )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1584:1: ruleBundleComponent
            {
             before(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBundleComponent_in_rule__Bundle__ComponentAssignment_13168);
            ruleBundleComponent();
            _fsp--;

             after(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__ComponentAssignment_1


    // $ANTLR start rule__Bundle__NameAssignment_2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1593:1: rule__Bundle__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Bundle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1597:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1598:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1598:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1599:1: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_23199); 
             after(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__NameAssignment_2


    // $ANTLR start rule__Bundle__PromiseTypeAssignment_4_0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1608:1: rule__Bundle__PromiseTypeAssignment_4_0 : ( ruleBundlePromiseType ) ;
    public final void rule__Bundle__PromiseTypeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1612:1: ( ( ruleBundlePromiseType ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1613:1: ( ruleBundlePromiseType )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1613:1: ( ruleBundlePromiseType )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1614:1: ruleBundlePromiseType
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_rule__Bundle__PromiseTypeAssignment_4_03230);
            ruleBundlePromiseType();
            _fsp--;

             after(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__PromiseTypeAssignment_4_0


    // $ANTLR start rule__Body__ComponentAssignment_1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1623:1: rule__Body__ComponentAssignment_1 : ( ruleBodyComponent ) ;
    public final void rule__Body__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1627:1: ( ( ruleBodyComponent ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1628:1: ( ruleBodyComponent )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1628:1: ( ruleBodyComponent )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1629:1: ruleBodyComponent
            {
             before(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_rule__Body__ComponentAssignment_13261);
            ruleBodyComponent();
            _fsp--;

             after(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__ComponentAssignment_1


    // $ANTLR start rule__Body__NameAssignment_2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1638:1: rule__Body__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Body__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1642:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1643:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1643:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1644:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__NameAssignment_23292); 
             after(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__NameAssignment_2


    // $ANTLR start rule__Body__PromiseTypeAssignment_5
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1653:1: rule__Body__PromiseTypeAssignment_5 : ( ruleBodyFunction ) ;
    public final void rule__Body__PromiseTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1657:1: ( ( ruleBodyFunction ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1658:1: ( ruleBodyFunction )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1658:1: ( ruleBodyFunction )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1659:1: ruleBodyFunction
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_rule__Body__PromiseTypeAssignment_53323);
            ruleBodyFunction();
            _fsp--;

             after(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Body__PromiseTypeAssignment_5


    // $ANTLR start rule__BodyFunction__NameAssignment_0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1668:1: rule__BodyFunction__NameAssignment_0 : ( ruleBodyPromiseType ) ;
    public final void rule__BodyFunction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1672:1: ( ( ruleBodyPromiseType ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1673:1: ( ruleBodyPromiseType )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1673:1: ( ruleBodyPromiseType )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1674:1: ruleBodyPromiseType
            {
             before(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_rule__BodyFunction__NameAssignment_03354);
            ruleBodyPromiseType();
            _fsp--;

             after(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__NameAssignment_0


    // $ANTLR start rule__BodyFunction__ValuesAssignment_2_0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1683:1: rule__BodyFunction__ValuesAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1687:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1688:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1688:1: ( RULE_STRING )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1689:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_03385); 
             after(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__ValuesAssignment_2_0


    // $ANTLR start rule__BodyFunction__ValuesAssignment_2_1_1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1698:1: rule__BodyFunction__ValuesAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1702:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1703:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1703:1: ( RULE_STRING )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1704:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_13416); 
             after(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__ValuesAssignment_2_1_1


    // $ANTLR start rule__BodyFunction__ValuesAssignment_2_1_2_1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1713:1: rule__BodyFunction__ValuesAssignment_2_1_2_1 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1717:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1718:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1718:1: ( RULE_STRING )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1719:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_2_13447); 
             after(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__ValuesAssignment_2_1_2_1


    // $ANTLR start rule__BodyFunction__FunctionAssignment_2_2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1728:1: rule__BodyFunction__FunctionAssignment_2_2 : ( ruleSpecialFunction ) ;
    public final void rule__BodyFunction__FunctionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1732:1: ( ( ruleSpecialFunction ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1733:1: ( ruleSpecialFunction )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1733:1: ( ruleSpecialFunction )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1734:1: ruleSpecialFunction
            {
             before(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_rule__BodyFunction__FunctionAssignment_2_23478);
            ruleSpecialFunction();
            _fsp--;

             after(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyFunction__FunctionAssignment_2_2


    // $ANTLR start rule__SpecialFunction__NameAssignment_0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1743:1: rule__SpecialFunction__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SpecialFunction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1747:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1748:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1748:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1749:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__NameAssignment_03509); 
             after(grammarAccess.getSpecialFunctionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__NameAssignment_0


    // $ANTLR start rule__SpecialFunction__ParametersAssignment_2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1758:1: rule__SpecialFunction__ParametersAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SpecialFunction__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1762:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1763:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1763:1: ( RULE_STRING )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1764:1: RULE_STRING
            {
             before(grammarAccess.getSpecialFunctionAccess().getParametersSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecialFunction__ParametersAssignment_23540); 
             after(grammarAccess.getSpecialFunctionAccess().getParametersSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__ParametersAssignment_2


    // $ANTLR start rule__SpecialFunction__ParametersAssignment_3_1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1773:1: rule__SpecialFunction__ParametersAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SpecialFunction__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1777:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1778:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1778:1: ( RULE_STRING )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1779:1: RULE_STRING
            {
             before(grammarAccess.getSpecialFunctionAccess().getParametersSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecialFunction__ParametersAssignment_3_13571); 
             after(grammarAccess.getSpecialFunctionAccess().getParametersSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__ParametersAssignment_3_1


    // $ANTLR start rule__BundlePromiseType__NameAssignment
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1788:1: rule__BundlePromiseType__NameAssignment : ( RULE_ID ) ;
    public final void rule__BundlePromiseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1792:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1793:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1793:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1794:1: RULE_ID
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BundlePromiseType__NameAssignment3602); 
             after(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BundlePromiseType__NameAssignment


    // $ANTLR start rule__BodyPromiseType__NameAssignment
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1803:1: rule__BodyPromiseType__NameAssignment : ( RULE_ID ) ;
    public final void rule__BodyPromiseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1807:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1808:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1808:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1809:1: RULE_ID
            {
             before(grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyPromiseType__NameAssignment3633); 
             after(grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyPromiseType__NameAssignment


    // $ANTLR start rule__BundleComponent__NameAssignment
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1818:1: rule__BundleComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__BundleComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1822:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1823:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1823:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1824:1: RULE_ID
            {
             before(grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BundleComponent__NameAssignment3664); 
             after(grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BundleComponent__NameAssignment


    // $ANTLR start rule__BodyComponent__NameAssignment
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1833:1: rule__BodyComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__BodyComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1837:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1838:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1838:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1839:1: RULE_ID
            {
             before(grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyComponent__NameAssignment3695); 
             after(grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BodyComponent__NameAssignment


 

    public static final BitSet FOLLOW_ruleCfModel_in_entryRuleCfModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCfModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CfModel__ElementsAssignment_in_ruleCfModel94 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_rulePLACEHOLDER_in_entryRulePLACEHOLDER122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePLACEHOLDER129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PLACEHOLDER__Alternatives_in_rulePLACEHOLDER155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_ruleAbstractElement215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Alternatives_in_rulePart274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__0_in_ruleBundle334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0_in_ruleBody394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyFunction428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__0_in_ruleBodyFunction454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialFunction488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__0_in_ruleSpecialFunction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromiseType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__NameAssignment_in_ruleBundlePromiseType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyPromiseType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyPromiseType__NameAssignment_in_ruleBodyPromiseType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleComponent668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleComponent__NameAssignment_in_ruleBundleComponent694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyComponent__NameAssignment_in_ruleBodyComponent754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__PLACEHOLDER__Alternatives790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PLACEHOLDER__Alternatives807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PLACEHOLDER__Alternatives824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__PLACEHOLDER__Alternatives842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PLACEHOLDER__Alternatives862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PLACEHOLDER__Alternatives882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PLACEHOLDER__Alternatives902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PLACEHOLDER__Alternatives922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_rule__Part__Alternatives956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__Part__Alternatives973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_0_in_rule__BodyFunction__Alternatives_21005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__0_in_rule__BodyFunction__Alternatives_21023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__FunctionAssignment_2_2_in_rule__BodyFunction__Alternatives_21041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__0__Impl_in_rule__Bundle__Group__01072 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__1_in_rule__Bundle__Group__01075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Bundle__Group__0__Impl1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__1__Impl_in_rule__Bundle__Group__11134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__2_in_rule__Bundle__Group__11137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__ComponentAssignment_1_in_rule__Bundle__Group__1__Impl1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__21194 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__21197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__31254 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__31257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Bundle__Group__3__Impl1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__41316 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__41319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_4__0_in_rule__Bundle__Group__4__Impl1346 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__51377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Bundle__Group__5__Impl1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_4__0__Impl_in_rule__Bundle__Group_4__01448 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Bundle__Group_4__1_in_rule__Bundle__Group_4__01451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__PromiseTypeAssignment_4_0_in_rule__Bundle__Group_4__0__Impl1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_4__1__Impl_in_rule__Bundle__Group_4__11508 = new BitSet(new long[]{0x0000000000007C72L});
    public static final BitSet FOLLOW_rule__Bundle__Group_4__2_in_rule__Bundle__Group_4__11511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Bundle__Group_4__1__Impl1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_4__2__Impl_in_rule__Bundle__Group_4__21570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLACEHOLDER_in_rule__Bundle__Group_4__2__Impl1598 = new BitSet(new long[]{0x0000000000007C72L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__01635 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__01638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Body__Group__0__Impl1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__11697 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__11700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__21757 = new BitSet(new long[]{0x0000000000017C70L});
    public static final BitSet FOLLOW_rule__Body__Group__3_in_rule__Body__Group__21760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__NameAssignment_2_in_rule__Body__Group__2__Impl1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__31817 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Body__Group__4_in_rule__Body__Group__31820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLACEHOLDER_in_rule__Body__Group__3__Impl1848 = new BitSet(new long[]{0x0000000000007C72L});
    public static final BitSet FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__41879 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_rule__Body__Group__5_in_rule__Body__Group__41882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Body__Group__4__Impl1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__51941 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Body__Group__6_in_rule__Body__Group__51944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__PromiseTypeAssignment_5_in_rule__Body__Group__5__Impl1971 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Body__Group__6__Impl_in_rule__Body__Group__62002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Body__Group__6__Impl2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__0__Impl_in_rule__BodyFunction__Group__02075 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__1_in_rule__BodyFunction__Group__02078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__NameAssignment_0_in_rule__BodyFunction__Group__0__Impl2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__1__Impl_in_rule__BodyFunction__Group__12135 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__2_in_rule__BodyFunction__Group__12138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__BodyFunction__Group__1__Impl2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__2__Impl_in_rule__BodyFunction__Group__22197 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__3_in_rule__BodyFunction__Group__22200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Alternatives_2_in_rule__BodyFunction__Group__2__Impl2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__3__Impl_in_rule__BodyFunction__Group__32257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BodyFunction__Group__3__Impl2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__0__Impl_in_rule__BodyFunction__Group_2_1__02324 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__1_in_rule__BodyFunction__Group_2_1__02327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BodyFunction__Group_2_1__0__Impl2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__1__Impl_in_rule__BodyFunction__Group_2_1__12386 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__2_in_rule__BodyFunction__Group_2_1__12389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_1_in_rule__BodyFunction__Group_2_1__1__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__2__Impl_in_rule__BodyFunction__Group_2_1__22446 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__3_in_rule__BodyFunction__Group_2_1__22449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__0_in_rule__BodyFunction__Group_2_1__2__Impl2476 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__3__Impl_in_rule__BodyFunction__Group_2_1__32507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BodyFunction__Group_2_1__3__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__0__Impl_in_rule__BodyFunction__Group_2_1_2__02574 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__1_in_rule__BodyFunction__Group_2_1_2__02577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BodyFunction__Group_2_1_2__0__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__1__Impl_in_rule__BodyFunction__Group_2_1_2__12636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_2_1_in_rule__BodyFunction__Group_2_1_2__1__Impl2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__0__Impl_in_rule__SpecialFunction__Group__02697 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__1_in_rule__SpecialFunction__Group__02700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__NameAssignment_0_in_rule__SpecialFunction__Group__0__Impl2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__1__Impl_in_rule__SpecialFunction__Group__12757 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__2_in_rule__SpecialFunction__Group__12760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SpecialFunction__Group__1__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__2__Impl_in_rule__SpecialFunction__Group__22819 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__3_in_rule__SpecialFunction__Group__22822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__ParametersAssignment_2_in_rule__SpecialFunction__Group__2__Impl2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__3__Impl_in_rule__SpecialFunction__Group__32879 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__4_in_rule__SpecialFunction__Group__32882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_3__0_in_rule__SpecialFunction__Group__3__Impl2909 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__4__Impl_in_rule__SpecialFunction__Group__42940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SpecialFunction__Group__4__Impl2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_3__0__Impl_in_rule__SpecialFunction__Group_3__03009 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_3__1_in_rule__SpecialFunction__Group_3__03012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SpecialFunction__Group_3__0__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_3__1__Impl_in_rule__SpecialFunction__Group_3__13071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__ParametersAssignment_3_1_in_rule__SpecialFunction__Group_3__1__Impl3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_rule__Bundle__ComponentAssignment_13168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_23199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_rule__Bundle__PromiseTypeAssignment_4_03230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_rule__Body__ComponentAssignment_13261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__NameAssignment_23292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_rule__Body__PromiseTypeAssignment_53323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_rule__BodyFunction__NameAssignment_03354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_03385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_13416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_2_13447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_rule__BodyFunction__FunctionAssignment_2_23478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__NameAssignment_03509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecialFunction__ParametersAssignment_23540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecialFunction__ParametersAssignment_3_13571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BundlePromiseType__NameAssignment3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyPromiseType__NameAssignment3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BundleComponent__NameAssignment3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyComponent__NameAssignment3695 = new BitSet(new long[]{0x0000000000000002L});

}