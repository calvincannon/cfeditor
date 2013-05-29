package org.cfeditor.cfengine.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.cfeditor.cfengine.services.CfengineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfengineParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_INT", "RULE_ML_COMMENT", "','", "'.'", "'!'", "'('", "')'", "'bundle'", "'{'", "'}'", "':'", "'::'", "';'", "'=>'", "'@'", "'body'", "'$('", "'${'"
    };
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=4;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
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
    public String getGrammarFileName() { return "../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g"; }


     
     	private CfengineGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CfengineGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleCfModel"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:60:1: entryRuleCfModel : ruleCfModel EOF ;
    public final void entryRuleCfModel() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:61:1: ( ruleCfModel EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:62:1: ruleCfModel EOF
            {
             before(grammarAccess.getCfModelRule()); 
            pushFollow(FOLLOW_ruleCfModel_in_entryRuleCfModel61);
            ruleCfModel();

            state._fsp--;

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
    // $ANTLR end "entryRuleCfModel"


    // $ANTLR start "ruleCfModel"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:69:1: ruleCfModel : ( ( rule__CfModel__ElementsAssignment )* ) ;
    public final void ruleCfModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:73:2: ( ( ( rule__CfModel__ElementsAssignment )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:74:1: ( ( rule__CfModel__ElementsAssignment )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:74:1: ( ( rule__CfModel__ElementsAssignment )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:75:1: ( rule__CfModel__ElementsAssignment )*
            {
             before(grammarAccess.getCfModelAccess().getElementsAssignment()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:76:1: ( rule__CfModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:76:2: rule__CfModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__CfModel__ElementsAssignment_in_ruleCfModel94);
            	    rule__CfModel__ElementsAssignment();

            	    state._fsp--;


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
    // $ANTLR end "ruleCfModel"


    // $ANTLR start "entryRuleCLASS_ID"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:88:1: entryRuleCLASS_ID : ruleCLASS_ID EOF ;
    public final void entryRuleCLASS_ID() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:89:1: ( ruleCLASS_ID EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:90:1: ruleCLASS_ID EOF
            {
             before(grammarAccess.getCLASS_IDRule()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_entryRuleCLASS_ID122);
            ruleCLASS_ID();

            state._fsp--;

             after(grammarAccess.getCLASS_IDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCLASS_ID129); 

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
    // $ANTLR end "entryRuleCLASS_ID"


    // $ANTLR start "ruleCLASS_ID"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:97:1: ruleCLASS_ID : ( ( rule__CLASS_ID__Alternatives ) ) ;
    public final void ruleCLASS_ID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:101:2: ( ( ( rule__CLASS_ID__Alternatives ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:102:1: ( ( rule__CLASS_ID__Alternatives ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:102:1: ( ( rule__CLASS_ID__Alternatives ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:103:1: ( rule__CLASS_ID__Alternatives )
            {
             before(grammarAccess.getCLASS_IDAccess().getAlternatives()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:104:1: ( rule__CLASS_ID__Alternatives )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:104:2: rule__CLASS_ID__Alternatives
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Alternatives_in_ruleCLASS_ID155);
            rule__CLASS_ID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCLASS_IDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCLASS_ID"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:116:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:117:1: ( ruleAbstractElement EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:118:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement182);
            ruleAbstractElement();

            state._fsp--;

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:125:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:129:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:130:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:130:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:131:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:132:1: ( rule__AbstractElement__Alternatives )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:132:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement215);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleBundle"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:144:1: entryRuleBundle : ruleBundle EOF ;
    public final void entryRuleBundle() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:145:1: ( ruleBundle EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:146:1: ruleBundle EOF
            {
             before(grammarAccess.getBundleRule()); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle242);
            ruleBundle();

            state._fsp--;

             after(grammarAccess.getBundleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle249); 

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
    // $ANTLR end "entryRuleBundle"


    // $ANTLR start "ruleBundle"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:153:1: ruleBundle : ( ( rule__Bundle__Group__0 ) ) ;
    public final void ruleBundle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:157:2: ( ( ( rule__Bundle__Group__0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:158:1: ( ( rule__Bundle__Group__0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:158:1: ( ( rule__Bundle__Group__0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:159:1: ( rule__Bundle__Group__0 )
            {
             before(grammarAccess.getBundleAccess().getGroup()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:160:1: ( rule__Bundle__Group__0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:160:2: rule__Bundle__Group__0
            {
            pushFollow(FOLLOW_rule__Bundle__Group__0_in_ruleBundle275);
            rule__Bundle__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleBundle"


    // $ANTLR start "entryRuleBundlePromiseType"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:172:1: entryRuleBundlePromiseType : ruleBundlePromiseType EOF ;
    public final void entryRuleBundlePromiseType() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:173:1: ( ruleBundlePromiseType EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:174:1: ruleBundlePromiseType EOF
            {
             before(grammarAccess.getBundlePromiseTypeRule()); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType302);
            ruleBundlePromiseType();

            state._fsp--;

             after(grammarAccess.getBundlePromiseTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromiseType309); 

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
    // $ANTLR end "entryRuleBundlePromiseType"


    // $ANTLR start "ruleBundlePromiseType"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:181:1: ruleBundlePromiseType : ( ( rule__BundlePromiseType__Group__0 ) ) ;
    public final void ruleBundlePromiseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:185:2: ( ( ( rule__BundlePromiseType__Group__0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:186:1: ( ( rule__BundlePromiseType__Group__0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:186:1: ( ( rule__BundlePromiseType__Group__0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:187:1: ( rule__BundlePromiseType__Group__0 )
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getGroup()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:188:1: ( rule__BundlePromiseType__Group__0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:188:2: rule__BundlePromiseType__Group__0
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__0_in_ruleBundlePromiseType335);
            rule__BundlePromiseType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBundlePromiseTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleBundlePromiseType"


    // $ANTLR start "entryRuleBundleClass"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:200:1: entryRuleBundleClass : ruleBundleClass EOF ;
    public final void entryRuleBundleClass() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:201:1: ( ruleBundleClass EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:202:1: ruleBundleClass EOF
            {
             before(grammarAccess.getBundleClassRule()); 
            pushFollow(FOLLOW_ruleBundleClass_in_entryRuleBundleClass362);
            ruleBundleClass();

            state._fsp--;

             after(grammarAccess.getBundleClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleClass369); 

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
    // $ANTLR end "entryRuleBundleClass"


    // $ANTLR start "ruleBundleClass"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:209:1: ruleBundleClass : ( ( rule__BundleClass__Group__0 ) ) ;
    public final void ruleBundleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:213:2: ( ( ( rule__BundleClass__Group__0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:214:1: ( ( rule__BundleClass__Group__0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:214:1: ( ( rule__BundleClass__Group__0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:215:1: ( rule__BundleClass__Group__0 )
            {
             before(grammarAccess.getBundleClassAccess().getGroup()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:216:1: ( rule__BundleClass__Group__0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:216:2: rule__BundleClass__Group__0
            {
            pushFollow(FOLLOW_rule__BundleClass__Group__0_in_ruleBundleClass395);
            rule__BundleClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBundleClassAccess().getGroup()); 

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
    // $ANTLR end "ruleBundleClass"


    // $ANTLR start "entryRuleBundlePromise"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:228:1: entryRuleBundlePromise : ruleBundlePromise EOF ;
    public final void entryRuleBundlePromise() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:229:1: ( ruleBundlePromise EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:230:1: ruleBundlePromise EOF
            {
             before(grammarAccess.getBundlePromiseRule()); 
            pushFollow(FOLLOW_ruleBundlePromise_in_entryRuleBundlePromise422);
            ruleBundlePromise();

            state._fsp--;

             after(grammarAccess.getBundlePromiseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromise429); 

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
    // $ANTLR end "entryRuleBundlePromise"


    // $ANTLR start "ruleBundlePromise"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:237:1: ruleBundlePromise : ( ( rule__BundlePromise__Group__0 ) ) ;
    public final void ruleBundlePromise() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:241:2: ( ( ( rule__BundlePromise__Group__0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:242:1: ( ( rule__BundlePromise__Group__0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:242:1: ( ( rule__BundlePromise__Group__0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:243:1: ( rule__BundlePromise__Group__0 )
            {
             before(grammarAccess.getBundlePromiseAccess().getGroup()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:244:1: ( rule__BundlePromise__Group__0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:244:2: rule__BundlePromise__Group__0
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group__0_in_ruleBundlePromise455);
            rule__BundlePromise__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBundlePromiseAccess().getGroup()); 

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
    // $ANTLR end "ruleBundlePromise"


    // $ANTLR start "entryRulePromiseValue"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:256:1: entryRulePromiseValue : rulePromiseValue EOF ;
    public final void entryRulePromiseValue() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:257:1: ( rulePromiseValue EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:258:1: rulePromiseValue EOF
            {
             before(grammarAccess.getPromiseValueRule()); 
            pushFollow(FOLLOW_rulePromiseValue_in_entryRulePromiseValue482);
            rulePromiseValue();

            state._fsp--;

             after(grammarAccess.getPromiseValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePromiseValue489); 

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
    // $ANTLR end "entryRulePromiseValue"


    // $ANTLR start "rulePromiseValue"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:265:1: rulePromiseValue : ( ( rule__PromiseValue__Group__0 ) ) ;
    public final void rulePromiseValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:269:2: ( ( ( rule__PromiseValue__Group__0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:270:1: ( ( rule__PromiseValue__Group__0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:270:1: ( ( rule__PromiseValue__Group__0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:271:1: ( rule__PromiseValue__Group__0 )
            {
             before(grammarAccess.getPromiseValueAccess().getGroup()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:272:1: ( rule__PromiseValue__Group__0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:272:2: rule__PromiseValue__Group__0
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group__0_in_rulePromiseValue515);
            rule__PromiseValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPromiseValueAccess().getGroup()); 

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
    // $ANTLR end "rulePromiseValue"


    // $ANTLR start "entryRuleBody"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:284:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:285:1: ( ruleBody EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:286:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody542);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody549); 

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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:293:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:297:2: ( ( ( rule__Body__Group__0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:298:1: ( ( rule__Body__Group__0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:298:1: ( ( rule__Body__Group__0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:299:1: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:300:1: ( rule__Body__Group__0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:300:2: rule__Body__Group__0
            {
            pushFollow(FOLLOW_rule__Body__Group__0_in_ruleBody575);
            rule__Body__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleBodyClass"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:312:1: entryRuleBodyClass : ruleBodyClass EOF ;
    public final void entryRuleBodyClass() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:313:1: ( ruleBodyClass EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:314:1: ruleBodyClass EOF
            {
             before(grammarAccess.getBodyClassRule()); 
            pushFollow(FOLLOW_ruleBodyClass_in_entryRuleBodyClass602);
            ruleBodyClass();

            state._fsp--;

             after(grammarAccess.getBodyClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyClass609); 

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
    // $ANTLR end "entryRuleBodyClass"


    // $ANTLR start "ruleBodyClass"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:321:1: ruleBodyClass : ( ( rule__BodyClass__Group__0 ) ) ;
    public final void ruleBodyClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:325:2: ( ( ( rule__BodyClass__Group__0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:326:1: ( ( rule__BodyClass__Group__0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:326:1: ( ( rule__BodyClass__Group__0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:327:1: ( rule__BodyClass__Group__0 )
            {
             before(grammarAccess.getBodyClassAccess().getGroup()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:328:1: ( rule__BodyClass__Group__0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:328:2: rule__BodyClass__Group__0
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__0_in_ruleBodyClass635);
            rule__BodyClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyClassAccess().getGroup()); 

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
    // $ANTLR end "ruleBodyClass"


    // $ANTLR start "entryRuleBodyFunction"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:340:1: entryRuleBodyFunction : ruleBodyFunction EOF ;
    public final void entryRuleBodyFunction() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:341:1: ( ruleBodyFunction EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:342:1: ruleBodyFunction EOF
            {
             before(grammarAccess.getBodyFunctionRule()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction662);
            ruleBodyFunction();

            state._fsp--;

             after(grammarAccess.getBodyFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyFunction669); 

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
    // $ANTLR end "entryRuleBodyFunction"


    // $ANTLR start "ruleBodyFunction"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:349:1: ruleBodyFunction : ( ( rule__BodyFunction__Group__0 ) ) ;
    public final void ruleBodyFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:353:2: ( ( ( rule__BodyFunction__Group__0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:354:1: ( ( rule__BodyFunction__Group__0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:354:1: ( ( rule__BodyFunction__Group__0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:355:1: ( rule__BodyFunction__Group__0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getGroup()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:356:1: ( rule__BodyFunction__Group__0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:356:2: rule__BodyFunction__Group__0
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__0_in_ruleBodyFunction695);
            rule__BodyFunction__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleBodyFunction"


    // $ANTLR start "entryRuleSimpleFunction"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:368:1: entryRuleSimpleFunction : ruleSimpleFunction EOF ;
    public final void entryRuleSimpleFunction() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:369:1: ( ruleSimpleFunction EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:370:1: ruleSimpleFunction EOF
            {
             before(grammarAccess.getSimpleFunctionRule()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_entryRuleSimpleFunction722);
            ruleSimpleFunction();

            state._fsp--;

             after(grammarAccess.getSimpleFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFunction729); 

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
    // $ANTLR end "entryRuleSimpleFunction"


    // $ANTLR start "ruleSimpleFunction"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:377:1: ruleSimpleFunction : ( ( rule__SimpleFunction__Group__0 ) ) ;
    public final void ruleSimpleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:381:2: ( ( ( rule__SimpleFunction__Group__0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:382:1: ( ( rule__SimpleFunction__Group__0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:382:1: ( ( rule__SimpleFunction__Group__0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:383:1: ( rule__SimpleFunction__Group__0 )
            {
             before(grammarAccess.getSimpleFunctionAccess().getGroup()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:384:1: ( rule__SimpleFunction__Group__0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:384:2: rule__SimpleFunction__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__0_in_ruleSimpleFunction755);
            rule__SimpleFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleFunction"


    // $ANTLR start "entryRuleSpecialFunction"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:396:1: entryRuleSpecialFunction : ruleSpecialFunction EOF ;
    public final void entryRuleSpecialFunction() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:397:1: ( ruleSpecialFunction EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:398:1: ruleSpecialFunction EOF
            {
             before(grammarAccess.getSpecialFunctionRule()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction782);
            ruleSpecialFunction();

            state._fsp--;

             after(grammarAccess.getSpecialFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialFunction789); 

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
    // $ANTLR end "entryRuleSpecialFunction"


    // $ANTLR start "ruleSpecialFunction"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:405:1: ruleSpecialFunction : ( ( rule__SpecialFunction__Group__0 ) ) ;
    public final void ruleSpecialFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:409:2: ( ( ( rule__SpecialFunction__Group__0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:410:1: ( ( rule__SpecialFunction__Group__0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:410:1: ( ( rule__SpecialFunction__Group__0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:411:1: ( rule__SpecialFunction__Group__0 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getGroup()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:412:1: ( rule__SpecialFunction__Group__0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:412:2: rule__SpecialFunction__Group__0
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__0_in_ruleSpecialFunction815);
            rule__SpecialFunction__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleSpecialFunction"


    // $ANTLR start "entryRuleBodyPromiseType"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:424:1: entryRuleBodyPromiseType : ruleBodyPromiseType EOF ;
    public final void entryRuleBodyPromiseType() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:425:1: ( ruleBodyPromiseType EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:426:1: ruleBodyPromiseType EOF
            {
             before(grammarAccess.getBodyPromiseTypeRule()); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType842);
            ruleBodyPromiseType();

            state._fsp--;

             after(grammarAccess.getBodyPromiseTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyPromiseType849); 

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
    // $ANTLR end "entryRuleBodyPromiseType"


    // $ANTLR start "ruleBodyPromiseType"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:433:1: ruleBodyPromiseType : ( ( rule__BodyPromiseType__NameAssignment ) ) ;
    public final void ruleBodyPromiseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:437:2: ( ( ( rule__BodyPromiseType__NameAssignment ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:438:1: ( ( rule__BodyPromiseType__NameAssignment ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:438:1: ( ( rule__BodyPromiseType__NameAssignment ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:439:1: ( rule__BodyPromiseType__NameAssignment )
            {
             before(grammarAccess.getBodyPromiseTypeAccess().getNameAssignment()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:440:1: ( rule__BodyPromiseType__NameAssignment )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:440:2: rule__BodyPromiseType__NameAssignment
            {
            pushFollow(FOLLOW_rule__BodyPromiseType__NameAssignment_in_ruleBodyPromiseType875);
            rule__BodyPromiseType__NameAssignment();

            state._fsp--;


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
    // $ANTLR end "ruleBodyPromiseType"


    // $ANTLR start "entryRuleBundleComponent"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:452:1: entryRuleBundleComponent : ruleBundleComponent EOF ;
    public final void entryRuleBundleComponent() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:453:1: ( ruleBundleComponent EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:454:1: ruleBundleComponent EOF
            {
             before(grammarAccess.getBundleComponentRule()); 
            pushFollow(FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent902);
            ruleBundleComponent();

            state._fsp--;

             after(grammarAccess.getBundleComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleComponent909); 

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
    // $ANTLR end "entryRuleBundleComponent"


    // $ANTLR start "ruleBundleComponent"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:461:1: ruleBundleComponent : ( ( rule__BundleComponent__NameAssignment ) ) ;
    public final void ruleBundleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:465:2: ( ( ( rule__BundleComponent__NameAssignment ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:466:1: ( ( rule__BundleComponent__NameAssignment ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:466:1: ( ( rule__BundleComponent__NameAssignment ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:467:1: ( rule__BundleComponent__NameAssignment )
            {
             before(grammarAccess.getBundleComponentAccess().getNameAssignment()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:468:1: ( rule__BundleComponent__NameAssignment )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:468:2: rule__BundleComponent__NameAssignment
            {
            pushFollow(FOLLOW_rule__BundleComponent__NameAssignment_in_ruleBundleComponent935);
            rule__BundleComponent__NameAssignment();

            state._fsp--;


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
    // $ANTLR end "ruleBundleComponent"


    // $ANTLR start "entryRuleBodyComponent"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:480:1: entryRuleBodyComponent : ruleBodyComponent EOF ;
    public final void entryRuleBodyComponent() throws RecognitionException {
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:481:1: ( ruleBodyComponent EOF )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:482:1: ruleBodyComponent EOF
            {
             before(grammarAccess.getBodyComponentRule()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent962);
            ruleBodyComponent();

            state._fsp--;

             after(grammarAccess.getBodyComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent969); 

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
    // $ANTLR end "entryRuleBodyComponent"


    // $ANTLR start "ruleBodyComponent"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:489:1: ruleBodyComponent : ( ( rule__BodyComponent__NameAssignment ) ) ;
    public final void ruleBodyComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:493:2: ( ( ( rule__BodyComponent__NameAssignment ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:494:1: ( ( rule__BodyComponent__NameAssignment ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:494:1: ( ( rule__BodyComponent__NameAssignment ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:495:1: ( rule__BodyComponent__NameAssignment )
            {
             before(grammarAccess.getBodyComponentAccess().getNameAssignment()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:496:1: ( rule__BodyComponent__NameAssignment )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:496:2: rule__BodyComponent__NameAssignment
            {
            pushFollow(FOLLOW_rule__BodyComponent__NameAssignment_in_ruleBodyComponent995);
            rule__BodyComponent__NameAssignment();

            state._fsp--;


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
    // $ANTLR end "ruleBodyComponent"


    // $ANTLR start "rule__CLASS_ID__Alternatives"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:508:1: rule__CLASS_ID__Alternatives : ( ( ( rule__CLASS_ID__Group_0__0 ) ) | ( ( rule__CLASS_ID__Group_1__0 ) ) | ( ( rule__CLASS_ID__Group_2__0 ) ) );
    public final void rule__CLASS_ID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:512:1: ( ( ( rule__CLASS_ID__Group_0__0 ) ) | ( ( rule__CLASS_ID__Group_1__0 ) ) | ( ( rule__CLASS_ID__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:513:1: ( ( rule__CLASS_ID__Group_0__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:513:1: ( ( rule__CLASS_ID__Group_0__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:514:1: ( rule__CLASS_ID__Group_0__0 )
                    {
                     before(grammarAccess.getCLASS_IDAccess().getGroup_0()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:515:1: ( rule__CLASS_ID__Group_0__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:515:2: rule__CLASS_ID__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_0__0_in_rule__CLASS_ID__Alternatives1031);
                    rule__CLASS_ID__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCLASS_IDAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:519:6: ( ( rule__CLASS_ID__Group_1__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:519:6: ( ( rule__CLASS_ID__Group_1__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:520:1: ( rule__CLASS_ID__Group_1__0 )
                    {
                     before(grammarAccess.getCLASS_IDAccess().getGroup_1()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:521:1: ( rule__CLASS_ID__Group_1__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:521:2: rule__CLASS_ID__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_1__0_in_rule__CLASS_ID__Alternatives1049);
                    rule__CLASS_ID__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCLASS_IDAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:525:6: ( ( rule__CLASS_ID__Group_2__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:525:6: ( ( rule__CLASS_ID__Group_2__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:526:1: ( rule__CLASS_ID__Group_2__0 )
                    {
                     before(grammarAccess.getCLASS_IDAccess().getGroup_2()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:527:1: ( rule__CLASS_ID__Group_2__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:527:2: rule__CLASS_ID__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_2__0_in_rule__CLASS_ID__Alternatives1067);
                    rule__CLASS_ID__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCLASS_IDAccess().getGroup_2()); 

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
    // $ANTLR end "rule__CLASS_ID__Alternatives"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:536:1: rule__AbstractElement__Alternatives : ( ( ruleBundle ) | ( ruleBody ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:540:1: ( ( ruleBundle ) | ( ruleBody ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:541:1: ( ruleBundle )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:541:1: ( ruleBundle )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:542:1: ruleBundle
                    {
                     before(grammarAccess.getAbstractElementAccess().getBundleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBundle_in_rule__AbstractElement__Alternatives1100);
                    ruleBundle();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getBundleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:547:6: ( ruleBody )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:547:6: ( ruleBody )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:548:1: ruleBody
                    {
                     before(grammarAccess.getAbstractElementAccess().getBodyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBody_in_rule__AbstractElement__Alternatives1117);
                    ruleBody();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getBodyParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__PromiseValue__Alternatives_2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:558:1: rule__PromiseValue__Alternatives_2 : ( ( ( rule__PromiseValue__Alternatives_2_0 ) ) | ( ( rule__PromiseValue__Group_2_1__0 ) ) | ( ( rule__PromiseValue__Group_2_2__0 ) ) );
    public final void rule__PromiseValue__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:562:1: ( ( ( rule__PromiseValue__Alternatives_2_0 ) ) | ( ( rule__PromiseValue__Group_2_1__0 ) ) | ( ( rule__PromiseValue__Group_2_2__0 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==23) ) {
                    alt4=3;
                }
                else if ( ((LA4_2>=RULE_ID && LA4_2<=RULE_STRING)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:563:1: ( ( rule__PromiseValue__Alternatives_2_0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:563:1: ( ( rule__PromiseValue__Alternatives_2_0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:564:1: ( rule__PromiseValue__Alternatives_2_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getAlternatives_2_0()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:565:1: ( rule__PromiseValue__Alternatives_2_0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:565:2: rule__PromiseValue__Alternatives_2_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_0_in_rule__PromiseValue__Alternatives_21149);
                    rule__PromiseValue__Alternatives_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getAlternatives_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:569:6: ( ( rule__PromiseValue__Group_2_1__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:569:6: ( ( rule__PromiseValue__Group_2_1__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:570:1: ( rule__PromiseValue__Group_2_1__0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getGroup_2_1()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:571:1: ( rule__PromiseValue__Group_2_1__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:571:2: rule__PromiseValue__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__0_in_rule__PromiseValue__Alternatives_21167);
                    rule__PromiseValue__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:575:6: ( ( rule__PromiseValue__Group_2_2__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:575:6: ( ( rule__PromiseValue__Group_2_2__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:576:1: ( rule__PromiseValue__Group_2_2__0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getGroup_2_2()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:577:1: ( rule__PromiseValue__Group_2_2__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:577:2: rule__PromiseValue__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__0_in_rule__PromiseValue__Alternatives_21185);
                    rule__PromiseValue__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__PromiseValue__Alternatives_2"


    // $ANTLR start "rule__PromiseValue__Alternatives_2_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:586:1: rule__PromiseValue__Alternatives_2_0 : ( ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) ) | ( ( rule__PromiseValue__ValuesAssignment_2_0_2 ) ) );
    public final void rule__PromiseValue__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:590:1: ( ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) ) | ( ( rule__PromiseValue__ValuesAssignment_2_0_2 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==14) ) {
                    alt5=2;
                }
                else if ( (LA5_2==EOF||LA5_2==11||LA5_2==21) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:591:1: ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:591:1: ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:592:1: ( rule__PromiseValue__ValuesAssignment_2_0_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_0_0()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:593:1: ( rule__PromiseValue__ValuesAssignment_2_0_0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:593:2: rule__PromiseValue__ValuesAssignment_2_0_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__ValuesAssignment_2_0_0_in_rule__PromiseValue__Alternatives_2_01218);
                    rule__PromiseValue__ValuesAssignment_2_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:597:6: ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:597:6: ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:598:1: ( rule__PromiseValue__FunctionsAssignment_2_0_1 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_0_1()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:599:1: ( rule__PromiseValue__FunctionsAssignment_2_0_1 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:599:2: rule__PromiseValue__FunctionsAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__FunctionsAssignment_2_0_1_in_rule__PromiseValue__Alternatives_2_01236);
                    rule__PromiseValue__FunctionsAssignment_2_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:603:6: ( ( rule__PromiseValue__ValuesAssignment_2_0_2 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:603:6: ( ( rule__PromiseValue__ValuesAssignment_2_0_2 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:604:1: ( rule__PromiseValue__ValuesAssignment_2_0_2 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_0_2()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:605:1: ( rule__PromiseValue__ValuesAssignment_2_0_2 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:605:2: rule__PromiseValue__ValuesAssignment_2_0_2
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__ValuesAssignment_2_0_2_in_rule__PromiseValue__Alternatives_2_01254);
                    rule__PromiseValue__ValuesAssignment_2_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_0_2()); 

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
    // $ANTLR end "rule__PromiseValue__Alternatives_2_0"


    // $ANTLR start "rule__PromiseValue__Alternatives_2_1_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:614:1: rule__PromiseValue__Alternatives_2_1_1 : ( ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) ) );
    public final void rule__PromiseValue__Alternatives_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:618:1: ( ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:619:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:619:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:620:1: ( rule__PromiseValue__ValuesAssignment_2_1_1_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_1_0()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:621:1: ( rule__PromiseValue__ValuesAssignment_2_1_1_0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:621:2: rule__PromiseValue__ValuesAssignment_2_1_1_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_1_0_in_rule__PromiseValue__Alternatives_2_1_11287);
                    rule__PromiseValue__ValuesAssignment_2_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:625:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:625:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:626:1: ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_1_1_1()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:627:1: ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:627:2: rule__PromiseValue__FunctionsAssignment_2_1_1_1
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_1_1_in_rule__PromiseValue__Alternatives_2_1_11305);
                    rule__PromiseValue__FunctionsAssignment_2_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_1_1_1()); 

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
    // $ANTLR end "rule__PromiseValue__Alternatives_2_1_1"


    // $ANTLR start "rule__PromiseValue__Alternatives_2_1_2_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:636:1: rule__PromiseValue__Alternatives_2_1_2_1 : ( ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) ) );
    public final void rule__PromiseValue__Alternatives_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:640:1: ( ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:641:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:641:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:642:1: ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_2_1_0()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:643:1: ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:643:2: rule__PromiseValue__ValuesAssignment_2_1_2_1_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_2_1_0_in_rule__PromiseValue__Alternatives_2_1_2_11338);
                    rule__PromiseValue__ValuesAssignment_2_1_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:647:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:647:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:648:1: ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_1_2_1_1()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:649:1: ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:649:2: rule__PromiseValue__FunctionsAssignment_2_1_2_1_1
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_2_1_1_in_rule__PromiseValue__Alternatives_2_1_2_11356);
                    rule__PromiseValue__FunctionsAssignment_2_1_2_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_1_2_1_1()); 

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
    // $ANTLR end "rule__PromiseValue__Alternatives_2_1_2_1"


    // $ANTLR start "rule__BodyFunction__Alternatives_2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:658:1: rule__BodyFunction__Alternatives_2 : ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) );
    public final void rule__BodyFunction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:662:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_STRING) ) {
                    alt8=2;
                }
                else if ( (LA8_2==23) ) {
                    alt8=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:663:1: ( ( rule__BodyFunction__ValuesAssignment_2_0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:663:1: ( ( rule__BodyFunction__ValuesAssignment_2_0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:664:1: ( rule__BodyFunction__ValuesAssignment_2_0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:665:1: ( rule__BodyFunction__ValuesAssignment_2_0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:665:2: rule__BodyFunction__ValuesAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_0_in_rule__BodyFunction__Alternatives_21389);
                    rule__BodyFunction__ValuesAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:669:6: ( ( rule__BodyFunction__Group_2_1__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:669:6: ( ( rule__BodyFunction__Group_2_1__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:670:1: ( rule__BodyFunction__Group_2_1__0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getGroup_2_1()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:671:1: ( rule__BodyFunction__Group_2_1__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:671:2: rule__BodyFunction__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__0_in_rule__BodyFunction__Alternatives_21407);
                    rule__BodyFunction__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:675:6: ( ( rule__BodyFunction__FunctionAssignment_2_2 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:675:6: ( ( rule__BodyFunction__FunctionAssignment_2_2 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:676:1: ( rule__BodyFunction__FunctionAssignment_2_2 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:677:1: ( rule__BodyFunction__FunctionAssignment_2_2 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:677:2: rule__BodyFunction__FunctionAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__FunctionAssignment_2_2_in_rule__BodyFunction__Alternatives_21425);
                    rule__BodyFunction__FunctionAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:681:6: ( ( rule__BodyFunction__Group_2_3__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:681:6: ( ( rule__BodyFunction__Group_2_3__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:682:1: ( rule__BodyFunction__Group_2_3__0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getGroup_2_3()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:683:1: ( rule__BodyFunction__Group_2_3__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:683:2: rule__BodyFunction__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__0_in_rule__BodyFunction__Alternatives_21443);
                    rule__BodyFunction__Group_2_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__BodyFunction__Alternatives_2"


    // $ANTLR start "rule__SpecialFunction__Alternatives_2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:692:1: rule__SpecialFunction__Alternatives_2 : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_4__0 ) ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_6 ) ) );
    public final void rule__SpecialFunction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:696:1: ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_4__0 ) ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_6 ) ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                int LA9_2 = input.LA(2);

                if ( ((LA9_2>=RULE_ANY_OTHER && LA9_2<=RULE_STRING)||LA9_2==11||LA9_2==15||(LA9_2>=25 && LA9_2<=26)) ) {
                    alt9=2;
                }
                else if ( (LA9_2==14) ) {
                    alt9=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case 11:
                {
                alt9=4;
                }
                break;
            case 25:
                {
                alt9=5;
                }
                break;
            case 26:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:697:1: ( RULE_ANY_OTHER )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:697:1: ( RULE_ANY_OTHER )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:698:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SpecialFunction__Alternatives_21476); 
                     after(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:703:6: ( RULE_ID )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:703:6: ( RULE_ID )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:704:1: RULE_ID
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Alternatives_21493); 
                     after(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:709:6: ( RULE_STRING )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:709:6: ( RULE_STRING )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:710:1: RULE_STRING
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecialFunction__Alternatives_21510); 
                     after(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:715:6: ( ',' )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:715:6: ( ',' )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:716:1: ','
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_3()); 
                    match(input,11,FOLLOW_11_in_rule__SpecialFunction__Alternatives_21528); 
                     after(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:723:6: ( ( rule__SpecialFunction__Group_2_4__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:723:6: ( ( rule__SpecialFunction__Group_2_4__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:724:1: ( rule__SpecialFunction__Group_2_4__0 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getGroup_2_4()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:725:1: ( rule__SpecialFunction__Group_2_4__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:725:2: rule__SpecialFunction__Group_2_4__0
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__Group_2_4__0_in_rule__SpecialFunction__Alternatives_21547);
                    rule__SpecialFunction__Group_2_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecialFunctionAccess().getGroup_2_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:729:6: ( ( rule__SpecialFunction__Group_2_5__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:729:6: ( ( rule__SpecialFunction__Group_2_5__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:730:1: ( rule__SpecialFunction__Group_2_5__0 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getGroup_2_5()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:731:1: ( rule__SpecialFunction__Group_2_5__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:731:2: rule__SpecialFunction__Group_2_5__0
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__0_in_rule__SpecialFunction__Alternatives_21565);
                    rule__SpecialFunction__Group_2_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecialFunctionAccess().getGroup_2_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:735:6: ( ( rule__SpecialFunction__FuncAssignment_2_6 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:735:6: ( ( rule__SpecialFunction__FuncAssignment_2_6 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:736:1: ( rule__SpecialFunction__FuncAssignment_2_6 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getFuncAssignment_2_6()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:737:1: ( rule__SpecialFunction__FuncAssignment_2_6 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:737:2: rule__SpecialFunction__FuncAssignment_2_6
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__FuncAssignment_2_6_in_rule__SpecialFunction__Alternatives_21583);
                    rule__SpecialFunction__FuncAssignment_2_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecialFunctionAccess().getFuncAssignment_2_6()); 

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
    // $ANTLR end "rule__SpecialFunction__Alternatives_2"


    // $ANTLR start "rule__CLASS_ID__Group_0__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:748:1: rule__CLASS_ID__Group_0__0 : rule__CLASS_ID__Group_0__0__Impl rule__CLASS_ID__Group_0__1 ;
    public final void rule__CLASS_ID__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:752:1: ( rule__CLASS_ID__Group_0__0__Impl rule__CLASS_ID__Group_0__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:753:2: rule__CLASS_ID__Group_0__0__Impl rule__CLASS_ID__Group_0__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_0__0__Impl_in_rule__CLASS_ID__Group_0__01614);
            rule__CLASS_ID__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_0__1_in_rule__CLASS_ID__Group_0__01617);
            rule__CLASS_ID__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_0__0"


    // $ANTLR start "rule__CLASS_ID__Group_0__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:760:1: rule__CLASS_ID__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__CLASS_ID__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:764:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:765:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:765:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:766:1: RULE_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CLASS_ID__Group_0__0__Impl1644); 
             after(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__CLASS_ID__Group_0__0__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_0__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:777:1: rule__CLASS_ID__Group_0__1 : rule__CLASS_ID__Group_0__1__Impl ;
    public final void rule__CLASS_ID__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:781:1: ( rule__CLASS_ID__Group_0__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:782:2: rule__CLASS_ID__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_0__1__Impl_in_rule__CLASS_ID__Group_0__11673);
            rule__CLASS_ID__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_0__1"


    // $ANTLR start "rule__CLASS_ID__Group_0__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:788:1: rule__CLASS_ID__Group_0__1__Impl : ( ( rule__CLASS_ID__Group_0_1__0 )? ) ;
    public final void rule__CLASS_ID__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:792:1: ( ( ( rule__CLASS_ID__Group_0_1__0 )? ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:793:1: ( ( rule__CLASS_ID__Group_0_1__0 )? )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:793:1: ( ( rule__CLASS_ID__Group_0_1__0 )? )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:794:1: ( rule__CLASS_ID__Group_0_1__0 )?
            {
             before(grammarAccess.getCLASS_IDAccess().getGroup_0_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:795:1: ( rule__CLASS_ID__Group_0_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:795:2: rule__CLASS_ID__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_0_1__0_in_rule__CLASS_ID__Group_0__1__Impl1700);
                    rule__CLASS_ID__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCLASS_IDAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__CLASS_ID__Group_0__1__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_0_1__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:809:1: rule__CLASS_ID__Group_0_1__0 : rule__CLASS_ID__Group_0_1__0__Impl rule__CLASS_ID__Group_0_1__1 ;
    public final void rule__CLASS_ID__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:813:1: ( rule__CLASS_ID__Group_0_1__0__Impl rule__CLASS_ID__Group_0_1__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:814:2: rule__CLASS_ID__Group_0_1__0__Impl rule__CLASS_ID__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_0_1__0__Impl_in_rule__CLASS_ID__Group_0_1__01735);
            rule__CLASS_ID__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_0_1__1_in_rule__CLASS_ID__Group_0_1__01738);
            rule__CLASS_ID__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_0_1__0"


    // $ANTLR start "rule__CLASS_ID__Group_0_1__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:821:1: rule__CLASS_ID__Group_0_1__0__Impl : ( '.' ) ;
    public final void rule__CLASS_ID__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:825:1: ( ( '.' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:826:1: ( '.' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:826:1: ( '.' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:827:1: '.'
            {
             before(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_0_1_0()); 
            match(input,12,FOLLOW_12_in_rule__CLASS_ID__Group_0_1__0__Impl1766); 
             after(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_0_1_0()); 

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
    // $ANTLR end "rule__CLASS_ID__Group_0_1__0__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_0_1__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:840:1: rule__CLASS_ID__Group_0_1__1 : rule__CLASS_ID__Group_0_1__1__Impl ;
    public final void rule__CLASS_ID__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:844:1: ( rule__CLASS_ID__Group_0_1__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:845:2: rule__CLASS_ID__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_0_1__1__Impl_in_rule__CLASS_ID__Group_0_1__11797);
            rule__CLASS_ID__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_0_1__1"


    // $ANTLR start "rule__CLASS_ID__Group_0_1__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:851:1: rule__CLASS_ID__Group_0_1__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:855:1: ( ( ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:856:1: ( ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:856:1: ( ruleCLASS_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:857:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_0_1_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_0_1__1__Impl1824);
            ruleCLASS_ID();

            state._fsp--;

             after(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_0_1_1()); 

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
    // $ANTLR end "rule__CLASS_ID__Group_0_1__1__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_1__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:872:1: rule__CLASS_ID__Group_1__0 : rule__CLASS_ID__Group_1__0__Impl rule__CLASS_ID__Group_1__1 ;
    public final void rule__CLASS_ID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:876:1: ( rule__CLASS_ID__Group_1__0__Impl rule__CLASS_ID__Group_1__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:877:2: rule__CLASS_ID__Group_1__0__Impl rule__CLASS_ID__Group_1__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_1__0__Impl_in_rule__CLASS_ID__Group_1__01857);
            rule__CLASS_ID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_1__1_in_rule__CLASS_ID__Group_1__01860);
            rule__CLASS_ID__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_1__0"


    // $ANTLR start "rule__CLASS_ID__Group_1__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:884:1: rule__CLASS_ID__Group_1__0__Impl : ( '!' ) ;
    public final void rule__CLASS_ID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:888:1: ( ( '!' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:889:1: ( '!' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:889:1: ( '!' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:890:1: '!'
            {
             before(grammarAccess.getCLASS_IDAccess().getExclamationMarkKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__CLASS_ID__Group_1__0__Impl1888); 
             after(grammarAccess.getCLASS_IDAccess().getExclamationMarkKeyword_1_0()); 

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
    // $ANTLR end "rule__CLASS_ID__Group_1__0__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_1__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:903:1: rule__CLASS_ID__Group_1__1 : rule__CLASS_ID__Group_1__1__Impl ;
    public final void rule__CLASS_ID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:907:1: ( rule__CLASS_ID__Group_1__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:908:2: rule__CLASS_ID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_1__1__Impl_in_rule__CLASS_ID__Group_1__11919);
            rule__CLASS_ID__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_1__1"


    // $ANTLR start "rule__CLASS_ID__Group_1__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:914:1: rule__CLASS_ID__Group_1__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:918:1: ( ( ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:919:1: ( ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:919:1: ( ruleCLASS_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:920:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_1__1__Impl1946);
            ruleCLASS_ID();

            state._fsp--;

             after(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__CLASS_ID__Group_1__1__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_2__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:935:1: rule__CLASS_ID__Group_2__0 : rule__CLASS_ID__Group_2__0__Impl rule__CLASS_ID__Group_2__1 ;
    public final void rule__CLASS_ID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:939:1: ( rule__CLASS_ID__Group_2__0__Impl rule__CLASS_ID__Group_2__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:940:2: rule__CLASS_ID__Group_2__0__Impl rule__CLASS_ID__Group_2__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__0__Impl_in_rule__CLASS_ID__Group_2__01979);
            rule__CLASS_ID__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__1_in_rule__CLASS_ID__Group_2__01982);
            rule__CLASS_ID__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_2__0"


    // $ANTLR start "rule__CLASS_ID__Group_2__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:947:1: rule__CLASS_ID__Group_2__0__Impl : ( '(' ) ;
    public final void rule__CLASS_ID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:951:1: ( ( '(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:952:1: ( '(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:952:1: ( '(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:953:1: '('
            {
             before(grammarAccess.getCLASS_IDAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__CLASS_ID__Group_2__0__Impl2010); 
             after(grammarAccess.getCLASS_IDAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__CLASS_ID__Group_2__0__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_2__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:966:1: rule__CLASS_ID__Group_2__1 : rule__CLASS_ID__Group_2__1__Impl rule__CLASS_ID__Group_2__2 ;
    public final void rule__CLASS_ID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:970:1: ( rule__CLASS_ID__Group_2__1__Impl rule__CLASS_ID__Group_2__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:971:2: rule__CLASS_ID__Group_2__1__Impl rule__CLASS_ID__Group_2__2
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__1__Impl_in_rule__CLASS_ID__Group_2__12041);
            rule__CLASS_ID__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__2_in_rule__CLASS_ID__Group_2__12044);
            rule__CLASS_ID__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_2__1"


    // $ANTLR start "rule__CLASS_ID__Group_2__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:978:1: rule__CLASS_ID__Group_2__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:982:1: ( ( ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:983:1: ( ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:983:1: ( ruleCLASS_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:984:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_2__1__Impl2071);
            ruleCLASS_ID();

            state._fsp--;

             after(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__CLASS_ID__Group_2__1__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_2__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:995:1: rule__CLASS_ID__Group_2__2 : rule__CLASS_ID__Group_2__2__Impl rule__CLASS_ID__Group_2__3 ;
    public final void rule__CLASS_ID__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:999:1: ( rule__CLASS_ID__Group_2__2__Impl rule__CLASS_ID__Group_2__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1000:2: rule__CLASS_ID__Group_2__2__Impl rule__CLASS_ID__Group_2__3
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__2__Impl_in_rule__CLASS_ID__Group_2__22100);
            rule__CLASS_ID__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__3_in_rule__CLASS_ID__Group_2__22103);
            rule__CLASS_ID__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_2__2"


    // $ANTLR start "rule__CLASS_ID__Group_2__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1007:1: rule__CLASS_ID__Group_2__2__Impl : ( ')' ) ;
    public final void rule__CLASS_ID__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1011:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1012:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1012:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1013:1: ')'
            {
             before(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_2_2()); 
            match(input,15,FOLLOW_15_in_rule__CLASS_ID__Group_2__2__Impl2131); 
             after(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__CLASS_ID__Group_2__2__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_2__3"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1026:1: rule__CLASS_ID__Group_2__3 : rule__CLASS_ID__Group_2__3__Impl ;
    public final void rule__CLASS_ID__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1030:1: ( rule__CLASS_ID__Group_2__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1031:2: rule__CLASS_ID__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__3__Impl_in_rule__CLASS_ID__Group_2__32162);
            rule__CLASS_ID__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_2__3"


    // $ANTLR start "rule__CLASS_ID__Group_2__3__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1037:1: rule__CLASS_ID__Group_2__3__Impl : ( ( rule__CLASS_ID__Group_2_3__0 )? ) ;
    public final void rule__CLASS_ID__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1041:1: ( ( ( rule__CLASS_ID__Group_2_3__0 )? ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1042:1: ( ( rule__CLASS_ID__Group_2_3__0 )? )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1042:1: ( ( rule__CLASS_ID__Group_2_3__0 )? )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1043:1: ( rule__CLASS_ID__Group_2_3__0 )?
            {
             before(grammarAccess.getCLASS_IDAccess().getGroup_2_3()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1044:1: ( rule__CLASS_ID__Group_2_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1044:2: rule__CLASS_ID__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_2_3__0_in_rule__CLASS_ID__Group_2__3__Impl2189);
                    rule__CLASS_ID__Group_2_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCLASS_IDAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__CLASS_ID__Group_2__3__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_2_3__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1062:1: rule__CLASS_ID__Group_2_3__0 : rule__CLASS_ID__Group_2_3__0__Impl rule__CLASS_ID__Group_2_3__1 ;
    public final void rule__CLASS_ID__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1066:1: ( rule__CLASS_ID__Group_2_3__0__Impl rule__CLASS_ID__Group_2_3__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1067:2: rule__CLASS_ID__Group_2_3__0__Impl rule__CLASS_ID__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2_3__0__Impl_in_rule__CLASS_ID__Group_2_3__02228);
            rule__CLASS_ID__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_2_3__1_in_rule__CLASS_ID__Group_2_3__02231);
            rule__CLASS_ID__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_2_3__0"


    // $ANTLR start "rule__CLASS_ID__Group_2_3__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1074:1: rule__CLASS_ID__Group_2_3__0__Impl : ( '.' ) ;
    public final void rule__CLASS_ID__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1078:1: ( ( '.' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1079:1: ( '.' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1079:1: ( '.' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1080:1: '.'
            {
             before(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_2_3_0()); 
            match(input,12,FOLLOW_12_in_rule__CLASS_ID__Group_2_3__0__Impl2259); 
             after(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_2_3_0()); 

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
    // $ANTLR end "rule__CLASS_ID__Group_2_3__0__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_2_3__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1093:1: rule__CLASS_ID__Group_2_3__1 : rule__CLASS_ID__Group_2_3__1__Impl ;
    public final void rule__CLASS_ID__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1097:1: ( rule__CLASS_ID__Group_2_3__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1098:2: rule__CLASS_ID__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2_3__1__Impl_in_rule__CLASS_ID__Group_2_3__12290);
            rule__CLASS_ID__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_2_3__1"


    // $ANTLR start "rule__CLASS_ID__Group_2_3__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1104:1: rule__CLASS_ID__Group_2_3__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1108:1: ( ( ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1109:1: ( ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1109:1: ( ruleCLASS_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1110:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_3_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_2_3__1__Impl2317);
            ruleCLASS_ID();

            state._fsp--;

             after(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_3_1()); 

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
    // $ANTLR end "rule__CLASS_ID__Group_2_3__1__Impl"


    // $ANTLR start "rule__Bundle__Group__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1125:1: rule__Bundle__Group__0 : rule__Bundle__Group__0__Impl rule__Bundle__Group__1 ;
    public final void rule__Bundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1129:1: ( rule__Bundle__Group__0__Impl rule__Bundle__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1130:2: rule__Bundle__Group__0__Impl rule__Bundle__Group__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group__0__Impl_in_rule__Bundle__Group__02350);
            rule__Bundle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__1_in_rule__Bundle__Group__02353);
            rule__Bundle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group__0"


    // $ANTLR start "rule__Bundle__Group__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1137:1: rule__Bundle__Group__0__Impl : ( 'bundle' ) ;
    public final void rule__Bundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1141:1: ( ( 'bundle' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1142:1: ( 'bundle' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1142:1: ( 'bundle' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1143:1: 'bundle'
            {
             before(grammarAccess.getBundleAccess().getBundleKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Bundle__Group__0__Impl2381); 
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
    // $ANTLR end "rule__Bundle__Group__0__Impl"


    // $ANTLR start "rule__Bundle__Group__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1156:1: rule__Bundle__Group__1 : rule__Bundle__Group__1__Impl rule__Bundle__Group__2 ;
    public final void rule__Bundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1160:1: ( rule__Bundle__Group__1__Impl rule__Bundle__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1161:2: rule__Bundle__Group__1__Impl rule__Bundle__Group__2
            {
            pushFollow(FOLLOW_rule__Bundle__Group__1__Impl_in_rule__Bundle__Group__12412);
            rule__Bundle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__2_in_rule__Bundle__Group__12415);
            rule__Bundle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group__1"


    // $ANTLR start "rule__Bundle__Group__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1168:1: rule__Bundle__Group__1__Impl : ( ( rule__Bundle__ComponentAssignment_1 ) ) ;
    public final void rule__Bundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1172:1: ( ( ( rule__Bundle__ComponentAssignment_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1173:1: ( ( rule__Bundle__ComponentAssignment_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1173:1: ( ( rule__Bundle__ComponentAssignment_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1174:1: ( rule__Bundle__ComponentAssignment_1 )
            {
             before(grammarAccess.getBundleAccess().getComponentAssignment_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1175:1: ( rule__Bundle__ComponentAssignment_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1175:2: rule__Bundle__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Bundle__ComponentAssignment_1_in_rule__Bundle__Group__1__Impl2442);
            rule__Bundle__ComponentAssignment_1();

            state._fsp--;


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
    // $ANTLR end "rule__Bundle__Group__1__Impl"


    // $ANTLR start "rule__Bundle__Group__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1185:1: rule__Bundle__Group__2 : rule__Bundle__Group__2__Impl rule__Bundle__Group__3 ;
    public final void rule__Bundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1189:1: ( rule__Bundle__Group__2__Impl rule__Bundle__Group__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1190:2: rule__Bundle__Group__2__Impl rule__Bundle__Group__3
            {
            pushFollow(FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__22472);
            rule__Bundle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__22475);
            rule__Bundle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group__2"


    // $ANTLR start "rule__Bundle__Group__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1197:1: rule__Bundle__Group__2__Impl : ( ( rule__Bundle__NameAssignment_2 ) ) ;
    public final void rule__Bundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1201:1: ( ( ( rule__Bundle__NameAssignment_2 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1202:1: ( ( rule__Bundle__NameAssignment_2 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1202:1: ( ( rule__Bundle__NameAssignment_2 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1203:1: ( rule__Bundle__NameAssignment_2 )
            {
             before(grammarAccess.getBundleAccess().getNameAssignment_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1204:1: ( rule__Bundle__NameAssignment_2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1204:2: rule__Bundle__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl2502);
            rule__Bundle__NameAssignment_2();

            state._fsp--;


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
    // $ANTLR end "rule__Bundle__Group__2__Impl"


    // $ANTLR start "rule__Bundle__Group__3"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1214:1: rule__Bundle__Group__3 : rule__Bundle__Group__3__Impl rule__Bundle__Group__4 ;
    public final void rule__Bundle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1218:1: ( rule__Bundle__Group__3__Impl rule__Bundle__Group__4 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1219:2: rule__Bundle__Group__3__Impl rule__Bundle__Group__4
            {
            pushFollow(FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__32532);
            rule__Bundle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__32535);
            rule__Bundle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group__3"


    // $ANTLR start "rule__Bundle__Group__3__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1226:1: rule__Bundle__Group__3__Impl : ( ( rule__Bundle__Group_3__0 )? ) ;
    public final void rule__Bundle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1230:1: ( ( ( rule__Bundle__Group_3__0 )? ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1231:1: ( ( rule__Bundle__Group_3__0 )? )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1231:1: ( ( rule__Bundle__Group_3__0 )? )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1232:1: ( rule__Bundle__Group_3__0 )?
            {
             before(grammarAccess.getBundleAccess().getGroup_3()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1233:1: ( rule__Bundle__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1233:2: rule__Bundle__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Bundle__Group_3__0_in_rule__Bundle__Group__3__Impl2562);
                    rule__Bundle__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBundleAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Bundle__Group__3__Impl"


    // $ANTLR start "rule__Bundle__Group__4"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1243:1: rule__Bundle__Group__4 : rule__Bundle__Group__4__Impl rule__Bundle__Group__5 ;
    public final void rule__Bundle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1247:1: ( rule__Bundle__Group__4__Impl rule__Bundle__Group__5 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1248:2: rule__Bundle__Group__4__Impl rule__Bundle__Group__5
            {
            pushFollow(FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__42593);
            rule__Bundle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__42596);
            rule__Bundle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group__4"


    // $ANTLR start "rule__Bundle__Group__4__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1255:1: rule__Bundle__Group__4__Impl : ( '{' ) ;
    public final void rule__Bundle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1259:1: ( ( '{' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1260:1: ( '{' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1260:1: ( '{' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1261:1: '{'
            {
             before(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Bundle__Group__4__Impl2624); 
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
    // $ANTLR end "rule__Bundle__Group__4__Impl"


    // $ANTLR start "rule__Bundle__Group__5"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1274:1: rule__Bundle__Group__5 : rule__Bundle__Group__5__Impl rule__Bundle__Group__6 ;
    public final void rule__Bundle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1278:1: ( rule__Bundle__Group__5__Impl rule__Bundle__Group__6 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1279:2: rule__Bundle__Group__5__Impl rule__Bundle__Group__6
            {
            pushFollow(FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__52655);
            rule__Bundle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__6_in_rule__Bundle__Group__52658);
            rule__Bundle__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group__5"


    // $ANTLR start "rule__Bundle__Group__5__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1286:1: rule__Bundle__Group__5__Impl : ( ( rule__Bundle__PromiseTypeAssignment_5 )* ) ;
    public final void rule__Bundle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1290:1: ( ( ( rule__Bundle__PromiseTypeAssignment_5 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1291:1: ( ( rule__Bundle__PromiseTypeAssignment_5 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1291:1: ( ( rule__Bundle__PromiseTypeAssignment_5 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1292:1: ( rule__Bundle__PromiseTypeAssignment_5 )*
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeAssignment_5()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1293:1: ( rule__Bundle__PromiseTypeAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1293:2: rule__Bundle__PromiseTypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Bundle__PromiseTypeAssignment_5_in_rule__Bundle__Group__5__Impl2685);
            	    rule__Bundle__PromiseTypeAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBundleAccess().getPromiseTypeAssignment_5()); 

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
    // $ANTLR end "rule__Bundle__Group__5__Impl"


    // $ANTLR start "rule__Bundle__Group__6"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1303:1: rule__Bundle__Group__6 : rule__Bundle__Group__6__Impl ;
    public final void rule__Bundle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1307:1: ( rule__Bundle__Group__6__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1308:2: rule__Bundle__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group__6__Impl_in_rule__Bundle__Group__62716);
            rule__Bundle__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group__6"


    // $ANTLR start "rule__Bundle__Group__6__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1314:1: rule__Bundle__Group__6__Impl : ( '}' ) ;
    public final void rule__Bundle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1318:1: ( ( '}' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1319:1: ( '}' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1319:1: ( '}' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1320:1: '}'
            {
             before(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Bundle__Group__6__Impl2744); 
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
    // $ANTLR end "rule__Bundle__Group__6__Impl"


    // $ANTLR start "rule__Bundle__Group_3__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1347:1: rule__Bundle__Group_3__0 : rule__Bundle__Group_3__0__Impl rule__Bundle__Group_3__1 ;
    public final void rule__Bundle__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1351:1: ( rule__Bundle__Group_3__0__Impl rule__Bundle__Group_3__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1352:2: rule__Bundle__Group_3__0__Impl rule__Bundle__Group_3__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group_3__0__Impl_in_rule__Bundle__Group_3__02789);
            rule__Bundle__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_3__1_in_rule__Bundle__Group_3__02792);
            rule__Bundle__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_3__0"


    // $ANTLR start "rule__Bundle__Group_3__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1359:1: rule__Bundle__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Bundle__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1363:1: ( ( '(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1364:1: ( '(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1364:1: ( '(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1365:1: '('
            {
             before(grammarAccess.getBundleAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__Bundle__Group_3__0__Impl2820); 
             after(grammarAccess.getBundleAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__Bundle__Group_3__0__Impl"


    // $ANTLR start "rule__Bundle__Group_3__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1378:1: rule__Bundle__Group_3__1 : rule__Bundle__Group_3__1__Impl rule__Bundle__Group_3__2 ;
    public final void rule__Bundle__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1382:1: ( rule__Bundle__Group_3__1__Impl rule__Bundle__Group_3__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1383:2: rule__Bundle__Group_3__1__Impl rule__Bundle__Group_3__2
            {
            pushFollow(FOLLOW_rule__Bundle__Group_3__1__Impl_in_rule__Bundle__Group_3__12851);
            rule__Bundle__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_3__2_in_rule__Bundle__Group_3__12854);
            rule__Bundle__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_3__1"


    // $ANTLR start "rule__Bundle__Group_3__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1390:1: rule__Bundle__Group_3__1__Impl : ( ( rule__Bundle__VariablesAssignment_3_1 ) ) ;
    public final void rule__Bundle__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1394:1: ( ( ( rule__Bundle__VariablesAssignment_3_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1395:1: ( ( rule__Bundle__VariablesAssignment_3_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1395:1: ( ( rule__Bundle__VariablesAssignment_3_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1396:1: ( rule__Bundle__VariablesAssignment_3_1 )
            {
             before(grammarAccess.getBundleAccess().getVariablesAssignment_3_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1397:1: ( rule__Bundle__VariablesAssignment_3_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1397:2: rule__Bundle__VariablesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Bundle__VariablesAssignment_3_1_in_rule__Bundle__Group_3__1__Impl2881);
            rule__Bundle__VariablesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBundleAccess().getVariablesAssignment_3_1()); 

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
    // $ANTLR end "rule__Bundle__Group_3__1__Impl"


    // $ANTLR start "rule__Bundle__Group_3__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1407:1: rule__Bundle__Group_3__2 : rule__Bundle__Group_3__2__Impl rule__Bundle__Group_3__3 ;
    public final void rule__Bundle__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1411:1: ( rule__Bundle__Group_3__2__Impl rule__Bundle__Group_3__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1412:2: rule__Bundle__Group_3__2__Impl rule__Bundle__Group_3__3
            {
            pushFollow(FOLLOW_rule__Bundle__Group_3__2__Impl_in_rule__Bundle__Group_3__22911);
            rule__Bundle__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_3__3_in_rule__Bundle__Group_3__22914);
            rule__Bundle__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_3__2"


    // $ANTLR start "rule__Bundle__Group_3__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1419:1: rule__Bundle__Group_3__2__Impl : ( ( rule__Bundle__Group_3_2__0 )* ) ;
    public final void rule__Bundle__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1423:1: ( ( ( rule__Bundle__Group_3_2__0 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1424:1: ( ( rule__Bundle__Group_3_2__0 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1424:1: ( ( rule__Bundle__Group_3_2__0 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1425:1: ( rule__Bundle__Group_3_2__0 )*
            {
             before(grammarAccess.getBundleAccess().getGroup_3_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1426:1: ( rule__Bundle__Group_3_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==11) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1426:2: rule__Bundle__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Bundle__Group_3_2__0_in_rule__Bundle__Group_3__2__Impl2941);
            	    rule__Bundle__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getBundleAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__Bundle__Group_3__2__Impl"


    // $ANTLR start "rule__Bundle__Group_3__3"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1436:1: rule__Bundle__Group_3__3 : rule__Bundle__Group_3__3__Impl ;
    public final void rule__Bundle__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1440:1: ( rule__Bundle__Group_3__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1441:2: rule__Bundle__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group_3__3__Impl_in_rule__Bundle__Group_3__32972);
            rule__Bundle__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_3__3"


    // $ANTLR start "rule__Bundle__Group_3__3__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1447:1: rule__Bundle__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Bundle__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1451:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1452:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1452:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1453:1: ')'
            {
             before(grammarAccess.getBundleAccess().getRightParenthesisKeyword_3_3()); 
            match(input,15,FOLLOW_15_in_rule__Bundle__Group_3__3__Impl3000); 
             after(grammarAccess.getBundleAccess().getRightParenthesisKeyword_3_3()); 

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
    // $ANTLR end "rule__Bundle__Group_3__3__Impl"


    // $ANTLR start "rule__Bundle__Group_3_2__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1474:1: rule__Bundle__Group_3_2__0 : rule__Bundle__Group_3_2__0__Impl rule__Bundle__Group_3_2__1 ;
    public final void rule__Bundle__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1478:1: ( rule__Bundle__Group_3_2__0__Impl rule__Bundle__Group_3_2__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1479:2: rule__Bundle__Group_3_2__0__Impl rule__Bundle__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group_3_2__0__Impl_in_rule__Bundle__Group_3_2__03039);
            rule__Bundle__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_3_2__1_in_rule__Bundle__Group_3_2__03042);
            rule__Bundle__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_3_2__0"


    // $ANTLR start "rule__Bundle__Group_3_2__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1486:1: rule__Bundle__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Bundle__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1490:1: ( ( ',' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1491:1: ( ',' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1491:1: ( ',' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1492:1: ','
            {
             before(grammarAccess.getBundleAccess().getCommaKeyword_3_2_0()); 
            match(input,11,FOLLOW_11_in_rule__Bundle__Group_3_2__0__Impl3070); 
             after(grammarAccess.getBundleAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Bundle__Group_3_2__0__Impl"


    // $ANTLR start "rule__Bundle__Group_3_2__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1505:1: rule__Bundle__Group_3_2__1 : rule__Bundle__Group_3_2__1__Impl ;
    public final void rule__Bundle__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1509:1: ( rule__Bundle__Group_3_2__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1510:2: rule__Bundle__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group_3_2__1__Impl_in_rule__Bundle__Group_3_2__13101);
            rule__Bundle__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_3_2__1"


    // $ANTLR start "rule__Bundle__Group_3_2__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1516:1: rule__Bundle__Group_3_2__1__Impl : ( ( rule__Bundle__VariablesAssignment_3_2_1 ) ) ;
    public final void rule__Bundle__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1520:1: ( ( ( rule__Bundle__VariablesAssignment_3_2_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1521:1: ( ( rule__Bundle__VariablesAssignment_3_2_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1521:1: ( ( rule__Bundle__VariablesAssignment_3_2_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1522:1: ( rule__Bundle__VariablesAssignment_3_2_1 )
            {
             before(grammarAccess.getBundleAccess().getVariablesAssignment_3_2_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1523:1: ( rule__Bundle__VariablesAssignment_3_2_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1523:2: rule__Bundle__VariablesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Bundle__VariablesAssignment_3_2_1_in_rule__Bundle__Group_3_2__1__Impl3128);
            rule__Bundle__VariablesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBundleAccess().getVariablesAssignment_3_2_1()); 

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
    // $ANTLR end "rule__Bundle__Group_3_2__1__Impl"


    // $ANTLR start "rule__BundlePromiseType__Group__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1537:1: rule__BundlePromiseType__Group__0 : rule__BundlePromiseType__Group__0__Impl rule__BundlePromiseType__Group__1 ;
    public final void rule__BundlePromiseType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1541:1: ( rule__BundlePromiseType__Group__0__Impl rule__BundlePromiseType__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1542:2: rule__BundlePromiseType__Group__0__Impl rule__BundlePromiseType__Group__1
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__0__Impl_in_rule__BundlePromiseType__Group__03162);
            rule__BundlePromiseType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundlePromiseType__Group__1_in_rule__BundlePromiseType__Group__03165);
            rule__BundlePromiseType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BundlePromiseType__Group__0"


    // $ANTLR start "rule__BundlePromiseType__Group__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1549:1: rule__BundlePromiseType__Group__0__Impl : ( ( rule__BundlePromiseType__NameAssignment_0 ) ) ;
    public final void rule__BundlePromiseType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1553:1: ( ( ( rule__BundlePromiseType__NameAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1554:1: ( ( rule__BundlePromiseType__NameAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1554:1: ( ( rule__BundlePromiseType__NameAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1555:1: ( rule__BundlePromiseType__NameAssignment_0 )
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getNameAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1556:1: ( rule__BundlePromiseType__NameAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1556:2: rule__BundlePromiseType__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__NameAssignment_0_in_rule__BundlePromiseType__Group__0__Impl3192);
            rule__BundlePromiseType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBundlePromiseTypeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__BundlePromiseType__Group__0__Impl"


    // $ANTLR start "rule__BundlePromiseType__Group__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1566:1: rule__BundlePromiseType__Group__1 : rule__BundlePromiseType__Group__1__Impl rule__BundlePromiseType__Group__2 ;
    public final void rule__BundlePromiseType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1570:1: ( rule__BundlePromiseType__Group__1__Impl rule__BundlePromiseType__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1571:2: rule__BundlePromiseType__Group__1__Impl rule__BundlePromiseType__Group__2
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__1__Impl_in_rule__BundlePromiseType__Group__13222);
            rule__BundlePromiseType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundlePromiseType__Group__2_in_rule__BundlePromiseType__Group__13225);
            rule__BundlePromiseType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BundlePromiseType__Group__1"


    // $ANTLR start "rule__BundlePromiseType__Group__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1578:1: rule__BundlePromiseType__Group__1__Impl : ( ':' ) ;
    public final void rule__BundlePromiseType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1582:1: ( ( ':' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1583:1: ( ':' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1583:1: ( ':' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1584:1: ':'
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__BundlePromiseType__Group__1__Impl3253); 
             after(grammarAccess.getBundlePromiseTypeAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__BundlePromiseType__Group__1__Impl"


    // $ANTLR start "rule__BundlePromiseType__Group__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1597:1: rule__BundlePromiseType__Group__2 : rule__BundlePromiseType__Group__2__Impl rule__BundlePromiseType__Group__3 ;
    public final void rule__BundlePromiseType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1601:1: ( rule__BundlePromiseType__Group__2__Impl rule__BundlePromiseType__Group__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1602:2: rule__BundlePromiseType__Group__2__Impl rule__BundlePromiseType__Group__3
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__2__Impl_in_rule__BundlePromiseType__Group__23284);
            rule__BundlePromiseType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundlePromiseType__Group__3_in_rule__BundlePromiseType__Group__23287);
            rule__BundlePromiseType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BundlePromiseType__Group__2"


    // $ANTLR start "rule__BundlePromiseType__Group__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1609:1: rule__BundlePromiseType__Group__2__Impl : ( ( rule__BundlePromiseType__PromisesAssignment_2 )* ) ;
    public final void rule__BundlePromiseType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1613:1: ( ( ( rule__BundlePromiseType__PromisesAssignment_2 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1614:1: ( ( rule__BundlePromiseType__PromisesAssignment_2 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1614:1: ( ( rule__BundlePromiseType__PromisesAssignment_2 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1615:1: ( rule__BundlePromiseType__PromisesAssignment_2 )*
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getPromisesAssignment_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1616:1: ( rule__BundlePromiseType__PromisesAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1616:2: rule__BundlePromiseType__PromisesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromiseType__PromisesAssignment_2_in_rule__BundlePromiseType__Group__2__Impl3314);
            	    rule__BundlePromiseType__PromisesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getBundlePromiseTypeAccess().getPromisesAssignment_2()); 

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
    // $ANTLR end "rule__BundlePromiseType__Group__2__Impl"


    // $ANTLR start "rule__BundlePromiseType__Group__3"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1626:1: rule__BundlePromiseType__Group__3 : rule__BundlePromiseType__Group__3__Impl ;
    public final void rule__BundlePromiseType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1630:1: ( rule__BundlePromiseType__Group__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1631:2: rule__BundlePromiseType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__3__Impl_in_rule__BundlePromiseType__Group__33345);
            rule__BundlePromiseType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BundlePromiseType__Group__3"


    // $ANTLR start "rule__BundlePromiseType__Group__3__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1637:1: rule__BundlePromiseType__Group__3__Impl : ( ( rule__BundlePromiseType__ClassesAssignment_3 )* ) ;
    public final void rule__BundlePromiseType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1641:1: ( ( ( rule__BundlePromiseType__ClassesAssignment_3 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1642:1: ( ( rule__BundlePromiseType__ClassesAssignment_3 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1642:1: ( ( rule__BundlePromiseType__ClassesAssignment_3 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1643:1: ( rule__BundlePromiseType__ClassesAssignment_3 )*
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getClassesAssignment_3()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1644:1: ( rule__BundlePromiseType__ClassesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==12||LA16_2==20) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>=13 && LA16_0<=14)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1644:2: rule__BundlePromiseType__ClassesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromiseType__ClassesAssignment_3_in_rule__BundlePromiseType__Group__3__Impl3372);
            	    rule__BundlePromiseType__ClassesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getBundlePromiseTypeAccess().getClassesAssignment_3()); 

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
    // $ANTLR end "rule__BundlePromiseType__Group__3__Impl"


    // $ANTLR start "rule__BundleClass__Group__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1662:1: rule__BundleClass__Group__0 : rule__BundleClass__Group__0__Impl rule__BundleClass__Group__1 ;
    public final void rule__BundleClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1666:1: ( rule__BundleClass__Group__0__Impl rule__BundleClass__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1667:2: rule__BundleClass__Group__0__Impl rule__BundleClass__Group__1
            {
            pushFollow(FOLLOW_rule__BundleClass__Group__0__Impl_in_rule__BundleClass__Group__03411);
            rule__BundleClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundleClass__Group__1_in_rule__BundleClass__Group__03414);
            rule__BundleClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BundleClass__Group__0"


    // $ANTLR start "rule__BundleClass__Group__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1674:1: rule__BundleClass__Group__0__Impl : ( ( rule__BundleClass__NameAssignment_0 ) ) ;
    public final void rule__BundleClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1678:1: ( ( ( rule__BundleClass__NameAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1679:1: ( ( rule__BundleClass__NameAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1679:1: ( ( rule__BundleClass__NameAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1680:1: ( rule__BundleClass__NameAssignment_0 )
            {
             before(grammarAccess.getBundleClassAccess().getNameAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1681:1: ( rule__BundleClass__NameAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1681:2: rule__BundleClass__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BundleClass__NameAssignment_0_in_rule__BundleClass__Group__0__Impl3441);
            rule__BundleClass__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBundleClassAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__BundleClass__Group__0__Impl"


    // $ANTLR start "rule__BundleClass__Group__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1691:1: rule__BundleClass__Group__1 : rule__BundleClass__Group__1__Impl rule__BundleClass__Group__2 ;
    public final void rule__BundleClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1695:1: ( rule__BundleClass__Group__1__Impl rule__BundleClass__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1696:2: rule__BundleClass__Group__1__Impl rule__BundleClass__Group__2
            {
            pushFollow(FOLLOW_rule__BundleClass__Group__1__Impl_in_rule__BundleClass__Group__13471);
            rule__BundleClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundleClass__Group__2_in_rule__BundleClass__Group__13474);
            rule__BundleClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BundleClass__Group__1"


    // $ANTLR start "rule__BundleClass__Group__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1703:1: rule__BundleClass__Group__1__Impl : ( '::' ) ;
    public final void rule__BundleClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1707:1: ( ( '::' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1708:1: ( '::' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1708:1: ( '::' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1709:1: '::'
            {
             before(grammarAccess.getBundleClassAccess().getColonColonKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__BundleClass__Group__1__Impl3502); 
             after(grammarAccess.getBundleClassAccess().getColonColonKeyword_1()); 

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
    // $ANTLR end "rule__BundleClass__Group__1__Impl"


    // $ANTLR start "rule__BundleClass__Group__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1722:1: rule__BundleClass__Group__2 : rule__BundleClass__Group__2__Impl ;
    public final void rule__BundleClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1726:1: ( rule__BundleClass__Group__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1727:2: rule__BundleClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BundleClass__Group__2__Impl_in_rule__BundleClass__Group__23533);
            rule__BundleClass__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BundleClass__Group__2"


    // $ANTLR start "rule__BundleClass__Group__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1733:1: rule__BundleClass__Group__2__Impl : ( ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* ) ) ;
    public final void rule__BundleClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1737:1: ( ( ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1738:1: ( ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1738:1: ( ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1739:1: ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1739:1: ( ( rule__BundleClass__PromisesAssignment_2 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1740:1: ( rule__BundleClass__PromisesAssignment_2 )
            {
             before(grammarAccess.getBundleClassAccess().getPromisesAssignment_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1741:1: ( rule__BundleClass__PromisesAssignment_2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1741:2: rule__BundleClass__PromisesAssignment_2
            {
            pushFollow(FOLLOW_rule__BundleClass__PromisesAssignment_2_in_rule__BundleClass__Group__2__Impl3562);
            rule__BundleClass__PromisesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBundleClassAccess().getPromisesAssignment_2()); 

            }

            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1744:1: ( ( rule__BundleClass__PromisesAssignment_2 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1745:1: ( rule__BundleClass__PromisesAssignment_2 )*
            {
             before(grammarAccess.getBundleClassAccess().getPromisesAssignment_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1746:1: ( rule__BundleClass__PromisesAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1746:2: rule__BundleClass__PromisesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BundleClass__PromisesAssignment_2_in_rule__BundleClass__Group__2__Impl3574);
            	    rule__BundleClass__PromisesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getBundleClassAccess().getPromisesAssignment_2()); 

            }


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
    // $ANTLR end "rule__BundleClass__Group__2__Impl"


    // $ANTLR start "rule__BundlePromise__Group__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1763:1: rule__BundlePromise__Group__0 : rule__BundlePromise__Group__0__Impl rule__BundlePromise__Group__1 ;
    public final void rule__BundlePromise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1767:1: ( rule__BundlePromise__Group__0__Impl rule__BundlePromise__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1768:2: rule__BundlePromise__Group__0__Impl rule__BundlePromise__Group__1
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group__0__Impl_in_rule__BundlePromise__Group__03613);
            rule__BundlePromise__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group__1_in_rule__BundlePromise__Group__03616);
            rule__BundlePromise__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BundlePromise__Group__0"


    // $ANTLR start "rule__BundlePromise__Group__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1775:1: rule__BundlePromise__Group__0__Impl : ( ( rule__BundlePromise__NameAssignment_0 ) ) ;
    public final void rule__BundlePromise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1779:1: ( ( ( rule__BundlePromise__NameAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1780:1: ( ( rule__BundlePromise__NameAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1780:1: ( ( rule__BundlePromise__NameAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1781:1: ( rule__BundlePromise__NameAssignment_0 )
            {
             before(grammarAccess.getBundlePromiseAccess().getNameAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1782:1: ( rule__BundlePromise__NameAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1782:2: rule__BundlePromise__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BundlePromise__NameAssignment_0_in_rule__BundlePromise__Group__0__Impl3643);
            rule__BundlePromise__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBundlePromiseAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__BundlePromise__Group__0__Impl"


    // $ANTLR start "rule__BundlePromise__Group__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1792:1: rule__BundlePromise__Group__1 : rule__BundlePromise__Group__1__Impl rule__BundlePromise__Group__2 ;
    public final void rule__BundlePromise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1796:1: ( rule__BundlePromise__Group__1__Impl rule__BundlePromise__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1797:2: rule__BundlePromise__Group__1__Impl rule__BundlePromise__Group__2
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group__1__Impl_in_rule__BundlePromise__Group__13673);
            rule__BundlePromise__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group__2_in_rule__BundlePromise__Group__13676);
            rule__BundlePromise__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BundlePromise__Group__1"


    // $ANTLR start "rule__BundlePromise__Group__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1804:1: rule__BundlePromise__Group__1__Impl : ( ( rule__BundlePromise__Group_1__0 )? ) ;
    public final void rule__BundlePromise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1808:1: ( ( ( rule__BundlePromise__Group_1__0 )? ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1809:1: ( ( rule__BundlePromise__Group_1__0 )? )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1809:1: ( ( rule__BundlePromise__Group_1__0 )? )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1810:1: ( rule__BundlePromise__Group_1__0 )?
            {
             before(grammarAccess.getBundlePromiseAccess().getGroup_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1811:1: ( rule__BundlePromise__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1811:2: rule__BundlePromise__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BundlePromise__Group_1__0_in_rule__BundlePromise__Group__1__Impl3703);
                    rule__BundlePromise__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBundlePromiseAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BundlePromise__Group__1__Impl"


    // $ANTLR start "rule__BundlePromise__Group__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1821:1: rule__BundlePromise__Group__2 : rule__BundlePromise__Group__2__Impl ;
    public final void rule__BundlePromise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1825:1: ( rule__BundlePromise__Group__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1826:2: rule__BundlePromise__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group__2__Impl_in_rule__BundlePromise__Group__23734);
            rule__BundlePromise__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BundlePromise__Group__2"


    // $ANTLR start "rule__BundlePromise__Group__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1832:1: rule__BundlePromise__Group__2__Impl : ( ';' ) ;
    public final void rule__BundlePromise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1836:1: ( ( ';' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1837:1: ( ';' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1837:1: ( ';' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1838:1: ';'
            {
             before(grammarAccess.getBundlePromiseAccess().getSemicolonKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__BundlePromise__Group__2__Impl3762); 
             after(grammarAccess.getBundlePromiseAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__BundlePromise__Group__2__Impl"


    // $ANTLR start "rule__BundlePromise__Group_1__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1857:1: rule__BundlePromise__Group_1__0 : rule__BundlePromise__Group_1__0__Impl rule__BundlePromise__Group_1__1 ;
    public final void rule__BundlePromise__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1861:1: ( rule__BundlePromise__Group_1__0__Impl rule__BundlePromise__Group_1__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1862:2: rule__BundlePromise__Group_1__0__Impl rule__BundlePromise__Group_1__1
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1__0__Impl_in_rule__BundlePromise__Group_1__03799);
            rule__BundlePromise__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group_1__1_in_rule__BundlePromise__Group_1__03802);
            rule__BundlePromise__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BundlePromise__Group_1__0"


    // $ANTLR start "rule__BundlePromise__Group_1__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1869:1: rule__BundlePromise__Group_1__0__Impl : ( ( rule__BundlePromise__ValuesAssignment_1_0 ) ) ;
    public final void rule__BundlePromise__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1873:1: ( ( ( rule__BundlePromise__ValuesAssignment_1_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1874:1: ( ( rule__BundlePromise__ValuesAssignment_1_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1874:1: ( ( rule__BundlePromise__ValuesAssignment_1_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1875:1: ( rule__BundlePromise__ValuesAssignment_1_0 )
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesAssignment_1_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1876:1: ( rule__BundlePromise__ValuesAssignment_1_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1876:2: rule__BundlePromise__ValuesAssignment_1_0
            {
            pushFollow(FOLLOW_rule__BundlePromise__ValuesAssignment_1_0_in_rule__BundlePromise__Group_1__0__Impl3829);
            rule__BundlePromise__ValuesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBundlePromiseAccess().getValuesAssignment_1_0()); 

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
    // $ANTLR end "rule__BundlePromise__Group_1__0__Impl"


    // $ANTLR start "rule__BundlePromise__Group_1__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1886:1: rule__BundlePromise__Group_1__1 : rule__BundlePromise__Group_1__1__Impl ;
    public final void rule__BundlePromise__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1890:1: ( rule__BundlePromise__Group_1__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1891:2: rule__BundlePromise__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1__1__Impl_in_rule__BundlePromise__Group_1__13859);
            rule__BundlePromise__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BundlePromise__Group_1__1"


    // $ANTLR start "rule__BundlePromise__Group_1__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1897:1: rule__BundlePromise__Group_1__1__Impl : ( ( rule__BundlePromise__Group_1_1__0 )* ) ;
    public final void rule__BundlePromise__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1901:1: ( ( ( rule__BundlePromise__Group_1_1__0 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1902:1: ( ( rule__BundlePromise__Group_1_1__0 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1902:1: ( ( rule__BundlePromise__Group_1_1__0 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1903:1: ( rule__BundlePromise__Group_1_1__0 )*
            {
             before(grammarAccess.getBundlePromiseAccess().getGroup_1_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1904:1: ( rule__BundlePromise__Group_1_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==11) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1904:2: rule__BundlePromise__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__0_in_rule__BundlePromise__Group_1__1__Impl3886);
            	    rule__BundlePromise__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getBundlePromiseAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__BundlePromise__Group_1__1__Impl"


    // $ANTLR start "rule__BundlePromise__Group_1_1__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1918:1: rule__BundlePromise__Group_1_1__0 : rule__BundlePromise__Group_1_1__0__Impl rule__BundlePromise__Group_1_1__1 ;
    public final void rule__BundlePromise__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1922:1: ( rule__BundlePromise__Group_1_1__0__Impl rule__BundlePromise__Group_1_1__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1923:2: rule__BundlePromise__Group_1_1__0__Impl rule__BundlePromise__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__0__Impl_in_rule__BundlePromise__Group_1_1__03921);
            rule__BundlePromise__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__1_in_rule__BundlePromise__Group_1_1__03924);
            rule__BundlePromise__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BundlePromise__Group_1_1__0"


    // $ANTLR start "rule__BundlePromise__Group_1_1__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1930:1: rule__BundlePromise__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__BundlePromise__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1934:1: ( ( ',' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1935:1: ( ',' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1935:1: ( ',' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1936:1: ','
            {
             before(grammarAccess.getBundlePromiseAccess().getCommaKeyword_1_1_0()); 
            match(input,11,FOLLOW_11_in_rule__BundlePromise__Group_1_1__0__Impl3952); 
             after(grammarAccess.getBundlePromiseAccess().getCommaKeyword_1_1_0()); 

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
    // $ANTLR end "rule__BundlePromise__Group_1_1__0__Impl"


    // $ANTLR start "rule__BundlePromise__Group_1_1__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1949:1: rule__BundlePromise__Group_1_1__1 : rule__BundlePromise__Group_1_1__1__Impl ;
    public final void rule__BundlePromise__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1953:1: ( rule__BundlePromise__Group_1_1__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1954:2: rule__BundlePromise__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__1__Impl_in_rule__BundlePromise__Group_1_1__13983);
            rule__BundlePromise__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BundlePromise__Group_1_1__1"


    // $ANTLR start "rule__BundlePromise__Group_1_1__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1960:1: rule__BundlePromise__Group_1_1__1__Impl : ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) ) ;
    public final void rule__BundlePromise__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1964:1: ( ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1965:1: ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1965:1: ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1966:1: ( rule__BundlePromise__ValuesAssignment_1_1_1 )
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesAssignment_1_1_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1967:1: ( rule__BundlePromise__ValuesAssignment_1_1_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1967:2: rule__BundlePromise__ValuesAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__BundlePromise__ValuesAssignment_1_1_1_in_rule__BundlePromise__Group_1_1__1__Impl4010);
            rule__BundlePromise__ValuesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBundlePromiseAccess().getValuesAssignment_1_1_1()); 

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
    // $ANTLR end "rule__BundlePromise__Group_1_1__1__Impl"


    // $ANTLR start "rule__PromiseValue__Group__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1981:1: rule__PromiseValue__Group__0 : rule__PromiseValue__Group__0__Impl rule__PromiseValue__Group__1 ;
    public final void rule__PromiseValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1985:1: ( rule__PromiseValue__Group__0__Impl rule__PromiseValue__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1986:2: rule__PromiseValue__Group__0__Impl rule__PromiseValue__Group__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group__0__Impl_in_rule__PromiseValue__Group__04044);
            rule__PromiseValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group__1_in_rule__PromiseValue__Group__04047);
            rule__PromiseValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group__0"


    // $ANTLR start "rule__PromiseValue__Group__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1993:1: rule__PromiseValue__Group__0__Impl : ( ( rule__PromiseValue__KeywordAssignment_0 ) ) ;
    public final void rule__PromiseValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1997:1: ( ( ( rule__PromiseValue__KeywordAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1998:1: ( ( rule__PromiseValue__KeywordAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1998:1: ( ( rule__PromiseValue__KeywordAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1999:1: ( rule__PromiseValue__KeywordAssignment_0 )
            {
             before(grammarAccess.getPromiseValueAccess().getKeywordAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2000:1: ( rule__PromiseValue__KeywordAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2000:2: rule__PromiseValue__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__PromiseValue__KeywordAssignment_0_in_rule__PromiseValue__Group__0__Impl4074);
            rule__PromiseValue__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPromiseValueAccess().getKeywordAssignment_0()); 

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
    // $ANTLR end "rule__PromiseValue__Group__0__Impl"


    // $ANTLR start "rule__PromiseValue__Group__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2010:1: rule__PromiseValue__Group__1 : rule__PromiseValue__Group__1__Impl rule__PromiseValue__Group__2 ;
    public final void rule__PromiseValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2014:1: ( rule__PromiseValue__Group__1__Impl rule__PromiseValue__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2015:2: rule__PromiseValue__Group__1__Impl rule__PromiseValue__Group__2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group__1__Impl_in_rule__PromiseValue__Group__14104);
            rule__PromiseValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group__2_in_rule__PromiseValue__Group__14107);
            rule__PromiseValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group__1"


    // $ANTLR start "rule__PromiseValue__Group__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2022:1: rule__PromiseValue__Group__1__Impl : ( '=>' ) ;
    public final void rule__PromiseValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2026:1: ( ( '=>' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2027:1: ( '=>' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2027:1: ( '=>' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2028:1: '=>'
            {
             before(grammarAccess.getPromiseValueAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__PromiseValue__Group__1__Impl4135); 
             after(grammarAccess.getPromiseValueAccess().getEqualsSignGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__PromiseValue__Group__1__Impl"


    // $ANTLR start "rule__PromiseValue__Group__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2041:1: rule__PromiseValue__Group__2 : rule__PromiseValue__Group__2__Impl ;
    public final void rule__PromiseValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2045:1: ( rule__PromiseValue__Group__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2046:2: rule__PromiseValue__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group__2__Impl_in_rule__PromiseValue__Group__24166);
            rule__PromiseValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group__2"


    // $ANTLR start "rule__PromiseValue__Group__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2052:1: rule__PromiseValue__Group__2__Impl : ( ( rule__PromiseValue__Alternatives_2 ) ) ;
    public final void rule__PromiseValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2056:1: ( ( ( rule__PromiseValue__Alternatives_2 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2057:1: ( ( rule__PromiseValue__Alternatives_2 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2057:1: ( ( rule__PromiseValue__Alternatives_2 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2058:1: ( rule__PromiseValue__Alternatives_2 )
            {
             before(grammarAccess.getPromiseValueAccess().getAlternatives_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2059:1: ( rule__PromiseValue__Alternatives_2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2059:2: rule__PromiseValue__Alternatives_2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_in_rule__PromiseValue__Group__2__Impl4193);
            rule__PromiseValue__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getPromiseValueAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__PromiseValue__Group__2__Impl"


    // $ANTLR start "rule__PromiseValue__Group_2_1__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2075:1: rule__PromiseValue__Group_2_1__0 : rule__PromiseValue__Group_2_1__0__Impl rule__PromiseValue__Group_2_1__1 ;
    public final void rule__PromiseValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2079:1: ( rule__PromiseValue__Group_2_1__0__Impl rule__PromiseValue__Group_2_1__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2080:2: rule__PromiseValue__Group_2_1__0__Impl rule__PromiseValue__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__0__Impl_in_rule__PromiseValue__Group_2_1__04229);
            rule__PromiseValue__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__1_in_rule__PromiseValue__Group_2_1__04232);
            rule__PromiseValue__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group_2_1__0"


    // $ANTLR start "rule__PromiseValue__Group_2_1__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2087:1: rule__PromiseValue__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__PromiseValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2091:1: ( ( '{' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2092:1: ( '{' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2092:1: ( '{' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2093:1: '{'
            {
             before(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,17,FOLLOW_17_in_rule__PromiseValue__Group_2_1__0__Impl4260); 
             after(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_1_0()); 

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
    // $ANTLR end "rule__PromiseValue__Group_2_1__0__Impl"


    // $ANTLR start "rule__PromiseValue__Group_2_1__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2106:1: rule__PromiseValue__Group_2_1__1 : rule__PromiseValue__Group_2_1__1__Impl rule__PromiseValue__Group_2_1__2 ;
    public final void rule__PromiseValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2110:1: ( rule__PromiseValue__Group_2_1__1__Impl rule__PromiseValue__Group_2_1__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2111:2: rule__PromiseValue__Group_2_1__1__Impl rule__PromiseValue__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__1__Impl_in_rule__PromiseValue__Group_2_1__14291);
            rule__PromiseValue__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__2_in_rule__PromiseValue__Group_2_1__14294);
            rule__PromiseValue__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group_2_1__1"


    // $ANTLR start "rule__PromiseValue__Group_2_1__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2118:1: rule__PromiseValue__Group_2_1__1__Impl : ( ( rule__PromiseValue__Alternatives_2_1_1 ) ) ;
    public final void rule__PromiseValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2122:1: ( ( ( rule__PromiseValue__Alternatives_2_1_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2123:1: ( ( rule__PromiseValue__Alternatives_2_1_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2123:1: ( ( rule__PromiseValue__Alternatives_2_1_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2124:1: ( rule__PromiseValue__Alternatives_2_1_1 )
            {
             before(grammarAccess.getPromiseValueAccess().getAlternatives_2_1_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2125:1: ( rule__PromiseValue__Alternatives_2_1_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2125:2: rule__PromiseValue__Alternatives_2_1_1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_1_1_in_rule__PromiseValue__Group_2_1__1__Impl4321);
            rule__PromiseValue__Alternatives_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPromiseValueAccess().getAlternatives_2_1_1()); 

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
    // $ANTLR end "rule__PromiseValue__Group_2_1__1__Impl"


    // $ANTLR start "rule__PromiseValue__Group_2_1__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2135:1: rule__PromiseValue__Group_2_1__2 : rule__PromiseValue__Group_2_1__2__Impl rule__PromiseValue__Group_2_1__3 ;
    public final void rule__PromiseValue__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2139:1: ( rule__PromiseValue__Group_2_1__2__Impl rule__PromiseValue__Group_2_1__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2140:2: rule__PromiseValue__Group_2_1__2__Impl rule__PromiseValue__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__2__Impl_in_rule__PromiseValue__Group_2_1__24351);
            rule__PromiseValue__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__3_in_rule__PromiseValue__Group_2_1__24354);
            rule__PromiseValue__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group_2_1__2"


    // $ANTLR start "rule__PromiseValue__Group_2_1__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2147:1: rule__PromiseValue__Group_2_1__2__Impl : ( ( rule__PromiseValue__Group_2_1_2__0 )* ) ;
    public final void rule__PromiseValue__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2151:1: ( ( ( rule__PromiseValue__Group_2_1_2__0 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2152:1: ( ( rule__PromiseValue__Group_2_1_2__0 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2152:1: ( ( rule__PromiseValue__Group_2_1_2__0 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2153:1: ( rule__PromiseValue__Group_2_1_2__0 )*
            {
             before(grammarAccess.getPromiseValueAccess().getGroup_2_1_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2154:1: ( rule__PromiseValue__Group_2_1_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==11) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2154:2: rule__PromiseValue__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__0_in_rule__PromiseValue__Group_2_1__2__Impl4381);
            	    rule__PromiseValue__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getPromiseValueAccess().getGroup_2_1_2()); 

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
    // $ANTLR end "rule__PromiseValue__Group_2_1__2__Impl"


    // $ANTLR start "rule__PromiseValue__Group_2_1__3"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2164:1: rule__PromiseValue__Group_2_1__3 : rule__PromiseValue__Group_2_1__3__Impl ;
    public final void rule__PromiseValue__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2168:1: ( rule__PromiseValue__Group_2_1__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2169:2: rule__PromiseValue__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__3__Impl_in_rule__PromiseValue__Group_2_1__34412);
            rule__PromiseValue__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group_2_1__3"


    // $ANTLR start "rule__PromiseValue__Group_2_1__3__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2175:1: rule__PromiseValue__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__PromiseValue__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2179:1: ( ( '}' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2180:1: ( '}' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2180:1: ( '}' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2181:1: '}'
            {
             before(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,18,FOLLOW_18_in_rule__PromiseValue__Group_2_1__3__Impl4440); 
             after(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_1_3()); 

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
    // $ANTLR end "rule__PromiseValue__Group_2_1__3__Impl"


    // $ANTLR start "rule__PromiseValue__Group_2_1_2__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2202:1: rule__PromiseValue__Group_2_1_2__0 : rule__PromiseValue__Group_2_1_2__0__Impl rule__PromiseValue__Group_2_1_2__1 ;
    public final void rule__PromiseValue__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2206:1: ( rule__PromiseValue__Group_2_1_2__0__Impl rule__PromiseValue__Group_2_1_2__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2207:2: rule__PromiseValue__Group_2_1_2__0__Impl rule__PromiseValue__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__0__Impl_in_rule__PromiseValue__Group_2_1_2__04479);
            rule__PromiseValue__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__1_in_rule__PromiseValue__Group_2_1_2__04482);
            rule__PromiseValue__Group_2_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group_2_1_2__0"


    // $ANTLR start "rule__PromiseValue__Group_2_1_2__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2214:1: rule__PromiseValue__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__PromiseValue__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2218:1: ( ( ',' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2219:1: ( ',' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2219:1: ( ',' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2220:1: ','
            {
             before(grammarAccess.getPromiseValueAccess().getCommaKeyword_2_1_2_0()); 
            match(input,11,FOLLOW_11_in_rule__PromiseValue__Group_2_1_2__0__Impl4510); 
             after(grammarAccess.getPromiseValueAccess().getCommaKeyword_2_1_2_0()); 

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
    // $ANTLR end "rule__PromiseValue__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__PromiseValue__Group_2_1_2__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2233:1: rule__PromiseValue__Group_2_1_2__1 : rule__PromiseValue__Group_2_1_2__1__Impl ;
    public final void rule__PromiseValue__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2237:1: ( rule__PromiseValue__Group_2_1_2__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2238:2: rule__PromiseValue__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__1__Impl_in_rule__PromiseValue__Group_2_1_2__14541);
            rule__PromiseValue__Group_2_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group_2_1_2__1"


    // $ANTLR start "rule__PromiseValue__Group_2_1_2__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2244:1: rule__PromiseValue__Group_2_1_2__1__Impl : ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) ) ;
    public final void rule__PromiseValue__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2248:1: ( ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2249:1: ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2249:1: ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2250:1: ( rule__PromiseValue__Alternatives_2_1_2_1 )
            {
             before(grammarAccess.getPromiseValueAccess().getAlternatives_2_1_2_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2251:1: ( rule__PromiseValue__Alternatives_2_1_2_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2251:2: rule__PromiseValue__Alternatives_2_1_2_1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_1_2_1_in_rule__PromiseValue__Group_2_1_2__1__Impl4568);
            rule__PromiseValue__Alternatives_2_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPromiseValueAccess().getAlternatives_2_1_2_1()); 

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
    // $ANTLR end "rule__PromiseValue__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__PromiseValue__Group_2_2__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2265:1: rule__PromiseValue__Group_2_2__0 : rule__PromiseValue__Group_2_2__0__Impl rule__PromiseValue__Group_2_2__1 ;
    public final void rule__PromiseValue__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2269:1: ( rule__PromiseValue__Group_2_2__0__Impl rule__PromiseValue__Group_2_2__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2270:2: rule__PromiseValue__Group_2_2__0__Impl rule__PromiseValue__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__0__Impl_in_rule__PromiseValue__Group_2_2__04602);
            rule__PromiseValue__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__1_in_rule__PromiseValue__Group_2_2__04605);
            rule__PromiseValue__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group_2_2__0"


    // $ANTLR start "rule__PromiseValue__Group_2_2__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2277:1: rule__PromiseValue__Group_2_2__0__Impl : ( '{' ) ;
    public final void rule__PromiseValue__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2281:1: ( ( '{' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2282:1: ( '{' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2282:1: ( '{' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2283:1: '{'
            {
             before(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_2_0()); 
            match(input,17,FOLLOW_17_in_rule__PromiseValue__Group_2_2__0__Impl4633); 
             after(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_2_0()); 

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
    // $ANTLR end "rule__PromiseValue__Group_2_2__0__Impl"


    // $ANTLR start "rule__PromiseValue__Group_2_2__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2296:1: rule__PromiseValue__Group_2_2__1 : rule__PromiseValue__Group_2_2__1__Impl rule__PromiseValue__Group_2_2__2 ;
    public final void rule__PromiseValue__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2300:1: ( rule__PromiseValue__Group_2_2__1__Impl rule__PromiseValue__Group_2_2__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2301:2: rule__PromiseValue__Group_2_2__1__Impl rule__PromiseValue__Group_2_2__2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__1__Impl_in_rule__PromiseValue__Group_2_2__14664);
            rule__PromiseValue__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__2_in_rule__PromiseValue__Group_2_2__14667);
            rule__PromiseValue__Group_2_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group_2_2__1"


    // $ANTLR start "rule__PromiseValue__Group_2_2__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2308:1: rule__PromiseValue__Group_2_2__1__Impl : ( '@' ) ;
    public final void rule__PromiseValue__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2312:1: ( ( '@' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2313:1: ( '@' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2313:1: ( '@' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2314:1: '@'
            {
             before(grammarAccess.getPromiseValueAccess().getCommercialAtKeyword_2_2_1()); 
            match(input,23,FOLLOW_23_in_rule__PromiseValue__Group_2_2__1__Impl4695); 
             after(grammarAccess.getPromiseValueAccess().getCommercialAtKeyword_2_2_1()); 

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
    // $ANTLR end "rule__PromiseValue__Group_2_2__1__Impl"


    // $ANTLR start "rule__PromiseValue__Group_2_2__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2327:1: rule__PromiseValue__Group_2_2__2 : rule__PromiseValue__Group_2_2__2__Impl rule__PromiseValue__Group_2_2__3 ;
    public final void rule__PromiseValue__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2331:1: ( rule__PromiseValue__Group_2_2__2__Impl rule__PromiseValue__Group_2_2__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2332:2: rule__PromiseValue__Group_2_2__2__Impl rule__PromiseValue__Group_2_2__3
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__2__Impl_in_rule__PromiseValue__Group_2_2__24726);
            rule__PromiseValue__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__3_in_rule__PromiseValue__Group_2_2__24729);
            rule__PromiseValue__Group_2_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group_2_2__2"


    // $ANTLR start "rule__PromiseValue__Group_2_2__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2339:1: rule__PromiseValue__Group_2_2__2__Impl : ( '(' ) ;
    public final void rule__PromiseValue__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2343:1: ( ( '(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2344:1: ( '(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2344:1: ( '(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2345:1: '('
            {
             before(grammarAccess.getPromiseValueAccess().getLeftParenthesisKeyword_2_2_2()); 
            match(input,14,FOLLOW_14_in_rule__PromiseValue__Group_2_2__2__Impl4757); 
             after(grammarAccess.getPromiseValueAccess().getLeftParenthesisKeyword_2_2_2()); 

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
    // $ANTLR end "rule__PromiseValue__Group_2_2__2__Impl"


    // $ANTLR start "rule__PromiseValue__Group_2_2__3"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2358:1: rule__PromiseValue__Group_2_2__3 : rule__PromiseValue__Group_2_2__3__Impl rule__PromiseValue__Group_2_2__4 ;
    public final void rule__PromiseValue__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2362:1: ( rule__PromiseValue__Group_2_2__3__Impl rule__PromiseValue__Group_2_2__4 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2363:2: rule__PromiseValue__Group_2_2__3__Impl rule__PromiseValue__Group_2_2__4
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__3__Impl_in_rule__PromiseValue__Group_2_2__34788);
            rule__PromiseValue__Group_2_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__4_in_rule__PromiseValue__Group_2_2__34791);
            rule__PromiseValue__Group_2_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group_2_2__3"


    // $ANTLR start "rule__PromiseValue__Group_2_2__3__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2370:1: rule__PromiseValue__Group_2_2__3__Impl : ( RULE_ID ) ;
    public final void rule__PromiseValue__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2374:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2375:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2375:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2376:1: RULE_ID
            {
             before(grammarAccess.getPromiseValueAccess().getIDTerminalRuleCall_2_2_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PromiseValue__Group_2_2__3__Impl4818); 
             after(grammarAccess.getPromiseValueAccess().getIDTerminalRuleCall_2_2_3()); 

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
    // $ANTLR end "rule__PromiseValue__Group_2_2__3__Impl"


    // $ANTLR start "rule__PromiseValue__Group_2_2__4"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2387:1: rule__PromiseValue__Group_2_2__4 : rule__PromiseValue__Group_2_2__4__Impl rule__PromiseValue__Group_2_2__5 ;
    public final void rule__PromiseValue__Group_2_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2391:1: ( rule__PromiseValue__Group_2_2__4__Impl rule__PromiseValue__Group_2_2__5 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2392:2: rule__PromiseValue__Group_2_2__4__Impl rule__PromiseValue__Group_2_2__5
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__4__Impl_in_rule__PromiseValue__Group_2_2__44847);
            rule__PromiseValue__Group_2_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__5_in_rule__PromiseValue__Group_2_2__44850);
            rule__PromiseValue__Group_2_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group_2_2__4"


    // $ANTLR start "rule__PromiseValue__Group_2_2__4__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2399:1: rule__PromiseValue__Group_2_2__4__Impl : ( ')' ) ;
    public final void rule__PromiseValue__Group_2_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2403:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2404:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2404:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2405:1: ')'
            {
             before(grammarAccess.getPromiseValueAccess().getRightParenthesisKeyword_2_2_4()); 
            match(input,15,FOLLOW_15_in_rule__PromiseValue__Group_2_2__4__Impl4878); 
             after(grammarAccess.getPromiseValueAccess().getRightParenthesisKeyword_2_2_4()); 

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
    // $ANTLR end "rule__PromiseValue__Group_2_2__4__Impl"


    // $ANTLR start "rule__PromiseValue__Group_2_2__5"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2418:1: rule__PromiseValue__Group_2_2__5 : rule__PromiseValue__Group_2_2__5__Impl ;
    public final void rule__PromiseValue__Group_2_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2422:1: ( rule__PromiseValue__Group_2_2__5__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2423:2: rule__PromiseValue__Group_2_2__5__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__5__Impl_in_rule__PromiseValue__Group_2_2__54909);
            rule__PromiseValue__Group_2_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PromiseValue__Group_2_2__5"


    // $ANTLR start "rule__PromiseValue__Group_2_2__5__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2429:1: rule__PromiseValue__Group_2_2__5__Impl : ( '}' ) ;
    public final void rule__PromiseValue__Group_2_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2433:1: ( ( '}' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2434:1: ( '}' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2434:1: ( '}' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2435:1: '}'
            {
             before(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_2_5()); 
            match(input,18,FOLLOW_18_in_rule__PromiseValue__Group_2_2__5__Impl4937); 
             after(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_2_5()); 

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
    // $ANTLR end "rule__PromiseValue__Group_2_2__5__Impl"


    // $ANTLR start "rule__Body__Group__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2460:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2464:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2465:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__04980);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__04983);
            rule__Body__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__0"


    // $ANTLR start "rule__Body__Group__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2472:1: rule__Body__Group__0__Impl : ( 'body' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2476:1: ( ( 'body' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2477:1: ( 'body' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2477:1: ( 'body' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2478:1: 'body'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Body__Group__0__Impl5011); 
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
    // $ANTLR end "rule__Body__Group__0__Impl"


    // $ANTLR start "rule__Body__Group__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2491:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2495:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2496:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__15042);
            rule__Body__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__15045);
            rule__Body__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__1"


    // $ANTLR start "rule__Body__Group__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2503:1: rule__Body__Group__1__Impl : ( ( rule__Body__ComponentAssignment_1 ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2507:1: ( ( ( rule__Body__ComponentAssignment_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2508:1: ( ( rule__Body__ComponentAssignment_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2508:1: ( ( rule__Body__ComponentAssignment_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2509:1: ( rule__Body__ComponentAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getComponentAssignment_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2510:1: ( rule__Body__ComponentAssignment_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2510:2: rule__Body__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl5072);
            rule__Body__ComponentAssignment_1();

            state._fsp--;


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
    // $ANTLR end "rule__Body__Group__1__Impl"


    // $ANTLR start "rule__Body__Group__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2520:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2524:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2525:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__25102);
            rule__Body__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__3_in_rule__Body__Group__25105);
            rule__Body__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__2"


    // $ANTLR start "rule__Body__Group__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2532:1: rule__Body__Group__2__Impl : ( ( rule__Body__NameAssignment_2 ) ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2536:1: ( ( ( rule__Body__NameAssignment_2 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2537:1: ( ( rule__Body__NameAssignment_2 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2537:1: ( ( rule__Body__NameAssignment_2 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2538:1: ( rule__Body__NameAssignment_2 )
            {
             before(grammarAccess.getBodyAccess().getNameAssignment_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2539:1: ( rule__Body__NameAssignment_2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2539:2: rule__Body__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Body__NameAssignment_2_in_rule__Body__Group__2__Impl5132);
            rule__Body__NameAssignment_2();

            state._fsp--;


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
    // $ANTLR end "rule__Body__Group__2__Impl"


    // $ANTLR start "rule__Body__Group__3"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2549:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2553:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2554:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__35162);
            rule__Body__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__4_in_rule__Body__Group__35165);
            rule__Body__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__3"


    // $ANTLR start "rule__Body__Group__3__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2561:1: rule__Body__Group__3__Impl : ( ( rule__Body__Group_3__0 )? ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2565:1: ( ( ( rule__Body__Group_3__0 )? ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2566:1: ( ( rule__Body__Group_3__0 )? )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2566:1: ( ( rule__Body__Group_3__0 )? )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2567:1: ( rule__Body__Group_3__0 )?
            {
             before(grammarAccess.getBodyAccess().getGroup_3()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2568:1: ( rule__Body__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2568:2: rule__Body__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Body__Group_3__0_in_rule__Body__Group__3__Impl5192);
                    rule__Body__Group_3__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Body__Group__3__Impl"


    // $ANTLR start "rule__Body__Group__4"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2578:1: rule__Body__Group__4 : rule__Body__Group__4__Impl rule__Body__Group__5 ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2582:1: ( rule__Body__Group__4__Impl rule__Body__Group__5 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2583:2: rule__Body__Group__4__Impl rule__Body__Group__5
            {
            pushFollow(FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__45223);
            rule__Body__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__5_in_rule__Body__Group__45226);
            rule__Body__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__4"


    // $ANTLR start "rule__Body__Group__4__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2590:1: rule__Body__Group__4__Impl : ( '{' ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2594:1: ( ( '{' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2595:1: ( '{' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2595:1: ( '{' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2596:1: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Body__Group__4__Impl5254); 
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
    // $ANTLR end "rule__Body__Group__4__Impl"


    // $ANTLR start "rule__Body__Group__5"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2609:1: rule__Body__Group__5 : rule__Body__Group__5__Impl rule__Body__Group__6 ;
    public final void rule__Body__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2613:1: ( rule__Body__Group__5__Impl rule__Body__Group__6 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2614:2: rule__Body__Group__5__Impl rule__Body__Group__6
            {
            pushFollow(FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__55285);
            rule__Body__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__6_in_rule__Body__Group__55288);
            rule__Body__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__5"


    // $ANTLR start "rule__Body__Group__5__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2621:1: rule__Body__Group__5__Impl : ( ( rule__Body__PromiseTypeAssignment_5 )* ) ;
    public final void rule__Body__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2625:1: ( ( ( rule__Body__PromiseTypeAssignment_5 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2626:1: ( ( rule__Body__PromiseTypeAssignment_5 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2626:1: ( ( rule__Body__PromiseTypeAssignment_5 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2627:1: ( rule__Body__PromiseTypeAssignment_5 )*
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeAssignment_5()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2628:1: ( rule__Body__PromiseTypeAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==22) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2628:2: rule__Body__PromiseTypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Body__PromiseTypeAssignment_5_in_rule__Body__Group__5__Impl5315);
            	    rule__Body__PromiseTypeAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "rule__Body__Group__5__Impl"


    // $ANTLR start "rule__Body__Group__6"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2638:1: rule__Body__Group__6 : rule__Body__Group__6__Impl rule__Body__Group__7 ;
    public final void rule__Body__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2642:1: ( rule__Body__Group__6__Impl rule__Body__Group__7 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2643:2: rule__Body__Group__6__Impl rule__Body__Group__7
            {
            pushFollow(FOLLOW_rule__Body__Group__6__Impl_in_rule__Body__Group__65346);
            rule__Body__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__7_in_rule__Body__Group__65349);
            rule__Body__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__6"


    // $ANTLR start "rule__Body__Group__6__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2650:1: rule__Body__Group__6__Impl : ( ( rule__Body__ClassesAssignment_6 )* ) ;
    public final void rule__Body__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2654:1: ( ( ( rule__Body__ClassesAssignment_6 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2655:1: ( ( rule__Body__ClassesAssignment_6 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2655:1: ( ( rule__Body__ClassesAssignment_6 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2656:1: ( rule__Body__ClassesAssignment_6 )*
            {
             before(grammarAccess.getBodyAccess().getClassesAssignment_6()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2657:1: ( rule__Body__ClassesAssignment_6 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=13 && LA23_0<=14)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2657:2: rule__Body__ClassesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Body__ClassesAssignment_6_in_rule__Body__Group__6__Impl5376);
            	    rule__Body__ClassesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getClassesAssignment_6()); 

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
    // $ANTLR end "rule__Body__Group__6__Impl"


    // $ANTLR start "rule__Body__Group__7"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2667:1: rule__Body__Group__7 : rule__Body__Group__7__Impl ;
    public final void rule__Body__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2671:1: ( rule__Body__Group__7__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2672:2: rule__Body__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__7__Impl_in_rule__Body__Group__75407);
            rule__Body__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__7"


    // $ANTLR start "rule__Body__Group__7__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2678:1: rule__Body__Group__7__Impl : ( '}' ) ;
    public final void rule__Body__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2682:1: ( ( '}' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2683:1: ( '}' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2683:1: ( '}' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2684:1: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__Body__Group__7__Impl5435); 
             after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Body__Group__7__Impl"


    // $ANTLR start "rule__Body__Group_3__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2713:1: rule__Body__Group_3__0 : rule__Body__Group_3__0__Impl rule__Body__Group_3__1 ;
    public final void rule__Body__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2717:1: ( rule__Body__Group_3__0__Impl rule__Body__Group_3__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2718:2: rule__Body__Group_3__0__Impl rule__Body__Group_3__1
            {
            pushFollow(FOLLOW_rule__Body__Group_3__0__Impl_in_rule__Body__Group_3__05482);
            rule__Body__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__1_in_rule__Body__Group_3__05485);
            rule__Body__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3__0"


    // $ANTLR start "rule__Body__Group_3__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2725:1: rule__Body__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Body__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2729:1: ( ( '(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2730:1: ( '(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2730:1: ( '(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2731:1: '('
            {
             before(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__Body__Group_3__0__Impl5513); 
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
    // $ANTLR end "rule__Body__Group_3__0__Impl"


    // $ANTLR start "rule__Body__Group_3__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2744:1: rule__Body__Group_3__1 : rule__Body__Group_3__1__Impl rule__Body__Group_3__2 ;
    public final void rule__Body__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2748:1: ( rule__Body__Group_3__1__Impl rule__Body__Group_3__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2749:2: rule__Body__Group_3__1__Impl rule__Body__Group_3__2
            {
            pushFollow(FOLLOW_rule__Body__Group_3__1__Impl_in_rule__Body__Group_3__15544);
            rule__Body__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__2_in_rule__Body__Group_3__15547);
            rule__Body__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3__1"


    // $ANTLR start "rule__Body__Group_3__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2756:1: rule__Body__Group_3__1__Impl : ( ( rule__Body__VariablesAssignment_3_1 ) ) ;
    public final void rule__Body__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2760:1: ( ( ( rule__Body__VariablesAssignment_3_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2761:1: ( ( rule__Body__VariablesAssignment_3_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2761:1: ( ( rule__Body__VariablesAssignment_3_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2762:1: ( rule__Body__VariablesAssignment_3_1 )
            {
             before(grammarAccess.getBodyAccess().getVariablesAssignment_3_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2763:1: ( rule__Body__VariablesAssignment_3_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2763:2: rule__Body__VariablesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Body__VariablesAssignment_3_1_in_rule__Body__Group_3__1__Impl5574);
            rule__Body__VariablesAssignment_3_1();

            state._fsp--;


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
    // $ANTLR end "rule__Body__Group_3__1__Impl"


    // $ANTLR start "rule__Body__Group_3__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2773:1: rule__Body__Group_3__2 : rule__Body__Group_3__2__Impl rule__Body__Group_3__3 ;
    public final void rule__Body__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2777:1: ( rule__Body__Group_3__2__Impl rule__Body__Group_3__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2778:2: rule__Body__Group_3__2__Impl rule__Body__Group_3__3
            {
            pushFollow(FOLLOW_rule__Body__Group_3__2__Impl_in_rule__Body__Group_3__25604);
            rule__Body__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__3_in_rule__Body__Group_3__25607);
            rule__Body__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3__2"


    // $ANTLR start "rule__Body__Group_3__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2785:1: rule__Body__Group_3__2__Impl : ( ( rule__Body__Group_3_2__0 )* ) ;
    public final void rule__Body__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2789:1: ( ( ( rule__Body__Group_3_2__0 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2790:1: ( ( rule__Body__Group_3_2__0 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2790:1: ( ( rule__Body__Group_3_2__0 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2791:1: ( rule__Body__Group_3_2__0 )*
            {
             before(grammarAccess.getBodyAccess().getGroup_3_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2792:1: ( rule__Body__Group_3_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==11) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2792:2: rule__Body__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Body__Group_3_2__0_in_rule__Body__Group_3__2__Impl5634);
            	    rule__Body__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "rule__Body__Group_3__2__Impl"


    // $ANTLR start "rule__Body__Group_3__3"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2802:1: rule__Body__Group_3__3 : rule__Body__Group_3__3__Impl ;
    public final void rule__Body__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2806:1: ( rule__Body__Group_3__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2807:2: rule__Body__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_3__3__Impl_in_rule__Body__Group_3__35665);
            rule__Body__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3__3"


    // $ANTLR start "rule__Body__Group_3__3__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2813:1: rule__Body__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Body__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2817:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2818:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2818:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2819:1: ')'
            {
             before(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3()); 
            match(input,15,FOLLOW_15_in_rule__Body__Group_3__3__Impl5693); 
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
    // $ANTLR end "rule__Body__Group_3__3__Impl"


    // $ANTLR start "rule__Body__Group_3_2__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2840:1: rule__Body__Group_3_2__0 : rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1 ;
    public final void rule__Body__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2844:1: ( rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2845:2: rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Body__Group_3_2__0__Impl_in_rule__Body__Group_3_2__05732);
            rule__Body__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3_2__1_in_rule__Body__Group_3_2__05735);
            rule__Body__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3_2__0"


    // $ANTLR start "rule__Body__Group_3_2__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2852:1: rule__Body__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Body__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2856:1: ( ( ',' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2857:1: ( ',' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2857:1: ( ',' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2858:1: ','
            {
             before(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0()); 
            match(input,11,FOLLOW_11_in_rule__Body__Group_3_2__0__Impl5763); 
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
    // $ANTLR end "rule__Body__Group_3_2__0__Impl"


    // $ANTLR start "rule__Body__Group_3_2__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2871:1: rule__Body__Group_3_2__1 : rule__Body__Group_3_2__1__Impl ;
    public final void rule__Body__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2875:1: ( rule__Body__Group_3_2__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2876:2: rule__Body__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_3_2__1__Impl_in_rule__Body__Group_3_2__15794);
            rule__Body__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3_2__1"


    // $ANTLR start "rule__Body__Group_3_2__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2882:1: rule__Body__Group_3_2__1__Impl : ( ( rule__Body__VariablesAssignment_3_2_1 ) ) ;
    public final void rule__Body__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2886:1: ( ( ( rule__Body__VariablesAssignment_3_2_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2887:1: ( ( rule__Body__VariablesAssignment_3_2_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2887:1: ( ( rule__Body__VariablesAssignment_3_2_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2888:1: ( rule__Body__VariablesAssignment_3_2_1 )
            {
             before(grammarAccess.getBodyAccess().getVariablesAssignment_3_2_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2889:1: ( rule__Body__VariablesAssignment_3_2_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2889:2: rule__Body__VariablesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Body__VariablesAssignment_3_2_1_in_rule__Body__Group_3_2__1__Impl5821);
            rule__Body__VariablesAssignment_3_2_1();

            state._fsp--;


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
    // $ANTLR end "rule__Body__Group_3_2__1__Impl"


    // $ANTLR start "rule__BodyClass__Group__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2903:1: rule__BodyClass__Group__0 : rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1 ;
    public final void rule__BodyClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2907:1: ( rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2908:2: rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__0__Impl_in_rule__BodyClass__Group__05855);
            rule__BodyClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyClass__Group__1_in_rule__BodyClass__Group__05858);
            rule__BodyClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyClass__Group__0"


    // $ANTLR start "rule__BodyClass__Group__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2915:1: rule__BodyClass__Group__0__Impl : ( ( rule__BodyClass__NameAssignment_0 ) ) ;
    public final void rule__BodyClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2919:1: ( ( ( rule__BodyClass__NameAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2920:1: ( ( rule__BodyClass__NameAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2920:1: ( ( rule__BodyClass__NameAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2921:1: ( rule__BodyClass__NameAssignment_0 )
            {
             before(grammarAccess.getBodyClassAccess().getNameAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2922:1: ( rule__BodyClass__NameAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2922:2: rule__BodyClass__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BodyClass__NameAssignment_0_in_rule__BodyClass__Group__0__Impl5885);
            rule__BodyClass__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBodyClassAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__BodyClass__Group__0__Impl"


    // $ANTLR start "rule__BodyClass__Group__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2932:1: rule__BodyClass__Group__1 : rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2 ;
    public final void rule__BodyClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2936:1: ( rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2937:2: rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__1__Impl_in_rule__BodyClass__Group__15915);
            rule__BodyClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyClass__Group__2_in_rule__BodyClass__Group__15918);
            rule__BodyClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyClass__Group__1"


    // $ANTLR start "rule__BodyClass__Group__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2944:1: rule__BodyClass__Group__1__Impl : ( '::' ) ;
    public final void rule__BodyClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2948:1: ( ( '::' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2949:1: ( '::' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2949:1: ( '::' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2950:1: '::'
            {
             before(grammarAccess.getBodyClassAccess().getColonColonKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__BodyClass__Group__1__Impl5946); 
             after(grammarAccess.getBodyClassAccess().getColonColonKeyword_1()); 

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
    // $ANTLR end "rule__BodyClass__Group__1__Impl"


    // $ANTLR start "rule__BodyClass__Group__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2963:1: rule__BodyClass__Group__2 : rule__BodyClass__Group__2__Impl ;
    public final void rule__BodyClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2967:1: ( rule__BodyClass__Group__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2968:2: rule__BodyClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__2__Impl_in_rule__BodyClass__Group__25977);
            rule__BodyClass__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyClass__Group__2"


    // $ANTLR start "rule__BodyClass__Group__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2974:1: rule__BodyClass__Group__2__Impl : ( ( rule__BodyClass__PromiseTypeAssignment_2 )* ) ;
    public final void rule__BodyClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2978:1: ( ( ( rule__BodyClass__PromiseTypeAssignment_2 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2979:1: ( ( rule__BodyClass__PromiseTypeAssignment_2 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2979:1: ( ( rule__BodyClass__PromiseTypeAssignment_2 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2980:1: ( rule__BodyClass__PromiseTypeAssignment_2 )*
            {
             before(grammarAccess.getBodyClassAccess().getPromiseTypeAssignment_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2981:1: ( rule__BodyClass__PromiseTypeAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==22) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2981:2: rule__BodyClass__PromiseTypeAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BodyClass__PromiseTypeAssignment_2_in_rule__BodyClass__Group__2__Impl6004);
            	    rule__BodyClass__PromiseTypeAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getBodyClassAccess().getPromiseTypeAssignment_2()); 

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
    // $ANTLR end "rule__BodyClass__Group__2__Impl"


    // $ANTLR start "rule__BodyFunction__Group__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2997:1: rule__BodyFunction__Group__0 : rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1 ;
    public final void rule__BodyFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3001:1: ( rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3002:2: rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__0__Impl_in_rule__BodyFunction__Group__06041);
            rule__BodyFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__1_in_rule__BodyFunction__Group__06044);
            rule__BodyFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group__0"


    // $ANTLR start "rule__BodyFunction__Group__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3009:1: rule__BodyFunction__Group__0__Impl : ( ( rule__BodyFunction__NameAssignment_0 ) ) ;
    public final void rule__BodyFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3013:1: ( ( ( rule__BodyFunction__NameAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3014:1: ( ( rule__BodyFunction__NameAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3014:1: ( ( rule__BodyFunction__NameAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3015:1: ( rule__BodyFunction__NameAssignment_0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getNameAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3016:1: ( rule__BodyFunction__NameAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3016:2: rule__BodyFunction__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BodyFunction__NameAssignment_0_in_rule__BodyFunction__Group__0__Impl6071);
            rule__BodyFunction__NameAssignment_0();

            state._fsp--;


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
    // $ANTLR end "rule__BodyFunction__Group__0__Impl"


    // $ANTLR start "rule__BodyFunction__Group__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3026:1: rule__BodyFunction__Group__1 : rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2 ;
    public final void rule__BodyFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3030:1: ( rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3031:2: rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__1__Impl_in_rule__BodyFunction__Group__16101);
            rule__BodyFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__2_in_rule__BodyFunction__Group__16104);
            rule__BodyFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group__1"


    // $ANTLR start "rule__BodyFunction__Group__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3038:1: rule__BodyFunction__Group__1__Impl : ( '=>' ) ;
    public final void rule__BodyFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3042:1: ( ( '=>' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3043:1: ( '=>' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3043:1: ( '=>' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3044:1: '=>'
            {
             before(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__BodyFunction__Group__1__Impl6132); 
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
    // $ANTLR end "rule__BodyFunction__Group__1__Impl"


    // $ANTLR start "rule__BodyFunction__Group__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3057:1: rule__BodyFunction__Group__2 : rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3 ;
    public final void rule__BodyFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3061:1: ( rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3062:2: rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__2__Impl_in_rule__BodyFunction__Group__26163);
            rule__BodyFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__3_in_rule__BodyFunction__Group__26166);
            rule__BodyFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group__2"


    // $ANTLR start "rule__BodyFunction__Group__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3069:1: rule__BodyFunction__Group__2__Impl : ( ( rule__BodyFunction__Alternatives_2 ) ) ;
    public final void rule__BodyFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3073:1: ( ( ( rule__BodyFunction__Alternatives_2 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3074:1: ( ( rule__BodyFunction__Alternatives_2 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3074:1: ( ( rule__BodyFunction__Alternatives_2 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3075:1: ( rule__BodyFunction__Alternatives_2 )
            {
             before(grammarAccess.getBodyFunctionAccess().getAlternatives_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3076:1: ( rule__BodyFunction__Alternatives_2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3076:2: rule__BodyFunction__Alternatives_2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Alternatives_2_in_rule__BodyFunction__Group__2__Impl6193);
            rule__BodyFunction__Alternatives_2();

            state._fsp--;


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
    // $ANTLR end "rule__BodyFunction__Group__2__Impl"


    // $ANTLR start "rule__BodyFunction__Group__3"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3086:1: rule__BodyFunction__Group__3 : rule__BodyFunction__Group__3__Impl ;
    public final void rule__BodyFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3090:1: ( rule__BodyFunction__Group__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3091:2: rule__BodyFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__3__Impl_in_rule__BodyFunction__Group__36223);
            rule__BodyFunction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group__3"


    // $ANTLR start "rule__BodyFunction__Group__3__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3097:1: rule__BodyFunction__Group__3__Impl : ( ';' ) ;
    public final void rule__BodyFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3101:1: ( ( ';' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3102:1: ( ';' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3102:1: ( ';' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3103:1: ';'
            {
             before(grammarAccess.getBodyFunctionAccess().getSemicolonKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__BodyFunction__Group__3__Impl6251); 
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
    // $ANTLR end "rule__BodyFunction__Group__3__Impl"


    // $ANTLR start "rule__BodyFunction__Group_2_1__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3124:1: rule__BodyFunction__Group_2_1__0 : rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1 ;
    public final void rule__BodyFunction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3128:1: ( rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3129:2: rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__0__Impl_in_rule__BodyFunction__Group_2_1__06290);
            rule__BodyFunction__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__1_in_rule__BodyFunction__Group_2_1__06293);
            rule__BodyFunction__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group_2_1__0"


    // $ANTLR start "rule__BodyFunction__Group_2_1__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3136:1: rule__BodyFunction__Group_2_1__0__Impl : ( ( rule__BodyFunction__ListAssignment_2_1_0 ) ) ;
    public final void rule__BodyFunction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3140:1: ( ( ( rule__BodyFunction__ListAssignment_2_1_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3141:1: ( ( rule__BodyFunction__ListAssignment_2_1_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3141:1: ( ( rule__BodyFunction__ListAssignment_2_1_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3142:1: ( rule__BodyFunction__ListAssignment_2_1_0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getListAssignment_2_1_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3143:1: ( rule__BodyFunction__ListAssignment_2_1_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3143:2: rule__BodyFunction__ListAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__BodyFunction__ListAssignment_2_1_0_in_rule__BodyFunction__Group_2_1__0__Impl6320);
            rule__BodyFunction__ListAssignment_2_1_0();

            state._fsp--;


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
    // $ANTLR end "rule__BodyFunction__Group_2_1__0__Impl"


    // $ANTLR start "rule__BodyFunction__Group_2_1__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3153:1: rule__BodyFunction__Group_2_1__1 : rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2 ;
    public final void rule__BodyFunction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3157:1: ( rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3158:2: rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__1__Impl_in_rule__BodyFunction__Group_2_1__16350);
            rule__BodyFunction__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__2_in_rule__BodyFunction__Group_2_1__16353);
            rule__BodyFunction__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group_2_1__1"


    // $ANTLR start "rule__BodyFunction__Group_2_1__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3165:1: rule__BodyFunction__Group_2_1__1__Impl : ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__BodyFunction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3169:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3170:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3170:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3171:1: ( rule__BodyFunction__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3172:1: ( rule__BodyFunction__ValuesAssignment_2_1_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3172:2: rule__BodyFunction__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_1_in_rule__BodyFunction__Group_2_1__1__Impl6380);
            rule__BodyFunction__ValuesAssignment_2_1_1();

            state._fsp--;


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
    // $ANTLR end "rule__BodyFunction__Group_2_1__1__Impl"


    // $ANTLR start "rule__BodyFunction__Group_2_1__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3182:1: rule__BodyFunction__Group_2_1__2 : rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3 ;
    public final void rule__BodyFunction__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3186:1: ( rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3187:2: rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__2__Impl_in_rule__BodyFunction__Group_2_1__26410);
            rule__BodyFunction__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__3_in_rule__BodyFunction__Group_2_1__26413);
            rule__BodyFunction__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group_2_1__2"


    // $ANTLR start "rule__BodyFunction__Group_2_1__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3194:1: rule__BodyFunction__Group_2_1__2__Impl : ( ( rule__BodyFunction__Group_2_1_2__0 )* ) ;
    public final void rule__BodyFunction__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3198:1: ( ( ( rule__BodyFunction__Group_2_1_2__0 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3199:1: ( ( rule__BodyFunction__Group_2_1_2__0 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3199:1: ( ( rule__BodyFunction__Group_2_1_2__0 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3200:1: ( rule__BodyFunction__Group_2_1_2__0 )*
            {
             before(grammarAccess.getBodyFunctionAccess().getGroup_2_1_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3201:1: ( rule__BodyFunction__Group_2_1_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==11) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3201:2: rule__BodyFunction__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__0_in_rule__BodyFunction__Group_2_1__2__Impl6440);
            	    rule__BodyFunction__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "rule__BodyFunction__Group_2_1__2__Impl"


    // $ANTLR start "rule__BodyFunction__Group_2_1__3"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3211:1: rule__BodyFunction__Group_2_1__3 : rule__BodyFunction__Group_2_1__3__Impl ;
    public final void rule__BodyFunction__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3215:1: ( rule__BodyFunction__Group_2_1__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3216:2: rule__BodyFunction__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__3__Impl_in_rule__BodyFunction__Group_2_1__36471);
            rule__BodyFunction__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group_2_1__3"


    // $ANTLR start "rule__BodyFunction__Group_2_1__3__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3222:1: rule__BodyFunction__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__BodyFunction__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3226:1: ( ( '}' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3227:1: ( '}' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3227:1: ( '}' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3228:1: '}'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,18,FOLLOW_18_in_rule__BodyFunction__Group_2_1__3__Impl6499); 
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
    // $ANTLR end "rule__BodyFunction__Group_2_1__3__Impl"


    // $ANTLR start "rule__BodyFunction__Group_2_1_2__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3249:1: rule__BodyFunction__Group_2_1_2__0 : rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1 ;
    public final void rule__BodyFunction__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3253:1: ( rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3254:2: rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__0__Impl_in_rule__BodyFunction__Group_2_1_2__06538);
            rule__BodyFunction__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__1_in_rule__BodyFunction__Group_2_1_2__06541);
            rule__BodyFunction__Group_2_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group_2_1_2__0"


    // $ANTLR start "rule__BodyFunction__Group_2_1_2__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3261:1: rule__BodyFunction__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__BodyFunction__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3265:1: ( ( ',' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3266:1: ( ',' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3266:1: ( ',' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3267:1: ','
            {
             before(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0()); 
            match(input,11,FOLLOW_11_in_rule__BodyFunction__Group_2_1_2__0__Impl6569); 
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
    // $ANTLR end "rule__BodyFunction__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__BodyFunction__Group_2_1_2__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3280:1: rule__BodyFunction__Group_2_1_2__1 : rule__BodyFunction__Group_2_1_2__1__Impl ;
    public final void rule__BodyFunction__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3284:1: ( rule__BodyFunction__Group_2_1_2__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3285:2: rule__BodyFunction__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__1__Impl_in_rule__BodyFunction__Group_2_1_2__16600);
            rule__BodyFunction__Group_2_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group_2_1_2__1"


    // $ANTLR start "rule__BodyFunction__Group_2_1_2__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3291:1: rule__BodyFunction__Group_2_1_2__1__Impl : ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) ) ;
    public final void rule__BodyFunction__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3295:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3296:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3296:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3297:1: ( rule__BodyFunction__ValuesAssignment_2_1_2_1 )
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_2_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3298:1: ( rule__BodyFunction__ValuesAssignment_2_1_2_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3298:2: rule__BodyFunction__ValuesAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_2_1_in_rule__BodyFunction__Group_2_1_2__1__Impl6627);
            rule__BodyFunction__ValuesAssignment_2_1_2_1();

            state._fsp--;


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
    // $ANTLR end "rule__BodyFunction__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__BodyFunction__Group_2_3__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3312:1: rule__BodyFunction__Group_2_3__0 : rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1 ;
    public final void rule__BodyFunction__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3316:1: ( rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3317:2: rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__0__Impl_in_rule__BodyFunction__Group_2_3__06661);
            rule__BodyFunction__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__1_in_rule__BodyFunction__Group_2_3__06664);
            rule__BodyFunction__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group_2_3__0"


    // $ANTLR start "rule__BodyFunction__Group_2_3__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3324:1: rule__BodyFunction__Group_2_3__0__Impl : ( '{' ) ;
    public final void rule__BodyFunction__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3328:1: ( ( '{' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3329:1: ( '{' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3329:1: ( '{' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3330:1: '{'
            {
             before(grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_3_0()); 
            match(input,17,FOLLOW_17_in_rule__BodyFunction__Group_2_3__0__Impl6692); 
             after(grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_3_0()); 

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
    // $ANTLR end "rule__BodyFunction__Group_2_3__0__Impl"


    // $ANTLR start "rule__BodyFunction__Group_2_3__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3343:1: rule__BodyFunction__Group_2_3__1 : rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2 ;
    public final void rule__BodyFunction__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3347:1: ( rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3348:2: rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__1__Impl_in_rule__BodyFunction__Group_2_3__16723);
            rule__BodyFunction__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__2_in_rule__BodyFunction__Group_2_3__16726);
            rule__BodyFunction__Group_2_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group_2_3__1"


    // $ANTLR start "rule__BodyFunction__Group_2_3__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3355:1: rule__BodyFunction__Group_2_3__1__Impl : ( '@' ) ;
    public final void rule__BodyFunction__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3359:1: ( ( '@' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3360:1: ( '@' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3360:1: ( '@' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3361:1: '@'
            {
             before(grammarAccess.getBodyFunctionAccess().getCommercialAtKeyword_2_3_1()); 
            match(input,23,FOLLOW_23_in_rule__BodyFunction__Group_2_3__1__Impl6754); 
             after(grammarAccess.getBodyFunctionAccess().getCommercialAtKeyword_2_3_1()); 

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
    // $ANTLR end "rule__BodyFunction__Group_2_3__1__Impl"


    // $ANTLR start "rule__BodyFunction__Group_2_3__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3374:1: rule__BodyFunction__Group_2_3__2 : rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3 ;
    public final void rule__BodyFunction__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3378:1: ( rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3379:2: rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__2__Impl_in_rule__BodyFunction__Group_2_3__26785);
            rule__BodyFunction__Group_2_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__3_in_rule__BodyFunction__Group_2_3__26788);
            rule__BodyFunction__Group_2_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group_2_3__2"


    // $ANTLR start "rule__BodyFunction__Group_2_3__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3386:1: rule__BodyFunction__Group_2_3__2__Impl : ( '(' ) ;
    public final void rule__BodyFunction__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3390:1: ( ( '(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3391:1: ( '(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3391:1: ( '(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3392:1: '('
            {
             before(grammarAccess.getBodyFunctionAccess().getLeftParenthesisKeyword_2_3_2()); 
            match(input,14,FOLLOW_14_in_rule__BodyFunction__Group_2_3__2__Impl6816); 
             after(grammarAccess.getBodyFunctionAccess().getLeftParenthesisKeyword_2_3_2()); 

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
    // $ANTLR end "rule__BodyFunction__Group_2_3__2__Impl"


    // $ANTLR start "rule__BodyFunction__Group_2_3__3"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3405:1: rule__BodyFunction__Group_2_3__3 : rule__BodyFunction__Group_2_3__3__Impl rule__BodyFunction__Group_2_3__4 ;
    public final void rule__BodyFunction__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3409:1: ( rule__BodyFunction__Group_2_3__3__Impl rule__BodyFunction__Group_2_3__4 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3410:2: rule__BodyFunction__Group_2_3__3__Impl rule__BodyFunction__Group_2_3__4
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__3__Impl_in_rule__BodyFunction__Group_2_3__36847);
            rule__BodyFunction__Group_2_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__4_in_rule__BodyFunction__Group_2_3__36850);
            rule__BodyFunction__Group_2_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group_2_3__3"


    // $ANTLR start "rule__BodyFunction__Group_2_3__3__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3417:1: rule__BodyFunction__Group_2_3__3__Impl : ( RULE_ID ) ;
    public final void rule__BodyFunction__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3421:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3422:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3422:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3423:1: RULE_ID
            {
             before(grammarAccess.getBodyFunctionAccess().getIDTerminalRuleCall_2_3_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyFunction__Group_2_3__3__Impl6877); 
             after(grammarAccess.getBodyFunctionAccess().getIDTerminalRuleCall_2_3_3()); 

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
    // $ANTLR end "rule__BodyFunction__Group_2_3__3__Impl"


    // $ANTLR start "rule__BodyFunction__Group_2_3__4"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3434:1: rule__BodyFunction__Group_2_3__4 : rule__BodyFunction__Group_2_3__4__Impl rule__BodyFunction__Group_2_3__5 ;
    public final void rule__BodyFunction__Group_2_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3438:1: ( rule__BodyFunction__Group_2_3__4__Impl rule__BodyFunction__Group_2_3__5 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3439:2: rule__BodyFunction__Group_2_3__4__Impl rule__BodyFunction__Group_2_3__5
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__4__Impl_in_rule__BodyFunction__Group_2_3__46906);
            rule__BodyFunction__Group_2_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__5_in_rule__BodyFunction__Group_2_3__46909);
            rule__BodyFunction__Group_2_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group_2_3__4"


    // $ANTLR start "rule__BodyFunction__Group_2_3__4__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3446:1: rule__BodyFunction__Group_2_3__4__Impl : ( ')' ) ;
    public final void rule__BodyFunction__Group_2_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3450:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3451:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3451:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3452:1: ')'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightParenthesisKeyword_2_3_4()); 
            match(input,15,FOLLOW_15_in_rule__BodyFunction__Group_2_3__4__Impl6937); 
             after(grammarAccess.getBodyFunctionAccess().getRightParenthesisKeyword_2_3_4()); 

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
    // $ANTLR end "rule__BodyFunction__Group_2_3__4__Impl"


    // $ANTLR start "rule__BodyFunction__Group_2_3__5"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3465:1: rule__BodyFunction__Group_2_3__5 : rule__BodyFunction__Group_2_3__5__Impl ;
    public final void rule__BodyFunction__Group_2_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3469:1: ( rule__BodyFunction__Group_2_3__5__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3470:2: rule__BodyFunction__Group_2_3__5__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__5__Impl_in_rule__BodyFunction__Group_2_3__56968);
            rule__BodyFunction__Group_2_3__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFunction__Group_2_3__5"


    // $ANTLR start "rule__BodyFunction__Group_2_3__5__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3476:1: rule__BodyFunction__Group_2_3__5__Impl : ( '}' ) ;
    public final void rule__BodyFunction__Group_2_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3480:1: ( ( '}' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3481:1: ( '}' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3481:1: ( '}' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3482:1: '}'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_3_5()); 
            match(input,18,FOLLOW_18_in_rule__BodyFunction__Group_2_3__5__Impl6996); 
             after(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_3_5()); 

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
    // $ANTLR end "rule__BodyFunction__Group_2_3__5__Impl"


    // $ANTLR start "rule__SimpleFunction__Group__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3507:1: rule__SimpleFunction__Group__0 : rule__SimpleFunction__Group__0__Impl rule__SimpleFunction__Group__1 ;
    public final void rule__SimpleFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3511:1: ( rule__SimpleFunction__Group__0__Impl rule__SimpleFunction__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3512:2: rule__SimpleFunction__Group__0__Impl rule__SimpleFunction__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__0__Impl_in_rule__SimpleFunction__Group__07039);
            rule__SimpleFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__1_in_rule__SimpleFunction__Group__07042);
            rule__SimpleFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFunction__Group__0"


    // $ANTLR start "rule__SimpleFunction__Group__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3519:1: rule__SimpleFunction__Group__0__Impl : ( ( rule__SimpleFunction__IdAssignment_0 ) ) ;
    public final void rule__SimpleFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3523:1: ( ( ( rule__SimpleFunction__IdAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3524:1: ( ( rule__SimpleFunction__IdAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3524:1: ( ( rule__SimpleFunction__IdAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3525:1: ( rule__SimpleFunction__IdAssignment_0 )
            {
             before(grammarAccess.getSimpleFunctionAccess().getIdAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3526:1: ( rule__SimpleFunction__IdAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3526:2: rule__SimpleFunction__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleFunction__IdAssignment_0_in_rule__SimpleFunction__Group__0__Impl7069);
            rule__SimpleFunction__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFunctionAccess().getIdAssignment_0()); 

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
    // $ANTLR end "rule__SimpleFunction__Group__0__Impl"


    // $ANTLR start "rule__SimpleFunction__Group__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3536:1: rule__SimpleFunction__Group__1 : rule__SimpleFunction__Group__1__Impl rule__SimpleFunction__Group__2 ;
    public final void rule__SimpleFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3540:1: ( rule__SimpleFunction__Group__1__Impl rule__SimpleFunction__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3541:2: rule__SimpleFunction__Group__1__Impl rule__SimpleFunction__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__1__Impl_in_rule__SimpleFunction__Group__17099);
            rule__SimpleFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__2_in_rule__SimpleFunction__Group__17102);
            rule__SimpleFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFunction__Group__1"


    // $ANTLR start "rule__SimpleFunction__Group__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3548:1: rule__SimpleFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__SimpleFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3552:1: ( ( '(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3553:1: ( '(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3553:1: ( '(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3554:1: '('
            {
             before(grammarAccess.getSimpleFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__SimpleFunction__Group__1__Impl7130); 
             after(grammarAccess.getSimpleFunctionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__SimpleFunction__Group__1__Impl"


    // $ANTLR start "rule__SimpleFunction__Group__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3567:1: rule__SimpleFunction__Group__2 : rule__SimpleFunction__Group__2__Impl rule__SimpleFunction__Group__3 ;
    public final void rule__SimpleFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3571:1: ( rule__SimpleFunction__Group__2__Impl rule__SimpleFunction__Group__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3572:2: rule__SimpleFunction__Group__2__Impl rule__SimpleFunction__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__2__Impl_in_rule__SimpleFunction__Group__27161);
            rule__SimpleFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__3_in_rule__SimpleFunction__Group__27164);
            rule__SimpleFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFunction__Group__2"


    // $ANTLR start "rule__SimpleFunction__Group__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3579:1: rule__SimpleFunction__Group__2__Impl : ( ( rule__SimpleFunction__ValuesAssignment_2 ) ) ;
    public final void rule__SimpleFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3583:1: ( ( ( rule__SimpleFunction__ValuesAssignment_2 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3584:1: ( ( rule__SimpleFunction__ValuesAssignment_2 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3584:1: ( ( rule__SimpleFunction__ValuesAssignment_2 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3585:1: ( rule__SimpleFunction__ValuesAssignment_2 )
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesAssignment_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3586:1: ( rule__SimpleFunction__ValuesAssignment_2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3586:2: rule__SimpleFunction__ValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleFunction__ValuesAssignment_2_in_rule__SimpleFunction__Group__2__Impl7191);
            rule__SimpleFunction__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFunctionAccess().getValuesAssignment_2()); 

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
    // $ANTLR end "rule__SimpleFunction__Group__2__Impl"


    // $ANTLR start "rule__SimpleFunction__Group__3"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3596:1: rule__SimpleFunction__Group__3 : rule__SimpleFunction__Group__3__Impl rule__SimpleFunction__Group__4 ;
    public final void rule__SimpleFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3600:1: ( rule__SimpleFunction__Group__3__Impl rule__SimpleFunction__Group__4 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3601:2: rule__SimpleFunction__Group__3__Impl rule__SimpleFunction__Group__4
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__3__Impl_in_rule__SimpleFunction__Group__37221);
            rule__SimpleFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__4_in_rule__SimpleFunction__Group__37224);
            rule__SimpleFunction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFunction__Group__3"


    // $ANTLR start "rule__SimpleFunction__Group__3__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3608:1: rule__SimpleFunction__Group__3__Impl : ( ( rule__SimpleFunction__Group_3__0 )* ) ;
    public final void rule__SimpleFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3612:1: ( ( ( rule__SimpleFunction__Group_3__0 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3613:1: ( ( rule__SimpleFunction__Group_3__0 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3613:1: ( ( rule__SimpleFunction__Group_3__0 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3614:1: ( rule__SimpleFunction__Group_3__0 )*
            {
             before(grammarAccess.getSimpleFunctionAccess().getGroup_3()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3615:1: ( rule__SimpleFunction__Group_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==11) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3615:2: rule__SimpleFunction__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__SimpleFunction__Group_3__0_in_rule__SimpleFunction__Group__3__Impl7251);
            	    rule__SimpleFunction__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getSimpleFunctionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__SimpleFunction__Group__3__Impl"


    // $ANTLR start "rule__SimpleFunction__Group__4"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3625:1: rule__SimpleFunction__Group__4 : rule__SimpleFunction__Group__4__Impl ;
    public final void rule__SimpleFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3629:1: ( rule__SimpleFunction__Group__4__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3630:2: rule__SimpleFunction__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__4__Impl_in_rule__SimpleFunction__Group__47282);
            rule__SimpleFunction__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFunction__Group__4"


    // $ANTLR start "rule__SimpleFunction__Group__4__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3636:1: rule__SimpleFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__SimpleFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3640:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3641:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3641:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3642:1: ')'
            {
             before(grammarAccess.getSimpleFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__SimpleFunction__Group__4__Impl7310); 
             after(grammarAccess.getSimpleFunctionAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__SimpleFunction__Group__4__Impl"


    // $ANTLR start "rule__SimpleFunction__Group_3__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3665:1: rule__SimpleFunction__Group_3__0 : rule__SimpleFunction__Group_3__0__Impl rule__SimpleFunction__Group_3__1 ;
    public final void rule__SimpleFunction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3669:1: ( rule__SimpleFunction__Group_3__0__Impl rule__SimpleFunction__Group_3__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3670:2: rule__SimpleFunction__Group_3__0__Impl rule__SimpleFunction__Group_3__1
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group_3__0__Impl_in_rule__SimpleFunction__Group_3__07351);
            rule__SimpleFunction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group_3__1_in_rule__SimpleFunction__Group_3__07354);
            rule__SimpleFunction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFunction__Group_3__0"


    // $ANTLR start "rule__SimpleFunction__Group_3__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3677:1: rule__SimpleFunction__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SimpleFunction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3681:1: ( ( ',' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3682:1: ( ',' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3682:1: ( ',' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3683:1: ','
            {
             before(grammarAccess.getSimpleFunctionAccess().getCommaKeyword_3_0()); 
            match(input,11,FOLLOW_11_in_rule__SimpleFunction__Group_3__0__Impl7382); 
             after(grammarAccess.getSimpleFunctionAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__SimpleFunction__Group_3__0__Impl"


    // $ANTLR start "rule__SimpleFunction__Group_3__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3696:1: rule__SimpleFunction__Group_3__1 : rule__SimpleFunction__Group_3__1__Impl ;
    public final void rule__SimpleFunction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3700:1: ( rule__SimpleFunction__Group_3__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3701:2: rule__SimpleFunction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group_3__1__Impl_in_rule__SimpleFunction__Group_3__17413);
            rule__SimpleFunction__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFunction__Group_3__1"


    // $ANTLR start "rule__SimpleFunction__Group_3__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3707:1: rule__SimpleFunction__Group_3__1__Impl : ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) ) ;
    public final void rule__SimpleFunction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3711:1: ( ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3712:1: ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3712:1: ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3713:1: ( rule__SimpleFunction__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesAssignment_3_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3714:1: ( rule__SimpleFunction__ValuesAssignment_3_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3714:2: rule__SimpleFunction__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SimpleFunction__ValuesAssignment_3_1_in_rule__SimpleFunction__Group_3__1__Impl7440);
            rule__SimpleFunction__ValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFunctionAccess().getValuesAssignment_3_1()); 

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
    // $ANTLR end "rule__SimpleFunction__Group_3__1__Impl"


    // $ANTLR start "rule__SpecialFunction__Group__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3728:1: rule__SpecialFunction__Group__0 : rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1 ;
    public final void rule__SpecialFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3732:1: ( rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3733:2: rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__0__Impl_in_rule__SpecialFunction__Group__07474);
            rule__SpecialFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__1_in_rule__SpecialFunction__Group__07477);
            rule__SpecialFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialFunction__Group__0"


    // $ANTLR start "rule__SpecialFunction__Group__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3740:1: rule__SpecialFunction__Group__0__Impl : ( ( rule__SpecialFunction__IdAssignment_0 ) ) ;
    public final void rule__SpecialFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3744:1: ( ( ( rule__SpecialFunction__IdAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3745:1: ( ( rule__SpecialFunction__IdAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3745:1: ( ( rule__SpecialFunction__IdAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3746:1: ( rule__SpecialFunction__IdAssignment_0 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getIdAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3747:1: ( rule__SpecialFunction__IdAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3747:2: rule__SpecialFunction__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__SpecialFunction__IdAssignment_0_in_rule__SpecialFunction__Group__0__Impl7504);
            rule__SpecialFunction__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSpecialFunctionAccess().getIdAssignment_0()); 

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
    // $ANTLR end "rule__SpecialFunction__Group__0__Impl"


    // $ANTLR start "rule__SpecialFunction__Group__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3757:1: rule__SpecialFunction__Group__1 : rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2 ;
    public final void rule__SpecialFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3761:1: ( rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3762:2: rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__1__Impl_in_rule__SpecialFunction__Group__17534);
            rule__SpecialFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__2_in_rule__SpecialFunction__Group__17537);
            rule__SpecialFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialFunction__Group__1"


    // $ANTLR start "rule__SpecialFunction__Group__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3769:1: rule__SpecialFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__SpecialFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3773:1: ( ( '(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3774:1: ( '(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3774:1: ( '(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3775:1: '('
            {
             before(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__SpecialFunction__Group__1__Impl7565); 
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
    // $ANTLR end "rule__SpecialFunction__Group__1__Impl"


    // $ANTLR start "rule__SpecialFunction__Group__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3788:1: rule__SpecialFunction__Group__2 : rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3 ;
    public final void rule__SpecialFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3792:1: ( rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3793:2: rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__2__Impl_in_rule__SpecialFunction__Group__27596);
            rule__SpecialFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__3_in_rule__SpecialFunction__Group__27599);
            rule__SpecialFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialFunction__Group__2"


    // $ANTLR start "rule__SpecialFunction__Group__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3800:1: rule__SpecialFunction__Group__2__Impl : ( ( rule__SpecialFunction__Alternatives_2 )* ) ;
    public final void rule__SpecialFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3804:1: ( ( ( rule__SpecialFunction__Alternatives_2 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3805:1: ( ( rule__SpecialFunction__Alternatives_2 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3805:1: ( ( rule__SpecialFunction__Alternatives_2 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3806:1: ( rule__SpecialFunction__Alternatives_2 )*
            {
             before(grammarAccess.getSpecialFunctionAccess().getAlternatives_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3807:1: ( rule__SpecialFunction__Alternatives_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_ANY_OTHER && LA28_0<=RULE_STRING)||LA28_0==11||(LA28_0>=25 && LA28_0<=26)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3807:2: rule__SpecialFunction__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__SpecialFunction__Alternatives_2_in_rule__SpecialFunction__Group__2__Impl7626);
            	    rule__SpecialFunction__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSpecialFunctionAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__SpecialFunction__Group__2__Impl"


    // $ANTLR start "rule__SpecialFunction__Group__3"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3817:1: rule__SpecialFunction__Group__3 : rule__SpecialFunction__Group__3__Impl ;
    public final void rule__SpecialFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3821:1: ( rule__SpecialFunction__Group__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3822:2: rule__SpecialFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__3__Impl_in_rule__SpecialFunction__Group__37657);
            rule__SpecialFunction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialFunction__Group__3"


    // $ANTLR start "rule__SpecialFunction__Group__3__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3828:1: rule__SpecialFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__SpecialFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3832:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3833:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3833:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3834:1: ')'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__SpecialFunction__Group__3__Impl7685); 
             after(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__SpecialFunction__Group__3__Impl"


    // $ANTLR start "rule__SpecialFunction__Group_2_4__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3855:1: rule__SpecialFunction__Group_2_4__0 : rule__SpecialFunction__Group_2_4__0__Impl rule__SpecialFunction__Group_2_4__1 ;
    public final void rule__SpecialFunction__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3859:1: ( rule__SpecialFunction__Group_2_4__0__Impl rule__SpecialFunction__Group_2_4__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3860:2: rule__SpecialFunction__Group_2_4__0__Impl rule__SpecialFunction__Group_2_4__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_4__0__Impl_in_rule__SpecialFunction__Group_2_4__07724);
            rule__SpecialFunction__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_4__1_in_rule__SpecialFunction__Group_2_4__07727);
            rule__SpecialFunction__Group_2_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialFunction__Group_2_4__0"


    // $ANTLR start "rule__SpecialFunction__Group_2_4__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3867:1: rule__SpecialFunction__Group_2_4__0__Impl : ( '$(' ) ;
    public final void rule__SpecialFunction__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3871:1: ( ( '$(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3872:1: ( '$(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3872:1: ( '$(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3873:1: '$('
            {
             before(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_2_4_0()); 
            match(input,25,FOLLOW_25_in_rule__SpecialFunction__Group_2_4__0__Impl7755); 
             after(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_2_4_0()); 

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
    // $ANTLR end "rule__SpecialFunction__Group_2_4__0__Impl"


    // $ANTLR start "rule__SpecialFunction__Group_2_4__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3886:1: rule__SpecialFunction__Group_2_4__1 : rule__SpecialFunction__Group_2_4__1__Impl rule__SpecialFunction__Group_2_4__2 ;
    public final void rule__SpecialFunction__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3890:1: ( rule__SpecialFunction__Group_2_4__1__Impl rule__SpecialFunction__Group_2_4__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3891:2: rule__SpecialFunction__Group_2_4__1__Impl rule__SpecialFunction__Group_2_4__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_4__1__Impl_in_rule__SpecialFunction__Group_2_4__17786);
            rule__SpecialFunction__Group_2_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_4__2_in_rule__SpecialFunction__Group_2_4__17789);
            rule__SpecialFunction__Group_2_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialFunction__Group_2_4__1"


    // $ANTLR start "rule__SpecialFunction__Group_2_4__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3898:1: rule__SpecialFunction__Group_2_4__1__Impl : ( RULE_ID ) ;
    public final void rule__SpecialFunction__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3902:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3903:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3903:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3904:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_4_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_4__1__Impl7816); 
             after(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_4_1()); 

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
    // $ANTLR end "rule__SpecialFunction__Group_2_4__1__Impl"


    // $ANTLR start "rule__SpecialFunction__Group_2_4__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3915:1: rule__SpecialFunction__Group_2_4__2 : rule__SpecialFunction__Group_2_4__2__Impl ;
    public final void rule__SpecialFunction__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3919:1: ( rule__SpecialFunction__Group_2_4__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3920:2: rule__SpecialFunction__Group_2_4__2__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_4__2__Impl_in_rule__SpecialFunction__Group_2_4__27845);
            rule__SpecialFunction__Group_2_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialFunction__Group_2_4__2"


    // $ANTLR start "rule__SpecialFunction__Group_2_4__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3926:1: rule__SpecialFunction__Group_2_4__2__Impl : ( ')' ) ;
    public final void rule__SpecialFunction__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3930:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3931:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3931:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3932:1: ')'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_2_4_2()); 
            match(input,15,FOLLOW_15_in_rule__SpecialFunction__Group_2_4__2__Impl7873); 
             after(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_2_4_2()); 

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
    // $ANTLR end "rule__SpecialFunction__Group_2_4__2__Impl"


    // $ANTLR start "rule__SpecialFunction__Group_2_5__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3951:1: rule__SpecialFunction__Group_2_5__0 : rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1 ;
    public final void rule__SpecialFunction__Group_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3955:1: ( rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3956:2: rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__0__Impl_in_rule__SpecialFunction__Group_2_5__07910);
            rule__SpecialFunction__Group_2_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__1_in_rule__SpecialFunction__Group_2_5__07913);
            rule__SpecialFunction__Group_2_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialFunction__Group_2_5__0"


    // $ANTLR start "rule__SpecialFunction__Group_2_5__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3963:1: rule__SpecialFunction__Group_2_5__0__Impl : ( '${' ) ;
    public final void rule__SpecialFunction__Group_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3967:1: ( ( '${' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3968:1: ( '${' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3968:1: ( '${' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3969:1: '${'
            {
             before(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_2_5_0()); 
            match(input,26,FOLLOW_26_in_rule__SpecialFunction__Group_2_5__0__Impl7941); 
             after(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_2_5_0()); 

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
    // $ANTLR end "rule__SpecialFunction__Group_2_5__0__Impl"


    // $ANTLR start "rule__SpecialFunction__Group_2_5__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3982:1: rule__SpecialFunction__Group_2_5__1 : rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2 ;
    public final void rule__SpecialFunction__Group_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3986:1: ( rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3987:2: rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__1__Impl_in_rule__SpecialFunction__Group_2_5__17972);
            rule__SpecialFunction__Group_2_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__2_in_rule__SpecialFunction__Group_2_5__17975);
            rule__SpecialFunction__Group_2_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialFunction__Group_2_5__1"


    // $ANTLR start "rule__SpecialFunction__Group_2_5__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3994:1: rule__SpecialFunction__Group_2_5__1__Impl : ( RULE_ID ) ;
    public final void rule__SpecialFunction__Group_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3998:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3999:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3999:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4000:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_5_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_5__1__Impl8002); 
             after(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_5_1()); 

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
    // $ANTLR end "rule__SpecialFunction__Group_2_5__1__Impl"


    // $ANTLR start "rule__SpecialFunction__Group_2_5__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4011:1: rule__SpecialFunction__Group_2_5__2 : rule__SpecialFunction__Group_2_5__2__Impl ;
    public final void rule__SpecialFunction__Group_2_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4015:1: ( rule__SpecialFunction__Group_2_5__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4016:2: rule__SpecialFunction__Group_2_5__2__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__2__Impl_in_rule__SpecialFunction__Group_2_5__28031);
            rule__SpecialFunction__Group_2_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialFunction__Group_2_5__2"


    // $ANTLR start "rule__SpecialFunction__Group_2_5__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4022:1: rule__SpecialFunction__Group_2_5__2__Impl : ( '}' ) ;
    public final void rule__SpecialFunction__Group_2_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4026:1: ( ( '}' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4027:1: ( '}' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4027:1: ( '}' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4028:1: '}'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_2_5_2()); 
            match(input,18,FOLLOW_18_in_rule__SpecialFunction__Group_2_5__2__Impl8059); 
             after(grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_2_5_2()); 

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
    // $ANTLR end "rule__SpecialFunction__Group_2_5__2__Impl"


    // $ANTLR start "rule__CfModel__ElementsAssignment"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4048:1: rule__CfModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__CfModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4052:1: ( ( ruleAbstractElement ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4053:1: ( ruleAbstractElement )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4053:1: ( ruleAbstractElement )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4054:1: ruleAbstractElement
            {
             before(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment8101);
            ruleAbstractElement();

            state._fsp--;

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
    // $ANTLR end "rule__CfModel__ElementsAssignment"


    // $ANTLR start "rule__Bundle__ComponentAssignment_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4063:1: rule__Bundle__ComponentAssignment_1 : ( ruleBundleComponent ) ;
    public final void rule__Bundle__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4067:1: ( ( ruleBundleComponent ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4068:1: ( ruleBundleComponent )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4068:1: ( ruleBundleComponent )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4069:1: ruleBundleComponent
            {
             before(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBundleComponent_in_rule__Bundle__ComponentAssignment_18132);
            ruleBundleComponent();

            state._fsp--;

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
    // $ANTLR end "rule__Bundle__ComponentAssignment_1"


    // $ANTLR start "rule__Bundle__NameAssignment_2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4078:1: rule__Bundle__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Bundle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4082:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4083:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4083:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4084:1: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_28163); 
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
    // $ANTLR end "rule__Bundle__NameAssignment_2"


    // $ANTLR start "rule__Bundle__VariablesAssignment_3_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4093:1: rule__Bundle__VariablesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Bundle__VariablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4097:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4098:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4098:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4099:1: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getVariablesIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bundle__VariablesAssignment_3_18194); 
             after(grammarAccess.getBundleAccess().getVariablesIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Bundle__VariablesAssignment_3_1"


    // $ANTLR start "rule__Bundle__VariablesAssignment_3_2_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4108:1: rule__Bundle__VariablesAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__Bundle__VariablesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4112:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4113:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4113:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4114:1: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getVariablesIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bundle__VariablesAssignment_3_2_18225); 
             after(grammarAccess.getBundleAccess().getVariablesIDTerminalRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__Bundle__VariablesAssignment_3_2_1"


    // $ANTLR start "rule__Bundle__PromiseTypeAssignment_5"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4123:1: rule__Bundle__PromiseTypeAssignment_5 : ( ruleBundlePromiseType ) ;
    public final void rule__Bundle__PromiseTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4127:1: ( ( ruleBundlePromiseType ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4128:1: ( ruleBundlePromiseType )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4128:1: ( ruleBundlePromiseType )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4129:1: ruleBundlePromiseType
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_rule__Bundle__PromiseTypeAssignment_58256);
            ruleBundlePromiseType();

            state._fsp--;

             after(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Bundle__PromiseTypeAssignment_5"


    // $ANTLR start "rule__BundlePromiseType__NameAssignment_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4138:1: rule__BundlePromiseType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BundlePromiseType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4142:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4143:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4143:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4144:1: RULE_ID
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BundlePromiseType__NameAssignment_08287); 
             after(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__BundlePromiseType__NameAssignment_0"


    // $ANTLR start "rule__BundlePromiseType__PromisesAssignment_2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4153:1: rule__BundlePromiseType__PromisesAssignment_2 : ( ruleBundlePromise ) ;
    public final void rule__BundlePromiseType__PromisesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4157:1: ( ( ruleBundlePromise ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4158:1: ( ruleBundlePromise )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4158:1: ( ruleBundlePromise )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4159:1: ruleBundlePromise
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getPromisesBundlePromiseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBundlePromise_in_rule__BundlePromiseType__PromisesAssignment_28318);
            ruleBundlePromise();

            state._fsp--;

             after(grammarAccess.getBundlePromiseTypeAccess().getPromisesBundlePromiseParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BundlePromiseType__PromisesAssignment_2"


    // $ANTLR start "rule__BundlePromiseType__ClassesAssignment_3"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4168:1: rule__BundlePromiseType__ClassesAssignment_3 : ( ruleBundleClass ) ;
    public final void rule__BundlePromiseType__ClassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4172:1: ( ( ruleBundleClass ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4173:1: ( ruleBundleClass )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4173:1: ( ruleBundleClass )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4174:1: ruleBundleClass
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getClassesBundleClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBundleClass_in_rule__BundlePromiseType__ClassesAssignment_38349);
            ruleBundleClass();

            state._fsp--;

             after(grammarAccess.getBundlePromiseTypeAccess().getClassesBundleClassParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__BundlePromiseType__ClassesAssignment_3"


    // $ANTLR start "rule__BundleClass__NameAssignment_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4183:1: rule__BundleClass__NameAssignment_0 : ( ruleCLASS_ID ) ;
    public final void rule__BundleClass__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4187:1: ( ( ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4188:1: ( ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4188:1: ( ruleCLASS_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4189:1: ruleCLASS_ID
            {
             before(grammarAccess.getBundleClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__BundleClass__NameAssignment_08380);
            ruleCLASS_ID();

            state._fsp--;

             after(grammarAccess.getBundleClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__BundleClass__NameAssignment_0"


    // $ANTLR start "rule__BundleClass__PromisesAssignment_2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4198:1: rule__BundleClass__PromisesAssignment_2 : ( ruleBundlePromise ) ;
    public final void rule__BundleClass__PromisesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4202:1: ( ( ruleBundlePromise ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4203:1: ( ruleBundlePromise )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4203:1: ( ruleBundlePromise )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4204:1: ruleBundlePromise
            {
             before(grammarAccess.getBundleClassAccess().getPromisesBundlePromiseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBundlePromise_in_rule__BundleClass__PromisesAssignment_28411);
            ruleBundlePromise();

            state._fsp--;

             after(grammarAccess.getBundleClassAccess().getPromisesBundlePromiseParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BundleClass__PromisesAssignment_2"


    // $ANTLR start "rule__BundlePromise__NameAssignment_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4213:1: rule__BundlePromise__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BundlePromise__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4217:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4218:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4218:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4219:1: RULE_STRING
            {
             before(grammarAccess.getBundlePromiseAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BundlePromise__NameAssignment_08442); 
             after(grammarAccess.getBundlePromiseAccess().getNameSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__BundlePromise__NameAssignment_0"


    // $ANTLR start "rule__BundlePromise__ValuesAssignment_1_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4228:1: rule__BundlePromise__ValuesAssignment_1_0 : ( rulePromiseValue ) ;
    public final void rule__BundlePromise__ValuesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4232:1: ( ( rulePromiseValue ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4233:1: ( rulePromiseValue )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4233:1: ( rulePromiseValue )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4234:1: rulePromiseValue
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_08473);
            rulePromiseValue();

            state._fsp--;

             after(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__BundlePromise__ValuesAssignment_1_0"


    // $ANTLR start "rule__BundlePromise__ValuesAssignment_1_1_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4243:1: rule__BundlePromise__ValuesAssignment_1_1_1 : ( rulePromiseValue ) ;
    public final void rule__BundlePromise__ValuesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4247:1: ( ( rulePromiseValue ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4248:1: ( rulePromiseValue )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4248:1: ( rulePromiseValue )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4249:1: rulePromiseValue
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_1_18504);
            rulePromiseValue();

            state._fsp--;

             after(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__BundlePromise__ValuesAssignment_1_1_1"


    // $ANTLR start "rule__PromiseValue__KeywordAssignment_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4258:1: rule__PromiseValue__KeywordAssignment_0 : ( RULE_ID ) ;
    public final void rule__PromiseValue__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4262:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4263:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4263:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4264:1: RULE_ID
            {
             before(grammarAccess.getPromiseValueAccess().getKeywordIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PromiseValue__KeywordAssignment_08535); 
             after(grammarAccess.getPromiseValueAccess().getKeywordIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__PromiseValue__KeywordAssignment_0"


    // $ANTLR start "rule__PromiseValue__ValuesAssignment_2_0_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4273:1: rule__PromiseValue__ValuesAssignment_2_0_0 : ( RULE_STRING ) ;
    public final void rule__PromiseValue__ValuesAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4277:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4278:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4278:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4279:1: RULE_STRING
            {
             before(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_0_08566); 
             after(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_0_0_0()); 

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
    // $ANTLR end "rule__PromiseValue__ValuesAssignment_2_0_0"


    // $ANTLR start "rule__PromiseValue__FunctionsAssignment_2_0_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4288:1: rule__PromiseValue__FunctionsAssignment_2_0_1 : ( ruleSimpleFunction ) ;
    public final void rule__PromiseValue__FunctionsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4292:1: ( ( ruleSimpleFunction ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4293:1: ( ruleSimpleFunction )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4293:1: ( ruleSimpleFunction )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4294:1: ruleSimpleFunction
            {
             before(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_0_18597);
            ruleSimpleFunction();

            state._fsp--;

             after(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_0_1_0()); 

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
    // $ANTLR end "rule__PromiseValue__FunctionsAssignment_2_0_1"


    // $ANTLR start "rule__PromiseValue__ValuesAssignment_2_0_2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4303:1: rule__PromiseValue__ValuesAssignment_2_0_2 : ( RULE_ID ) ;
    public final void rule__PromiseValue__ValuesAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4307:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4308:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4308:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4309:1: RULE_ID
            {
             before(grammarAccess.getPromiseValueAccess().getValuesIDTerminalRuleCall_2_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PromiseValue__ValuesAssignment_2_0_28628); 
             after(grammarAccess.getPromiseValueAccess().getValuesIDTerminalRuleCall_2_0_2_0()); 

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
    // $ANTLR end "rule__PromiseValue__ValuesAssignment_2_0_2"


    // $ANTLR start "rule__PromiseValue__ValuesAssignment_2_1_1_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4318:1: rule__PromiseValue__ValuesAssignment_2_1_1_0 : ( RULE_STRING ) ;
    public final void rule__PromiseValue__ValuesAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4322:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4323:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4323:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4324:1: RULE_STRING
            {
             before(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_1_08659); 
             after(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0_0()); 

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
    // $ANTLR end "rule__PromiseValue__ValuesAssignment_2_1_1_0"


    // $ANTLR start "rule__PromiseValue__FunctionsAssignment_2_1_1_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4333:1: rule__PromiseValue__FunctionsAssignment_2_1_1_1 : ( ruleSimpleFunction ) ;
    public final void rule__PromiseValue__FunctionsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4337:1: ( ( ruleSimpleFunction ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4338:1: ( ruleSimpleFunction )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4338:1: ( ruleSimpleFunction )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4339:1: ruleSimpleFunction
            {
             before(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_1_18690);
            ruleSimpleFunction();

            state._fsp--;

             after(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_1_1_0()); 

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
    // $ANTLR end "rule__PromiseValue__FunctionsAssignment_2_1_1_1"


    // $ANTLR start "rule__PromiseValue__ValuesAssignment_2_1_2_1_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4348:1: rule__PromiseValue__ValuesAssignment_2_1_2_1_0 : ( RULE_STRING ) ;
    public final void rule__PromiseValue__ValuesAssignment_2_1_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4352:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4353:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4353:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4354:1: RULE_STRING
            {
             before(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_2_1_08721); 
             after(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0_0()); 

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
    // $ANTLR end "rule__PromiseValue__ValuesAssignment_2_1_2_1_0"


    // $ANTLR start "rule__PromiseValue__FunctionsAssignment_2_1_2_1_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4363:1: rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 : ( ruleSimpleFunction ) ;
    public final void rule__PromiseValue__FunctionsAssignment_2_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4367:1: ( ( ruleSimpleFunction ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4368:1: ( ruleSimpleFunction )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4368:1: ( ruleSimpleFunction )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4369:1: ruleSimpleFunction
            {
             before(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_2_1_1_0()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_2_1_18752);
            ruleSimpleFunction();

            state._fsp--;

             after(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_2_1_1_0()); 

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
    // $ANTLR end "rule__PromiseValue__FunctionsAssignment_2_1_2_1_1"


    // $ANTLR start "rule__Body__ComponentAssignment_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4378:1: rule__Body__ComponentAssignment_1 : ( ruleBodyComponent ) ;
    public final void rule__Body__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4382:1: ( ( ruleBodyComponent ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4383:1: ( ruleBodyComponent )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4383:1: ( ruleBodyComponent )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4384:1: ruleBodyComponent
            {
             before(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_rule__Body__ComponentAssignment_18783);
            ruleBodyComponent();

            state._fsp--;

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
    // $ANTLR end "rule__Body__ComponentAssignment_1"


    // $ANTLR start "rule__Body__NameAssignment_2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4393:1: rule__Body__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Body__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4397:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4398:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4398:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4399:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__NameAssignment_28814); 
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
    // $ANTLR end "rule__Body__NameAssignment_2"


    // $ANTLR start "rule__Body__VariablesAssignment_3_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4408:1: rule__Body__VariablesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Body__VariablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4412:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4413:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4413:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4414:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_18845); 
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
    // $ANTLR end "rule__Body__VariablesAssignment_3_1"


    // $ANTLR start "rule__Body__VariablesAssignment_3_2_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4423:1: rule__Body__VariablesAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__Body__VariablesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4427:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4428:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4428:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4429:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_2_18876); 
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
    // $ANTLR end "rule__Body__VariablesAssignment_3_2_1"


    // $ANTLR start "rule__Body__PromiseTypeAssignment_5"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4438:1: rule__Body__PromiseTypeAssignment_5 : ( ruleBodyFunction ) ;
    public final void rule__Body__PromiseTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4442:1: ( ( ruleBodyFunction ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4443:1: ( ruleBodyFunction )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4443:1: ( ruleBodyFunction )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4444:1: ruleBodyFunction
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_rule__Body__PromiseTypeAssignment_58907);
            ruleBodyFunction();

            state._fsp--;

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
    // $ANTLR end "rule__Body__PromiseTypeAssignment_5"


    // $ANTLR start "rule__Body__ClassesAssignment_6"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4453:1: rule__Body__ClassesAssignment_6 : ( ruleBodyClass ) ;
    public final void rule__Body__ClassesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4457:1: ( ( ruleBodyClass ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4458:1: ( ruleBodyClass )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4458:1: ( ruleBodyClass )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4459:1: ruleBodyClass
            {
             before(grammarAccess.getBodyAccess().getClassesBodyClassParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleBodyClass_in_rule__Body__ClassesAssignment_68938);
            ruleBodyClass();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getClassesBodyClassParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Body__ClassesAssignment_6"


    // $ANTLR start "rule__BodyClass__NameAssignment_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4468:1: rule__BodyClass__NameAssignment_0 : ( ruleCLASS_ID ) ;
    public final void rule__BodyClass__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4472:1: ( ( ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4473:1: ( ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4473:1: ( ruleCLASS_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4474:1: ruleCLASS_ID
            {
             before(grammarAccess.getBodyClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__BodyClass__NameAssignment_08969);
            ruleCLASS_ID();

            state._fsp--;

             after(grammarAccess.getBodyClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__BodyClass__NameAssignment_0"


    // $ANTLR start "rule__BodyClass__PromiseTypeAssignment_2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4483:1: rule__BodyClass__PromiseTypeAssignment_2 : ( ruleBodyFunction ) ;
    public final void rule__BodyClass__PromiseTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4487:1: ( ( ruleBodyFunction ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4488:1: ( ruleBodyFunction )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4488:1: ( ruleBodyFunction )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4489:1: ruleBodyFunction
            {
             before(grammarAccess.getBodyClassAccess().getPromiseTypeBodyFunctionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_rule__BodyClass__PromiseTypeAssignment_29000);
            ruleBodyFunction();

            state._fsp--;

             after(grammarAccess.getBodyClassAccess().getPromiseTypeBodyFunctionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BodyClass__PromiseTypeAssignment_2"


    // $ANTLR start "rule__BodyFunction__NameAssignment_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4498:1: rule__BodyFunction__NameAssignment_0 : ( ruleBodyPromiseType ) ;
    public final void rule__BodyFunction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4502:1: ( ( ruleBodyPromiseType ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4503:1: ( ruleBodyPromiseType )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4503:1: ( ruleBodyPromiseType )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4504:1: ruleBodyPromiseType
            {
             before(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_rule__BodyFunction__NameAssignment_09031);
            ruleBodyPromiseType();

            state._fsp--;

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
    // $ANTLR end "rule__BodyFunction__NameAssignment_0"


    // $ANTLR start "rule__BodyFunction__ValuesAssignment_2_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4513:1: rule__BodyFunction__ValuesAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4517:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4518:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4518:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4519:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_09062); 
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
    // $ANTLR end "rule__BodyFunction__ValuesAssignment_2_0"


    // $ANTLR start "rule__BodyFunction__ListAssignment_2_1_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4528:1: rule__BodyFunction__ListAssignment_2_1_0 : ( ( '{' ) ) ;
    public final void rule__BodyFunction__ListAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4532:1: ( ( ( '{' ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4533:1: ( ( '{' ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4533:1: ( ( '{' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4534:1: ( '{' )
            {
             before(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4535:1: ( '{' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4536:1: '{'
            {
             before(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); 
            match(input,17,FOLLOW_17_in_rule__BodyFunction__ListAssignment_2_1_09098); 
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
    // $ANTLR end "rule__BodyFunction__ListAssignment_2_1_0"


    // $ANTLR start "rule__BodyFunction__ValuesAssignment_2_1_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4551:1: rule__BodyFunction__ValuesAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4555:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4556:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4556:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4557:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_19137); 
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
    // $ANTLR end "rule__BodyFunction__ValuesAssignment_2_1_1"


    // $ANTLR start "rule__BodyFunction__ValuesAssignment_2_1_2_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4566:1: rule__BodyFunction__ValuesAssignment_2_1_2_1 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4570:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4571:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4571:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4572:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_2_19168); 
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
    // $ANTLR end "rule__BodyFunction__ValuesAssignment_2_1_2_1"


    // $ANTLR start "rule__BodyFunction__FunctionAssignment_2_2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4581:1: rule__BodyFunction__FunctionAssignment_2_2 : ( ruleSpecialFunction ) ;
    public final void rule__BodyFunction__FunctionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4585:1: ( ( ruleSpecialFunction ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4586:1: ( ruleSpecialFunction )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4586:1: ( ruleSpecialFunction )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4587:1: ruleSpecialFunction
            {
             before(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_rule__BodyFunction__FunctionAssignment_2_29199);
            ruleSpecialFunction();

            state._fsp--;

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
    // $ANTLR end "rule__BodyFunction__FunctionAssignment_2_2"


    // $ANTLR start "rule__SimpleFunction__IdAssignment_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4596:1: rule__SimpleFunction__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleFunction__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4600:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4601:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4601:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4602:1: RULE_ID
            {
             before(grammarAccess.getSimpleFunctionAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleFunction__IdAssignment_09230); 
             after(grammarAccess.getSimpleFunctionAccess().getIdIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__SimpleFunction__IdAssignment_0"


    // $ANTLR start "rule__SimpleFunction__ValuesAssignment_2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4611:1: rule__SimpleFunction__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SimpleFunction__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4615:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4616:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4616:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4617:1: RULE_STRING
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_29261); 
             after(grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SimpleFunction__ValuesAssignment_2"


    // $ANTLR start "rule__SimpleFunction__ValuesAssignment_3_1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4626:1: rule__SimpleFunction__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SimpleFunction__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4630:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4631:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4631:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4632:1: RULE_STRING
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_3_19292); 
             after(grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__SimpleFunction__ValuesAssignment_3_1"


    // $ANTLR start "rule__SpecialFunction__IdAssignment_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4641:1: rule__SpecialFunction__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__SpecialFunction__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4645:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4646:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4646:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4647:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__IdAssignment_09323); 
             after(grammarAccess.getSpecialFunctionAccess().getIdIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__SpecialFunction__IdAssignment_0"


    // $ANTLR start "rule__SpecialFunction__FuncAssignment_2_6"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4656:1: rule__SpecialFunction__FuncAssignment_2_6 : ( ruleSpecialFunction ) ;
    public final void rule__SpecialFunction__FuncAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4660:1: ( ( ruleSpecialFunction ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4661:1: ( ruleSpecialFunction )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4661:1: ( ruleSpecialFunction )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4662:1: ruleSpecialFunction
            {
             before(grammarAccess.getSpecialFunctionAccess().getFuncSpecialFunctionParserRuleCall_2_6_0()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_rule__SpecialFunction__FuncAssignment_2_69354);
            ruleSpecialFunction();

            state._fsp--;

             after(grammarAccess.getSpecialFunctionAccess().getFuncSpecialFunctionParserRuleCall_2_6_0()); 

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
    // $ANTLR end "rule__SpecialFunction__FuncAssignment_2_6"


    // $ANTLR start "rule__BodyPromiseType__NameAssignment"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4671:1: rule__BodyPromiseType__NameAssignment : ( RULE_ID ) ;
    public final void rule__BodyPromiseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4675:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4676:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4676:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4677:1: RULE_ID
            {
             before(grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyPromiseType__NameAssignment9385); 
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
    // $ANTLR end "rule__BodyPromiseType__NameAssignment"


    // $ANTLR start "rule__BundleComponent__NameAssignment"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4686:1: rule__BundleComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__BundleComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4690:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4691:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4691:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4692:1: RULE_ID
            {
             before(grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BundleComponent__NameAssignment9416); 
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
    // $ANTLR end "rule__BundleComponent__NameAssignment"


    // $ANTLR start "rule__BodyComponent__NameAssignment"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4701:1: rule__BodyComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__BodyComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4705:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4706:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4706:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4707:1: RULE_ID
            {
             before(grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyComponent__NameAssignment9447); 
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
    // $ANTLR end "rule__BodyComponent__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCfModel_in_entryRuleCfModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCfModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CfModel__ElementsAssignment_in_ruleCfModel94 = new BitSet(new long[]{0x0000000001010002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_entryRuleCLASS_ID122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLASS_ID129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Alternatives_in_ruleCLASS_ID155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__0_in_ruleBundle275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromiseType309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__0_in_ruleBundlePromiseType335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleClass_in_entryRuleBundleClass362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleClass369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__0_in_ruleBundleClass395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_entryRuleBundlePromise422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromise429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__0_in_ruleBundlePromise455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_entryRulePromiseValue482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePromiseValue489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__0_in_rulePromiseValue515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0_in_ruleBody575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_entryRuleBodyClass602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyClass609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__0_in_ruleBodyClass635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyFunction669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__0_in_ruleBodyFunction695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_entryRuleSimpleFunction722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFunction729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__0_in_ruleSimpleFunction755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialFunction789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__0_in_ruleSpecialFunction815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyPromiseType849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyPromiseType__NameAssignment_in_ruleBodyPromiseType875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleComponent909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleComponent__NameAssignment_in_ruleBundleComponent935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyComponent__NameAssignment_in_ruleBodyComponent995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0__0_in_rule__CLASS_ID__Alternatives1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__0_in_rule__CLASS_ID__Alternatives1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__0_in_rule__CLASS_ID__Alternatives1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_rule__AbstractElement__Alternatives1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__AbstractElement__Alternatives1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_0_in_rule__PromiseValue__Alternatives_21149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__0_in_rule__PromiseValue__Alternatives_21167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__0_in_rule__PromiseValue__Alternatives_21185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__ValuesAssignment_2_0_0_in_rule__PromiseValue__Alternatives_2_01218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__FunctionsAssignment_2_0_1_in_rule__PromiseValue__Alternatives_2_01236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__ValuesAssignment_2_0_2_in_rule__PromiseValue__Alternatives_2_01254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_1_0_in_rule__PromiseValue__Alternatives_2_1_11287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_1_1_in_rule__PromiseValue__Alternatives_2_1_11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_2_1_0_in_rule__PromiseValue__Alternatives_2_1_2_11338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_2_1_1_in_rule__PromiseValue__Alternatives_2_1_2_11356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_0_in_rule__BodyFunction__Alternatives_21389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__0_in_rule__BodyFunction__Alternatives_21407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__FunctionAssignment_2_2_in_rule__BodyFunction__Alternatives_21425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__0_in_rule__BodyFunction__Alternatives_21443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SpecialFunction__Alternatives_21476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Alternatives_21493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecialFunction__Alternatives_21510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SpecialFunction__Alternatives_21528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_4__0_in_rule__SpecialFunction__Alternatives_21547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__0_in_rule__SpecialFunction__Alternatives_21565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__FuncAssignment_2_6_in_rule__SpecialFunction__Alternatives_21583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0__0__Impl_in_rule__CLASS_ID__Group_0__01614 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0__1_in_rule__CLASS_ID__Group_0__01617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CLASS_ID__Group_0__0__Impl1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0__1__Impl_in_rule__CLASS_ID__Group_0__11673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0_1__0_in_rule__CLASS_ID__Group_0__1__Impl1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0_1__0__Impl_in_rule__CLASS_ID__Group_0_1__01735 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0_1__1_in_rule__CLASS_ID__Group_0_1__01738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CLASS_ID__Group_0_1__0__Impl1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0_1__1__Impl_in_rule__CLASS_ID__Group_0_1__11797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_0_1__1__Impl1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__0__Impl_in_rule__CLASS_ID__Group_1__01857 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__1_in_rule__CLASS_ID__Group_1__01860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CLASS_ID__Group_1__0__Impl1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__1__Impl_in_rule__CLASS_ID__Group_1__11919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_1__1__Impl1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__0__Impl_in_rule__CLASS_ID__Group_2__01979 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__1_in_rule__CLASS_ID__Group_2__01982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CLASS_ID__Group_2__0__Impl2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__1__Impl_in_rule__CLASS_ID__Group_2__12041 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__2_in_rule__CLASS_ID__Group_2__12044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_2__1__Impl2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__2__Impl_in_rule__CLASS_ID__Group_2__22100 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__3_in_rule__CLASS_ID__Group_2__22103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CLASS_ID__Group_2__2__Impl2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__3__Impl_in_rule__CLASS_ID__Group_2__32162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2_3__0_in_rule__CLASS_ID__Group_2__3__Impl2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2_3__0__Impl_in_rule__CLASS_ID__Group_2_3__02228 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2_3__1_in_rule__CLASS_ID__Group_2_3__02231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CLASS_ID__Group_2_3__0__Impl2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2_3__1__Impl_in_rule__CLASS_ID__Group_2_3__12290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_2_3__1__Impl2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__0__Impl_in_rule__Bundle__Group__02350 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__1_in_rule__Bundle__Group__02353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Bundle__Group__0__Impl2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__1__Impl_in_rule__Bundle__Group__12412 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__2_in_rule__Bundle__Group__12415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__ComponentAssignment_1_in_rule__Bundle__Group__1__Impl2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__22472 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__22475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__32532 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__32535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__0_in_rule__Bundle__Group__3__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__42593 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__42596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Bundle__Group__4__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__52655 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__6_in_rule__Bundle__Group__52658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__PromiseTypeAssignment_5_in_rule__Bundle__Group__5__Impl2685 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Bundle__Group__6__Impl_in_rule__Bundle__Group__62716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Bundle__Group__6__Impl2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__0__Impl_in_rule__Bundle__Group_3__02789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__1_in_rule__Bundle__Group_3__02792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Bundle__Group_3__0__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__1__Impl_in_rule__Bundle__Group_3__12851 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__2_in_rule__Bundle__Group_3__12854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__VariablesAssignment_3_1_in_rule__Bundle__Group_3__1__Impl2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__2__Impl_in_rule__Bundle__Group_3__22911 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__3_in_rule__Bundle__Group_3__22914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3_2__0_in_rule__Bundle__Group_3__2__Impl2941 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__3__Impl_in_rule__Bundle__Group_3__32972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Bundle__Group_3__3__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3_2__0__Impl_in_rule__Bundle__Group_3_2__03039 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3_2__1_in_rule__Bundle__Group_3_2__03042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Bundle__Group_3_2__0__Impl3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3_2__1__Impl_in_rule__Bundle__Group_3_2__13101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__VariablesAssignment_3_2_1_in_rule__Bundle__Group_3_2__1__Impl3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__0__Impl_in_rule__BundlePromiseType__Group__03162 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__1_in_rule__BundlePromiseType__Group__03165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__NameAssignment_0_in_rule__BundlePromiseType__Group__0__Impl3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__1__Impl_in_rule__BundlePromiseType__Group__13222 = new BitSet(new long[]{0x0000000000006060L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__2_in_rule__BundlePromiseType__Group__13225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BundlePromiseType__Group__1__Impl3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__2__Impl_in_rule__BundlePromiseType__Group__23284 = new BitSet(new long[]{0x0000000000006060L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__3_in_rule__BundlePromiseType__Group__23287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__PromisesAssignment_2_in_rule__BundlePromiseType__Group__2__Impl3314 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__3__Impl_in_rule__BundlePromiseType__Group__33345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__ClassesAssignment_3_in_rule__BundlePromiseType__Group__3__Impl3372 = new BitSet(new long[]{0x0000000000006022L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__0__Impl_in_rule__BundleClass__Group__03411 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__1_in_rule__BundleClass__Group__03414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__NameAssignment_0_in_rule__BundleClass__Group__0__Impl3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__1__Impl_in_rule__BundleClass__Group__13471 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__2_in_rule__BundleClass__Group__13474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BundleClass__Group__1__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__2__Impl_in_rule__BundleClass__Group__23533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__PromisesAssignment_2_in_rule__BundleClass__Group__2__Impl3562 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__BundleClass__PromisesAssignment_2_in_rule__BundleClass__Group__2__Impl3574 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__0__Impl_in_rule__BundlePromise__Group__03613 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__1_in_rule__BundlePromise__Group__03616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__NameAssignment_0_in_rule__BundlePromise__Group__0__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__1__Impl_in_rule__BundlePromise__Group__13673 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__2_in_rule__BundlePromise__Group__13676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__0_in_rule__BundlePromise__Group__1__Impl3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__2__Impl_in_rule__BundlePromise__Group__23734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BundlePromise__Group__2__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__0__Impl_in_rule__BundlePromise__Group_1__03799 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__1_in_rule__BundlePromise__Group_1__03802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__ValuesAssignment_1_0_in_rule__BundlePromise__Group_1__0__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__1__Impl_in_rule__BundlePromise__Group_1__13859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__0_in_rule__BundlePromise__Group_1__1__Impl3886 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__0__Impl_in_rule__BundlePromise__Group_1_1__03921 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__1_in_rule__BundlePromise__Group_1_1__03924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BundlePromise__Group_1_1__0__Impl3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__1__Impl_in_rule__BundlePromise__Group_1_1__13983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__ValuesAssignment_1_1_1_in_rule__BundlePromise__Group_1_1__1__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__0__Impl_in_rule__PromiseValue__Group__04044 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__1_in_rule__PromiseValue__Group__04047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__KeywordAssignment_0_in_rule__PromiseValue__Group__0__Impl4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__1__Impl_in_rule__PromiseValue__Group__14104 = new BitSet(new long[]{0x0000000000020060L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__2_in_rule__PromiseValue__Group__14107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PromiseValue__Group__1__Impl4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__2__Impl_in_rule__PromiseValue__Group__24166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_in_rule__PromiseValue__Group__2__Impl4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__0__Impl_in_rule__PromiseValue__Group_2_1__04229 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__1_in_rule__PromiseValue__Group_2_1__04232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PromiseValue__Group_2_1__0__Impl4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__1__Impl_in_rule__PromiseValue__Group_2_1__14291 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__2_in_rule__PromiseValue__Group_2_1__14294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_1_1_in_rule__PromiseValue__Group_2_1__1__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__2__Impl_in_rule__PromiseValue__Group_2_1__24351 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__3_in_rule__PromiseValue__Group_2_1__24354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__0_in_rule__PromiseValue__Group_2_1__2__Impl4381 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__3__Impl_in_rule__PromiseValue__Group_2_1__34412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PromiseValue__Group_2_1__3__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__0__Impl_in_rule__PromiseValue__Group_2_1_2__04479 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__1_in_rule__PromiseValue__Group_2_1_2__04482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PromiseValue__Group_2_1_2__0__Impl4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__1__Impl_in_rule__PromiseValue__Group_2_1_2__14541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_1_2_1_in_rule__PromiseValue__Group_2_1_2__1__Impl4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__0__Impl_in_rule__PromiseValue__Group_2_2__04602 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__1_in_rule__PromiseValue__Group_2_2__04605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PromiseValue__Group_2_2__0__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__1__Impl_in_rule__PromiseValue__Group_2_2__14664 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__2_in_rule__PromiseValue__Group_2_2__14667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PromiseValue__Group_2_2__1__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__2__Impl_in_rule__PromiseValue__Group_2_2__24726 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__3_in_rule__PromiseValue__Group_2_2__24729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PromiseValue__Group_2_2__2__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__3__Impl_in_rule__PromiseValue__Group_2_2__34788 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__4_in_rule__PromiseValue__Group_2_2__34791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PromiseValue__Group_2_2__3__Impl4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__4__Impl_in_rule__PromiseValue__Group_2_2__44847 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__5_in_rule__PromiseValue__Group_2_2__44850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PromiseValue__Group_2_2__4__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__5__Impl_in_rule__PromiseValue__Group_2_2__54909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PromiseValue__Group_2_2__5__Impl4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__04980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__04983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Body__Group__0__Impl5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__15042 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__15045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__25102 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__Body__Group__3_in_rule__Body__Group__25105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__NameAssignment_2_in_rule__Body__Group__2__Impl5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__35162 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__Body__Group__4_in_rule__Body__Group__35165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__0_in_rule__Body__Group__3__Impl5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__45223 = new BitSet(new long[]{0x0000000000046020L});
    public static final BitSet FOLLOW_rule__Body__Group__5_in_rule__Body__Group__45226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Body__Group__4__Impl5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__55285 = new BitSet(new long[]{0x0000000000046020L});
    public static final BitSet FOLLOW_rule__Body__Group__6_in_rule__Body__Group__55288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__PromiseTypeAssignment_5_in_rule__Body__Group__5__Impl5315 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Body__Group__6__Impl_in_rule__Body__Group__65346 = new BitSet(new long[]{0x0000000000046020L});
    public static final BitSet FOLLOW_rule__Body__Group__7_in_rule__Body__Group__65349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ClassesAssignment_6_in_rule__Body__Group__6__Impl5376 = new BitSet(new long[]{0x0000000000006022L});
    public static final BitSet FOLLOW_rule__Body__Group__7__Impl_in_rule__Body__Group__75407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Body__Group__7__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__0__Impl_in_rule__Body__Group_3__05482 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group_3__1_in_rule__Body__Group_3__05485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Body__Group_3__0__Impl5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__1__Impl_in_rule__Body__Group_3__15544 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_rule__Body__Group_3__2_in_rule__Body__Group_3__15547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__VariablesAssignment_3_1_in_rule__Body__Group_3__1__Impl5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__2__Impl_in_rule__Body__Group_3__25604 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_rule__Body__Group_3__3_in_rule__Body__Group_3__25607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__0_in_rule__Body__Group_3__2__Impl5634 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Body__Group_3__3__Impl_in_rule__Body__Group_3__35665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Body__Group_3__3__Impl5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__0__Impl_in_rule__Body__Group_3_2__05732 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__1_in_rule__Body__Group_3_2__05735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Body__Group_3_2__0__Impl5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__1__Impl_in_rule__Body__Group_3_2__15794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__VariablesAssignment_3_2_1_in_rule__Body__Group_3_2__1__Impl5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__0__Impl_in_rule__BodyClass__Group__05855 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__1_in_rule__BodyClass__Group__05858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__NameAssignment_0_in_rule__BodyClass__Group__0__Impl5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__1__Impl_in_rule__BodyClass__Group__15915 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__2_in_rule__BodyClass__Group__15918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BodyClass__Group__1__Impl5946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__2__Impl_in_rule__BodyClass__Group__25977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__PromiseTypeAssignment_2_in_rule__BodyClass__Group__2__Impl6004 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__0__Impl_in_rule__BodyFunction__Group__06041 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__1_in_rule__BodyFunction__Group__06044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__NameAssignment_0_in_rule__BodyFunction__Group__0__Impl6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__1__Impl_in_rule__BodyFunction__Group__16101 = new BitSet(new long[]{0x0000000000020060L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__2_in_rule__BodyFunction__Group__16104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BodyFunction__Group__1__Impl6132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__2__Impl_in_rule__BodyFunction__Group__26163 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__3_in_rule__BodyFunction__Group__26166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Alternatives_2_in_rule__BodyFunction__Group__2__Impl6193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__3__Impl_in_rule__BodyFunction__Group__36223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BodyFunction__Group__3__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__0__Impl_in_rule__BodyFunction__Group_2_1__06290 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__1_in_rule__BodyFunction__Group_2_1__06293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ListAssignment_2_1_0_in_rule__BodyFunction__Group_2_1__0__Impl6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__1__Impl_in_rule__BodyFunction__Group_2_1__16350 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__2_in_rule__BodyFunction__Group_2_1__16353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_1_in_rule__BodyFunction__Group_2_1__1__Impl6380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__2__Impl_in_rule__BodyFunction__Group_2_1__26410 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__3_in_rule__BodyFunction__Group_2_1__26413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__0_in_rule__BodyFunction__Group_2_1__2__Impl6440 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__3__Impl_in_rule__BodyFunction__Group_2_1__36471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BodyFunction__Group_2_1__3__Impl6499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__0__Impl_in_rule__BodyFunction__Group_2_1_2__06538 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__1_in_rule__BodyFunction__Group_2_1_2__06541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BodyFunction__Group_2_1_2__0__Impl6569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__1__Impl_in_rule__BodyFunction__Group_2_1_2__16600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_2_1_in_rule__BodyFunction__Group_2_1_2__1__Impl6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__0__Impl_in_rule__BodyFunction__Group_2_3__06661 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__1_in_rule__BodyFunction__Group_2_3__06664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BodyFunction__Group_2_3__0__Impl6692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__1__Impl_in_rule__BodyFunction__Group_2_3__16723 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__2_in_rule__BodyFunction__Group_2_3__16726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BodyFunction__Group_2_3__1__Impl6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__2__Impl_in_rule__BodyFunction__Group_2_3__26785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__3_in_rule__BodyFunction__Group_2_3__26788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BodyFunction__Group_2_3__2__Impl6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__3__Impl_in_rule__BodyFunction__Group_2_3__36847 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__4_in_rule__BodyFunction__Group_2_3__36850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyFunction__Group_2_3__3__Impl6877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__4__Impl_in_rule__BodyFunction__Group_2_3__46906 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__5_in_rule__BodyFunction__Group_2_3__46909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BodyFunction__Group_2_3__4__Impl6937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__5__Impl_in_rule__BodyFunction__Group_2_3__56968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BodyFunction__Group_2_3__5__Impl6996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__0__Impl_in_rule__SimpleFunction__Group__07039 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__1_in_rule__SimpleFunction__Group__07042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__IdAssignment_0_in_rule__SimpleFunction__Group__0__Impl7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__1__Impl_in_rule__SimpleFunction__Group__17099 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__2_in_rule__SimpleFunction__Group__17102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SimpleFunction__Group__1__Impl7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__2__Impl_in_rule__SimpleFunction__Group__27161 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__3_in_rule__SimpleFunction__Group__27164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__ValuesAssignment_2_in_rule__SimpleFunction__Group__2__Impl7191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__3__Impl_in_rule__SimpleFunction__Group__37221 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__4_in_rule__SimpleFunction__Group__37224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__0_in_rule__SimpleFunction__Group__3__Impl7251 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__4__Impl_in_rule__SimpleFunction__Group__47282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SimpleFunction__Group__4__Impl7310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__0__Impl_in_rule__SimpleFunction__Group_3__07351 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__1_in_rule__SimpleFunction__Group_3__07354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SimpleFunction__Group_3__0__Impl7382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__1__Impl_in_rule__SimpleFunction__Group_3__17413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__ValuesAssignment_3_1_in_rule__SimpleFunction__Group_3__1__Impl7440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__0__Impl_in_rule__SpecialFunction__Group__07474 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__1_in_rule__SpecialFunction__Group__07477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__IdAssignment_0_in_rule__SpecialFunction__Group__0__Impl7504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__1__Impl_in_rule__SpecialFunction__Group__17534 = new BitSet(new long[]{0x0000000006008870L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__2_in_rule__SpecialFunction__Group__17537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SpecialFunction__Group__1__Impl7565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__2__Impl_in_rule__SpecialFunction__Group__27596 = new BitSet(new long[]{0x0000000006008870L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__3_in_rule__SpecialFunction__Group__27599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Alternatives_2_in_rule__SpecialFunction__Group__2__Impl7626 = new BitSet(new long[]{0x0000000006000872L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__3__Impl_in_rule__SpecialFunction__Group__37657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SpecialFunction__Group__3__Impl7685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_4__0__Impl_in_rule__SpecialFunction__Group_2_4__07724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_4__1_in_rule__SpecialFunction__Group_2_4__07727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SpecialFunction__Group_2_4__0__Impl7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_4__1__Impl_in_rule__SpecialFunction__Group_2_4__17786 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_4__2_in_rule__SpecialFunction__Group_2_4__17789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_4__1__Impl7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_4__2__Impl_in_rule__SpecialFunction__Group_2_4__27845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SpecialFunction__Group_2_4__2__Impl7873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__0__Impl_in_rule__SpecialFunction__Group_2_5__07910 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__1_in_rule__SpecialFunction__Group_2_5__07913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SpecialFunction__Group_2_5__0__Impl7941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__1__Impl_in_rule__SpecialFunction__Group_2_5__17972 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__2_in_rule__SpecialFunction__Group_2_5__17975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_5__1__Impl8002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__2__Impl_in_rule__SpecialFunction__Group_2_5__28031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SpecialFunction__Group_2_5__2__Impl8059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment8101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_rule__Bundle__ComponentAssignment_18132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_28163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bundle__VariablesAssignment_3_18194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bundle__VariablesAssignment_3_2_18225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_rule__Bundle__PromiseTypeAssignment_58256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BundlePromiseType__NameAssignment_08287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_rule__BundlePromiseType__PromisesAssignment_28318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleClass_in_rule__BundlePromiseType__ClassesAssignment_38349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__BundleClass__NameAssignment_08380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_rule__BundleClass__PromisesAssignment_28411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BundlePromise__NameAssignment_08442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_08473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_1_18504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PromiseValue__KeywordAssignment_08535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_0_08566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_0_18597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PromiseValue__ValuesAssignment_2_0_28628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_1_08659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_1_18690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_2_1_08721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_2_1_18752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_rule__Body__ComponentAssignment_18783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__NameAssignment_28814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_18845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_2_18876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_rule__Body__PromiseTypeAssignment_58907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_rule__Body__ClassesAssignment_68938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__BodyClass__NameAssignment_08969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_rule__BodyClass__PromiseTypeAssignment_29000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_rule__BodyFunction__NameAssignment_09031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_09062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BodyFunction__ListAssignment_2_1_09098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_19137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_2_19168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_rule__BodyFunction__FunctionAssignment_2_29199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleFunction__IdAssignment_09230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_29261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_3_19292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__IdAssignment_09323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_rule__SpecialFunction__FuncAssignment_2_69354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyPromiseType__NameAssignment9385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BundleComponent__NameAssignment9416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyComponent__NameAssignment9447 = new BitSet(new long[]{0x0000000000000002L});

}