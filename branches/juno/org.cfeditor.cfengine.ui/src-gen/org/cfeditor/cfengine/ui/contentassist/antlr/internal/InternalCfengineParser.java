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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_INT", "RULE_ML_COMMENT", "'.'", "'|'", "','", "'!'", "'('", "')'", "'!('", "'! ('", "'bundle'", "'{'", "'}'", "':'", "'::'", "';'", "'=>'", "'@'", "'body'", "'$('", "'${'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
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

                if ( (LA1_0==19||LA1_0==27) ) {
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:508:1: rule__CLASS_ID__Alternatives : ( ( ( rule__CLASS_ID__Group_0__0 ) ) | ( ( rule__CLASS_ID__Group_1__0 ) ) | ( ( rule__CLASS_ID__Group_2__0 ) ) | ( ( rule__CLASS_ID__Group_3__0 ) ) | ( ( rule__CLASS_ID__Group_4__0 ) ) );
    public final void rule__CLASS_ID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:512:1: ( ( ( rule__CLASS_ID__Group_0__0 ) ) | ( ( rule__CLASS_ID__Group_1__0 ) ) | ( ( rule__CLASS_ID__Group_2__0 ) ) | ( ( rule__CLASS_ID__Group_3__0 ) ) | ( ( rule__CLASS_ID__Group_4__0 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
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
                case 4 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:531:6: ( ( rule__CLASS_ID__Group_3__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:531:6: ( ( rule__CLASS_ID__Group_3__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:532:1: ( rule__CLASS_ID__Group_3__0 )
                    {
                     before(grammarAccess.getCLASS_IDAccess().getGroup_3()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:533:1: ( rule__CLASS_ID__Group_3__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:533:2: rule__CLASS_ID__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_3__0_in_rule__CLASS_ID__Alternatives1085);
                    rule__CLASS_ID__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCLASS_IDAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:537:6: ( ( rule__CLASS_ID__Group_4__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:537:6: ( ( rule__CLASS_ID__Group_4__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:538:1: ( rule__CLASS_ID__Group_4__0 )
                    {
                     before(grammarAccess.getCLASS_IDAccess().getGroup_4()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:539:1: ( rule__CLASS_ID__Group_4__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:539:2: rule__CLASS_ID__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_4__0_in_rule__CLASS_ID__Alternatives1103);
                    rule__CLASS_ID__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCLASS_IDAccess().getGroup_4()); 

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


    // $ANTLR start "rule__CLASS_ID__Alternatives_0_1_0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:548:1: rule__CLASS_ID__Alternatives_0_1_0 : ( ( '.' ) | ( '|' ) );
    public final void rule__CLASS_ID__Alternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:552:1: ( ( '.' ) | ( '|' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:553:1: ( '.' )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:553:1: ( '.' )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:554:1: '.'
                    {
                     before(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_0_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__CLASS_ID__Alternatives_0_1_01137); 
                     after(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:561:6: ( '|' )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:561:6: ( '|' )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:562:1: '|'
                    {
                     before(grammarAccess.getCLASS_IDAccess().getVerticalLineKeyword_0_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__CLASS_ID__Alternatives_0_1_01157); 
                     after(grammarAccess.getCLASS_IDAccess().getVerticalLineKeyword_0_1_0_1()); 

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
    // $ANTLR end "rule__CLASS_ID__Alternatives_0_1_0"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:574:1: rule__AbstractElement__Alternatives : ( ( ruleBundle ) | ( ruleBody ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:578:1: ( ( ruleBundle ) | ( ruleBody ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:579:1: ( ruleBundle )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:579:1: ( ruleBundle )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:580:1: ruleBundle
                    {
                     before(grammarAccess.getAbstractElementAccess().getBundleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBundle_in_rule__AbstractElement__Alternatives1191);
                    ruleBundle();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getBundleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:585:6: ( ruleBody )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:585:6: ( ruleBody )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:586:1: ruleBody
                    {
                     before(grammarAccess.getAbstractElementAccess().getBodyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBody_in_rule__AbstractElement__Alternatives1208);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:596:1: rule__PromiseValue__Alternatives_2 : ( ( ( rule__PromiseValue__Alternatives_2_0 ) ) | ( ( rule__PromiseValue__Group_2_1__0 ) ) | ( ( rule__PromiseValue__Group_2_2__0 ) ) );
    public final void rule__PromiseValue__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:600:1: ( ( ( rule__PromiseValue__Alternatives_2_0 ) ) | ( ( rule__PromiseValue__Group_2_1__0 ) ) | ( ( rule__PromiseValue__Group_2_2__0 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==26) ) {
                    alt5=3;
                }
                else if ( ((LA5_2>=RULE_ID && LA5_2<=RULE_STRING)) ) {
                    alt5=2;
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
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:601:1: ( ( rule__PromiseValue__Alternatives_2_0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:601:1: ( ( rule__PromiseValue__Alternatives_2_0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:602:1: ( rule__PromiseValue__Alternatives_2_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getAlternatives_2_0()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:603:1: ( rule__PromiseValue__Alternatives_2_0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:603:2: rule__PromiseValue__Alternatives_2_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_0_in_rule__PromiseValue__Alternatives_21240);
                    rule__PromiseValue__Alternatives_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getAlternatives_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:607:6: ( ( rule__PromiseValue__Group_2_1__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:607:6: ( ( rule__PromiseValue__Group_2_1__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:608:1: ( rule__PromiseValue__Group_2_1__0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getGroup_2_1()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:609:1: ( rule__PromiseValue__Group_2_1__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:609:2: rule__PromiseValue__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__0_in_rule__PromiseValue__Alternatives_21258);
                    rule__PromiseValue__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:613:6: ( ( rule__PromiseValue__Group_2_2__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:613:6: ( ( rule__PromiseValue__Group_2_2__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:614:1: ( rule__PromiseValue__Group_2_2__0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getGroup_2_2()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:615:1: ( rule__PromiseValue__Group_2_2__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:615:2: rule__PromiseValue__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__0_in_rule__PromiseValue__Alternatives_21276);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:624:1: rule__PromiseValue__Alternatives_2_0 : ( ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) ) | ( ( rule__PromiseValue__ValuesAssignment_2_0_2 ) ) );
    public final void rule__PromiseValue__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:628:1: ( ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) ) | ( ( rule__PromiseValue__ValuesAssignment_2_0_2 ) ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==15) ) {
                    alt6=2;
                }
                else if ( (LA6_2==EOF||LA6_2==RULE_ID||LA6_2==13||LA6_2==24) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:629:1: ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:629:1: ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:630:1: ( rule__PromiseValue__ValuesAssignment_2_0_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_0_0()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:631:1: ( rule__PromiseValue__ValuesAssignment_2_0_0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:631:2: rule__PromiseValue__ValuesAssignment_2_0_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__ValuesAssignment_2_0_0_in_rule__PromiseValue__Alternatives_2_01309);
                    rule__PromiseValue__ValuesAssignment_2_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:635:6: ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:635:6: ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:636:1: ( rule__PromiseValue__FunctionsAssignment_2_0_1 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_0_1()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:637:1: ( rule__PromiseValue__FunctionsAssignment_2_0_1 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:637:2: rule__PromiseValue__FunctionsAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__FunctionsAssignment_2_0_1_in_rule__PromiseValue__Alternatives_2_01327);
                    rule__PromiseValue__FunctionsAssignment_2_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:641:6: ( ( rule__PromiseValue__ValuesAssignment_2_0_2 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:641:6: ( ( rule__PromiseValue__ValuesAssignment_2_0_2 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:642:1: ( rule__PromiseValue__ValuesAssignment_2_0_2 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_0_2()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:643:1: ( rule__PromiseValue__ValuesAssignment_2_0_2 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:643:2: rule__PromiseValue__ValuesAssignment_2_0_2
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__ValuesAssignment_2_0_2_in_rule__PromiseValue__Alternatives_2_01345);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:652:1: rule__PromiseValue__Alternatives_2_1_1 : ( ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) ) );
    public final void rule__PromiseValue__Alternatives_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:656:1: ( ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) ) )
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
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:657:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:657:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:658:1: ( rule__PromiseValue__ValuesAssignment_2_1_1_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_1_0()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:659:1: ( rule__PromiseValue__ValuesAssignment_2_1_1_0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:659:2: rule__PromiseValue__ValuesAssignment_2_1_1_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_1_0_in_rule__PromiseValue__Alternatives_2_1_11378);
                    rule__PromiseValue__ValuesAssignment_2_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:663:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:663:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:664:1: ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_1_1_1()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:665:1: ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:665:2: rule__PromiseValue__FunctionsAssignment_2_1_1_1
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_1_1_in_rule__PromiseValue__Alternatives_2_1_11396);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:674:1: rule__PromiseValue__Alternatives_2_1_2_1 : ( ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) ) );
    public final void rule__PromiseValue__Alternatives_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:678:1: ( ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:679:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:679:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:680:1: ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_2_1_0()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:681:1: ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:681:2: rule__PromiseValue__ValuesAssignment_2_1_2_1_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_2_1_0_in_rule__PromiseValue__Alternatives_2_1_2_11429);
                    rule__PromiseValue__ValuesAssignment_2_1_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:685:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:685:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:686:1: ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_1_2_1_1()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:687:1: ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:687:2: rule__PromiseValue__FunctionsAssignment_2_1_2_1_1
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_2_1_1_in_rule__PromiseValue__Alternatives_2_1_2_11447);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:696:1: rule__BodyFunction__Alternatives_2 : ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) );
    public final void rule__BodyFunction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:700:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==26) ) {
                    alt9=4;
                }
                else if ( (LA9_2==RULE_STRING) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:701:1: ( ( rule__BodyFunction__ValuesAssignment_2_0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:701:1: ( ( rule__BodyFunction__ValuesAssignment_2_0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:702:1: ( rule__BodyFunction__ValuesAssignment_2_0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:703:1: ( rule__BodyFunction__ValuesAssignment_2_0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:703:2: rule__BodyFunction__ValuesAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_0_in_rule__BodyFunction__Alternatives_21480);
                    rule__BodyFunction__ValuesAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:707:6: ( ( rule__BodyFunction__Group_2_1__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:707:6: ( ( rule__BodyFunction__Group_2_1__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:708:1: ( rule__BodyFunction__Group_2_1__0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getGroup_2_1()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:709:1: ( rule__BodyFunction__Group_2_1__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:709:2: rule__BodyFunction__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__0_in_rule__BodyFunction__Alternatives_21498);
                    rule__BodyFunction__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:713:6: ( ( rule__BodyFunction__FunctionAssignment_2_2 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:713:6: ( ( rule__BodyFunction__FunctionAssignment_2_2 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:714:1: ( rule__BodyFunction__FunctionAssignment_2_2 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:715:1: ( rule__BodyFunction__FunctionAssignment_2_2 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:715:2: rule__BodyFunction__FunctionAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__FunctionAssignment_2_2_in_rule__BodyFunction__Alternatives_21516);
                    rule__BodyFunction__FunctionAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:719:6: ( ( rule__BodyFunction__Group_2_3__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:719:6: ( ( rule__BodyFunction__Group_2_3__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:720:1: ( rule__BodyFunction__Group_2_3__0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getGroup_2_3()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:721:1: ( rule__BodyFunction__Group_2_3__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:721:2: rule__BodyFunction__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__0_in_rule__BodyFunction__Alternatives_21534);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:730:1: rule__SpecialFunction__Alternatives_2 : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_4__0 ) ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_6 ) ) );
    public final void rule__SpecialFunction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:734:1: ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_4__0 ) ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_6 ) ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==15) ) {
                    alt10=7;
                }
                else if ( ((LA10_2>=RULE_ANY_OTHER && LA10_2<=RULE_STRING)||LA10_2==13||LA10_2==16||(LA10_2>=28 && LA10_2<=29)) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt10=3;
                }
                break;
            case 13:
                {
                alt10=4;
                }
                break;
            case 28:
                {
                alt10=5;
                }
                break;
            case 29:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:735:1: ( RULE_ANY_OTHER )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:735:1: ( RULE_ANY_OTHER )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:736:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SpecialFunction__Alternatives_21567); 
                     after(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:741:6: ( RULE_ID )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:741:6: ( RULE_ID )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:742:1: RULE_ID
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Alternatives_21584); 
                     after(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:747:6: ( RULE_STRING )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:747:6: ( RULE_STRING )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:748:1: RULE_STRING
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecialFunction__Alternatives_21601); 
                     after(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:753:6: ( ',' )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:753:6: ( ',' )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:754:1: ','
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_3()); 
                    match(input,13,FOLLOW_13_in_rule__SpecialFunction__Alternatives_21619); 
                     after(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:761:6: ( ( rule__SpecialFunction__Group_2_4__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:761:6: ( ( rule__SpecialFunction__Group_2_4__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:762:1: ( rule__SpecialFunction__Group_2_4__0 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getGroup_2_4()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:763:1: ( rule__SpecialFunction__Group_2_4__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:763:2: rule__SpecialFunction__Group_2_4__0
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__Group_2_4__0_in_rule__SpecialFunction__Alternatives_21638);
                    rule__SpecialFunction__Group_2_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecialFunctionAccess().getGroup_2_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:767:6: ( ( rule__SpecialFunction__Group_2_5__0 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:767:6: ( ( rule__SpecialFunction__Group_2_5__0 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:768:1: ( rule__SpecialFunction__Group_2_5__0 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getGroup_2_5()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:769:1: ( rule__SpecialFunction__Group_2_5__0 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:769:2: rule__SpecialFunction__Group_2_5__0
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__0_in_rule__SpecialFunction__Alternatives_21656);
                    rule__SpecialFunction__Group_2_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecialFunctionAccess().getGroup_2_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:773:6: ( ( rule__SpecialFunction__FuncAssignment_2_6 ) )
                    {
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:773:6: ( ( rule__SpecialFunction__FuncAssignment_2_6 ) )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:774:1: ( rule__SpecialFunction__FuncAssignment_2_6 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getFuncAssignment_2_6()); 
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:775:1: ( rule__SpecialFunction__FuncAssignment_2_6 )
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:775:2: rule__SpecialFunction__FuncAssignment_2_6
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__FuncAssignment_2_6_in_rule__SpecialFunction__Alternatives_21674);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:786:1: rule__CLASS_ID__Group_0__0 : rule__CLASS_ID__Group_0__0__Impl rule__CLASS_ID__Group_0__1 ;
    public final void rule__CLASS_ID__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:790:1: ( rule__CLASS_ID__Group_0__0__Impl rule__CLASS_ID__Group_0__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:791:2: rule__CLASS_ID__Group_0__0__Impl rule__CLASS_ID__Group_0__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_0__0__Impl_in_rule__CLASS_ID__Group_0__01705);
            rule__CLASS_ID__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_0__1_in_rule__CLASS_ID__Group_0__01708);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:798:1: rule__CLASS_ID__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__CLASS_ID__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:802:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:803:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:803:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:804:1: RULE_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CLASS_ID__Group_0__0__Impl1735); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:815:1: rule__CLASS_ID__Group_0__1 : rule__CLASS_ID__Group_0__1__Impl ;
    public final void rule__CLASS_ID__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:819:1: ( rule__CLASS_ID__Group_0__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:820:2: rule__CLASS_ID__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_0__1__Impl_in_rule__CLASS_ID__Group_0__11764);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:826:1: rule__CLASS_ID__Group_0__1__Impl : ( ( rule__CLASS_ID__Group_0_1__0 )? ) ;
    public final void rule__CLASS_ID__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:830:1: ( ( ( rule__CLASS_ID__Group_0_1__0 )? ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:831:1: ( ( rule__CLASS_ID__Group_0_1__0 )? )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:831:1: ( ( rule__CLASS_ID__Group_0_1__0 )? )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:832:1: ( rule__CLASS_ID__Group_0_1__0 )?
            {
             before(grammarAccess.getCLASS_IDAccess().getGroup_0_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:833:1: ( rule__CLASS_ID__Group_0_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||(LA11_0>=11 && LA11_0<=12)||(LA11_0>=14 && LA11_0<=15)||(LA11_0>=17 && LA11_0<=18)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:833:2: rule__CLASS_ID__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_0_1__0_in_rule__CLASS_ID__Group_0__1__Impl1791);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:847:1: rule__CLASS_ID__Group_0_1__0 : rule__CLASS_ID__Group_0_1__0__Impl rule__CLASS_ID__Group_0_1__1 ;
    public final void rule__CLASS_ID__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:851:1: ( rule__CLASS_ID__Group_0_1__0__Impl rule__CLASS_ID__Group_0_1__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:852:2: rule__CLASS_ID__Group_0_1__0__Impl rule__CLASS_ID__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_0_1__0__Impl_in_rule__CLASS_ID__Group_0_1__01826);
            rule__CLASS_ID__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_0_1__1_in_rule__CLASS_ID__Group_0_1__01829);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:859:1: rule__CLASS_ID__Group_0_1__0__Impl : ( ( rule__CLASS_ID__Alternatives_0_1_0 )? ) ;
    public final void rule__CLASS_ID__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:863:1: ( ( ( rule__CLASS_ID__Alternatives_0_1_0 )? ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:864:1: ( ( rule__CLASS_ID__Alternatives_0_1_0 )? )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:864:1: ( ( rule__CLASS_ID__Alternatives_0_1_0 )? )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:865:1: ( rule__CLASS_ID__Alternatives_0_1_0 )?
            {
             before(grammarAccess.getCLASS_IDAccess().getAlternatives_0_1_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:866:1: ( rule__CLASS_ID__Alternatives_0_1_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:866:2: rule__CLASS_ID__Alternatives_0_1_0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Alternatives_0_1_0_in_rule__CLASS_ID__Group_0_1__0__Impl1856);
                    rule__CLASS_ID__Alternatives_0_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCLASS_IDAccess().getAlternatives_0_1_0()); 

            }


            }

        }
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:876:1: rule__CLASS_ID__Group_0_1__1 : rule__CLASS_ID__Group_0_1__1__Impl ;
    public final void rule__CLASS_ID__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:880:1: ( rule__CLASS_ID__Group_0_1__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:881:2: rule__CLASS_ID__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_0_1__1__Impl_in_rule__CLASS_ID__Group_0_1__11887);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:887:1: rule__CLASS_ID__Group_0_1__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:891:1: ( ( ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:892:1: ( ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:892:1: ( ruleCLASS_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:893:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_0_1_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_0_1__1__Impl1914);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:908:1: rule__CLASS_ID__Group_1__0 : rule__CLASS_ID__Group_1__0__Impl rule__CLASS_ID__Group_1__1 ;
    public final void rule__CLASS_ID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:912:1: ( rule__CLASS_ID__Group_1__0__Impl rule__CLASS_ID__Group_1__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:913:2: rule__CLASS_ID__Group_1__0__Impl rule__CLASS_ID__Group_1__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_1__0__Impl_in_rule__CLASS_ID__Group_1__01947);
            rule__CLASS_ID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_1__1_in_rule__CLASS_ID__Group_1__01950);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:920:1: rule__CLASS_ID__Group_1__0__Impl : ( '!' ) ;
    public final void rule__CLASS_ID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:924:1: ( ( '!' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:925:1: ( '!' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:925:1: ( '!' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:926:1: '!'
            {
             before(grammarAccess.getCLASS_IDAccess().getExclamationMarkKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__CLASS_ID__Group_1__0__Impl1978); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:939:1: rule__CLASS_ID__Group_1__1 : rule__CLASS_ID__Group_1__1__Impl ;
    public final void rule__CLASS_ID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:943:1: ( rule__CLASS_ID__Group_1__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:944:2: rule__CLASS_ID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_1__1__Impl_in_rule__CLASS_ID__Group_1__12009);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:950:1: rule__CLASS_ID__Group_1__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:954:1: ( ( ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:955:1: ( ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:955:1: ( ruleCLASS_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:956:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_1__1__Impl2036);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:971:1: rule__CLASS_ID__Group_2__0 : rule__CLASS_ID__Group_2__0__Impl rule__CLASS_ID__Group_2__1 ;
    public final void rule__CLASS_ID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:975:1: ( rule__CLASS_ID__Group_2__0__Impl rule__CLASS_ID__Group_2__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:976:2: rule__CLASS_ID__Group_2__0__Impl rule__CLASS_ID__Group_2__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__0__Impl_in_rule__CLASS_ID__Group_2__02069);
            rule__CLASS_ID__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__1_in_rule__CLASS_ID__Group_2__02072);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:983:1: rule__CLASS_ID__Group_2__0__Impl : ( '(' ) ;
    public final void rule__CLASS_ID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:987:1: ( ( '(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:988:1: ( '(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:988:1: ( '(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:989:1: '('
            {
             before(grammarAccess.getCLASS_IDAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__CLASS_ID__Group_2__0__Impl2100); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1002:1: rule__CLASS_ID__Group_2__1 : rule__CLASS_ID__Group_2__1__Impl rule__CLASS_ID__Group_2__2 ;
    public final void rule__CLASS_ID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1006:1: ( rule__CLASS_ID__Group_2__1__Impl rule__CLASS_ID__Group_2__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1007:2: rule__CLASS_ID__Group_2__1__Impl rule__CLASS_ID__Group_2__2
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__1__Impl_in_rule__CLASS_ID__Group_2__12131);
            rule__CLASS_ID__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__2_in_rule__CLASS_ID__Group_2__12134);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1014:1: rule__CLASS_ID__Group_2__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1018:1: ( ( ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1019:1: ( ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1019:1: ( ruleCLASS_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1020:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_2__1__Impl2161);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1031:1: rule__CLASS_ID__Group_2__2 : rule__CLASS_ID__Group_2__2__Impl ;
    public final void rule__CLASS_ID__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1035:1: ( rule__CLASS_ID__Group_2__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1036:2: rule__CLASS_ID__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__2__Impl_in_rule__CLASS_ID__Group_2__22190);
            rule__CLASS_ID__Group_2__2__Impl();

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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1042:1: rule__CLASS_ID__Group_2__2__Impl : ( ')' ) ;
    public final void rule__CLASS_ID__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1046:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1047:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1047:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1048:1: ')'
            {
             before(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_2_2()); 
            match(input,16,FOLLOW_16_in_rule__CLASS_ID__Group_2__2__Impl2218); 
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


    // $ANTLR start "rule__CLASS_ID__Group_3__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1067:1: rule__CLASS_ID__Group_3__0 : rule__CLASS_ID__Group_3__0__Impl rule__CLASS_ID__Group_3__1 ;
    public final void rule__CLASS_ID__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1071:1: ( rule__CLASS_ID__Group_3__0__Impl rule__CLASS_ID__Group_3__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1072:2: rule__CLASS_ID__Group_3__0__Impl rule__CLASS_ID__Group_3__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_3__0__Impl_in_rule__CLASS_ID__Group_3__02255);
            rule__CLASS_ID__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_3__1_in_rule__CLASS_ID__Group_3__02258);
            rule__CLASS_ID__Group_3__1();

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
    // $ANTLR end "rule__CLASS_ID__Group_3__0"


    // $ANTLR start "rule__CLASS_ID__Group_3__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1079:1: rule__CLASS_ID__Group_3__0__Impl : ( '!(' ) ;
    public final void rule__CLASS_ID__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1083:1: ( ( '!(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1084:1: ( '!(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1084:1: ( '!(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1085:1: '!('
            {
             before(grammarAccess.getCLASS_IDAccess().getExclamationMarkLeftParenthesisKeyword_3_0()); 
            match(input,17,FOLLOW_17_in_rule__CLASS_ID__Group_3__0__Impl2286); 
             after(grammarAccess.getCLASS_IDAccess().getExclamationMarkLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_3__0__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_3__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1098:1: rule__CLASS_ID__Group_3__1 : rule__CLASS_ID__Group_3__1__Impl rule__CLASS_ID__Group_3__2 ;
    public final void rule__CLASS_ID__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1102:1: ( rule__CLASS_ID__Group_3__1__Impl rule__CLASS_ID__Group_3__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1103:2: rule__CLASS_ID__Group_3__1__Impl rule__CLASS_ID__Group_3__2
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_3__1__Impl_in_rule__CLASS_ID__Group_3__12317);
            rule__CLASS_ID__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_3__2_in_rule__CLASS_ID__Group_3__12320);
            rule__CLASS_ID__Group_3__2();

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
    // $ANTLR end "rule__CLASS_ID__Group_3__1"


    // $ANTLR start "rule__CLASS_ID__Group_3__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1110:1: rule__CLASS_ID__Group_3__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1114:1: ( ( ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1115:1: ( ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1115:1: ( ruleCLASS_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1116:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_3_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_3__1__Impl2347);
            ruleCLASS_ID();

            state._fsp--;

             after(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_3__1__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_3__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1127:1: rule__CLASS_ID__Group_3__2 : rule__CLASS_ID__Group_3__2__Impl ;
    public final void rule__CLASS_ID__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1131:1: ( rule__CLASS_ID__Group_3__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1132:2: rule__CLASS_ID__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_3__2__Impl_in_rule__CLASS_ID__Group_3__22376);
            rule__CLASS_ID__Group_3__2__Impl();

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
    // $ANTLR end "rule__CLASS_ID__Group_3__2"


    // $ANTLR start "rule__CLASS_ID__Group_3__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1138:1: rule__CLASS_ID__Group_3__2__Impl : ( ')' ) ;
    public final void rule__CLASS_ID__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1142:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1143:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1143:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1144:1: ')'
            {
             before(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_3_2()); 
            match(input,16,FOLLOW_16_in_rule__CLASS_ID__Group_3__2__Impl2404); 
             after(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_3__2__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_4__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1163:1: rule__CLASS_ID__Group_4__0 : rule__CLASS_ID__Group_4__0__Impl rule__CLASS_ID__Group_4__1 ;
    public final void rule__CLASS_ID__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1167:1: ( rule__CLASS_ID__Group_4__0__Impl rule__CLASS_ID__Group_4__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1168:2: rule__CLASS_ID__Group_4__0__Impl rule__CLASS_ID__Group_4__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_4__0__Impl_in_rule__CLASS_ID__Group_4__02441);
            rule__CLASS_ID__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_4__1_in_rule__CLASS_ID__Group_4__02444);
            rule__CLASS_ID__Group_4__1();

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
    // $ANTLR end "rule__CLASS_ID__Group_4__0"


    // $ANTLR start "rule__CLASS_ID__Group_4__0__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1175:1: rule__CLASS_ID__Group_4__0__Impl : ( '! (' ) ;
    public final void rule__CLASS_ID__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1179:1: ( ( '! (' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1180:1: ( '! (' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1180:1: ( '! (' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1181:1: '! ('
            {
             before(grammarAccess.getCLASS_IDAccess().getExclamationMarkSpaceLeftParenthesisKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__CLASS_ID__Group_4__0__Impl2472); 
             after(grammarAccess.getCLASS_IDAccess().getExclamationMarkSpaceLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_4__0__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_4__1"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1194:1: rule__CLASS_ID__Group_4__1 : rule__CLASS_ID__Group_4__1__Impl rule__CLASS_ID__Group_4__2 ;
    public final void rule__CLASS_ID__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1198:1: ( rule__CLASS_ID__Group_4__1__Impl rule__CLASS_ID__Group_4__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1199:2: rule__CLASS_ID__Group_4__1__Impl rule__CLASS_ID__Group_4__2
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_4__1__Impl_in_rule__CLASS_ID__Group_4__12503);
            rule__CLASS_ID__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_4__2_in_rule__CLASS_ID__Group_4__12506);
            rule__CLASS_ID__Group_4__2();

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
    // $ANTLR end "rule__CLASS_ID__Group_4__1"


    // $ANTLR start "rule__CLASS_ID__Group_4__1__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1206:1: rule__CLASS_ID__Group_4__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1210:1: ( ( ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1211:1: ( ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1211:1: ( ruleCLASS_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1212:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_4_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_4__1__Impl2533);
            ruleCLASS_ID();

            state._fsp--;

             after(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_4__1__Impl"


    // $ANTLR start "rule__CLASS_ID__Group_4__2"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1223:1: rule__CLASS_ID__Group_4__2 : rule__CLASS_ID__Group_4__2__Impl ;
    public final void rule__CLASS_ID__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1227:1: ( rule__CLASS_ID__Group_4__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1228:2: rule__CLASS_ID__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_4__2__Impl_in_rule__CLASS_ID__Group_4__22562);
            rule__CLASS_ID__Group_4__2__Impl();

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
    // $ANTLR end "rule__CLASS_ID__Group_4__2"


    // $ANTLR start "rule__CLASS_ID__Group_4__2__Impl"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1234:1: rule__CLASS_ID__Group_4__2__Impl : ( ')' ) ;
    public final void rule__CLASS_ID__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1238:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1239:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1239:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1240:1: ')'
            {
             before(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_4_2()); 
            match(input,16,FOLLOW_16_in_rule__CLASS_ID__Group_4__2__Impl2590); 
             after(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASS_ID__Group_4__2__Impl"


    // $ANTLR start "rule__Bundle__Group__0"
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1259:1: rule__Bundle__Group__0 : rule__Bundle__Group__0__Impl rule__Bundle__Group__1 ;
    public final void rule__Bundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1263:1: ( rule__Bundle__Group__0__Impl rule__Bundle__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1264:2: rule__Bundle__Group__0__Impl rule__Bundle__Group__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group__0__Impl_in_rule__Bundle__Group__02627);
            rule__Bundle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__1_in_rule__Bundle__Group__02630);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1271:1: rule__Bundle__Group__0__Impl : ( 'bundle' ) ;
    public final void rule__Bundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1275:1: ( ( 'bundle' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1276:1: ( 'bundle' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1276:1: ( 'bundle' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1277:1: 'bundle'
            {
             before(grammarAccess.getBundleAccess().getBundleKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Bundle__Group__0__Impl2658); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1290:1: rule__Bundle__Group__1 : rule__Bundle__Group__1__Impl rule__Bundle__Group__2 ;
    public final void rule__Bundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1294:1: ( rule__Bundle__Group__1__Impl rule__Bundle__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1295:2: rule__Bundle__Group__1__Impl rule__Bundle__Group__2
            {
            pushFollow(FOLLOW_rule__Bundle__Group__1__Impl_in_rule__Bundle__Group__12689);
            rule__Bundle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__2_in_rule__Bundle__Group__12692);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1302:1: rule__Bundle__Group__1__Impl : ( ( rule__Bundle__ComponentAssignment_1 ) ) ;
    public final void rule__Bundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1306:1: ( ( ( rule__Bundle__ComponentAssignment_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1307:1: ( ( rule__Bundle__ComponentAssignment_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1307:1: ( ( rule__Bundle__ComponentAssignment_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1308:1: ( rule__Bundle__ComponentAssignment_1 )
            {
             before(grammarAccess.getBundleAccess().getComponentAssignment_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1309:1: ( rule__Bundle__ComponentAssignment_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1309:2: rule__Bundle__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Bundle__ComponentAssignment_1_in_rule__Bundle__Group__1__Impl2719);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1319:1: rule__Bundle__Group__2 : rule__Bundle__Group__2__Impl rule__Bundle__Group__3 ;
    public final void rule__Bundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1323:1: ( rule__Bundle__Group__2__Impl rule__Bundle__Group__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1324:2: rule__Bundle__Group__2__Impl rule__Bundle__Group__3
            {
            pushFollow(FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__22749);
            rule__Bundle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__22752);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1331:1: rule__Bundle__Group__2__Impl : ( ( rule__Bundle__NameAssignment_2 ) ) ;
    public final void rule__Bundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1335:1: ( ( ( rule__Bundle__NameAssignment_2 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1336:1: ( ( rule__Bundle__NameAssignment_2 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1336:1: ( ( rule__Bundle__NameAssignment_2 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1337:1: ( rule__Bundle__NameAssignment_2 )
            {
             before(grammarAccess.getBundleAccess().getNameAssignment_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1338:1: ( rule__Bundle__NameAssignment_2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1338:2: rule__Bundle__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl2779);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1348:1: rule__Bundle__Group__3 : rule__Bundle__Group__3__Impl rule__Bundle__Group__4 ;
    public final void rule__Bundle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1352:1: ( rule__Bundle__Group__3__Impl rule__Bundle__Group__4 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1353:2: rule__Bundle__Group__3__Impl rule__Bundle__Group__4
            {
            pushFollow(FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__32809);
            rule__Bundle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__32812);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1360:1: rule__Bundle__Group__3__Impl : ( ( rule__Bundle__Group_3__0 )? ) ;
    public final void rule__Bundle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1364:1: ( ( ( rule__Bundle__Group_3__0 )? ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1365:1: ( ( rule__Bundle__Group_3__0 )? )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1365:1: ( ( rule__Bundle__Group_3__0 )? )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1366:1: ( rule__Bundle__Group_3__0 )?
            {
             before(grammarAccess.getBundleAccess().getGroup_3()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1367:1: ( rule__Bundle__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1367:2: rule__Bundle__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Bundle__Group_3__0_in_rule__Bundle__Group__3__Impl2839);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1377:1: rule__Bundle__Group__4 : rule__Bundle__Group__4__Impl rule__Bundle__Group__5 ;
    public final void rule__Bundle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1381:1: ( rule__Bundle__Group__4__Impl rule__Bundle__Group__5 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1382:2: rule__Bundle__Group__4__Impl rule__Bundle__Group__5
            {
            pushFollow(FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__42870);
            rule__Bundle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__42873);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1389:1: rule__Bundle__Group__4__Impl : ( '{' ) ;
    public final void rule__Bundle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1393:1: ( ( '{' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1394:1: ( '{' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1394:1: ( '{' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1395:1: '{'
            {
             before(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Bundle__Group__4__Impl2901); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1408:1: rule__Bundle__Group__5 : rule__Bundle__Group__5__Impl rule__Bundle__Group__6 ;
    public final void rule__Bundle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1412:1: ( rule__Bundle__Group__5__Impl rule__Bundle__Group__6 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1413:2: rule__Bundle__Group__5__Impl rule__Bundle__Group__6
            {
            pushFollow(FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__52932);
            rule__Bundle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__6_in_rule__Bundle__Group__52935);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1420:1: rule__Bundle__Group__5__Impl : ( ( rule__Bundle__PromiseTypeAssignment_5 )* ) ;
    public final void rule__Bundle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1424:1: ( ( ( rule__Bundle__PromiseTypeAssignment_5 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1425:1: ( ( rule__Bundle__PromiseTypeAssignment_5 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1425:1: ( ( rule__Bundle__PromiseTypeAssignment_5 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1426:1: ( rule__Bundle__PromiseTypeAssignment_5 )*
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeAssignment_5()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1427:1: ( rule__Bundle__PromiseTypeAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1427:2: rule__Bundle__PromiseTypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Bundle__PromiseTypeAssignment_5_in_rule__Bundle__Group__5__Impl2962);
            	    rule__Bundle__PromiseTypeAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1437:1: rule__Bundle__Group__6 : rule__Bundle__Group__6__Impl ;
    public final void rule__Bundle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1441:1: ( rule__Bundle__Group__6__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1442:2: rule__Bundle__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group__6__Impl_in_rule__Bundle__Group__62993);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1448:1: rule__Bundle__Group__6__Impl : ( '}' ) ;
    public final void rule__Bundle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1452:1: ( ( '}' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1453:1: ( '}' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1453:1: ( '}' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1454:1: '}'
            {
             before(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__Bundle__Group__6__Impl3021); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1481:1: rule__Bundle__Group_3__0 : rule__Bundle__Group_3__0__Impl rule__Bundle__Group_3__1 ;
    public final void rule__Bundle__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1485:1: ( rule__Bundle__Group_3__0__Impl rule__Bundle__Group_3__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1486:2: rule__Bundle__Group_3__0__Impl rule__Bundle__Group_3__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group_3__0__Impl_in_rule__Bundle__Group_3__03066);
            rule__Bundle__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_3__1_in_rule__Bundle__Group_3__03069);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1493:1: rule__Bundle__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Bundle__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1497:1: ( ( '(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1498:1: ( '(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1498:1: ( '(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1499:1: '('
            {
             before(grammarAccess.getBundleAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__Bundle__Group_3__0__Impl3097); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1512:1: rule__Bundle__Group_3__1 : rule__Bundle__Group_3__1__Impl rule__Bundle__Group_3__2 ;
    public final void rule__Bundle__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1516:1: ( rule__Bundle__Group_3__1__Impl rule__Bundle__Group_3__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1517:2: rule__Bundle__Group_3__1__Impl rule__Bundle__Group_3__2
            {
            pushFollow(FOLLOW_rule__Bundle__Group_3__1__Impl_in_rule__Bundle__Group_3__13128);
            rule__Bundle__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_3__2_in_rule__Bundle__Group_3__13131);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1524:1: rule__Bundle__Group_3__1__Impl : ( ( rule__Bundle__VariablesAssignment_3_1 ) ) ;
    public final void rule__Bundle__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1528:1: ( ( ( rule__Bundle__VariablesAssignment_3_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1529:1: ( ( rule__Bundle__VariablesAssignment_3_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1529:1: ( ( rule__Bundle__VariablesAssignment_3_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1530:1: ( rule__Bundle__VariablesAssignment_3_1 )
            {
             before(grammarAccess.getBundleAccess().getVariablesAssignment_3_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1531:1: ( rule__Bundle__VariablesAssignment_3_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1531:2: rule__Bundle__VariablesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Bundle__VariablesAssignment_3_1_in_rule__Bundle__Group_3__1__Impl3158);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1541:1: rule__Bundle__Group_3__2 : rule__Bundle__Group_3__2__Impl rule__Bundle__Group_3__3 ;
    public final void rule__Bundle__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1545:1: ( rule__Bundle__Group_3__2__Impl rule__Bundle__Group_3__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1546:2: rule__Bundle__Group_3__2__Impl rule__Bundle__Group_3__3
            {
            pushFollow(FOLLOW_rule__Bundle__Group_3__2__Impl_in_rule__Bundle__Group_3__23188);
            rule__Bundle__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_3__3_in_rule__Bundle__Group_3__23191);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1553:1: rule__Bundle__Group_3__2__Impl : ( ( rule__Bundle__Group_3_2__0 )* ) ;
    public final void rule__Bundle__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1557:1: ( ( ( rule__Bundle__Group_3_2__0 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1558:1: ( ( rule__Bundle__Group_3_2__0 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1558:1: ( ( rule__Bundle__Group_3_2__0 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1559:1: ( rule__Bundle__Group_3_2__0 )*
            {
             before(grammarAccess.getBundleAccess().getGroup_3_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1560:1: ( rule__Bundle__Group_3_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1560:2: rule__Bundle__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Bundle__Group_3_2__0_in_rule__Bundle__Group_3__2__Impl3218);
            	    rule__Bundle__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1570:1: rule__Bundle__Group_3__3 : rule__Bundle__Group_3__3__Impl ;
    public final void rule__Bundle__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1574:1: ( rule__Bundle__Group_3__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1575:2: rule__Bundle__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group_3__3__Impl_in_rule__Bundle__Group_3__33249);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1581:1: rule__Bundle__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Bundle__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1585:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1586:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1586:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1587:1: ')'
            {
             before(grammarAccess.getBundleAccess().getRightParenthesisKeyword_3_3()); 
            match(input,16,FOLLOW_16_in_rule__Bundle__Group_3__3__Impl3277); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1608:1: rule__Bundle__Group_3_2__0 : rule__Bundle__Group_3_2__0__Impl rule__Bundle__Group_3_2__1 ;
    public final void rule__Bundle__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1612:1: ( rule__Bundle__Group_3_2__0__Impl rule__Bundle__Group_3_2__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1613:2: rule__Bundle__Group_3_2__0__Impl rule__Bundle__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group_3_2__0__Impl_in_rule__Bundle__Group_3_2__03316);
            rule__Bundle__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_3_2__1_in_rule__Bundle__Group_3_2__03319);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1620:1: rule__Bundle__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Bundle__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1624:1: ( ( ',' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1625:1: ( ',' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1625:1: ( ',' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1626:1: ','
            {
             before(grammarAccess.getBundleAccess().getCommaKeyword_3_2_0()); 
            match(input,13,FOLLOW_13_in_rule__Bundle__Group_3_2__0__Impl3347); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1639:1: rule__Bundle__Group_3_2__1 : rule__Bundle__Group_3_2__1__Impl ;
    public final void rule__Bundle__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1643:1: ( rule__Bundle__Group_3_2__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1644:2: rule__Bundle__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group_3_2__1__Impl_in_rule__Bundle__Group_3_2__13378);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1650:1: rule__Bundle__Group_3_2__1__Impl : ( ( rule__Bundle__VariablesAssignment_3_2_1 ) ) ;
    public final void rule__Bundle__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1654:1: ( ( ( rule__Bundle__VariablesAssignment_3_2_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1655:1: ( ( rule__Bundle__VariablesAssignment_3_2_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1655:1: ( ( rule__Bundle__VariablesAssignment_3_2_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1656:1: ( rule__Bundle__VariablesAssignment_3_2_1 )
            {
             before(grammarAccess.getBundleAccess().getVariablesAssignment_3_2_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1657:1: ( rule__Bundle__VariablesAssignment_3_2_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1657:2: rule__Bundle__VariablesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Bundle__VariablesAssignment_3_2_1_in_rule__Bundle__Group_3_2__1__Impl3405);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1671:1: rule__BundlePromiseType__Group__0 : rule__BundlePromiseType__Group__0__Impl rule__BundlePromiseType__Group__1 ;
    public final void rule__BundlePromiseType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1675:1: ( rule__BundlePromiseType__Group__0__Impl rule__BundlePromiseType__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1676:2: rule__BundlePromiseType__Group__0__Impl rule__BundlePromiseType__Group__1
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__0__Impl_in_rule__BundlePromiseType__Group__03439);
            rule__BundlePromiseType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundlePromiseType__Group__1_in_rule__BundlePromiseType__Group__03442);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1683:1: rule__BundlePromiseType__Group__0__Impl : ( ( rule__BundlePromiseType__NameAssignment_0 ) ) ;
    public final void rule__BundlePromiseType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1687:1: ( ( ( rule__BundlePromiseType__NameAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1688:1: ( ( rule__BundlePromiseType__NameAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1688:1: ( ( rule__BundlePromiseType__NameAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1689:1: ( rule__BundlePromiseType__NameAssignment_0 )
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getNameAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1690:1: ( rule__BundlePromiseType__NameAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1690:2: rule__BundlePromiseType__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__NameAssignment_0_in_rule__BundlePromiseType__Group__0__Impl3469);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1700:1: rule__BundlePromiseType__Group__1 : rule__BundlePromiseType__Group__1__Impl rule__BundlePromiseType__Group__2 ;
    public final void rule__BundlePromiseType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1704:1: ( rule__BundlePromiseType__Group__1__Impl rule__BundlePromiseType__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1705:2: rule__BundlePromiseType__Group__1__Impl rule__BundlePromiseType__Group__2
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__1__Impl_in_rule__BundlePromiseType__Group__13499);
            rule__BundlePromiseType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundlePromiseType__Group__2_in_rule__BundlePromiseType__Group__13502);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1712:1: rule__BundlePromiseType__Group__1__Impl : ( ':' ) ;
    public final void rule__BundlePromiseType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1716:1: ( ( ':' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1717:1: ( ':' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1717:1: ( ':' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1718:1: ':'
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__BundlePromiseType__Group__1__Impl3530); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1731:1: rule__BundlePromiseType__Group__2 : rule__BundlePromiseType__Group__2__Impl rule__BundlePromiseType__Group__3 ;
    public final void rule__BundlePromiseType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1735:1: ( rule__BundlePromiseType__Group__2__Impl rule__BundlePromiseType__Group__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1736:2: rule__BundlePromiseType__Group__2__Impl rule__BundlePromiseType__Group__3
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__2__Impl_in_rule__BundlePromiseType__Group__23561);
            rule__BundlePromiseType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundlePromiseType__Group__3_in_rule__BundlePromiseType__Group__23564);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1743:1: rule__BundlePromiseType__Group__2__Impl : ( ( rule__BundlePromiseType__PromisesAssignment_2 )* ) ;
    public final void rule__BundlePromiseType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1747:1: ( ( ( rule__BundlePromiseType__PromisesAssignment_2 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1748:1: ( ( rule__BundlePromiseType__PromisesAssignment_2 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1748:1: ( ( rule__BundlePromiseType__PromisesAssignment_2 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1749:1: ( rule__BundlePromiseType__PromisesAssignment_2 )*
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getPromisesAssignment_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1750:1: ( rule__BundlePromiseType__PromisesAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1750:2: rule__BundlePromiseType__PromisesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromiseType__PromisesAssignment_2_in_rule__BundlePromiseType__Group__2__Impl3591);
            	    rule__BundlePromiseType__PromisesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1760:1: rule__BundlePromiseType__Group__3 : rule__BundlePromiseType__Group__3__Impl ;
    public final void rule__BundlePromiseType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1764:1: ( rule__BundlePromiseType__Group__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1765:2: rule__BundlePromiseType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__3__Impl_in_rule__BundlePromiseType__Group__33622);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1771:1: rule__BundlePromiseType__Group__3__Impl : ( ( rule__BundlePromiseType__ClassesAssignment_3 )* ) ;
    public final void rule__BundlePromiseType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1775:1: ( ( ( rule__BundlePromiseType__ClassesAssignment_3 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1776:1: ( ( rule__BundlePromiseType__ClassesAssignment_3 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1776:1: ( ( rule__BundlePromiseType__ClassesAssignment_3 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1777:1: ( rule__BundlePromiseType__ClassesAssignment_3 )*
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getClassesAssignment_3()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1778:1: ( rule__BundlePromiseType__ClassesAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==RULE_ID||(LA17_2>=11 && LA17_2<=12)||(LA17_2>=14 && LA17_2<=15)||(LA17_2>=17 && LA17_2<=18)||LA17_2==23) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>=14 && LA17_0<=15)||(LA17_0>=17 && LA17_0<=18)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1778:2: rule__BundlePromiseType__ClassesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromiseType__ClassesAssignment_3_in_rule__BundlePromiseType__Group__3__Impl3649);
            	    rule__BundlePromiseType__ClassesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1796:1: rule__BundleClass__Group__0 : rule__BundleClass__Group__0__Impl rule__BundleClass__Group__1 ;
    public final void rule__BundleClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1800:1: ( rule__BundleClass__Group__0__Impl rule__BundleClass__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1801:2: rule__BundleClass__Group__0__Impl rule__BundleClass__Group__1
            {
            pushFollow(FOLLOW_rule__BundleClass__Group__0__Impl_in_rule__BundleClass__Group__03688);
            rule__BundleClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundleClass__Group__1_in_rule__BundleClass__Group__03691);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1808:1: rule__BundleClass__Group__0__Impl : ( ( rule__BundleClass__NameAssignment_0 ) ) ;
    public final void rule__BundleClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1812:1: ( ( ( rule__BundleClass__NameAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1813:1: ( ( rule__BundleClass__NameAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1813:1: ( ( rule__BundleClass__NameAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1814:1: ( rule__BundleClass__NameAssignment_0 )
            {
             before(grammarAccess.getBundleClassAccess().getNameAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1815:1: ( rule__BundleClass__NameAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1815:2: rule__BundleClass__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BundleClass__NameAssignment_0_in_rule__BundleClass__Group__0__Impl3718);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1825:1: rule__BundleClass__Group__1 : rule__BundleClass__Group__1__Impl rule__BundleClass__Group__2 ;
    public final void rule__BundleClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1829:1: ( rule__BundleClass__Group__1__Impl rule__BundleClass__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1830:2: rule__BundleClass__Group__1__Impl rule__BundleClass__Group__2
            {
            pushFollow(FOLLOW_rule__BundleClass__Group__1__Impl_in_rule__BundleClass__Group__13748);
            rule__BundleClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundleClass__Group__2_in_rule__BundleClass__Group__13751);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1837:1: rule__BundleClass__Group__1__Impl : ( '::' ) ;
    public final void rule__BundleClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1841:1: ( ( '::' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1842:1: ( '::' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1842:1: ( '::' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1843:1: '::'
            {
             before(grammarAccess.getBundleClassAccess().getColonColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__BundleClass__Group__1__Impl3779); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1856:1: rule__BundleClass__Group__2 : rule__BundleClass__Group__2__Impl ;
    public final void rule__BundleClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1860:1: ( rule__BundleClass__Group__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1861:2: rule__BundleClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BundleClass__Group__2__Impl_in_rule__BundleClass__Group__23810);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1867:1: rule__BundleClass__Group__2__Impl : ( ( rule__BundleClass__PromisesAssignment_2 )* ) ;
    public final void rule__BundleClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1871:1: ( ( ( rule__BundleClass__PromisesAssignment_2 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1872:1: ( ( rule__BundleClass__PromisesAssignment_2 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1872:1: ( ( rule__BundleClass__PromisesAssignment_2 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1873:1: ( rule__BundleClass__PromisesAssignment_2 )*
            {
             before(grammarAccess.getBundleClassAccess().getPromisesAssignment_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1874:1: ( rule__BundleClass__PromisesAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1874:2: rule__BundleClass__PromisesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BundleClass__PromisesAssignment_2_in_rule__BundleClass__Group__2__Impl3837);
            	    rule__BundleClass__PromisesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getBundleClassAccess().getPromisesAssignment_2()); 

            }


            }

        }
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1890:1: rule__BundlePromise__Group__0 : rule__BundlePromise__Group__0__Impl rule__BundlePromise__Group__1 ;
    public final void rule__BundlePromise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1894:1: ( rule__BundlePromise__Group__0__Impl rule__BundlePromise__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1895:2: rule__BundlePromise__Group__0__Impl rule__BundlePromise__Group__1
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group__0__Impl_in_rule__BundlePromise__Group__03874);
            rule__BundlePromise__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group__1_in_rule__BundlePromise__Group__03877);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1902:1: rule__BundlePromise__Group__0__Impl : ( ( rule__BundlePromise__NameAssignment_0 ) ) ;
    public final void rule__BundlePromise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1906:1: ( ( ( rule__BundlePromise__NameAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1907:1: ( ( rule__BundlePromise__NameAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1907:1: ( ( rule__BundlePromise__NameAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1908:1: ( rule__BundlePromise__NameAssignment_0 )
            {
             before(grammarAccess.getBundlePromiseAccess().getNameAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1909:1: ( rule__BundlePromise__NameAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1909:2: rule__BundlePromise__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BundlePromise__NameAssignment_0_in_rule__BundlePromise__Group__0__Impl3904);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1919:1: rule__BundlePromise__Group__1 : rule__BundlePromise__Group__1__Impl rule__BundlePromise__Group__2 ;
    public final void rule__BundlePromise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1923:1: ( rule__BundlePromise__Group__1__Impl rule__BundlePromise__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1924:2: rule__BundlePromise__Group__1__Impl rule__BundlePromise__Group__2
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group__1__Impl_in_rule__BundlePromise__Group__13934);
            rule__BundlePromise__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group__2_in_rule__BundlePromise__Group__13937);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1931:1: rule__BundlePromise__Group__1__Impl : ( ( rule__BundlePromise__Group_1__0 )* ) ;
    public final void rule__BundlePromise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1935:1: ( ( ( rule__BundlePromise__Group_1__0 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1936:1: ( ( rule__BundlePromise__Group_1__0 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1936:1: ( ( rule__BundlePromise__Group_1__0 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1937:1: ( rule__BundlePromise__Group_1__0 )*
            {
             before(grammarAccess.getBundlePromiseAccess().getGroup_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1938:1: ( rule__BundlePromise__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1938:2: rule__BundlePromise__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromise__Group_1__0_in_rule__BundlePromise__Group__1__Impl3964);
            	    rule__BundlePromise__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1948:1: rule__BundlePromise__Group__2 : rule__BundlePromise__Group__2__Impl ;
    public final void rule__BundlePromise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1952:1: ( rule__BundlePromise__Group__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1953:2: rule__BundlePromise__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group__2__Impl_in_rule__BundlePromise__Group__23995);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1959:1: rule__BundlePromise__Group__2__Impl : ( ';' ) ;
    public final void rule__BundlePromise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1963:1: ( ( ';' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1964:1: ( ';' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1964:1: ( ';' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1965:1: ';'
            {
             before(grammarAccess.getBundlePromiseAccess().getSemicolonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__BundlePromise__Group__2__Impl4023); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1984:1: rule__BundlePromise__Group_1__0 : rule__BundlePromise__Group_1__0__Impl rule__BundlePromise__Group_1__1 ;
    public final void rule__BundlePromise__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1988:1: ( rule__BundlePromise__Group_1__0__Impl rule__BundlePromise__Group_1__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1989:2: rule__BundlePromise__Group_1__0__Impl rule__BundlePromise__Group_1__1
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1__0__Impl_in_rule__BundlePromise__Group_1__04060);
            rule__BundlePromise__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group_1__1_in_rule__BundlePromise__Group_1__04063);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:1996:1: rule__BundlePromise__Group_1__0__Impl : ( ( rule__BundlePromise__ValuesAssignment_1_0 ) ) ;
    public final void rule__BundlePromise__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2000:1: ( ( ( rule__BundlePromise__ValuesAssignment_1_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2001:1: ( ( rule__BundlePromise__ValuesAssignment_1_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2001:1: ( ( rule__BundlePromise__ValuesAssignment_1_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2002:1: ( rule__BundlePromise__ValuesAssignment_1_0 )
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesAssignment_1_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2003:1: ( rule__BundlePromise__ValuesAssignment_1_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2003:2: rule__BundlePromise__ValuesAssignment_1_0
            {
            pushFollow(FOLLOW_rule__BundlePromise__ValuesAssignment_1_0_in_rule__BundlePromise__Group_1__0__Impl4090);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2013:1: rule__BundlePromise__Group_1__1 : rule__BundlePromise__Group_1__1__Impl ;
    public final void rule__BundlePromise__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2017:1: ( rule__BundlePromise__Group_1__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2018:2: rule__BundlePromise__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1__1__Impl_in_rule__BundlePromise__Group_1__14120);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2024:1: rule__BundlePromise__Group_1__1__Impl : ( ( rule__BundlePromise__Group_1_1__0 )* ) ;
    public final void rule__BundlePromise__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2028:1: ( ( ( rule__BundlePromise__Group_1_1__0 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2029:1: ( ( rule__BundlePromise__Group_1_1__0 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2029:1: ( ( rule__BundlePromise__Group_1_1__0 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2030:1: ( rule__BundlePromise__Group_1_1__0 )*
            {
             before(grammarAccess.getBundlePromiseAccess().getGroup_1_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2031:1: ( rule__BundlePromise__Group_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2031:2: rule__BundlePromise__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__0_in_rule__BundlePromise__Group_1__1__Impl4147);
            	    rule__BundlePromise__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2045:1: rule__BundlePromise__Group_1_1__0 : rule__BundlePromise__Group_1_1__0__Impl rule__BundlePromise__Group_1_1__1 ;
    public final void rule__BundlePromise__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2049:1: ( rule__BundlePromise__Group_1_1__0__Impl rule__BundlePromise__Group_1_1__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2050:2: rule__BundlePromise__Group_1_1__0__Impl rule__BundlePromise__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__0__Impl_in_rule__BundlePromise__Group_1_1__04182);
            rule__BundlePromise__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__1_in_rule__BundlePromise__Group_1_1__04185);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2057:1: rule__BundlePromise__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__BundlePromise__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2061:1: ( ( ',' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2062:1: ( ',' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2062:1: ( ',' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2063:1: ','
            {
             before(grammarAccess.getBundlePromiseAccess().getCommaKeyword_1_1_0()); 
            match(input,13,FOLLOW_13_in_rule__BundlePromise__Group_1_1__0__Impl4213); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2076:1: rule__BundlePromise__Group_1_1__1 : rule__BundlePromise__Group_1_1__1__Impl ;
    public final void rule__BundlePromise__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2080:1: ( rule__BundlePromise__Group_1_1__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2081:2: rule__BundlePromise__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__1__Impl_in_rule__BundlePromise__Group_1_1__14244);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2087:1: rule__BundlePromise__Group_1_1__1__Impl : ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) ) ;
    public final void rule__BundlePromise__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2091:1: ( ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2092:1: ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2092:1: ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2093:1: ( rule__BundlePromise__ValuesAssignment_1_1_1 )
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesAssignment_1_1_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2094:1: ( rule__BundlePromise__ValuesAssignment_1_1_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2094:2: rule__BundlePromise__ValuesAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__BundlePromise__ValuesAssignment_1_1_1_in_rule__BundlePromise__Group_1_1__1__Impl4271);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2108:1: rule__PromiseValue__Group__0 : rule__PromiseValue__Group__0__Impl rule__PromiseValue__Group__1 ;
    public final void rule__PromiseValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2112:1: ( rule__PromiseValue__Group__0__Impl rule__PromiseValue__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2113:2: rule__PromiseValue__Group__0__Impl rule__PromiseValue__Group__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group__0__Impl_in_rule__PromiseValue__Group__04305);
            rule__PromiseValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group__1_in_rule__PromiseValue__Group__04308);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2120:1: rule__PromiseValue__Group__0__Impl : ( ( rule__PromiseValue__KeywordAssignment_0 ) ) ;
    public final void rule__PromiseValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2124:1: ( ( ( rule__PromiseValue__KeywordAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2125:1: ( ( rule__PromiseValue__KeywordAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2125:1: ( ( rule__PromiseValue__KeywordAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2126:1: ( rule__PromiseValue__KeywordAssignment_0 )
            {
             before(grammarAccess.getPromiseValueAccess().getKeywordAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2127:1: ( rule__PromiseValue__KeywordAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2127:2: rule__PromiseValue__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__PromiseValue__KeywordAssignment_0_in_rule__PromiseValue__Group__0__Impl4335);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2137:1: rule__PromiseValue__Group__1 : rule__PromiseValue__Group__1__Impl rule__PromiseValue__Group__2 ;
    public final void rule__PromiseValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2141:1: ( rule__PromiseValue__Group__1__Impl rule__PromiseValue__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2142:2: rule__PromiseValue__Group__1__Impl rule__PromiseValue__Group__2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group__1__Impl_in_rule__PromiseValue__Group__14365);
            rule__PromiseValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group__2_in_rule__PromiseValue__Group__14368);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2149:1: rule__PromiseValue__Group__1__Impl : ( '=>' ) ;
    public final void rule__PromiseValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2153:1: ( ( '=>' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2154:1: ( '=>' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2154:1: ( '=>' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2155:1: '=>'
            {
             before(grammarAccess.getPromiseValueAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__PromiseValue__Group__1__Impl4396); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2168:1: rule__PromiseValue__Group__2 : rule__PromiseValue__Group__2__Impl ;
    public final void rule__PromiseValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2172:1: ( rule__PromiseValue__Group__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2173:2: rule__PromiseValue__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group__2__Impl_in_rule__PromiseValue__Group__24427);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2179:1: rule__PromiseValue__Group__2__Impl : ( ( rule__PromiseValue__Alternatives_2 ) ) ;
    public final void rule__PromiseValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2183:1: ( ( ( rule__PromiseValue__Alternatives_2 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2184:1: ( ( rule__PromiseValue__Alternatives_2 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2184:1: ( ( rule__PromiseValue__Alternatives_2 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2185:1: ( rule__PromiseValue__Alternatives_2 )
            {
             before(grammarAccess.getPromiseValueAccess().getAlternatives_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2186:1: ( rule__PromiseValue__Alternatives_2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2186:2: rule__PromiseValue__Alternatives_2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_in_rule__PromiseValue__Group__2__Impl4454);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2202:1: rule__PromiseValue__Group_2_1__0 : rule__PromiseValue__Group_2_1__0__Impl rule__PromiseValue__Group_2_1__1 ;
    public final void rule__PromiseValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2206:1: ( rule__PromiseValue__Group_2_1__0__Impl rule__PromiseValue__Group_2_1__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2207:2: rule__PromiseValue__Group_2_1__0__Impl rule__PromiseValue__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__0__Impl_in_rule__PromiseValue__Group_2_1__04490);
            rule__PromiseValue__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__1_in_rule__PromiseValue__Group_2_1__04493);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2214:1: rule__PromiseValue__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__PromiseValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2218:1: ( ( '{' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2219:1: ( '{' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2219:1: ( '{' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2220:1: '{'
            {
             before(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,20,FOLLOW_20_in_rule__PromiseValue__Group_2_1__0__Impl4521); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2233:1: rule__PromiseValue__Group_2_1__1 : rule__PromiseValue__Group_2_1__1__Impl rule__PromiseValue__Group_2_1__2 ;
    public final void rule__PromiseValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2237:1: ( rule__PromiseValue__Group_2_1__1__Impl rule__PromiseValue__Group_2_1__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2238:2: rule__PromiseValue__Group_2_1__1__Impl rule__PromiseValue__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__1__Impl_in_rule__PromiseValue__Group_2_1__14552);
            rule__PromiseValue__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__2_in_rule__PromiseValue__Group_2_1__14555);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2245:1: rule__PromiseValue__Group_2_1__1__Impl : ( ( rule__PromiseValue__Alternatives_2_1_1 ) ) ;
    public final void rule__PromiseValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2249:1: ( ( ( rule__PromiseValue__Alternatives_2_1_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2250:1: ( ( rule__PromiseValue__Alternatives_2_1_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2250:1: ( ( rule__PromiseValue__Alternatives_2_1_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2251:1: ( rule__PromiseValue__Alternatives_2_1_1 )
            {
             before(grammarAccess.getPromiseValueAccess().getAlternatives_2_1_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2252:1: ( rule__PromiseValue__Alternatives_2_1_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2252:2: rule__PromiseValue__Alternatives_2_1_1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_1_1_in_rule__PromiseValue__Group_2_1__1__Impl4582);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2262:1: rule__PromiseValue__Group_2_1__2 : rule__PromiseValue__Group_2_1__2__Impl rule__PromiseValue__Group_2_1__3 ;
    public final void rule__PromiseValue__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2266:1: ( rule__PromiseValue__Group_2_1__2__Impl rule__PromiseValue__Group_2_1__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2267:2: rule__PromiseValue__Group_2_1__2__Impl rule__PromiseValue__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__2__Impl_in_rule__PromiseValue__Group_2_1__24612);
            rule__PromiseValue__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__3_in_rule__PromiseValue__Group_2_1__24615);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2274:1: rule__PromiseValue__Group_2_1__2__Impl : ( ( rule__PromiseValue__Group_2_1_2__0 )* ) ;
    public final void rule__PromiseValue__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2278:1: ( ( ( rule__PromiseValue__Group_2_1_2__0 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2279:1: ( ( rule__PromiseValue__Group_2_1_2__0 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2279:1: ( ( rule__PromiseValue__Group_2_1_2__0 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2280:1: ( rule__PromiseValue__Group_2_1_2__0 )*
            {
             before(grammarAccess.getPromiseValueAccess().getGroup_2_1_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2281:1: ( rule__PromiseValue__Group_2_1_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==13) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2281:2: rule__PromiseValue__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__0_in_rule__PromiseValue__Group_2_1__2__Impl4642);
            	    rule__PromiseValue__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2291:1: rule__PromiseValue__Group_2_1__3 : rule__PromiseValue__Group_2_1__3__Impl ;
    public final void rule__PromiseValue__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2295:1: ( rule__PromiseValue__Group_2_1__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2296:2: rule__PromiseValue__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__3__Impl_in_rule__PromiseValue__Group_2_1__34673);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2302:1: rule__PromiseValue__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__PromiseValue__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2306:1: ( ( '}' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2307:1: ( '}' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2307:1: ( '}' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2308:1: '}'
            {
             before(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,21,FOLLOW_21_in_rule__PromiseValue__Group_2_1__3__Impl4701); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2329:1: rule__PromiseValue__Group_2_1_2__0 : rule__PromiseValue__Group_2_1_2__0__Impl rule__PromiseValue__Group_2_1_2__1 ;
    public final void rule__PromiseValue__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2333:1: ( rule__PromiseValue__Group_2_1_2__0__Impl rule__PromiseValue__Group_2_1_2__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2334:2: rule__PromiseValue__Group_2_1_2__0__Impl rule__PromiseValue__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__0__Impl_in_rule__PromiseValue__Group_2_1_2__04740);
            rule__PromiseValue__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__1_in_rule__PromiseValue__Group_2_1_2__04743);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2341:1: rule__PromiseValue__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__PromiseValue__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2345:1: ( ( ',' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2346:1: ( ',' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2346:1: ( ',' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2347:1: ','
            {
             before(grammarAccess.getPromiseValueAccess().getCommaKeyword_2_1_2_0()); 
            match(input,13,FOLLOW_13_in_rule__PromiseValue__Group_2_1_2__0__Impl4771); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2360:1: rule__PromiseValue__Group_2_1_2__1 : rule__PromiseValue__Group_2_1_2__1__Impl ;
    public final void rule__PromiseValue__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2364:1: ( rule__PromiseValue__Group_2_1_2__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2365:2: rule__PromiseValue__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__1__Impl_in_rule__PromiseValue__Group_2_1_2__14802);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2371:1: rule__PromiseValue__Group_2_1_2__1__Impl : ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) ) ;
    public final void rule__PromiseValue__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2375:1: ( ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2376:1: ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2376:1: ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2377:1: ( rule__PromiseValue__Alternatives_2_1_2_1 )
            {
             before(grammarAccess.getPromiseValueAccess().getAlternatives_2_1_2_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2378:1: ( rule__PromiseValue__Alternatives_2_1_2_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2378:2: rule__PromiseValue__Alternatives_2_1_2_1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_1_2_1_in_rule__PromiseValue__Group_2_1_2__1__Impl4829);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2392:1: rule__PromiseValue__Group_2_2__0 : rule__PromiseValue__Group_2_2__0__Impl rule__PromiseValue__Group_2_2__1 ;
    public final void rule__PromiseValue__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2396:1: ( rule__PromiseValue__Group_2_2__0__Impl rule__PromiseValue__Group_2_2__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2397:2: rule__PromiseValue__Group_2_2__0__Impl rule__PromiseValue__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__0__Impl_in_rule__PromiseValue__Group_2_2__04863);
            rule__PromiseValue__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__1_in_rule__PromiseValue__Group_2_2__04866);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2404:1: rule__PromiseValue__Group_2_2__0__Impl : ( '{' ) ;
    public final void rule__PromiseValue__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2408:1: ( ( '{' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2409:1: ( '{' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2409:1: ( '{' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2410:1: '{'
            {
             before(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_2_0()); 
            match(input,20,FOLLOW_20_in_rule__PromiseValue__Group_2_2__0__Impl4894); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2423:1: rule__PromiseValue__Group_2_2__1 : rule__PromiseValue__Group_2_2__1__Impl rule__PromiseValue__Group_2_2__2 ;
    public final void rule__PromiseValue__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2427:1: ( rule__PromiseValue__Group_2_2__1__Impl rule__PromiseValue__Group_2_2__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2428:2: rule__PromiseValue__Group_2_2__1__Impl rule__PromiseValue__Group_2_2__2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__1__Impl_in_rule__PromiseValue__Group_2_2__14925);
            rule__PromiseValue__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__2_in_rule__PromiseValue__Group_2_2__14928);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2435:1: rule__PromiseValue__Group_2_2__1__Impl : ( '@' ) ;
    public final void rule__PromiseValue__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2439:1: ( ( '@' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2440:1: ( '@' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2440:1: ( '@' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2441:1: '@'
            {
             before(grammarAccess.getPromiseValueAccess().getCommercialAtKeyword_2_2_1()); 
            match(input,26,FOLLOW_26_in_rule__PromiseValue__Group_2_2__1__Impl4956); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2454:1: rule__PromiseValue__Group_2_2__2 : rule__PromiseValue__Group_2_2__2__Impl rule__PromiseValue__Group_2_2__3 ;
    public final void rule__PromiseValue__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2458:1: ( rule__PromiseValue__Group_2_2__2__Impl rule__PromiseValue__Group_2_2__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2459:2: rule__PromiseValue__Group_2_2__2__Impl rule__PromiseValue__Group_2_2__3
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__2__Impl_in_rule__PromiseValue__Group_2_2__24987);
            rule__PromiseValue__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__3_in_rule__PromiseValue__Group_2_2__24990);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2466:1: rule__PromiseValue__Group_2_2__2__Impl : ( '(' ) ;
    public final void rule__PromiseValue__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2470:1: ( ( '(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2471:1: ( '(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2471:1: ( '(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2472:1: '('
            {
             before(grammarAccess.getPromiseValueAccess().getLeftParenthesisKeyword_2_2_2()); 
            match(input,15,FOLLOW_15_in_rule__PromiseValue__Group_2_2__2__Impl5018); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2485:1: rule__PromiseValue__Group_2_2__3 : rule__PromiseValue__Group_2_2__3__Impl rule__PromiseValue__Group_2_2__4 ;
    public final void rule__PromiseValue__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2489:1: ( rule__PromiseValue__Group_2_2__3__Impl rule__PromiseValue__Group_2_2__4 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2490:2: rule__PromiseValue__Group_2_2__3__Impl rule__PromiseValue__Group_2_2__4
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__3__Impl_in_rule__PromiseValue__Group_2_2__35049);
            rule__PromiseValue__Group_2_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__4_in_rule__PromiseValue__Group_2_2__35052);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2497:1: rule__PromiseValue__Group_2_2__3__Impl : ( RULE_ID ) ;
    public final void rule__PromiseValue__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2501:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2502:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2502:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2503:1: RULE_ID
            {
             before(grammarAccess.getPromiseValueAccess().getIDTerminalRuleCall_2_2_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PromiseValue__Group_2_2__3__Impl5079); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2514:1: rule__PromiseValue__Group_2_2__4 : rule__PromiseValue__Group_2_2__4__Impl rule__PromiseValue__Group_2_2__5 ;
    public final void rule__PromiseValue__Group_2_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2518:1: ( rule__PromiseValue__Group_2_2__4__Impl rule__PromiseValue__Group_2_2__5 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2519:2: rule__PromiseValue__Group_2_2__4__Impl rule__PromiseValue__Group_2_2__5
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__4__Impl_in_rule__PromiseValue__Group_2_2__45108);
            rule__PromiseValue__Group_2_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__5_in_rule__PromiseValue__Group_2_2__45111);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2526:1: rule__PromiseValue__Group_2_2__4__Impl : ( ')' ) ;
    public final void rule__PromiseValue__Group_2_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2530:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2531:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2531:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2532:1: ')'
            {
             before(grammarAccess.getPromiseValueAccess().getRightParenthesisKeyword_2_2_4()); 
            match(input,16,FOLLOW_16_in_rule__PromiseValue__Group_2_2__4__Impl5139); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2545:1: rule__PromiseValue__Group_2_2__5 : rule__PromiseValue__Group_2_2__5__Impl ;
    public final void rule__PromiseValue__Group_2_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2549:1: ( rule__PromiseValue__Group_2_2__5__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2550:2: rule__PromiseValue__Group_2_2__5__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__5__Impl_in_rule__PromiseValue__Group_2_2__55170);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2556:1: rule__PromiseValue__Group_2_2__5__Impl : ( '}' ) ;
    public final void rule__PromiseValue__Group_2_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2560:1: ( ( '}' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2561:1: ( '}' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2561:1: ( '}' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2562:1: '}'
            {
             before(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_2_5()); 
            match(input,21,FOLLOW_21_in_rule__PromiseValue__Group_2_2__5__Impl5198); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2587:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2591:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2592:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__05241);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__05244);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2599:1: rule__Body__Group__0__Impl : ( 'body' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2603:1: ( ( 'body' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2604:1: ( 'body' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2604:1: ( 'body' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2605:1: 'body'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Body__Group__0__Impl5272); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2618:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2622:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2623:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__15303);
            rule__Body__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__15306);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2630:1: rule__Body__Group__1__Impl : ( ( rule__Body__ComponentAssignment_1 ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2634:1: ( ( ( rule__Body__ComponentAssignment_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2635:1: ( ( rule__Body__ComponentAssignment_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2635:1: ( ( rule__Body__ComponentAssignment_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2636:1: ( rule__Body__ComponentAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getComponentAssignment_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2637:1: ( rule__Body__ComponentAssignment_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2637:2: rule__Body__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl5333);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2647:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2651:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2652:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__25363);
            rule__Body__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__3_in_rule__Body__Group__25366);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2659:1: rule__Body__Group__2__Impl : ( ( rule__Body__NameAssignment_2 ) ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2663:1: ( ( ( rule__Body__NameAssignment_2 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2664:1: ( ( rule__Body__NameAssignment_2 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2664:1: ( ( rule__Body__NameAssignment_2 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2665:1: ( rule__Body__NameAssignment_2 )
            {
             before(grammarAccess.getBodyAccess().getNameAssignment_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2666:1: ( rule__Body__NameAssignment_2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2666:2: rule__Body__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Body__NameAssignment_2_in_rule__Body__Group__2__Impl5393);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2676:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2680:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2681:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__35423);
            rule__Body__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__4_in_rule__Body__Group__35426);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2688:1: rule__Body__Group__3__Impl : ( ( rule__Body__Group_3__0 )? ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2692:1: ( ( ( rule__Body__Group_3__0 )? ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2693:1: ( ( rule__Body__Group_3__0 )? )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2693:1: ( ( rule__Body__Group_3__0 )? )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2694:1: ( rule__Body__Group_3__0 )?
            {
             before(grammarAccess.getBodyAccess().getGroup_3()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2695:1: ( rule__Body__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==15) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2695:2: rule__Body__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Body__Group_3__0_in_rule__Body__Group__3__Impl5453);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2705:1: rule__Body__Group__4 : rule__Body__Group__4__Impl rule__Body__Group__5 ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2709:1: ( rule__Body__Group__4__Impl rule__Body__Group__5 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2710:2: rule__Body__Group__4__Impl rule__Body__Group__5
            {
            pushFollow(FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__45484);
            rule__Body__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__5_in_rule__Body__Group__45487);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2717:1: rule__Body__Group__4__Impl : ( '{' ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2721:1: ( ( '{' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2722:1: ( '{' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2722:1: ( '{' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2723:1: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Body__Group__4__Impl5515); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2736:1: rule__Body__Group__5 : rule__Body__Group__5__Impl rule__Body__Group__6 ;
    public final void rule__Body__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2740:1: ( rule__Body__Group__5__Impl rule__Body__Group__6 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2741:2: rule__Body__Group__5__Impl rule__Body__Group__6
            {
            pushFollow(FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__55546);
            rule__Body__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__6_in_rule__Body__Group__55549);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2748:1: rule__Body__Group__5__Impl : ( ( rule__Body__PromiseTypeAssignment_5 )* ) ;
    public final void rule__Body__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2752:1: ( ( ( rule__Body__PromiseTypeAssignment_5 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2753:1: ( ( rule__Body__PromiseTypeAssignment_5 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2753:1: ( ( rule__Body__PromiseTypeAssignment_5 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2754:1: ( rule__Body__PromiseTypeAssignment_5 )*
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeAssignment_5()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2755:1: ( rule__Body__PromiseTypeAssignment_5 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==25) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2755:2: rule__Body__PromiseTypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Body__PromiseTypeAssignment_5_in_rule__Body__Group__5__Impl5576);
            	    rule__Body__PromiseTypeAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2765:1: rule__Body__Group__6 : rule__Body__Group__6__Impl rule__Body__Group__7 ;
    public final void rule__Body__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2769:1: ( rule__Body__Group__6__Impl rule__Body__Group__7 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2770:2: rule__Body__Group__6__Impl rule__Body__Group__7
            {
            pushFollow(FOLLOW_rule__Body__Group__6__Impl_in_rule__Body__Group__65607);
            rule__Body__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__7_in_rule__Body__Group__65610);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2777:1: rule__Body__Group__6__Impl : ( ( rule__Body__ClassesAssignment_6 )* ) ;
    public final void rule__Body__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2781:1: ( ( ( rule__Body__ClassesAssignment_6 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2782:1: ( ( rule__Body__ClassesAssignment_6 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2782:1: ( ( rule__Body__ClassesAssignment_6 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2783:1: ( rule__Body__ClassesAssignment_6 )*
            {
             before(grammarAccess.getBodyAccess().getClassesAssignment_6()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2784:1: ( rule__Body__ClassesAssignment_6 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||(LA24_0>=14 && LA24_0<=15)||(LA24_0>=17 && LA24_0<=18)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2784:2: rule__Body__ClassesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Body__ClassesAssignment_6_in_rule__Body__Group__6__Impl5637);
            	    rule__Body__ClassesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2794:1: rule__Body__Group__7 : rule__Body__Group__7__Impl ;
    public final void rule__Body__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2798:1: ( rule__Body__Group__7__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2799:2: rule__Body__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__7__Impl_in_rule__Body__Group__75668);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2805:1: rule__Body__Group__7__Impl : ( '}' ) ;
    public final void rule__Body__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2809:1: ( ( '}' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2810:1: ( '}' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2810:1: ( '}' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2811:1: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__Body__Group__7__Impl5696); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2840:1: rule__Body__Group_3__0 : rule__Body__Group_3__0__Impl rule__Body__Group_3__1 ;
    public final void rule__Body__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2844:1: ( rule__Body__Group_3__0__Impl rule__Body__Group_3__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2845:2: rule__Body__Group_3__0__Impl rule__Body__Group_3__1
            {
            pushFollow(FOLLOW_rule__Body__Group_3__0__Impl_in_rule__Body__Group_3__05743);
            rule__Body__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__1_in_rule__Body__Group_3__05746);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2852:1: rule__Body__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Body__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2856:1: ( ( '(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2857:1: ( '(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2857:1: ( '(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2858:1: '('
            {
             before(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__Body__Group_3__0__Impl5774); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2871:1: rule__Body__Group_3__1 : rule__Body__Group_3__1__Impl rule__Body__Group_3__2 ;
    public final void rule__Body__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2875:1: ( rule__Body__Group_3__1__Impl rule__Body__Group_3__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2876:2: rule__Body__Group_3__1__Impl rule__Body__Group_3__2
            {
            pushFollow(FOLLOW_rule__Body__Group_3__1__Impl_in_rule__Body__Group_3__15805);
            rule__Body__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__2_in_rule__Body__Group_3__15808);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2883:1: rule__Body__Group_3__1__Impl : ( ( rule__Body__VariablesAssignment_3_1 ) ) ;
    public final void rule__Body__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2887:1: ( ( ( rule__Body__VariablesAssignment_3_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2888:1: ( ( rule__Body__VariablesAssignment_3_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2888:1: ( ( rule__Body__VariablesAssignment_3_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2889:1: ( rule__Body__VariablesAssignment_3_1 )
            {
             before(grammarAccess.getBodyAccess().getVariablesAssignment_3_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2890:1: ( rule__Body__VariablesAssignment_3_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2890:2: rule__Body__VariablesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Body__VariablesAssignment_3_1_in_rule__Body__Group_3__1__Impl5835);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2900:1: rule__Body__Group_3__2 : rule__Body__Group_3__2__Impl rule__Body__Group_3__3 ;
    public final void rule__Body__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2904:1: ( rule__Body__Group_3__2__Impl rule__Body__Group_3__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2905:2: rule__Body__Group_3__2__Impl rule__Body__Group_3__3
            {
            pushFollow(FOLLOW_rule__Body__Group_3__2__Impl_in_rule__Body__Group_3__25865);
            rule__Body__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__3_in_rule__Body__Group_3__25868);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2912:1: rule__Body__Group_3__2__Impl : ( ( rule__Body__Group_3_2__0 )* ) ;
    public final void rule__Body__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2916:1: ( ( ( rule__Body__Group_3_2__0 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2917:1: ( ( rule__Body__Group_3_2__0 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2917:1: ( ( rule__Body__Group_3_2__0 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2918:1: ( rule__Body__Group_3_2__0 )*
            {
             before(grammarAccess.getBodyAccess().getGroup_3_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2919:1: ( rule__Body__Group_3_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==13) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2919:2: rule__Body__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Body__Group_3_2__0_in_rule__Body__Group_3__2__Impl5895);
            	    rule__Body__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2929:1: rule__Body__Group_3__3 : rule__Body__Group_3__3__Impl ;
    public final void rule__Body__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2933:1: ( rule__Body__Group_3__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2934:2: rule__Body__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_3__3__Impl_in_rule__Body__Group_3__35926);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2940:1: rule__Body__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Body__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2944:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2945:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2945:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2946:1: ')'
            {
             before(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3()); 
            match(input,16,FOLLOW_16_in_rule__Body__Group_3__3__Impl5954); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2967:1: rule__Body__Group_3_2__0 : rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1 ;
    public final void rule__Body__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2971:1: ( rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2972:2: rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Body__Group_3_2__0__Impl_in_rule__Body__Group_3_2__05993);
            rule__Body__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3_2__1_in_rule__Body__Group_3_2__05996);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2979:1: rule__Body__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Body__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2983:1: ( ( ',' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2984:1: ( ',' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2984:1: ( ',' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2985:1: ','
            {
             before(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0()); 
            match(input,13,FOLLOW_13_in_rule__Body__Group_3_2__0__Impl6024); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:2998:1: rule__Body__Group_3_2__1 : rule__Body__Group_3_2__1__Impl ;
    public final void rule__Body__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3002:1: ( rule__Body__Group_3_2__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3003:2: rule__Body__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_3_2__1__Impl_in_rule__Body__Group_3_2__16055);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3009:1: rule__Body__Group_3_2__1__Impl : ( ( rule__Body__VariablesAssignment_3_2_1 ) ) ;
    public final void rule__Body__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3013:1: ( ( ( rule__Body__VariablesAssignment_3_2_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3014:1: ( ( rule__Body__VariablesAssignment_3_2_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3014:1: ( ( rule__Body__VariablesAssignment_3_2_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3015:1: ( rule__Body__VariablesAssignment_3_2_1 )
            {
             before(grammarAccess.getBodyAccess().getVariablesAssignment_3_2_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3016:1: ( rule__Body__VariablesAssignment_3_2_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3016:2: rule__Body__VariablesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Body__VariablesAssignment_3_2_1_in_rule__Body__Group_3_2__1__Impl6082);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3030:1: rule__BodyClass__Group__0 : rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1 ;
    public final void rule__BodyClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3034:1: ( rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3035:2: rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__0__Impl_in_rule__BodyClass__Group__06116);
            rule__BodyClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyClass__Group__1_in_rule__BodyClass__Group__06119);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3042:1: rule__BodyClass__Group__0__Impl : ( ( rule__BodyClass__NameAssignment_0 ) ) ;
    public final void rule__BodyClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3046:1: ( ( ( rule__BodyClass__NameAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3047:1: ( ( rule__BodyClass__NameAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3047:1: ( ( rule__BodyClass__NameAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3048:1: ( rule__BodyClass__NameAssignment_0 )
            {
             before(grammarAccess.getBodyClassAccess().getNameAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3049:1: ( rule__BodyClass__NameAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3049:2: rule__BodyClass__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BodyClass__NameAssignment_0_in_rule__BodyClass__Group__0__Impl6146);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3059:1: rule__BodyClass__Group__1 : rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2 ;
    public final void rule__BodyClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3063:1: ( rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3064:2: rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__1__Impl_in_rule__BodyClass__Group__16176);
            rule__BodyClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyClass__Group__2_in_rule__BodyClass__Group__16179);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3071:1: rule__BodyClass__Group__1__Impl : ( '::' ) ;
    public final void rule__BodyClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3075:1: ( ( '::' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3076:1: ( '::' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3076:1: ( '::' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3077:1: '::'
            {
             before(grammarAccess.getBodyClassAccess().getColonColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__BodyClass__Group__1__Impl6207); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3090:1: rule__BodyClass__Group__2 : rule__BodyClass__Group__2__Impl ;
    public final void rule__BodyClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3094:1: ( rule__BodyClass__Group__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3095:2: rule__BodyClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__2__Impl_in_rule__BodyClass__Group__26238);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3101:1: rule__BodyClass__Group__2__Impl : ( ( rule__BodyClass__PromiseTypeAssignment_2 )* ) ;
    public final void rule__BodyClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3105:1: ( ( ( rule__BodyClass__PromiseTypeAssignment_2 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3106:1: ( ( rule__BodyClass__PromiseTypeAssignment_2 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3106:1: ( ( rule__BodyClass__PromiseTypeAssignment_2 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3107:1: ( rule__BodyClass__PromiseTypeAssignment_2 )*
            {
             before(grammarAccess.getBodyClassAccess().getPromiseTypeAssignment_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3108:1: ( rule__BodyClass__PromiseTypeAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==25) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3108:2: rule__BodyClass__PromiseTypeAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BodyClass__PromiseTypeAssignment_2_in_rule__BodyClass__Group__2__Impl6265);
            	    rule__BodyClass__PromiseTypeAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3124:1: rule__BodyFunction__Group__0 : rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1 ;
    public final void rule__BodyFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3128:1: ( rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3129:2: rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__0__Impl_in_rule__BodyFunction__Group__06302);
            rule__BodyFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__1_in_rule__BodyFunction__Group__06305);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3136:1: rule__BodyFunction__Group__0__Impl : ( ( rule__BodyFunction__NameAssignment_0 ) ) ;
    public final void rule__BodyFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3140:1: ( ( ( rule__BodyFunction__NameAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3141:1: ( ( rule__BodyFunction__NameAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3141:1: ( ( rule__BodyFunction__NameAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3142:1: ( rule__BodyFunction__NameAssignment_0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getNameAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3143:1: ( rule__BodyFunction__NameAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3143:2: rule__BodyFunction__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BodyFunction__NameAssignment_0_in_rule__BodyFunction__Group__0__Impl6332);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3153:1: rule__BodyFunction__Group__1 : rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2 ;
    public final void rule__BodyFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3157:1: ( rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3158:2: rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__1__Impl_in_rule__BodyFunction__Group__16362);
            rule__BodyFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__2_in_rule__BodyFunction__Group__16365);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3165:1: rule__BodyFunction__Group__1__Impl : ( '=>' ) ;
    public final void rule__BodyFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3169:1: ( ( '=>' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3170:1: ( '=>' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3170:1: ( '=>' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3171:1: '=>'
            {
             before(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__BodyFunction__Group__1__Impl6393); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3184:1: rule__BodyFunction__Group__2 : rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3 ;
    public final void rule__BodyFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3188:1: ( rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3189:2: rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__2__Impl_in_rule__BodyFunction__Group__26424);
            rule__BodyFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__3_in_rule__BodyFunction__Group__26427);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3196:1: rule__BodyFunction__Group__2__Impl : ( ( rule__BodyFunction__Alternatives_2 ) ) ;
    public final void rule__BodyFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3200:1: ( ( ( rule__BodyFunction__Alternatives_2 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3201:1: ( ( rule__BodyFunction__Alternatives_2 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3201:1: ( ( rule__BodyFunction__Alternatives_2 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3202:1: ( rule__BodyFunction__Alternatives_2 )
            {
             before(grammarAccess.getBodyFunctionAccess().getAlternatives_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3203:1: ( rule__BodyFunction__Alternatives_2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3203:2: rule__BodyFunction__Alternatives_2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Alternatives_2_in_rule__BodyFunction__Group__2__Impl6454);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3213:1: rule__BodyFunction__Group__3 : rule__BodyFunction__Group__3__Impl ;
    public final void rule__BodyFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3217:1: ( rule__BodyFunction__Group__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3218:2: rule__BodyFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__3__Impl_in_rule__BodyFunction__Group__36484);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3224:1: rule__BodyFunction__Group__3__Impl : ( ';' ) ;
    public final void rule__BodyFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3228:1: ( ( ';' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3229:1: ( ';' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3229:1: ( ';' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3230:1: ';'
            {
             before(grammarAccess.getBodyFunctionAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__BodyFunction__Group__3__Impl6512); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3251:1: rule__BodyFunction__Group_2_1__0 : rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1 ;
    public final void rule__BodyFunction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3255:1: ( rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3256:2: rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__0__Impl_in_rule__BodyFunction__Group_2_1__06551);
            rule__BodyFunction__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__1_in_rule__BodyFunction__Group_2_1__06554);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3263:1: rule__BodyFunction__Group_2_1__0__Impl : ( ( rule__BodyFunction__ListAssignment_2_1_0 ) ) ;
    public final void rule__BodyFunction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3267:1: ( ( ( rule__BodyFunction__ListAssignment_2_1_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3268:1: ( ( rule__BodyFunction__ListAssignment_2_1_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3268:1: ( ( rule__BodyFunction__ListAssignment_2_1_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3269:1: ( rule__BodyFunction__ListAssignment_2_1_0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getListAssignment_2_1_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3270:1: ( rule__BodyFunction__ListAssignment_2_1_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3270:2: rule__BodyFunction__ListAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__BodyFunction__ListAssignment_2_1_0_in_rule__BodyFunction__Group_2_1__0__Impl6581);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3280:1: rule__BodyFunction__Group_2_1__1 : rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2 ;
    public final void rule__BodyFunction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3284:1: ( rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3285:2: rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__1__Impl_in_rule__BodyFunction__Group_2_1__16611);
            rule__BodyFunction__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__2_in_rule__BodyFunction__Group_2_1__16614);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3292:1: rule__BodyFunction__Group_2_1__1__Impl : ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__BodyFunction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3296:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3297:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3297:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3298:1: ( rule__BodyFunction__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3299:1: ( rule__BodyFunction__ValuesAssignment_2_1_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3299:2: rule__BodyFunction__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_1_in_rule__BodyFunction__Group_2_1__1__Impl6641);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3309:1: rule__BodyFunction__Group_2_1__2 : rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3 ;
    public final void rule__BodyFunction__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3313:1: ( rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3314:2: rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__2__Impl_in_rule__BodyFunction__Group_2_1__26671);
            rule__BodyFunction__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__3_in_rule__BodyFunction__Group_2_1__26674);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3321:1: rule__BodyFunction__Group_2_1__2__Impl : ( ( rule__BodyFunction__Group_2_1_2__0 )* ) ;
    public final void rule__BodyFunction__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3325:1: ( ( ( rule__BodyFunction__Group_2_1_2__0 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3326:1: ( ( rule__BodyFunction__Group_2_1_2__0 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3326:1: ( ( rule__BodyFunction__Group_2_1_2__0 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3327:1: ( rule__BodyFunction__Group_2_1_2__0 )*
            {
             before(grammarAccess.getBodyFunctionAccess().getGroup_2_1_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3328:1: ( rule__BodyFunction__Group_2_1_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==13) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3328:2: rule__BodyFunction__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__0_in_rule__BodyFunction__Group_2_1__2__Impl6701);
            	    rule__BodyFunction__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3338:1: rule__BodyFunction__Group_2_1__3 : rule__BodyFunction__Group_2_1__3__Impl ;
    public final void rule__BodyFunction__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3342:1: ( rule__BodyFunction__Group_2_1__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3343:2: rule__BodyFunction__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__3__Impl_in_rule__BodyFunction__Group_2_1__36732);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3349:1: rule__BodyFunction__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__BodyFunction__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3353:1: ( ( '}' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3354:1: ( '}' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3354:1: ( '}' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3355:1: '}'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,21,FOLLOW_21_in_rule__BodyFunction__Group_2_1__3__Impl6760); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3376:1: rule__BodyFunction__Group_2_1_2__0 : rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1 ;
    public final void rule__BodyFunction__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3380:1: ( rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3381:2: rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__0__Impl_in_rule__BodyFunction__Group_2_1_2__06799);
            rule__BodyFunction__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__1_in_rule__BodyFunction__Group_2_1_2__06802);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3388:1: rule__BodyFunction__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__BodyFunction__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3392:1: ( ( ',' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3393:1: ( ',' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3393:1: ( ',' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3394:1: ','
            {
             before(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0()); 
            match(input,13,FOLLOW_13_in_rule__BodyFunction__Group_2_1_2__0__Impl6830); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3407:1: rule__BodyFunction__Group_2_1_2__1 : rule__BodyFunction__Group_2_1_2__1__Impl ;
    public final void rule__BodyFunction__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3411:1: ( rule__BodyFunction__Group_2_1_2__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3412:2: rule__BodyFunction__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__1__Impl_in_rule__BodyFunction__Group_2_1_2__16861);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3418:1: rule__BodyFunction__Group_2_1_2__1__Impl : ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) ) ;
    public final void rule__BodyFunction__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3422:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3423:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3423:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3424:1: ( rule__BodyFunction__ValuesAssignment_2_1_2_1 )
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_2_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3425:1: ( rule__BodyFunction__ValuesAssignment_2_1_2_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3425:2: rule__BodyFunction__ValuesAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_2_1_in_rule__BodyFunction__Group_2_1_2__1__Impl6888);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3439:1: rule__BodyFunction__Group_2_3__0 : rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1 ;
    public final void rule__BodyFunction__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3443:1: ( rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3444:2: rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__0__Impl_in_rule__BodyFunction__Group_2_3__06922);
            rule__BodyFunction__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__1_in_rule__BodyFunction__Group_2_3__06925);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3451:1: rule__BodyFunction__Group_2_3__0__Impl : ( '{' ) ;
    public final void rule__BodyFunction__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3455:1: ( ( '{' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3456:1: ( '{' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3456:1: ( '{' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3457:1: '{'
            {
             before(grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_3_0()); 
            match(input,20,FOLLOW_20_in_rule__BodyFunction__Group_2_3__0__Impl6953); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3470:1: rule__BodyFunction__Group_2_3__1 : rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2 ;
    public final void rule__BodyFunction__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3474:1: ( rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3475:2: rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__1__Impl_in_rule__BodyFunction__Group_2_3__16984);
            rule__BodyFunction__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__2_in_rule__BodyFunction__Group_2_3__16987);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3482:1: rule__BodyFunction__Group_2_3__1__Impl : ( '@' ) ;
    public final void rule__BodyFunction__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3486:1: ( ( '@' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3487:1: ( '@' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3487:1: ( '@' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3488:1: '@'
            {
             before(grammarAccess.getBodyFunctionAccess().getCommercialAtKeyword_2_3_1()); 
            match(input,26,FOLLOW_26_in_rule__BodyFunction__Group_2_3__1__Impl7015); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3501:1: rule__BodyFunction__Group_2_3__2 : rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3 ;
    public final void rule__BodyFunction__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3505:1: ( rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3506:2: rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__2__Impl_in_rule__BodyFunction__Group_2_3__27046);
            rule__BodyFunction__Group_2_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__3_in_rule__BodyFunction__Group_2_3__27049);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3513:1: rule__BodyFunction__Group_2_3__2__Impl : ( '(' ) ;
    public final void rule__BodyFunction__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3517:1: ( ( '(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3518:1: ( '(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3518:1: ( '(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3519:1: '('
            {
             before(grammarAccess.getBodyFunctionAccess().getLeftParenthesisKeyword_2_3_2()); 
            match(input,15,FOLLOW_15_in_rule__BodyFunction__Group_2_3__2__Impl7077); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3532:1: rule__BodyFunction__Group_2_3__3 : rule__BodyFunction__Group_2_3__3__Impl rule__BodyFunction__Group_2_3__4 ;
    public final void rule__BodyFunction__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3536:1: ( rule__BodyFunction__Group_2_3__3__Impl rule__BodyFunction__Group_2_3__4 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3537:2: rule__BodyFunction__Group_2_3__3__Impl rule__BodyFunction__Group_2_3__4
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__3__Impl_in_rule__BodyFunction__Group_2_3__37108);
            rule__BodyFunction__Group_2_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__4_in_rule__BodyFunction__Group_2_3__37111);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3544:1: rule__BodyFunction__Group_2_3__3__Impl : ( RULE_ID ) ;
    public final void rule__BodyFunction__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3548:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3549:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3549:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3550:1: RULE_ID
            {
             before(grammarAccess.getBodyFunctionAccess().getIDTerminalRuleCall_2_3_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyFunction__Group_2_3__3__Impl7138); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3561:1: rule__BodyFunction__Group_2_3__4 : rule__BodyFunction__Group_2_3__4__Impl rule__BodyFunction__Group_2_3__5 ;
    public final void rule__BodyFunction__Group_2_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3565:1: ( rule__BodyFunction__Group_2_3__4__Impl rule__BodyFunction__Group_2_3__5 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3566:2: rule__BodyFunction__Group_2_3__4__Impl rule__BodyFunction__Group_2_3__5
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__4__Impl_in_rule__BodyFunction__Group_2_3__47167);
            rule__BodyFunction__Group_2_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__5_in_rule__BodyFunction__Group_2_3__47170);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3573:1: rule__BodyFunction__Group_2_3__4__Impl : ( ')' ) ;
    public final void rule__BodyFunction__Group_2_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3577:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3578:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3578:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3579:1: ')'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightParenthesisKeyword_2_3_4()); 
            match(input,16,FOLLOW_16_in_rule__BodyFunction__Group_2_3__4__Impl7198); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3592:1: rule__BodyFunction__Group_2_3__5 : rule__BodyFunction__Group_2_3__5__Impl ;
    public final void rule__BodyFunction__Group_2_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3596:1: ( rule__BodyFunction__Group_2_3__5__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3597:2: rule__BodyFunction__Group_2_3__5__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__5__Impl_in_rule__BodyFunction__Group_2_3__57229);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3603:1: rule__BodyFunction__Group_2_3__5__Impl : ( '}' ) ;
    public final void rule__BodyFunction__Group_2_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3607:1: ( ( '}' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3608:1: ( '}' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3608:1: ( '}' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3609:1: '}'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_3_5()); 
            match(input,21,FOLLOW_21_in_rule__BodyFunction__Group_2_3__5__Impl7257); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3634:1: rule__SimpleFunction__Group__0 : rule__SimpleFunction__Group__0__Impl rule__SimpleFunction__Group__1 ;
    public final void rule__SimpleFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3638:1: ( rule__SimpleFunction__Group__0__Impl rule__SimpleFunction__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3639:2: rule__SimpleFunction__Group__0__Impl rule__SimpleFunction__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__0__Impl_in_rule__SimpleFunction__Group__07300);
            rule__SimpleFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__1_in_rule__SimpleFunction__Group__07303);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3646:1: rule__SimpleFunction__Group__0__Impl : ( ( rule__SimpleFunction__IdAssignment_0 ) ) ;
    public final void rule__SimpleFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3650:1: ( ( ( rule__SimpleFunction__IdAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3651:1: ( ( rule__SimpleFunction__IdAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3651:1: ( ( rule__SimpleFunction__IdAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3652:1: ( rule__SimpleFunction__IdAssignment_0 )
            {
             before(grammarAccess.getSimpleFunctionAccess().getIdAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3653:1: ( rule__SimpleFunction__IdAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3653:2: rule__SimpleFunction__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleFunction__IdAssignment_0_in_rule__SimpleFunction__Group__0__Impl7330);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3663:1: rule__SimpleFunction__Group__1 : rule__SimpleFunction__Group__1__Impl rule__SimpleFunction__Group__2 ;
    public final void rule__SimpleFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3667:1: ( rule__SimpleFunction__Group__1__Impl rule__SimpleFunction__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3668:2: rule__SimpleFunction__Group__1__Impl rule__SimpleFunction__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__1__Impl_in_rule__SimpleFunction__Group__17360);
            rule__SimpleFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__2_in_rule__SimpleFunction__Group__17363);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3675:1: rule__SimpleFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__SimpleFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3679:1: ( ( '(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3680:1: ( '(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3680:1: ( '(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3681:1: '('
            {
             before(grammarAccess.getSimpleFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__SimpleFunction__Group__1__Impl7391); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3694:1: rule__SimpleFunction__Group__2 : rule__SimpleFunction__Group__2__Impl rule__SimpleFunction__Group__3 ;
    public final void rule__SimpleFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3698:1: ( rule__SimpleFunction__Group__2__Impl rule__SimpleFunction__Group__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3699:2: rule__SimpleFunction__Group__2__Impl rule__SimpleFunction__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__2__Impl_in_rule__SimpleFunction__Group__27422);
            rule__SimpleFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__3_in_rule__SimpleFunction__Group__27425);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3706:1: rule__SimpleFunction__Group__2__Impl : ( ( rule__SimpleFunction__ValuesAssignment_2 ) ) ;
    public final void rule__SimpleFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3710:1: ( ( ( rule__SimpleFunction__ValuesAssignment_2 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3711:1: ( ( rule__SimpleFunction__ValuesAssignment_2 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3711:1: ( ( rule__SimpleFunction__ValuesAssignment_2 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3712:1: ( rule__SimpleFunction__ValuesAssignment_2 )
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesAssignment_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3713:1: ( rule__SimpleFunction__ValuesAssignment_2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3713:2: rule__SimpleFunction__ValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleFunction__ValuesAssignment_2_in_rule__SimpleFunction__Group__2__Impl7452);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3723:1: rule__SimpleFunction__Group__3 : rule__SimpleFunction__Group__3__Impl rule__SimpleFunction__Group__4 ;
    public final void rule__SimpleFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3727:1: ( rule__SimpleFunction__Group__3__Impl rule__SimpleFunction__Group__4 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3728:2: rule__SimpleFunction__Group__3__Impl rule__SimpleFunction__Group__4
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__3__Impl_in_rule__SimpleFunction__Group__37482);
            rule__SimpleFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__4_in_rule__SimpleFunction__Group__37485);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3735:1: rule__SimpleFunction__Group__3__Impl : ( ( rule__SimpleFunction__Group_3__0 )* ) ;
    public final void rule__SimpleFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3739:1: ( ( ( rule__SimpleFunction__Group_3__0 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3740:1: ( ( rule__SimpleFunction__Group_3__0 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3740:1: ( ( rule__SimpleFunction__Group_3__0 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3741:1: ( rule__SimpleFunction__Group_3__0 )*
            {
             before(grammarAccess.getSimpleFunctionAccess().getGroup_3()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3742:1: ( rule__SimpleFunction__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==13) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3742:2: rule__SimpleFunction__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__SimpleFunction__Group_3__0_in_rule__SimpleFunction__Group__3__Impl7512);
            	    rule__SimpleFunction__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3752:1: rule__SimpleFunction__Group__4 : rule__SimpleFunction__Group__4__Impl ;
    public final void rule__SimpleFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3756:1: ( rule__SimpleFunction__Group__4__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3757:2: rule__SimpleFunction__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__4__Impl_in_rule__SimpleFunction__Group__47543);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3763:1: rule__SimpleFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__SimpleFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3767:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3768:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3768:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3769:1: ')'
            {
             before(grammarAccess.getSimpleFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__SimpleFunction__Group__4__Impl7571); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3792:1: rule__SimpleFunction__Group_3__0 : rule__SimpleFunction__Group_3__0__Impl rule__SimpleFunction__Group_3__1 ;
    public final void rule__SimpleFunction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3796:1: ( rule__SimpleFunction__Group_3__0__Impl rule__SimpleFunction__Group_3__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3797:2: rule__SimpleFunction__Group_3__0__Impl rule__SimpleFunction__Group_3__1
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group_3__0__Impl_in_rule__SimpleFunction__Group_3__07612);
            rule__SimpleFunction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group_3__1_in_rule__SimpleFunction__Group_3__07615);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3804:1: rule__SimpleFunction__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SimpleFunction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3808:1: ( ( ',' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3809:1: ( ',' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3809:1: ( ',' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3810:1: ','
            {
             before(grammarAccess.getSimpleFunctionAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__SimpleFunction__Group_3__0__Impl7643); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3823:1: rule__SimpleFunction__Group_3__1 : rule__SimpleFunction__Group_3__1__Impl ;
    public final void rule__SimpleFunction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3827:1: ( rule__SimpleFunction__Group_3__1__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3828:2: rule__SimpleFunction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group_3__1__Impl_in_rule__SimpleFunction__Group_3__17674);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3834:1: rule__SimpleFunction__Group_3__1__Impl : ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) ) ;
    public final void rule__SimpleFunction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3838:1: ( ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3839:1: ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3839:1: ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3840:1: ( rule__SimpleFunction__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesAssignment_3_1()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3841:1: ( rule__SimpleFunction__ValuesAssignment_3_1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3841:2: rule__SimpleFunction__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SimpleFunction__ValuesAssignment_3_1_in_rule__SimpleFunction__Group_3__1__Impl7701);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3855:1: rule__SpecialFunction__Group__0 : rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1 ;
    public final void rule__SpecialFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3859:1: ( rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3860:2: rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__0__Impl_in_rule__SpecialFunction__Group__07735);
            rule__SpecialFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__1_in_rule__SpecialFunction__Group__07738);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3867:1: rule__SpecialFunction__Group__0__Impl : ( ( rule__SpecialFunction__IdAssignment_0 ) ) ;
    public final void rule__SpecialFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3871:1: ( ( ( rule__SpecialFunction__IdAssignment_0 ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3872:1: ( ( rule__SpecialFunction__IdAssignment_0 ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3872:1: ( ( rule__SpecialFunction__IdAssignment_0 ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3873:1: ( rule__SpecialFunction__IdAssignment_0 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getIdAssignment_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3874:1: ( rule__SpecialFunction__IdAssignment_0 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3874:2: rule__SpecialFunction__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__SpecialFunction__IdAssignment_0_in_rule__SpecialFunction__Group__0__Impl7765);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3884:1: rule__SpecialFunction__Group__1 : rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2 ;
    public final void rule__SpecialFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3888:1: ( rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3889:2: rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__1__Impl_in_rule__SpecialFunction__Group__17795);
            rule__SpecialFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__2_in_rule__SpecialFunction__Group__17798);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3896:1: rule__SpecialFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__SpecialFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3900:1: ( ( '(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3901:1: ( '(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3901:1: ( '(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3902:1: '('
            {
             before(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__SpecialFunction__Group__1__Impl7826); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3915:1: rule__SpecialFunction__Group__2 : rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3 ;
    public final void rule__SpecialFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3919:1: ( rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3920:2: rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__2__Impl_in_rule__SpecialFunction__Group__27857);
            rule__SpecialFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__3_in_rule__SpecialFunction__Group__27860);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3927:1: rule__SpecialFunction__Group__2__Impl : ( ( rule__SpecialFunction__Alternatives_2 )* ) ;
    public final void rule__SpecialFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3931:1: ( ( ( rule__SpecialFunction__Alternatives_2 )* ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3932:1: ( ( rule__SpecialFunction__Alternatives_2 )* )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3932:1: ( ( rule__SpecialFunction__Alternatives_2 )* )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3933:1: ( rule__SpecialFunction__Alternatives_2 )*
            {
             before(grammarAccess.getSpecialFunctionAccess().getAlternatives_2()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3934:1: ( rule__SpecialFunction__Alternatives_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_ANY_OTHER && LA29_0<=RULE_STRING)||LA29_0==13||(LA29_0>=28 && LA29_0<=29)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3934:2: rule__SpecialFunction__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__SpecialFunction__Alternatives_2_in_rule__SpecialFunction__Group__2__Impl7887);
            	    rule__SpecialFunction__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3944:1: rule__SpecialFunction__Group__3 : rule__SpecialFunction__Group__3__Impl ;
    public final void rule__SpecialFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3948:1: ( rule__SpecialFunction__Group__3__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3949:2: rule__SpecialFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__3__Impl_in_rule__SpecialFunction__Group__37918);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3955:1: rule__SpecialFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__SpecialFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3959:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3960:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3960:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3961:1: ')'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__SpecialFunction__Group__3__Impl7946); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3982:1: rule__SpecialFunction__Group_2_4__0 : rule__SpecialFunction__Group_2_4__0__Impl rule__SpecialFunction__Group_2_4__1 ;
    public final void rule__SpecialFunction__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3986:1: ( rule__SpecialFunction__Group_2_4__0__Impl rule__SpecialFunction__Group_2_4__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3987:2: rule__SpecialFunction__Group_2_4__0__Impl rule__SpecialFunction__Group_2_4__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_4__0__Impl_in_rule__SpecialFunction__Group_2_4__07985);
            rule__SpecialFunction__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_4__1_in_rule__SpecialFunction__Group_2_4__07988);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3994:1: rule__SpecialFunction__Group_2_4__0__Impl : ( '$(' ) ;
    public final void rule__SpecialFunction__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3998:1: ( ( '$(' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3999:1: ( '$(' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:3999:1: ( '$(' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4000:1: '$('
            {
             before(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_2_4_0()); 
            match(input,28,FOLLOW_28_in_rule__SpecialFunction__Group_2_4__0__Impl8016); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4013:1: rule__SpecialFunction__Group_2_4__1 : rule__SpecialFunction__Group_2_4__1__Impl rule__SpecialFunction__Group_2_4__2 ;
    public final void rule__SpecialFunction__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4017:1: ( rule__SpecialFunction__Group_2_4__1__Impl rule__SpecialFunction__Group_2_4__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4018:2: rule__SpecialFunction__Group_2_4__1__Impl rule__SpecialFunction__Group_2_4__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_4__1__Impl_in_rule__SpecialFunction__Group_2_4__18047);
            rule__SpecialFunction__Group_2_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_4__2_in_rule__SpecialFunction__Group_2_4__18050);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4025:1: rule__SpecialFunction__Group_2_4__1__Impl : ( RULE_ID ) ;
    public final void rule__SpecialFunction__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4029:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4030:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4030:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4031:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_4_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_4__1__Impl8077); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4042:1: rule__SpecialFunction__Group_2_4__2 : rule__SpecialFunction__Group_2_4__2__Impl ;
    public final void rule__SpecialFunction__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4046:1: ( rule__SpecialFunction__Group_2_4__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4047:2: rule__SpecialFunction__Group_2_4__2__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_4__2__Impl_in_rule__SpecialFunction__Group_2_4__28106);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4053:1: rule__SpecialFunction__Group_2_4__2__Impl : ( ')' ) ;
    public final void rule__SpecialFunction__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4057:1: ( ( ')' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4058:1: ( ')' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4058:1: ( ')' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4059:1: ')'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_2_4_2()); 
            match(input,16,FOLLOW_16_in_rule__SpecialFunction__Group_2_4__2__Impl8134); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4078:1: rule__SpecialFunction__Group_2_5__0 : rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1 ;
    public final void rule__SpecialFunction__Group_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4082:1: ( rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4083:2: rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__0__Impl_in_rule__SpecialFunction__Group_2_5__08171);
            rule__SpecialFunction__Group_2_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__1_in_rule__SpecialFunction__Group_2_5__08174);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4090:1: rule__SpecialFunction__Group_2_5__0__Impl : ( '${' ) ;
    public final void rule__SpecialFunction__Group_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4094:1: ( ( '${' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4095:1: ( '${' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4095:1: ( '${' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4096:1: '${'
            {
             before(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_2_5_0()); 
            match(input,29,FOLLOW_29_in_rule__SpecialFunction__Group_2_5__0__Impl8202); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4109:1: rule__SpecialFunction__Group_2_5__1 : rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2 ;
    public final void rule__SpecialFunction__Group_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4113:1: ( rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2 )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4114:2: rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__1__Impl_in_rule__SpecialFunction__Group_2_5__18233);
            rule__SpecialFunction__Group_2_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__2_in_rule__SpecialFunction__Group_2_5__18236);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4121:1: rule__SpecialFunction__Group_2_5__1__Impl : ( RULE_ID ) ;
    public final void rule__SpecialFunction__Group_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4125:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4126:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4126:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4127:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_5_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_5__1__Impl8263); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4138:1: rule__SpecialFunction__Group_2_5__2 : rule__SpecialFunction__Group_2_5__2__Impl ;
    public final void rule__SpecialFunction__Group_2_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4142:1: ( rule__SpecialFunction__Group_2_5__2__Impl )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4143:2: rule__SpecialFunction__Group_2_5__2__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__2__Impl_in_rule__SpecialFunction__Group_2_5__28292);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4149:1: rule__SpecialFunction__Group_2_5__2__Impl : ( '}' ) ;
    public final void rule__SpecialFunction__Group_2_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4153:1: ( ( '}' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4154:1: ( '}' )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4154:1: ( '}' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4155:1: '}'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_2_5_2()); 
            match(input,21,FOLLOW_21_in_rule__SpecialFunction__Group_2_5__2__Impl8320); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4175:1: rule__CfModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__CfModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4179:1: ( ( ruleAbstractElement ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4180:1: ( ruleAbstractElement )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4180:1: ( ruleAbstractElement )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4181:1: ruleAbstractElement
            {
             before(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment8362);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4190:1: rule__Bundle__ComponentAssignment_1 : ( ruleBundleComponent ) ;
    public final void rule__Bundle__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4194:1: ( ( ruleBundleComponent ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4195:1: ( ruleBundleComponent )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4195:1: ( ruleBundleComponent )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4196:1: ruleBundleComponent
            {
             before(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBundleComponent_in_rule__Bundle__ComponentAssignment_18393);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4205:1: rule__Bundle__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Bundle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4209:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4210:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4210:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4211:1: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_28424); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4220:1: rule__Bundle__VariablesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Bundle__VariablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4224:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4225:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4225:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4226:1: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getVariablesIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bundle__VariablesAssignment_3_18455); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4235:1: rule__Bundle__VariablesAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__Bundle__VariablesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4239:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4240:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4240:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4241:1: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getVariablesIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bundle__VariablesAssignment_3_2_18486); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4250:1: rule__Bundle__PromiseTypeAssignment_5 : ( ruleBundlePromiseType ) ;
    public final void rule__Bundle__PromiseTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4254:1: ( ( ruleBundlePromiseType ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4255:1: ( ruleBundlePromiseType )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4255:1: ( ruleBundlePromiseType )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4256:1: ruleBundlePromiseType
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_rule__Bundle__PromiseTypeAssignment_58517);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4265:1: rule__BundlePromiseType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BundlePromiseType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4269:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4270:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4270:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4271:1: RULE_ID
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BundlePromiseType__NameAssignment_08548); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4280:1: rule__BundlePromiseType__PromisesAssignment_2 : ( ruleBundlePromise ) ;
    public final void rule__BundlePromiseType__PromisesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4284:1: ( ( ruleBundlePromise ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4285:1: ( ruleBundlePromise )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4285:1: ( ruleBundlePromise )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4286:1: ruleBundlePromise
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getPromisesBundlePromiseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBundlePromise_in_rule__BundlePromiseType__PromisesAssignment_28579);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4295:1: rule__BundlePromiseType__ClassesAssignment_3 : ( ruleBundleClass ) ;
    public final void rule__BundlePromiseType__ClassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4299:1: ( ( ruleBundleClass ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4300:1: ( ruleBundleClass )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4300:1: ( ruleBundleClass )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4301:1: ruleBundleClass
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getClassesBundleClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBundleClass_in_rule__BundlePromiseType__ClassesAssignment_38610);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4310:1: rule__BundleClass__NameAssignment_0 : ( ruleCLASS_ID ) ;
    public final void rule__BundleClass__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4314:1: ( ( ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4315:1: ( ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4315:1: ( ruleCLASS_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4316:1: ruleCLASS_ID
            {
             before(grammarAccess.getBundleClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__BundleClass__NameAssignment_08641);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4325:1: rule__BundleClass__PromisesAssignment_2 : ( ruleBundlePromise ) ;
    public final void rule__BundleClass__PromisesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4329:1: ( ( ruleBundlePromise ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4330:1: ( ruleBundlePromise )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4330:1: ( ruleBundlePromise )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4331:1: ruleBundlePromise
            {
             before(grammarAccess.getBundleClassAccess().getPromisesBundlePromiseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBundlePromise_in_rule__BundleClass__PromisesAssignment_28672);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4340:1: rule__BundlePromise__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BundlePromise__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4344:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4345:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4345:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4346:1: RULE_STRING
            {
             before(grammarAccess.getBundlePromiseAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BundlePromise__NameAssignment_08703); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4355:1: rule__BundlePromise__ValuesAssignment_1_0 : ( rulePromiseValue ) ;
    public final void rule__BundlePromise__ValuesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4359:1: ( ( rulePromiseValue ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4360:1: ( rulePromiseValue )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4360:1: ( rulePromiseValue )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4361:1: rulePromiseValue
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_08734);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4370:1: rule__BundlePromise__ValuesAssignment_1_1_1 : ( rulePromiseValue ) ;
    public final void rule__BundlePromise__ValuesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4374:1: ( ( rulePromiseValue ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4375:1: ( rulePromiseValue )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4375:1: ( rulePromiseValue )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4376:1: rulePromiseValue
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_1_18765);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4385:1: rule__PromiseValue__KeywordAssignment_0 : ( RULE_ID ) ;
    public final void rule__PromiseValue__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4389:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4390:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4390:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4391:1: RULE_ID
            {
             before(grammarAccess.getPromiseValueAccess().getKeywordIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PromiseValue__KeywordAssignment_08796); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4400:1: rule__PromiseValue__ValuesAssignment_2_0_0 : ( RULE_STRING ) ;
    public final void rule__PromiseValue__ValuesAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4404:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4405:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4405:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4406:1: RULE_STRING
            {
             before(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_0_08827); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4415:1: rule__PromiseValue__FunctionsAssignment_2_0_1 : ( ruleSimpleFunction ) ;
    public final void rule__PromiseValue__FunctionsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4419:1: ( ( ruleSimpleFunction ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4420:1: ( ruleSimpleFunction )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4420:1: ( ruleSimpleFunction )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4421:1: ruleSimpleFunction
            {
             before(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_0_18858);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4430:1: rule__PromiseValue__ValuesAssignment_2_0_2 : ( RULE_ID ) ;
    public final void rule__PromiseValue__ValuesAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4434:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4435:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4435:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4436:1: RULE_ID
            {
             before(grammarAccess.getPromiseValueAccess().getValuesIDTerminalRuleCall_2_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PromiseValue__ValuesAssignment_2_0_28889); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4445:1: rule__PromiseValue__ValuesAssignment_2_1_1_0 : ( RULE_STRING ) ;
    public final void rule__PromiseValue__ValuesAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4449:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4450:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4450:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4451:1: RULE_STRING
            {
             before(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_1_08920); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4460:1: rule__PromiseValue__FunctionsAssignment_2_1_1_1 : ( ruleSimpleFunction ) ;
    public final void rule__PromiseValue__FunctionsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4464:1: ( ( ruleSimpleFunction ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4465:1: ( ruleSimpleFunction )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4465:1: ( ruleSimpleFunction )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4466:1: ruleSimpleFunction
            {
             before(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_1_18951);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4475:1: rule__PromiseValue__ValuesAssignment_2_1_2_1_0 : ( RULE_STRING ) ;
    public final void rule__PromiseValue__ValuesAssignment_2_1_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4479:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4480:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4480:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4481:1: RULE_STRING
            {
             before(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_2_1_08982); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4490:1: rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 : ( ruleSimpleFunction ) ;
    public final void rule__PromiseValue__FunctionsAssignment_2_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4494:1: ( ( ruleSimpleFunction ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4495:1: ( ruleSimpleFunction )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4495:1: ( ruleSimpleFunction )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4496:1: ruleSimpleFunction
            {
             before(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_2_1_1_0()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_2_1_19013);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4505:1: rule__Body__ComponentAssignment_1 : ( ruleBodyComponent ) ;
    public final void rule__Body__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4509:1: ( ( ruleBodyComponent ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4510:1: ( ruleBodyComponent )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4510:1: ( ruleBodyComponent )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4511:1: ruleBodyComponent
            {
             before(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_rule__Body__ComponentAssignment_19044);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4520:1: rule__Body__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Body__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4524:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4525:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4525:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4526:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__NameAssignment_29075); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4535:1: rule__Body__VariablesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Body__VariablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4539:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4540:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4540:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4541:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_19106); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4550:1: rule__Body__VariablesAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__Body__VariablesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4554:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4555:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4555:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4556:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_2_19137); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4565:1: rule__Body__PromiseTypeAssignment_5 : ( ruleBodyFunction ) ;
    public final void rule__Body__PromiseTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4569:1: ( ( ruleBodyFunction ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4570:1: ( ruleBodyFunction )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4570:1: ( ruleBodyFunction )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4571:1: ruleBodyFunction
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_rule__Body__PromiseTypeAssignment_59168);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4580:1: rule__Body__ClassesAssignment_6 : ( ruleBodyClass ) ;
    public final void rule__Body__ClassesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4584:1: ( ( ruleBodyClass ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4585:1: ( ruleBodyClass )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4585:1: ( ruleBodyClass )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4586:1: ruleBodyClass
            {
             before(grammarAccess.getBodyAccess().getClassesBodyClassParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleBodyClass_in_rule__Body__ClassesAssignment_69199);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4595:1: rule__BodyClass__NameAssignment_0 : ( ruleCLASS_ID ) ;
    public final void rule__BodyClass__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4599:1: ( ( ruleCLASS_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4600:1: ( ruleCLASS_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4600:1: ( ruleCLASS_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4601:1: ruleCLASS_ID
            {
             before(grammarAccess.getBodyClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__BodyClass__NameAssignment_09230);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4610:1: rule__BodyClass__PromiseTypeAssignment_2 : ( ruleBodyFunction ) ;
    public final void rule__BodyClass__PromiseTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4614:1: ( ( ruleBodyFunction ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4615:1: ( ruleBodyFunction )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4615:1: ( ruleBodyFunction )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4616:1: ruleBodyFunction
            {
             before(grammarAccess.getBodyClassAccess().getPromiseTypeBodyFunctionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_rule__BodyClass__PromiseTypeAssignment_29261);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4625:1: rule__BodyFunction__NameAssignment_0 : ( ruleBodyPromiseType ) ;
    public final void rule__BodyFunction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4629:1: ( ( ruleBodyPromiseType ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4630:1: ( ruleBodyPromiseType )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4630:1: ( ruleBodyPromiseType )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4631:1: ruleBodyPromiseType
            {
             before(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_rule__BodyFunction__NameAssignment_09292);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4640:1: rule__BodyFunction__ValuesAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4644:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4645:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4645:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4646:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_09323); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4655:1: rule__BodyFunction__ListAssignment_2_1_0 : ( ( '{' ) ) ;
    public final void rule__BodyFunction__ListAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4659:1: ( ( ( '{' ) ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4660:1: ( ( '{' ) )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4660:1: ( ( '{' ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4661:1: ( '{' )
            {
             before(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); 
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4662:1: ( '{' )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4663:1: '{'
            {
             before(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); 
            match(input,20,FOLLOW_20_in_rule__BodyFunction__ListAssignment_2_1_09359); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4678:1: rule__BodyFunction__ValuesAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4682:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4683:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4683:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4684:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_19398); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4693:1: rule__BodyFunction__ValuesAssignment_2_1_2_1 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4697:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4698:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4698:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4699:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_2_19429); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4708:1: rule__BodyFunction__FunctionAssignment_2_2 : ( ruleSpecialFunction ) ;
    public final void rule__BodyFunction__FunctionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4712:1: ( ( ruleSpecialFunction ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4713:1: ( ruleSpecialFunction )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4713:1: ( ruleSpecialFunction )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4714:1: ruleSpecialFunction
            {
             before(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_rule__BodyFunction__FunctionAssignment_2_29460);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4723:1: rule__SimpleFunction__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleFunction__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4727:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4728:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4728:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4729:1: RULE_ID
            {
             before(grammarAccess.getSimpleFunctionAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleFunction__IdAssignment_09491); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4738:1: rule__SimpleFunction__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SimpleFunction__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4742:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4743:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4743:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4744:1: RULE_STRING
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_29522); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4753:1: rule__SimpleFunction__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SimpleFunction__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4757:1: ( ( RULE_STRING ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4758:1: ( RULE_STRING )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4758:1: ( RULE_STRING )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4759:1: RULE_STRING
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_3_19553); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4768:1: rule__SpecialFunction__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__SpecialFunction__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4772:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4773:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4773:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4774:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__IdAssignment_09584); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4783:1: rule__SpecialFunction__FuncAssignment_2_6 : ( ruleSpecialFunction ) ;
    public final void rule__SpecialFunction__FuncAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4787:1: ( ( ruleSpecialFunction ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4788:1: ( ruleSpecialFunction )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4788:1: ( ruleSpecialFunction )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4789:1: ruleSpecialFunction
            {
             before(grammarAccess.getSpecialFunctionAccess().getFuncSpecialFunctionParserRuleCall_2_6_0()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_rule__SpecialFunction__FuncAssignment_2_69615);
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4798:1: rule__BodyPromiseType__NameAssignment : ( RULE_ID ) ;
    public final void rule__BodyPromiseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4802:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4803:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4803:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4804:1: RULE_ID
            {
             before(grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyPromiseType__NameAssignment9646); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4813:1: rule__BundleComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__BundleComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4817:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4818:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4818:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4819:1: RULE_ID
            {
             before(grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BundleComponent__NameAssignment9677); 
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
    // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4828:1: rule__BodyComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__BodyComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4832:1: ( ( RULE_ID ) )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4833:1: ( RULE_ID )
            {
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4833:1: ( RULE_ID )
            // ../org.cfeditor.cfengine.ui/src-gen/org/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengine.g:4834:1: RULE_ID
            {
             before(grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyComponent__NameAssignment9708); 
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
    public static final BitSet FOLLOW_rule__CfModel__ElementsAssignment_in_ruleCfModel94 = new BitSet(new long[]{0x0000000008080002L});
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
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_3__0_in_rule__CLASS_ID__Alternatives1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_4__0_in_rule__CLASS_ID__Alternatives1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CLASS_ID__Alternatives_0_1_01137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CLASS_ID__Alternatives_0_1_01157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_rule__AbstractElement__Alternatives1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__AbstractElement__Alternatives1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_0_in_rule__PromiseValue__Alternatives_21240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__0_in_rule__PromiseValue__Alternatives_21258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__0_in_rule__PromiseValue__Alternatives_21276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__ValuesAssignment_2_0_0_in_rule__PromiseValue__Alternatives_2_01309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__FunctionsAssignment_2_0_1_in_rule__PromiseValue__Alternatives_2_01327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__ValuesAssignment_2_0_2_in_rule__PromiseValue__Alternatives_2_01345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_1_0_in_rule__PromiseValue__Alternatives_2_1_11378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_1_1_in_rule__PromiseValue__Alternatives_2_1_11396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_2_1_0_in_rule__PromiseValue__Alternatives_2_1_2_11429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_2_1_1_in_rule__PromiseValue__Alternatives_2_1_2_11447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_0_in_rule__BodyFunction__Alternatives_21480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__0_in_rule__BodyFunction__Alternatives_21498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__FunctionAssignment_2_2_in_rule__BodyFunction__Alternatives_21516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__0_in_rule__BodyFunction__Alternatives_21534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SpecialFunction__Alternatives_21567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Alternatives_21584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecialFunction__Alternatives_21601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SpecialFunction__Alternatives_21619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_4__0_in_rule__SpecialFunction__Alternatives_21638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__0_in_rule__SpecialFunction__Alternatives_21656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__FuncAssignment_2_6_in_rule__SpecialFunction__Alternatives_21674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0__0__Impl_in_rule__CLASS_ID__Group_0__01705 = new BitSet(new long[]{0x000000000006D820L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0__1_in_rule__CLASS_ID__Group_0__01708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CLASS_ID__Group_0__0__Impl1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0__1__Impl_in_rule__CLASS_ID__Group_0__11764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0_1__0_in_rule__CLASS_ID__Group_0__1__Impl1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0_1__0__Impl_in_rule__CLASS_ID__Group_0_1__01826 = new BitSet(new long[]{0x000000000006D820L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0_1__1_in_rule__CLASS_ID__Group_0_1__01829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Alternatives_0_1_0_in_rule__CLASS_ID__Group_0_1__0__Impl1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0_1__1__Impl_in_rule__CLASS_ID__Group_0_1__11887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_0_1__1__Impl1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__0__Impl_in_rule__CLASS_ID__Group_1__01947 = new BitSet(new long[]{0x000000000006D820L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__1_in_rule__CLASS_ID__Group_1__01950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CLASS_ID__Group_1__0__Impl1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__1__Impl_in_rule__CLASS_ID__Group_1__12009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_1__1__Impl2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__0__Impl_in_rule__CLASS_ID__Group_2__02069 = new BitSet(new long[]{0x000000000006D820L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__1_in_rule__CLASS_ID__Group_2__02072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CLASS_ID__Group_2__0__Impl2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__1__Impl_in_rule__CLASS_ID__Group_2__12131 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__2_in_rule__CLASS_ID__Group_2__12134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_2__1__Impl2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__2__Impl_in_rule__CLASS_ID__Group_2__22190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CLASS_ID__Group_2__2__Impl2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_3__0__Impl_in_rule__CLASS_ID__Group_3__02255 = new BitSet(new long[]{0x000000000006D820L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_3__1_in_rule__CLASS_ID__Group_3__02258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CLASS_ID__Group_3__0__Impl2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_3__1__Impl_in_rule__CLASS_ID__Group_3__12317 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_3__2_in_rule__CLASS_ID__Group_3__12320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_3__1__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_3__2__Impl_in_rule__CLASS_ID__Group_3__22376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CLASS_ID__Group_3__2__Impl2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_4__0__Impl_in_rule__CLASS_ID__Group_4__02441 = new BitSet(new long[]{0x000000000006D820L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_4__1_in_rule__CLASS_ID__Group_4__02444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CLASS_ID__Group_4__0__Impl2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_4__1__Impl_in_rule__CLASS_ID__Group_4__12503 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_4__2_in_rule__CLASS_ID__Group_4__12506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_4__1__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_4__2__Impl_in_rule__CLASS_ID__Group_4__22562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CLASS_ID__Group_4__2__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__0__Impl_in_rule__Bundle__Group__02627 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__1_in_rule__Bundle__Group__02630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Bundle__Group__0__Impl2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__1__Impl_in_rule__Bundle__Group__12689 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__2_in_rule__Bundle__Group__12692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__ComponentAssignment_1_in_rule__Bundle__Group__1__Impl2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__22749 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__22752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__32809 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__32812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__0_in_rule__Bundle__Group__3__Impl2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__42870 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__42873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Bundle__Group__4__Impl2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__52932 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__6_in_rule__Bundle__Group__52935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__PromiseTypeAssignment_5_in_rule__Bundle__Group__5__Impl2962 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Bundle__Group__6__Impl_in_rule__Bundle__Group__62993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Bundle__Group__6__Impl3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__0__Impl_in_rule__Bundle__Group_3__03066 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__1_in_rule__Bundle__Group_3__03069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Bundle__Group_3__0__Impl3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__1__Impl_in_rule__Bundle__Group_3__13128 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__2_in_rule__Bundle__Group_3__13131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__VariablesAssignment_3_1_in_rule__Bundle__Group_3__1__Impl3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__2__Impl_in_rule__Bundle__Group_3__23188 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__3_in_rule__Bundle__Group_3__23191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3_2__0_in_rule__Bundle__Group_3__2__Impl3218 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3__3__Impl_in_rule__Bundle__Group_3__33249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Bundle__Group_3__3__Impl3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3_2__0__Impl_in_rule__Bundle__Group_3_2__03316 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3_2__1_in_rule__Bundle__Group_3_2__03319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Bundle__Group_3_2__0__Impl3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_3_2__1__Impl_in_rule__Bundle__Group_3_2__13378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__VariablesAssignment_3_2_1_in_rule__Bundle__Group_3_2__1__Impl3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__0__Impl_in_rule__BundlePromiseType__Group__03439 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__1_in_rule__BundlePromiseType__Group__03442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__NameAssignment_0_in_rule__BundlePromiseType__Group__0__Impl3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__1__Impl_in_rule__BundlePromiseType__Group__13499 = new BitSet(new long[]{0x000000000006D860L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__2_in_rule__BundlePromiseType__Group__13502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BundlePromiseType__Group__1__Impl3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__2__Impl_in_rule__BundlePromiseType__Group__23561 = new BitSet(new long[]{0x000000000006D860L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__3_in_rule__BundlePromiseType__Group__23564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__PromisesAssignment_2_in_rule__BundlePromiseType__Group__2__Impl3591 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__3__Impl_in_rule__BundlePromiseType__Group__33622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__ClassesAssignment_3_in_rule__BundlePromiseType__Group__3__Impl3649 = new BitSet(new long[]{0x000000000006D822L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__0__Impl_in_rule__BundleClass__Group__03688 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__1_in_rule__BundleClass__Group__03691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__NameAssignment_0_in_rule__BundleClass__Group__0__Impl3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__1__Impl_in_rule__BundleClass__Group__13748 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__2_in_rule__BundleClass__Group__13751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BundleClass__Group__1__Impl3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__2__Impl_in_rule__BundleClass__Group__23810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__PromisesAssignment_2_in_rule__BundleClass__Group__2__Impl3837 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__0__Impl_in_rule__BundlePromise__Group__03874 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__1_in_rule__BundlePromise__Group__03877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__NameAssignment_0_in_rule__BundlePromise__Group__0__Impl3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__1__Impl_in_rule__BundlePromise__Group__13934 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__2_in_rule__BundlePromise__Group__13937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__0_in_rule__BundlePromise__Group__1__Impl3964 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__2__Impl_in_rule__BundlePromise__Group__23995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BundlePromise__Group__2__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__0__Impl_in_rule__BundlePromise__Group_1__04060 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__1_in_rule__BundlePromise__Group_1__04063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__ValuesAssignment_1_0_in_rule__BundlePromise__Group_1__0__Impl4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__1__Impl_in_rule__BundlePromise__Group_1__14120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__0_in_rule__BundlePromise__Group_1__1__Impl4147 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__0__Impl_in_rule__BundlePromise__Group_1_1__04182 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__1_in_rule__BundlePromise__Group_1_1__04185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BundlePromise__Group_1_1__0__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__1__Impl_in_rule__BundlePromise__Group_1_1__14244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__ValuesAssignment_1_1_1_in_rule__BundlePromise__Group_1_1__1__Impl4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__0__Impl_in_rule__PromiseValue__Group__04305 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__1_in_rule__PromiseValue__Group__04308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__KeywordAssignment_0_in_rule__PromiseValue__Group__0__Impl4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__1__Impl_in_rule__PromiseValue__Group__14365 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__2_in_rule__PromiseValue__Group__14368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PromiseValue__Group__1__Impl4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__2__Impl_in_rule__PromiseValue__Group__24427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_in_rule__PromiseValue__Group__2__Impl4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__0__Impl_in_rule__PromiseValue__Group_2_1__04490 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__1_in_rule__PromiseValue__Group_2_1__04493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PromiseValue__Group_2_1__0__Impl4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__1__Impl_in_rule__PromiseValue__Group_2_1__14552 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__2_in_rule__PromiseValue__Group_2_1__14555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_1_1_in_rule__PromiseValue__Group_2_1__1__Impl4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__2__Impl_in_rule__PromiseValue__Group_2_1__24612 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__3_in_rule__PromiseValue__Group_2_1__24615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__0_in_rule__PromiseValue__Group_2_1__2__Impl4642 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__3__Impl_in_rule__PromiseValue__Group_2_1__34673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PromiseValue__Group_2_1__3__Impl4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__0__Impl_in_rule__PromiseValue__Group_2_1_2__04740 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__1_in_rule__PromiseValue__Group_2_1_2__04743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PromiseValue__Group_2_1_2__0__Impl4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__1__Impl_in_rule__PromiseValue__Group_2_1_2__14802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_1_2_1_in_rule__PromiseValue__Group_2_1_2__1__Impl4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__0__Impl_in_rule__PromiseValue__Group_2_2__04863 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__1_in_rule__PromiseValue__Group_2_2__04866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PromiseValue__Group_2_2__0__Impl4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__1__Impl_in_rule__PromiseValue__Group_2_2__14925 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__2_in_rule__PromiseValue__Group_2_2__14928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PromiseValue__Group_2_2__1__Impl4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__2__Impl_in_rule__PromiseValue__Group_2_2__24987 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__3_in_rule__PromiseValue__Group_2_2__24990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PromiseValue__Group_2_2__2__Impl5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__3__Impl_in_rule__PromiseValue__Group_2_2__35049 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__4_in_rule__PromiseValue__Group_2_2__35052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PromiseValue__Group_2_2__3__Impl5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__4__Impl_in_rule__PromiseValue__Group_2_2__45108 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__5_in_rule__PromiseValue__Group_2_2__45111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PromiseValue__Group_2_2__4__Impl5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__5__Impl_in_rule__PromiseValue__Group_2_2__55170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PromiseValue__Group_2_2__5__Impl5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__05241 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__05244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Body__Group__0__Impl5272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__15303 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__15306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__25363 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_rule__Body__Group__3_in_rule__Body__Group__25366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__NameAssignment_2_in_rule__Body__Group__2__Impl5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__35423 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_rule__Body__Group__4_in_rule__Body__Group__35426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__0_in_rule__Body__Group__3__Impl5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__45484 = new BitSet(new long[]{0x000000000026D820L});
    public static final BitSet FOLLOW_rule__Body__Group__5_in_rule__Body__Group__45487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Body__Group__4__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__55546 = new BitSet(new long[]{0x000000000026D820L});
    public static final BitSet FOLLOW_rule__Body__Group__6_in_rule__Body__Group__55549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__PromiseTypeAssignment_5_in_rule__Body__Group__5__Impl5576 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Body__Group__6__Impl_in_rule__Body__Group__65607 = new BitSet(new long[]{0x000000000026D820L});
    public static final BitSet FOLLOW_rule__Body__Group__7_in_rule__Body__Group__65610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ClassesAssignment_6_in_rule__Body__Group__6__Impl5637 = new BitSet(new long[]{0x000000000006D822L});
    public static final BitSet FOLLOW_rule__Body__Group__7__Impl_in_rule__Body__Group__75668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Body__Group__7__Impl5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__0__Impl_in_rule__Body__Group_3__05743 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group_3__1_in_rule__Body__Group_3__05746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Body__Group_3__0__Impl5774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__1__Impl_in_rule__Body__Group_3__15805 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Body__Group_3__2_in_rule__Body__Group_3__15808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__VariablesAssignment_3_1_in_rule__Body__Group_3__1__Impl5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__2__Impl_in_rule__Body__Group_3__25865 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Body__Group_3__3_in_rule__Body__Group_3__25868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__0_in_rule__Body__Group_3__2__Impl5895 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__3__Impl_in_rule__Body__Group_3__35926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Body__Group_3__3__Impl5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__0__Impl_in_rule__Body__Group_3_2__05993 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__1_in_rule__Body__Group_3_2__05996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Body__Group_3_2__0__Impl6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__1__Impl_in_rule__Body__Group_3_2__16055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__VariablesAssignment_3_2_1_in_rule__Body__Group_3_2__1__Impl6082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__0__Impl_in_rule__BodyClass__Group__06116 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__1_in_rule__BodyClass__Group__06119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__NameAssignment_0_in_rule__BodyClass__Group__0__Impl6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__1__Impl_in_rule__BodyClass__Group__16176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__2_in_rule__BodyClass__Group__16179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BodyClass__Group__1__Impl6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__2__Impl_in_rule__BodyClass__Group__26238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__PromiseTypeAssignment_2_in_rule__BodyClass__Group__2__Impl6265 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__0__Impl_in_rule__BodyFunction__Group__06302 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__1_in_rule__BodyFunction__Group__06305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__NameAssignment_0_in_rule__BodyFunction__Group__0__Impl6332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__1__Impl_in_rule__BodyFunction__Group__16362 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__2_in_rule__BodyFunction__Group__16365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BodyFunction__Group__1__Impl6393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__2__Impl_in_rule__BodyFunction__Group__26424 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__3_in_rule__BodyFunction__Group__26427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Alternatives_2_in_rule__BodyFunction__Group__2__Impl6454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__3__Impl_in_rule__BodyFunction__Group__36484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BodyFunction__Group__3__Impl6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__0__Impl_in_rule__BodyFunction__Group_2_1__06551 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__1_in_rule__BodyFunction__Group_2_1__06554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ListAssignment_2_1_0_in_rule__BodyFunction__Group_2_1__0__Impl6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__1__Impl_in_rule__BodyFunction__Group_2_1__16611 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__2_in_rule__BodyFunction__Group_2_1__16614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_1_in_rule__BodyFunction__Group_2_1__1__Impl6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__2__Impl_in_rule__BodyFunction__Group_2_1__26671 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__3_in_rule__BodyFunction__Group_2_1__26674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__0_in_rule__BodyFunction__Group_2_1__2__Impl6701 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__3__Impl_in_rule__BodyFunction__Group_2_1__36732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BodyFunction__Group_2_1__3__Impl6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__0__Impl_in_rule__BodyFunction__Group_2_1_2__06799 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__1_in_rule__BodyFunction__Group_2_1_2__06802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BodyFunction__Group_2_1_2__0__Impl6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__1__Impl_in_rule__BodyFunction__Group_2_1_2__16861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_2_1_in_rule__BodyFunction__Group_2_1_2__1__Impl6888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__0__Impl_in_rule__BodyFunction__Group_2_3__06922 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__1_in_rule__BodyFunction__Group_2_3__06925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BodyFunction__Group_2_3__0__Impl6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__1__Impl_in_rule__BodyFunction__Group_2_3__16984 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__2_in_rule__BodyFunction__Group_2_3__16987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BodyFunction__Group_2_3__1__Impl7015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__2__Impl_in_rule__BodyFunction__Group_2_3__27046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__3_in_rule__BodyFunction__Group_2_3__27049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BodyFunction__Group_2_3__2__Impl7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__3__Impl_in_rule__BodyFunction__Group_2_3__37108 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__4_in_rule__BodyFunction__Group_2_3__37111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyFunction__Group_2_3__3__Impl7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__4__Impl_in_rule__BodyFunction__Group_2_3__47167 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__5_in_rule__BodyFunction__Group_2_3__47170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BodyFunction__Group_2_3__4__Impl7198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__5__Impl_in_rule__BodyFunction__Group_2_3__57229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BodyFunction__Group_2_3__5__Impl7257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__0__Impl_in_rule__SimpleFunction__Group__07300 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__1_in_rule__SimpleFunction__Group__07303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__IdAssignment_0_in_rule__SimpleFunction__Group__0__Impl7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__1__Impl_in_rule__SimpleFunction__Group__17360 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__2_in_rule__SimpleFunction__Group__17363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SimpleFunction__Group__1__Impl7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__2__Impl_in_rule__SimpleFunction__Group__27422 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__3_in_rule__SimpleFunction__Group__27425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__ValuesAssignment_2_in_rule__SimpleFunction__Group__2__Impl7452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__3__Impl_in_rule__SimpleFunction__Group__37482 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__4_in_rule__SimpleFunction__Group__37485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__0_in_rule__SimpleFunction__Group__3__Impl7512 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__4__Impl_in_rule__SimpleFunction__Group__47543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SimpleFunction__Group__4__Impl7571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__0__Impl_in_rule__SimpleFunction__Group_3__07612 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__1_in_rule__SimpleFunction__Group_3__07615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SimpleFunction__Group_3__0__Impl7643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__1__Impl_in_rule__SimpleFunction__Group_3__17674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__ValuesAssignment_3_1_in_rule__SimpleFunction__Group_3__1__Impl7701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__0__Impl_in_rule__SpecialFunction__Group__07735 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__1_in_rule__SpecialFunction__Group__07738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__IdAssignment_0_in_rule__SpecialFunction__Group__0__Impl7765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__1__Impl_in_rule__SpecialFunction__Group__17795 = new BitSet(new long[]{0x0000000030012070L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__2_in_rule__SpecialFunction__Group__17798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SpecialFunction__Group__1__Impl7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__2__Impl_in_rule__SpecialFunction__Group__27857 = new BitSet(new long[]{0x0000000030012070L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__3_in_rule__SpecialFunction__Group__27860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Alternatives_2_in_rule__SpecialFunction__Group__2__Impl7887 = new BitSet(new long[]{0x0000000030002072L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__3__Impl_in_rule__SpecialFunction__Group__37918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SpecialFunction__Group__3__Impl7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_4__0__Impl_in_rule__SpecialFunction__Group_2_4__07985 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_4__1_in_rule__SpecialFunction__Group_2_4__07988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SpecialFunction__Group_2_4__0__Impl8016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_4__1__Impl_in_rule__SpecialFunction__Group_2_4__18047 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_4__2_in_rule__SpecialFunction__Group_2_4__18050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_4__1__Impl8077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_4__2__Impl_in_rule__SpecialFunction__Group_2_4__28106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SpecialFunction__Group_2_4__2__Impl8134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__0__Impl_in_rule__SpecialFunction__Group_2_5__08171 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__1_in_rule__SpecialFunction__Group_2_5__08174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SpecialFunction__Group_2_5__0__Impl8202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__1__Impl_in_rule__SpecialFunction__Group_2_5__18233 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__2_in_rule__SpecialFunction__Group_2_5__18236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_5__1__Impl8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__2__Impl_in_rule__SpecialFunction__Group_2_5__28292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SpecialFunction__Group_2_5__2__Impl8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment8362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_rule__Bundle__ComponentAssignment_18393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_28424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bundle__VariablesAssignment_3_18455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bundle__VariablesAssignment_3_2_18486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_rule__Bundle__PromiseTypeAssignment_58517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BundlePromiseType__NameAssignment_08548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_rule__BundlePromiseType__PromisesAssignment_28579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleClass_in_rule__BundlePromiseType__ClassesAssignment_38610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__BundleClass__NameAssignment_08641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_rule__BundleClass__PromisesAssignment_28672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BundlePromise__NameAssignment_08703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_08734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_1_18765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PromiseValue__KeywordAssignment_08796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_0_08827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_0_18858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PromiseValue__ValuesAssignment_2_0_28889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_1_08920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_1_18951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_2_1_08982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_2_1_19013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_rule__Body__ComponentAssignment_19044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__NameAssignment_29075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_19106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_2_19137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_rule__Body__PromiseTypeAssignment_59168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_rule__Body__ClassesAssignment_69199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__BodyClass__NameAssignment_09230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_rule__BodyClass__PromiseTypeAssignment_29261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_rule__BodyFunction__NameAssignment_09292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_09323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BodyFunction__ListAssignment_2_1_09359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_19398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_2_19429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_rule__BodyFunction__FunctionAssignment_2_29460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleFunction__IdAssignment_09491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_29522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_3_19553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__IdAssignment_09584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_rule__SpecialFunction__FuncAssignment_2_69615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyPromiseType__NameAssignment9646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BundleComponent__NameAssignment9677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyComponent__NameAssignment9708 = new BitSet(new long[]{0x0000000000000002L});

}