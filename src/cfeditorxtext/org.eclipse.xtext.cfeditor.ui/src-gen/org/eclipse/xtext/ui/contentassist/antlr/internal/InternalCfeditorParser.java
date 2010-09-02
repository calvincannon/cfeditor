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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'access'", "'classes'", "'commands'", "'databases'", "'environments'", "'files'", "'inferences'", "'interfaces'", "'measurements'", "'methods'", "'occurrences'", "'outputs'", "'packages'", "'processes'", "'reports'", "'roles'", "'services'", "'storage'", "'topics'", "'vars'", "'common'", "'agent'", "'server'", "'monitor'", "'runagent'", "'executor'", "'knowledge'", "'reporter'", "'bundle'", "'{'", "'}'", "':'", "'body'", "','", "'=>'", "'control'"
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

                if ( (LA1_0==39||LA1_0==43) ) {
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


    // $ANTLR start entryRuleAbstractElement
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:89:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:90:1: ( ruleAbstractElement EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:91:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122);
            ruleAbstractElement();
            _fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement129); 

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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:98:1: ruleAbstractElement : ( rulePart ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:102:2: ( ( rulePart ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:103:1: ( rulePart )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:103:1: ( rulePart )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:104:1: rulePart
            {
             before(grammarAccess.getAbstractElementAccess().getPartParserRuleCall()); 
            pushFollow(FOLLOW_rulePart_in_ruleAbstractElement155);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:117:1: entryRulePart : rulePart EOF ;
    public final void entryRulePart() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:118:1: ( rulePart EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:119:1: rulePart EOF
            {
             before(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart181);
            rulePart();
            _fsp--;

             after(grammarAccess.getPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart188); 

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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:126:1: rulePart : ( ( rule__Part__Alternatives ) ) ;
    public final void rulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:130:2: ( ( ( rule__Part__Alternatives ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:131:1: ( ( rule__Part__Alternatives ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:131:1: ( ( rule__Part__Alternatives ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:132:1: ( rule__Part__Alternatives )
            {
             before(grammarAccess.getPartAccess().getAlternatives()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:133:1: ( rule__Part__Alternatives )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:133:2: rule__Part__Alternatives
            {
            pushFollow(FOLLOW_rule__Part__Alternatives_in_rulePart214);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:145:1: entryRuleBundle : ruleBundle EOF ;
    public final void entryRuleBundle() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:146:1: ( ruleBundle EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:147:1: ruleBundle EOF
            {
             before(grammarAccess.getBundleRule()); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle241);
            ruleBundle();
            _fsp--;

             after(grammarAccess.getBundleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle248); 

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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:154:1: ruleBundle : ( ( rule__Bundle__Group__0 ) ) ;
    public final void ruleBundle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:158:2: ( ( ( rule__Bundle__Group__0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:159:1: ( ( rule__Bundle__Group__0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:159:1: ( ( rule__Bundle__Group__0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:160:1: ( rule__Bundle__Group__0 )
            {
             before(grammarAccess.getBundleAccess().getGroup()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:161:1: ( rule__Bundle__Group__0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:161:2: rule__Bundle__Group__0
            {
            pushFollow(FOLLOW_rule__Bundle__Group__0_in_ruleBundle274);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:173:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:174:1: ( ruleBody EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:175:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody301);
            ruleBody();
            _fsp--;

             after(grammarAccess.getBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody308); 

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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:182:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:186:2: ( ( ( rule__Body__Group__0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:187:1: ( ( rule__Body__Group__0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:187:1: ( ( rule__Body__Group__0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:188:1: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:189:1: ( rule__Body__Group__0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:189:2: rule__Body__Group__0
            {
            pushFollow(FOLLOW_rule__Body__Group__0_in_ruleBody334);
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


    // $ANTLR start entryRuleMethode
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:201:1: entryRuleMethode : ruleMethode EOF ;
    public final void entryRuleMethode() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:202:1: ( ruleMethode EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:203:1: ruleMethode EOF
            {
             before(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_ruleMethode_in_entryRuleMethode361);
            ruleMethode();
            _fsp--;

             after(grammarAccess.getMethodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethode368); 

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
    // $ANTLR end entryRuleMethode


    // $ANTLR start ruleMethode
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:210:1: ruleMethode : ( ( rule__Methode__Group__0 ) ) ;
    public final void ruleMethode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:214:2: ( ( ( rule__Methode__Group__0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:215:1: ( ( rule__Methode__Group__0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:215:1: ( ( rule__Methode__Group__0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:216:1: ( rule__Methode__Group__0 )
            {
             before(grammarAccess.getMethodeAccess().getGroup()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:217:1: ( rule__Methode__Group__0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:217:2: rule__Methode__Group__0
            {
            pushFollow(FOLLOW_rule__Methode__Group__0_in_ruleMethode394);
            rule__Methode__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMethodeAccess().getGroup()); 

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
    // $ANTLR end ruleMethode


    // $ANTLR start entryRuleZuweisung
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:229:1: entryRuleZuweisung : ruleZuweisung EOF ;
    public final void entryRuleZuweisung() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:230:1: ( ruleZuweisung EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:231:1: ruleZuweisung EOF
            {
             before(grammarAccess.getZuweisungRule()); 
            pushFollow(FOLLOW_ruleZuweisung_in_entryRuleZuweisung421);
            ruleZuweisung();
            _fsp--;

             after(grammarAccess.getZuweisungRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleZuweisung428); 

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
    // $ANTLR end entryRuleZuweisung


    // $ANTLR start ruleZuweisung
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:238:1: ruleZuweisung : ( ( rule__Zuweisung__Group__0 ) ) ;
    public final void ruleZuweisung() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:242:2: ( ( ( rule__Zuweisung__Group__0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:243:1: ( ( rule__Zuweisung__Group__0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:243:1: ( ( rule__Zuweisung__Group__0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:244:1: ( rule__Zuweisung__Group__0 )
            {
             before(grammarAccess.getZuweisungAccess().getGroup()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:245:1: ( rule__Zuweisung__Group__0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:245:2: rule__Zuweisung__Group__0
            {
            pushFollow(FOLLOW_rule__Zuweisung__Group__0_in_ruleZuweisung454);
            rule__Zuweisung__Group__0();
            _fsp--;


            }

             after(grammarAccess.getZuweisungAccess().getGroup()); 

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
    // $ANTLR end ruleZuweisung


    // $ANTLR start entryRulePromiseType
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:257:1: entryRulePromiseType : rulePromiseType EOF ;
    public final void entryRulePromiseType() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:258:1: ( rulePromiseType EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:259:1: rulePromiseType EOF
            {
             before(grammarAccess.getPromiseTypeRule()); 
            pushFollow(FOLLOW_rulePromiseType_in_entryRulePromiseType481);
            rulePromiseType();
            _fsp--;

             after(grammarAccess.getPromiseTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePromiseType488); 

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
    // $ANTLR end entryRulePromiseType


    // $ANTLR start rulePromiseType
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:266:1: rulePromiseType : ( ( rule__PromiseType__NameAssignment ) ) ;
    public final void rulePromiseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:270:2: ( ( ( rule__PromiseType__NameAssignment ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:271:1: ( ( rule__PromiseType__NameAssignment ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:271:1: ( ( rule__PromiseType__NameAssignment ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:272:1: ( rule__PromiseType__NameAssignment )
            {
             before(grammarAccess.getPromiseTypeAccess().getNameAssignment()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:273:1: ( rule__PromiseType__NameAssignment )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:273:2: rule__PromiseType__NameAssignment
            {
            pushFollow(FOLLOW_rule__PromiseType__NameAssignment_in_rulePromiseType514);
            rule__PromiseType__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getPromiseTypeAccess().getNameAssignment()); 

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
    // $ANTLR end rulePromiseType


    // $ANTLR start entryRuleComponent
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:285:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:286:1: ( ruleComponent EOF )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:287:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent541);
            ruleComponent();
            _fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent548); 

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
    // $ANTLR end entryRuleComponent


    // $ANTLR start ruleComponent
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:294:1: ruleComponent : ( ( rule__Component__NameAssignment ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:298:2: ( ( ( rule__Component__NameAssignment ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:299:1: ( ( rule__Component__NameAssignment ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:299:1: ( ( rule__Component__NameAssignment ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:300:1: ( rule__Component__NameAssignment )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:301:1: ( rule__Component__NameAssignment )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:301:2: rule__Component__NameAssignment
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_in_ruleComponent574);
            rule__Component__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment()); 

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
    // $ANTLR end ruleComponent


    // $ANTLR start rule__Part__Alternatives
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:313:1: rule__Part__Alternatives : ( ( ruleBundle ) | ( ruleBody ) );
    public final void rule__Part__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:317:1: ( ( ruleBundle ) | ( ruleBody ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==39) ) {
                alt2=1;
            }
            else if ( (LA2_0==43) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("313:1: rule__Part__Alternatives : ( ( ruleBundle ) | ( ruleBody ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:318:1: ( ruleBundle )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:318:1: ( ruleBundle )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:319:1: ruleBundle
                    {
                     before(grammarAccess.getPartAccess().getBundleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBundle_in_rule__Part__Alternatives610);
                    ruleBundle();
                    _fsp--;

                     after(grammarAccess.getPartAccess().getBundleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:324:6: ( ruleBody )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:324:6: ( ruleBody )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:325:1: ruleBody
                    {
                     before(grammarAccess.getPartAccess().getBodyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBody_in_rule__Part__Alternatives627);
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


    // $ANTLR start rule__Methode__Alternatives_1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:335:1: rule__Methode__Alternatives_1 : ( ( ';' ) | ( ( rule__Methode__Group_1_1__0 ) ) );
    public final void rule__Methode__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:339:1: ( ( ';' ) | ( ( rule__Methode__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("335:1: rule__Methode__Alternatives_1 : ( ( ';' ) | ( ( rule__Methode__Group_1_1__0 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:340:1: ( ';' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:340:1: ( ';' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:341:1: ';'
                    {
                     before(grammarAccess.getMethodeAccess().getSemicolonKeyword_1_0()); 
                    match(input,10,FOLLOW_10_in_rule__Methode__Alternatives_1660); 
                     after(grammarAccess.getMethodeAccess().getSemicolonKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:348:6: ( ( rule__Methode__Group_1_1__0 ) )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:348:6: ( ( rule__Methode__Group_1_1__0 ) )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:349:1: ( rule__Methode__Group_1_1__0 )
                    {
                     before(grammarAccess.getMethodeAccess().getGroup_1_1()); 
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:350:1: ( rule__Methode__Group_1_1__0 )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:350:2: rule__Methode__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Methode__Group_1_1__0_in_rule__Methode__Alternatives_1679);
                    rule__Methode__Group_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMethodeAccess().getGroup_1_1()); 

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
    // $ANTLR end rule__Methode__Alternatives_1


    // $ANTLR start rule__Zuweisung__Alternatives_1_1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:359:1: rule__Zuweisung__Alternatives_1_1 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Zuweisung__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:363:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("359:1: rule__Zuweisung__Alternatives_1_1 : ( ( RULE_ID ) | ( RULE_STRING ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:364:1: ( RULE_ID )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:364:1: ( RULE_ID )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:365:1: RULE_ID
                    {
                     before(grammarAccess.getZuweisungAccess().getIDTerminalRuleCall_1_1_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Zuweisung__Alternatives_1_1712); 
                     after(grammarAccess.getZuweisungAccess().getIDTerminalRuleCall_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:370:6: ( RULE_STRING )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:370:6: ( RULE_STRING )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:371:1: RULE_STRING
                    {
                     before(grammarAccess.getZuweisungAccess().getSTRINGTerminalRuleCall_1_1_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Zuweisung__Alternatives_1_1729); 
                     after(grammarAccess.getZuweisungAccess().getSTRINGTerminalRuleCall_1_1_1()); 

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
    // $ANTLR end rule__Zuweisung__Alternatives_1_1


    // $ANTLR start rule__PromiseType__NameAlternatives_0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:381:1: rule__PromiseType__NameAlternatives_0 : ( ( 'access' ) | ( 'classes' ) | ( 'commands' ) | ( 'databases' ) | ( 'environments' ) | ( 'files' ) | ( 'inferences' ) | ( 'interfaces' ) | ( 'measurements' ) | ( 'methods' ) | ( 'occurrences' ) | ( 'outputs' ) | ( 'packages' ) | ( 'processes' ) | ( 'reports' ) | ( 'roles' ) | ( 'services' ) | ( 'storage' ) | ( 'topics' ) | ( 'vars' ) );
    public final void rule__PromiseType__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:385:1: ( ( 'access' ) | ( 'classes' ) | ( 'commands' ) | ( 'databases' ) | ( 'environments' ) | ( 'files' ) | ( 'inferences' ) | ( 'interfaces' ) | ( 'measurements' ) | ( 'methods' ) | ( 'occurrences' ) | ( 'outputs' ) | ( 'packages' ) | ( 'processes' ) | ( 'reports' ) | ( 'roles' ) | ( 'services' ) | ( 'storage' ) | ( 'topics' ) | ( 'vars' ) )
            int alt5=20;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
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
            case 17:
                {
                alt5=7;
                }
                break;
            case 18:
                {
                alt5=8;
                }
                break;
            case 19:
                {
                alt5=9;
                }
                break;
            case 20:
                {
                alt5=10;
                }
                break;
            case 21:
                {
                alt5=11;
                }
                break;
            case 22:
                {
                alt5=12;
                }
                break;
            case 23:
                {
                alt5=13;
                }
                break;
            case 24:
                {
                alt5=14;
                }
                break;
            case 25:
                {
                alt5=15;
                }
                break;
            case 26:
                {
                alt5=16;
                }
                break;
            case 27:
                {
                alt5=17;
                }
                break;
            case 28:
                {
                alt5=18;
                }
                break;
            case 29:
                {
                alt5=19;
                }
                break;
            case 30:
                {
                alt5=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("381:1: rule__PromiseType__NameAlternatives_0 : ( ( 'access' ) | ( 'classes' ) | ( 'commands' ) | ( 'databases' ) | ( 'environments' ) | ( 'files' ) | ( 'inferences' ) | ( 'interfaces' ) | ( 'measurements' ) | ( 'methods' ) | ( 'occurrences' ) | ( 'outputs' ) | ( 'packages' ) | ( 'processes' ) | ( 'reports' ) | ( 'roles' ) | ( 'services' ) | ( 'storage' ) | ( 'topics' ) | ( 'vars' ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:386:1: ( 'access' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:386:1: ( 'access' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:387:1: 'access'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameAccessKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__PromiseType__NameAlternatives_0762); 
                     after(grammarAccess.getPromiseTypeAccess().getNameAccessKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:394:6: ( 'classes' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:394:6: ( 'classes' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:395:1: 'classes'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameClassesKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__PromiseType__NameAlternatives_0782); 
                     after(grammarAccess.getPromiseTypeAccess().getNameClassesKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:402:6: ( 'commands' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:402:6: ( 'commands' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:403:1: 'commands'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameCommandsKeyword_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__PromiseType__NameAlternatives_0802); 
                     after(grammarAccess.getPromiseTypeAccess().getNameCommandsKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:410:6: ( 'databases' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:410:6: ( 'databases' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:411:1: 'databases'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameDatabasesKeyword_0_3()); 
                    match(input,14,FOLLOW_14_in_rule__PromiseType__NameAlternatives_0822); 
                     after(grammarAccess.getPromiseTypeAccess().getNameDatabasesKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:418:6: ( 'environments' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:418:6: ( 'environments' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:419:1: 'environments'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameEnvironmentsKeyword_0_4()); 
                    match(input,15,FOLLOW_15_in_rule__PromiseType__NameAlternatives_0842); 
                     after(grammarAccess.getPromiseTypeAccess().getNameEnvironmentsKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:426:6: ( 'files' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:426:6: ( 'files' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:427:1: 'files'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameFilesKeyword_0_5()); 
                    match(input,16,FOLLOW_16_in_rule__PromiseType__NameAlternatives_0862); 
                     after(grammarAccess.getPromiseTypeAccess().getNameFilesKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:434:6: ( 'inferences' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:434:6: ( 'inferences' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:435:1: 'inferences'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameInferencesKeyword_0_6()); 
                    match(input,17,FOLLOW_17_in_rule__PromiseType__NameAlternatives_0882); 
                     after(grammarAccess.getPromiseTypeAccess().getNameInferencesKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:442:6: ( 'interfaces' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:442:6: ( 'interfaces' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:443:1: 'interfaces'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameInterfacesKeyword_0_7()); 
                    match(input,18,FOLLOW_18_in_rule__PromiseType__NameAlternatives_0902); 
                     after(grammarAccess.getPromiseTypeAccess().getNameInterfacesKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:450:6: ( 'measurements' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:450:6: ( 'measurements' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:451:1: 'measurements'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameMeasurementsKeyword_0_8()); 
                    match(input,19,FOLLOW_19_in_rule__PromiseType__NameAlternatives_0922); 
                     after(grammarAccess.getPromiseTypeAccess().getNameMeasurementsKeyword_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:458:6: ( 'methods' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:458:6: ( 'methods' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:459:1: 'methods'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameMethodsKeyword_0_9()); 
                    match(input,20,FOLLOW_20_in_rule__PromiseType__NameAlternatives_0942); 
                     after(grammarAccess.getPromiseTypeAccess().getNameMethodsKeyword_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:466:6: ( 'occurrences' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:466:6: ( 'occurrences' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:467:1: 'occurrences'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameOccurrencesKeyword_0_10()); 
                    match(input,21,FOLLOW_21_in_rule__PromiseType__NameAlternatives_0962); 
                     after(grammarAccess.getPromiseTypeAccess().getNameOccurrencesKeyword_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:474:6: ( 'outputs' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:474:6: ( 'outputs' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:475:1: 'outputs'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameOutputsKeyword_0_11()); 
                    match(input,22,FOLLOW_22_in_rule__PromiseType__NameAlternatives_0982); 
                     after(grammarAccess.getPromiseTypeAccess().getNameOutputsKeyword_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:482:6: ( 'packages' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:482:6: ( 'packages' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:483:1: 'packages'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNamePackagesKeyword_0_12()); 
                    match(input,23,FOLLOW_23_in_rule__PromiseType__NameAlternatives_01002); 
                     after(grammarAccess.getPromiseTypeAccess().getNamePackagesKeyword_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:490:6: ( 'processes' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:490:6: ( 'processes' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:491:1: 'processes'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameProcessesKeyword_0_13()); 
                    match(input,24,FOLLOW_24_in_rule__PromiseType__NameAlternatives_01022); 
                     after(grammarAccess.getPromiseTypeAccess().getNameProcessesKeyword_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:498:6: ( 'reports' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:498:6: ( 'reports' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:499:1: 'reports'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameReportsKeyword_0_14()); 
                    match(input,25,FOLLOW_25_in_rule__PromiseType__NameAlternatives_01042); 
                     after(grammarAccess.getPromiseTypeAccess().getNameReportsKeyword_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:506:6: ( 'roles' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:506:6: ( 'roles' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:507:1: 'roles'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameRolesKeyword_0_15()); 
                    match(input,26,FOLLOW_26_in_rule__PromiseType__NameAlternatives_01062); 
                     after(grammarAccess.getPromiseTypeAccess().getNameRolesKeyword_0_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:514:6: ( 'services' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:514:6: ( 'services' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:515:1: 'services'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameServicesKeyword_0_16()); 
                    match(input,27,FOLLOW_27_in_rule__PromiseType__NameAlternatives_01082); 
                     after(grammarAccess.getPromiseTypeAccess().getNameServicesKeyword_0_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:522:6: ( 'storage' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:522:6: ( 'storage' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:523:1: 'storage'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameStorageKeyword_0_17()); 
                    match(input,28,FOLLOW_28_in_rule__PromiseType__NameAlternatives_01102); 
                     after(grammarAccess.getPromiseTypeAccess().getNameStorageKeyword_0_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:530:6: ( 'topics' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:530:6: ( 'topics' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:531:1: 'topics'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameTopicsKeyword_0_18()); 
                    match(input,29,FOLLOW_29_in_rule__PromiseType__NameAlternatives_01122); 
                     after(grammarAccess.getPromiseTypeAccess().getNameTopicsKeyword_0_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:538:6: ( 'vars' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:538:6: ( 'vars' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:539:1: 'vars'
                    {
                     before(grammarAccess.getPromiseTypeAccess().getNameVarsKeyword_0_19()); 
                    match(input,30,FOLLOW_30_in_rule__PromiseType__NameAlternatives_01142); 
                     after(grammarAccess.getPromiseTypeAccess().getNameVarsKeyword_0_19()); 

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
    // $ANTLR end rule__PromiseType__NameAlternatives_0


    // $ANTLR start rule__Component__NameAlternatives_0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:551:1: rule__Component__NameAlternatives_0 : ( ( 'common' ) | ( 'agent' ) | ( 'server' ) | ( 'monitor' ) | ( 'runagent' ) | ( 'executor' ) | ( 'knowledge' ) | ( 'reporter' ) );
    public final void rule__Component__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:555:1: ( ( 'common' ) | ( 'agent' ) | ( 'server' ) | ( 'monitor' ) | ( 'runagent' ) | ( 'executor' ) | ( 'knowledge' ) | ( 'reporter' ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 32:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            case 34:
                {
                alt6=4;
                }
                break;
            case 35:
                {
                alt6=5;
                }
                break;
            case 36:
                {
                alt6=6;
                }
                break;
            case 37:
                {
                alt6=7;
                }
                break;
            case 38:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("551:1: rule__Component__NameAlternatives_0 : ( ( 'common' ) | ( 'agent' ) | ( 'server' ) | ( 'monitor' ) | ( 'runagent' ) | ( 'executor' ) | ( 'knowledge' ) | ( 'reporter' ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:556:1: ( 'common' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:556:1: ( 'common' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:557:1: 'common'
                    {
                     before(grammarAccess.getComponentAccess().getNameCommonKeyword_0_0()); 
                    match(input,31,FOLLOW_31_in_rule__Component__NameAlternatives_01177); 
                     after(grammarAccess.getComponentAccess().getNameCommonKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:564:6: ( 'agent' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:564:6: ( 'agent' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:565:1: 'agent'
                    {
                     before(grammarAccess.getComponentAccess().getNameAgentKeyword_0_1()); 
                    match(input,32,FOLLOW_32_in_rule__Component__NameAlternatives_01197); 
                     after(grammarAccess.getComponentAccess().getNameAgentKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:572:6: ( 'server' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:572:6: ( 'server' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:573:1: 'server'
                    {
                     before(grammarAccess.getComponentAccess().getNameServerKeyword_0_2()); 
                    match(input,33,FOLLOW_33_in_rule__Component__NameAlternatives_01217); 
                     after(grammarAccess.getComponentAccess().getNameServerKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:580:6: ( 'monitor' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:580:6: ( 'monitor' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:581:1: 'monitor'
                    {
                     before(grammarAccess.getComponentAccess().getNameMonitorKeyword_0_3()); 
                    match(input,34,FOLLOW_34_in_rule__Component__NameAlternatives_01237); 
                     after(grammarAccess.getComponentAccess().getNameMonitorKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:588:6: ( 'runagent' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:588:6: ( 'runagent' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:589:1: 'runagent'
                    {
                     before(grammarAccess.getComponentAccess().getNameRunagentKeyword_0_4()); 
                    match(input,35,FOLLOW_35_in_rule__Component__NameAlternatives_01257); 
                     after(grammarAccess.getComponentAccess().getNameRunagentKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:596:6: ( 'executor' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:596:6: ( 'executor' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:597:1: 'executor'
                    {
                     before(grammarAccess.getComponentAccess().getNameExecutorKeyword_0_5()); 
                    match(input,36,FOLLOW_36_in_rule__Component__NameAlternatives_01277); 
                     after(grammarAccess.getComponentAccess().getNameExecutorKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:604:6: ( 'knowledge' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:604:6: ( 'knowledge' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:605:1: 'knowledge'
                    {
                     before(grammarAccess.getComponentAccess().getNameKnowledgeKeyword_0_6()); 
                    match(input,37,FOLLOW_37_in_rule__Component__NameAlternatives_01297); 
                     after(grammarAccess.getComponentAccess().getNameKnowledgeKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:612:6: ( 'reporter' )
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:612:6: ( 'reporter' )
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:613:1: 'reporter'
                    {
                     before(grammarAccess.getComponentAccess().getNameReporterKeyword_0_7()); 
                    match(input,38,FOLLOW_38_in_rule__Component__NameAlternatives_01317); 
                     after(grammarAccess.getComponentAccess().getNameReporterKeyword_0_7()); 

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
    // $ANTLR end rule__Component__NameAlternatives_0


    // $ANTLR start rule__Bundle__Group__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:627:1: rule__Bundle__Group__0 : rule__Bundle__Group__0__Impl rule__Bundle__Group__1 ;
    public final void rule__Bundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:631:1: ( rule__Bundle__Group__0__Impl rule__Bundle__Group__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:632:2: rule__Bundle__Group__0__Impl rule__Bundle__Group__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group__0__Impl_in_rule__Bundle__Group__01349);
            rule__Bundle__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__1_in_rule__Bundle__Group__01352);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:639:1: rule__Bundle__Group__0__Impl : ( 'bundle' ) ;
    public final void rule__Bundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:643:1: ( ( 'bundle' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:644:1: ( 'bundle' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:644:1: ( 'bundle' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:645:1: 'bundle'
            {
             before(grammarAccess.getBundleAccess().getBundleKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Bundle__Group__0__Impl1380); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:658:1: rule__Bundle__Group__1 : rule__Bundle__Group__1__Impl rule__Bundle__Group__2 ;
    public final void rule__Bundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:662:1: ( rule__Bundle__Group__1__Impl rule__Bundle__Group__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:663:2: rule__Bundle__Group__1__Impl rule__Bundle__Group__2
            {
            pushFollow(FOLLOW_rule__Bundle__Group__1__Impl_in_rule__Bundle__Group__11411);
            rule__Bundle__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__2_in_rule__Bundle__Group__11414);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:670:1: rule__Bundle__Group__1__Impl : ( ( rule__Bundle__ComponentAssignment_1 ) ) ;
    public final void rule__Bundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:674:1: ( ( ( rule__Bundle__ComponentAssignment_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:675:1: ( ( rule__Bundle__ComponentAssignment_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:675:1: ( ( rule__Bundle__ComponentAssignment_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:676:1: ( rule__Bundle__ComponentAssignment_1 )
            {
             before(grammarAccess.getBundleAccess().getComponentAssignment_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:677:1: ( rule__Bundle__ComponentAssignment_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:677:2: rule__Bundle__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Bundle__ComponentAssignment_1_in_rule__Bundle__Group__1__Impl1441);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:687:1: rule__Bundle__Group__2 : rule__Bundle__Group__2__Impl rule__Bundle__Group__3 ;
    public final void rule__Bundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:691:1: ( rule__Bundle__Group__2__Impl rule__Bundle__Group__3 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:692:2: rule__Bundle__Group__2__Impl rule__Bundle__Group__3
            {
            pushFollow(FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__21471);
            rule__Bundle__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__21474);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:699:1: rule__Bundle__Group__2__Impl : ( ( rule__Bundle__NameAssignment_2 ) ) ;
    public final void rule__Bundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:703:1: ( ( ( rule__Bundle__NameAssignment_2 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:704:1: ( ( rule__Bundle__NameAssignment_2 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:704:1: ( ( rule__Bundle__NameAssignment_2 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:705:1: ( rule__Bundle__NameAssignment_2 )
            {
             before(grammarAccess.getBundleAccess().getNameAssignment_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:706:1: ( rule__Bundle__NameAssignment_2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:706:2: rule__Bundle__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl1501);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:716:1: rule__Bundle__Group__3 : rule__Bundle__Group__3__Impl rule__Bundle__Group__4 ;
    public final void rule__Bundle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:720:1: ( rule__Bundle__Group__3__Impl rule__Bundle__Group__4 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:721:2: rule__Bundle__Group__3__Impl rule__Bundle__Group__4
            {
            pushFollow(FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__31531);
            rule__Bundle__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__31534);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:728:1: rule__Bundle__Group__3__Impl : ( '{' ) ;
    public final void rule__Bundle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:732:1: ( ( '{' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:733:1: ( '{' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:733:1: ( '{' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:734:1: '{'
            {
             before(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__Bundle__Group__3__Impl1562); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:747:1: rule__Bundle__Group__4 : rule__Bundle__Group__4__Impl rule__Bundle__Group__5 ;
    public final void rule__Bundle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:751:1: ( rule__Bundle__Group__4__Impl rule__Bundle__Group__5 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:752:2: rule__Bundle__Group__4__Impl rule__Bundle__Group__5
            {
            pushFollow(FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__41593);
            rule__Bundle__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__41596);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:759:1: rule__Bundle__Group__4__Impl : ( ( rule__Bundle__Group_4__0 )* ) ;
    public final void rule__Bundle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:763:1: ( ( ( rule__Bundle__Group_4__0 )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:764:1: ( ( rule__Bundle__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:764:1: ( ( rule__Bundle__Group_4__0 )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:765:1: ( rule__Bundle__Group_4__0 )*
            {
             before(grammarAccess.getBundleAccess().getGroup_4()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:766:1: ( rule__Bundle__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=30)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:766:2: rule__Bundle__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Bundle__Group_4__0_in_rule__Bundle__Group__4__Impl1623);
            	    rule__Bundle__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:776:1: rule__Bundle__Group__5 : rule__Bundle__Group__5__Impl ;
    public final void rule__Bundle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:780:1: ( rule__Bundle__Group__5__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:781:2: rule__Bundle__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__51654);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:787:1: rule__Bundle__Group__5__Impl : ( '}' ) ;
    public final void rule__Bundle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:791:1: ( ( '}' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:792:1: ( '}' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:792:1: ( '}' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:793:1: '}'
            {
             before(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Bundle__Group__5__Impl1682); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:818:1: rule__Bundle__Group_4__0 : rule__Bundle__Group_4__0__Impl rule__Bundle__Group_4__1 ;
    public final void rule__Bundle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:822:1: ( rule__Bundle__Group_4__0__Impl rule__Bundle__Group_4__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:823:2: rule__Bundle__Group_4__0__Impl rule__Bundle__Group_4__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group_4__0__Impl_in_rule__Bundle__Group_4__01725);
            rule__Bundle__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_4__1_in_rule__Bundle__Group_4__01728);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:830:1: rule__Bundle__Group_4__0__Impl : ( ( rule__Bundle__PromiseTypeAssignment_4_0 ) ) ;
    public final void rule__Bundle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:834:1: ( ( ( rule__Bundle__PromiseTypeAssignment_4_0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:835:1: ( ( rule__Bundle__PromiseTypeAssignment_4_0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:835:1: ( ( rule__Bundle__PromiseTypeAssignment_4_0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:836:1: ( rule__Bundle__PromiseTypeAssignment_4_0 )
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeAssignment_4_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:837:1: ( rule__Bundle__PromiseTypeAssignment_4_0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:837:2: rule__Bundle__PromiseTypeAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Bundle__PromiseTypeAssignment_4_0_in_rule__Bundle__Group_4__0__Impl1755);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:847:1: rule__Bundle__Group_4__1 : rule__Bundle__Group_4__1__Impl rule__Bundle__Group_4__2 ;
    public final void rule__Bundle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:851:1: ( rule__Bundle__Group_4__1__Impl rule__Bundle__Group_4__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:852:2: rule__Bundle__Group_4__1__Impl rule__Bundle__Group_4__2
            {
            pushFollow(FOLLOW_rule__Bundle__Group_4__1__Impl_in_rule__Bundle__Group_4__11785);
            rule__Bundle__Group_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_4__2_in_rule__Bundle__Group_4__11788);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:859:1: rule__Bundle__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Bundle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:863:1: ( ( ':' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:864:1: ( ':' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:864:1: ( ':' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:865:1: ':'
            {
             before(grammarAccess.getBundleAccess().getColonKeyword_4_1()); 
            match(input,42,FOLLOW_42_in_rule__Bundle__Group_4__1__Impl1816); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:878:1: rule__Bundle__Group_4__2 : rule__Bundle__Group_4__2__Impl ;
    public final void rule__Bundle__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:882:1: ( rule__Bundle__Group_4__2__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:883:2: rule__Bundle__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group_4__2__Impl_in_rule__Bundle__Group_4__21847);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:889:1: rule__Bundle__Group_4__2__Impl : ( ( rule__Bundle__MethodsAssignment_4_2 )* ) ;
    public final void rule__Bundle__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:893:1: ( ( ( rule__Bundle__MethodsAssignment_4_2 )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:894:1: ( ( rule__Bundle__MethodsAssignment_4_2 )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:894:1: ( ( rule__Bundle__MethodsAssignment_4_2 )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:895:1: ( rule__Bundle__MethodsAssignment_4_2 )*
            {
             before(grammarAccess.getBundleAccess().getMethodsAssignment_4_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:896:1: ( rule__Bundle__MethodsAssignment_4_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:896:2: rule__Bundle__MethodsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__Bundle__MethodsAssignment_4_2_in_rule__Bundle__Group_4__2__Impl1874);
            	    rule__Bundle__MethodsAssignment_4_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBundleAccess().getMethodsAssignment_4_2()); 

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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:912:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:916:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:917:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__01911);
            rule__Body__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__01914);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:924:1: rule__Body__Group__0__Impl : ( 'body' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:928:1: ( ( 'body' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:929:1: ( 'body' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:929:1: ( 'body' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:930:1: 'body'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Body__Group__0__Impl1942); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:943:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:947:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:948:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__11973);
            rule__Body__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__11976);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:955:1: rule__Body__Group__1__Impl : ( ( rule__Body__ComponentAssignment_1 ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:959:1: ( ( ( rule__Body__ComponentAssignment_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:960:1: ( ( rule__Body__ComponentAssignment_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:960:1: ( ( rule__Body__ComponentAssignment_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:961:1: ( rule__Body__ComponentAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getComponentAssignment_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:962:1: ( rule__Body__ComponentAssignment_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:962:2: rule__Body__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl2003);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:972:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:976:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:977:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__22033);
            rule__Body__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__3_in_rule__Body__Group__22036);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:984:1: rule__Body__Group__2__Impl : ( ( rule__Body__PromiseTypeAssignment_2 ) ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:988:1: ( ( ( rule__Body__PromiseTypeAssignment_2 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:989:1: ( ( rule__Body__PromiseTypeAssignment_2 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:989:1: ( ( rule__Body__PromiseTypeAssignment_2 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:990:1: ( rule__Body__PromiseTypeAssignment_2 )
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeAssignment_2()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:991:1: ( rule__Body__PromiseTypeAssignment_2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:991:2: rule__Body__PromiseTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Body__PromiseTypeAssignment_2_in_rule__Body__Group__2__Impl2063);
            rule__Body__PromiseTypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBodyAccess().getPromiseTypeAssignment_2()); 

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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1001:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1005:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1006:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__32093);
            rule__Body__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__4_in_rule__Body__Group__32096);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1013:1: rule__Body__Group__3__Impl : ( '{' ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1017:1: ( ( '{' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1018:1: ( '{' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1018:1: ( '{' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1019:1: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__Body__Group__3__Impl2124); 
             after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1032:1: rule__Body__Group__4 : rule__Body__Group__4__Impl ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1036:1: ( rule__Body__Group__4__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1037:2: rule__Body__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__42155);
            rule__Body__Group__4__Impl();
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1043:1: rule__Body__Group__4__Impl : ( '}' ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1047:1: ( ( '}' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1048:1: ( '}' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1048:1: ( '}' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1049:1: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__Body__Group__4__Impl2183); 
             after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start rule__Methode__Group__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1072:1: rule__Methode__Group__0 : rule__Methode__Group__0__Impl rule__Methode__Group__1 ;
    public final void rule__Methode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1076:1: ( rule__Methode__Group__0__Impl rule__Methode__Group__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1077:2: rule__Methode__Group__0__Impl rule__Methode__Group__1
            {
            pushFollow(FOLLOW_rule__Methode__Group__0__Impl_in_rule__Methode__Group__02224);
            rule__Methode__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__1_in_rule__Methode__Group__02227);
            rule__Methode__Group__1();
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
    // $ANTLR end rule__Methode__Group__0


    // $ANTLR start rule__Methode__Group__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1084:1: rule__Methode__Group__0__Impl : ( ( rule__Methode__NameAssignment_0 ) ) ;
    public final void rule__Methode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1088:1: ( ( ( rule__Methode__NameAssignment_0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1089:1: ( ( rule__Methode__NameAssignment_0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1089:1: ( ( rule__Methode__NameAssignment_0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1090:1: ( rule__Methode__NameAssignment_0 )
            {
             before(grammarAccess.getMethodeAccess().getNameAssignment_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1091:1: ( rule__Methode__NameAssignment_0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1091:2: rule__Methode__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Methode__NameAssignment_0_in_rule__Methode__Group__0__Impl2254);
            rule__Methode__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMethodeAccess().getNameAssignment_0()); 

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
    // $ANTLR end rule__Methode__Group__0__Impl


    // $ANTLR start rule__Methode__Group__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1101:1: rule__Methode__Group__1 : rule__Methode__Group__1__Impl ;
    public final void rule__Methode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1105:1: ( rule__Methode__Group__1__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1106:2: rule__Methode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Methode__Group__1__Impl_in_rule__Methode__Group__12284);
            rule__Methode__Group__1__Impl();
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
    // $ANTLR end rule__Methode__Group__1


    // $ANTLR start rule__Methode__Group__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1112:1: rule__Methode__Group__1__Impl : ( ( rule__Methode__Alternatives_1 ) ) ;
    public final void rule__Methode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1116:1: ( ( ( rule__Methode__Alternatives_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1117:1: ( ( rule__Methode__Alternatives_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1117:1: ( ( rule__Methode__Alternatives_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1118:1: ( rule__Methode__Alternatives_1 )
            {
             before(grammarAccess.getMethodeAccess().getAlternatives_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1119:1: ( rule__Methode__Alternatives_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1119:2: rule__Methode__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Methode__Alternatives_1_in_rule__Methode__Group__1__Impl2311);
            rule__Methode__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getMethodeAccess().getAlternatives_1()); 

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
    // $ANTLR end rule__Methode__Group__1__Impl


    // $ANTLR start rule__Methode__Group_1_1__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1133:1: rule__Methode__Group_1_1__0 : rule__Methode__Group_1_1__0__Impl rule__Methode__Group_1_1__1 ;
    public final void rule__Methode__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1137:1: ( rule__Methode__Group_1_1__0__Impl rule__Methode__Group_1_1__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1138:2: rule__Methode__Group_1_1__0__Impl rule__Methode__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Methode__Group_1_1__0__Impl_in_rule__Methode__Group_1_1__02345);
            rule__Methode__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Methode__Group_1_1__1_in_rule__Methode__Group_1_1__02348);
            rule__Methode__Group_1_1__1();
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
    // $ANTLR end rule__Methode__Group_1_1__0


    // $ANTLR start rule__Methode__Group_1_1__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1145:1: rule__Methode__Group_1_1__0__Impl : ( ( rule__Methode__ZuweisungAssignment_1_1_0 ) ) ;
    public final void rule__Methode__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1149:1: ( ( ( rule__Methode__ZuweisungAssignment_1_1_0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1150:1: ( ( rule__Methode__ZuweisungAssignment_1_1_0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1150:1: ( ( rule__Methode__ZuweisungAssignment_1_1_0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1151:1: ( rule__Methode__ZuweisungAssignment_1_1_0 )
            {
             before(grammarAccess.getMethodeAccess().getZuweisungAssignment_1_1_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1152:1: ( rule__Methode__ZuweisungAssignment_1_1_0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1152:2: rule__Methode__ZuweisungAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Methode__ZuweisungAssignment_1_1_0_in_rule__Methode__Group_1_1__0__Impl2375);
            rule__Methode__ZuweisungAssignment_1_1_0();
            _fsp--;


            }

             after(grammarAccess.getMethodeAccess().getZuweisungAssignment_1_1_0()); 

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
    // $ANTLR end rule__Methode__Group_1_1__0__Impl


    // $ANTLR start rule__Methode__Group_1_1__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1162:1: rule__Methode__Group_1_1__1 : rule__Methode__Group_1_1__1__Impl rule__Methode__Group_1_1__2 ;
    public final void rule__Methode__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1166:1: ( rule__Methode__Group_1_1__1__Impl rule__Methode__Group_1_1__2 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1167:2: rule__Methode__Group_1_1__1__Impl rule__Methode__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Methode__Group_1_1__1__Impl_in_rule__Methode__Group_1_1__12405);
            rule__Methode__Group_1_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Methode__Group_1_1__2_in_rule__Methode__Group_1_1__12408);
            rule__Methode__Group_1_1__2();
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
    // $ANTLR end rule__Methode__Group_1_1__1


    // $ANTLR start rule__Methode__Group_1_1__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1174:1: rule__Methode__Group_1_1__1__Impl : ( ( rule__Methode__Group_1_1_1__0 )* ) ;
    public final void rule__Methode__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1178:1: ( ( ( rule__Methode__Group_1_1_1__0 )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1179:1: ( ( rule__Methode__Group_1_1_1__0 )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1179:1: ( ( rule__Methode__Group_1_1_1__0 )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1180:1: ( rule__Methode__Group_1_1_1__0 )*
            {
             before(grammarAccess.getMethodeAccess().getGroup_1_1_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1181:1: ( rule__Methode__Group_1_1_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==44) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1181:2: rule__Methode__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Methode__Group_1_1_1__0_in_rule__Methode__Group_1_1__1__Impl2435);
            	    rule__Methode__Group_1_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMethodeAccess().getGroup_1_1_1()); 

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
    // $ANTLR end rule__Methode__Group_1_1__1__Impl


    // $ANTLR start rule__Methode__Group_1_1__2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1191:1: rule__Methode__Group_1_1__2 : rule__Methode__Group_1_1__2__Impl ;
    public final void rule__Methode__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1195:1: ( rule__Methode__Group_1_1__2__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1196:2: rule__Methode__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Methode__Group_1_1__2__Impl_in_rule__Methode__Group_1_1__22466);
            rule__Methode__Group_1_1__2__Impl();
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
    // $ANTLR end rule__Methode__Group_1_1__2


    // $ANTLR start rule__Methode__Group_1_1__2__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1202:1: rule__Methode__Group_1_1__2__Impl : ( ';' ) ;
    public final void rule__Methode__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1206:1: ( ( ';' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1207:1: ( ';' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1207:1: ( ';' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1208:1: ';'
            {
             before(grammarAccess.getMethodeAccess().getSemicolonKeyword_1_1_2()); 
            match(input,10,FOLLOW_10_in_rule__Methode__Group_1_1__2__Impl2494); 
             after(grammarAccess.getMethodeAccess().getSemicolonKeyword_1_1_2()); 

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
    // $ANTLR end rule__Methode__Group_1_1__2__Impl


    // $ANTLR start rule__Methode__Group_1_1_1__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1227:1: rule__Methode__Group_1_1_1__0 : rule__Methode__Group_1_1_1__0__Impl rule__Methode__Group_1_1_1__1 ;
    public final void rule__Methode__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1231:1: ( rule__Methode__Group_1_1_1__0__Impl rule__Methode__Group_1_1_1__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1232:2: rule__Methode__Group_1_1_1__0__Impl rule__Methode__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Methode__Group_1_1_1__0__Impl_in_rule__Methode__Group_1_1_1__02531);
            rule__Methode__Group_1_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Methode__Group_1_1_1__1_in_rule__Methode__Group_1_1_1__02534);
            rule__Methode__Group_1_1_1__1();
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
    // $ANTLR end rule__Methode__Group_1_1_1__0


    // $ANTLR start rule__Methode__Group_1_1_1__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1239:1: rule__Methode__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Methode__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1243:1: ( ( ',' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1244:1: ( ',' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1244:1: ( ',' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1245:1: ','
            {
             before(grammarAccess.getMethodeAccess().getCommaKeyword_1_1_1_0()); 
            match(input,44,FOLLOW_44_in_rule__Methode__Group_1_1_1__0__Impl2562); 
             after(grammarAccess.getMethodeAccess().getCommaKeyword_1_1_1_0()); 

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
    // $ANTLR end rule__Methode__Group_1_1_1__0__Impl


    // $ANTLR start rule__Methode__Group_1_1_1__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1258:1: rule__Methode__Group_1_1_1__1 : rule__Methode__Group_1_1_1__1__Impl ;
    public final void rule__Methode__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1262:1: ( rule__Methode__Group_1_1_1__1__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1263:2: rule__Methode__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Methode__Group_1_1_1__1__Impl_in_rule__Methode__Group_1_1_1__12593);
            rule__Methode__Group_1_1_1__1__Impl();
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
    // $ANTLR end rule__Methode__Group_1_1_1__1


    // $ANTLR start rule__Methode__Group_1_1_1__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1269:1: rule__Methode__Group_1_1_1__1__Impl : ( ( rule__Methode__ZuweisungAssignment_1_1_1_1 ) ) ;
    public final void rule__Methode__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1273:1: ( ( ( rule__Methode__ZuweisungAssignment_1_1_1_1 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1274:1: ( ( rule__Methode__ZuweisungAssignment_1_1_1_1 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1274:1: ( ( rule__Methode__ZuweisungAssignment_1_1_1_1 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1275:1: ( rule__Methode__ZuweisungAssignment_1_1_1_1 )
            {
             before(grammarAccess.getMethodeAccess().getZuweisungAssignment_1_1_1_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1276:1: ( rule__Methode__ZuweisungAssignment_1_1_1_1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1276:2: rule__Methode__ZuweisungAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__Methode__ZuweisungAssignment_1_1_1_1_in_rule__Methode__Group_1_1_1__1__Impl2620);
            rule__Methode__ZuweisungAssignment_1_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getMethodeAccess().getZuweisungAssignment_1_1_1_1()); 

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
    // $ANTLR end rule__Methode__Group_1_1_1__1__Impl


    // $ANTLR start rule__Zuweisung__Group__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1290:1: rule__Zuweisung__Group__0 : rule__Zuweisung__Group__0__Impl rule__Zuweisung__Group__1 ;
    public final void rule__Zuweisung__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1294:1: ( rule__Zuweisung__Group__0__Impl rule__Zuweisung__Group__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1295:2: rule__Zuweisung__Group__0__Impl rule__Zuweisung__Group__1
            {
            pushFollow(FOLLOW_rule__Zuweisung__Group__0__Impl_in_rule__Zuweisung__Group__02654);
            rule__Zuweisung__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Zuweisung__Group__1_in_rule__Zuweisung__Group__02657);
            rule__Zuweisung__Group__1();
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
    // $ANTLR end rule__Zuweisung__Group__0


    // $ANTLR start rule__Zuweisung__Group__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1302:1: rule__Zuweisung__Group__0__Impl : ( ( rule__Zuweisung__NameAssignment_0 ) ) ;
    public final void rule__Zuweisung__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1306:1: ( ( ( rule__Zuweisung__NameAssignment_0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1307:1: ( ( rule__Zuweisung__NameAssignment_0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1307:1: ( ( rule__Zuweisung__NameAssignment_0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1308:1: ( rule__Zuweisung__NameAssignment_0 )
            {
             before(grammarAccess.getZuweisungAccess().getNameAssignment_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1309:1: ( rule__Zuweisung__NameAssignment_0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1309:2: rule__Zuweisung__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Zuweisung__NameAssignment_0_in_rule__Zuweisung__Group__0__Impl2684);
            rule__Zuweisung__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getZuweisungAccess().getNameAssignment_0()); 

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
    // $ANTLR end rule__Zuweisung__Group__0__Impl


    // $ANTLR start rule__Zuweisung__Group__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1319:1: rule__Zuweisung__Group__1 : rule__Zuweisung__Group__1__Impl ;
    public final void rule__Zuweisung__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1323:1: ( rule__Zuweisung__Group__1__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1324:2: rule__Zuweisung__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Zuweisung__Group__1__Impl_in_rule__Zuweisung__Group__12714);
            rule__Zuweisung__Group__1__Impl();
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
    // $ANTLR end rule__Zuweisung__Group__1


    // $ANTLR start rule__Zuweisung__Group__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1330:1: rule__Zuweisung__Group__1__Impl : ( ( rule__Zuweisung__Group_1__0 )? ) ;
    public final void rule__Zuweisung__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1334:1: ( ( ( rule__Zuweisung__Group_1__0 )? ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1335:1: ( ( rule__Zuweisung__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1335:1: ( ( rule__Zuweisung__Group_1__0 )? )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1336:1: ( rule__Zuweisung__Group_1__0 )?
            {
             before(grammarAccess.getZuweisungAccess().getGroup_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1337:1: ( rule__Zuweisung__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==45) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1337:2: rule__Zuweisung__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Zuweisung__Group_1__0_in_rule__Zuweisung__Group__1__Impl2741);
                    rule__Zuweisung__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getZuweisungAccess().getGroup_1()); 

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
    // $ANTLR end rule__Zuweisung__Group__1__Impl


    // $ANTLR start rule__Zuweisung__Group_1__0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1351:1: rule__Zuweisung__Group_1__0 : rule__Zuweisung__Group_1__0__Impl rule__Zuweisung__Group_1__1 ;
    public final void rule__Zuweisung__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1355:1: ( rule__Zuweisung__Group_1__0__Impl rule__Zuweisung__Group_1__1 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1356:2: rule__Zuweisung__Group_1__0__Impl rule__Zuweisung__Group_1__1
            {
            pushFollow(FOLLOW_rule__Zuweisung__Group_1__0__Impl_in_rule__Zuweisung__Group_1__02776);
            rule__Zuweisung__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Zuweisung__Group_1__1_in_rule__Zuweisung__Group_1__02779);
            rule__Zuweisung__Group_1__1();
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
    // $ANTLR end rule__Zuweisung__Group_1__0


    // $ANTLR start rule__Zuweisung__Group_1__0__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1363:1: rule__Zuweisung__Group_1__0__Impl : ( '=>' ) ;
    public final void rule__Zuweisung__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1367:1: ( ( '=>' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1368:1: ( '=>' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1368:1: ( '=>' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1369:1: '=>'
            {
             before(grammarAccess.getZuweisungAccess().getEqualsSignGreaterThanSignKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__Zuweisung__Group_1__0__Impl2807); 
             after(grammarAccess.getZuweisungAccess().getEqualsSignGreaterThanSignKeyword_1_0()); 

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
    // $ANTLR end rule__Zuweisung__Group_1__0__Impl


    // $ANTLR start rule__Zuweisung__Group_1__1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1382:1: rule__Zuweisung__Group_1__1 : rule__Zuweisung__Group_1__1__Impl ;
    public final void rule__Zuweisung__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1386:1: ( rule__Zuweisung__Group_1__1__Impl )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1387:2: rule__Zuweisung__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Zuweisung__Group_1__1__Impl_in_rule__Zuweisung__Group_1__12838);
            rule__Zuweisung__Group_1__1__Impl();
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
    // $ANTLR end rule__Zuweisung__Group_1__1


    // $ANTLR start rule__Zuweisung__Group_1__1__Impl
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1393:1: rule__Zuweisung__Group_1__1__Impl : ( ( rule__Zuweisung__Alternatives_1_1 )* ) ;
    public final void rule__Zuweisung__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1397:1: ( ( ( rule__Zuweisung__Alternatives_1_1 )* ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1398:1: ( ( rule__Zuweisung__Alternatives_1_1 )* )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1398:1: ( ( rule__Zuweisung__Alternatives_1_1 )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1399:1: ( rule__Zuweisung__Alternatives_1_1 )*
            {
             before(grammarAccess.getZuweisungAccess().getAlternatives_1_1()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1400:1: ( rule__Zuweisung__Alternatives_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1400:2: rule__Zuweisung__Alternatives_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Zuweisung__Alternatives_1_1_in_rule__Zuweisung__Group_1__1__Impl2865);
            	    rule__Zuweisung__Alternatives_1_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getZuweisungAccess().getAlternatives_1_1()); 

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
    // $ANTLR end rule__Zuweisung__Group_1__1__Impl


    // $ANTLR start rule__CfModel__ElementsAssignment
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1415:1: rule__CfModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__CfModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1419:1: ( ( ruleAbstractElement ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1420:1: ( ruleAbstractElement )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1420:1: ( ruleAbstractElement )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1421:1: ruleAbstractElement
            {
             before(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment2905);
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1430:1: rule__Bundle__ComponentAssignment_1 : ( ruleComponent ) ;
    public final void rule__Bundle__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1434:1: ( ( ruleComponent ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1435:1: ( ruleComponent )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1435:1: ( ruleComponent )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1436:1: ruleComponent
            {
             before(grammarAccess.getBundleAccess().getComponentComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Bundle__ComponentAssignment_12936);
            ruleComponent();
            _fsp--;

             after(grammarAccess.getBundleAccess().getComponentComponentParserRuleCall_1_0()); 

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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1445:1: rule__Bundle__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Bundle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1449:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1450:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1450:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1451:1: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_22967); 
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
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1460:1: rule__Bundle__PromiseTypeAssignment_4_0 : ( rulePromiseType ) ;
    public final void rule__Bundle__PromiseTypeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1464:1: ( ( rulePromiseType ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1465:1: ( rulePromiseType )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1465:1: ( rulePromiseType )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1466:1: rulePromiseType
            {
             before(grammarAccess.getBundleAccess().getPromiseTypePromiseTypeParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_rulePromiseType_in_rule__Bundle__PromiseTypeAssignment_4_02998);
            rulePromiseType();
            _fsp--;

             after(grammarAccess.getBundleAccess().getPromiseTypePromiseTypeParserRuleCall_4_0_0()); 

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


    // $ANTLR start rule__Bundle__MethodsAssignment_4_2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1475:1: rule__Bundle__MethodsAssignment_4_2 : ( ruleMethode ) ;
    public final void rule__Bundle__MethodsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1479:1: ( ( ruleMethode ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1480:1: ( ruleMethode )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1480:1: ( ruleMethode )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1481:1: ruleMethode
            {
             before(grammarAccess.getBundleAccess().getMethodsMethodeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleMethode_in_rule__Bundle__MethodsAssignment_4_23029);
            ruleMethode();
            _fsp--;

             after(grammarAccess.getBundleAccess().getMethodsMethodeParserRuleCall_4_2_0()); 

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
    // $ANTLR end rule__Bundle__MethodsAssignment_4_2


    // $ANTLR start rule__Body__ComponentAssignment_1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1490:1: rule__Body__ComponentAssignment_1 : ( ruleComponent ) ;
    public final void rule__Body__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1494:1: ( ( ruleComponent ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1495:1: ( ruleComponent )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1495:1: ( ruleComponent )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1496:1: ruleComponent
            {
             before(grammarAccess.getBodyAccess().getComponentComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Body__ComponentAssignment_13060);
            ruleComponent();
            _fsp--;

             after(grammarAccess.getBodyAccess().getComponentComponentParserRuleCall_1_0()); 

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


    // $ANTLR start rule__Body__PromiseTypeAssignment_2
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1505:1: rule__Body__PromiseTypeAssignment_2 : ( ( 'control' ) ) ;
    public final void rule__Body__PromiseTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1509:1: ( ( ( 'control' ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1510:1: ( ( 'control' ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1510:1: ( ( 'control' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1511:1: ( 'control' )
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeControlKeyword_2_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1512:1: ( 'control' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1513:1: 'control'
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeControlKeyword_2_0()); 
            match(input,46,FOLLOW_46_in_rule__Body__PromiseTypeAssignment_23096); 
             after(grammarAccess.getBodyAccess().getPromiseTypeControlKeyword_2_0()); 

            }

             after(grammarAccess.getBodyAccess().getPromiseTypeControlKeyword_2_0()); 

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
    // $ANTLR end rule__Body__PromiseTypeAssignment_2


    // $ANTLR start rule__Methode__NameAssignment_0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1528:1: rule__Methode__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Methode__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1532:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1533:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1533:1: ( RULE_STRING )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1534:1: RULE_STRING
            {
             before(grammarAccess.getMethodeAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Methode__NameAssignment_03135); 
             after(grammarAccess.getMethodeAccess().getNameSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__Methode__NameAssignment_0


    // $ANTLR start rule__Methode__ZuweisungAssignment_1_1_0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1543:1: rule__Methode__ZuweisungAssignment_1_1_0 : ( ruleZuweisung ) ;
    public final void rule__Methode__ZuweisungAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1547:1: ( ( ruleZuweisung ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1548:1: ( ruleZuweisung )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1548:1: ( ruleZuweisung )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1549:1: ruleZuweisung
            {
             before(grammarAccess.getMethodeAccess().getZuweisungZuweisungParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_ruleZuweisung_in_rule__Methode__ZuweisungAssignment_1_1_03166);
            ruleZuweisung();
            _fsp--;

             after(grammarAccess.getMethodeAccess().getZuweisungZuweisungParserRuleCall_1_1_0_0()); 

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
    // $ANTLR end rule__Methode__ZuweisungAssignment_1_1_0


    // $ANTLR start rule__Methode__ZuweisungAssignment_1_1_1_1
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1558:1: rule__Methode__ZuweisungAssignment_1_1_1_1 : ( ruleZuweisung ) ;
    public final void rule__Methode__ZuweisungAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1562:1: ( ( ruleZuweisung ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1563:1: ( ruleZuweisung )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1563:1: ( ruleZuweisung )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1564:1: ruleZuweisung
            {
             before(grammarAccess.getMethodeAccess().getZuweisungZuweisungParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_ruleZuweisung_in_rule__Methode__ZuweisungAssignment_1_1_1_13197);
            ruleZuweisung();
            _fsp--;

             after(grammarAccess.getMethodeAccess().getZuweisungZuweisungParserRuleCall_1_1_1_1_0()); 

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
    // $ANTLR end rule__Methode__ZuweisungAssignment_1_1_1_1


    // $ANTLR start rule__Zuweisung__NameAssignment_0
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1573:1: rule__Zuweisung__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Zuweisung__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1577:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1578:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1578:1: ( RULE_ID )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1579:1: RULE_ID
            {
             before(grammarAccess.getZuweisungAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Zuweisung__NameAssignment_03228); 
             after(grammarAccess.getZuweisungAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__Zuweisung__NameAssignment_0


    // $ANTLR start rule__PromiseType__NameAssignment
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1588:1: rule__PromiseType__NameAssignment : ( ( rule__PromiseType__NameAlternatives_0 ) ) ;
    public final void rule__PromiseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1592:1: ( ( ( rule__PromiseType__NameAlternatives_0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1593:1: ( ( rule__PromiseType__NameAlternatives_0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1593:1: ( ( rule__PromiseType__NameAlternatives_0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1594:1: ( rule__PromiseType__NameAlternatives_0 )
            {
             before(grammarAccess.getPromiseTypeAccess().getNameAlternatives_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1595:1: ( rule__PromiseType__NameAlternatives_0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1595:2: rule__PromiseType__NameAlternatives_0
            {
            pushFollow(FOLLOW_rule__PromiseType__NameAlternatives_0_in_rule__PromiseType__NameAssignment3259);
            rule__PromiseType__NameAlternatives_0();
            _fsp--;


            }

             after(grammarAccess.getPromiseTypeAccess().getNameAlternatives_0()); 

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
    // $ANTLR end rule__PromiseType__NameAssignment


    // $ANTLR start rule__Component__NameAssignment
    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1604:1: rule__Component__NameAssignment : ( ( rule__Component__NameAlternatives_0 ) ) ;
    public final void rule__Component__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1608:1: ( ( ( rule__Component__NameAlternatives_0 ) ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1609:1: ( ( rule__Component__NameAlternatives_0 ) )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1609:1: ( ( rule__Component__NameAlternatives_0 ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1610:1: ( rule__Component__NameAlternatives_0 )
            {
             before(grammarAccess.getComponentAccess().getNameAlternatives_0()); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1611:1: ( rule__Component__NameAlternatives_0 )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1611:2: rule__Component__NameAlternatives_0
            {
            pushFollow(FOLLOW_rule__Component__NameAlternatives_0_in_rule__Component__NameAssignment3292);
            rule__Component__NameAlternatives_0();
            _fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAlternatives_0()); 

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
    // $ANTLR end rule__Component__NameAssignment


 

    public static final BitSet FOLLOW_ruleCfModel_in_entryRuleCfModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCfModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CfModel__ElementsAssignment_in_ruleCfModel94 = new BitSet(new long[]{0x0000088000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_ruleAbstractElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Alternatives_in_rulePart214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__0_in_ruleBundle274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0_in_ruleBody334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethode_in_entryRuleMethode361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethode368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__0_in_ruleMethode394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZuweisung_in_entryRuleZuweisung421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZuweisung428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Zuweisung__Group__0_in_ruleZuweisung454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseType_in_entryRulePromiseType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePromiseType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseType__NameAssignment_in_rulePromiseType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_in_ruleComponent574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_rule__Part__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__Part__Alternatives627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Methode__Alternatives_1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_1_1__0_in_rule__Methode__Alternatives_1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Zuweisung__Alternatives_1_1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Zuweisung__Alternatives_1_1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PromiseType__NameAlternatives_0762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PromiseType__NameAlternatives_0782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PromiseType__NameAlternatives_0802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PromiseType__NameAlternatives_0822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PromiseType__NameAlternatives_0842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PromiseType__NameAlternatives_0862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PromiseType__NameAlternatives_0882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PromiseType__NameAlternatives_0902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PromiseType__NameAlternatives_0922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PromiseType__NameAlternatives_0942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PromiseType__NameAlternatives_0962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PromiseType__NameAlternatives_0982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PromiseType__NameAlternatives_01002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PromiseType__NameAlternatives_01022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PromiseType__NameAlternatives_01042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PromiseType__NameAlternatives_01062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PromiseType__NameAlternatives_01082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PromiseType__NameAlternatives_01102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PromiseType__NameAlternatives_01122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PromiseType__NameAlternatives_01142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Component__NameAlternatives_01177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Component__NameAlternatives_01197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Component__NameAlternatives_01217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Component__NameAlternatives_01237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Component__NameAlternatives_01257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Component__NameAlternatives_01277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Component__NameAlternatives_01297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Component__NameAlternatives_01317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__0__Impl_in_rule__Bundle__Group__01349 = new BitSet(new long[]{0x0000007F80000000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__1_in_rule__Bundle__Group__01352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Bundle__Group__0__Impl1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__1__Impl_in_rule__Bundle__Group__11411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Bundle__Group__2_in_rule__Bundle__Group__11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__ComponentAssignment_1_in_rule__Bundle__Group__1__Impl1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__21471 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__21474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__31531 = new BitSet(new long[]{0x000002007FFFF800L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__31534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Bundle__Group__3__Impl1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__41593 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__41596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_4__0_in_rule__Bundle__Group__4__Impl1623 = new BitSet(new long[]{0x000000007FFFF802L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__51654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Bundle__Group__5__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_4__0__Impl_in_rule__Bundle__Group_4__01725 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Bundle__Group_4__1_in_rule__Bundle__Group_4__01728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__PromiseTypeAssignment_4_0_in_rule__Bundle__Group_4__0__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_4__1__Impl_in_rule__Bundle__Group_4__11785 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Bundle__Group_4__2_in_rule__Bundle__Group_4__11788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Bundle__Group_4__1__Impl1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_4__2__Impl_in_rule__Bundle__Group_4__21847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__MethodsAssignment_4_2_in_rule__Bundle__Group_4__2__Impl1874 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__01911 = new BitSet(new long[]{0x0000007F80000000L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__01914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Body__Group__0__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__11973 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__22033 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Body__Group__3_in_rule__Body__Group__22036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__PromiseTypeAssignment_2_in_rule__Body__Group__2__Impl2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__32093 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Body__Group__4_in_rule__Body__Group__32096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Body__Group__3__Impl2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__42155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Body__Group__4__Impl2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__0__Impl_in_rule__Methode__Group__02224 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Methode__Group__1_in_rule__Methode__Group__02227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__NameAssignment_0_in_rule__Methode__Group__0__Impl2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__1__Impl_in_rule__Methode__Group__12284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Alternatives_1_in_rule__Methode__Group__1__Impl2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_1_1__0__Impl_in_rule__Methode__Group_1_1__02345 = new BitSet(new long[]{0x0000100000000400L});
    public static final BitSet FOLLOW_rule__Methode__Group_1_1__1_in_rule__Methode__Group_1_1__02348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__ZuweisungAssignment_1_1_0_in_rule__Methode__Group_1_1__0__Impl2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_1_1__1__Impl_in_rule__Methode__Group_1_1__12405 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Methode__Group_1_1__2_in_rule__Methode__Group_1_1__12408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_1_1_1__0_in_rule__Methode__Group_1_1__1__Impl2435 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_1_1__2__Impl_in_rule__Methode__Group_1_1__22466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Methode__Group_1_1__2__Impl2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_1_1_1__0__Impl_in_rule__Methode__Group_1_1_1__02531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Methode__Group_1_1_1__1_in_rule__Methode__Group_1_1_1__02534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Methode__Group_1_1_1__0__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_1_1_1__1__Impl_in_rule__Methode__Group_1_1_1__12593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__ZuweisungAssignment_1_1_1_1_in_rule__Methode__Group_1_1_1__1__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Zuweisung__Group__0__Impl_in_rule__Zuweisung__Group__02654 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__Zuweisung__Group__1_in_rule__Zuweisung__Group__02657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Zuweisung__NameAssignment_0_in_rule__Zuweisung__Group__0__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Zuweisung__Group__1__Impl_in_rule__Zuweisung__Group__12714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Zuweisung__Group_1__0_in_rule__Zuweisung__Group__1__Impl2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Zuweisung__Group_1__0__Impl_in_rule__Zuweisung__Group_1__02776 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Zuweisung__Group_1__1_in_rule__Zuweisung__Group_1__02779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Zuweisung__Group_1__0__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Zuweisung__Group_1__1__Impl_in_rule__Zuweisung__Group_1__12838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Zuweisung__Alternatives_1_1_in_rule__Zuweisung__Group_1__1__Impl2865 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Bundle__ComponentAssignment_12936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_22967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseType_in_rule__Bundle__PromiseTypeAssignment_4_02998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethode_in_rule__Bundle__MethodsAssignment_4_23029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Body__ComponentAssignment_13060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Body__PromiseTypeAssignment_23096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Methode__NameAssignment_03135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZuweisung_in_rule__Methode__ZuweisungAssignment_1_1_03166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZuweisung_in_rule__Methode__ZuweisungAssignment_1_1_1_13197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Zuweisung__NameAssignment_03228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseType__NameAlternatives_0_in_rule__PromiseType__NameAssignment3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAlternatives_0_in_rule__Component__NameAssignment3292 = new BitSet(new long[]{0x0000000000000002L});

}