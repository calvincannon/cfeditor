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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:618:1: rule__Bundle__Group__3__Impl : ( ( rulePLACEHOLDER )* ) ;
    public final void rule__Bundle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:622:1: ( ( ( rulePLACEHOLDER )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:623:1: ( ( rulePLACEHOLDER )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:623:1: ( ( rulePLACEHOLDER )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:624:1: ( rulePLACEHOLDER )*
            {
             before(grammarAccess.getBundleAccess().getPLACEHOLDERParserRuleCall_3()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:625:1: ( rulePLACEHOLDER )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ANY_OTHER && LA5_0<=RULE_STRING)||(LA5_0>=10 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:625:3: rulePLACEHOLDER
            	    {
            	    pushFollow(FOLLOW_rulePLACEHOLDER_in_rule__Bundle__Group__3__Impl1285);
            	    rulePLACEHOLDER();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getBundleAccess().getPLACEHOLDERParserRuleCall_3()); 

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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:635:1: rule__Bundle__Group__4 : rule__Bundle__Group__4__Impl rule__Bundle__Group__5 ;
    public final void rule__Bundle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:639:1: ( rule__Bundle__Group__4__Impl rule__Bundle__Group__5 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:640:2: rule__Bundle__Group__4__Impl rule__Bundle__Group__5
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:647:1: rule__Bundle__Group__4__Impl : ( '{' ) ;
    public final void rule__Bundle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:651:1: ( ( '{' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:652:1: ( '{' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:652:1: ( '{' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:653:1: '{'
            {
             before(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Bundle__Group__4__Impl1347); 
             after(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4()); 

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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:666:1: rule__Bundle__Group__5 : rule__Bundle__Group__5__Impl rule__Bundle__Group__6 ;
    public final void rule__Bundle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:670:1: ( rule__Bundle__Group__5__Impl rule__Bundle__Group__6 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:671:2: rule__Bundle__Group__5__Impl rule__Bundle__Group__6
            {
            pushFollow(FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__51378);
            rule__Bundle__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__6_in_rule__Bundle__Group__51381);
            rule__Bundle__Group__6();
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:678:1: rule__Bundle__Group__5__Impl : ( ( rule__Bundle__Group_5__0 )* ) ;
    public final void rule__Bundle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:682:1: ( ( ( rule__Bundle__Group_5__0 )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:683:1: ( ( rule__Bundle__Group_5__0 )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:683:1: ( ( rule__Bundle__Group_5__0 )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:684:1: ( rule__Bundle__Group_5__0 )*
            {
             before(grammarAccess.getBundleAccess().getGroup_5()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:685:1: ( rule__Bundle__Group_5__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:685:2: rule__Bundle__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Bundle__Group_5__0_in_rule__Bundle__Group__5__Impl1408);
            	    rule__Bundle__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getBundleAccess().getGroup_5()); 

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


    // $ANTLR start rule__Bundle__Group__6
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:695:1: rule__Bundle__Group__6 : rule__Bundle__Group__6__Impl ;
    public final void rule__Bundle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:699:1: ( rule__Bundle__Group__6__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:700:2: rule__Bundle__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group__6__Impl_in_rule__Bundle__Group__61439);
            rule__Bundle__Group__6__Impl();
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
    // $ANTLR end rule__Bundle__Group__6


    // $ANTLR start rule__Bundle__Group__6__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:706:1: rule__Bundle__Group__6__Impl : ( '}' ) ;
    public final void rule__Bundle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:710:1: ( ( '}' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:711:1: ( '}' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:711:1: ( '}' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:712:1: '}'
            {
             before(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Bundle__Group__6__Impl1467); 
             after(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end rule__Bundle__Group__6__Impl


    // $ANTLR start rule__Bundle__Group_5__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:739:1: rule__Bundle__Group_5__0 : rule__Bundle__Group_5__0__Impl rule__Bundle__Group_5__1 ;
    public final void rule__Bundle__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:743:1: ( rule__Bundle__Group_5__0__Impl rule__Bundle__Group_5__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:744:2: rule__Bundle__Group_5__0__Impl rule__Bundle__Group_5__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group_5__0__Impl_in_rule__Bundle__Group_5__01512);
            rule__Bundle__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_5__1_in_rule__Bundle__Group_5__01515);
            rule__Bundle__Group_5__1();
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
    // $ANTLR end rule__Bundle__Group_5__0


    // $ANTLR start rule__Bundle__Group_5__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:751:1: rule__Bundle__Group_5__0__Impl : ( ( rule__Bundle__PromiseTypeAssignment_5_0 ) ) ;
    public final void rule__Bundle__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:755:1: ( ( ( rule__Bundle__PromiseTypeAssignment_5_0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:756:1: ( ( rule__Bundle__PromiseTypeAssignment_5_0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:756:1: ( ( rule__Bundle__PromiseTypeAssignment_5_0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:757:1: ( rule__Bundle__PromiseTypeAssignment_5_0 )
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeAssignment_5_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:758:1: ( rule__Bundle__PromiseTypeAssignment_5_0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:758:2: rule__Bundle__PromiseTypeAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Bundle__PromiseTypeAssignment_5_0_in_rule__Bundle__Group_5__0__Impl1542);
            rule__Bundle__PromiseTypeAssignment_5_0();
            _fsp--;


            }

             after(grammarAccess.getBundleAccess().getPromiseTypeAssignment_5_0()); 

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
    // $ANTLR end rule__Bundle__Group_5__0__Impl


    // $ANTLR start rule__Bundle__Group_5__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:768:1: rule__Bundle__Group_5__1 : rule__Bundle__Group_5__1__Impl rule__Bundle__Group_5__2 ;
    public final void rule__Bundle__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:772:1: ( rule__Bundle__Group_5__1__Impl rule__Bundle__Group_5__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:773:2: rule__Bundle__Group_5__1__Impl rule__Bundle__Group_5__2
            {
            pushFollow(FOLLOW_rule__Bundle__Group_5__1__Impl_in_rule__Bundle__Group_5__11572);
            rule__Bundle__Group_5__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_5__2_in_rule__Bundle__Group_5__11575);
            rule__Bundle__Group_5__2();
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
    // $ANTLR end rule__Bundle__Group_5__1


    // $ANTLR start rule__Bundle__Group_5__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:780:1: rule__Bundle__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Bundle__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:784:1: ( ( ':' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:785:1: ( ':' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:785:1: ( ':' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:786:1: ':'
            {
             before(grammarAccess.getBundleAccess().getColonKeyword_5_1()); 
            match(input,18,FOLLOW_18_in_rule__Bundle__Group_5__1__Impl1603); 
             after(grammarAccess.getBundleAccess().getColonKeyword_5_1()); 

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
    // $ANTLR end rule__Bundle__Group_5__1__Impl


    // $ANTLR start rule__Bundle__Group_5__2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:799:1: rule__Bundle__Group_5__2 : rule__Bundle__Group_5__2__Impl ;
    public final void rule__Bundle__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:803:1: ( rule__Bundle__Group_5__2__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:804:2: rule__Bundle__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group_5__2__Impl_in_rule__Bundle__Group_5__21634);
            rule__Bundle__Group_5__2__Impl();
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
    // $ANTLR end rule__Bundle__Group_5__2


    // $ANTLR start rule__Bundle__Group_5__2__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:810:1: rule__Bundle__Group_5__2__Impl : ( ( rulePLACEHOLDER )* ) ;
    public final void rule__Bundle__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:814:1: ( ( ( rulePLACEHOLDER )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:815:1: ( ( rulePLACEHOLDER )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:815:1: ( ( rulePLACEHOLDER )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:816:1: ( rulePLACEHOLDER )*
            {
             before(grammarAccess.getBundleAccess().getPLACEHOLDERParserRuleCall_5_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:817:1: ( rulePLACEHOLDER )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_2 = input.LA(2);

                    if ( ((LA7_2>=RULE_ANY_OTHER && LA7_2<=RULE_STRING)||(LA7_2>=10 && LA7_2<=14)||LA7_2==17) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==RULE_ANY_OTHER||LA7_0==RULE_STRING||(LA7_0>=10 && LA7_0<=14)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:817:3: rulePLACEHOLDER
            	    {
            	    pushFollow(FOLLOW_rulePLACEHOLDER_in_rule__Bundle__Group_5__2__Impl1662);
            	    rulePLACEHOLDER();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBundleAccess().getPLACEHOLDERParserRuleCall_5_2()); 

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
    // $ANTLR end rule__Bundle__Group_5__2__Impl


    // $ANTLR start rule__Body__Group__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:833:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:837:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:838:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__01699);
            rule__Body__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__01702);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:845:1: rule__Body__Group__0__Impl : ( 'body' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:849:1: ( ( 'body' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:850:1: ( 'body' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:850:1: ( 'body' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:851:1: 'body'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Body__Group__0__Impl1730); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:864:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:868:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:869:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__11761);
            rule__Body__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__11764);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:876:1: rule__Body__Group__1__Impl : ( ( rule__Body__ComponentAssignment_1 ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:880:1: ( ( ( rule__Body__ComponentAssignment_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:881:1: ( ( rule__Body__ComponentAssignment_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:881:1: ( ( rule__Body__ComponentAssignment_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:882:1: ( rule__Body__ComponentAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getComponentAssignment_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:883:1: ( rule__Body__ComponentAssignment_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:883:2: rule__Body__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl1791);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:893:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:897:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:898:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__21821);
            rule__Body__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__3_in_rule__Body__Group__21824);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:905:1: rule__Body__Group__2__Impl : ( ( rule__Body__NameAssignment_2 ) ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:909:1: ( ( ( rule__Body__NameAssignment_2 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:910:1: ( ( rule__Body__NameAssignment_2 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:910:1: ( ( rule__Body__NameAssignment_2 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:911:1: ( rule__Body__NameAssignment_2 )
            {
             before(grammarAccess.getBodyAccess().getNameAssignment_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:912:1: ( rule__Body__NameAssignment_2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:912:2: rule__Body__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Body__NameAssignment_2_in_rule__Body__Group__2__Impl1851);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:922:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:926:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:927:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__31881);
            rule__Body__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__4_in_rule__Body__Group__31884);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:934:1: rule__Body__Group__3__Impl : ( ( rule__Body__Group_3__0 )? ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:938:1: ( ( ( rule__Body__Group_3__0 )? ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:939:1: ( ( rule__Body__Group_3__0 )? )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:939:1: ( ( rule__Body__Group_3__0 )? )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:940:1: ( rule__Body__Group_3__0 )?
            {
             before(grammarAccess.getBodyAccess().getGroup_3()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:941:1: ( rule__Body__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:941:2: rule__Body__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Body__Group_3__0_in_rule__Body__Group__3__Impl1911);
                    rule__Body__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBodyAccess().getGroup_3()); 

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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:951:1: rule__Body__Group__4 : rule__Body__Group__4__Impl rule__Body__Group__5 ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:955:1: ( rule__Body__Group__4__Impl rule__Body__Group__5 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:956:2: rule__Body__Group__4__Impl rule__Body__Group__5
            {
            pushFollow(FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__41942);
            rule__Body__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__5_in_rule__Body__Group__41945);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:963:1: rule__Body__Group__4__Impl : ( '{' ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:967:1: ( ( '{' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:968:1: ( '{' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:968:1: ( '{' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:969:1: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Body__Group__4__Impl1973); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:982:1: rule__Body__Group__5 : rule__Body__Group__5__Impl rule__Body__Group__6 ;
    public final void rule__Body__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:986:1: ( rule__Body__Group__5__Impl rule__Body__Group__6 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:987:2: rule__Body__Group__5__Impl rule__Body__Group__6
            {
            pushFollow(FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__52004);
            rule__Body__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__6_in_rule__Body__Group__52007);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:994:1: rule__Body__Group__5__Impl : ( ( rule__Body__PromiseTypeAssignment_5 )* ) ;
    public final void rule__Body__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:998:1: ( ( ( rule__Body__PromiseTypeAssignment_5 )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:999:1: ( ( rule__Body__PromiseTypeAssignment_5 )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:999:1: ( ( rule__Body__PromiseTypeAssignment_5 )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1000:1: ( rule__Body__PromiseTypeAssignment_5 )*
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeAssignment_5()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1001:1: ( rule__Body__PromiseTypeAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1001:2: rule__Body__PromiseTypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Body__PromiseTypeAssignment_5_in_rule__Body__Group__5__Impl2034);
            	    rule__Body__PromiseTypeAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1011:1: rule__Body__Group__6 : rule__Body__Group__6__Impl ;
    public final void rule__Body__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1015:1: ( rule__Body__Group__6__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1016:2: rule__Body__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__6__Impl_in_rule__Body__Group__62065);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1022:1: rule__Body__Group__6__Impl : ( '}' ) ;
    public final void rule__Body__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1026:1: ( ( '}' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1027:1: ( '}' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1027:1: ( '}' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1028:1: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Body__Group__6__Impl2093); 
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


    // $ANTLR start rule__Body__Group_3__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1055:1: rule__Body__Group_3__0 : rule__Body__Group_3__0__Impl rule__Body__Group_3__1 ;
    public final void rule__Body__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1059:1: ( rule__Body__Group_3__0__Impl rule__Body__Group_3__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1060:2: rule__Body__Group_3__0__Impl rule__Body__Group_3__1
            {
            pushFollow(FOLLOW_rule__Body__Group_3__0__Impl_in_rule__Body__Group_3__02138);
            rule__Body__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__1_in_rule__Body__Group_3__02141);
            rule__Body__Group_3__1();
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
    // $ANTLR end rule__Body__Group_3__0


    // $ANTLR start rule__Body__Group_3__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1067:1: rule__Body__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Body__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1071:1: ( ( '(' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1072:1: ( '(' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1072:1: ( '(' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1073:1: '('
            {
             before(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__Body__Group_3__0__Impl2169); 
             after(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end rule__Body__Group_3__0__Impl


    // $ANTLR start rule__Body__Group_3__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1086:1: rule__Body__Group_3__1 : rule__Body__Group_3__1__Impl rule__Body__Group_3__2 ;
    public final void rule__Body__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1090:1: ( rule__Body__Group_3__1__Impl rule__Body__Group_3__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1091:2: rule__Body__Group_3__1__Impl rule__Body__Group_3__2
            {
            pushFollow(FOLLOW_rule__Body__Group_3__1__Impl_in_rule__Body__Group_3__12200);
            rule__Body__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__2_in_rule__Body__Group_3__12203);
            rule__Body__Group_3__2();
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
    // $ANTLR end rule__Body__Group_3__1


    // $ANTLR start rule__Body__Group_3__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1098:1: rule__Body__Group_3__1__Impl : ( ( rule__Body__VariablesAssignment_3_1 ) ) ;
    public final void rule__Body__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1102:1: ( ( ( rule__Body__VariablesAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1103:1: ( ( rule__Body__VariablesAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1103:1: ( ( rule__Body__VariablesAssignment_3_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1104:1: ( rule__Body__VariablesAssignment_3_1 )
            {
             before(grammarAccess.getBodyAccess().getVariablesAssignment_3_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1105:1: ( rule__Body__VariablesAssignment_3_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1105:2: rule__Body__VariablesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Body__VariablesAssignment_3_1_in_rule__Body__Group_3__1__Impl2230);
            rule__Body__VariablesAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getBodyAccess().getVariablesAssignment_3_1()); 

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
    // $ANTLR end rule__Body__Group_3__1__Impl


    // $ANTLR start rule__Body__Group_3__2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1115:1: rule__Body__Group_3__2 : rule__Body__Group_3__2__Impl rule__Body__Group_3__3 ;
    public final void rule__Body__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1119:1: ( rule__Body__Group_3__2__Impl rule__Body__Group_3__3 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1120:2: rule__Body__Group_3__2__Impl rule__Body__Group_3__3
            {
            pushFollow(FOLLOW_rule__Body__Group_3__2__Impl_in_rule__Body__Group_3__22260);
            rule__Body__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__3_in_rule__Body__Group_3__22263);
            rule__Body__Group_3__3();
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
    // $ANTLR end rule__Body__Group_3__2


    // $ANTLR start rule__Body__Group_3__2__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1127:1: rule__Body__Group_3__2__Impl : ( ( rule__Body__Group_3_2__0 )* ) ;
    public final void rule__Body__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1131:1: ( ( ( rule__Body__Group_3_2__0 )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1132:1: ( ( rule__Body__Group_3_2__0 )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1132:1: ( ( rule__Body__Group_3_2__0 )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1133:1: ( rule__Body__Group_3_2__0 )*
            {
             before(grammarAccess.getBodyAccess().getGroup_3_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1134:1: ( rule__Body__Group_3_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1134:2: rule__Body__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Body__Group_3_2__0_in_rule__Body__Group_3__2__Impl2290);
            	    rule__Body__Group_3_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getGroup_3_2()); 

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
    // $ANTLR end rule__Body__Group_3__2__Impl


    // $ANTLR start rule__Body__Group_3__3
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1144:1: rule__Body__Group_3__3 : rule__Body__Group_3__3__Impl ;
    public final void rule__Body__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1148:1: ( rule__Body__Group_3__3__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1149:2: rule__Body__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_3__3__Impl_in_rule__Body__Group_3__32321);
            rule__Body__Group_3__3__Impl();
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
    // $ANTLR end rule__Body__Group_3__3


    // $ANTLR start rule__Body__Group_3__3__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1155:1: rule__Body__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Body__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1159:1: ( ( ')' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1160:1: ( ')' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1160:1: ( ')' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1161:1: ')'
            {
             before(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3()); 
            match(input,14,FOLLOW_14_in_rule__Body__Group_3__3__Impl2349); 
             after(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3()); 

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
    // $ANTLR end rule__Body__Group_3__3__Impl


    // $ANTLR start rule__Body__Group_3_2__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1182:1: rule__Body__Group_3_2__0 : rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1 ;
    public final void rule__Body__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1186:1: ( rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1187:2: rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Body__Group_3_2__0__Impl_in_rule__Body__Group_3_2__02388);
            rule__Body__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3_2__1_in_rule__Body__Group_3_2__02391);
            rule__Body__Group_3_2__1();
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
    // $ANTLR end rule__Body__Group_3_2__0


    // $ANTLR start rule__Body__Group_3_2__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1194:1: rule__Body__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Body__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1198:1: ( ( ',' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1199:1: ( ',' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1199:1: ( ',' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1200:1: ','
            {
             before(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0()); 
            match(input,12,FOLLOW_12_in_rule__Body__Group_3_2__0__Impl2419); 
             after(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end rule__Body__Group_3_2__0__Impl


    // $ANTLR start rule__Body__Group_3_2__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1213:1: rule__Body__Group_3_2__1 : rule__Body__Group_3_2__1__Impl ;
    public final void rule__Body__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1217:1: ( rule__Body__Group_3_2__1__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1218:2: rule__Body__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_3_2__1__Impl_in_rule__Body__Group_3_2__12450);
            rule__Body__Group_3_2__1__Impl();
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
    // $ANTLR end rule__Body__Group_3_2__1


    // $ANTLR start rule__Body__Group_3_2__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1224:1: rule__Body__Group_3_2__1__Impl : ( ( rule__Body__VariablesAssignment_3_2_1 ) ) ;
    public final void rule__Body__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1228:1: ( ( ( rule__Body__VariablesAssignment_3_2_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1229:1: ( ( rule__Body__VariablesAssignment_3_2_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1229:1: ( ( rule__Body__VariablesAssignment_3_2_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1230:1: ( rule__Body__VariablesAssignment_3_2_1 )
            {
             before(grammarAccess.getBodyAccess().getVariablesAssignment_3_2_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1231:1: ( rule__Body__VariablesAssignment_3_2_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1231:2: rule__Body__VariablesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Body__VariablesAssignment_3_2_1_in_rule__Body__Group_3_2__1__Impl2477);
            rule__Body__VariablesAssignment_3_2_1();
            _fsp--;


            }

             after(grammarAccess.getBodyAccess().getVariablesAssignment_3_2_1()); 

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
    // $ANTLR end rule__Body__Group_3_2__1__Impl


    // $ANTLR start rule__BodyFunction__Group__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1245:1: rule__BodyFunction__Group__0 : rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1 ;
    public final void rule__BodyFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1249:1: ( rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1250:2: rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__0__Impl_in_rule__BodyFunction__Group__02511);
            rule__BodyFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__1_in_rule__BodyFunction__Group__02514);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1257:1: rule__BodyFunction__Group__0__Impl : ( ( rule__BodyFunction__NameAssignment_0 ) ) ;
    public final void rule__BodyFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1261:1: ( ( ( rule__BodyFunction__NameAssignment_0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1262:1: ( ( rule__BodyFunction__NameAssignment_0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1262:1: ( ( rule__BodyFunction__NameAssignment_0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1263:1: ( rule__BodyFunction__NameAssignment_0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getNameAssignment_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1264:1: ( rule__BodyFunction__NameAssignment_0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1264:2: rule__BodyFunction__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BodyFunction__NameAssignment_0_in_rule__BodyFunction__Group__0__Impl2541);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1274:1: rule__BodyFunction__Group__1 : rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2 ;
    public final void rule__BodyFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1278:1: ( rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1279:2: rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__1__Impl_in_rule__BodyFunction__Group__12571);
            rule__BodyFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__2_in_rule__BodyFunction__Group__12574);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1286:1: rule__BodyFunction__Group__1__Impl : ( '=>' ) ;
    public final void rule__BodyFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1290:1: ( ( '=>' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1291:1: ( '=>' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1291:1: ( '=>' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1292:1: '=>'
            {
             before(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,10,FOLLOW_10_in_rule__BodyFunction__Group__1__Impl2602); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1305:1: rule__BodyFunction__Group__2 : rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3 ;
    public final void rule__BodyFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1309:1: ( rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1310:2: rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__2__Impl_in_rule__BodyFunction__Group__22633);
            rule__BodyFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__3_in_rule__BodyFunction__Group__22636);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1317:1: rule__BodyFunction__Group__2__Impl : ( ( rule__BodyFunction__Alternatives_2 ) ) ;
    public final void rule__BodyFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1321:1: ( ( ( rule__BodyFunction__Alternatives_2 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1322:1: ( ( rule__BodyFunction__Alternatives_2 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1322:1: ( ( rule__BodyFunction__Alternatives_2 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1323:1: ( rule__BodyFunction__Alternatives_2 )
            {
             before(grammarAccess.getBodyFunctionAccess().getAlternatives_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1324:1: ( rule__BodyFunction__Alternatives_2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1324:2: rule__BodyFunction__Alternatives_2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Alternatives_2_in_rule__BodyFunction__Group__2__Impl2663);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1334:1: rule__BodyFunction__Group__3 : rule__BodyFunction__Group__3__Impl ;
    public final void rule__BodyFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1338:1: ( rule__BodyFunction__Group__3__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1339:2: rule__BodyFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__3__Impl_in_rule__BodyFunction__Group__32693);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1345:1: rule__BodyFunction__Group__3__Impl : ( ';' ) ;
    public final void rule__BodyFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1349:1: ( ( ';' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1350:1: ( ';' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1350:1: ( ';' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1351:1: ';'
            {
             before(grammarAccess.getBodyFunctionAccess().getSemicolonKeyword_3()); 
            match(input,11,FOLLOW_11_in_rule__BodyFunction__Group__3__Impl2721); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1372:1: rule__BodyFunction__Group_2_1__0 : rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1 ;
    public final void rule__BodyFunction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1376:1: ( rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1377:2: rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__0__Impl_in_rule__BodyFunction__Group_2_1__02760);
            rule__BodyFunction__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__1_in_rule__BodyFunction__Group_2_1__02763);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1384:1: rule__BodyFunction__Group_2_1__0__Impl : ( ( rule__BodyFunction__ListAssignment_2_1_0 ) ) ;
    public final void rule__BodyFunction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1388:1: ( ( ( rule__BodyFunction__ListAssignment_2_1_0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1389:1: ( ( rule__BodyFunction__ListAssignment_2_1_0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1389:1: ( ( rule__BodyFunction__ListAssignment_2_1_0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1390:1: ( rule__BodyFunction__ListAssignment_2_1_0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getListAssignment_2_1_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1391:1: ( rule__BodyFunction__ListAssignment_2_1_0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1391:2: rule__BodyFunction__ListAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__BodyFunction__ListAssignment_2_1_0_in_rule__BodyFunction__Group_2_1__0__Impl2790);
            rule__BodyFunction__ListAssignment_2_1_0();
            _fsp--;


            }

             after(grammarAccess.getBodyFunctionAccess().getListAssignment_2_1_0()); 

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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1401:1: rule__BodyFunction__Group_2_1__1 : rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2 ;
    public final void rule__BodyFunction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1405:1: ( rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1406:2: rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__1__Impl_in_rule__BodyFunction__Group_2_1__12820);
            rule__BodyFunction__Group_2_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__2_in_rule__BodyFunction__Group_2_1__12823);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1413:1: rule__BodyFunction__Group_2_1__1__Impl : ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__BodyFunction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1417:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1418:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1418:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1419:1: ( rule__BodyFunction__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1420:1: ( rule__BodyFunction__ValuesAssignment_2_1_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1420:2: rule__BodyFunction__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_1_in_rule__BodyFunction__Group_2_1__1__Impl2850);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1430:1: rule__BodyFunction__Group_2_1__2 : rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3 ;
    public final void rule__BodyFunction__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1434:1: ( rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1435:2: rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__2__Impl_in_rule__BodyFunction__Group_2_1__22880);
            rule__BodyFunction__Group_2_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__3_in_rule__BodyFunction__Group_2_1__22883);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1442:1: rule__BodyFunction__Group_2_1__2__Impl : ( ( rule__BodyFunction__Group_2_1_2__0 )* ) ;
    public final void rule__BodyFunction__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1446:1: ( ( ( rule__BodyFunction__Group_2_1_2__0 )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1447:1: ( ( rule__BodyFunction__Group_2_1_2__0 )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1447:1: ( ( rule__BodyFunction__Group_2_1_2__0 )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1448:1: ( rule__BodyFunction__Group_2_1_2__0 )*
            {
             before(grammarAccess.getBodyFunctionAccess().getGroup_2_1_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1449:1: ( rule__BodyFunction__Group_2_1_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==12) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1449:2: rule__BodyFunction__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__0_in_rule__BodyFunction__Group_2_1__2__Impl2910);
            	    rule__BodyFunction__Group_2_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1459:1: rule__BodyFunction__Group_2_1__3 : rule__BodyFunction__Group_2_1__3__Impl ;
    public final void rule__BodyFunction__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1463:1: ( rule__BodyFunction__Group_2_1__3__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1464:2: rule__BodyFunction__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__3__Impl_in_rule__BodyFunction__Group_2_1__32941);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1470:1: rule__BodyFunction__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__BodyFunction__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1474:1: ( ( '}' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1475:1: ( '}' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1475:1: ( '}' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1476:1: '}'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,17,FOLLOW_17_in_rule__BodyFunction__Group_2_1__3__Impl2969); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1497:1: rule__BodyFunction__Group_2_1_2__0 : rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1 ;
    public final void rule__BodyFunction__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1501:1: ( rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1502:2: rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__0__Impl_in_rule__BodyFunction__Group_2_1_2__03008);
            rule__BodyFunction__Group_2_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__1_in_rule__BodyFunction__Group_2_1_2__03011);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1509:1: rule__BodyFunction__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__BodyFunction__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1513:1: ( ( ',' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1514:1: ( ',' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1514:1: ( ',' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1515:1: ','
            {
             before(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0()); 
            match(input,12,FOLLOW_12_in_rule__BodyFunction__Group_2_1_2__0__Impl3039); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1528:1: rule__BodyFunction__Group_2_1_2__1 : rule__BodyFunction__Group_2_1_2__1__Impl ;
    public final void rule__BodyFunction__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1532:1: ( rule__BodyFunction__Group_2_1_2__1__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1533:2: rule__BodyFunction__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__1__Impl_in_rule__BodyFunction__Group_2_1_2__13070);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1539:1: rule__BodyFunction__Group_2_1_2__1__Impl : ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) ) ;
    public final void rule__BodyFunction__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1543:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1544:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1544:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1545:1: ( rule__BodyFunction__ValuesAssignment_2_1_2_1 )
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_2_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1546:1: ( rule__BodyFunction__ValuesAssignment_2_1_2_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1546:2: rule__BodyFunction__ValuesAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_2_1_in_rule__BodyFunction__Group_2_1_2__1__Impl3097);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1560:1: rule__SpecialFunction__Group__0 : rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1 ;
    public final void rule__SpecialFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1564:1: ( rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1565:2: rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__0__Impl_in_rule__SpecialFunction__Group__03131);
            rule__SpecialFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__1_in_rule__SpecialFunction__Group__03134);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1572:1: rule__SpecialFunction__Group__0__Impl : ( ( rule__SpecialFunction__NameAssignment_0 ) ) ;
    public final void rule__SpecialFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1576:1: ( ( ( rule__SpecialFunction__NameAssignment_0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1577:1: ( ( rule__SpecialFunction__NameAssignment_0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1577:1: ( ( rule__SpecialFunction__NameAssignment_0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1578:1: ( rule__SpecialFunction__NameAssignment_0 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getNameAssignment_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1579:1: ( rule__SpecialFunction__NameAssignment_0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1579:2: rule__SpecialFunction__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SpecialFunction__NameAssignment_0_in_rule__SpecialFunction__Group__0__Impl3161);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1589:1: rule__SpecialFunction__Group__1 : rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2 ;
    public final void rule__SpecialFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1593:1: ( rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1594:2: rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__1__Impl_in_rule__SpecialFunction__Group__13191);
            rule__SpecialFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__2_in_rule__SpecialFunction__Group__13194);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1601:1: rule__SpecialFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__SpecialFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1605:1: ( ( '(' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1606:1: ( '(' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1606:1: ( '(' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1607:1: '('
            {
             before(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__SpecialFunction__Group__1__Impl3222); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1620:1: rule__SpecialFunction__Group__2 : rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3 ;
    public final void rule__SpecialFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1624:1: ( rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1625:2: rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__2__Impl_in_rule__SpecialFunction__Group__23253);
            rule__SpecialFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__3_in_rule__SpecialFunction__Group__23256);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1632:1: rule__SpecialFunction__Group__2__Impl : ( ( rule__SpecialFunction__ParametersAssignment_2 ) ) ;
    public final void rule__SpecialFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1636:1: ( ( ( rule__SpecialFunction__ParametersAssignment_2 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1637:1: ( ( rule__SpecialFunction__ParametersAssignment_2 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1637:1: ( ( rule__SpecialFunction__ParametersAssignment_2 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1638:1: ( rule__SpecialFunction__ParametersAssignment_2 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getParametersAssignment_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1639:1: ( rule__SpecialFunction__ParametersAssignment_2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1639:2: rule__SpecialFunction__ParametersAssignment_2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__ParametersAssignment_2_in_rule__SpecialFunction__Group__2__Impl3283);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1649:1: rule__SpecialFunction__Group__3 : rule__SpecialFunction__Group__3__Impl rule__SpecialFunction__Group__4 ;
    public final void rule__SpecialFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1653:1: ( rule__SpecialFunction__Group__3__Impl rule__SpecialFunction__Group__4 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1654:2: rule__SpecialFunction__Group__3__Impl rule__SpecialFunction__Group__4
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__3__Impl_in_rule__SpecialFunction__Group__33313);
            rule__SpecialFunction__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__4_in_rule__SpecialFunction__Group__33316);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1661:1: rule__SpecialFunction__Group__3__Impl : ( ( rule__SpecialFunction__Group_3__0 )* ) ;
    public final void rule__SpecialFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1665:1: ( ( ( rule__SpecialFunction__Group_3__0 )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1666:1: ( ( rule__SpecialFunction__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1666:1: ( ( rule__SpecialFunction__Group_3__0 )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1667:1: ( rule__SpecialFunction__Group_3__0 )*
            {
             before(grammarAccess.getSpecialFunctionAccess().getGroup_3()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1668:1: ( rule__SpecialFunction__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1668:2: rule__SpecialFunction__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__SpecialFunction__Group_3__0_in_rule__SpecialFunction__Group__3__Impl3343);
            	    rule__SpecialFunction__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1678:1: rule__SpecialFunction__Group__4 : rule__SpecialFunction__Group__4__Impl ;
    public final void rule__SpecialFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1682:1: ( rule__SpecialFunction__Group__4__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1683:2: rule__SpecialFunction__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__4__Impl_in_rule__SpecialFunction__Group__43374);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1689:1: rule__SpecialFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__SpecialFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1693:1: ( ( ')' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1694:1: ( ')' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1694:1: ( ')' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1695:1: ')'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__SpecialFunction__Group__4__Impl3402); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1718:1: rule__SpecialFunction__Group_3__0 : rule__SpecialFunction__Group_3__0__Impl rule__SpecialFunction__Group_3__1 ;
    public final void rule__SpecialFunction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1722:1: ( rule__SpecialFunction__Group_3__0__Impl rule__SpecialFunction__Group_3__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1723:2: rule__SpecialFunction__Group_3__0__Impl rule__SpecialFunction__Group_3__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_3__0__Impl_in_rule__SpecialFunction__Group_3__03443);
            rule__SpecialFunction__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_3__1_in_rule__SpecialFunction__Group_3__03446);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1730:1: rule__SpecialFunction__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SpecialFunction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1734:1: ( ( ',' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1735:1: ( ',' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1735:1: ( ',' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1736:1: ','
            {
             before(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_3_0()); 
            match(input,12,FOLLOW_12_in_rule__SpecialFunction__Group_3__0__Impl3474); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1749:1: rule__SpecialFunction__Group_3__1 : rule__SpecialFunction__Group_3__1__Impl ;
    public final void rule__SpecialFunction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1753:1: ( rule__SpecialFunction__Group_3__1__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1754:2: rule__SpecialFunction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_3__1__Impl_in_rule__SpecialFunction__Group_3__13505);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1760:1: rule__SpecialFunction__Group_3__1__Impl : ( ( rule__SpecialFunction__ParametersAssignment_3_1 ) ) ;
    public final void rule__SpecialFunction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1764:1: ( ( ( rule__SpecialFunction__ParametersAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1765:1: ( ( rule__SpecialFunction__ParametersAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1765:1: ( ( rule__SpecialFunction__ParametersAssignment_3_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1766:1: ( rule__SpecialFunction__ParametersAssignment_3_1 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getParametersAssignment_3_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1767:1: ( rule__SpecialFunction__ParametersAssignment_3_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1767:2: rule__SpecialFunction__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__ParametersAssignment_3_1_in_rule__SpecialFunction__Group_3__1__Impl3532);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1782:1: rule__CfModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__CfModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1786:1: ( ( ruleAbstractElement ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1787:1: ( ruleAbstractElement )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1787:1: ( ruleAbstractElement )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1788:1: ruleAbstractElement
            {
             before(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment3571);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1797:1: rule__Bundle__ComponentAssignment_1 : ( ruleBundleComponent ) ;
    public final void rule__Bundle__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1801:1: ( ( ruleBundleComponent ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1802:1: ( ruleBundleComponent )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1802:1: ( ruleBundleComponent )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1803:1: ruleBundleComponent
            {
             before(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBundleComponent_in_rule__Bundle__ComponentAssignment_13602);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1812:1: rule__Bundle__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Bundle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1816:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1817:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1817:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1818:1: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_23633); 
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


    // $ANTLR start rule__Bundle__PromiseTypeAssignment_5_0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1827:1: rule__Bundle__PromiseTypeAssignment_5_0 : ( ruleBundlePromiseType ) ;
    public final void rule__Bundle__PromiseTypeAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1831:1: ( ( ruleBundlePromiseType ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1832:1: ( ruleBundlePromiseType )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1832:1: ( ruleBundlePromiseType )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1833:1: ruleBundlePromiseType
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_rule__Bundle__PromiseTypeAssignment_5_03664);
            ruleBundlePromiseType();
            _fsp--;

             after(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0_0()); 

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
    // $ANTLR end rule__Bundle__PromiseTypeAssignment_5_0


    // $ANTLR start rule__Body__ComponentAssignment_1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1842:1: rule__Body__ComponentAssignment_1 : ( ruleBodyComponent ) ;
    public final void rule__Body__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1846:1: ( ( ruleBodyComponent ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1847:1: ( ruleBodyComponent )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1847:1: ( ruleBodyComponent )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1848:1: ruleBodyComponent
            {
             before(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_rule__Body__ComponentAssignment_13695);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1857:1: rule__Body__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Body__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1861:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1862:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1862:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1863:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__NameAssignment_23726); 
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


    // $ANTLR start rule__Body__VariablesAssignment_3_1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1872:1: rule__Body__VariablesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Body__VariablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1876:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1877:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1877:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1878:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_13757); 
             after(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end rule__Body__VariablesAssignment_3_1


    // $ANTLR start rule__Body__VariablesAssignment_3_2_1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1887:1: rule__Body__VariablesAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__Body__VariablesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1891:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1892:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1892:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1893:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_2_13788); 
             after(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_2_1_0()); 

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
    // $ANTLR end rule__Body__VariablesAssignment_3_2_1


    // $ANTLR start rule__Body__PromiseTypeAssignment_5
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1902:1: rule__Body__PromiseTypeAssignment_5 : ( ruleBodyFunction ) ;
    public final void rule__Body__PromiseTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1906:1: ( ( ruleBodyFunction ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1907:1: ( ruleBodyFunction )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1907:1: ( ruleBodyFunction )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1908:1: ruleBodyFunction
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_rule__Body__PromiseTypeAssignment_53819);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1917:1: rule__BodyFunction__NameAssignment_0 : ( ruleBodyPromiseType ) ;
    public final void rule__BodyFunction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1921:1: ( ( ruleBodyPromiseType ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1922:1: ( ruleBodyPromiseType )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1922:1: ( ruleBodyPromiseType )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1923:1: ruleBodyPromiseType
            {
             before(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_rule__BodyFunction__NameAssignment_03850);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1932:1: rule__BodyFunction__ValuesAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1936:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1937:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1937:1: ( RULE_STRING )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1938:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_03881); 
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


    // $ANTLR start rule__BodyFunction__ListAssignment_2_1_0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1947:1: rule__BodyFunction__ListAssignment_2_1_0 : ( ( '{' ) ) ;
    public final void rule__BodyFunction__ListAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1951:1: ( ( ( '{' ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1952:1: ( ( '{' ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1952:1: ( ( '{' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1953:1: ( '{' )
            {
             before(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1954:1: ( '{' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1955:1: '{'
            {
             before(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); 
            match(input,16,FOLLOW_16_in_rule__BodyFunction__ListAssignment_2_1_03917); 
             after(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); 

            }

             after(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); 

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
    // $ANTLR end rule__BodyFunction__ListAssignment_2_1_0


    // $ANTLR start rule__BodyFunction__ValuesAssignment_2_1_1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1970:1: rule__BodyFunction__ValuesAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1974:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1975:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1975:1: ( RULE_STRING )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1976:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_13956); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1985:1: rule__BodyFunction__ValuesAssignment_2_1_2_1 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1989:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1990:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1990:1: ( RULE_STRING )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1991:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_2_13987); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2000:1: rule__BodyFunction__FunctionAssignment_2_2 : ( ruleSpecialFunction ) ;
    public final void rule__BodyFunction__FunctionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2004:1: ( ( ruleSpecialFunction ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2005:1: ( ruleSpecialFunction )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2005:1: ( ruleSpecialFunction )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2006:1: ruleSpecialFunction
            {
             before(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_rule__BodyFunction__FunctionAssignment_2_24018);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2015:1: rule__SpecialFunction__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SpecialFunction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2019:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2020:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2020:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2021:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__NameAssignment_04049); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2030:1: rule__SpecialFunction__ParametersAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SpecialFunction__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2034:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2035:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2035:1: ( RULE_STRING )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2036:1: RULE_STRING
            {
             before(grammarAccess.getSpecialFunctionAccess().getParametersSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecialFunction__ParametersAssignment_24080); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2045:1: rule__SpecialFunction__ParametersAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SpecialFunction__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2049:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2050:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2050:1: ( RULE_STRING )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2051:1: RULE_STRING
            {
             before(grammarAccess.getSpecialFunctionAccess().getParametersSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecialFunction__ParametersAssignment_3_14111); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2060:1: rule__BundlePromiseType__NameAssignment : ( RULE_ID ) ;
    public final void rule__BundlePromiseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2064:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2065:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2065:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2066:1: RULE_ID
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BundlePromiseType__NameAssignment4142); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2075:1: rule__BodyPromiseType__NameAssignment : ( RULE_ID ) ;
    public final void rule__BodyPromiseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2079:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2080:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2080:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2081:1: RULE_ID
            {
             before(grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyPromiseType__NameAssignment4173); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2090:1: rule__BundleComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__BundleComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2094:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2095:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2095:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2096:1: RULE_ID
            {
             before(grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BundleComponent__NameAssignment4204); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2105:1: rule__BodyComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__BodyComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2109:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2110:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2110:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:2111:1: RULE_ID
            {
             before(grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyComponent__NameAssignment4235); 
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
    public static final BitSet FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__21194 = new BitSet(new long[]{0x0000000000017C70L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__21197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__31254 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__31257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLACEHOLDER_in_rule__Bundle__Group__3__Impl1285 = new BitSet(new long[]{0x0000000000007C72L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__41316 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__41319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Bundle__Group__4__Impl1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__51378 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__6_in_rule__Bundle__Group__51381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5__0_in_rule__Bundle__Group__5__Impl1408 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Bundle__Group__6__Impl_in_rule__Bundle__Group__61439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Bundle__Group__6__Impl1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5__0__Impl_in_rule__Bundle__Group_5__01512 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5__1_in_rule__Bundle__Group_5__01515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__PromiseTypeAssignment_5_0_in_rule__Bundle__Group_5__0__Impl1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5__1__Impl_in_rule__Bundle__Group_5__11572 = new BitSet(new long[]{0x0000000000007C72L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5__2_in_rule__Bundle__Group_5__11575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Bundle__Group_5__1__Impl1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5__2__Impl_in_rule__Bundle__Group_5__21634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLACEHOLDER_in_rule__Bundle__Group_5__2__Impl1662 = new BitSet(new long[]{0x0000000000007C72L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__01699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__01702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Body__Group__0__Impl1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__11761 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__11764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__21821 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Body__Group__3_in_rule__Body__Group__21824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__NameAssignment_2_in_rule__Body__Group__2__Impl1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__31881 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Body__Group__4_in_rule__Body__Group__31884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__0_in_rule__Body__Group__3__Impl1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__41942 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_rule__Body__Group__5_in_rule__Body__Group__41945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Body__Group__4__Impl1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__52004 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Body__Group__6_in_rule__Body__Group__52007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__PromiseTypeAssignment_5_in_rule__Body__Group__5__Impl2034 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Body__Group__6__Impl_in_rule__Body__Group__62065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Body__Group__6__Impl2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__0__Impl_in_rule__Body__Group_3__02138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group_3__1_in_rule__Body__Group_3__02141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Body__Group_3__0__Impl2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__1__Impl_in_rule__Body__Group_3__12200 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Body__Group_3__2_in_rule__Body__Group_3__12203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__VariablesAssignment_3_1_in_rule__Body__Group_3__1__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__2__Impl_in_rule__Body__Group_3__22260 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Body__Group_3__3_in_rule__Body__Group_3__22263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__0_in_rule__Body__Group_3__2__Impl2290 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__3__Impl_in_rule__Body__Group_3__32321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Body__Group_3__3__Impl2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__0__Impl_in_rule__Body__Group_3_2__02388 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__1_in_rule__Body__Group_3_2__02391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Body__Group_3_2__0__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__1__Impl_in_rule__Body__Group_3_2__12450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__VariablesAssignment_3_2_1_in_rule__Body__Group_3_2__1__Impl2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__0__Impl_in_rule__BodyFunction__Group__02511 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__1_in_rule__BodyFunction__Group__02514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__NameAssignment_0_in_rule__BodyFunction__Group__0__Impl2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__1__Impl_in_rule__BodyFunction__Group__12571 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__2_in_rule__BodyFunction__Group__12574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__BodyFunction__Group__1__Impl2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__2__Impl_in_rule__BodyFunction__Group__22633 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__3_in_rule__BodyFunction__Group__22636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Alternatives_2_in_rule__BodyFunction__Group__2__Impl2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__3__Impl_in_rule__BodyFunction__Group__32693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BodyFunction__Group__3__Impl2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__0__Impl_in_rule__BodyFunction__Group_2_1__02760 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__1_in_rule__BodyFunction__Group_2_1__02763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ListAssignment_2_1_0_in_rule__BodyFunction__Group_2_1__0__Impl2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__1__Impl_in_rule__BodyFunction__Group_2_1__12820 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__2_in_rule__BodyFunction__Group_2_1__12823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_1_in_rule__BodyFunction__Group_2_1__1__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__2__Impl_in_rule__BodyFunction__Group_2_1__22880 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__3_in_rule__BodyFunction__Group_2_1__22883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__0_in_rule__BodyFunction__Group_2_1__2__Impl2910 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__3__Impl_in_rule__BodyFunction__Group_2_1__32941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BodyFunction__Group_2_1__3__Impl2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__0__Impl_in_rule__BodyFunction__Group_2_1_2__03008 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__1_in_rule__BodyFunction__Group_2_1_2__03011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BodyFunction__Group_2_1_2__0__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__1__Impl_in_rule__BodyFunction__Group_2_1_2__13070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_2_1_in_rule__BodyFunction__Group_2_1_2__1__Impl3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__0__Impl_in_rule__SpecialFunction__Group__03131 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__1_in_rule__SpecialFunction__Group__03134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__NameAssignment_0_in_rule__SpecialFunction__Group__0__Impl3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__1__Impl_in_rule__SpecialFunction__Group__13191 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__2_in_rule__SpecialFunction__Group__13194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SpecialFunction__Group__1__Impl3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__2__Impl_in_rule__SpecialFunction__Group__23253 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__3_in_rule__SpecialFunction__Group__23256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__ParametersAssignment_2_in_rule__SpecialFunction__Group__2__Impl3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__3__Impl_in_rule__SpecialFunction__Group__33313 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__4_in_rule__SpecialFunction__Group__33316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_3__0_in_rule__SpecialFunction__Group__3__Impl3343 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__4__Impl_in_rule__SpecialFunction__Group__43374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SpecialFunction__Group__4__Impl3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_3__0__Impl_in_rule__SpecialFunction__Group_3__03443 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_3__1_in_rule__SpecialFunction__Group_3__03446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SpecialFunction__Group_3__0__Impl3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_3__1__Impl_in_rule__SpecialFunction__Group_3__13505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__ParametersAssignment_3_1_in_rule__SpecialFunction__Group_3__1__Impl3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_rule__Bundle__ComponentAssignment_13602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_23633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_rule__Bundle__PromiseTypeAssignment_5_03664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_rule__Body__ComponentAssignment_13695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__NameAssignment_23726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_13757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_2_13788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_rule__Body__PromiseTypeAssignment_53819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_rule__BodyFunction__NameAssignment_03850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_03881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BodyFunction__ListAssignment_2_1_03917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_13956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_2_13987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_rule__BodyFunction__FunctionAssignment_2_24018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__NameAssignment_04049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecialFunction__ParametersAssignment_24080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecialFunction__ParametersAssignment_3_14111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BundlePromiseType__NameAssignment4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyPromiseType__NameAssignment4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BundleComponent__NameAssignment4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyComponent__NameAssignment4235 = new BitSet(new long[]{0x0000000000000002L});

}